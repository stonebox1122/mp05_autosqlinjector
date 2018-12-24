package com.stone.mp.service.impl;

import com.stone.mp.beans.User;
import com.stone.mp.mapper.UserMapper;
import com.stone.mp.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author stone
 * @since 2018-12-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
