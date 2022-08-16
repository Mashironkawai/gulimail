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
//		// Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//		String endpoint = "https://oss-cn-hangzhou.aliyuncs.com";
//		// 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//		String accessKeyId = "LTAI5tCobhppRfGKAfQHd2Cw";
//		String accessKeySecret = "wwjb3RdcT4eALmw1D7jq1QeT4RqUEP";
//		// 填写Bucket名称，例如examplebucket。
//		String bucketName = "gulimall-mashiros";
//		// 填写Object完整路径，完整路径中不能包含Bucket名称，例如exampledir/exampleobject.txt。
//		String objectName = "h.png";
//		// 填写本地文件的完整路径，例如D:\\localpath\\examplefile.txt。
//		// 如果未指定本地路径，则默认从示例程序所属项目对应本地路径中上传文件流。
//		String filePath= "F:\\大姐\\h.png";
//
//		// 创建OSSClient实例。
//		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

		// 上传文件流。
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream("F:\\大姐\\2.png");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ossClient.putObject("gulimall-mashiros", "2.png", inputStream);
		System.out.println("上传完成");

// 关闭OSSClient。
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
////		// Endpoint以杭州为例，其它Region请按实际情况填写。
////		String endpoint = "http://oss-cn-hangzhou.aliyuncs.com";
////// 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
////		String accessKeyId = "<yourAccessKeyId>";
////		String accessKeySecret = "<yourAccessKeySecret>";
//
//// 创建OSSClient实例。
////		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//
//// 上传文件流。
//		InputStream inputStream = new FileInputStream("D:\\picture\\02n.jpg");
//		ossClient.putObject("gulimall-adverseq", "02n.jpg", inputStream);
//
//// 关闭OSSClient。
//		ossClient.shutdown();
//	}
}
