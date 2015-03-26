package poc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmmaController
 */
public class EmmaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmmaController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In servelett");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In servelet");
		String first = request.getParameter("first");
		String second = request.getParameter("second");
		RequestDispatcher rd;
		if(first.equalsIgnoreCase(second)) {
			rd = request.getRequestDispatcher("trigger.jsp");
		} else {
			rd = request.getRequestDispatcher("result.jsp");
		}
			
		if(first.equalsIgnoreCase("jeffrey")) {
			System.out.println("IN first loop");
			first=second;
		} else if (first.equalsIgnoreCase("peter")) {
			System.out.println("IN Second Loop");
			first=second;
		}
		request.setAttribute("result", first+ second);
		
		rd.forward(request, response);
	}

}
