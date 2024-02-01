package com.jdbcTemplate.DataEntryInJDBC;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeDao {
	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
 public int save(Employee e) {
	String q="insert into springemp values('"+e.getId()+"','"+e.getName()+"','"+e.getSalary()+"')";
	
	return jdbctemplate.update(q);
 }
 
 public int update(Employee e) {
	 String q="update springemp set name='"+e.getName()+"',salary='"+e.getSalary()+"'where id='"+e.getId()+"'";
	 return jdbctemplate.update(q);
 }

 
 public List<Employee> getAllEmployee(){
	 String q="select * from springemp";
 
	 ResultSetExtractor<List<Employee>> rs1= new ResultSetExtractor<List<Employee>>() {
		
		@Override
		public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<Employee> list=new ArrayList<Employee>();
			while(rs.next()) {
				Employee e= new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				list.add(e);
			}
		
		return list;
		}
	};
	 
	 
 
 return jdbctemplate.query(q, rs1);
 }
 
 
 public int deleteemployee(Employee e) {
	 String q="delete from springemp where id='"+e.getId()+"'";
	 
	 return jdbctemplate.update(q);
 } 
 
}
