package com.wangpengfei.util;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil
 * @Description: TODO
 * @author: ��W1108
 * @date: 2020��1��3�� ����4:06:36
 */
public class DateUtil {

	// ��ȡһ���µ��³� �� ��2020-01-01 00:00:00
	public static Date initMonth(Date date) {
		// ��ȡһ��������
		Calendar c = Calendar.getInstance();
		// �ô�������ڳ�ʼ������
		c.setTime(date);

		c.set(Calendar.DAY_OF_MONTH, 1);// ����Ϊ��ǰ���ڵĵ�һ��
		c.set(Calendar.HOUR_OF_DAY, 0);// ����Сʱ
		c.set(Calendar.MINUTE, 0);// ����
		c.set(Calendar.SECOND, 0);// ��
		return c.getTime();

	}

	// ����һ������ĩ
	// ˼·�� ���¼�1 ���ٱ���³�������ȥ1��
	public static Date endMonth(Date date) {

		Calendar c = Calendar.getInstance();
		c.setTime(date);
		// ���·�+1
		c.add(Calendar.MONTH, 1);
		// ��ʱ�����³�
		Date initMonth = initMonth(c.getTime());
		c.setTime(initMonth);
		// �����ڼ�ȥ1
		c.add(Calendar.SECOND, -1);
		return c.getTime();

	}

	/**
	 * 
	 * @Title: getAgeByBirthday
	 * @Description: ʹ�������� ���� �����ݳ�������������
	 * @param date
	 * @return
	 * @return: int
	 */
	// 2020-02-02 2000-03-03
	public static int getAgeByBirthday(Date date) {
		// ��ϵͳʱ���ȡ������
		Calendar c = Calendar.getInstance();
		int s_year = c.get(Calendar.YEAR);// ��ȡϵͳ����
		int s_month = c.get(Calendar.MONTH);// ��ȡϵͳ����
		int s_day = c.get(Calendar.DAY_OF_MONTH);// ��ȡϵͳ����

		// �ô�������ڳ�ʼ��һ��������
		c.setTime(date);
		int b_year = c.get(Calendar.YEAR);// ��ȡ�������ڵ���
		int b_month = c.get(Calendar.MONTH);// ��ȡ�������ڵ���
		int b_day = c.get(Calendar.DAY_OF_MONTH);// ��ȡ�������ڵ���

		int age = s_year - b_year;// ��ϵͳ�� -������

		if (s_month < b_month)// ���ϵͳ��С�ڳ����������һ
			age--;
		if (s_month == b_month && s_day < b_day)// ���ϵͳ�ºͳ�ʼ��һ�²���ϵͳ��С�ڳ����� �����һ
			age--;
		return age;

	}

	/*  返回月末
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		//用传入的日期,初始化日历类. 然后让当前日期设置为下个月的月初,最后在
		//月初减去 1秒.  就能变成传入日期的月末了
		
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		//让当前月份加1
		c.add(Calendar.MONTH, 1);
		//获取月初
		Date monthStart = getDateByInitMonth(c.getTime());
		//用月初初始化日历类
		c.setTime(monthStart);
		//用月初时间  -1 秒
		c.add(Calendar.SECOND, -1);
		
		return  c.getTime();
		
	}
	
	
	
	/*返回月初
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	* 
	*/
	public static Date getDateByInitMonth(Date src){
	
		
	    //获取Calendar对象
		Calendar c = Calendar.getInstance();
		  //用传入的时间初始化日历对象
		c.setTime(src);
		
		//改变日期的 日,时,分.秒
		
		c.set(Calendar.DATE, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
		
	}
	
	
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 返回在某个日期区间的随机日期
	 * @param startDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate) {
		//用当前时间获取日历类
		Calendar c = Calendar.getInstance();
		//当前时间的毫秒值..  即从1970到现在的毫米数
		long endMillis = c.getTimeInMillis();
	//	System.out.println("endMillis="+endMillis);
		
		//用传入的日期初始化日历类Calendar
		
		c.setTime(startDate);
		//获取开始时间的毫米数
		long startMillis = c.getTimeInMillis();
	//	System.out.println("startMillis="+startMillis);
		
		 long x = (long)( Math.random() * (endMillis - startMillis  +1)) + startMillis;
		//	System.out.println("x="+x);
		 
	//用时间差创建日历类
		 c.setTimeInMillis(x);
		
		return  c.getTime();
	}
}
