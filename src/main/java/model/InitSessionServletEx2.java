package model;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.jsp.jstl.core.Config;

/**
 * Servlet implementation class InitSessionServlet
 */
@WebServlet("/InitSessionServletEx2")
public class InitSessionServletEx2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitSessionServletEx2() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                if (cookie.getName().equals("locale")) {
//                    // Set locale from cookie
//                    Config.set(request.getSession(), Config.FMT_LOCALE, cookie.getValue());
//                }
//            }
//        } else {
//            Locale locale = request.getLocale();
//
////            Config.set(request.getSession(), Config.FMT_LOCALE, locale.getLanguage() + "_" + locale.getCountry());
//            Config.set(request.getSession(), Config.FMT_LOCALE, locale.getLanguage());
//
////            Cookie localeCookie = new Cookie("locale", locale.getLanguage() + "_" + locale.getCountry());
//            Cookie localeCookie = new Cookie("locale", locale.getLanguage());
//            localeCookie.setMaxAge(365 * 24 * 60 * 60); // One year in seconds
//            response.addCookie(localeCookie);
//            // Cookie with locale sent to client
//        }
        response.sendRedirect("start.jsp");
    	
	}


    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
