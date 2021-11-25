public class Test {
    Question[] questions;

    public Test(Question[] questions) {
        this.questions = questions;
    }

    public Question getQuestion(int index) {
        return questions[index];
    }

    public String presentQuestion(int index) {
        if (index < questions.length) {
            return questions[index].present();
        } else {
            return null;
        }
    }
}
