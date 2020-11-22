public class Setting {
    //预选扑克
    public char[] pokerArray = {'A','Q','K','J','2','5','6','9'};
    //
    public int pokerLength = 4;
    public int pokerNumber = pokerLength * pokerLength;
    public int pokerContent = pokerLength * 2;


    public Setting(){
    }
    public void setPoker(int num){
        this.pokerNumber = num * num;
        this.pokerLength = num;
        this.pokerContent = num * num /2;
    }
    public int getPokerNumber(){
        return this.pokerNumber;
    }
    public int getPokerLength(){
        return this.pokerLength;
    }

}
