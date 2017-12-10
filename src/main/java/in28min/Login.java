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
    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse response) throws ServletException, IOException{
        //PrintWriter writer = response.getWriter();
//       String name1= req.getParameter("name");
       req.setAttribute("name", req.getParameter("name"));
       req.setAttribute("password", req.getParameter("password"));
      req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, response);
     
    }

}
