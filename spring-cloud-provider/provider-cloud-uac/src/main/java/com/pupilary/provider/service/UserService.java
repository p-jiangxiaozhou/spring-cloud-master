package com.pupilary.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pupilary.core.security.oauth2.domain.OauthUser;
import com.pupilary.provider.model.domain.User;

/**
 * @author takesi
 * @date 2020-10-14
 */
public interface UserService extends IService<User> {

    /**
     * getByUsername
     *
     * @param username username
     * @return OauthUser
     */
    OauthUser getByUsername(String username);

    /**
     * getOauthUser
     *
     * @param user user
     * @return OauthUser
     */
    OauthUser getOauthUser(User user);

}
