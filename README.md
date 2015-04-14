# Java_Hw2_Umbrella
Java Prgramming Homework Project 2 - Umbrella

### Homework Contents
다음 조건에 맞도록 프로그램을 작성하시오. 
- java_hw2 패키지에 아래 클래스를 만든다. 
- 우산 클래스와 우산 클래스의 인스턴스를 생성하여 사용해보는 J_Hw2 클래스를 만든다.(J_Hw2 클래스는 main 메소드를 갖는 클래스) 
- 우산 클래스에는 단(1단, 2단, 3단 기본 2단)과 자동우산유무, 살 개수(기본 6개, 6, 8, 12개 중 하나), 우산 문구, 가격 정보를 갖는다.(정보은닉) 
- 가격 정보의 경우 1단과 2단은 5000원, 3단은 6000원이다. 
- 위의 가격은 자동우산이 아닌 경우이며, 자동우산일 때는 위 가격에 2000원이 더해진다. 
- 우산 문구를 넣는 경우 2000원이 더해진다. - 살 개수에 따라 가격이 달라진다. 위 가격은 살 개수가 6개인 경우이며 8개일 때는 6개일 때의 가격에 10% 더 비싸
며, 12개인 경우에는 15% 더 비싸다. 
- 우산 클래스는 접근자 메소드를 갖는다.(각 정보를 설정하는 메소드와 각 정보 값을 반환하는 메소드, 가격은 반환메소드만 있다.) - 우산 클래스는 모든 정보를 출력하는 메소드를 갖는다. 

### Develop Overview
*	ProjectName	: Java Programming Homework Proj.2 Umbrella
*	Corder 		: Yu Yongwoo (YoWu)
*	Organiz.	: Catholic Univ. of Korea
*	Major		: Computer Science (Minor : Infomation System Eng)
*	DateTime	: 2015.4.14 19:30
*	Contact		: uyu423@gmail.com (http://luckyyowu.tistory.com)
*	Develop OS	: Windows Embedded 8.1 Industry Pro x64
*	PorgramLang	: Java (JavaSE-1.8)
*	IDE	        : Eclipse Luna Service Release 2 (4.4.2)

### main method 및 출력 예제
    public class J_Hw2 {
      public static void main(String[] args) {
      Umbrella u1 = new Umbrella(1, false, 6, "Happy");
      Umbrella u2 = new Umbrella(2, false, 6, "Love");
      Umbrella u3 = new Umbrella(3, false, 6, "Macchiato");
      Umbrella u4 = new Umbrella(1, true, 6, "Happy");
      Umbrella u5 = new Umbrella(2, true, 8, "Love");
      Umbrella u6 = new Umbrella(3, true, 8, "Fine day");
      Umbrella u7 = new Umbrella(2, true, 12, "Happy");
      Umbrella u8 = new Umbrella(3, true, 12, "Love");
      Umbrella u9 = new Umbrella(1, false, 6, null); //null 은 문구가 없다는 얘기
      u1.showInfoUm();
      u2.showInfoUm();
      u3.showInfoUm();
      u4.showInfoUm();
      u5.showInfoUm();
      u6.showInfoUm();
      7.showInfoUm();
      u8.showInfoUm();
      u9.showInfoUm();
      u8.setIsFrame(6); //프레임 갯수 수정
      u8.showInfoUm();
      }
    }
    
    출력 결과 예)
    
    1단 우산
    (우산 살대수: 6)
    삽입 문구: Happy
    가격: 7000
    
    2단 우산
    (우산 살대수: 6)
    삽입 문구: Love
    가격: 7000
    
    3단 우산
    (우산 살대수: 6)
    삽입 문구: Macchiato
    가격: 8000
    
    1단 자동우산
    (우산 살대수: 6)
    삽입 문구: Happy
    가격: 9000
    
    2단 자동우산
    (우산 살대수: 8)
    삽입 문구: Love
    가격: 9900
    
    3단 자동우산
    (우산 살대수: 8)
    삽입 문구: Fine day
    가격: 11000
    
    2단 자동우산
    (우산 살대수: 12)
    삽입 문구: Happy
    가격: 10350
    
    3단 자동우산
    (우산 살대수: 12)
    삽입 문구: Love
    가격: 11500
    
    1단 우산
    (우산 살대수: 6)
    가격: 5000
    
    3단 자동우산
    (우산 살대수: 6)
    삽입 문구: Love
    가격: 10000
