public class Programme_11_JavaPattern {

/* Write a Java program to display the following pattern.
Sample Pattern :
J a v v a
J a a v v a a
J J aaaaa V V aaaaa
J J a a V a a
 */
public static void main(String[] args) {
    Programme_11_JavaPattern t = new Programme_11_JavaPattern();
    System.out.println("-------------------------------------");
t.javaPattern();
}
// printing the java pattern
    public void javaPattern(){
        System.out.println("j  a  v   v a");
        System.out.println("j a a  v v a a");
        System.out.println("j j aaaaa  v v aaaaa");
        System.out.println("j j a   a  v a  a");
    }
}
