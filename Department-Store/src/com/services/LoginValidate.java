package com.services;

import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class LoginValidate {
	public boolean getLoginStatus(String username, String password, String accountType) {
		boolean status = false;
		DatabaseConnection dbConnect = new DatabaseConnection();
		try {
			Connection con = dbConnect.getConnection();
			String sql = "SELECT COUNT(*) FROM LOGINTABLE WHERE USERNAME = ? and PASSWORD = ? and ACCOUNT_TYPE = ?";
			PreparedStatement pstm = (PreparedStatement) con.prepareStatement(sql);
			pstm.setString(1, username.toUpperCase());
			pstm.setString(2, password.toUpperCase());
			pstm.setString(3, accountType.toUpperCase());
			ResultSet result = pstm.executeQuery();
			int count = 0;
			while(result.next()) {
				count = result.getInt(1);
			}
			if (count ==1) status = true;
		} catch (Exception e) {
			ErrorHandling error = new ErrorHandling();
			error.getMessage("Login Failed", "Your username or password is incorrect. Maybe you selected the wrong account type.\nTry again!!", "E");
		}
		
		return status;
	}
}
