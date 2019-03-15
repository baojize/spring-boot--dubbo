package com.kuiniu.springbootdubboserver.dao;

import com.alibaba.dubbo.config.annotation.Service;
import com.kuiniu.springbootdubboapi.model.User;
import com.kuiniu.springbootdubboapi.vo.queryVo.UserQuery;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @className: UserMapper
 * @date：2019/3/14 0014 16:51
 * @author: baojize
 * @accountfor：
 */
@Service
public interface UserMapper {
    /**
     * 根据条件分页查询
     * @param query 查询条件
     * @return 分页数据
     */
    List<User> selectListByQuery(UserQuery query);

    /**
     * 根据条件查询记录总条数
     * @param query 查询条件
     * @return 符合条件的记录数
     */
    int selectCountByQuery(UserQuery query);

    @Delete({
            "delete from user",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
            "insert into user (user_name, real_name, ",
            "park_code, park_name, ",
            "pwd, state, role, ",
            "last_date, last_ip, ",
            "login_count, date_add, ",
            "date_upd)",
            "values (#{userName,jdbcType=VARCHAR}, #{realName,jdbcType=VARCHAR}, ",
            "#{parkCode,jdbcType=CHAR}, #{parkName,jdbcType=VARCHAR}, ",
            "#{pwd,jdbcType=VARCHAR}, #{state,jdbcType=TINYINT}, #{role,jdbcType=TINYINT}, ",
            "#{lastDate,jdbcType=TIMESTAMP}, INET_ATON(#{lastIp,jdbcType=INTEGER}), ",
            "#{loginCount,jdbcType=INTEGER}, #{dateAdd,jdbcType=TIMESTAMP}, ",
            "#{dateUpd,jdbcType=TIMESTAMP})"
    })
//    @SelectKey(statement="VALUES IDENTITY_VAL_LOCAL()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(User record);

    int insertSelective(User record);

    @Select({
            "select",
            "id, user_name, real_name, park_code, park_name, pwd, state, role, last_date, ",
            "INET_NTOA(last_ip) last_ip, login_count, date_add, date_upd",
            "from user",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    User selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, user_name, real_name, park_code, park_name, pwd, state, role, last_date, ",
            "INET_NTOA(last_ip) last_ip, login_count, date_add, date_upd",
            "from user",
            "where user_name = #{userName,jdbcType=VARCHAR} and pwd = #{pwd,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    User selectOneByNameAndPwd(String userName, String pwd);

    @Select({
            "select",
            "id, user_name, real_name, park_code, park_name, pwd, state, role, last_date, ",
            "INET_NTOA(last_ip) last_ip, login_count, date_add, date_upd",
            "from user",
            "where user_name = #{userName,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    User selectOneByUserName(String userName);

    /**
     * 查询账号是否存在
     * @param userName 账号
     * @param notId  ！= ID
     * @return 0：不存在，其他：存在。
     */
    @Select({
            "select count(*) from `user` ",
            "where user_name = #{userName,jdbcType=VARCHAR} and id != #{notId,jdbcType=INTEGER}"
    })
//    @ResultType("java.lang.Integer")
    int selectCountByUserName(@Param("userName") String userName, @Param("notId") Integer notId);

    int updateByPrimaryKeySelective(User record);

    @Update({
            "update user",
            "set user_name = #{userName,jdbcType=VARCHAR},",
            "real_name = #{realName,jdbcType=VARCHAR},",
            "park_code = #{parkCode,jdbcType=CHAR},",
            "park_name = #{parkName,jdbcType=VARCHAR},",
            "pwd = #{pwd,jdbcType=VARCHAR},",
            "state = #{state,jdbcType=TINYINT},",
            "role = #{role,jdbcType=TINYINT},",
            "last_date = #{lastDate,jdbcType=TIMESTAMP},",
            "last_ip = INET_ATON(#{lastIp,jdbcType=INTEGER}),",
            "login_count = #{loginCount,jdbcType=INTEGER},",
            "date_add = #{dateAdd,jdbcType=TIMESTAMP},",
            "date_upd = #{dateUpd,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}
