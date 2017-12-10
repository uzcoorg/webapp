package in28min;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login.do")
public class Login extends HttpServlet {
   private userValidator service = new userValidator();
    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse response) throws ServletException, IOException{
        //PrintWriter writer = response.getWriter();
//       String name1= req.getParameter("name");
       req.setAttribute("name", req.getParameter("name"));
       req.setAttribute("password", req.getParameter("password"));
      req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, response);
     
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        boolean isValidUser = service.validateUser(name, password);

        if (isValidUser) {
            request.setAttribute("name", name);
            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
        } else {
            request.setAttribute("errorMessage", "Invalid Credentials!!");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
    }

}
