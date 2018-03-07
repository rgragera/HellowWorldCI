package net.rc.presentacion;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
* @author Roberto Crespo
*
*/

public class SaludoServlet extends HttpServlet implements Serializable
{     
	
	private static final Logger LOGGER = Logger.getLogger( SaludoServlet.class.getName() );

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
     
		 processRequest(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			//Equivalente al system.out.println
			LOGGER.log(Level.FINE, "Procesando petición.. "); 
			
			String txtNombre = request.getParameter("txtNombre");


			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			  
			  out.println("<html>");
			  out.println("<body>");
			  out.println("<br>");
			  out.println("Hello World");
			  out.println("<br>"); 
			  out.println("Hello " + txtNombre);			  
			  out.println("</body>");
			  out.println("</html>");

	}
}