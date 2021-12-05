public class TestRunner {

    private int rightAnswers = 0;
    private final Test test;

    public TestRunner(Test test) {
        this.test = test;
    }

    public String currentQuestion(int questionIndex) {
        return test.presentQuestion(questionIndex);
    }

    public void acceptAnswer(int questionIndex, int answerIndex) {
        Question currentQuestion = test.getQuestion(questionIndex);
        if (currentQuestion.isAnswerCorrect(answerIndex)) {
            rightAnswers++;
        }
    }

    public void getResults() {
        switch (rightAnswers) {
            case 3:
                System.out.println("Оценка- Отлично");
                break;
            case 2:
                System.out.println("Оценка - Хорошо");
                break;
            case 1:
                System.out.println("Оценка - Удовлетворительно");
                break;
            default:
                System.out.println("Оценка - Неудовлетворительно");
                break;
        }
    }
}
