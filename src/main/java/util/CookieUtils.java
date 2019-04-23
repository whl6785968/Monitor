package util;

import javax.servlet.http.Cookie;

public class CookieUtils {
	public static Cookie getCookieByName(String name,Cookie[] cookies)
	{
		if(cookies!=null) {
			
		
			for(Cookie cookie : cookies)
			{
				if(name.equals(cookie.getName()))
				{
					return cookie;
				}
			}
		}
		return null;
	}
}
