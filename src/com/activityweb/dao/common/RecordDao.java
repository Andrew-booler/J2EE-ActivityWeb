package com.activityweb.dao.common;

import java.sql.Connection;
import java.util.List;
import com.activityweb.entity.Record;



public interface RecordDao {
		

		/**
		 * ��ȡ���ݿ�����
		 * 
		 * @return ����
		 */
		public abstract Connection getConnection();
	
	
	    /**
	     * ��������ȡʵ��
	     * 
	     * @param ����
	     * @return 
	     * @return ʵ��
	     */
		
	    public abstract  Record getRecordById(String id);

	    /**
	     * ����PK�б���ʵ�����б�
	     * 
	     * @param List
	     *        <����>
	     * @return List<ʵ��>
	     */
/*	    public abstract List<Record> getList(List<String> ids);

	    *//**
	     * ������е�ʵ����
	     * 
	     * @return List<ʵ��>
	     *//*
	    public abstract List<Record> getAll();

	    *//**
	     * ���������ֶλ�����е�ʵ��
	     * @param desc
	     *        �����ǽ���true-����false-����
	     * @param orderProRecorderName
	     *        �����ֶ���
	     * @return
	     *//*
	    public abstract List<Record> getAll(Boolean desc, String orderProperName);

	    *//**
	     * ��ҳȡʵ��
	     * 
	     * @param pageIndex
	     *        ҳ��ţ���1��ʼ
	     * @param pageSize
	     *        ҳ��С
	     * @return List<ʵ��>
	     *//*
	    public abstract List<Record> page(int pageIndex, int pageSize);

	    *//**
	     * ��ҳȡʵ�壨���������ֶη�ҳ��
	     * 
	     * @param pageIndex
	     *        ҳ��ţ���1��ʼ
	     * @param pageSize
	     *        Ҳ��С
	     * @param desc
	     *        �������ͣ�true����,false����
	     * @param orderProperName
	     *        �����ֶ�����ʵ�������������
	     * @return
	     *//*
	    public abstract String save(Record entity);

	    *//**
	     * �־û������ʵ��
	     * 
	     * @param ʵ��
	     *//*
	    public abstract void saveOrUpdate(Record entity, Boolean...cache);

	    public abstract void merge(Record entity);

	    *//**
	     * ȡ�ø�ʵ�������
	     * 
	     * @return
	     *//*
	    public abstract int Count();

	    *//**
	     * ɾ��ʵ��
	     * 
	     * @param ʵ��
	     *//*
	    public abstract void delete(Record entity);

	    *//**
	     * ɾ��ʵ����
	     * 
	     * @param List
	     *        <ʵ��>
	     *//*

	    public abstract void deleteByKey(String id);

	    *//**
	     * ǿ��SessionFlush����
	     * 
	     *//*
*/

}
