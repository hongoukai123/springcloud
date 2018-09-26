package com.kai.springcloudchapter6;

import com.kai.springcloudchapter6.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringcloudChapter6ApplicationTests {

	@Autowired
	RedisDao redisDao;

	@Test
	public void testRedis(){
		redisDao.setKey("name", "hok");
		redisDao.setKey("age", "18");
		System.out.println(redisDao.getValue("name"));
		System.out.println(redisDao.getValue("age"));
	}

	@Test
	public void contextLoads() {
	}

}
