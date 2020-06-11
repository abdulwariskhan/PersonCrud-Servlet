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
@WebServlet("/SaveServlet")  
public class SaveServlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException 
    {
//    	Ssss
	PersonService ps = new PersonServiceImpl();
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();
        String name=request.getParameter("firstname");  
        String lastnm=request.getParameter("Lastname");  
        String Age=request.getParameter("age");  
        String country=request.getParameter("country");  
          
        Emp e=new Emp();  
        e.setFirstName(name);
        e.setLastName(lastnm);  
        e.setAge(Age);  
        e.setCountry(country);  
          
        int status=ps.save(e);  
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("index.html").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
    }  
  
}  