package servlets;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/loginServlet")
public class Login extends HttpServlet {
 
    private static final long serialVersionUID = 1L;
 
    // This Method Is Called By The Servlet Container To Process A 'POST' Request.
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    	handleRequest(req, resp);
    }
 
    public void handleRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
 
        resp.setContentType("text/html");
 
        // Post Parameters From The Request
        String param1 = req.getParameter("username");
        String param2 = req.getParameter("password");
 
        if(param1 == null || param2 == null) {
            // The Request Parameters Were Not Present In The Query String. Do Something Or Exception Handling !!
        } else if ("".equals(param1) || "".equals(param2)) {
            // The Request Parameters Were Present In The Query String But Has No Value. Do Something Or Exception Handling !!
        } else {
            System.out.println("Username?= " + param1 + ", Password?= " + param2);
 
            // Print The Response
            PrintWriter out = resp.getWriter();
            out.write("<html><body><div id='serlvetResponse' style='text-align: center;'>");
 
            // Authentication Logic & Building The Html Response Code
            if((param1.equalsIgnoreCase("jcg")) && (param2.equals("admin@123"))) {              
                out.write("<h2>Servlet Application Login Example</h2>");
                out.write("<p style='color: green; font-size: large;'>Congratulations! <span style='text-transform: capitalize;'>" + param1 + "</span>, You are an authorised login!</p>");             
            } else {
                out.write("<p style='color: red; font-size: larger;'>You are not an authorised user! Please check with administrator!</p>");                
            }
            out.write("</div></body></html>");
            out.close();
        }
    }
}