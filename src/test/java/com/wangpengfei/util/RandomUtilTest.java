package com.wangpengfei.util;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wangpengfei.util.RandomUtil;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i <50; i++) {
			RandomUtil.random(1, 3);
		}
	}

	@Test
	public void testSubRandom() {
		RandomUtil.subRandom(1, 10, 3);
	}

	@Test
	public void testRandomCharacter() {
	
	}

	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(6);
		System.out.println(string);
	}

}
