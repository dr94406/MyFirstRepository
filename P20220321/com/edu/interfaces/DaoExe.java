package com.edu.interfaces;

public class DaoExe {
	public static void main(String[] args) {
		Dao dao = new MysqlDao(); // new OracleDao();
		
		dao.select();

		dao.insert();

		dao.update();

		dao.delete();

	}
}
