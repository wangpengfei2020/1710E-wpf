package com.wangpengfei.util;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
	
	/*
	* 方法1：批量关闭流，参数能传无限个。(3分)
	* 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	*/
	public static void closeAll(AutoCloseable ... autoCloseable ){
		
		if(null !=autoCloseable) {
		   	for (AutoCloseable autoCloseable2 : autoCloseable) {
		   		try {
		   			//关闭流
					autoCloseable2.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		}
		
	
	}
	/*
	* 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	*/
	public static String readTextFile(InputStream src) throws IOException{
		
		ByteArrayOutputStream out =new ByteArrayOutputStream();
		
		byte[] b = new byte[1024]; 
		int i=0;
		while((i=src.read(b))!=-1) {
			out.write(b);
		}
		//关流
		closeAll(src,out);
		//以"UTF-8编码返回
	 return out.toString("UTF-8");
	
	}
	/*
	* 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，
	* 记住了吗？少年…
	*/
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException{
		
	 return 	readTextFile(new FileInputStream(txtFile));

	}
}
