import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_qe=new JLabel();
    int CELL=30;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if(e.getKeyCode()==e.VK_UP){
                    label_qe.setBounds(label_qe.getX(),label_qe.getY()-CELL,CELL,CELL);
                } if(e.getKeyCode()==e.VK_LEFT){
                    label_qe.setBounds(label_qe.getX()-CELL,label_qe.getY(),CELL,CELL);
                } if(e.getKeyCode()==e.VK_DOWN){
                    label_qe.setBounds(label_qe.getX(),label_qe.getY()+CELL,CELL,CELL);
                } if(e.getKeyCode()==e.VK_RIGHT){
                    label_qe.setBounds(label_qe.getY()+CELL,label_qe.getY(),CELL,CELL);
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        label_txt.setText("这是一个Label标签。");
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);

        java.net.URL imgURL = App.class.getResource("img/2.png");
        label_qe.setIcon(new ImageIcon(imgURL));
        label_qe.setBounds(100,100,CELL,CELL);
        myPanel.add(label_qe);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);

        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
