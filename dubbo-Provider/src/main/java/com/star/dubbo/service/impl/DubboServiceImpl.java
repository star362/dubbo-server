package com.star.dubbo.service.impl;


import com.star.dubbo.service.IDubboService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Description: <br>
 * Create Date: 2022/5/10 下午8:48 <br>
 *
 * @author wangyu@mvtech.com.cn
 */
@DubboService(version = "1.0.0",group = "DEV")
//    @Service
public class DubboServiceImpl implements IDubboService {
}