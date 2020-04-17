package com.how2java.springboot.service;

import java.util.List;

import com.how2java.springboot.pojo.profferbill;

public interface ProfferBillService {
	public List<profferbill> selectAll( Integer page,Integer limit);
	public long selectCount();
	public int insertProff(profferbill profferbill);
	public profferbill selectByPrimaryKey(String id);
	public int deleteByPrimaryKey(String id);
	public int updateByPrimaryKeySelective(profferbill profferbill);
	public List<profferbill> selectCondition(profferbill profferbill);
}
