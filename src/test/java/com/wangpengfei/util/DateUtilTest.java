package com.wangpengfei.util;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.wangpengfei.util.DateUtil;

public class DateUtilTest {

	@Test
	public void testRandomDate() {
		// System.out.println(new Date(0));
		// System.out.println(new Date());

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (int i = 0; i < 1000; i++) {
			Date date = DateUtil.randomDate(new Date(0), new Date());
			System.out.println(df.format(date));

		}

	}

	@Test
	public void testInitMonth() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtil.initMonth(new Date());
		System.out.println(df.format(date));
	}

	@Test
	public void testEndMonth() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = DateUtil.endMonth(new Date());
		System.out.println(df.format(date));
	}

}
