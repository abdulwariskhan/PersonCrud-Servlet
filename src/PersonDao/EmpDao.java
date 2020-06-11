/*
 * package PersonDao; import java.util.*;
 * 
 * import PersonBean.Emp; import connection.ConnectionClass;
 * 
 * import java.sql.*;
 * 
 * public class EmpDao {
 * 
 * public static int save(Emp e) { int status=0; Connection con = null; try{
 * con=ConnectionClass.getConnection(); PreparedStatement ps=con.
 * prepareStatement("insert into Persons(FirstName,LastName,Age,country) values (?,?,?,?)"
 * ); ps.setString(1,e.getFirstName()); ps.setString(2,e.getLastName());
 * ps.setString(3,e.getAge()); ps.setString(4,e.getCountry());
 * status=ps.executeUpdate();
 * 
 * con.close(); }catch(Exception ex){ex.printStackTrace();}
 * 
 * return status; } public static int update(Emp e) { int status=0; Connection
 * con = null; try{ con=ConnectionClass.getConnection(); PreparedStatement
 * ps=con.prepareStatement(
 * "update Persons set FirstName=?,LastName=?,Age=?,country=? where Personid=?"
 * ); ps.setString(1,e.getFirstName()); ps.setString(2,e.getLastName());
 * ps.setString(3,e.getAge()); ps.setString(4,e.getCountry());
 * ps.setInt(5,e.getId());
 * 
 * status=ps.executeUpdate();
 * 
 * con.close(); }catch(Exception ex){ex.printStackTrace();}
 * 
 * return status; } public static int delete(int id){ int status=0; Connection
 * con = null; try{ con=ConnectionClass.getConnection(); PreparedStatement
 * ps=con.prepareStatement("delete from Persons where Personid=?");
 * ps.setInt(1,id); status=ps.executeUpdate();
 * 
 * con.close(); }catch(Exception e){e.printStackTrace();}
 * 
 * return status; } public static Emp getEmployeeById(int id){ Emp e=new Emp();
 * Connection con = null; try{ con=ConnectionClass.getConnection();
 * PreparedStatement
 * ps=con.prepareStatement("select * from Persons where Personid=?");
 * ps.setInt(1,id); ResultSet rs=ps.executeQuery(); if(rs.next()) {
 * e.setId(rs.getInt(1)); e.setFirstName(rs.getString(2));
 * e.setLastName(rs.getString(3)); e.setAge(rs.getString(4));
 * e.setCountry(rs.getString(5)); } con.close(); }catch(Exception
 * ex){ex.printStackTrace();}
 * 
 * return e; } public static List<Emp> getAllEmployees(){ Connection con = null;
 * List<Emp> list=new ArrayList<Emp>();
 * 
 * try{ con=ConnectionClass.getConnection(); PreparedStatement
 * ps=con.prepareStatement("select * from Persons"); ResultSet
 * rs=ps.executeQuery(); while(rs.next()){ Emp e=new Emp();
 * e.setId(rs.getInt(1)); e.setFirstName(rs.getString(2));
 * e.setLastName(rs.getString(3)); e.setAge(rs.getString(4));
 * e.setCountry(rs.getString(5)); list.add(e); } con.close(); }catch(Exception
 * e){e.printStackTrace();}
 * 
 * return list; } }
 */