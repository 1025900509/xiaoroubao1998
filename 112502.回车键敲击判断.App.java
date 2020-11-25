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
    JTextArea textArea_C=new JTextArea();
    //构造方法
    public app() {
        textArea_C.setText("按↓清空所有文本");
        textArea_C.setBounds(50,50,100,20);
        textArea_C.setBackground(Color.PINK);
        myPanel.add(textArea_C);
        textArea_A.setText("魔镜啊！魔镜~谁是这个世界上最帅的人！");
        textArea_A.setBounds(100,100,256,128);
        textArea_A.setBackground(Color.CYAN);
        myPanel.add(textArea_A);
        textArea_B.setBounds(100,300,256,128);
        textArea_B.setBackground(Color.PINK);
        myPanel.add(textArea_B);
        textArea_C.setText("按↓清空所有文本");
        textArea_C.setBounds(50,50,100,20);
        textArea_C.setBackground(Color.PINK);
        myPanel.add(textArea_C);

        textArea_A.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    textArea_A.setText("");
                    textArea_B.setText("");
                };
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (textArea_A .getText().equals("小肉包")) {
                        textArea_B.append("欢迎来到肉包联盟！\n");
                }else{
                    textArea_B.append("您无法进入联盟！懦夫！\n");
                }


            }
        };
    });}
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
