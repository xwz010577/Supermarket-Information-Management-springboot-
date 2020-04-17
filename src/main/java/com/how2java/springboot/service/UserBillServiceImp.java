package com.how2java.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.springboot.dao.userbillMapper;
import com.how2java.springboot.pojo.userbill;
import com.how2java.springboot.service.UserBillService;

@Service("userBillService")
public class UserBillServiceImp implements UserBillService{

	@Autowired
	private userbillMapper userbillMapper;
	public userbill login(userbill userbill) {
		// TODO Auto-generated method stub
		userbill user=this.userbillMapper.login(userbill);
		return user;
	}
	@Override
	public int updatePassword(userbill userbill) {
		// TODO Auto-generated method stub
		return this.userbillMapper.updateByPrimaryKey(userbill);
	}
	@Override
	public int updatetx(userbill userbill) {
		// TODO Auto-generated method stub
		return this.userbillMapper.updatetx(userbill);
	}

}
