package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
@WebServlet("/servlet")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=UTF-8");
		    PrintWriter out = response.getWriter();
		try {

	        String page = request.getParameter("option");

	        if(request.getParameter("option").equals("4")){
                System.out.println("Inside the option 4");
	            request.setAttribute("s1", page);
	            RequestDispatcher req = getServletContext().getRequestDispatcher("action_file_upload_ControlStructure.jsp");
                req.forward(request, response);
	        	//response.sendRedirect("updated.jsp");
	            //request.getRequestDispatcher("action_file_upload_ControlStructure.jsp").forward(request, response);
	        }
	        else if(request.getParameter("option").equals("5")){
	            request.setAttribute("s2", page);
	            RequestDispatcher req = getServletContext().getRequestDispatcher("action_file_upload_inheritnce.jsp");
	            req.forward(request, response);
	        }

	        
	    } finally {
	        System.out.close();
	    }
	}
}
