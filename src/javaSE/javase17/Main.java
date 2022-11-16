package javaSE.javase17;

/**
 * 认识集合类
 * 集合表示一组对象 称为其元素 一些集合允许重复的元素 而另一些则不允许 一些集合是有序的 而其他则是无序的
 *
 * 集合类其实就是为了更好地组织 管理和操作我们的数据存在的 包括列表 集合 队列 映射等数据结构
 * 从这一块开始 我们会从源码角度给大家讲解(数据结构很重要) 不仅仅是教会大家如何去使用
 *
 * 集合类最顶层不是抽象类而是接口 因为接口代表的是某个功能 而抽象类是已经快要形成的类型 不同的集合类的底层实现是不同的
 * 同时一个集合类型可能会同时具有两种及以上功能(既能做队列也能做列表) 所以采用接口会更加合适 接口只需要定义支持的功能即可
 *
 * 数组与集合
 * 相同之处:
 *      1. 它们都是容器 都能够容纳一组元素
 *
 * 不同之处:
 *      1. 数组的大小是固定的 集合的大小是可变的
 *      2. 数组可以存放基本数据类型 但集合只能存放对象
 *      3. 数组存放的类型只能是一种 但集合可以有不同种类的元素
 *
 * 集合根接口Collection
 * 本接口中定义了全部的集合基本操作 我们可以在源码中看看
 *
 * 我们在来看看List和Set以及Queue接口
 */
public class Main {

    public static void main(String[] args) {



    }

}
