package Person.ServiceImpl;

import java.util.List;

import Person.DaoImp.PersonDaoImpl;
import Person.Service.PersonService;
import PersonBean.Emp;
import PersonDao.PersonDao;

public class PersonServiceImpl implements PersonService 
{
	PersonDao pd = new PersonDaoImpl();
	@Override
	public int save(Emp e) {
		// TODO Auto-generated method stub
		return pd.save(e);
	}

	@Override
	public int update(Emp e) {
		// TODO Auto-generated method stub
		return pd.update(e);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return pd.delete(id);
	}

	@Override
	public Emp getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return pd.getEmployeeById(id);
	}

	@Override
	public List<Emp> getAllEmployees() {
		// TODO Auto-generated method stub
		return pd.getAllEmployees();
	}
}
