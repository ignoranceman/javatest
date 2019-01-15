package demo.day05;

/**
 * 集合
 * <p>
 * String
 */
public class StringTest {

    public static void main(String[] args) {
        String student = "Tom";
        // 1. 构造方法
        // 选择 3 个构造方法创建一个 String 实例
        String s1 = new String();
        System.out.println(s1);
        // 2. 成员方法
        // 调用一个成员方法
//        charAt返回 char指定索引处的值。
        System.out.println("charAt : " + student.charAt(0));
//        concat abbr of concatenate [kɒn'kætɪneɪt]将指定的字符串连接到该字符串的末尾。
        String s2 = "Hello ";
        System.out.println("concat : " + s2.concat("world"));
//        contains当且仅当此字符串包含指定的char值序列时才返回true。
        System.out.println("contains : " + student.contains("o"));
//        endsWith测试此字符串是否以指定的后缀结尾。
        System.out.println("endsWith : " + student.endsWith("m"));
//       equals将此字符串与指定对象进行比较。
        System.out.println("equals : " + student.equals("Tom"));
//        equalsIgnoreCase将此 String与其他 String比较
        String s3 = "Tom";
        System.out.println("equalsIgnoreCase : " + student.equalsIgnoreCase(s3));
//        getBytes使用平台的默认字符集将此 String编码为字节序列，将结果存储到新的字节数组中。
        System.out.println("getBytes : " + student.getBytes());
//        indexOf返回指定子字符串第一次出现的字符串内的索引。
        System.out.println("indexOf : " + student.indexOf(student));
//        isEmpty返回 true如果，且仅当 length()为 0 。
        System.out.println("isEmpty : " + student.isEmpty());
//        lastIndexOf返回指定子字符串的最后一次出现的字符串中的索引，从指定索引开始向后搜索。
        System.out.println("lastIndexOf : " + student.lastIndexOf(student));
//        length返回此字符串的长度。
        System.out.println("length : " + student.length());
//        matches告诉这个字符串是否匹配给定的正则表达式。
        System.out.println("matches : " + student.matches(s3));
//        replace将与字面目标序列匹配的字符串的每个子字符串替换为指定的字面替换序列
        char s4 = 'a';
        char s5 = 'b';
        System.out.println("replace : " + s3.replace(s4, s5));
//        replaceAll用给定的替换与给定的正则表达式匹配的此字符串的每个子字符串。
        System.out.println("replaceAll : " + s1.replaceAll(s1, s2));
//        replaceFirst用给定的替换与给定的正则表达式匹配的此字符串的第一个字符。
        System.out.println("replaceFirst : " + s1.replaceFirst(s1, s2));
//        split将此字符串分割为给定的 regular expression的匹配。
        System.out.println("split : " + student.split(s1));
//        startWith测试此字符串是否以指定的前缀开头。
        System.out.println("startWith : " + student.startsWith("T"));
//        subString返回一个字符串，该字符串是此字符串的子字符串。
        System.out.println("subString : " + student.substring(0));
//        toCharArray将此字符串转换为新的字符数组。
        System.out.println("toCharArray : " + student.toCharArray());
//        toLowerCase将所有在此字符 String使用默认语言环境的规则，以小写。
        System.out.println("toLowerCase : " + student.toLowerCase());
//        toUpperCase将所有在此字符 String使用默认语言环境的规则，以大写。
        System.out.println("toUpperCase : " + student.toUpperCase());
//        trim返回一个字符串，其值为此字符串，并删除任何前导和尾随空格。
        String s6 = "  a b c d  ";
        System.out.println("trim : " + student.length());
//        valueOf返回 char数组参数的字符串 char形式。
        char[] chars = {'a', 'b', 'c'};
        System.out.println("valueOf : " + student.valueOf(chars));
    }
}
