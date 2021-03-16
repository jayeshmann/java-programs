public class LocalInner {

    private int i = 10;

    void print(){
        class Local{
            void text(){
                System.out.println("Private variable = " + i);
            }
        }

        Local l2 = new Local();
        l2.text();
    }

    public static void main(String[] args) {
        LocalInner l1 = new LocalInner();

        l1.print();
    }
}
