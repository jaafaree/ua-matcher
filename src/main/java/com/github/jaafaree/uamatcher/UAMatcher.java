package com.github.jaafaree.uamatcher;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

/**
 * ${DESCRIPTION}
 *
 * @author jaafaree
 * @create 2018/4/17 14:30
 */
@Component
public class UAMatcher implements CommandLineRunner {

    @Value(value="classpath:uamatchers.json")
    private Resource resource;

    private Map<String, List<Map<String, String>>> matchers;

    private UAMatcher() {
    }

    public Map<String, List<Map<String, String>>> getMatchers() {
        return matchers;
    }

    @Override
    public void run(String... strings) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(resource.getInputStream()));
            StringBuilder message=new StringBuilder();
            String line = null;
            while((line = br.readLine()) != null) {
                message.append(line);
            }
            String result = message.toString().replace("\r\n", "");
            this.matchers = JSONObject.fromObject(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
