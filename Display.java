public class Display
{
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_MAIN = "\u001B[46m";
    public static final String ANSI_CUT = "\u001B[46m";
    public static final String ANSI_LINE = "\u001B[33m";
    public void intro()
    { // 첫 시작 멘트
        System.out.println(ANSI_MAIN+"　　　　\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t " +ANSI_RESET );
        System.out.println("　　　┌───────────────────────────────────────────────────────┐");
        System.out.println("　　　│                                                       │");
        System.out.println("　　　│              김대리의 코로나 생존 서바이벌　          　   │");
        System.out.println("　　　│                                                       │");
        System.out.println("　　　|         당신의 선택으로 김대리의 운명을 정해주세요　　　　  　│");
        System.out.println("　　　│                                                       │");
        System.out.println("　　　│       Start Game = 1      End Game = other Number     │");
        System.out.println("　　　│                                                       │");
        System.out.println("　　　└───────────────────────────────────────────────────────┘");
        System.out.println(ANSI_MAIN+"　　　　\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t " +ANSI_RESET + "\n" );
    }

    public void introStart()
    { // 시작 선택시 인트로
        System.out.println("　　　　　　　　　　　김대리의 서바이벌을 시작 합니다..!" + "\n");
    }

    public void introStartTwo()
    { // 종료 선택시 멘트
        System.out.println("서바이벌을 종료합니다..." + "\n");
    }

    public void startTalk( int a )
    {
        System.out.println("");
        System.out.println(ANSI_GREEN + "\t\t\t\t\t\t\t생존" + ANSI_RESET + ANSI_GREEN + " " + a + "일차" + ANSI_RESET + "\n");
        System.out.println(ANSI_LINE+"--------------------------------------------------------------------" +ANSI_RESET +"\n");
    }

    public void remainder()
    { // 선택지중 1,2번 아닌 숫자를 골랐을때 멘트
        System.out.println("1번 2번 중 선택 해주세요.");
    }

    public void StartCar()
    { // 출근 선택 멘트
        System.out.println(ANSI_YELLOW + "★김대리 : (몸을 뒤척이며)아..출근하기 싫어.. 그래도 처자식을 생각해야지.." + ANSI_RESET);
        System.out.println(ANSI_YELLOW +"                      흐음.. 오늘은 어떤 방식으로 출근하지 ?" + ANSI_RESET +"\n");
        System.out.println("1. 걸어서 간다.  2. 대중교통을 이용한다.");
    }

    public void Walk()
    { // 도보 멘트
        System.out.println(ANSI_YELLOW + "★김대리 : 햇살이 너무 따갑지만 바람이 선선해서 좋네~" + "\n" + ANSI_RESET);
        System.out.println("선선한 바람에 기분좋은 김대리가 코로나에 감염될 확률은 3%. 김대리의 상태는 ?!" );
    }

    public void Bus()
    { // 대중교통 멘트
        System.out.println(ANSI_YELLOW + "★김대리 : 하아..역시 출근시간이라 차도 막히고 사람도 많네..." + "\n" + ANSI_RESET);
        System.out.println("답답함에 한숨만 나오는 김대리가 코로나에 감염될 확률은 30%. 김대리의 상태는 ?!");
    }

    public void watchingNews()
    { // 뉴스 멘트
        System.out.println("회사에 도착한 김대리는 또 가족을 위해 열심히 일을 한다." + "\n");
        System.out.println("그렇게 점심 시간이 다가왔다." + "\n");
        System.out.println("매일 코로나가 걱정인 김대리는 고민을 한다.");
        System.out.println("1. 코로나 뉴스를 본다." + "  2. 밥을 먹는다");
    }

    public void Eat()
    { // 점심식사 선택 멘트
        System.out.println(ANSI_YELLOW + "★김대리 : 혼자 먹을까 같이 먹을까..?" + "\n" + ANSI_RESET);
        System.out.println("1. 구석에서 혼자 먹는다.  2. 사원들과 같이 먹는다.");
    }

    public void Alone()
    { // 혼자 도시락 먹기
        System.out.println(ANSI_YELLOW + "★김대리 : 이 시국엔 역시 혼자 먹어야지. 같이 먹으면 위험해 !" + "\n" + ANSI_RESET);
        System.out.println("사내왕따인 김대리가 코로나에 감염될 확률은 5%. 김대리의 상태는 ?!");
    }

    public void Together()
    { // 팀원들과 식사
        System.out.println(ANSI_YELLOW + "★김대리 : 역시 밥은 같이 먹어야 꿀맛이지 !" + "\n" + ANSI_RESET);
        System.out.println("동료들의 불편한 시선을 무시한 김대리가 코로나에 감염될 확률은 20%. 김대리의 상태는 ?!");
    }

    public void goCompany()
    { // 야근 선택 멘트
        System.out.println("지겨운 시간이 흐르고 퇴근 시간이 다가왔다." + "\n");
        System.out.println(ANSI_YELLOW + "★김대리 : 오늘도 팀원 전부 야근인가.. 집에 가고싶은데.." + "\n" + ANSI_RESET);
        System.out.println("           (부장님의 불꽃 시선이 따갑다..)         ");
        System.out.println("1. 무시하고 칼퇴한다.  2. 눈빛을 버티지 못해 야근한다.");
    }

    public void home()
    { // 칼퇴근 하기
        System.out.println(ANSI_YELLOW + "★김대리 : 얼마만의 칼퇴냐~ 얼른 가서 쉬어야지~" + "\n" + ANSI_RESET);
        System.out.println("승진에 관심 없는 김대리가 코로나에 감염될 확률은 1%. 김대리의 상태는 ?!");
    }

    public void nightWork()
    { // 야근하기
        System.out.println(ANSI_YELLOW + "★김대리 : 김부장..두고봐라... 커피에 다른걸 태워주마" + "\n" + ANSI_RESET);
        System.out.println("소심한 복수를 다짐한 김대리가 코로나에 감염될 확률은 10%. 김대리의 상태는 ?!");
    }

    public void goHome()
    { // 퇴근 선택 멘트
        System.out.println("야호~ 신나는 퇴근시간이다 !");
        System.out.println("퇴근은 어떻게 할까 ?");
        System.out.println("1. 걸어서 귀가한다.  2.  대중교통을 이용한다.");
    }

    public void onFootTwoNight()
    {
        System.out.println(ANSI_YELLOW +"★김대리: 건강을 위해 걸어서 가자."+ANSI_RESET);
        System.out.println("코로나에 걸릴 확률은 3%. 과연?!");
    }

    public void takingSubwayNight()
    {
        System.out.println(ANSI_YELLOW +"★김대리: 역시 퇴근길도 사람이 많구나. 에구 힘들다." + ANSI_RESET);
        System.out.println("코로나에 걸릴 확률은 30%. 과연?!");
    }

    public void homeSweetHome()
    {
        System.out.println("김대리는 오늘도 무사히 하루를 마치고 집으로 귀가 했다."+"\n");
        System.out.println(ANSI_YELLOW +"★김대리 : 오늘 하루도 끝났구나.. 이제 씻고 자야지..."+ANSI_RESET);
        System.out.println("(속마음 : 오늘도 하루도 살아남았다.. 부디 내일도 무사히 살아 남아야 될텐데...)" + "\n");
        System.out.println(ANSI_LINE+"--------------------------------------------------------------------" +ANSI_RESET);
    }

    public void theEnd()
    {
        System.out.println(" ┌──────────────────────────────────────────┐");
        System.out.println(" │" + ANSI_RED + "         세계는 코로나로 멸망 했습니다.　" + ANSI_RESET + " 　   │");
        System.out.println(" └──────────────────────────────────────────┘" +"\n");
        System.out.println(ANSI_RED + "B  A  D    E  N  D  I  N  G " + ANSI_RESET);
    }
}
