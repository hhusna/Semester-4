/*Nama  : Miftahul Husna
 *NIM   : 222313208
 *Kelas : 2KS1
 PEMROGRAMAN BERORIENTASI OBJEK
 PERTEMUAN 4
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class InvalidAnswerException extends Exception {
    public InvalidAnswerException(String message) {
        super(message);
    }
}

class Question<T, U> {
    public static final String displayQuestion = null;
    private String questionText;
    private T questionType;
    private U answer;

    public Question(String questionText, T questionType, U answer) {
        this.questionText = questionText;
        this.questionType = questionType;
        this.answer = answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public T getQuestionsType() {
        return questionType;
    }

    public U getAnswer() {
        return answer;
    }

    public <A> void setAnswer(A answer) throws InvalidAnswerException {
        if (answer == null) {
            throw new InvalidAnswerException("Jawaban tidak boleh null");
        } 
        this.answer = (U) answer;
    }

    public void displayQuestion() {
        System.out.println("Pertanyaan: " + questionText);
    }
}

class TextQuestion extends Question<String, String> {
    public TextQuestion(String questionText, String answer) {
        super(questionText, "Text", answer);
    }

    public void setAnswer(String answer) throws InvalidAnswerException {
        if (answer == null) {
            throw new InvalidAnswerException("Jawaban tidak boleh null");
        }
        super.setAnswer(answer);
    }

    @Override
    public void displayQuestion() {
        System.out.println("[Text] Pertanyaan: " + getQuestionText());
        System.out.println("Jawaban: " + getAnswer());
        System.out.println();
    }
}

class RadioButton extends Question<String, String> {
    private List<String> options = Arrays.asList("Ya", "Tidak");

    public RadioButton(String questionText, String answer) throws InvalidAnswerException {
        super(questionText, "Radio", answer);
        setAnswer(answer); // Validasi jawaban
    }

    public void setAnswer(String answer) throws InvalidAnswerException {
        if (answer == null || !options.contains(answer)) {
            throw new InvalidAnswerException("Jawaban harus 'Ya' atau 'Tidak'");
        }
        super.setAnswer(answer);
    }

    @Override
    public void displayQuestion() {
        System.out.println("[Radio] Pertanyaan: " + getQuestionText());
        System.out.println("Pilihan: " + options);
        System.out.println("Jawaban: " + getAnswer());
        System.out.println();
    }
}

class SelectQuestions extends Question<String, String> {
    private List<String> options;

    public SelectQuestions(String questionText, String answer) throws InvalidAnswerException {
        super(questionText, "Select", answer);
        this.options = Arrays.asList("Keluarga/Teman", "Media Cetak", "Media Sosial", "Internet (iklan online)", "Lainnya");
        setAnswer(answer); // Validasi jawaban
    }

    public void setAnswer(String answer) throws InvalidAnswerException {
        if (answer == null || !options.contains(answer)) {
            throw new InvalidAnswerException("Jawaban harus salah satu dari pilihan yang tersedia");
        }
        super.setAnswer(answer);
    }

    @Override
    public void displayQuestion() {
        System.out.println("[Select] Pertanyaan: " + getQuestionText());
        System.out.println("Pilihan: " + options);
        System.out.println("Jawaban: " + getAnswer());
        System.out.println();
    }
}

class SurveyManager {
    private List<Question<?, ?>> questionsList;

    public SurveyManager() {
        questionsList = new ArrayList<>();
    }

    public void addQuestion(Question<?, ?> question) {
        questionsList.add(question);
    }

    public void displayAllQuestions() {
        for (Question<?, ?> question : questionsList) {
            question.displayQuestion();
        }
    }

    public void generateSurvey() {
        displayAllQuestions();
    }

    public void updateAnswer(int questionIndex, Object newAnswer) {
        Question<?, ?> question = questionsList.get(questionIndex);
        try {
            question.setAnswer((String) newAnswer);
        } catch (InvalidAnswerException e) {
            System.out.println("Jawaban tidak valid");
        }
    }
}

public class SurveyGenerator {
    public static void main(String[] args) {
        try {
            //membuat object
            TextQuestion tq1 = new TextQuestion("Nama Responden", "Husna");
            RadioButton rb1 = new RadioButton("Apakah Anda pernah menggunakan aplikasi ASTRO?", "Ya");
            SelectQuestions sq1 = new SelectQuestions("Darimana Anda mengetahui aplikasi ASTRO?", "Media Sosial");
            
            //menambahkan pertanyaan ke Survey Manager
            SurveyManager sm = new SurveyManager();
            sm.addQuestion(tq1);
            sm.addQuestion(rb1);
            sm.addQuestion(sq1);
            
            //hasil survey
            System.out.println("[DAFTAR PERTANYAAN DAN JAWABAN SURVEY]");
            System.out.println("--------------------------------------");
            sm.generateSurvey();

            //update
            sm.updateAnswer(0, "Aul");
            sm.updateAnswer(1, "Tidak");
            sm.updateAnswer(2, "Lainnya");

            //hasil s
        } catch (InvalidAnswerException e) {
            System.out.println("Invalid Answer: " + e.getMessage());
        }
    }
}
