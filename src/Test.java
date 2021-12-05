public class Test {
    Question[] questions;

    public Test(Question[] questions) {
        this.questions = questions;
    }

    public Question getQuestion(int indexQuestion) {
        return questions[indexQuestion];
    }

    public String presentQuestion(int indexQuestion) {
        if (indexQuestion < questions.length) {
            return questions[indexQuestion].present();
        } else {
            return null;
        }
    }
}
