package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.cab_mananger;


@WebServlet("/cablink")
public class cab_contoller  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String kms = req.getParameter("kms");
		String ctype = req.getParameter("ctype");
		
		
		double km1 = Double.parseDouble(kms);
		
		
		req.setAttribute("kms", kms);
		req.setAttribute("ctype", ctype);

		
		
		cab_mananger c1 = new cab_mananger();
		
		if(ctype.equalsIgnoreCase("micro"))
		{
			double BillAmt = c1.micro(km1);
			req.setAttribute("BillAmt",BillAmt);
			RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
			rd.forward(req, resp);
		
		}
		
		else if(ctype.equalsIgnoreCase("prime"))
		{
			double BillAmt=c1.prime(km1);
			req.setAttribute("BillAmt",BillAmt);
			RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
			rd.forward(req, resp);
		    
		}
		
		
		else if(ctype.equalsIgnoreCase("mini"))
		{
			double BillAmt = c1.mini(km1);
			req.setAttribute("BillAmt",BillAmt);
			RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
			rd.forward(req, resp);
		
		}
		
		else
		{
		RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
		rd.forward(req, resp);
	    }
	}
}
