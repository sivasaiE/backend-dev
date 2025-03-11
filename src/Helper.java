public class Helper {





    public static void main(String[] args) {

        Student siva = new Student();
        Student sai = new Student();
        Student Kumar = new Student();


        siva.name = "Siva";
        siva.age = 26;


        sai.name = "Sai";
        sai.age = 26;

//        Kumar.name = "Kumar";
//        Kumar.age = 26;


        System.out.println("priting siva name "+ siva.name());
        System.out.println("priting sai name "+ sai.name());
        System.out.println("priting kumar name "+ Kumar.name());


    }
}