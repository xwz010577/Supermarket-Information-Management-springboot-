package com.how2java.springboot.service;

import java.util.List;

import com.how2java.springboot.pojo.salebill;

public interface SaleBillService {
	public List<salebill> selectAll( Integer page,Integer limit);
	public long selectCount();
	public int insertSale(salebill salebill);
	public salebill selectByPrimaryKey(String id);
	public int deleteByPrimaryKey(String id);
	public int updateByPrimaryKeySelective(salebill salebill);
}
