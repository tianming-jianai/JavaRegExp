package com.hsp.regexp;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/6/5 21:10
 * @Description:
 */
public class RegExp14 {

    public static void main(String[] args) {
        // JDK1.3 JDK1.4 统一替换为JDK
        String content = "JDK1.3 JDK1.4";
        String res = content.replaceAll("JDK1\\.[34]", "JDK");
        System.out.println(res);

        // 138或139开头的手机号
        content = "13822288872";
        if (content.matches("^13(8|9)\\d{8}")) {
            System.out.println("验证成功");
        } else {
            System.out.println("验证失败");
        }

        // 按照#或者-或者~或者数字来分割
        content = "hello#abc-jack12smith~北京";
        String[] split = content.split("#|-|~|\\d+");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
