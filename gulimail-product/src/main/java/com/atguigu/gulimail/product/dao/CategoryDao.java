package com.atguigu.gulimail.product.dao;

import com.atguigu.gulimail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author mashiro
 * @email 1016981796@qq.com
 * @date 2022-08-10 14:14:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
