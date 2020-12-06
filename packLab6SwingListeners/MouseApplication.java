package com.packLab6SwingListeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.Color.*;

public class MouseApplication extends JFrame{

    JCheckBox click, wheelscr,press, curs, fokus;
    JButton restart,cl,pressed;
    JTextArea tf;
    JTextField tfm,status;

    MouseApplication()
    {
        /*******************************************Checkboxes*******************************************/
        //Click
        click = new JCheckBox("ON/OFF mouse click");
        click.setBounds(440,300,250,20);
        click.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                status.setText("Enable this function to change text on the first button (Click me!) by clicking on it");
            }
        });
        add(click);
        //Scroll the wheel
        wheelscr = new JCheckBox("ON/OFF scrolling the wheel");
        wheelscr.setBounds(440,320,250,20);
        wheelscr.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                status.setText("Enable this function to change text on the TextArea (Scroll the wheel there...) by scrolling the wheel on it");
            }
        });
        add(wheelscr);
        //Press
        press = new JCheckBox("ON/OFF pressing & releasing mouse");
        press.setBounds(440,340,250,20);
        press.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                status.setText("Enable this function to change text on the second button (Press me!) by pressing on it and releasing");
            }
        });
        add(press);
        curs = new JCheckBox("ON/OFF moving mouse");
        curs.setBounds(440,360,250,20);
        curs.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                status.setText("Enable this function to share your mouse cursor coordinates while moving the cursor in yellow TextField");
            }
        });
        add(curs);
        fokus = new JCheckBox("ON/OFF focusing on");
        fokus.setBounds(440,380,250,20);
        fokus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                status.setText("Function is changing text color on white while focusing on yellow TextField. When you unfocused its color will change to red");
            }
        });
        add(fokus);

        //Mouse click
        cl = new JButton("Click me!");
        cl.setBounds(12,12,200,30);
        cl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(click.isSelected()) {
                    cl.setText("You are good boy!");
                    status.setText("You stopped clicking");
                }
            }
        });

        add(cl);

        //Mouse wheel moved
        tf = new JTextArea("Scroll the wheel here...");
        tf.setEditable(false);
        tf.setBounds(12, 50,200,30);
        tf.addMouseWheelListener(new MouseAdapter() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(wheelscr.isSelected()) {
                    String message;
                    int notches = e.getWheelRotation();
                    if (notches < 0) {
                        message = "Mouse wheel moved UP ";
                    } else {
                        message = "Mouse wheel moved DOWN ";
                    }
                    tf.setText(message);
                    status.setText("You stopped scrolling the wheel");
                }
            }
        });
        add(tf);

        //Mouse pressed or released
        pressed = new JButton("Press me!");
        pressed.setBounds(12,88,200,30);
        pressed.setBackground(Color.CYAN);
        pressed.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(press.isSelected()) {
                    //pressed.setBackground(Color.RED);   //działa tylko gdy przestać utrzymywać w polu przycisku
                    pressed.setText("Please, stop pressing me");
                    status.setText("You pressed");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(press.isSelected()) {
                    pressed.setBackground(Color.GREEN);
                    pressed.setText("Thank you!");
                    status.setText("You released");
                }
            }
        });
        add(pressed);

        //Mouse moved, entered and exited
        tfm = new JTextField("Move mouse here!");
        tfm.setHorizontalAlignment(SwingConstants.CENTER);
        tfm.setBounds(12,126,420,200);
        tfm.setEditable(false);
        tfm.setBackground(ORANGE);
        tfm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if(fokus.isSelected()) {
                    tfm.setForeground(WHITE);
                    status.setText("You entered the zone");
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if(fokus.isSelected()) {
                    tfm.setForeground(RED);
                    status.setText("You left the zone");
                }
            }
        });
        tfm.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                if(curs.isSelected()) {
                    saySomething("Mouse is moving", e);
                    status.setText("Mouse is moving");
                }

            }
            void saySomething(String eventDescription, MouseEvent e) {
                tfm.setText(eventDescription
                        + " (" + e.getX() + "," + e.getY() + ")"
                        + " detected on "
                        + e.getComponent().getClass().getName()
                        + "\n");
            }
        });
        add(tfm);

        //Restart button
        restart = new JButton("Restart");
        restart.setBounds(12,350,420,50);
        restart.setBackground(BLACK);
        restart.setForeground(RED);
        restart.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //click
                cl.setText("Click me!");
                //scroll
                tf.setText("Scroll the wheel here...");
                //press and realesed
                pressed.setText("Press me!");
                pressed.setBackground(Color.CYAN);
                //move, enter and exit
                tfm.setForeground(BLACK);
                tfm.setText("Move mouse here!");
                //status
                status.setText("Status...");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                status.setText("Set all default");
            }
        });
        add(restart);

        status = new JTextField("Status...");
        status.setBounds(12,410,664,50);
        status.setBackground(GRAY);
        status.setForeground(WHITE);
        status.setEditable(false);
        add(status);


        this.setLayout(null);
        this.setTitle("Mouse listeners");
        this.setSize(700,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new MouseApplication();
    }
}
