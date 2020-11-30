package com.labsppwsg;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class notGridBag extends JFrame {
    notGridBag()
    {
        JButton paletaRight2;
        JLabel paletaLeft1;
        JButton paletaLeft2;
        JLabel paletaRight1;
        JTextField txt;
        Container container = getContentPane();

        //JPanel grid = new JPanel(new GridLayout(2, 5, 2, 2) );

        container.add(paletaLeft2 = new JButton("maxLeft"),BorderLayout.LINE_START);
        //container.add(paletaLeft1 = new JLabel("nearLeft"),BorderLayout.CENTER);
        container.add(txt = new JTextField("Hello world!"),BorderLayout.CENTER);
        //container.add(paletaRight1 = new JLabel("nearRight"));
        container.add(paletaRight2 = new JButton("maxLeft"),BorderLayout.LINE_END);





        // Создание панели с последовательным расположением
        // компонентов и выравниванием по правому краю
        //JPanel flow = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        //flow.add(grid);
        // Получение панели содержимого
        //Container container = getContentPane();
        // Размещение панели с кнопками внизу справа
        //container.add(flow, BorderLayout.SOUTH);

        JLabel label = new JLabel("status:");
        label.setBorder(new BevelBorder(BevelBorder.LOWERED));
        add(label,BorderLayout.SOUTH);
        //container.add(new JLabel ("East"), BorderLayout.EAST);

        // При отсутствии 2-го параметра компонент размещается в центре
        //container.add(new JButton("Центр"));
        // Открываем окно
        setVisible(true);

        JMenuBar mbar = new JMenuBar();
        setJMenuBar(mbar);

        JMenu file = new JMenu("File");
        mbar.add(file);
        JMenu tools = new JMenu("Tools");
        mbar.add(tools);
        //labels and buttons in Menu
        JButton brick = new JButton("Brick");
        tools.add(brick);
        JButton wall = new JButton("Wall");
        tools.add(wall);
        JButton floor = new JButton("Floor");
        tools.add(floor);
        JButton house = new JButton("House");
        tools.add(house);
        JButton shrek = new JButton("Play Shrek");
        shrek.setBackground(Color.pink);
        tools.add(shrek);
        JLabel somebody = new JLabel("Somebody");
        file.add(somebody);
        JLabel once = new JLabel("once");
        file.add(once);
        JLabel told = new JLabel("told me");
        file.add(told);
        JLabel world = new JLabel("the world");
        file.add(world);
        JLabel become = new JLabel("becomes");
        file.add(become);
        JLabel me = new JLabel("surround me");
        file.add(me);

        this.setTitle("notGridBag.Swing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setSize(500,300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new notGridBag();
    }
}
