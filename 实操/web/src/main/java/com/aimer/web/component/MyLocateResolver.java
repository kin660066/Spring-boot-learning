package com.aimer.web.component;

import org.apache.tomcat.jni.Local;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocateResolver implements LocaleResolver {
    /*
    国际化处理
     */
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String l =request.getParameter("a");
        Locale local=Locale.getDefault();
        if (!StringUtils.isEmpty(l)){
            String []a=l.split("-");
            local =new Locale(a[0],a[1]);
        }
        return local;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
