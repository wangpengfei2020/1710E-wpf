package com.wangpengfei.util;
/**
 * 
 * @ClassName: NumberUtil 
 * @Description: TODO
 * @author: charles
 * @date: 2020��1��3�� ����10:23:15
 */
public class NumberUtil {

	/**
	 * 
	 * @Title: isNumber 
	 * @Description: �ж��Ƿ������֣���������С����������
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean isNumber(String src) {
		String reg ="^(-)?[0-9]+(\\.[0-9]+)?$";
		return src.matches(reg);
	}

	
}
