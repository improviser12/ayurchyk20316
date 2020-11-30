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
        JPanel subPanel = new JPanel();
        subPanel.add(paletaLeft2 = new JButton("maxLeft"));
        subPanel.add(paletaLeft1 = new JLabel("nearLeft"));
        subPanel.add(txt = new JTextField("Hello world!"));
        subPanel.add(paletaRight1 = new JLabel("nearRight"));
        subPanel.add(paletaRight2 = new JButton("maxLeft"));
        subPanel.setLayout(new GridLayout(1,5));
        container.add(subPanel);


        JLabel label = new JLabel("status:");
        label.setBorder(new BevelBorder(BevelBorder.LOWERED));
        add(label,BorderLayout.SOUTH);

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
