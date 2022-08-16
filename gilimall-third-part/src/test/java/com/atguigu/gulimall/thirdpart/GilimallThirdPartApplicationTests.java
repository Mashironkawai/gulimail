package com.atguigu.gulimall.thirdpart;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GilimallThirdPartApplicationTests {
	@Autowired
	OSSClient ossClient;
	@Test
	void testUpload()throws FileNotFoundException {
		InputStream inputStream = new FileInputStream("F:\\大姐\\ll.jpg");
		ossClient.putObject("gulimall-mashiros","ll.jpg",inputStream);
	}

}
