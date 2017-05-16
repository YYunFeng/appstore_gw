package com.jd.appstore.gateway.domain.util;

import com.google.gson.Gson;
import com.jd.appstore.gateway.domain.dao.PhoneImeis;
import com.jd.appstore.gateway.domain.obj.ActivationObj;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YYF on 2014/11/3.
 */
public class Activation {
    // 接口地址
    public static final String ADD_URL = "http://gw.appstore.taotaojing.cn/inc/createActivation.action";

    public static void main(String args[]) {
        try {
            //创建连接
            URL url = new URL(ADD_URL);
            HttpURLConnection connection = (HttpURLConnection) url
                    .openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setRequestMethod("POST");
            connection.setUseCaches(false);
            connection.setInstanceFollowRedirects(true);
            // 这里务必设置成 Content-Type：application/json，否则服务器接受不到数据
            connection.setRequestProperty("Content-Type",
                    "application/json");

            connection.connect();

            //POST请求
            DataOutputStream out = new DataOutputStream(
                    connection.getOutputStream());

            // 开始生成JSON文件，这里使用了GSON，作用就是将ActivationObj该类转换成JSON
            ActivationObj activationObj = new ActivationObj();
            activationObj.setAppid("500001234");
            List<PhoneImeis> phoneImeises = new ArrayList<PhoneImeis>();
            PhoneImeis phoneImeis = new PhoneImeis();
            phoneImeis.setPhoneImei("1122332322");
            phoneImeis.setActivationTime("2014-10-12 12:11:32");
            phoneImeises.add(phoneImeis);
            activationObj.setPhoneImeiObjs(phoneImeises);

            Gson gson = new Gson();
            System.out.println(gson.toJson(activationObj).toString());
            out.writeBytes(gson.toJson(activationObj).toString());
            out.flush();
            out.close();

            //读取服务器响应响应
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String lines;
            StringBuffer sb = new StringBuffer("");
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                sb.append(lines);
            }
            System.out.println(sb);
            reader.close();
            // 断开连接
            connection.disconnect();
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
