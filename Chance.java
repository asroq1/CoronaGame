import java.util.Scanner;

public class Chance
{
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CUT = "\u001B[44m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_BLUE = "\u001B[34m";


    Scanner sc = new Scanner(System.in);
    //0.1 <= x < 1.0   1.0사이 랜덤 난수 발생

    // 출근 메소드 중에 첫 번째 선택지인 도보 메소드.
    public int onFoot()
    {    Corona corona = new Corona();
        int result = 0;
        int chance = (int) (Math.random() * 100) + 1;
        if (chance <= 3)
        {
            System.out.println(" ┌──────────────────────────────────────────────────────────────┐");
            System.out.println(" │........" + ANSI_RED +"미열" + ANSI_RESET + "과 "+ ANSI_RED +"살짝 몸살 기운" +ANSI_RESET +"이 있다... 요즘에 너무 무리를 했으려나.. │");
            System.out.println(" └──────────────────────────────────────────────────────────────┘"+"\n");
            corona.covidChoice();
            result = corona.decision();

        } else
        {
            System.out.println(" ┌──────────────────────────────────────────────────────────────┐");
            System.out.println(" │              "+ANSI_BLUE +"SAFE!"+ANSI_RESET+"  걸어서 가는데 감열될 리가 없지 !　 　　　 　   │");
            System.out.println(" └──────────────────────────────────────────────────────────────┘" + '\n');
            System.out.println(ANSI_CUT+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   " +ANSI_RESET + "\n" );
        }

        return result;
    }

    // 출근 중에 두 번째 선택지인 대중교통 메소드.
    public int takingSubway()
    {    Corona corona = new Corona();
        int result = 0;
        int chance = (int) (Math.random() * 100) + 1;
        if (chance <= 5)
        {
            System.out.println("┌────────────────────────────────────────────────────────────────┐");
            System.out.println("│ "+ANSI_RED + "WARNING !" + ANSI_RESET + "" + ANSI_RED +" 미열" + ANSI_RESET + "과 "+ ANSI_RED +"살짝 몸살 기운" +ANSI_RESET +"이 있다.. 요즘에 너무 무리를 했으려나.  │");
            System.out.println("└────────────────────────────────────────────────────────────────┘"+"\n");
            corona.covidChoice();
            result = corona.decision();
        } else
        {

            System.out.println(" ┌──────────────────────────────────────────────────────────────┐");
            System.out.println(" │     "+ANSI_BLUE +"SAFE !"+ANSI_RESET+"  주위에 사람이 많이 있었음에도 다행히 감염되지 않았다.  　│");
            System.out.println(" └──────────────────────────────────────────────────────────────┘" + '\n');
            System.out.println(ANSI_CUT+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   " +ANSI_RESET + "\n" );
        }
        return result;
    }

    // 점심식사 중에 첫 번째 선택지인 혼밥 메소드.
    public int havingLunchAlone()
    {    Corona corona = new Corona();
        int result = 0;
        int chance = (int) (Math.random() * 100) + 1;
        if (chance <= 3)
        {
            System.out.println("┌────────────────────────────────────────────────────────────────┐");
            System.out.println("│ "+ANSI_RED + "WARNING !" + ANSI_RESET + "" + ANSI_RED +" 미열" + ANSI_RESET + "과 "+ ANSI_RED +"살짝 몸살 기운" +ANSI_RESET +"이 있다.. 요즘에 너무 무리를 했으려나.  │");
            System.out.println("└────────────────────────────────────────────────────────────────┘"+"\n");
            corona.covidChoice();
            result = corona.decision();
        } else
        {
            System.out.println(" ┌──────────────────────────────────────────────────────────────┐");
            System.out.println(" │              "+ANSI_BLUE +"SAFE !"+ANSI_RESET+"  혼자 밥먹는데 감열될 리가 없지 !　 　　　 　  │");
            System.out.println(" └──────────────────────────────────────────────────────────────┘" + '\n');
            System.out.println(".........혼자 밥 먹는데 감염 될 리가 없지" + "\n");
            System.out.println(ANSI_CUT+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   " +ANSI_RESET + "\n" );
        }
        return result;
    }

    // 점심식사 중에 두 번째 선택지인 동료와 함께먹기 메소드.
    public int havingLunchWithCowker()
    {    Corona corona = new Corona();
        int result = 0;
        int chance = (int) (Math.random() * 100) + 1;
        if (chance <= 5)
        {
            System.out.println("┌────────────────────────────────────────────────────────────────┐");
            System.out.println("│ "+ANSI_RED + "WARNING !" + ANSI_RESET + "" + ANSI_RED +" 미열" + ANSI_RESET + "과 "+ ANSI_RED +"살짝 몸살 기운" +ANSI_RESET +"이 있다.. 요즘에 너무 무리를 했으려나.  │");
            System.out.println("└────────────────────────────────────────────────────────────────┘"+"\n");
            corona.covidChoice();
            result = corona.decision();
        } else
        {
            System.out.println(" ┌──────────────────────────────────────────────────────────────┐");
            System.out.println(" │         "+ANSI_BLUE +"SAFE !"+ANSI_RESET+"  다행이네 주위에서 엄청 떠들었는데 이걸 사네 ! 　  　│");
            System.out.println(" └──────────────────────────────────────────────────────────────┘" + '\n');
            System.out.println(ANSI_CUT+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   " +ANSI_RESET + "\n" );
        }
        return result;
    }

    //  야근을 할지 안 할지 선택하는 메소드
    public int overTime()
    {    Corona corona = new Corona();
        int result = 0;
        int chance = (int) (Math.random() * 100) + 1;
        if (chance <= 1)
        {
            System.out.println("┌────────────────────────────────────────────────────────────────────────────┐");
            System.out.println("│ "+ANSI_RED + "WARNING !" + ANSI_RESET + "" + ANSI_RED +" 미열" + ANSI_RESET + "과 "+ ANSI_RED +"살짝 몸살 기운" +ANSI_RESET +"이 있다.. 요즘에 너무 무리를 했으려나.  │");
            System.out.println("└────────────────────────────────────────────────────────────────────────────┘"+"\n");
            corona.covidChoice();
            result = corona.decision();
        } else
        {
            System.out.println(" ┌───────────────────────────────────────────────────────────────────────────────────────┐");
            System.out.println(" │        "+ANSI_BLUE +"SAFE !"+ANSI_RESET+"  감염되지 않았다. 김대리는 부장님의 커피에 실수로 침을 흘릴 계획을 취소했다.   　  │");
            System.out.println(" └───────────────────────────────────────────────────────────────────────────────────────┘" + '\n');
            System.out.println(ANSI_CUT+"\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   " +ANSI_RESET + "\n" );
        }
        return result;
    }

}
