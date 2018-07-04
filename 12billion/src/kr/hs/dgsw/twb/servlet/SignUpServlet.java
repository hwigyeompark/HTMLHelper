package kr.hs.dgsw.twb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import kr.hs.dgsw.twb.service.UserService;
import kr.hs.dgsw.twb.service.impl.CommonUserService;

@WebServlet("/SignUpServlet")
public class SignUpServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	
	private static UserService userService = new CommonUserService();

	public SignUpServlet()
	{
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("application/json; charset=UTF-8");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		RestResult restResult = new RestResult();
		String finalResult = null;
		Gson gson = new Gson();
		
		try {		
			userService.signUp(email, password);
			restResult.setResult("Success");		
		} catch (Exception e) {
			restResult.setResult("Fail");
		}
		
		finalResult = gson.toJson(restResult);
		response.getWriter().append(finalResult);		
	}

}