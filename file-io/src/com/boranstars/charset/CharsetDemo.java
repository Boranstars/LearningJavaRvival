package com.boranstars.charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharsetDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String name = "莫妮卡Monika";
        // 编码
        byte[] bytes = name.getBytes("GBK"); // 以GBK编码，不填默认和平台一致
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        // 解码
        String gbkDecode = new String(bytes, "GBK");
        System.out.println(gbkDecode);
        String utf8Decode = new String(bytes, "UTF-8");
        System.out.println(utf8Decode);
    }
}
