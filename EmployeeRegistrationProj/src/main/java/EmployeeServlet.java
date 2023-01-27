

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//This doGet() is method of HttpServlet class as we are extending the class
	    // request object reads data from the html
		// response object writes data into html

		System.out.println("We are inside doGet() of servlet");

        Employee employee = new Employee(); //Pojo class object 
		employee.setEmpid(Integer.parseInt(request.getParameter("empid")));
		employee.setEmpFirstName(request.getParameter("empFirstName"));
		employee.setEmpMdName(request.getParameter("empMdName"));
		employee.setEmpLastName(request.getParameter("empLastName"));
		employee.setEmpAge(Integer.parseInt(request.getParameter("empAge")));
		employee.setEmpDept(request.getParameter("empDept"));
		employee.setEmpAddr(request.getParameter("empAddr"));
        
		System.out.println("All values are set inside pojo class variables");
        
        EmployeeDAO  employeeDao = new EmployeeDAO();
        System.out.println("Created DAO object and  want to call inserRecord() method passing");
		if(employeeDao.insertRecord(employee)) { //used DAO class object
			System.out.println("Record Inserted Successfully redirect to success.html file");
			response.sendRedirect("success.html");
		}
        else {
        	response.sendRedirect("error.html");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
