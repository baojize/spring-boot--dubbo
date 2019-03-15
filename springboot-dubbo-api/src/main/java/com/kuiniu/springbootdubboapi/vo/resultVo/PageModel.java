package com.kuiniu.springbootdubboapi.vo.resultVo;

import java.io.Serializable;
import java.util.List;

/**
 * @className: PageModel
 * @date：2019/3/14 0014 16:42
 * @author: baojize
 * @accountfor：分页，返回数据
 */
public class PageModel<T> implements Serializable {
    //结果集
    private List<T> datas;
    //每页多少条数据
    private int pageSize = 10;
    //第几页 从0开始
    private int pageNo = 0;
    //总条数
    private long totalCount = 0;
    //总页数
    private int totalPages = 0;

    private int last_index = 0;

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getLast_index() {
        return last_index;
    }

    public void setLast_index(int last_index) {
        this.last_index = last_index;
    }
}
