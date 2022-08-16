package com.atguigu.gulimail.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("gulimail-coupon")
public interface MemberFeignService {

    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();

}
