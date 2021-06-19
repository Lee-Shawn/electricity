package com.laughing.electricity.member.feign;

import com.laughing.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : laughing
 * @create : 2021-06-19 18:31
 * @description : 远程调用服务接口
 */
@FeignClient("electricity-coupon") // 告诉 SpringCloud 这是一个远程客户端，调用 coupon 服务
public interface CouponFeignService {
    // 这里是直接复制优惠券服务中定义的方法签名
    // 会员优惠券服务
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupon();
}
