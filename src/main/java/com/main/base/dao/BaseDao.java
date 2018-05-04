package com.main.base.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author liujinshan
 * @ClassName: BaseDao
 * @Description:
 * @date 2018/4/10 22:29
 */
public interface BaseDao<T> {

    /**
     * 保存实体
     * @param t
     */
    Serializable save(T t);

    /**
     * 更新实体
     * @param t
     */
    void update(T t);

    /**
     * 删除实体
     * @param t
     */
    void delete(T t);

    /**
     * 根据id 查找对应的实体
     * @param id
     * @return
     */
    T getbyId(Serializable id);

    /**
     *  查询实体的所以数据
     * @return
     */
    List<T> findAll(String hql);

    /**
     * 分页查询
     * @param hql
     * @param currentConut
     * @param currentPage
     * @return
     */
    List<T> findPage(String hql,int currentConut,int currentPage);
}
