package com.main.common.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujinshan
 * @ClassName: Page
 * @Description:
 * @date 2018/4/12 15:49
 */
public class Page<T> {

    /**
     * 总记录数
     */
    private int totalCount;

    /**
     * 一页显示多少记录数
     */
    private int currentCount;

    /**
     * 总页数
     */
    private int totalPage;

    /**
     * 当前页
     */
    private int currentPage;

    /**
     * 每页显示的数据
     */
    private List<T> list = new ArrayList<T>();

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
