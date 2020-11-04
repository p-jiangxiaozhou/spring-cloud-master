package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pupilary.provider.model.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author takesi
 * @date 2020-10-14
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /**
     * selectByUsername
     *
     * @param username username
     * @return User
     */
    User selectByUsername(@Param("username") String username);
}
