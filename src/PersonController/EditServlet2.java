package PersonController;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Person.Service.PersonService;
import Person.ServiceImpl.PersonServiceImpl;
import PersonBean.Emp;
//import PersonDao.EmpDao;  
@SuppressWarnings("serial")
@WebServlet("/EditServlet2")  
public class EditServlet2 extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
          throws ServletException, IOException 
    {
    	PersonService ps = new PersonServiceImpl();
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        String firstName=request.getParameter("firstname");  
        String lastName=request.getParameter("Lastname");  
        String age=request.getParameter("age");  
        String country=request.getParameter("country");  
          
        Emp e=new Emp();  
        e.setId(id);  
        e.setFirstName(firstName);
        e.setLastName(lastName); 
        e.setAge(age);
        e.setCountry(country);  
          
        int status=ps.update(e);  
        if(status>0){  
            response.sendRedirect("ViewServlet");  
        }else{  
            out.println("Sorry! unable to update record");  
        }  
          
        out.close();  
    }  
  
}  