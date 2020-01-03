package com.wangpengfei.util;

/**
 * }
 * 
 * @ClassName: NumberUtil
 * @Description: TODO
 * @author: 飞W1108
 * @date: 2020年1月3日 下午4:08:00
 */
public class NumberUtil {

	/**
	 * 
	 * @Title: isNumber
	 * @Description: 判断是否是数字
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean isNumber(String src) {
		String reg = "^(-)?[0-9]+(\\.[0-9]+)?$";
		return src.matches(reg);
	}
}
