import java.security.SecureRandom;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 工具类，
 * 完全剥离业务逻辑，自作输入输出
 *
 */

public class Util {
    private ArrayList<Character> gameList = new ArrayList<>();
    private int size;
    //private String firstLine = "\t";
    private String t = "\t";
    private String shuaPing = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";

    public Util(){
    }
    public void start(ArrayList<Character> gameList,int size){
        this.gameList = gameList;
        this.size = size;
        System.out.println("************游戏开始************");
        //System.out.println("\n");
        //printNow(gameList);

    }
    //不需要再加一个size，因为初始化的时候已经弄好了
    public void printNow(ArrayList<Character> printList){
        //第一行
        String firstLine = "\t";
        for(int i = 0;i < size;i++){
            int p = i + 1;
            firstLine = firstLine + p + t;
        }
        System.out.println(firstLine);
        //剩余行
        int tem = 0;
        for(int j = 0;j < size;j++){
            String nextLine = j+1 + t;
            //再一个循环，组成其余的
            for(int k = 0;k < size;k++){
                nextLine = nextLine + printList.get(tem + k) + t;
            }
            System.out.println(nextLine);
            tem = tem + size;
        }
    }
    public int getCoordinate(){
        int c1 = 0 ;
        System.out.println("输入索引:");

        Scanner scan = new Scanner(System.in);
        if(scan.hasNext()){
            c1 = scan.nextInt();
        }
        return c1 - 1;
    }
    public void shuaPing(){
//        LocalTime time = LocalTime.now();
//        int second = time.getSecond();
        try{
            System.out.println("内容不符，3秒后执行刷屏操作！");
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(shuaPing);

    }


}


/**
 * 1.把int类型转化为string类型：https://blog.csdn.net/rocling/article/details/82818505
 * 2.程序延迟执行：https://www.jianshu.com/p/afaf9ae8171f
 */
