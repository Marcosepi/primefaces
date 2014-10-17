package com.xiaodai.bean;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xiaodai.DAO.Test1;

public class LoanInfoTable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<LoanInfoBean> loanInfoList;
	public LoanInfoTable() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		loanInfoList = new ArrayList();
		Test1.getDataFromLeida(loanInfoList);
		Test1.getData(loanInfoList);
		
		
	}
	public List<LoanInfoBean> getLoanInfoList() {
		return loanInfoList;
	}
	public void setLoanInfoList(List<LoanInfoBean> loanInfoList) {
		this.loanInfoList = loanInfoList;
		
	}
	
}
