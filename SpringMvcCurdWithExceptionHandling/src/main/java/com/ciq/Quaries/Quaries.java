package com.ciq.Quaries;

public interface Quaries {
	
	public static String INSERT_QUARY="INSERT INTO Employee values(?,?,?,?)";
	public static String UPDATE_QUARY="UPDATE Employee SET name=?,dob=?,city=? where id=?";
	public static String DELETE_QUARY="DELETE FROM Employee where id=?";
	public static String Retriv_All="select*FROM Employee";
	public static String updategetby_id="select *FROM Employee where id=?";

}
