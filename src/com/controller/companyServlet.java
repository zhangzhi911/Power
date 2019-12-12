package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.entity.Company;
import com.entity.filiale;
import com.entity.power;
import com.service.CompanyService;

/**
 * Servlet implementation class StudentSservlet
 */
@WebServlet("/IndexServlet")
public class companyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// 全局变量
	CompanyService companyService = new CompanyService();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("fdfd");
		String me = request.getParameter("m");
		if (me.trim() != null && !"".equals(me.trim())) {
			if (me.equals("searchStudent")) {
				// 总的数据的查询，每个人都能看的那个表
				searchStudent(request, response);
			} else if (me.equals("dianList")) {
//				电站列表
				selectByPrimaryKey(request, response);
			} else if (me.equals("gongList")) {
//				公司 列表
				filialeList(request, response);
			}
		}

	}

	// 总的数据的查询，每个人都能看的那个表
	private void searchStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Company> list = companyService.CompanList(null);
		System.out.println(list);
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		// request.getRequestDispatcher("show.jsp").forward(request, response);
		response.sendRedirect("companylist.jsp");
	}

//	电站列表
	public void selectByPrimaryKey(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<power> list = companyService.selectByPrimaryKey(null);
		System.out.println(list);
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		// request.getRequestDispatcher("show.jsp").forward(request, response);
		response.sendRedirect("powerlist.jsp");
	}

//	公司 列表
	public void filialeList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<filiale> list = companyService.filialeList(null);
		System.out.println(list);
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		// request.getRequestDispatcher("show.jsp").forward(request, response);
		response.sendRedirect("fillertlist.jsp");
	}
}
