package com.how2java.springboot.service;

import com.how2java.springboot.pojo.userbill;

public interface UserBillService {
	public userbill login(userbill userbill);
	public int updatePassword(userbill userbill);
	public int updatetx(userbill userbill);
}
