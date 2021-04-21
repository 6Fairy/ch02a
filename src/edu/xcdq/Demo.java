package edu.xcdq;

/*
在类中执行顺序
   1 被static修饰的成员
      1.1 都被static修饰，谁写在前面先执行谁
   2没有被static修饰的普通成员书香或代码块
      2.1都没有被修饰，谁写在前面先执行谁
   3构造方法
   4普通方法
 */
public class Demo {
    int size = 1;
    {
        size = 10;
         final int sum =100;
    }
   static {
        count = 30;
   }
   static int count =3;
    public Demo(){
        System.out.println(size);
        System.out.println(count);
    }
    public void fun(){
         final int temp =200;//局部变量
        System.out.println("普通方法");
    }
    public void Jiqigou(Dog dog){
        dog.run();
    }
    //内部类
     class inner{
     //static int a =10;该类的存在需要对象 而a的存在需要对象
        public void test(){
            System.out.println(count);
            System.out.println(size);
          //  System.out.println(sum);
            Jiqigou(new Dog() {
                @Override
                public void run() {
                    System.out.println("哒哒的跑");
                }
            });
        }
    }
    //静态内部类
    static  class inner1{
        public  void test01(){
            //System.out.println(size);
            System.out.println(count);
        }
    }

}
