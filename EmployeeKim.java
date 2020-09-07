import java.util.Scanner;

public class EmployeeKim
{

    //전체실행 메인문
    public static void main( String[] args )
    //클래스를 객체화 해서 생성
    {
        Scanner sc = new Scanner(System.in);
        Chance chance = new Chance();
        Display display = new Display();
        Vaccine vaccine = new Vaccine();
        Music music = new Music();


        //첫 시작화면을 구현
        display.intro();
        int select = sc.nextInt();
        if (select == 1)
        {
            display.introStart();
        } else
        {
            display.introStartTwo();
            return;
        }

        //김대리의 다른 클래스들을 계속 호출할 수 있도록 while문 구현
        for (int i = 1; i <= 5; i++)
        {

            display.startTalk(i);

            display.StartCar();

            //

            while (true)

            {
                select = sc.nextInt();

                if (select == 1)
                {
                    display.Walk();
                    int result = chance.onFoot();
                    if (result == 3)
                    {


                        return;
                    }
                    break;
                } else if (select == 2)
                {
                    display.Bus();
                    int result1 = chance.takingSubway();
                    if (result1 == 3)
                    {
                        return;
                    }
                    break;
                } else
                {
                    display.remainder();
                }
            }
            //점심식사 이전에 백신개발 이벤트 발동
            vaccine.watchingNews();
            display.Eat();
            while (true)
            {
                select = sc.nextInt();
                if (select == 1)
                {
                    display.Alone();
                    int result = chance.havingLunchAlone();
                    if (result == 3)
                    {
                        return;
                    }
                    break;
                } else if (select == 2)
                {
                    display.Together();
                    int result1 = chance.havingLunchWithCowker();
                    if (result1 == 3)
                    {
                        return;
                    }
                    break;
                } else
                {

                    display.remainder();

                }

            }

            display.goCompany();

            while (true)
            {
                select = sc.nextInt();
                if (select == 1)
                {
                    display.home();
                    int result = chance.overTime();
                    if (result == 3)
                    {
                        return;
                    }
                    break;
                } else if (select == 2)
                {
                    display.nightWork();
                    int result1 = chance.overTime();
                    if (result1 == 3)
                    {
                        return;
                    }
                    break;
                } else
                {
                    display.remainder();
                }
            }
            display.goHome();

            while (true)
            {
                select = sc.nextInt();
                if (select == 1)
                {
                    display.onFootTwoNight();
                    int result = chance.onFoot();
                    if (result == 3)
                    {
                        return;
                    }
                    break;
                } else if (select == 2)
                {

                    display.takingSubwayNight();
                    int result1 = chance.takingSubway();
                    if (result1 == 3)
                    {
                        return;
                    }
                    break;
                } else display.remainder();
            }
        display.homeSweetHome();
        }

        display.theEnd();
    }
}


