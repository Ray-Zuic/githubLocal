package com.gao.servlet;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gao.entity.Desk;
import com.gao.entity.Hotel;
import com.gao.entity.HotelVotel;
import com.gao.entity.Info;
import com.gao.entity.User;
import com.gao.entity.h_result;
import com.gao.service.ManagerOperateService;
import com.gao.service.UserOperateService;
import com.gao.service.Impl.ManagerOperateServiceImpl;
import com.gao.service.Impl.UserOperateServiceImpl;
import com.google.gson.Gson;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String servletPath = request.getServletPath();
		
		System.out.println(servletPath);
		String methodName = servletPath.substring(1);
		System.out.println(methodName);
		methodName = methodName.substring(0,methodName.length()-3);
		System.out.println(methodName);
		try {
			Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class,HttpServletResponse.class);
			method.invoke(this,request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
	
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		
		UserOperateService ups = new UserOperateServiceImpl();
		User user = new User();
		String name = request.getParameter("name");
		String pwd = request.getParameter("password");
		
		user.setPassword(pwd);
		user.setUsername(name);
		
		System.out.print(name+" "+pwd);
		
		User reu = ups.login(name);
		if(reu!=null) {
			
			System.out.print(reu.toString());
			
			if(reu.getMark()==1&&reu.getPassword().equals(pwd)) {
				request.getSession().setAttribute("user", reu);
				response.sendRedirect("../meal/user/user.html");
			}
			else if(reu.getMark()==0&&reu.getPassword().equals(pwd)) {
				response.sendRedirect("../meal/manager/manager.html");
			}else {
				response.sendRedirect("../meal/index.jsp");
			}
				
			
		}
		
/*		AddService addService = new AddServiceImpl();
		String students = request.getParameter("nameList");
		String[] stuList = students.split("-");
		for(String stu:stuList) {
			Student s = addService.check(stu);
			if(s == null) {
				addService.add(stu);
			}else {
				int newTimes = s.getTimes()+1;
				s.setTimes(newTimes);
				addService.update(s);
			}
		}*/
	
	}

	private void publish(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		
		//System.out.print("publish");
		
		String context = request.getParameter("context");
		String date=null;
		long time = System.currentTimeMillis();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		date = dateFormat.format(time);
		
		Info info = new Info();
		info.setContext(context);
		info.setDate(date);
		System.out.print(context+" "+date);
		ManagerOperateService ms = new ManagerOperateServiceImpl(); 
		
		ms.publishInfo(info);
		
	}
	
	//显示发布的信息。
	private void showinfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		
        ManagerOperateService InfoService = new ManagerOperateServiceImpl();
		List<Info> infos = InfoService.selectAll();
		
		Gson gson = new Gson();
		//将获取的数据以json形式发送至前端
		String result = gson.toJson(infos);
		System.out.print(result);
		response.getWriter().write(result);
	}
	
	private void showhotel(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		
        UserOperateService InfoService = new UserOperateServiceImpl();
		List<Hotel> infos = InfoService.selectAllHotel();
		
		Gson gson = new Gson();
		//将获取的数据以json形式发送至前端
		String result = gson.toJson(infos);
		System.out.print(result);
		response.getWriter().write(result);
	}
	
	
	private void selectHotel(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		
		UserOperateService InfoService = new UserOperateServiceImpl();
		
		String hotelname = request.getParameter("hotelname");
		User user = (User)request.getSession().getAttribute("user");
		String name = user.getUsername();
		
		System.out.print(name);
		
		HotelVotel hv = new HotelVotel();
		Hotel hotel = InfoService.getHotel(hotelname);
		hv.setHotelid(hotel.getId());
		hv.setHotelName(hotelname);
		hv.setVoterName(name);	
		
		if(InfoService.checkh(name)==null) {
			InfoService.selectHotel(hv);
		}else {
			InfoService.update(hv);
		}
		
	}
	
	private void showhotelres(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		
        UserOperateService InfoService = new UserOperateServiceImpl();
		List<h_result> infos = InfoService.selectResult();
		
		Gson gson = new Gson();
		//将获取的数据以json形式发送至前端
		String result = gson.toJson(infos);
		System.out.print(result);
		response.getWriter().write(result);
	}
	
	private void chooseDesk(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		
		UserOperateService InfoService = new UserOperateServiceImpl();
		
		int tableno =  Integer.valueOf(request.getParameter("tableno"));
		User user = (User)request.getSession().getAttribute("user");
		int id = user.getId();
		String name = user.getUsername();
		
		System.out.print(name);
		
		Desk d = new Desk();
		d.setDeskNo(tableno);
		d.setUserId(id);
		d.setUserName(name);
		
		
		if(InfoService.checkD(name)==null) {
			System.out.println(InfoService.checkD(name));
			InfoService.choseDesk(d);
		}else {
			InfoService.updateD(d);
		}
		
	}
	
	
	private void showdesk(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		
        UserOperateService InfoService = new UserOperateServiceImpl();
		List<Desk> infos = InfoService.showDesks();
		
		Gson gson = new Gson();
		//将获取的数据以json形式发送至前端
		String result = gson.toJson(infos);
		System.out.print(result);
		response.getWriter().write(result);
	}
}
