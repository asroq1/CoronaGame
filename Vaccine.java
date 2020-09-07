import java.util.Scanner;

public class Vaccine
{

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public void watchingNews()
    {
        System.out.println("회사에 도착한 김대리는 또 가족을 위해 열심히 일을 한다." + "\n");
        System.out.println("그렇게 점심 시간이 다가왔다." + "\n");
        System.out.println("매일 코로나가 걱정인 김대리는 고민을 한다.");
        System.out.println("1. 코로나 뉴스를 본다." + "  2. 밥을 먹는다");
        while (true)
        {
            Scanner sc = new Scanner(System.in);
            int select = sc.nextInt();
            int makingVaccine = 1;
            makingVaccine = (int) (Math.random() * 100) + 1;
            if (select == 1 && (makingVaccine <= 10))
            {
                System.out.println(" ┌─────────────────────────────────────────────────────────────┐");
                System.out.println(" │ " + ANSI_GREEN + "   BBC BreakingNews" + " : " + "한국에서 백신 개발에 성공 했습니다 !  " + ANSI_RESET + "　　　│");
                System.out.println(" │ " + ANSI_GREEN + "       세상은 다시 마스크 없이 생활할 수 있게 되었습니다. " + ANSI_RESET + "         │");
                System.out.println(" └─────────────────────────────────────────────────────────────┘" + "\n");
                System.out.println(ANSI_GREEN + "H  A  P  P  Y     E  N  D  I  N  G " + ANSI_RESET);
                System.exit(0);
            }
           else if (select == 1 && (makingVaccine > 10))
            {
                System.out.println(ANSI_RED + "BBC BreakingNews" + " : " + "전세계 의학계가 백신개발에 난항을 겪고 있습니다." + "\n" + ANSI_RESET);
                System.out.println("희소식이 없는 뉴스보며 한숨만 내쉬며");
                System.out.println("김대리는 점심 생각을 한다." + "\n");
            }
            else if (select == 2 || select == 1)
            {
                System.out.println(ANSI_YELLOW + "★김대리 : 배고파 죽겠는데 코로나는 무슨 코로나야~ 밥이나 먹자" + ANSI_RESET);
            }
            else{
                System.out.println("선택지 숫자를 다시 입력 해주세요.");
            }break;

        }
    }
}


