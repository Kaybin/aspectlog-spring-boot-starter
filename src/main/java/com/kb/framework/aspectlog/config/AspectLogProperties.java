package com.kb.framework.aspectlog.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 配置文件模板
 *
 * @author huangkaibin
 * @date 2020/9/9 0009
 * @version 1.0.0
 **/
@ConfigurationProperties("aspectLog")
public class AspectLogProperties {

    private boolean enable;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}