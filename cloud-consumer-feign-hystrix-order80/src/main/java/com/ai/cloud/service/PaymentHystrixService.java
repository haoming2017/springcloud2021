package com.ai.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@Service
@FeignClient
public interface PaymentService {
    //成功
    public String paymentInfo_OK(Integer id);
    //失败
    public String paymentInfo_TimeOut(Integer id);
}
