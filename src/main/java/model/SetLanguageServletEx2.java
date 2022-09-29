package model;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.jsp.jstl.core.Config;

/**
 * Servlet implementation class SetLanduageServletEx2
 */
@WebServlet("/SetLanguageServletEx2")
public class SetLanguageServletEx2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public SetLanguageServletEx2() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     String locale = request.getParameter("locale");
	        if (locale != null) {
	            Config.set(request.getSession(), Config.FMT_LOCALE, locale);

	            Cookie localeCookie = new Cookie("locale", locale);
	            localeCookie.setMaxAge(365 * 24 * 60 * 60); // One year in seconds
	            response.addCookie(localeCookie);
	            // Cookie with locale sent to client
	        }

	        String referrer = request.getHeader("referer");
	        response.sendRedirect(referrer);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
