package util;

import java.io.UnsupportedEncodingException;

public class EncodingUtil {
	public static String encoding(String str) throws UnsupportedEncodingException
	{
		return new String(str.getBytes("ISO-8859-1"),"UTF-8");
	}

}
