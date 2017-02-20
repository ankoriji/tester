public class Main {
 public static void main(String[] args) {
  Human anton = new Human("Anton", 30);
  Human vlad = new Human("Vlad", 130);
  anton.walk();
  vlad.walk();
  System.out.println(anton.goToTheWork(10));
  System.out.println(vlad.goToTheWork(8));
 }
}