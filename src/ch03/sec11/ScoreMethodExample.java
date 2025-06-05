package ch03.sec11;

public class ScoreMethodExample {
    public static void main(String[] args) {
        int randomScore = getRandomValue(10,100);
        int randomScore2 = getRandomValue(1,5); // 1 ~ 5

        char grade = getGrade(randomScore);

        System.out.printf("randomScore: %d\ngrade: %c\n", randomScore, grade);
    }
    public static int getRandomValue(int v1, int v2){
        return (int)(Math.random() * (v2-v1+1)) + v1;
    }
    public static char getGrade(int score){
        if(score>100 || score < 0){
            return ' ';
        }
        return switch(score / 10){
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            default -> 'D';
        };
    }
}

