import java.awt.*;
import java.awt.event.*;
public class awtprogram  extends Frame {
    Button btn;
     awtprogram()
     {
        Button  btn=new Button("click me");
            btn.setBounds(50,100,80,30);
            add(btn);
            setSize(300,300);
            setTitle("My Button");
            setLayout(null);
            setVisible(true);
            btn.setBackground(Color.GREEN);


     }
     public static void main(String[] args) {
        awtprogram b=new awtprogram();
     }

}

