package com.controller;

import java.io.IOException;
import java.math.BigDecimal;
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
			} else if (me.equals("pwoerupdate")) {
//				电站修改
				pwoerupdate(request, response);
			} else if (me.equals("pwoerInsert")) {
				pwoerInsert(request, response);
				// 电站添加
			} else if (me.equals("pwoerdelete")) {
				pwoerdelete(request, response);
				// 删除电站
			}
//			下面是公司
			else if (me.equals("gongList")) {
				// 公司 列表
				filialeList(request, response);
			} else if (me.equals("filialeUpdate")) {
				// 公司 修改
				filialeUpdate(request, response);
			} else if (me.equals("filialeInsert")) {
				// 公司 添加
				filialeInsert(request, response);
			} else if (me.equals("filialeDelete")) {
				// 公司 删除
				filialeDelete(request, response);
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

//	电站修改
	public void pwoerupdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String pid = request.getParameter("pid");
		String pname = request.getParameter("pname");

		BigDecimal price = new BigDecimal(request.getParameter("pprice"));
		power p = new power();

		p.setPid(Integer.parseInt(pid));
		p.setPname(pname);
		p.setPprice(price);
		System.out.println(p);
		companyService.updatepower(p);
		response.sendRedirect("powerlist.jsp");
	}

//	电站添加
	public void pwoerInsert(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String pname = request.getParameter("pname");

		BigDecimal price = new BigDecimal(request.getParameter("pprice"));
		power p = new power();

		p.setPname(pname);
		p.setPprice(price);
		System.out.println(p);

		companyService.insertpower(p);
		response.sendRedirect("powerlist.jsp");
	}

//	电站删除
	public void pwoerdelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String pid = request.getParameter("pid");
		power p = new power();

		p.setPid(Integer.parseInt(pid));
		System.out.println(p);
		companyService.deltepower(p);
		response.sendRedirect("powerlist.jsp");
	}

//	下面公司的

//	公司 列表
	public void filialeList(HttpServletRequest request, HttpServletResponse response) throws IOException {

		List<filiale> list = companyService.filialeList(null);
		System.out.println(list);
		HttpSession session = request.getSession();
		session.setAttribute("list", list);

		response.sendRedirect("fillertlist.jsp");
	}

//	公司修改
	public void filialeUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fid = request.getParameter("fid");
		String fname = request.getParameter("fname");
		String fprice = request.getParameter("fprice");
		String fstatus = request.getParameter("fstatus");
		filiale f = new filiale();
		f.setFid(Integer.parseInt(fid));
		f.setFname(fname);
		f.setFprice(fprice);
		f.setFstatus(Integer.parseInt(fstatus));
		System.out.println(f);

		companyService.updatefiliale(f);
		response.sendRedirect("fillertlist.jsp");
	}

//	公司 添加
	public void filialeInsert(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String fid = request.getParameter("fid");
		String fname = request.getParameter("fname");
		String fprice = request.getParameter("fprice");
		String fstatus = request.getParameter("fstatus");
		filiale f = new filiale();
		f.setFid(Integer.parseInt(fid));
		f.setFname(fname);
		f.setFprice(fprice);
		f.setFstatus(Integer.parseInt(fstatus));
		System.out.println(f);

		companyService.insertfiliale(f);
		response.sendRedirect("fillertlist.jsp");
	}

//	公司删除
	public void filialeDelete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String fid = request.getParameter("fid");
		filiale f = new filiale();
		f.setFid(Integer.parseInt(fid));
		System.out.println(f);
		companyService.deltefiliale(f);
		response.sendRedirect("fillertlist.jsp");
	}
}
