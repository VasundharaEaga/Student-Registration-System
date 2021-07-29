package com.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCourseServlet extends HttpServlet{

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=ISO-8859-1");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String sname = request.getParameter("sname");
            String cid=request.getParameter("cid");
            String cname = request.getParameter("cname");
            String  phoneno= request.getParameter("phoneno");
            
            //make user object
            Enroll courseEnrollModel = new Enroll(sname,cid,cname,phoneno);

            //create database model
            EnrollDatabase regCourseEnroll = new EnrollDatabase(ConnectionPro.getConnection());
            regCourseEnroll.saveCourseEnroll(courseEnrollModel);
            response.sendRedirect("student_enroll.jsp");
//            if (regCourse.saveCourse(courseModel)) {
//                response.sendRedirect("admin_add_enroll.jsp");
//            } else {
//                String errorMessage = "Admin Available";
//                HttpSession regSession = request.getSession();
//                regSession.setAttribute("RegError", errorMessage);
//                response.sendRedirect("admin_registration.jsp");
//            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>	
	
}
