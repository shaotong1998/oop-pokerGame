import java.util.ArrayList;
import java.util.Collections;

public class Control {
    private ArrayList<Character> gameList = new ArrayList<>();
    private int pairs;
    private int testTime = 0;
    private int size;
    private int num;
    private Util util = new Util();


    public Control(char[] arrayList,int pairs){
        //传进一个字符数组，自动转成两倍的arrayList
        for(int i = 0;i < pairs;i++){
            this.gameList.add(arrayList[i]);
            this.gameList.add(arrayList[i]);
        }
        //随机化
        Collections.shuffle(this.gameList);
        this.pairs = pairs;
        this.size = (int) Math.sqrt(pairs*2);
        this.num = pairs*2;
        //System.out.println(this.size);
    }
    public void start(){
        //1.隐藏所有的扑克数值
        ArrayList<Character> index = new ArrayList<>();
        for(int i = 0 ;i < num;i++){
            index.add('$');
        }
        util.start(index,this.size);

        //System.out.println(index.indexOf('&'));
        /*
        * 使用while循环，找到结束的条件：
        *  index中不能存在$ 就返回-1
        */
        int gate = 0;
        while(index.contains('$')){
            //进了循环先打印！如果输入对的话就可以不打印
            testTime++;
            if(gate == 0) {
                util.printNow(index);
            }
            //2.得到两个索引
            int c1 = util.getCoordinate();
            int c2 = util.getCoordinate();
            //3.核心逻辑：更新当前的画布
            // 3.1不管怎样先翻过来
            index.set(c1,gameList.get(c1));
            index.set(c2,gameList.get(c2));
            util.printNow(index);
            // 3.2逻辑判断
            if(gameList.get(c1)!=gameList.get(c2)){
                //不同就刷屏，index归位
                util.shuaPing();
                index.set(c1,'$');
                index.set(c2,'$');
                gate = 0;
            }
            if(gameList.get((c1))==gameList.get(c2)){
                System.out.println("恭喜！请继续输入\n");
                gate = 1;
            }
        }
        System.out.println("任务成功！奥里给！！！\n");
        System.out.println("共尝试了"+testTime+"次~");

    }


}
