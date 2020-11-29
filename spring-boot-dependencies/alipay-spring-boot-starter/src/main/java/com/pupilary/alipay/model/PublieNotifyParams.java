package com.pupilary.alipay.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author takesi
 * @date 2020-11-23
 */
@Data
public class PublieNotifyParams implements Serializable {

    private static final long serialVersionUID = 6089322768888557558L;

    /**
     * 通知校验ID
     */
    private String notifyId;

    /**
     * 通知时间
     */
    private Date notifyDate;

    /**
     * 通知类型
     */
    private String notifyType;

    /**
     * 编码格式
     */
    private String charset;

    /**
     * 签名
     */
    private String sign;

    /**
     * 签名类型
     */
    private String signType;

    /**
     * 授权方的app_id
     */
    private String authAppId;

    /**
     * 版本号
     */
    private String version;

}
