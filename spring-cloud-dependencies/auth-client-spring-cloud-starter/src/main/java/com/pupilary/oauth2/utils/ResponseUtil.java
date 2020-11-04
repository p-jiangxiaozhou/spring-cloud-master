package com.pupilary.oauth2.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pupilary.base.wrapper.WrapMapper;
import com.pupilary.base.wrapper.Wrapper;
import org.springframework.http.MediaType;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;

/**
 * @author takesi
 * @date 2020-10-07
 */
public class ResponseUtil {

    private ResponseUtil() {
        throw new IllegalStateException("ResponseUtil class");
    }

    public static void writer(ObjectMapper objectMapper, HttpServletResponse response, String message, int status) throws IOException {
        response.setStatus(status);
        Wrapper<String> wrapper = WrapMapper.wrap(status, message);
        writer(objectMapper, response, wrapper);
    }

    public static <T> void writer(ObjectMapper objectMapper, HttpServletResponse response, Wrapper<T> wrapper) throws IOException {
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        try (Writer writer = response.getWriter()) {
            writer.write(objectMapper.writeValueAsString(wrapper));
        }
    }

}
