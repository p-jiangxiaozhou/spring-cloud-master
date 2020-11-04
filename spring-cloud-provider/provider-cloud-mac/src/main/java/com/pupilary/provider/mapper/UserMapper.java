package com.pupilary.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pupilary.provider.model.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author takesi
 * @date 2020-10-20
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
