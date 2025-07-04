public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();

        //h.hp = 100;// エラーが出る
        h.name = "ミナト";

        h.sleep();
        h.seppuku();
    }
}
//13.3.2のゲッターメソッドから