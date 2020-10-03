package com.qfedu.test;
import java.sql.SQLException;
import java.util.List;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import com.qfedu.utils.C3P0Utils;

public class TestDBUtils_ColumnListHandler {
	public static void main(String[] args) throws SQLException{
		QueryRunner queryRunner = new QueryRunner(C3P0Utils.getDataSource());
		
		String sql = "select * from students";
		List<Object> list = (List<Object>) queryRunner.query(sql, new ColumnListHandler("s_name"));
		
		System.out.println(list);
	}
}
