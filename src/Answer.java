public class Answer {
    public String textAnswer;
    public boolean correct;

    public Answer(String textAnswer, boolean correct) {
        this.textAnswer = textAnswer;
        this.correct = correct;
    }
    public String toString() {
        return textAnswer;
    }
}
