package com.ciq.queries;

public interface Queries {
public static String INSERT_QUARY="INSERT INTO employee VALUES(?,?,?,?)";
public static String UPDATE_QUARY="UPDATE Employee SET name=?,dob=?,city=?,WHERE id=?";
public static String DELETE_QUARY="DELETE FROM Employee WHERE id=?";
public static String Retrive_All="select*from employee";
public static String updategetby_id="select*from employee where id=?";


}
