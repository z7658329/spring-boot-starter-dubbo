package io.tbud.spring.boot.starter.dubbo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by hanqingbin on 15/7/28.
 */
@Data
@Component
@ConfigurationProperties(prefix = "dubbo.provider")
public class DubboProvider {

    /**
     * 服务的超时时间,单位毫秒
     */
    private int timeout = 10000;

    /**
     * 调用失败重试次数
     */
    private int retries = 0;

    /**
     * 过滤器
     */
    private String filter;

    /**
     * 是否延迟暴露,-1表示不延迟暴露
     */
    private int delay = -1;
}
