package com.how2java.springboot.service;

import java.util.List;

import com.how2java.springboot.pojo.storebill;

public interface StoreBillService {
	public List<storebill> selectAll( Integer page,Integer limit);
	public long selectCount();
	public int insertstore(storebill storebill);
	public storebill selectByPrimaryKey(String id);
	public int deleteByPrimaryKey(String id);
	public int updateByPrimaryKeySelective(storebill storebill);
}
