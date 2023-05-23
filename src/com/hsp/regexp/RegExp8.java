package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/5/23 22:31
 * @Description: 非捕获分组
 */
public class RegExp8 {
    public static void main(String[] args) {
        String content = "hello韩顺平教育 jack韩顺平老师 韩顺平同学hello";
        // String regStr = "韩顺平教育|韩顺平老师|韩顺平同学";
        // 上面写法等价下面写法
        // String regStr = "韩顺平(?:教育|老师|同学)";


        // group(0)只输出前面的
        // String regStr = "韩顺平(?=教育|老师|同学)";

        String regStr = "韩顺平(?!教育|老师)";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }
    }
}
