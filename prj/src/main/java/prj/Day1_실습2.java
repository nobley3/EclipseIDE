package prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Quiz2")
public class Day1_실습2 extends HttpServlet{
// 두 수를 입력받아 사칙연산 구하기
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;chrset=utf-8");//서버가 보내는 데이터의 형식 html 형식임을 알려줌 //("text/plain") => 그냥 텍스트문서로 인식함.
		response.setCharacterEncoding("utf-8"); //utf-8형식으로 데이터를 보낸다는 의미
	
		
		int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));

        PrintWriter out = response.getWriter();
        
     
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>계산 결과</title>");
        out.println("</head>");
        out.println("<body>"); 
        out.println("<h1>계산 결과</h1>");
        out.println("<p>덧셈 결과: " + (num1 + num2) + "</p>");
        out.println("<p>뺄셈 결과: " + (num1 - num2) + "</p>");
        out.println("<p>곱셈 결과: " + (num1 * num2) + "</p>");
        out.println("<p>나누기 결과: " + ((double) num1 / num2) + "</p>");
  
        out.println("</body>");
        out.println("</html>");






	}
}
