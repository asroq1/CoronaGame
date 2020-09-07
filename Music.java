

import javafx.embed.swing.JFXPanel;
import javax.swing.JFrame;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Music extends Thread
{

    public void sound() {
        try
        {
            JFXPanel panel = new JFXPanel();

            JFrame f = new JFrame("메인윈도우");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setLocationRelativeTo(null);
            f.setSize(500, 500);
            f.setVisible(true);

            Media m = new Media("file:/C:/0_study/work1/sound/GrandFather.mp3");
            MediaPlayer p = new MediaPlayer(m);


            p.play();
            Thread.activeCount();
        } catch (Exception e)
        {
            e.printStackTrace();
        }




    }
}


