package edu.xcdq;

public class Ball {
    /*
      static  (静态的)关键字 在程序启动之后就申请到了内存空间，只有一份
      修饰的内容 不需要对象即可访问
      没有被static修饰的成员，需要对象才可以访问

      final (最终的)被final修饰的成员 在后续不能被修改
     */
    public double r  ;
    public static double PI = 3.1215926;


    public  static  void daqi(){
        System.out.println("正在给球打气");
    }

}

