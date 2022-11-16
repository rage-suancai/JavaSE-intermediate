package javaSE.javase5;

/**
 * java泛型与集合类
 * 在前面我们学习了最重要的类和对象 了解了面向对象编程思想 注意: 非常重要 面向对象是必须要深入理解和掌握的内容 不能草草结束
 * 在本章节 我们会继续深入了解 从我们的泛型开始 再到我们的数据结构 最后开始我们的集合类学习
 *
 * 走进泛型
 * 为了统计学生成绩 要求设计一个Score对象 包括课程名称 课程号 课程成绩 但是成绩分为两种 一种是以优秀 良好 合格来作为结果 还有一种就是60.0 75.0 92.5这样的数字分数
 * 那么现在该如何去设计这样的一个Score类呢? 现在的问题就是 成绩可能是String类型 也可能是Integer类型 如何才能很好的去存可能出现的两种类型呢?
 *                  public class Score {
 *                      String name;
 *                      String id;
 *                      Object score; // 因为Object是所有类型的父类 因此既可以存放Integer也可能存放String
 *
 *                      public Score(String name, String id, Object score) {
 *                          this.name = name;
 *                          this.id = id;
 *                          this.score = score;
 *                      }
 *
 *                  }
 *
 * 以上的方法虽然很好地解决了多种类型存储问题 但是Object类型在编译阶段并不具有良好的类型判断能力 很容易出现以下的情况:
 *                  public static void main(String[] args) {
 *
 *                      Score score = new Score("数据结构与算法基础", "1", "优秀");
 *
 *                      // ....
 *
 *                      Integer number = (Integer) score.score; // 获取成绩需要进行强制类型转换 虽然并不是一开始的类型 但是编译不会报错
 *
 *                  }
 *
 *                  // 运行时出现异常
 *                  Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast tojava.lang.Integer
 * 	                 at javaSE.javase5.Main.main(Main.java:46)
 *
 * 使用Object类型作为引用 取值只能进行强制类型转换 显然无法在编译期确定类型是否安全 项目中代码量非常之大 进行类型比较又会导致额外的开销和增加代码量
 * 如果不经比较就很容易出现类型转换异常 代码的健壮性有所欠缺(此方法虽然可行 但并不是最好的方法)
 *
 * 为了解决以上问题 JDK1.5新增了泛型 它能够在编译阶段就检查类型安全 大大提升开发效率
 *                  public class Score<T> { // 将Score转换为泛型类<T>
 *                      String name;
 *                      String id;
 *                      T score; // T为泛型 根据用户提供的类型自动变成对应类型
 *
 *                      public Score(String name, String id, T score) { // 提供的score类型即为T代表的类型
 *                          this.name = name;
 *                          this.id = id;
 *                          this.score = score;
 *                      }
 *
 *                  }
 *
 *                  public static void main(String[] args) {
 *
 *                      // 直接确定Score的类型是字符串类型的成绩
 *                      Score<String> score = new Score<String>("数据结构与算法基础", "1", "优秀");
 *                      Integer i = score.score; // 编译不通过 因为成员变量score类型被指定为String
 *
 *                  }
 *
 * 泛型将数据类型的确定控制在了编译阶段 在编写代码的时候就能明确泛型的类型 如果类型不符合 将无法通过编译
 *
 * 泛型本质也是一个语法糖(并不是JVM所支持的语法 编译后转换成编译器支持的语法 比如之前的foreach就是) 在编译后会被擦除
 * 变回上面的Object类型调用 但是类型转换由编译器帮我们完成 而不是我们自己进行转换(安全)
 *                  // 反编译后的代码
 *                  public static void main(String[] args) {
 *                      Score score = new Score("数据结构与算法基础", "1", "优秀");
 *                      String i = (String)score.score; // 其实依然会变成强制类型转换 但是这是由编译器帮我们完成的
 *                  }
 *
 * 像这样在编译后泛型的内容消失转变为Object的情况称为类型擦除(重要 需要完全理解) 所以泛型只是为了方便我们在编译阶段确定类型的一种语法而已 并不是JVM所支持的
 *
 * 综上 泛型其实就是一种类型参数 用于指定类型
 */
public class Main {

    static void test1() {

        Score1 score1 = new Score1("数据结构", "1", "优秀");
        Score1 score2 = new Score1("数据结构", "2", 100.0);

        String str1 = (String) score1.score;
        Double str2 = (Double) score2.score;
        System.out.println(str1);
        System.out.println(str2);

    }

    static void test2() {

        Score2<Double> score1 = new Score2<Double>("数据结构与算法基础", "1", 100.0);
        Score2<String> score2 = new Score2<String>("数据结构与算法基础", "2", "优秀");

        Double str1 = score1.score;
        String str2 = score2.score;
        System.out.println(str1);
        System.out.println(str2);

        //Integer i = score2.score;

    }

    public static void main(String[] args) {
        //test1();
        test2();
    }

}
