package com.wangpengfei.util;

import java.util.HashSet;
import java.util.Random;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: TODO
 * @author: charles
 * @date: 2020��1��2�� ����10:10:04
 */
public class RandomUtil {

	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	
	public static int random(int min, int max){
		
		Random r = new Random();
		int num = r.nextInt(max -min +1) +min;
		//System.out.println(num);
		return num;
		
	}
	//����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ��� (8��)
	public static int[] subRandom (int min, int max, int subs){
		int[] x =new int[subs];//��������������Ž��ֵ
		
		HashSet<Integer> set = new HashSet<Integer>();
		while(set.size()!=subs) {
			set.add(random(min, max));
		}
		
	
		int i=0;
		for (Integer integer : set) {	//��set���Ϸ���������
			x[i]=integer;
			i++;
		}
		return x;
		
		
	}
	//����3������1��1-9,a-Z֮�������ַ��� (8��)
	public static char randomCharacter (){
		String str="123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		return str.charAt(random(0, str.length()-1));
	}
	//����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
	public static String randomString(int length){
		String str="";
		 for(int i =0 ;i<length; i++) {
			str+= randomCharacter();
		 }
		return str;
	}

	
}
