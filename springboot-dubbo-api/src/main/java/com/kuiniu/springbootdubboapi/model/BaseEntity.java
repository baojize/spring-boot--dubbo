package com.kuiniu.springbootdubboapi.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @className: BaseEntity
 * @date：2019/3/14 0014 16:31
 * @author: baojize
 * @accountfor：
 */
public class BaseEntity implements Serializable {
    /** 添加时间 */
    private Date dateAdd;

    /** 修改时间 */
    private Date dateUpd;

    public BaseEntity() {
    }

    public BaseEntity(Date dateAdd, Date dateUpd) {
        this.dateAdd = dateAdd;
        this.dateUpd = dateUpd;
    }

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public Date getDateUpd() {
        return dateUpd;
    }

    public void setDateUpd(Date dateUpd) {
        this.dateUpd = dateUpd;
    }
}
