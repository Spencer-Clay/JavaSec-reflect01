public class example2 {
    public static void main(String[] args) throws Exception {
        example2 ex2 = new example2();
        ex2.reflect("evil");
    }
    public void reflect(String name) throws Exception{
        Class.forName(name);
    }
}
