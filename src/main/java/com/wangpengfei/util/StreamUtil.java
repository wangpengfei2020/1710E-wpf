package com.wangpengfei.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: StreamUtil
 * @Description: TODO
 * @author: ������
 * @date: 2020��1��3�� ����4:09:48
 */
public class StreamUtil {

	/**
	 * 
	 * @Title: readLine
	 * @Description: ��ȡ�ļ�
	 * @param ins
	 * @return
	 * @return: List<String>
	 */
	public static List<String> readLine(InputStream in) {
		List<String> list = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String str = null;
		try {
			while ((str = reader.readLine()) != null) {
				list.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
