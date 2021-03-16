public class MemberInner {
    
    private int a = 5; // Even if this is private/static, it will be accesible by the inner class

    class Inner {
        void print(){
            System.out.println("Private variable = " + a);
        }
    }
    
    public static void main(String[] args) {
        MemberInner i1 = new MemberInner();
        MemberInner.Inner i2 = i1.new Inner();

        i2.print();
    }
}
