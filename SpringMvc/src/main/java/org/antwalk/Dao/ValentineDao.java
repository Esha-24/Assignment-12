package org.antwalk.Dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class ValentineDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	public void setDataSource(DataSource ds) {
		dataSource=ds;
		jdbcTemplate=new JdbcTemplate(dataSource);
	}
	public void create(String Day,String gift,String Location) {
		String query="insert into valentine(day,gift,location) values(?,?,?)";
		jdbcTemplate.update(query,Day,gift,Location);
	}
}
