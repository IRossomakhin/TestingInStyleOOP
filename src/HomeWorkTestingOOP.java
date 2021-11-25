import java.util.Scanner;

public class HomeWorkTestingOOP {

    public static void main(String[] args) {
        Question[] questions = new Question[]{
                new Question("Земля какая по счету планета солнечной системы?",
                        new Answer[]{
                                new Answer("1. Вторая", false),
                                new Answer("2. Третья", true),
                                new Answer("3. Четвертая", false),
                                new Answer("4. Пятая", false)
                        }),
                new Question("Какие по счету были последние летние олимпийские игры в Токио?",
                        new Answer[]{
                                new Answer("1. 33ьи", false),
                                new Answer("2. 40ые", false),
                                new Answer("3. 32ьи", true)
                        }),
                new Question("Сколько грамм в одном киллограмме?",
                        new Answer[]{
                                new Answer("1. 1000", true),
                                new Answer("2. 100000", false),
                                new Answer("3. 10000", false),
                                new Answer("4. 100", false)
                        }),
        };

        Test test1 = new Test(questions);
        TestRunner testRunner = new TestRunner(test1);


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < test1.questions.length; i++) {
            String question = testRunner.currentQuestion(i);
            System.out.println(question); //вывод на экран вопросов и вариантов ответов
            int answer = sc.nextInt() - 1;
            testRunner.acceptAnswer(i, answer);
        }
        System.out.println(testRunner.getResults());
    }
}







