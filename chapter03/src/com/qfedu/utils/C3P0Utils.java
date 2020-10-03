package com.qfedu.utils;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Utils {
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource("qfedu");
	
	public static DataSource getDataSource() {
		return dataSource;
	}

}
