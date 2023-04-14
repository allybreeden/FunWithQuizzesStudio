package quiz;

public class QuizRunner {

    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {
        String q1 = "Which of the following were companions of the Doctor in Doctor Who?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Sarah Jane Smith", true),
                new Choice("Rose Tyler", true),
                new Choice("Claire Oswald"),
                new Choice("Amy Pond", true)
        };
        CheckBox question1 = new CheckBox(q1, q1Choices);

        String q2 = "The first Disney Princess was Sleeping Beauty.";
        Choice[] q2Choices = new Choice[] {
                new Choice("True"),
                new Choice("False", true)
        };
        TrueFalse question2 = new TrueFalse(q2, q2Choices);

        String q3 = "In Harry Potter, what is Hermione's Patronus?";
        Choice[] q3Choices = new Choice[] {
                new Choice("Cat"),
                new Choice("Dog"),
                new Choice("Fox"),
                new Choice("Otter", true)
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);

        quiz.addQuestions(new Question[] {question1, question2, question3});

        quiz.runQuiz();

        System.out.println("\nYou answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!\n");
    }
}
