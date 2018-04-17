package com.github.jaafaree.uamatcher.rest;

import com.github.jaafaree.uamatcher.UAMatcher;
import com.github.jaafaree.uamatcher.entity.Device;
import com.github.jaafaree.uamatcher.utils.ClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * ${DESCRIPTION}
 *
 * @author jaafaree
 * @create 2018/4/17 15:32
 */
@RestController
@RequestMapping("/device")
public class HttpDeviceInfoController {
    @Autowired
    private UAMatcher uaMatcher;
    @GetMapping
    public String getDeviceInfo(HttpServletRequest request) {
        Device device = ClientUtil.getDeviceInfo(request, uaMatcher);
        return device.toString();
    }
}
