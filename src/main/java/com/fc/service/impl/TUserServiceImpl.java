package com.fc.service.impl;

import com.fc.dao.UserDao;
import com.fc.entity.TUser;
import com.fc.service.TUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TUserServiceImpl implements TUserService {

    //注入数据层接口
    @Autowired
    private UserDao userDao;
    @Override
    public List<TUser> getUser(TUser user) {
        return userDao.getUser(user);
    }

    /**
     * 分页查询用户
     * @param page 页码
     * @param size 数量
     * @return
     */
    public PageInfo<TUser> getUsersLimit(int page, int size){
        //首先开启PageHelper的分页
        PageHelper.startPage(page, size);
        //查询分页信息 调用方式与普通方式一致
        List<TUser> list=userDao.getUser(new TUser());
        //生成PageInfo对象
        PageInfo<TUser> pageInfo=new PageInfo<TUser>(list);
        return pageInfo;
    }
}
