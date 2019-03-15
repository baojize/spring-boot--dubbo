package com.kuiniu.springbootdubboapi.vo.queryVo;

import com.kuiniu.springbootdubboapi.vo.queryVo.Pagination;

import java.io.Serializable;

/**
 * @className: UserQuery
 * @date：2019/3/14 0014 16:38
 * @author: baojize
 * @accountfor：
 */
public class UserQuery extends Pagination implements Serializable {
    private static final long serialVersionUID = 1609252883937908952L;

    //查询条件
    private int notId = -1;

    /** 园区编号 */
    private String parkCode;

    /** 登录名 or 真实姓名 */
    private String name;

    /** 登录名 or 真实姓名 模糊查询 */
    private String nameLike;

    //查询条件
    public int groupId = -1; //组ID

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getNotId() {
        return notId;
    }

    public void setNotId(int notId) {
        this.notId = notId;
    }

    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode = parkCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
