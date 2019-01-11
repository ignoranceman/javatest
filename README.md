### Github

1. 安装 Git

2. 注册 GitHub 账号，验证邮箱

3. 创建文件 .gitconfig 放在用户目录下

4. 创建项目，创建文件 .gitignore，把项目上传到 GitHub

   > VCS | Import Into Version Control | Share Project on GitHub

5. 检出项目

   > VCS | Checkout from Version Control | Git | URL| Clone | Create Project

6. 提交 Ctrl + K

7. 更新 Ctrl + T

###Day02

1. 什么是 Java 的关键字

# Java关键字

| abstract | assert     | boolean   |  break  | case         | byte       |
| :------: | ---------- | --------- | :-----: | ------------ | ---------- |
|  catch   | char       | class     |  const  | continue     | default    |
|  double  | else       | enum      | extends | final        | finally    |
|  float   | for        | goto      |   if    | import       | implements |
|   int    | instanceof | new       | native  | long         | interface  |
| package  | private    | protected | public  | return       | strictfp   |
|  short   | static     | super     | switch  | synchronized | this       |
|  throw   | throws     | transient |   try   | void         | volatile   |
|  while   |            |           |         |              |            |

2. Java SE 的所有数据类型

**byte**：Java中最小的数据类型，在内存中占8位(bit)，即1个字节，取值范围-128~127，默认值0

**short**：短整型，在内存中占16位，即2个字节，取值范围-32768~32717，默认值0

**int**：整型，用于存储整数，在内在中占32位，即4个字节，取值范围-2147483648~2147483647，默认值0

**long**：长整型，在内存中占64位，即8个字节-2^63~2^63-1，默认值0L

**float**：浮点型，在内存中占32位，即4个字节，用于存储带小数点的数字（与double的区别在于float类型有效小数点只有6~7位），默认值0

**double**：双精度浮点型，用于存储带有小数点的数字，在内存中占64位，即8个字节，默认值0

**char**：字符型，用于存储单个字符，占16位，即2个字节，取值范围0~65535，默认值为空

**boolean**：布尔类型，占1个字节，用于判断真或假（仅有两个值，即true、false），默认值false

