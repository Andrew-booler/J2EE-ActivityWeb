package com.activityweb.dao.common;

import com.activityweb.entity.Record;



public interface RecordDao {
		
	
	    /**
	     * 按照主键取实体
	     * 
	     * @param 主键
	     * @return 
	     * @return 实体
	     */
		
	    public abstract  Record getRecordById(String id);
		
	    /**
	     * 返回主键的最大值
	     * 
	     * 
	     * @return -1时表示异常，
	     * @return int
	     */
	    public int getLargestId();

	    /**
	     * 根据PK列表返回实体类列表
	     * 
	     * @param List
	     *        <主键>
	     * @return List<实体>
	     */
/*	    public abstract List<Record> getList(List<String> ids);

	    *//**
	     * 获得所有的实体类
	     * 
	     * @return List<实体>
	     *//*
	    public abstract List<Record> getAll();

	    *//**
	     * 按照排序字段获得所有的实体
	     * @param desc
	     *        升序还是降序true-降序，false-升序
	     * @param orderProRecorderName
	     *        属性字段名
	     * @return
	     *//*
	    public abstract List<Record> getAll(Boolean desc, String orderProperName);

	    *//**
	     * 分页取实体
	     * 
	     * @param pageIndex
	     *        页序号，从1开始
	     * @param pageSize
	     *        页大小
	     * @return List<实体>
	     *//*
	    public abstract List<Record> page(int pageIndex, int pageSize);

	    *//**
	     * 分页取实体（按照排序字段分页）
	     * 
	     * @param pageIndex
	     *        页序号，从1开始
	     * @param pageSize
	     *        也大小
	     * @param desc
	     *        排序类型，true降序,false升序
	     * @param orderProperName
	     *        排序字段名（实体类的属性名）
	     * @return
	     *//*
	    public abstract String save(Record entity);

	    *//**
	     * 持久化或更新实体
	     * 
	     * @param 实体
	     *//*
	    public abstract void saveOrUpdate(Record entity, Boolean...cache);

	    public abstract void merge(Record entity);

	    *//**
	     * 取得该实体的数量
	     * 
	     * @return
	     *//*
	    public abstract int Count();

	    *//**
	     * 删除实体
	     * 
	     * @param 实体
	     *//*
	    public abstract void delete(Record entity);

	    *//**
	     * 删除实体们
	     * 
	     * @param List
	     *        <实体>
	     *//*

	    public abstract void deleteByKey(String id);

	    *//**
	     * 强制SessionFlush（）
	     * 
	     *//*
*/

}
