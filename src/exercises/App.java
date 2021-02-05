package exercises;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String q1 = "What is my name?\n"
                + "(a)Chen\n(b)AzaPizda\n(c)Suka\n(d)AzaBlyad";
        String q2 = "What is my lastname?\n"
                + "(a)Btb\n(b)AzaPizda\n(c)Suka\n(d)AzaBlyad";


        Question[] questions = {
                new Question(q1, "a"),
                new Question(q2, "b")
        };
        takeTest(questions);

    }
    public static void takeTest(Question[] questions){
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for(int i =0; i < questions.length; i++){
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println("You got " + score + "/" + questions.length);
    }
}