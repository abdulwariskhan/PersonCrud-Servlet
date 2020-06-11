package Person.Service;

import java.util.List;

import PersonBean.Emp;

public interface PersonService {
	int save(Emp e);
	int update(Emp e);
	int delete(int id);
	Emp getEmployeeById(int id);
	List<Emp> getAllEmployees();
}
