public class TrueFalse extends Ques {
    public TrueFalse(String question,Option correctAns,int points) {
        super(question,correctAns,points);
        if(correctAns != Option.a && correctAns != Option.b){
            throw new IllegalArgumentException("invalid option");
        }
    }
    void displayQues() {
        System.out.println(question);
        System.out.println("a. true");
        System.out.println("b. false");
    }
    boolean evaluateAns(Option userAns) throws Exception {
        if(userAns != Option.a && userAns != Option.b){
            throw new Exception("invalid answer");
        }
        return userAns == correctAns;
    }
}
