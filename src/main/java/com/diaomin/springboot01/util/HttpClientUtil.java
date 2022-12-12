package com.diaomin.springboot01.util;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.util.Map;

public class HttpClientUtil {
    public static String doGet(String url, Map<String, String> param) {
        CloseableHttpClient httpclient = HttpClients.createDefault();//创建请求
        String resultString = "";//响应接收的数据
        CloseableHttpResponse response = null;//定义响应
        try {
            URIBuilder builder = new URIBuilder(url);//请求地址创建器
            if (param != null && !param.isEmpty()) {//是否有参数
                for (String key : param.keySet()) {//遍历参数
                    builder.addParameter(key, param.get(key));//放进地址
                }
            }
            URI uri = builder.build();//创建uri对象

            HttpGet httpGet = new HttpGet(uri);//根据地址创建请求

            response = httpclient.execute(httpGet);//执行请求
            if (response.getStatusLine().getStatusCode() == 200) {//判断响应状态
                resultString = EntityUtils.toString(response.getEntity(), "UTF-8");//转换响应实体
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return resultString;
    }

    public static String doGet(String url) {
        return doGet(url, null);
    }
}
