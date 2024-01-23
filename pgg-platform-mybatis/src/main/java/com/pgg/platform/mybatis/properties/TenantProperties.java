package com.pgg.platform.mybatis.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "tenant")
public class TenantProperties {

    /**
     * 是否开启租户模式
     */
    private Boolean enable;

    /**
     * 多租户字段名称
     */
    private String column;

    /**
     * 需要排除的多租户的表
     */
    private List<String> exclusionTable;
}
