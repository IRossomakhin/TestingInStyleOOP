public class Question { // класс Вопрос.
    // Его поля: строка - "Текст  вопроса", и массив - "Ответов"
    private String textQuestion;
    private Answer[] answers;

    public Question(String textQuestion, Answer[] answers) {
        this.textQuestion = textQuestion;
        this.answers = answers;
    }

    public String present() {
        //метод вывода на экран вопроса и вариантов ответов к нему
        StringBuilder builder = new StringBuilder();
        builder.append(textQuestion);
        builder.append("\n");
        for (int i = 0; i < answers.length; i++) {
            builder.append(answers[i]);
            builder.append("\n");
        }
        return builder.toString();
    }

    public boolean acceptAnswer(int index) {// метод возвращает истинность ответа
        return answers[index].correct;
    }
}
