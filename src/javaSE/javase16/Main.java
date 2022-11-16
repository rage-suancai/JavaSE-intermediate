package javaSE.javase16;

/**
 * 红黑树
 * 红黑树也是二叉排序树的一种改进 同平衡二叉树一样 红黑树也是一种维护平衡的二叉排序树 但是没平衡二叉树那样严格(平衡二叉树每次插入新节点时 可能会出现大量的旋转 而红黑色树保证不超过三次)
 * 红黑树降低了对于旋转的要求 因此效率右一定的提升同时实现起来也更加简单 但是红黑树的效率却高于平衡二叉树 红黑树也是JDK1.8中使用的数据结构
 *
 * 红黑树的特性:
 *      1. 每个节点或者是黑色 或者是红色
 *      2. 根节点是黑色
 *      3. 每个叶子节点的两边也需要表示(虽然没有 但是null也需要表示出来)是黑色
 *      4. 如果一个节点是红色的 则它的子节点必须是黑色的
 *      5. 从一个节点到该节点的子孙节点的所有路径上包含相同数目的黑节点
 *
 * 我们来看看一个节点 是如何插入到红黑树中的 基本的 插入规则和平衡二叉树一样 但是在插入后:
 *      1. 将新插入的节点标记为红色
 *      2. 如果 X 是根结点(root) 则标记为黑色
 *      3. 如果 X 的 parent 不是黑色 同时 X 也不是 root
 *
 *      > 3.1 如果 X 的 uncle (叔叔) 是红色
 *      > 3.1.1 将 parent 和 uncle 标记为黑色
 *        3.1.2 将 grand parent (祖父) 标记为红色
 *        3.1.3 让 X 节点的颜色与 X 祖父的颜色相同 然后重复步骤 2、3
 *
 *      > 3.2 如果 X 的 uncle (叔叔) 是黑色 我们要分四种情况处理
 *      > 3.2.1 左左 (P 是 G 的左孩子 并且 X 是 P 的左孩子)
 *        3.2.2 左右 (P 是 G 的左孩子 并且 X 是 P 的右孩子)
 *        3.2.3 右右 (P 是 G 的右孩子 并且 X 是 P 的右孩子)
 *        3.2.4 右左 (P 是 G 的右孩子 并且 X 是 P 的左孩子)
 *        其实这种情况下处理就和我们的平衡二叉树一样了
 */
public class Main {

    public static void main(String[] args) {



    }

}
