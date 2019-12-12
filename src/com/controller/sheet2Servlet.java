package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.sheet2;
import com.service.sheet2Service;

/**
 * Servlet implementation class sheet2Servlet
 */
@WebServlet("/sheet2Servlet")
public class sheet2Servlet extends HttpServlet {

	sheet2Service s = new sheet2Service();

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String me = request.getParameter("m");
		if (me.trim() != null && !"".equals(me.trim())) {

			if (me.equals("sheet2List")) {
				sheetFind(request, response);
			}
		}
	}

	private void sheetFind(HttpServletRequest request, HttpServletResponse response) throws IOException {

		List<sheet2> list = s.CompanList(null);
		System.out.println(list);
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		// request.getRequestDispatcher("show.jsp").forward(request, response);
		response.sendRedirect("sheetlist.jsp");
	}

}

















