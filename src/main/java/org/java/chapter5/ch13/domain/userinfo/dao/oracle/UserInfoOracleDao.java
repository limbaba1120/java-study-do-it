package org.java.chapter5.ch13.domain.userinfo.dao.oracle;

import org.java.chapter5.ch13.domain.userinfo.UserInfo;
import org.java.chapter5.ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("uinsert into ORACLE DB userId  = " + userInfo.getUserId());
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("update into ORACLE DB userId  = " + userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("delete from ORACLE DB userId  = " + userInfo.getUserId());
	}
}
