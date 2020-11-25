package App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class app {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JTextArea textArea_A=new JTextArea();
    JTextArea textArea_B=new JTextArea();
    //构造方法
    public app() {
        textArea_A.setText("点击上↑键输出文字");
        textArea_A.setBounds(100,100,256,128);
        textArea_A.setBackground(Color.CYAN);
        myPanel.add(textArea_A);
        textArea_B.setBounds(100,300,256,128);
        textArea_B.setBackground(Color.PINK);
        myPanel.add(textArea_B);

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    textArea_B.append("欢迎来到德莱联盟！\n");
                } if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    textArea_B.append("欢迎来到祖安联盟！\n");
                }  if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    textArea_B.append("欢迎来到包子联盟！\n");
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    textArea_B.setText("");
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("TestGUI");
        myPanel.setLayout(null);
        myPanel.add(label_txt);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new app().go();
    }
}
