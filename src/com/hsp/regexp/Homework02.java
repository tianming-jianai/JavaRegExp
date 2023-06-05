package com.hsp.regexp;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/6/5 22:06
 * @Description:
 */
public class Homework02 {

    public static void main(String[] args) {
        // 要求验证是不是整数或者小数
        // 提示：这个题要考虑整数和小数
        String content = "0.122";
        String regStr = "^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";
        // 整体匹配
        if (content.matches(regStr)) {
            System.out.println("匹配成功");
        } else {
            System.out.println("匹配失败");
        }
    }
}
