import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        JFrame f=new JFrame("Hw");
        JLabel l=new JLabel("Student information");
        JTextField tf1=new JTextField("0");
        JTextField tf2=new JTextField("0");
        JTextField tf3=new JTextField();
        JTextField tf4=new JTextField();

        JLabel l1=new JLabel("Enter Student Name:");
        JLabel l2=new JLabel("Enter Student ID:");
        JLabel l3=new JLabel("scarch");
        JButton btn1=new JButton("set");
        JButton btn2=new JButton("scarch");

        l.setBounds(200,100,150,40);
        tf1.setBounds(200,150,200,40);
        tf2.setBounds(200,200,200,40);
        tf3.setBounds(200,300,200,40);
        tf4.setBounds(200,400,200,40);
        l1.setBounds(70,110,200,100);
        l2.setBounds(80,170,200,100);
        l3.setBounds(150,272,50,100);
        btn1.setBounds(250,250,100,30);
        btn2.setBounds(250,350,100,40);

        class ar {
            public int id;
            public String name;
            ar(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }

        ArrayList<ar> al = new ArrayList<>();


        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String J=String.valueOf(tf1.getText());
                int I=Integer.parseInt(tf2.getText());
                tf1.setText("");
                tf2.setText("");

                for (int i = 0; i <1; i++) {
                    al.add(new ar(I,J));
                }


                for (int i = 0; i < al.size(); i++) {
                    ar a = al.get(i);
                }





            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int scarch=Integer.parseInt(tf3.getText());
                int count=0;
                for (int i = 0; i < al.size(); i++) {
                    ar sc = al.get(i);
                    if(scarch==sc.id){
                        tf4.setText(sc.name);
                        count++;
                    }
                }
                if (count==0){
                    tf3.setText("Not match");
                    tf4.setText("");
                }else {
                    tf3.setText("Match");
                }
            }
        });




        f.add(l);
        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(btn1);
        f.add(btn2);
        f.setSize(1000,1000);
        f.setLayout(null);
        f.setVisible(true);


    }
}
