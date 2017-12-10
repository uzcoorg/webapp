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
    private userValidationService validate = new userValidationService();
    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse response) throws ServletException, IOException{
        //PrintWriter writer = response.getWriter();
//       String name1= req.getParameter("name");
       req.setAttribute("name", req.getParameter("name"));
       req.setAttribute("password", req.getParameter("password"));
      req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, response);

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String user = request.getParameter("name");
        String password = request.getParameter("password");


        boolean isvalid = validate.validUser(user, password);
        if (isvalid){
            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
        }
        else {
            request.setAttribute("errorMessage", "INVALID PASSWORD OR USER DONT EXIT ");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        }
    }
}
