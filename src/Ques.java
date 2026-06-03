abstract class Ques {
    protected String question;
    protected Option correctAns;
    protected int points;
    public Ques(String question,  Option correctAns, int points) {
        this.question = question;
        this.correctAns = correctAns;
        this.points = points;
    }
    abstract void displayQues();
    abstract boolean evaluateAns(Option userAns)throws Exception;
    public int getPoints() {
        return points;
    }
}
