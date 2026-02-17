import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
    String[] selection = new String[5];
    
    public QuestionService(){
        questions[0] = new Question(1, "In which year was Java Developed?", "1995", "2002", "1989", "2009", "1995");
        questions[1] = new Question(2, "Java was Developed by?", "Sun Microsystem", "Microsoft", "Facebook", "Tesla", "Sun Microsystem");
        questions[2] = new Question(3, "Which is concept of OOPs?", "Arrays", "Abstraction", "Recurssion", "Collection", "Abstraction");
        questions[3] = new Question(4, "Which one is part of JRE?", "JVM", "JDK", "Java Compiler", "Java Debugger", "JVM");
        questions[4] = new Question(5, "Which type of inheritace java does not support directly?", "Multilevel", "Hybrid", "Multiple", "Single", "Multiple");
    }

    public void playQuiz(){
        int i=0;
        for(Question q : questions){
            System.out.println("Question no. : "+q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
            sc.close();
        }

        // Prints all the answer at the end
        // for(String s : selection){
        //     System.out.println(s);
        // }

    }

    public void printScore(){
        int score = 0;
        for(int i=0; i<questions.length; i++){
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAns = selection[i];

            if(answer.equals(userAns)){
                score++;
            }
        }
        System.out.println("Score : "+score);
    }
}
