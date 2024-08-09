package project.manage.modules;
/**
 *
 * @author hyc
 * @date 2024/8/8
 * @version: 1.0
 */

public class Grade {
    private String subject;
    private int score;

    public Grade(String subject, int score) {
        this.subject = subject;
        this.score = score;
    }

    public String getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

