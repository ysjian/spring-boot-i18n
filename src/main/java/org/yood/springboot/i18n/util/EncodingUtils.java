package org.yood.springboot.i18n.util;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * 
 * @author 袁慎建
 * @version 1.0
 * @email ysjian_pingcx@126.com
 * @QQ 646633781
 * @telephone 18192235667
 * @csdnBlog http://blog.csdn.net/ysjian_pingcx
 * @createTime 2014年6月23日
 */
public class EncodingUtils {

	/** encoding:UTF-8 */
	public static final String UTF_8 = "UTF-8";
	/** encoding:GBK */
	public static final String GBK = "GBK";
	/** encoding:ISO-8859-1 */
	public static final String ISO_8859_1 = "ISO-8859-1";
	/** encoding:GB2312 */
	public static final String GB_2312 = "GB2312";

	private EncodingUtils() {
	}

	/**
	 * Encode the string value by UTF-8
	 * 
	 * @param value
	 *            the string value
	 * @return the value after encoding
	 */
	public static String urlEncodeUTF8(String value) {
		try {
			return URLEncoder.encode(value, UTF_8);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return value;
		}
	}

	/**
	 * Convert ISO-8859-1 to UTF-8
	 * 
	 * @param value
	 *            the string to be converted
	 * @return the string after being converted
	 */
	public static final String isoToUtf(String value) {
		try {
			return new String(value.getBytes(ISO_8859_1), UTF_8);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return value;
		}
	}

	/**
	 * Convert UTF-8 to ISO-8859-1
	 * 
	 * @param value
	 *            the string to be converted
	 * @return the string after being converted
	 */
	public static final String utfToIso(String value) {
		try {
			return new String(value.getBytes(UTF_8), ISO_8859_1);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return value;
		}
	}

	/**
	 * Convert UTF-8 to GBK
	 * 
	 * @param value
	 *            the string to be converted
	 * @return the string after being converted
	 */
	public static final String utfToGbk(String value) {
		try {
			return new String(value.getBytes(UTF_8), GBK);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return value;
		}
	}

	/**
	 * Convert ISO-8859-1 to GBK
	 * 
	 * @param value
	 *            the string to be converted
	 * @return the string after being converted
	 */
	public static final String isoToGbk(String value) {
		try {
			return new String(value.getBytes(ISO_8859_1), GBK);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return value;
		}
	}

	/**
	 * Convert GBK to ISO-8859-1
	 * 
	 * @param value
	 *            the string to be converted
	 * @return the string after being converted
	 */
	public static final String gbkToIso(String value) {
		try {
			return new String(value.getBytes(GBK), ISO_8859_1);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return value;
		}
	}

	/**
	 * Convert GBK to UTF-8
	 * 
	 * @param value
	 *            the string to be converted
	 * @return the string after being converted
	 */
	public static final String gbkToUtf(String value) {
		try {
			return new String(value.getBytes(GBK), UTF_8);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return value;
		}
	}
}
