public class McQ extends Ques{
    String a;
    String b;
    String c;
    String d;
    public McQ(String question, String a, String b, String c, String d, Option correctAns, int points) {
        super(question, correctAns, points);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    void displayQues(){
        System.out.println(question);
        System.out.println("a. "+a);
        System.out.println("b. "+b);
        System.out.println("c. "+c);
        System.out.println("d. "+d);
    }
    boolean evaluateAns(Option userAns) throws Exception {
        return userAns == correctAns;
    }
}
