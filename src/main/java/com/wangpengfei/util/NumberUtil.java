package com.wangpengfei.util;

/**
 * }
 * 
 * @ClassName: NumberUtil
 * @Description: TODO
 * @author: ��W1108
 * @date: 2020��1��3�� ����4:08:00
 */
public class NumberUtil {

	/**
	 * 
	 * @Title: isNumber
	 * @Description: �ж��Ƿ�������
	 * @param src
	 * @return
	 * @return: boolean
	 */
	public static boolean isNumber(String src) {
		String reg = "^(-)?[0-9]+(\\.[0-9]+)?$";
		return src.matches(reg);
	}
}
