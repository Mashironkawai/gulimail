package com.atguigu.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author mashiro
 * @email 1016981796@qq.com
 * @date 2022-08-10 10:53:10
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

