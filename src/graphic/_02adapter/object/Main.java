package graphic._02adapter.object;

/**
 * 对象适配器模式
 * 使用委托的适配器
 *
 * @author Liu Yingming on 2019/5/31
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("object _02adapter:");
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
