package javatest;

/**
 * @Description:
 * @Author: zhangchunmeng
 * @Date: 2019-10-19
 */
public class StringTest {
    public static void main(String[] args) {
        /**
         * 1. 和使用其他类一样通过new关键字来创建。
         * 使用这种方式时，JVM创建字符串对象但不存储于字符串池。我们可以调用intern()方法将该字符串对象存储在字符串池，如果字符串池已经有了同样值的字符串，则返回引用。
         *
         * 2. 使用双引号直接创建。
         * 使用这种方式时，JVM去字符串池找有没有值相等字符串，如果有，则返回找到的字符串引用。否则创建一个新的字符串对象并存储在字符串池。
         */

        String str1 = new String("aaa");
        //上面一行代码将会创建1或2个字符串。如果在字符串常量池中已经有一个字符串“aaa”，那么就会创建一个“aaa”字符串。如果字符串常量池中没有“aaa”，那么首先会在字符串池中创建，然后才在堆内存中创建，这种情况就会创建2个对象了。
        String str2 = new String("aaa");
        String strIntern = new String("aaa").intern();
        String str3 = "aaa";

        String strCopyStr1 = str1;


        System.out.println(str1 == str2);//false
        System.out.println(str1 == str3);//false
        System.out.println(str1 == strCopyStr1);//true
        System.out.println(str3 == strCopyStr1);//false
        System.out.println(str1 == strIntern);//false
        System.out.println("aaa" == strIntern);//true
        System.out.println("aaa" == str1);//false
        System.out.println("aaa" == str3);//true
        System.out.println(strIntern == str3);//true


    }
    /**
     * 1. String是不可变的有什么好处？
     * String是不可变类有以下几个优点
     *
     * a.由于String是不可变类，所以在多线程中使用是安全的，我们不需要做任何其他同步操作。
     * b.String是不可变的，它的值也不能被改变，所以用来存储数据密码很安全。
     * b.因为java字符串是不可变的，可以在java运行时节省大量java堆空间。因为不同的字符串变量可以引用池中的相同的字符串。如果字符串是可变得话，任何一个变量的值改变，就会反射到其他变量，那字符串池也就没有任何意义了。
     */
}
