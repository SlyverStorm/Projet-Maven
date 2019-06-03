package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The Class DAOMap
 *
 * @author Thibaut MAITREPIERRE
 */

class DAOMap {

	private static Connection connection;
	
	
	public DAOMap(final Connection connection) throws SQLException {
		DAOMap.connection = connection;
	}
	
	
	protected static Connection getConnection() {
		return DAOMap.connection;
	}
	
	
	public static void find(final int id, final String fileName) throws IOException {
		
		try {
			final String sql = "{call helloworldById(?)}";
			final CallableStatement call = DAOMap.getConnection().prepareCall(sql);
			call.setInt(1, id);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				mapTextFile(resultSet.getString("MapLevel"), fileName); /*Get a specific string depending on the id | "column name"*/
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	
	public static void mapTextFile(final String map, final String fileName) throws IOException {
		FileWriter writer = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write(map);
		bw.close();
	}
	
}
