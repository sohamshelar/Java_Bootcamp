package com.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Employee;

public class EmpDb {
	public List<Employee> getRecords()
	{
		List<Employee> elist=new ArrayList<Employee>();
		String qry="Select * from empl";
		try
		{
			Statement st=ConnectDb.con.createStatement();
			ResultSet rs= st.executeQuery(qry);
			while(rs.next())
			{
				elist.add(new Employee(rs.getInt("empno"),rs.getString("ename"), rs.getDouble("sal"), rs.getString("job")));
			}
		}catch(SQLException sq)
		{
			System.out.println(sq.getMessage());
		}
		
		return elist;
	}
	
	public int addRecord(Employee em)
	{
		String qry="insert into empl values(?,?,?,?)";
		int cnt=0;
		try
		{
			PreparedStatement ps=ConnectDb.con.prepareStatement(qry);
			ps.setInt(1, em.getEmpno());
			ps.setString(2, em.getEname());
			ps.setDouble(3, em.getSal());
			ps.setString(4, em.getJob());
			cnt=ps.executeUpdate();
		}catch(SQLException sq)
		{
			sq.printStackTrace();
		}
		return cnt;
	}
	public int  updateRecord(Employee em)
	{
		List<Employee> elist = new ArrayList<Employee>();
		String qry="update empl set ename=?, sal=? ,job=? where empno=? ";
		int cnt=0;
		
		try
		{
			PreparedStatement ps=ConnectDb.con.prepareStatement(qry);
			ps.setString(1, em.getEname());
			ps.setDouble(2, em.getSal());
			ps.setString(3, em.getJob());
			ps.setInt(4, em.getEmpno());
			cnt=ps.executeUpdate();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
			return cnt;
		}
	
	public int deleteRecord(int empno)
	{
		String qry="delete from empl where empno=?";
		int cnt=0;
		try
		{
			PreparedStatement ps=ConnectDb.con.prepareStatement(qry);
			ps.setInt(1,empno);
			cnt=ps.executeUpdate();
			
		}catch(SQLException es)
		{
			es.printStackTrace();
		}
		return cnt;
		
		
	}
}
