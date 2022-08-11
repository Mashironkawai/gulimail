package com.atguigu.gulimail.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimail.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author mashiro
 * @email 1016981796@qq.com
 * @date 2022-08-10 15:54:20
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

