package com.pgg.platform.cloud.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfig {
    /**
     * 负载均衡策略配置（仅测试使用，线上应使用NacosRule）
     * @return
     */
    @Bean
    public IRule rule(){
        //随机策略  从所有可用的提供者中随机选择一个
        return new RandomRule();
    }
}
