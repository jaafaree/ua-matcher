package com.github.jaafaree.uamatcher.utils;


import com.github.jaafaree.uamatcher.UAMatcher;
import com.github.jaafaree.uamatcher.entity.Device;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;

/**
 * ${DESCRIPTION}
 *
 * @author jaafaree
 * @create 2018/2/23 9:42
 */
@Slf4j
public final class ClientUtil {

    public static Device getDeviceInfo (HttpServletRequest request, UAMatcher uaMatchers) {
        String userAgent = request.getHeader("user-agent");
        if(userAgent == null || userAgent.equals("")){
            log.warn("request header field: 'user-agent' not found.");
            return null;
        }
        try {
            return new Device(userAgent, uaMatchers);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            log.warn("request device info matcher error.");
            e.printStackTrace();
        }
        return null;
    }
}
