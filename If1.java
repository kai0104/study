package If;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class If1 {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);//创建一个扫描器
//        double p1 = scanner.nextDouble();//可以在控制台输入
//        //输入消费价格，500以内打九折，500-800打八折，800以上打五折
//        if (p1<500){
//            System.out.println(p1*0.9);
//        }else if (p1>800) {
//            System.out.println(p1 * 0.5);
//        }
//        else {
//            System.out.println(p1*0.8);
//        }
//    switch case 多路分支结构
        //适用性：只能对整数类型进行判定（不可以使用long类型数据），若判断的值相等，则走对应的代码块，JDK7之后支持字符串的内容判断
        //不能匹配逻辑或关系运算符的内容，只能匹配单值
        //优点：判断单只的数据是否相等，效率是优于if else结构的
        //语法：switch case
        //break：退出当前机构的语法，若在switch case语法中使用，代表退出当前结构
        //default:默认，若判断多个内容都没成立时，执行default语句
//        Scanner scanner = new Scanner(System.in);//创建一个扫描器
//        int num = scanner.nextInt();//可以在控制台输入
//        switch (num){
//            case 1:
//                System.out.println("中文服务");
//                break;
//            case 2:
//                System.out.println("英文服务");
//                break;
//            default:
//                System.out.println("输入错误");
//        }
        //代码继续向下执行
        //java当中有三种循环：1. while   2.do..while   3.for（使用率最高）
        //循环三要素：1.循环变量的初始化   2.基于循环变量的条件  3.循环变量的改变
        //跑三圈
        //三要素
        // int count = 0;//循环的初始化
        //count < 3;
        //count++;循环变量的改变

        //while语法结构;
        //三要素  1.循环变量的初始化   2.基于循环变量的条件  3.循环变量的改变

        //1.循环变量的初始化
        //while(2.基于循环变量的条件){
        //需要循环的代码，或者叫循环体
        //3.循环变量的改变
        //}
//        int count = 0;
//        while (count <3){
//            System.out.println("跑了第"+(count+1)+"圈");
//            count++;
//        }

        //do while
        //三要素  1.循环变量的声明   2.基于循环变量的条件  3.循环变量的改变
        /**
         *
         * 语法结构
         * 1.循环变量的初始化
         * do{
         *     //循环的代码块
         *     2.基于循环变量的条件
         * }while(3.循环变量的改变)
         * 知道小括号中的条件不成立，代码往后执行
         *
         * 问题一：会有输出吗
         * 问题二：输出几
         *
         * ！！！！不管什么情况下do while至少执行一次
         */
//        int count = 3;
//        do {
//            System.out.println(count + 1);
//            count++;
//        } while (count < 3);
        /**
         *随机数：
         * Java中体哦那个了生成随机数的功能，我们可以给一个范围，他就会在这个范围内生成随机数
         * Java中   Math类中提供的random();方法
         */

        //        double r = Math.random();//会返回0-1之间的随即小数，到不了1    0.9999999999999999   != 1.0

//        System.out.println(r);

//        double a = Math.random()*100;//0-100之间，不到100     0.1-99.999     0.1   ！= 99.999    99，998


        //声明一个double类型的变量，取0-100之间的随机整数

        //代码需要优化
        //double a = Math.random()*100;

        //int b = (int)a;

        //System.out.println(b);

//        double a = (int)(Math.random()*101);

//        System.out.println(a);

        //随机数的语法
        //(int)(Math.random()*(100-50)+50);//50-100   51.1   51

        //Math.random()*(MAX-MIN)+MIN;//设置区间的随机数

        //2300-1200


        //猜大小
        //程序运行之后，随机生成1-100的整数（包含100）
        //提示用户在控制台     输入 “请猜大小”
        //若猜对了，我们就输出  “猜对了”
        //猜错了 就输出   “猜错了，再猜一次”
        //直到用户猜对了，结束程序
        //Scanner      if      do while

//        int number = (int)(Math.random()*101);
//        System.out.println(number);
//        Scanner scanner = new Scanner(System.in);
//        int guess ;
//        do {
//            System.out.println("请猜大小");
//            guess =scanner.nextInt();
//
//            if (guess == number){
//                System.out.println("猜对了");
//            }
//            else if (guess > number){
//                System.out.println("猜大了，再猜一次");
//
//            }
//            else if(guess < number){
//                System.out.println("猜小了，再猜一次");
//            }
//
//        }while (guess != number);//只有满足while判断的条件，才能继续循环，只要我没猜对，我就一直猜
//
//        System.out.println("猜对了，代码向下执行");
        //while 和 do while的区别
        //while循环：一定先判断while小括号里面的条件是都成立，成立执行循环体，也可能是一次都不循环
        //do while ：至少做一次循环，之后在判断小括号中条件是否成立
        //当我们一直循环的条件是，不明确循环的次数的时候，就可以使用while 或者 do while


        //for 循环：当我们明确循环次数的时候，我们就考虑应该取用for循环了（for循环也是我们编程中最常用的一种循环）
        /**
         *for循环也是有三要素的
         * 1.循环变量的初始化，2.基于循环变量的条件，3.循环变量的改变
         * for(1   2    3){
         *     4.循环代码块
         * }
         * 执行的过程：
         *      1---2---4---3---2---4---3---2---4---3---2---直到不满足条件跳出循环
         */
        //例子：吃饭，一天吃三次
//        for (int i = 0; i < 3; i++) {
//            System.out.println("这是我第" + (i + 1) + "次吃饭了");
//        }

        //循环十次，在1-10之间的数，如果是奇数，就输出是奇数，如果是偶数，就输出偶数
        //1 2 3 4 5 6 7 8 9 10
        //continue   在循环体中如果遇到这个关键字，代表了直接进行下一次循环，跳过此循环
        //for  取余   分支结构
//        for (int i = 1;i<=10;i++){
//            if (i%2==0){
//                System.out.println(i+"偶数");
//            }else {
//                System.out.println(i+"奇数");
//            }
//        }
//        for (int i = 1; i <= 10; i++) {
//            if (i%2==0){
//                System.out.println(i+"偶数");
//                continue;
//            }
//            System.out.println(i+"奇数");
//        }

        //小涛去跑步，一共要跑十圈，跑到第六圈的时候(第六圈没跑)，肚子疼，不跑了
//        for (int i = 0;i<10;i++){
//            if (i<5){
//                System.out.println("跑了第"+(i+1)+"圈");
//
//            }else if (i>5){
//                System.out.println("拉肚子");
//                break;
//            }
//
//        }
        //变量在for循环中，他的作用域只在for循环，其他地方看不到的


//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//
//        }
//        for (int i = 0; i < 10; i++) {
//
//        }

        //随机十道加法题
        //输出的语句要包含题号和   题干（随机的是100以内的加法）（1）1+2=
        //输出   请写出答案                               "请输入答案"
        //                                              恭喜答对了
        //                                              很遗憾，答错了
        //总共答对了多少道题目











    }


}



