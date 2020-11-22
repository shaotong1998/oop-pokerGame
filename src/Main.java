import java.util.*;

public class Main {
    public static void main(String[] args) {
        Setting setting = new Setting();

        char[] pokeArray = setting.pokerArray;//扑克的样式
        int pairs = setting.pokerContent;     //pairs一共有8对

        Control game = new Control(pokeArray,pairs);
        game.start();

    }
}


/*
*参考资料：
* 1.随机打乱https://blog.csdn.net/java_huan/article/details/81165437
*
*
 */