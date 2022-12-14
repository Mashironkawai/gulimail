package com.atguigu.gulimail.product;

//import com.atguigu.gulimail.product.dao.AttrAttrgroupRelationDao;
//import com.atguigu.gulimail.product.dao.AttrGroupDao;
//import com.atguigu.gulimail.product.dao.SkuSaleAttrValueDao;
//import com.atguigu.gulimail.product.entity.AttrAttrgroupRelationEntity;
//import com.atguigu.gulimail.product.entity.AttrEntity;
//import com.atguigu.gulimail.product.entity.BrandEntity;
//import com.atguigu.gulimail.product.service.AttrService;
//import com.atguigu.gulimail.product.service.BrandService;
//import com.atguigu.gulimail.product.service.CategoryService;
//import com.atguigu.gulimail.product.service.SkuInfoService;
//import com.atguigu.gulimail.product.vo.skuItemvo.SkuItemSaleAttrsVo;
//import com.atguigu.gulimail.product.vo.skuItemvo.SkuItemVo;
//import com.atguigu.gulimail.product.vo.skuItemvo.SpuItemAttrGroupVo;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.aliyun.oss.*;
import com.atguigu.gulimail.product.entity.BrandEntity;
import com.atguigu.gulimail.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.StringRedisTemplate;
//import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimailProductApplicationTests {
	@Autowired
	private BrandService brandService;

	@Autowired
	OSSClient ossClient;

	@Test
	public void test(){
//		// Endpoint?????????1???????????????????????????Region???????????????????????????
//		String endpoint = "https://oss-cn-hangzhou.aliyuncs.com";
//		// ???????????????AccessKey????????????API???????????????????????????????????????????????????????????????RAM????????????API?????????????????????????????????RAM???????????????RAM?????????
//		String accessKeyId = "LTAI5tCobhppRfGKAfQHd2Cw";
//		String accessKeySecret = "wwjb3RdcT4eALmw1D7jq1QeT4RqUEP";
//		// ??????Bucket???????????????examplebucket???
//		String bucketName = "gulimall-mashiros";
//		// ??????Object??????????????????????????????????????????Bucket???????????????exampledir/exampleobject.txt???
//		String objectName = "h.png";
//		// ??????????????????????????????????????????D:\\localpath\\examplefile.txt???
//		// ?????????????????????????????????????????????????????????????????????????????????????????????????????????
//		String filePath= "F:\\??????\\h.png";
//
//		// ??????OSSClient?????????
//		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

		// ??????????????????
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream("F:\\??????\\2.png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ossClient.putObject("gulimall-mashiros", "2.png", inputStream);
		System.out.println("????????????");

// ??????OSSClient???
		ossClient.shutdown(); }



	@Test
	public void contextloads(){

		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", "1L"));
		list.forEach((item)->{
			System.out.println(item);
		});
	}


//	@Autowired
//	OSSClient ossClient;

//	@Autowired
//	private CategoryService categoryService;
//
//	@Autowired
//	private BrandService brandService;
//
//	@Autowired
//	private AttrService attrService;
//
//	@Autowired
//	private AttrAttrgroupRelationDao relation;
//
//	@Autowired
//	private SkuInfoService skuInfoService;
//
//	@Autowired
//	private StringRedisTemplate stringRedisTemplate;
//
//	@Autowired
//	private AttrGroupDao attrGroupDao;
//
//	@Autowired
//	private SkuSaleAttrValueDao skuSaleAttrValueDao;
//
//	@Test
//	void testUpload02() throws FileNotFoundException{
////		// Endpoint????????????????????????Region???????????????????????????
////		String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
////// ?????????AccessKey?????????API????????????????????????????????????????????????????????????????????????RAM???????????????API????????????????????????????????? https://ram.console.aliyun.com ?????????
////		String accessKeyId = "<yourAccessKeyId>";
////		String accessKeySecret = "<yourAccessKeySecret>";
//
//// ??????OSSClient?????????
////		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//// ??????????????????
//		InputStream inputStream = new FileInputStream("D:\\picture\\02n.jpg");
//		ossClient.putObject("gulimall-adverseq", "02n.jpg", inputStream);
//
//// ??????OSSClient???
//		ossClient.shutdown();
//	}
}
