/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HOME
 */
@WebServlet(name = "doitienServlet", urlPatterns = {"/doitienServlet"})
public class doitienServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double tienngoaite = Double.parseDouble(request.get Parameter("sotien") ) ;
       

    
   
int loai = Integer.parseInt(request.getParameter("loaingoaile"));
        double tienvnd = 0;
        String tenngoaite = "";
        switch (loai) {

            case 1:
                tienvnd = tienngoaite * 21380;
                tenngoaite = "USD";
                break;
            case 2:
                tienvnd = tienngoaite * 32622.80;
                tenngoaite = "GBP";
                break;
            case 3:
                tienvnd = tienngoaite * 23555.67;
                tenngoaite = "BUR";
                break;
            case 4:
                tienvnd = tienngoaite * 178.61;
           
                tenngoaite = "JPY";
                break;
            case 5:
                tienvnd = tienngoaite * 16727.44;
            
                tenngoaite = "AUD";
                break;
            default:

                throw new AssertionError();
        }
        DecimalFormat fmt = new DecimalFormat("#, ##0");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DOITIEEN</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DOITIEEN at " + request.getContextPath() + "</h1>");
            out.println("</body>");
             out.println("</html>");
        }
    }
}

