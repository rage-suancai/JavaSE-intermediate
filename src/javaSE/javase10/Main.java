package javaSE.javase10;

import javaSE.javase9.AbstractList;

/**
 * 链表
 * 数据分散的存储在物理空间中 通过一根线保存着它们之间的逻辑关系 这种存储结构称为链式存储结构
 *
 * 实际上 就是每一个结点存放一个元素和一个指向下一个结点的引用(C语言里面是指针 java中就是对象的引用 代表下一个结点对象)
 *
 * 利用这种思想 我们再来尝试实现上面的抽象类 从实际的代码中感受
 *
 * 比较: 顺序表和链表的优异?
 *
 * 顺序表优缺点:
 *      > 访问速度快 随机访问性能高
 *      > 插入和删除的效率低下 极端情况下需要变更整个表
 *      > 不易扩充 需要复制并重新创建数组
 *
 * 链表优缺点:
 *      > 插入和删除效率高 只需要改变连接点的指向即可
 *      > 动态扩充容量 无需担心容量问题
 *      > 访问元素需要依次寻找 随机访问元素效率低下
 *
 * 链表只能指向后面 能不能指向前面呢? 双向链表
 */
public class Main {

    public static void main(String[] args) {

        AbstractList<String> list = new LinkedList<>();
        list.add("A", 0);
        list.add("B", 0);

        list.remove(0);

        System.out.println(list.get(0));

        System.out.println("debug");

    }

}
