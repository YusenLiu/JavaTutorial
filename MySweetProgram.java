public class MySweetProgram {
    public static void main(String[] args) {
        System.out.println("Hello" + args[0]);//needs to pass an argument to a program
        MySweetProgram x = new MySweetProgram(); // creating an object
        x.tacos();
    }

    public void tacos(){
        System.out.println("Tacos");
    }
}

//        String test = "asdf";
//        boolean result;
//
//        result = test instanceof String;
//        System.out.println(result);
//to be continued
