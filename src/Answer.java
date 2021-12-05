public class Answer {
    public String textAnswer;
    public boolean isCorrect;

    public Answer(String textAnswer, boolean correct) {
        this.textAnswer = textAnswer;
        this.isCorrect = correct;
    }
    public String toString() {
        return textAnswer;
    }
}
