package PersonController;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Person.Service.PersonService;
import Person.ServiceImpl.PersonServiceImpl;
//import PersonDao.EmpDao;  
@WebServlet("/DeleteServlet")  
public class DeleteServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException 
    {
    	PersonService ps = new PersonServiceImpl();
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
        ps.delete(id);  
        response.sendRedirect("ViewServlet");  
    }  
}  