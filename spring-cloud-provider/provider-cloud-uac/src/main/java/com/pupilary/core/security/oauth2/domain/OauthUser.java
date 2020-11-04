package com.pupilary.core.security.oauth2.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pupilary.provider.model.domain.Role;
import com.pupilary.provider.model.domain.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author takesi
 * @date 2020-10-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OauthUser extends User implements SocialUserDetails {

    private static final long serialVersionUID = 3389766953989576961L;

    private Set<String> permissions;

    private List<Role> roles;

    @Override
    public String getUserId() {
        return String.valueOf(getId());
    }

    @Override
    @JsonIgnore
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> collection = new HashSet<>();
        if (!CollectionUtils.isEmpty(this.roles)) {
            this.roles.parallelStream().forEach(role -> collection.add(new SimpleGrantedAuthority(role.getCode())));
        }
        return collection;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return getEnabled();
    }
}
