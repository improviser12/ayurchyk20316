package com.labsppwsg;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class Laboratorium5 extends JFrame{
    Laboratorium5()
    {
        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;


        JMenuBar mbar = new JMenuBar();
        gbl.setConstraints(mbar,gbc);
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

        //textbox
        JTextField txt = new JTextField("Hello world!");
        txt.setHorizontalAlignment(SwingConstants.CENTER);//wycentrowanie tekstu
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.fill = GridBagConstraints.BOTH;
        gbl.setConstraints(txt,gbc);
        add(txt);

        //statusBar
        JLabel label = new JLabel("status:");
        label.setBorder(new BevelBorder(BevelBorder.LOWERED));
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 5;
        gbc.gridheight = 1;
        gbc.weighty = 0.1;
        gbl.setConstraints(label,gbc);
        add(label);

        //palety left
        gbc.weightx = 0.3;
        gbc.weighty = 0.3;

        JLabel paletaLeft1 = new JLabel("near");
        paletaLeft1.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 3;
        gbl.setConstraints(paletaLeft1,gbc);
        add(paletaLeft1);

        JButton paletaLeft2 = new JButton("maxLeft");
        paletaLeft2.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 3;
        gbl.setConstraints(paletaLeft2,gbc);
        add(paletaLeft2);

        //palety right
        JLabel paletaRight1 = new JLabel("near");
        paletaRight1.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 3;
        gbl.setConstraints(paletaRight1,gbc);
        add(paletaRight1);

        JButton paletaRight2 = new JButton("maxRight");
        paletaRight2.setHorizontalAlignment(SwingConstants.CENTER);
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 3;
        gbl.setConstraints(paletaRight2,gbc);
        add(paletaRight2);

        /**********************************************************/

        this.setTitle("Lab5.Swing");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(gbl);
        this.pack();
        this.setSize(500,300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Laboratorium5();
    }
}