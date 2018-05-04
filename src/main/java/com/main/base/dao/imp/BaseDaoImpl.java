package com.main.base.dao.imp;

import com.main.base.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * @author liujinshan
 * @ClassName: BaseDaoImpl
 * @Description: 持久层封装类
 * @date 2018/4/10 22:36
 */
@Transactional(rollbackFor = Exception.class)
public  class BaseDaoImpl<T> implements BaseDao<T> {


    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;

    protected  Class<T> clazz;

    /**
     * 获取实体名称
     * getClass().getGenericSuperclass()返回表示此 Class 所表示的实体（类、接口、基本类型或 void）的直接超类的 Type
     * 然后将其转换ParameterizedType。。
     * getActualTypeArguments()返回表示此类型实际类型参数的 Type 对象的数组。
     * [0]就是这个数组中第一个了。
     * 简而言之就是获得超类的泛型参数的实际类型。
     */
    public BaseDaoImpl() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        clazz = (Class<T>) pt.getActualTypeArguments()[0];
        System.out.println(clazz.getName());
    }
    /**
     * 获取当前可用的Session
     * @return
     */
    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    /**
     * 保存实体
     * @param t
     */
    public Serializable save(T t) {
      return   getSession().save(t);
    }

    /**
     * 更新实体
     * @param t
     */
    public void update(T t) {
        getSession().update(t);
    }

    /**
     * 删除实体
     * @param t
     */
    public void delete(T t) {
        getSession().delete(t);
    }

    /**
     * 根据id 查找对应的实体
     * @param id
     * @return
     */
    public T getbyId(Serializable id) {
        return  getSession().get(clazz,id);
    }

    /**
     *  查询实体的所以数据
     * @return
     */
    public List<T> findAll(String hql) {
        Query query =  getSession().createQuery(hql);
        List<T> list = query.list();
        return list;
    }

    /**
     *
     * @param hql hql语句
     * @param currentConut 一页显示的条数
     * @param currentPage 当前页
     * @return
     */
    public List<T> findPage(String hql, int currentConut,int currentPage) {
        Query query =  getSession().createQuery(hql);
        query.setMaxResults(currentConut);
        query.setFirstResult(currentPage);
        List<T> list = query.list();
        return list;
    }

}
