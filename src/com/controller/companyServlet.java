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

	// ȫ�ֱ���
	CompanyService companyService = new CompanyService();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("fdfd");
		String me = request.getParameter("m");
		if (me.trim() != null && !"".equals(me.trim())) {
			if (me.equals("searchStudent")) {
				// �ܵ����ݵĲ�ѯ��ÿ���˶��ܿ����Ǹ���
				searchStudent(request, response);
			} else if (me.equals("dianList")) {
//				��վ�б�
				selectByPrimaryKey(request, response);
			} else if (me.equals("gongList")) {
//				��˾ �б�
				filialeList(request, response);
			}
		}

	}

	// �ܵ����ݵĲ�ѯ��ÿ���˶��ܿ����Ǹ���
	private void searchStudent(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Company> list = companyService.CompanList(null);
		System.out.println(list);
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		// request.getRequestDispatcher("show.jsp").forward(request, response);
		response.sendRedirect("companylist.jsp");
	}

//	��վ�б�
	public void selectByPrimaryKey(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<power> list = companyService.selectByPrimaryKey(null);
		System.out.println(list);
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		// request.getRequestDispatcher("show.jsp").forward(request, response);
		response.sendRedirect("powerlist.jsp");
	}

//	��˾ �б�
	public void filialeList(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<filiale> list = companyService.filialeList(null);
		System.out.println(list);
		HttpSession session = request.getSession();
		session.setAttribute("list", list);
		// request.getRequestDispatcher("show.jsp").forward(request, response);
		response.sendRedirect("fillertlist.jsp");
	}
}
