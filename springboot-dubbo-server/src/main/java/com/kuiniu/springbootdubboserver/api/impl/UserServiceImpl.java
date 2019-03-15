package com.kuiniu.springbootdubboserver.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kuiniu.springbootdubboapi.api.UserService;
import com.kuiniu.springbootdubboapi.model.User;
import com.kuiniu.springbootdubboapi.vo.queryVo.UserQuery;
import com.kuiniu.springbootdubboapi.vo.resultVo.PageModel;
import com.kuiniu.springbootdubboserver.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @className: UserServiceImpl
 * @date：2019/3/14 0014 17:14
 * @author: baojize
 * @accountfor：
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findOneById(Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }

    @Override
    public User findOneByNameAndPwd(String userName, String pwd) {
        User user = userMapper.selectOneByNameAndPwd(userName, pwd);
        return user;
    }

    @Override
    public User findOneByUserName(String userName) {
        User user = userMapper.selectOneByUserName(userName);
        return user;
    }

    @Override
    public List<User> findListByGroupId(int groupId) {
        return null;
    }

    @Override
    public List<User> findListByRoles(String roleTypes) {
        return null;
    }

    @Override
    public PageModel<User> findPageByQuery(UserQuery query) {
        PageModel<User> pageModel = new PageModel<User>();
        pageModel.setDatas(this.userMapper.selectListByQuery(query));//列表数据
        pageModel.setTotalCount(this.userMapper.selectCountByQuery(query));//总条数
        return pageModel;
    }

    @Override
    public int findCountByQuery(UserQuery query) {
        return this.userMapper.selectCountByQuery(query);
    }

    @Override
    public int findCountByUserName(String userName, Integer notId) {
        if(notId == null){
            notId = 0;
        }
        return this.userMapper.selectCountByUserName(userName, notId);
    }

    @Override
    public int insertOne(User user) {
        return this.userMapper.insert(user);
    }

    @Override
    public int insertSelective(User user) {
        return this.userMapper.insertSelective(user);
    }

    @Override
    public int updateById(User user) {
        return this.userMapper.updateByPrimaryKey(user);
    }

    @Override
    public int updateByIdSelective(User user) {
        return this.userMapper.updateByPrimaryKeySelective(user);
    }
}
