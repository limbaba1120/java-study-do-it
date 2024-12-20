package org.java.basicjava.chapter5.ch13.domain.userinfo.dao.mysql;

import org.java.basicjava.chapter5.ch13.domain.userinfo.UserInfo;
import org.java.basicjava.chapter5.ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("uinsert into MYSQL DB userId  = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into MYSQL DB userId  = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from MYSQL DB userId  = " + userInfo.getUserId());
	}
}
