package com.atguigu.gulimail.order.dao;

import com.atguigu.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author mashiro
 * @email 1016981796@qq.com
 * @date 2022-08-10 15:54:20
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
