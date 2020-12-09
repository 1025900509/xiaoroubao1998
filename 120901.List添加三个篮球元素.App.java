
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class APP {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    List<JLabel> label_List=new ArrayList<>();

    //构造方法
    public APP() {
        label_List.add(new JLabel());
        java.net.URL imgURL = APP.class.getResource("img/ball.png");
        label_List.get(0).setIcon(new ImageIcon(imgURL));
        label_List.get(0).setBounds(0,100,128,128);
        myPanel.add(label_List.get(0));

        label_List.add(new JLabel());
        label_List.get(1).setIcon(new ImageIcon(imgURL));
        label_List.get(1).setBounds(60,100,128,128);
        myPanel.add(label_List.get(1));

        label_List.add(new JLabel());
        label_List.get(2).setIcon(new ImageIcon(imgURL));
        label_List.get(2).setBounds(120,100,128,128);
        myPanel.add(label_List.get(2));
    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new APP().go();
    }
}
