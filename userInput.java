public class MySweetProgram {
    public static void main(String[] args) {
        System.out.println("What is your name:");
        //type identifier = new type();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}
//Here, we need to be aware that the method nextLine() is not static since we need to create a new Scanner object (in this case it's sc).
//If nextLine() were a static method, then it could have looked like Scanner.nextLine()
