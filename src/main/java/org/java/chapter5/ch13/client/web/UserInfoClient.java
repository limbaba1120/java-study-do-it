package org.java.chapter5.ch13.client.web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.java.chapter5.ch13.domain.userinfo.UserInfo;
import org.java.chapter5.ch13.domain.userinfo.dao.UserInfoDao;
import org.java.chapter5.ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import org.java.chapter5.ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {
	public static void main(String[] args) throws IOException {
		FileInputStream st = new FileInputStream("src/main/resources/dp.properties");

		Properties prop = new Properties();
		prop.load(st);

		String dbtype = prop.getProperty("DBTYPE");
		System.out.println(dbtype);

		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("user01");
		userInfo.setPasswd("password");
		userInfo.setUserName("limbaba");
		UserInfoDao userInfoDao = null;


		if (dbtype.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		} else if (dbtype.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		} else {
			System.out.println("not support");
		}

		if (userInfoDao != null) {
			userInfoDao.insertUserInfo(userInfo);
			userInfoDao.updateUserInfo(userInfo);
			userInfoDao.deleteUserInfo(userInfo);
		}
	}
}
