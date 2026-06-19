import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int score = 0;
        String rank;
        Scanner input = new Scanner(System.in);
        System.out.println("welcome! what is your name?");
        String name = input.nextLine();
        System.out.println("Hello "+name+"!");
        System.out.println("let's start");
        ArrayList<Ques> questions = new ArrayList<>();

    questions.add(new McQ("What is the color of sky?", "Blue", "Red", "Green", "Black", Option.a, 10));
    questions.add(new McQ("Which keyword is used to define a class in Java?", "object", "class", "define", "struct", Option.b, 10));
    questions.add(new McQ("What is the default value of an int in Java?", "0", "1", "null", "undefined", Option.a, 10));
    questions.add(new McQ("Which method is the entry point of a Java program?", "start()", "run()", "main()", "execute()", Option.c, 10));
    questions.add(new McQ("Which package contains the Scanner class?", "java.util", "java.io", "java.lang", "java.sql", Option.a, 10));
    questions.add(new McQ("Which operator is used for comparison in Java?", "=", "==", "!=", "===", Option.b, 10));
    questions.add(new McQ("What is the size of a boolean in Java?", "1 bit", "8 bits", "16 bits", "32 bits", Option.a, 10));
    questions.add(new McQ("Which keyword is used to inherit a class in Java?", "implements", "extends", "inherits", "super", Option.b, 10));
    questions.add(new McQ("Which of the following is not a primitive type?", "int", "float", "String", "char", Option.c, 10));
    questions.add(new McQ("What does JVM stand for?", "Java Variable Machine", "Java Virtual Machine", "Java Verified Method", "Java Visual Manager", Option.b, 10));
    questions.add(new McQ("Which loop runs at least once?", "for", "while", "do-while", "foreach", Option.c, 10));

// TrueFalse questions
    questions.add(new TrueFalse("The Earth revolves around the Sun.", Option.a, 10));
    questions.add(new TrueFalse("Water boils at 50 degrees Celsius.", Option.b, 10));
    questions.add(new TrueFalse("The capital of France is Paris.", Option.a, 10));
    questions.add(new TrueFalse("Humans can breathe underwater without equipment.", Option.b, 10));
    questions.add(new TrueFalse("The chemical symbol for gold is Au.", Option.a, 10));
    questions.add(new TrueFalse("The Great Wall of China is visible from space.", Option.b, 10));
    questions.add(new TrueFalse("Lightning is hotter than the surface of the Sun.", Option.b, 10));
    questions.add(new TrueFalse("Sharks are mammals.", Option.b, 10));
    questions.add(new TrueFalse("Mount Everest is the tallest mountain on Earth.", Option.a, 10));

        Collections.shuffle(questions);
        for(int i=0;i<10; i++){
            System.out.println((i+1)+" out of 10 | current score: "+score);
            questions.get(i).displayQues();
           boolean answered = false;
           while(!answered) {
               try {
                   Option userAns = Option.valueOf(input.nextLine());
                   boolean correct = questions.get(i).evaluateAns(userAns);
                   if (correct) {
                       score += questions.get(i).getPoints();
                       System.out.println("well done! 10 pts");
                   } else {
                       System.out.println("Wrong!");
                   }
                   answered = true;
               }
               catch (Exception e) {
                   System.out.println("invalid answer.try again");
               }
           }
        }
        if(score>90){
            rank = "excellent";
        }
        else if(score>70){
            rank = "great job";
        }
        else if(score>50){
            rank = "not bad";
        }
        else if(score>30){
            rank = "keep practicing";
        }
        else{
            rank = "better luck next time";
        }
        System.out.println("=========================");
        System.out.println("||    QUIZ COMPLETE      ||");
        System.out.println("=========================");
        System.out.println("player : "+name);
        System.out.println("score : "+score+"/100");
        System.out.println("correct : "+(score/10)+" | "+"wrong : "+(100-score)/10);
        System.out.println("rank :"+ rank);
        System.out.println("=========================");
    }
}