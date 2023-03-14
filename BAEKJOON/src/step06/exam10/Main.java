package step06.exam10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//25206 너의 평점은
public class Main {

  private static Sungjuk[] arrSungjuks = new Sungjuk[20]; // 성적배열
  static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws IOException {

    // 성적 입력받아서 arrSungjuks 넣는 메소드
    inputSungjuks();

    // 전공평점을 구하는 계산기 메소드
    calculator();

  }

  // 성적 입력받아서 arrSungjuks 넣는 메소드
  private static void inputSungjuks() throws IOException {
    for (int i = 0; i < arrSungjuks.length; i++) {// 성적 입력받아서 배열에 넣기

      StringTokenizer st = new StringTokenizer(br.readLine());

      String subject = st.nextToken(); // 과목
      float credit = Float.parseFloat(st.nextToken()); // 학점
      String grade = st.nextToken(); // 등급
      float score = 0.0f; // 등급을 환산한 점수 (과목평점)

      // A+=4.5 / A=4.0 / B+=3.5 / B=3.0 / c+=2.5 / C=2.0 / D+=1.5 / D=1.0 / F=0 / P패스
      // 등급을 과목평점으로 바꾸기
      switch (grade) {
        case "A+":
          score = 4.5f;
          break;
        case "A0":
          score = 4.0f;
          break;
        case "B+":
          score = 3.5f;
          break;
        case "B0":
          score = 3.0f;
          break;
        case "C+":
          score = 2.5f;
          break;
        case "C0":
          score = 2.0f;
          break;
        case "D+":
          score = 1.5f;
          break;
        case "D0":
          score = 1.0f;
          break;
      }

      // 성적 객체 만들어서 성적 배열에 넣기
      Sungjuk newSungjuk = new Sungjuk(subject, credit, grade, score);

      if (arrSungjuks[i] == null) {
        arrSungjuks[i] = newSungjuk;
      }

    }
  }

  // 전공평점 구하는 계산기
  private static void calculator() {

    float totalScore = 0.0f; // 전공과목별 (학점 × 과목평점)의 합
    float sumCredit = 0.0f;// 학점의 총합

    // 전공평점은 전공과목별 (학점 credit × 과목평점 score)의 합을 학점(credit)의 총합으로 나눈 값
    for (int i = 0; i < arrSungjuks.length; i++) {
      String str = arrSungjuks[i].getGrade();
      if (!str.equals("P")) {
        totalScore += arrSungjuks[i].getCredit() * arrSungjuks[i].getScore();
        sumCredit += arrSungjuks[i].getCredit();
      }
    }
    float avgScore = totalScore / sumCredit;

    System.out.println(avgScore);
  }
}

class Sungjuk {
  // field
  private String subject; // 과목
  private float credit; // 학점
  private String grade; // 등급
  private float score; // 등급을 환산한 점수 (과목평점)

  // constructor
  public Sungjuk(String subject, float credit, String grade, float score) {
    this.subject = subject;
    this.credit = credit;
    this.grade = grade;
    this.score = score;
  }

  // getter, setter
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public float getCredit() {
    return credit;
  }

  public void setCredit(float credit) {
    this.credit = credit;
  }

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public float getScore() {
    return score;
  }

  public void setScore(float score) {
    this.score = score;
  }

  // tostring
  @Override
  public String toString() {
    return "sungjuk [subject=" + subject + ", credit=" + credit + ", grade=" +
        grade + ", score=" + score + "]";
  }

}
