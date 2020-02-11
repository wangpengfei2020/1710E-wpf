package com.wangpengfei.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @ClassName: RandomUtil
 * @Description: TODO
 * @author: ��W1108
 * @date: 2020��1��3�� ����9:29:34
 */
public class RandomUtil {

	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
		public static char randomCharacter (){
			//穷举1-9,a-Z的字符
			String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		//	charAt(index).根据下标返回字符串的值
			return str.charAt(random(0, str.length()-1));
		}
		//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
		public static String randomString(int length){
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<length;i++) {
				sb.append(randomCharacter());
			}
			return sb.toString();
		}
		
		
		
		
		/**
		 * 
		 * @Title: subRandom 
		 * @Description: 方法2：在最小值min与最大值max之间截取subs个不重复的随机数。
		 * 例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，
		 * [3,5,5]则不对，因为5重复了。应用场景：
		 * 在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
		 * @param min
		 * @param max
		 * @param subs
		 * @return
		 * @return: int[]
		 */
		public static int[] subRandom (int min, int max, int subs){
			//定义数组
			int[] values= new int[subs];
			//用来存放不重复的数据
			Set<Integer> set = new HashSet<>();
			//如果set集合中数据和subs一致则跳出循环
			while (set.size()!=subs) {
				set.add(random(min, max));
			}
			
			//遍历set放入数组
			int j=0;
			for (Integer integer : set) {
				values[j]=integer;
				j++;
			}
			return values;
		
		}
		
		
		
		
		/**
		 * 
		 * @Title: random 
		 * @Description: 方法1：返回min-max之间的随机整数（包含min和max值），
		 * 例如返回1-3之间的随机数，那么返回1或2或3都是正确的，
		 * 返回4就不对。 (5分)
		 * @param min
		 * @param max
		 * @return
		 * @return: int
		 */                     
		public static int random(int min, int max){
			//实例化一个Random 类
			Random r = new Random();
			//nextInt 返回的是一个小于max的随机整数,如max=10.则范湖 0-9之间的数值
			return r.nextInt(max - min  + 1 )  +min;
			
		
		}

}
