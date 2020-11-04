package com.pupilary.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pupilary.provider.mapper.UserMapper;
import com.pupilary.provider.model.domain.User;
import com.pupilary.provider.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author takesi
 * @date 2020-10-20
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService{

}
