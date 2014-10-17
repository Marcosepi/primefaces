package com.xiaodai.DAO;



import com.xiaodai.bean.LoanInfoBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.jdbc.Driver").newInstance();
//		Connection conn = DriverManager.getConnection("jdbc:mysql://49.212.203.43:3306/xiaodai800?" +"user=xiaodai_root&password=q1w2e3r4t5y6");
//		Statement smt = conn.createStatement();
//		System.out.println("succeed!");
//		String sql = "select * from LoanInfo order by snapshotTime desc limit 0,100";
//		ResultSet rs = smt.executeQuery(sql);
//		
//		List <LoanInfoBean> lflist = new ArrayList();
//		
//		
//		while(rs.next()){
//			//System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3));
//			LoanInfoBean lfb = new LoanInfoBean();
//			//给bean赋值
//			lfb.setId(rs.getInt(1));
//			lfb.setWebsiteName(rs.getString(2));
//			lfb.setTabName(rs.getString(3));
//			lfb.setLoanType(rs.getString(4));
//			lfb.setTitle(rs.getString(5));
//			lfb.setObligorId(rs.getString(6));
//			lfb.setMoney(rs.getInt(7));
//			lfb.setDurationMonths(rs.getInt(8));
//			lfb.setYearInterestRate(rs.getDouble(9));
//			lfb.setBonusRate(rs.getDouble(10));
//			lfb.setProgress(rs.getDouble(11));
//			lfb.setBidEndTime(rs.getDate(12));
//			lfb.setRepaymentMode(rs.getString(13));
//			lfb.setLoanStatus(rs.getString(14));
//			lfb.setLoanDetail(rs.getString(15));
//			lfb.setSnapshotTime(rs.getDate(16));
//			lfb.setDetailURL(rs.getString(17));
//			lfb.setComment(rs.getString(18));
//			
//			lflist.add(lfb);
//		}
//		
//		for(LoanInfoBean x : lflist){
//			System.out.println(x.getId());
//			System.out.println(x.getWebsiteName());
//			System.out.println(x.getProgress());
//		}
//			
//		System.out.println("done!!");
//		rs.close();
//		smt.close();
//		conn.close();
		List <LoanInfoBean> l = new ArrayList();
		getData(l);
		
		
	}
	public static void getData(List <LoanInfoBean>lflist) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://49.212.203.43:3306/xiaodai800?" +"user=xiaodai_root&password=q1w2e3r4t5y6");
		Statement smt = conn.createStatement();
		System.out.println("succeed!");
		String sql = "select * from LoanInfo order by snapshotTime desc limit 0,100";
		ResultSet rs = smt.executeQuery(sql);
		
		//List <LoanInfoBean> lflist = new ArrayList();
//		
//		 lflist = new ArrayList();
		while(rs.next()){
			//System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3));
			LoanInfoBean lfb = new LoanInfoBean();
			//给bean赋值
			lfb.setId(rs.getInt(1));
			lfb.setWebsiteName(rs.getString(2));
			lfb.setTabName(rs.getString(3));
			lfb.setLoanType(rs.getString(4));
			lfb.setTitle(rs.getString(5));
			lfb.setObligorId(rs.getString(6));
			lfb.setMoney(rs.getInt(7));
			lfb.setDurationMonths(rs.getInt(8));
			lfb.setYearInterestRate(rs.getDouble(9));
			lfb.setBonusRate(rs.getDouble(10));
			lfb.setProgress(rs.getDouble(11));
			lfb.setBidEndTime(rs.getDate(12));
			lfb.setRepaymentMode(rs.getString(13));
			lfb.setLoanStatus(rs.getString(14));
			lfb.setLoanDetail(rs.getString(15));
			lfb.setSnapshotTime(rs.getTimestamp(16));
			lfb.setDetailURL(rs.getString(17));
			lfb.setComment(rs.getString(18));
			
			lflist.add(lfb);
		}
		
	
			
		System.out.println("done!!");
		rs.close();
		smt.close();
		conn.close();
	}
	public static void getDataFromLeida(List <LoanInfoBean>lflist) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection conn = DriverManager.getConnection("jdbc:mysql://49.212.203.43:3306/xiaodai800?" +"user=xiaodai_root&password=q1w2e3r4t5y6");
		Statement smt = conn.createStatement();
		System.out.println("succeed!");
		String sql = "select * from LoanInfo_leida order by snapshotTime desc limit 0,200";
		ResultSet rs = smt.executeQuery(sql);
		
		//List <LoanInfoBean> lflist = new ArrayList();
//		
//		 lflist = new ArrayList();
		while(rs.next()){
			//System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3));
			LoanInfoBean lfb = new LoanInfoBean();
			//给bean赋值
			lfb.setId(rs.getInt(1));
			lfb.setWebsiteName(rs.getString(2));
		
			lfb.setLoanType(rs.getString(3));
			lfb.setTitle(rs.getString(4));
			lfb.setObligorId(rs.getString(5));
			lfb.setMoney(rs.getInt(6));
			lfb.setDurationMonths(rs.getInt(7));
			lfb.setDurationDays(rs.getInt(8));
			lfb.setYearInterestRate(rs.getDouble(9));
			lfb.setBonusRate(rs.getDouble(10));
			lfb.setYearIncomeRate(rs.getDouble(11));
			lfb.setMonthInterestRate(rs.getDouble(12));
			lfb.setManagementRate(rs.getDouble(13));
			
			lfb.setProgress(rs.getDouble(14));
			lfb.setRepaymentMode(rs.getString(15));
			lfb.setSnapshotTime(rs.getTimestamp(16));
			lfb.setDetailURL(rs.getString(17));
		
			
			lflist.add(lfb);
		}
		
		for(LoanInfoBean x : lflist){
			System.out.println(x.getId());
			System.out.println(x.getWebsiteName());
			System.out.println(x.getProgress());
		}
			
		System.out.println("done!!");
		rs.close();
		smt.close();
		conn.close();
	}
}


