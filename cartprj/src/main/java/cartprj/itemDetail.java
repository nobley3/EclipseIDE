package cartprj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/itemDetail")
public class itemDetail extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		상품정보 가져오기
//		서비스, dao

//		모델심기
		String item = "티셔츠";
		req.setAttribute("item", item);
		req.getRequestDispatcher("WEB-INF/views/itemDetail.jsp").forward(req, resp);
		
		
	}
}
