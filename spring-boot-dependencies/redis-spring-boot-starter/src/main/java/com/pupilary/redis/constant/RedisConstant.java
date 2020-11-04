package com.pupilary.redis.constant;

/**
 * redis 工具常量
 *
 * @author zlt
 * @date 2018/5/21 11:59
 */
public class RedisConstant {
    private RedisConstant() {
        throw new IllegalStateException("Utility class");
    }
    /**
     * single Redis
     */
    public final static int SINGLE = 1 ;

    /**
     * Redis cluster
     */
    public final static int CLUSTER = 2 ;
}
