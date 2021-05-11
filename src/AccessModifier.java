
public class AccessModifier {
    //thực hành Private
    //    private int data = 40;
//    private void msg(){
//        System.out.println("Hello java");
//    }
//    public static void main(String[] args) {
//        AccessModifier obj = new AccessModifier();
//        System.out.println(obj.data);
//        obj.msg();
//    }
    //thực hành default
//    void msg() {
//        System.out.println("Hello");
//    }
//
//}
//
//class AccessModifier1{
//    public static void main(String[] args) {
//        AccessModifier obj = new AccessModifier();
//        obj.msg();
//    }
    //thực hành Production
//    protected void msg() {
//        System.out.println("Hello");
//    }
//}
//
//class AccessModifier1 extends AccessModifier {
//    public static void main(String[] args) {
//        AccessModifier1 obj = new AccessModifier1();
//        obj.msg();
//    }
    //thực hành Public
    public void msg(){
        System.out.println("Hello");
    }
}
class AccessModifier1{
    public static void main(String[] args) {
        AccessModifier obj = new AccessModifier();
        obj.msg();
    }
}

