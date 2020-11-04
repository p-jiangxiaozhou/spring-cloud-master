package com.pupilary.core.security.handler;

import cn.hutool.core.util.StrUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pupilary.base.wrapper.WrapMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author zlt
 * @date 2020/3/10
 * <p>
 * Blog: https://blog.csdn.net/zlt2000
 * Github: https://github.com/zlt2000
 */
public class OauthLogoutSuccessHandler implements LogoutSuccessHandler {

    private final RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException {
        String redirectUri = request.getParameter("redirect_uri");
        if (StrUtil.isNotEmpty(redirectUri)) {
            //重定向指定的地址
            redirectStrategy.sendRedirect(request, response, redirectUri);
        } else {
            response.setStatus(HttpStatus.OK.value());
            response.setCharacterEncoding("UTF-8");
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            PrintWriter writer = response.getWriter();
            String jsonStr = objectMapper.writeValueAsString(WrapMapper.ok("登出成功"));
            writer.write(jsonStr);
            writer.flush();
        }
    }
}
