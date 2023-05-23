
> Video：https://www.bilibili.com/video/BV1Eq4y1E79W
> 
>Author：韩顺平

## 为什么要学习正则表达式

正则表达式是对字符串执行模式匹配的技术

正则表达式： regular expression -> RegExp





## 正则表达式语法

- 基本介绍

如果要想灵活的运用正则表达式，必须了解其中各种元字符的功能，元字符从功能上大致分为:

1. 限定符
2. 选择匹配符
3. 分组组合和反向引用符
4. 特殊字符
5. 字符匹配符
6. 定位符

> \符号说明:在我们使用正则表达式去检索某些特殊字符的时候，需要用到转义符号，否则检索不到结果，甚至会报错的。案例:用$去匹配' abc$(" 会怎样?用(去匹配"abc$(" 会怎样?

> 再次提示：Java中正则表达式中，两个\\表示其他语言中的一个\

### 元字符：转义符\\

需要用到转义符号的字符有以下：. * + ( ) $ / \ ? [ ] ^ { }

### 元字符-字符匹配符

| 符号 | 符号             | 示例   | 解释                    |
| ---- | ---------------- | ------ | ----------------------- |
| []   | 可接收的字符列表 | [efgh] | efgh中的任意一个字符    |
| [^]  | 不接收的字符列表 | [^abc] | 除abc之外的任意一个字符 |
| -    | 连字符           | A-Z    | 任意单个大写字母        |

![image-20230523210403681](img/image-20230523210403681.png)

### 应用实例：

1. [a-z]说明:

  [a-z]表示可以匹配a-z中任意-个字符 ,比如[a-z]、[A-Z] 去匹配a11c8会得到什么结果?

2. java正则表达式默认是区分字母大小写的，如何实现不区分大小写

- (?i)abc表示abc都不区分大小写
- a(?i)bc表示bc不区分大小写
- a((?i)b)c表示只有b不区分大小写
- Pattern pat = Pattern.compile(regEx, Pattern.CASE INSENSITIVE);

3. [^a-z]说明:
\[^a-z\]表示可以匹配不是a-z中的任意一个字符 ,比如
我们看看\[^a-z\]去匹配a11c8 会得到什么结果? 用\[^a-z\]{2}又会得到什么结果呢?
\[^ A-Z\]表示可以匹配不是A-Z中的任意一个字符。
\[^0-9\]表示可以匹配不是0-9中的任意一个字符。
这个就不举例说明了.

4. [abcd] 表示可以匹配abcd中的任意一个字符。
5. \[^ abcd\]表示可以匹配不是abcd中的任意-个字符。
  当然上面的abcd你可以根据实际情况修改,以适应你的需求
6. \ld表示可以匹配0-9的任意一个数字,相当于 [0-9]。
7. \\\D表示可以四配不是0-9中的任意一个数字,相当于\[^0-9\]
8. \\\w匹配任意英文字符、数字和下划线,相当于[a-zA-Z0-9 ]
9. \\W相当于\[^a-zA-Z0-9 \]是\w刚好相反
10. \\\s匹配任何空白字符(空格,制表符等)
11. \\S匹配任何非空白字符,和\s刚好相反
12. 匹配出\n之外的所有字符,如果要匹配.本身则需要使用\\\\.

### 元字符-选择匹配符

在匹配某个字符串的时候是选择性的，即:既可以匹配这个，又可以匹配那个，这时你需要用到选择匹配符号 |

| 符号 | 符号                     | 示例   | 解释   |
| ---- | ------------------------ | ------ | ------ |
| \|   | 匹配\|之前或之后的表达式 | ab\|cd | ab或cd |

### 元字符-限定符

用于指定其前面的字符和组合项连续出现多少次

![image-20230523215715484](img/image-20230523215715484.png)

![image-20230523220454938](img/image-20230523220454938.png)

细节：java匹配默认贪婪匹配，即尽可能匹配多的

![image-20230523220224253](img/image-20230523220224253.png)

![image-20230523220300898](img/image-20230523220300898.png)

### 元字符-定位符

![image-20230523220604702](img/image-20230523220604702.png)

### 分组

![image-20230523222151996](img/image-20230523222151996.png)

