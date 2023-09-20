public class Main {
    public static void main(String[] args) {
        for (String arg : args) {
            if("-version".equals(arg)){
                System.out.println("v 1.0");
                break;
            }
        }
    }



}
class Person {
    public void run(String a) {  }
}

class Student extends Person {
    @Override
    // 不是Override，因为参数不同:
    public void run(String a) {  }
    // 不是Override，因为返回值不同:

}