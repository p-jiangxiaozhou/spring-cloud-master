package com.pupilary.alipay.properties;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * @author takesi
 * @date 2020-11-21
 */
@Getter
@ConfigurationProperties(prefix = "spring.alipay")
public class AlipayProperties implements Serializable {

    private static final long serialVersionUID = 6344794809181880181L;

    private String appId;

    /**
     * 应用私钥
     */
    private String merchantPrivateKey;

    /**
     * 应用公钥证书文件路径
     * 证书文件路径支持设置为文件系统中的路径或CLASS_PATH中的路径，优先从文件系统中加载，加载失败后会继续尝试从CLASS_PATH中加载
     */
    private String merchantCertPath;

    /**
     * 应用公钥证书文件路径
     */
    private String alipayCertPath;

    /**
     * 支付宝根证书文件路径
     */
    private String alipayRootCertPath;

    /**
     * 如果采用非证书模式，则无需赋值上面的三个证书路径，改为赋值如下的支付宝公钥字符串即可
     */
    private String alipayPublicKey;

    /**
     * 异步通知接收服务地址
     */
    private String notifyUrl;

    /**
     * AES密钥，调用AES加解密相关接口时需要
     */
    private String encryptKey;

    private String protocol = "https";

    private String gatewayHost = "openapi.alipay.com";

    private String signType = "RSA2";

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public void setMerchantPrivateKey(String merchantPrivateKey) {
        this.merchantPrivateKey = merchantPrivateKey;
    }

    public void setMerchantCertPath(String merchantCertPath) {
        this.merchantCertPath = merchantCertPath;
    }

    public void setAlipayCertPath(String alipayCertPath) {
        this.alipayCertPath = alipayCertPath;
    }

    public void setAlipayRootCertPath(String alipayRootCertPath) {
        this.alipayRootCertPath = alipayRootCertPath;
    }

    public void setAlipayPublicKey(String alipayPublicKey) {
        this.alipayPublicKey = alipayPublicKey;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setGatewayHost(String gatewayHost) {
        this.gatewayHost = gatewayHost;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }
}
