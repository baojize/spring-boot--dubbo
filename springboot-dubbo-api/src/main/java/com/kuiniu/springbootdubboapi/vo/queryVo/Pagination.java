package com.kuiniu.springbootdubboapi.vo.queryVo;

/**
 * @className: Pagination
 * @date：2019/3/14 0014 16:37
 * @author: baojize
 * @accountfor：分页实体类
 */
public class Pagination {
    //第几页 从0开始
    private int pageNo = 0;
    //每页多少条数据
    private int pageSize = 10;
    private int totalCount = 0;
    private int skip = 0;

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }
}
