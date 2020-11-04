package com.pupilary.core.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.cglib.core.Converter;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author takesi
 * @date 2020-10-28
 */
public class BeanUtils {

    private static final Logger logger = LoggerFactory.getLogger(BeanUtils.class);
    private static final Map<String, BeanCopier> BEAN_COPIERS = new HashMap<>();

    public static <T> T copyProperties(Objects source, Class<T> target) {
        try {
            T newInstance = target.getDeclaredConstructor().newInstance();
            copyProperties(source, newInstance);
            return newInstance;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    public static void copyProperties(Object srcObj, Object targetObj) {
        copyProperties(srcObj, targetObj, false, null);
    }

    public static void copyProperties(Object srcObj, Object targetObj, Boolean useConverter, Converter converter) {
        String key = genKey(srcObj.getClass(), targetObj.getClass());
        BeanCopier copier;

        if (!BEAN_COPIERS.containsKey(key)) {
            copier = BeanCopier.create(srcObj.getClass(), targetObj.getClass(), useConverter);
            BEAN_COPIERS.put(key, copier);
        } else {
            copier = BEAN_COPIERS.get(key);
        }
        copier.copy(srcObj, targetObj, converter);
    }

    private static String genKey(Class<?> srcClazz, Class<?> destClazz) {
        return srcClazz.getName() + destClazz.getName();
    }

}
