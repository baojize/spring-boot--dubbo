package com.kuiniu.springbootdubboapi.model;

import java.util.Date;

/**
 * @className: User
 * @date：2019/3/14 0014 16:33
 * @author: baojize
 * @accountfor：
 */
public class User extends BaseEntity {
    /** 主键ID，自增  */
    private Integer id;

    /** 登录名 */
    private String userName;

    /** 真实姓名 */
    private String realName;

    /** 园区编号 */
    private String parkCode;

    /** 园区 */
    private String parkName;

    /** 密码 */
    private String pwd;

    /** 状态，0-无效，1-有效 */
    private Byte state;

    /** 角色，0-园区管理员，1-系统管理员 */
    private Byte role;

    /** 最近一次访问时间 */
    private Date lastDate;

    /** 最后一次登录的IP */
    private String lastIp;

    /** 登录次数 */
    private Integer loginCount;

    public User() {
        super();

    }
    public User(Date dateAdd, Date dateUpd, Integer id, String userName, String realName, String parkCode, String parkName, String pwd, Byte state, Byte role, Date lastDate, String lastIp, Integer loginCount) {
        super(dateAdd, dateUpd);
        this.id = id;
        this.userName = userName;
        this.realName = realName;
        this.parkCode = parkCode;
        this.parkName = parkName;
        this.pwd = pwd;
        this.state = state;
        this.role = role;
        this.lastDate = lastDate;
        this.lastIp = lastIp;
        this.loginCount = loginCount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getParkCode() {
        return parkCode;
    }

    public void setParkCode(String parkCode) {
        this.parkCode = parkCode;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Byte getRole() {
        return role;
    }

    public void setRole(Byte role) {
        this.role = role;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }
}
