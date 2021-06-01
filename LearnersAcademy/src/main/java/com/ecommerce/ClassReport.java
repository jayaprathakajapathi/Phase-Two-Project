package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Servlet implementation class ClassReport
 */
@WebServlet(name = "ClassReports", urlPatterns = { "/ClassReports" })
public class ClassReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassReport() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();

			List<Teacher> list = session.createQuery("from Teacher").list();
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<b>Product Listing</b><br>");
			for (Teacher t : list) {
				out.println("ID:"+ String.valueOf(t.getID())+"Name:"+t.getName()+"Age:"+t.getAge());
			
					
					Set<Student> student = t.getStudent();
			out.println(", student : ");
			for (Student s : student) {
				out.print(s.getName() + "&nbsp;");
			}	
			
			Set<Subjects> subjects =  t.getSubjects();
			out.println(", subject : ");
			for (Subjects o : subjects) {
				out.print(o.getName() + "&nbsp;");
			}	
			Set<Classes> classes = t.getClasses();
			out.println(", classes : ");
			for (Classes c : classes) {
				out.print(c.getClassname() + "&nbsp;");
			}	
		}
		}
			catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	}

