package PersonDao;

import java.util.List;

import PersonBean.Emp;

public interface PersonDao 
{
	int save(Emp e);
	int update(Emp e);
	int delete(int id);
	Emp getEmployeeById(int id);
	List<Emp> getAllEmployees();
}
