// WITH LABDA

interface Test {
    void print();
}

public class Anonymous {
    public static void main(String[] args) {
        Test a = () -> {
            System.out.println("Hello universe!!");
        };
        a.print();
    }
}

// WITHOUT LABDA (uncomment the code below and comment the code above)

// class Test {
//     void print(){
//         System.out.println("Hello World");
//     } 
// }

// public class Anonymous {
//     public static void main(String[] args) {
//         Test a = new Test(){
//             void print(){
//                 System.out.println("Hello Universe!!");
//             }
//         };

//         a.print();
//     }
// }
