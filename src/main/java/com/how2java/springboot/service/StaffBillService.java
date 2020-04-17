package com.how2java.springboot.service;

import java.util.List;


import com.how2java.springboot.pojo.staffbill;

public interface StaffBillService {
	public List<staffbill> selectAll( Integer page,Integer limit);
	public long selectCount();
	public int insertStaff(staffbill staffbill);
	public staffbill selectByPrimaryKey(String id);
	public int deleteByPrimaryKey(String id);
	public int updateByPrimaryKeySelective(staffbill staffbill);
}
