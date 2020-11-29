package com.pupilary.alipay;

import com.alipay.easysdk.factory.Factory;
import com.alipay.easysdk.kernel.Config;
import com.pupilary.alipay.properties.AlipayProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @author takesi
 * @date 2020-11-20
 */
@EnableConfigurationProperties(AlipayProperties.class)
public class AlipayAutoConfiguer implements CommandLineRunner {

    @Autowired
    private AlipayProperties alipayProperties;

    @Override
    public void run(String... args) throws Exception {
        // 设置参数（全局只需设置一次
        Config config = getOptions(alipayProperties);
        Factory.setOptions(config);
    }

    private static Config getOptions(AlipayProperties alipayProperties) {
        Config config = new Config();
        config.protocol = alipayProperties.getProtocol();
        config.gatewayHost = alipayProperties.getGatewayHost();
        config.signType = alipayProperties.getSignType();
        config.appId = alipayProperties.getAppId();
        config.merchantPrivateKey = alipayProperties.getMerchantPrivateKey();
        config.merchantCertPath = alipayProperties.getMerchantCertPath();
        config.alipayCertPath = alipayProperties.getAlipayCertPath();
        config.alipayRootCertPath = alipayProperties.getAlipayRootCertPath();
        config.alipayPublicKey = alipayProperties.getAlipayPublicKey();
        config.notifyUrl = alipayProperties.getNotifyUrl();
        config.encryptKey = alipayProperties.getEncryptKey();
        return config;
    }
}
