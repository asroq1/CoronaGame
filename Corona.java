import java.util.Scanner;

public class Corona
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_YELLOW = "\u001B[33m";


    public void covidChoice()
    {
        System.out.println(ANSI_YELLOW + "★김대리 : 하아.. 혹시 코로나에 걸렸나..? 아니겠지.. 그냥 감기겠지..?" +ANSI_RESET + "\n");
        System.out.println("김대리의 " + ANSI_RED +"선택" + ANSI_RESET + "은 ?!" + "\n");
        System.out.println("1. 병원으로 간다.  2. 무시하고 일상생활을 한다.");
    }

    public int decision()
    {   Scanner sc = new Scanner(System.in);
       while (true)
        {
            int select = sc.nextInt();
            {  if(select == 1 )
            {
                System.out.println(" ┌──────────────────────────────────────────────────────────────────────┐");
                System.out.println(" │ 김대리는 코로나에 감염 되었지만 잘 " + ANSI_BLUE + "치료를 받고" + ANSI_RESET + " 다시 일상으로 " + ANSI_BLUE + "복귀" + ANSI_RESET + "할 수 있었다 ! │");
                System.out.println(" └──────────────────────────────────────────────────────────────────────┘" + "\n");
                System.out.println(ANSI_GREEN + "H  A  P  P  Y     E  N  D  I  N  G " + ANSI_RESET);
                System.out.println("                                                                       ");
            }else if(select == 2)
            {
                System.out.println(" ┌────────────────────────────────────────────────────────┐");
                System.out.println(" │    자기밖에 모르는 이기적인 김대리는 시간이 지날수록 찾아오는　 │");
                System.out.println(" │        복통과 두통 그리고 기침을 하며 일상을 지내다가　 　 　　│");
                System.out.println(" │          결국 그는 안타깝게도 세상을 떠나고 말았다　　　 　　　│");
                System.out.println(" └────────────────────────────────────────────────────────┘" + "\n");
                System.out.println(ANSI_RED + "B  A  D    E  N  D  I  N  G " + ANSI_RESET);
                System.out.println("                                                 ");
            }else {
                    System.out.println("숫자를 다시 입력 해주세요.");
            }
            }
        }
    }
}


