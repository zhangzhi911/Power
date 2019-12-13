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
		System.out.println(me);
		if (me.trim() != null && !"".equals(me.trim())) {

			if (me.equals("sheet2List")) {
				sheetFind(request, response);
			} else if (me.equals("sheetUpBy")) {
				sheetUpBy(request, response);
			} else if (me.equals("sheetUpdate")) {
				sheetUpdate(request, response);
			} else if (me.equals("sheetInsert")) {
				sheetInsert(request, response);
			}
		}
	}

	private void sheetFind(HttpServletRequest request, HttpServletResponse response) throws IOException {

		List<sheet2> list = s.CompanList(null);
		System.out.println(list);
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		response.sendRedirect("sheetlist.jsp");
	}

	private void sheetUpBy(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id = request.getParameter("aid");
		int aid = Integer.parseInt(id);
		String qing = request.getParameter("qing");
		sheet2 sh = new sheet2();
		sh.setAid(aid);
		sh.setQing(qing);
		try {
			s.updateBy(sh);
		} catch (Exception e) {
			e.printStackTrace();
		}

		response.sendRedirect("sheetlist.jsp");
	}

	private void sheetUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String id = request.getParameter("aid");
		int aid = Integer.parseInt(id);
		String qing = request.getParameter("qing");
		
		
		sheet2 sh = new sheet2();
		sh.setAid(aid);
		sh.setQing(qing);
		sh.setZhuan("¿ªÊ¼");
		
		
		try {
			s.updateBy(sh);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("sheetlist.jsp");
	}

	private void sheetInsert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String id = request.getParameter("fid");
		int fid = Integer.parseInt(id);
		String fname = request.getParameter("fname");
		sheet2 sh = new sheet2();
		sh.setFid(fid);
		sh.setFname(fname);
			
		try {
			s.insertsheet(sh);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("sheetlist.jsp");
	}

}
