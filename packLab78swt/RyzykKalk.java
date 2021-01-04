package com.packLab78swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;

public class RyzykKalk {
    public static void main (String [] args) {
        Display display = new Display ();
        Shell shell = new Shell(display,SWT.SHELL_TRIM & (~SWT.MAX) & (~SWT.RESIZE)); //cant change size (style)

        /************************Wiek************************/
        Label lwiek = new Label(shell, SWT.NONE);
        lwiek.setText("Wiek:");
        lwiek.setBounds(10,10,40,20);
        Text wiek = new Text (shell, SWT.NONE);
        wiek.setBounds(53,10,35,20);

        Label lplec = new Label(shell, SWT.NONE);
        lplec.setText("Płeć:");
        lplec.setBounds(10,45,40,20);
        /************************GRUPA płci***********************************/
        Group plgr = new Group(shell,SWT.NONE);
        plgr.setBounds(53,30,87,40);
        /********************************************************************/
        Button bplecm = new Button(plgr, SWT.RADIO);
        bplecm.setBounds(3,17,40,17);
        bplecm.setText("M");
        Button bplecf = new Button(plgr, SWT.RADIO);
        bplecf.setBounds(46,17,40,17);
        bplecf.setText("F");

        Label palenie = new Label(shell, SWT.NONE);
        palenie.setText("Palisz?");
        palenie.setBounds(10,80,45,20);
        /************************GRUPA palenie***********************************/
        Group pal = new Group(shell,SWT.NONE);
        pal.setBounds(58,65,100,40);
        /***********************************************************************/
        Button tak = new Button(pal, SWT.RADIO);
        tak.setBounds(3,15,43,20);
        tak.setText("Tak");
        Button nie = new Button(pal, SWT.RADIO);
        nie.setBounds(49,15,43,20);
        nie.setText("Nie");

        /***********************cisnienie***********************/
        Label lcisnienie = new Label(shell, SWT.NONE);
        lcisnienie.setText("Ciśnienie tętnicze:");
        lcisnienie.setBounds(10,115,120,20);

        Text cisnienie = new Text (shell, SWT.NONE);
        cisnienie.setBounds(133,115,35,20);

        Label lcholesterol = new Label(shell, SWT.NONE);
        lcholesterol.setText("Cholesterol:");
        lcholesterol.setBounds(10,150,80,20);

        /************************GRUPA (mmol/l)***********************************/
        Group volume = new Group (shell,SWT.NONE);
        volume.setBounds(156,138,246,36);
        /************************GRUPA (mg/dl)***********************************/
        Group mass = new Group (shell, SWT.NONE);
        mass.setBounds(156,174,246,36);
        /***********************************************************************/

        Label jed1 = new Label(shell, SWT.NONE);
        jed1.setText("(mmol/l)");
        jed1.setBounds(93,150,60,20);

        Label jed2 = new Label(shell, SWT.NONE);
        jed2.setText("(mg/dl)");
        jed2.setBounds(93,185,60,20);

        /*****************Buttons cholesterol*****************/
        Button num11 = new Button(volume, SWT.RADIO);
        num11.setBounds(3,13,45,20);
        num11.setText("4");

        Button num12 = new Button(mass, SWT.RADIO);
        num12.setBounds(3,12,45,20);
        num12.setText("150");

        Button num21 = new Button(volume, SWT.RADIO);
        num21.setBounds(51,13,45,20);
        num21.setText("5");

        Button num22 = new Button(mass, SWT.RADIO);
        num22.setBounds(51,12,45,20);
        num22.setText("190");

        Button num31 = new Button(volume, SWT.RADIO);
        num31.setBounds(99,13,45,20);
        num31.setText("6");

        Button num32 = new Button(mass, SWT.RADIO);
        num32.setBounds(99,12,45,20);
        num32.setText("230");

        Button num41 = new Button(volume, SWT.RADIO);
        num41.setBounds(147,13,45,20);
        num41.setText("7");

        Button num42 = new Button(mass, SWT.RADIO);
        num42.setBounds(147,12,45,20);
        num42.setText("270");

        Button num51 = new Button(volume, SWT.RADIO);
        num51.setBounds(195,13,45,20);
        num51.setText("8");

        Button num52 = new Button(mass, SWT.RADIO);
        num52.setBounds(195,12,45,20);
        num52.setText("310");

        /*********************equals button*********************/
        Button calc = new Button(shell, SWT.NONE);
        calc.setText("Calculate");
        calc.setBounds(400,220,100,40);

        /************************output************************/
        Label concl = new Label(shell,SWT.NONE);
        concl.setText("Ryzyk miażdżycy:");
        concl.setBounds(10,275,120,20);

        Label ryzyk = new Label(shell, SWT.NONE);
        ryzyk.setBounds(143,275,30,20);
        ryzyk.setText("0 %");
        ryzyk.setEnabled(false);
        /*******************okna dialogowe********************/
        int styleMB = SWT.APPLICATION_MODAL | SWT.OK | SWT.CANCEL | SWT.ICON_ERROR;
        int styleMB2 = SWT.APPLICATION_MODAL | SWT.OK | SWT.CANCEL | SWT.ICON_INFORMATION;
        int styleMB3 = SWT.APPLICATION_MODAL | SWT.OK | SWT.CANCEL | SWT.ICON_WARNING;
        int styleMB4 = SWT.APPLICATION_MODAL | SWT.OK | SWT.CANCEL | SWT.ICON_QUESTION;
        MessageBox mBpalenie = new MessageBox(shell,styleMB2);
        mBpalenie.setText("Error!");
        mBpalenie.setMessage("Wybierz, pali człowiek czy nie!");
        MessageBox mBzawznak = new MessageBox(shell, styleMB);
        mBzawznak.setText("Textfild!");
        mBzawznak.setMessage("Pole tekstowe wiek/ciśnienie tętnicze zawiera literę lub inny znak!");
        MessageBox mBcisnienie = new MessageBox(shell, styleMB3);
        mBcisnienie.setText("Warning!");
        mBcisnienie.setMessage("Ciśnienie jest bardzo wysokie/niskie. Proszę pisać prawdę!");
        MessageBox mBduzolat = new MessageBox(shell, styleMB3);
        MessageBox mBmalolat = new MessageBox(shell, styleMB4);
        MessageBox mBniesmiert = new MessageBox(shell, styleMB2);
        mBniesmiert.setText("Witam!");
        mBduzolat.setText("Wiek!");
        mBmalolat.setText("Wiek!");
        mBniesmiert.setMessage("You are immortal! Please, stop using this calculator, u cant be sick!");
        mBduzolat.setMessage("Bardzo wysoki ryzyk!");
        mBmalolat.setMessage("Napewno chorujesz na to mając tyle lat?");

        Menu menuBar = new Menu (shell, SWT.BAR);
        shell.setMenuBar (menuBar);
        MenuItem fontDial = new MenuItem (menuBar, SWT.CASCADE);
        fontDial.setText ("FontDialog");
        MenuItem fileDial = new MenuItem(menuBar, SWT.CASCADE);
        fileDial.setText("FileDialog");
        MenuItem dirDial = new MenuItem (menuBar, SWT.CASCADE);
        dirDial.setText ("DirectoryDialog");
        MenuItem colDial = new MenuItem (menuBar, SWT.CASCADE);
        colDial.setText ("ColorDialog");
        colDial.addListener(SWT.Selection, new Listener() {
            @Override
            public void handleEvent(Event event) {
                ColorDialog dlg = new ColorDialog(shell);
                RGB rgb = dlg.open();
                if (rgb != null) {
                    Color color = new Color(shell.getDisplay(), rgb);
                    System.out.println(color.getRGB());
                    color.dispose();
                }
            }
        });
        dirDial.addListener(SWT.Selection, new Listener() {
            @Override
            public void handleEvent(Event event) {
                DirectoryDialog dlg = new DirectoryDialog(shell, SWT.OPEN);
                dlg.setFilterPath("d:\\Games");
                dlg.open();
            }
        });
        fileDial.addListener(SWT.Selection, new Listener() {
            @Override
            public void handleEvent(Event event) {
                FileDialog dlg = new FileDialog(shell, SWT.OPEN);
                dlg.open();
            }
        });
        fontDial.addListener(SWT.Selection, new Listener() {
            @Override
            public void handleEvent(Event event) {
                FontDialog dlg = new FontDialog(shell);
                FontData font = dlg.open();
                if (font != null)
                    System.out.println (font.toString());
            }
        });



        /*****Listeners na ostatnie 2 wierszy przycisków******/
        //region ost. przyciski
        num11.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                num12.setSelection(true);
                num22.setSelection(false);
                num32.setSelection(false);
                num42.setSelection(false);
                num52.setSelection(false);
            }
        });
        num21.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                num22.setSelection(true);
                num12.setSelection(false);
                num32.setSelection(false);
                num42.setSelection(false);
                num52.setSelection(false);
            }
        });
        num31.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                num32.setSelection(true);
                num12.setSelection(false);
                num22.setSelection(false);
                num42.setSelection(false);
                num52.setSelection(false);
            }
        });
        num41.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                num42.setSelection(true);
                num12.setSelection(false);
                num22.setSelection(false);
                num32.setSelection(false);
                num52.setSelection(false);
            }
        });
        num51.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                num52.setSelection(true);
                num12.setSelection(false);
                num22.setSelection(false);
                num32.setSelection(false);
                num42.setSelection(false);
            }
        });
        num12.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                num11.setSelection(true);
                num21.setSelection(false);
                num31.setSelection(false);
                num41.setSelection(false);
                num51.setSelection(false);
            }
        });
        num22.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                num21.setSelection(true);
                num11.setSelection(false);
                num31.setSelection(false);
                num41.setSelection(false);
                num51.setSelection(false);
            }
        });
        num32.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                num31.setSelection(true);
                num11.setSelection(false);
                num21.setSelection(false);
                num41.setSelection(false);
                num51.setSelection(false);
            }
        });
        num42.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                num41.setSelection(true);
                num11.setSelection(false);
                num21.setSelection(false);
                num31.setSelection(false);
                num51.setSelection(false);
            }
        });
        num52.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                num51.setSelection(true);
                num11.setSelection(false);
                num21.setSelection(false);
                num31.setSelection(false);
                num41.setSelection(false);
            }
        });
        //endregion

        /*******************Część logiczna*******************/

        /**Arrays**/
        //region men niepal
        final int[][] mn40 = new int[][]{
                {1, 1, 1, 1, 1},
                {1, 1, 1, 2, 2},
                {1, 2, 2, 2, 3},
                {2, 2, 3, 3, 4}
        };
        final int[][] mn50 = new int[][]{
                {2, 2, 2, 3, 3},
                {2, 3, 3, 4, 5},
                {3, 4, 5, 6, 7},
                {5, 6, 7, 8, 9}
        };
        final int[][] mn55 = new int[][]{
                {2, 3, 3, 4, 5},
                {3, 4, 5, 6, 7},
                {5, 6, 7, 8, 10},
                {7, 8, 10, 12, 14}
        };
        final int[][] mn60 = new int[][]{
                {4, 4, 5, 6, 8},
                {5, 6, 8, 9, 11},
                {8, 9, 11, 13, 15},
                {11, 13, 15, 18, 21}
        };
        final int[][] mn65 = new int[][]{
                {6, 7, 9, 10, 12},
                {9, 10, 12, 14, 17},
                {12, 14, 17, 20, 24},
                {17, 20, 24, 28, 32}
        };
        final int[][] mn70 = new int[][]{
                {10, 12, 14, 17, 20},
                {14, 17, 20, 24, 28},
                {20, 24, 28, 32, 38},
                {28, 33, 38, 43, 50}
        };
        //endregion
        //region men pal
        final int[][] mp40 = new int[][]{
                {1, 1, 2, 2, 3},
                {2, 2, 3, 3, 4},
                {3, 3, 4, 4, 5},
                {4, 4, 5, 6, 8}
        };
        final int[][] mp50 = new int[][]{
                {3, 4, 5, 5, 6},
                {5, 5, 6, 8, 9},
                {6, 8, 9, 11, 13},
                {9, 11, 13, 16, 18}
        };
        final int[][] mp55 = new int[][]{
                {5, 6, 7, 8, 10},
                {7, 8, 10, 12, 14},
                {10, 12, 14, 17, 20},
                {14, 17, 20, 23, 27}
        };
        final int[][] mp60 = new int[][]{
                {7, 9, 11, 13, 15},
                {11, 13, 15, 18, 21},
                {15, 18, 21, 25, 29},
                {21, 25, 29, 34, 39}
        };
        final int[][] mp65 = new int[][]{
                {12, 14, 17, 20, 23},
                {17, 20, 23, 27, 32},
                {23, 27, 32, 37, 43},
                {32, 37, 43, 49, 55}
        };
        final int[][] mp70 = new int[][]{
                {20, 23, 27, 32, 37},
                {27, 32, 37, 43, 49},
                {37, 43, 49, 55, 62},
                {49, 56, 62, 69, 76}
        };
        //endregion
        //region women niepal
        final int[][] wn40 = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        final int[][] wn50 = new int[][]{
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 2},
                {1, 1, 2, 2, 2},
                {2, 2, 2, 3, 3}
        };
        final int[][] wn55 = new int[][]{
                {1, 1, 1, 1, 2},
                {1, 1, 2, 2, 3},
                {2, 2, 3, 3, 4},
                {3, 3, 4, 4, 5}
        };
        final int[][] wn60 = new int[][]{
                {2, 2, 2, 3, 3},
                {2, 3, 3, 4, 5},
                {3, 4, 5, 5, 7},
                {5, 6, 7, 8, 9}
        };
        final int[][] wn65 = new int[][]{
                {3, 3, 4, 5, 6},
                {4, 5, 6, 7, 9},
                {6, 7, 9, 10, 12},
                {9, 10, 12, 15, 17}
        };
        final int[][] wn70 = new int[][]{
                {6, 7, 8, 10, 12},
                {8, 10, 12, 14, 17},
                {12, 14, 17, 20, 24},
                {17, 20, 24, 28, 32}
        };
        //endregion
        //region women pal
        final int[][] wp40 = new int[][]{
                {0, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 2, 2},
                {1, 2, 2, 2, 3}
        };
        final int[][] wp50 = new int[][]{
                {1, 1, 2, 2, 2},
                {2, 2, 2, 3, 3},
                {2, 3, 3, 4, 5},
                {3, 4, 5, 5, 7}
        };
        final int[][] wp55 = new int[][]{
                {2, 2, 3, 3, 4},
                {3, 3, 4, 4, 5},
                {4, 4, 5, 6, 7},
                {5, 6, 8, 9, 11}
        };
        final int[][] wp60 = new int[][]{
                {3, 4, 4, 5, 6},
                {5, 5, 6, 8, 9},
                {6, 8, 9, 11, 13},
                {9, 11, 13, 15, 18}
        };
        final int[][] wp65 = new int[][]{
                {6, 7, 8, 10, 12},
                {8, 10, 12, 14, 17},
                {12, 14, 17, 20, 23},
                {17, 20, 24, 28, 32}
        };
        final int[][] wp70 = new int[][]{
                {12, 14, 17, 20, 23},
                {17, 20, 23, 27, 32},
                {23, 27, 32, 37, 42},
                {32, 37, 43, 49, 55}
        };
        //endregion
        /**Calculate**/
        //region calculate
        calc.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if(bplecm.getSelection()){
                    if(tak.getSelection()){
                        try {
                            if (Integer.parseInt(wiek.getText()) >= 40 & Integer.parseInt(wiek.getText()) < 50) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp40[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp40[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp40[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp40[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp40[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp40[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp40[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp40[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp40[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp40[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp40[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp40[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp40[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp40[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp40[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp40[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp40[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp40[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp40[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp40[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 50 & Integer.parseInt(wiek.getText()) < 55) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp50[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp50[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp50[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp50[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp50[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp50[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp50[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp50[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp50[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp50[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp50[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp50[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp50[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp50[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp50[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp50[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp50[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp50[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp50[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp50[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 55 & Integer.parseInt(wiek.getText()) < 60) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp55[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp55[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp55[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp55[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp55[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp55[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp55[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp55[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp55[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp55[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp55[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp55[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp55[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp55[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp55[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp55[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp55[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp55[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp55[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp55[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 60 & Integer.parseInt(wiek.getText()) < 65) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp60[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp60[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp60[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp60[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp60[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp60[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp60[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp60[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp60[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp60[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp60[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp60[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp60[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp60[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp60[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp60[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp60[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp60[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp60[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp60[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 65 & Integer.parseInt(wiek.getText()) < 70) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp65[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp65[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp65[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp65[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp65[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp65[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp65[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp65[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp65[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp65[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp65[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp65[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp65[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp65[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp65[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp65[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp65[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp65[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp65[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp65[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 70 & Integer.parseInt(wiek.getText()) < 75) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp70[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp70[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp70[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp70[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp70[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp70[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp70[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp70[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp70[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp70[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp70[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp70[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp70[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp70[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp70[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mp70[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mp70[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mp70[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mp70[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mp70[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) < 40 & Integer.parseInt(wiek.getText()) > 0){
                                mBmalolat.open();
                            }
                            if (Integer.parseInt(wiek.getText()) >= 75 & Integer.parseInt(wiek.getText()) < 140){
                                mBduzolat.open();
                            }
                            if (Integer.parseInt(wiek.getText()) >= 140){
                                mBniesmiert.open();
                            }
                        }
                        catch (NumberFormatException numberFormatException) {
                            mBzawznak.open();
                        }
                    }
                    if (nie.getSelection()){
                        try {
                            if (Integer.parseInt(wiek.getText()) >= 40 & Integer.parseInt(wiek.getText()) < 50) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn40[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn40[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn40[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn40[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn40[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn40[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn40[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn40[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn40[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn40[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn40[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn40[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn40[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn40[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn40[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn40[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn40[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn40[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn40[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn40[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 50 & Integer.parseInt(wiek.getText()) < 55) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn50[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn50[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn50[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn50[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn50[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn50[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn50[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn50[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn50[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn50[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn50[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn50[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn50[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn50[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn50[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn50[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn50[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn50[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn50[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn50[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 55 & Integer.parseInt(wiek.getText()) < 60) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn55[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn55[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn55[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn55[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn55[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn55[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn55[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn55[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn55[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn55[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn55[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn55[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn55[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn55[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn55[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn55[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn55[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn55[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn55[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn55[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 60 & Integer.parseInt(wiek.getText()) < 65) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn60[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn60[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn60[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn60[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn60[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn60[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn60[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn60[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn60[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn60[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn60[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn60[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn60[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn60[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn60[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn60[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn60[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn60[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn60[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn60[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 65 & Integer.parseInt(wiek.getText()) < 70) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn65[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn65[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn65[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn65[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn65[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn65[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn65[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn65[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn65[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn65[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn65[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn65[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn65[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn65[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn65[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn65[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn65[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn65[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn65[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn65[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 70 & Integer.parseInt(wiek.getText()) < 75) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn70[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn70[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn70[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn70[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn70[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn70[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn70[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn70[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn70[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn70[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn70[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn70[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn70[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn70[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn70[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(mn70[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(mn70[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(mn70[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(mn70[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(mn70[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) < 40 & Integer.parseInt(wiek.getText()) > 0){
                                mBmalolat.open();
                            }
                            if (Integer.parseInt(wiek.getText()) >= 75 & Integer.parseInt(wiek.getText()) < 140){
                                mBduzolat.open();
                            }
                            if (Integer.parseInt(wiek.getText()) >= 140){
                                mBniesmiert.open();
                            }
                        }
                        catch (NumberFormatException numberFormatException) {
                            mBzawznak.open();
                        }
                    }
                    if (!tak.getSelection() & !nie.getSelection()){
                        mBpalenie.open();
                    }
                }
                if(bplecf.getSelection()){
                    if(tak.getSelection()){
                        try {
                            if (Integer.parseInt(wiek.getText()) >= 40 & Integer.parseInt(wiek.getText()) < 50) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp40[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp40[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp40[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp40[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp40[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp40[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp40[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp40[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp40[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp40[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp40[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp40[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp40[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp40[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp40[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp40[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp40[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp40[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp40[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp40[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 50 & Integer.parseInt(wiek.getText()) < 55) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp50[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp50[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp50[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp50[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp50[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp50[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp50[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp50[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp50[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp50[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp50[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp50[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp50[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp50[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp50[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp50[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp50[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp50[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp50[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp50[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 55 & Integer.parseInt(wiek.getText()) < 60) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp55[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp55[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp55[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp55[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp55[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp55[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp55[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp55[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp55[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp55[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp55[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp55[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp55[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp55[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp55[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp55[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp55[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp55[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp55[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp55[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 60 & Integer.parseInt(wiek.getText()) < 65) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp60[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp60[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp60[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp60[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp60[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp60[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp60[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp60[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp60[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp60[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp60[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp60[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp60[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp60[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp60[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp60[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp60[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp60[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp60[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp60[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 65 & Integer.parseInt(wiek.getText()) < 70) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp65[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp65[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp65[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp65[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp65[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp65[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp65[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp65[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp65[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp65[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp65[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp65[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp65[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp65[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp65[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp65[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp65[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp65[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp65[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp65[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 70 & Integer.parseInt(wiek.getText()) < 75) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp70[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp70[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp70[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp70[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp70[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp70[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp70[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp70[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp70[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp70[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp70[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp70[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp70[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp70[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp70[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wp70[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wp70[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wp70[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wp70[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wp70[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) < 40 & Integer.parseInt(wiek.getText()) > 0){
                                mBmalolat.open();
                            }
                            if (Integer.parseInt(wiek.getText()) >= 75 & Integer.parseInt(wiek.getText()) < 140){
                                mBduzolat.open();
                            }
                            if (Integer.parseInt(wiek.getText()) >= 140){
                                mBniesmiert.open();
                            }
                        }
                        catch (NumberFormatException numberFormatException) {
                            mBzawznak.open();
                        }
                    }
                    if (nie.getSelection()){
                        try {
                            if (Integer.parseInt(wiek.getText()) >= 40 & Integer.parseInt(wiek.getText()) < 50) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn40[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn40[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn40[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn40[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn40[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn40[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn40[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn40[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn40[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn40[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn40[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn40[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn40[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn40[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn40[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn40[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn40[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn40[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn40[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn40[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 50 & Integer.parseInt(wiek.getText()) < 55) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn50[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn50[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn50[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn50[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn50[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn50[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn50[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn50[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn50[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn50[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn50[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn50[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn50[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn50[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn50[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn50[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn50[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn50[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn50[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn50[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 55 & Integer.parseInt(wiek.getText()) < 60) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn55[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn55[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn55[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn55[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn55[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn55[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn55[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn55[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn55[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn55[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn55[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn55[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn55[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn55[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn55[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn55[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn55[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn55[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn55[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn55[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 60 & Integer.parseInt(wiek.getText()) < 65) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn60[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn60[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn60[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn60[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn60[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn60[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn60[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn60[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn60[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn60[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn60[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn60[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn60[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn60[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn60[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn60[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn60[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn60[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn60[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn60[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 65 & Integer.parseInt(wiek.getText()) < 70) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn65[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn65[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn65[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn65[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn65[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn65[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn65[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn65[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn65[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn65[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn65[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn65[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn65[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn65[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn65[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn65[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn65[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn65[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn65[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn65[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) >= 70 & Integer.parseInt(wiek.getText()) < 75) {
                                if (Integer.parseInt(cisnienie.getText()) >= 110 & Integer.parseInt(cisnienie.getText()) < 130) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn70[0][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn70[0][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn70[0][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn70[0][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn70[0][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 130 & Integer.parseInt(cisnienie.getText()) < 150) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn70[1][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn70[1][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn70[1][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn70[1][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn70[1][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 150 & Integer.parseInt(cisnienie.getText()) < 170) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn70[2][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn70[2][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn70[2][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn70[2][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn70[2][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) >= 170 & Integer.parseInt(cisnienie.getText()) < 190) {
                                    if (num11.getSelection()) {
                                        ryzyk.setText(wn70[3][0] + " %");
                                    }
                                    if (num21.getSelection()) {
                                        ryzyk.setText(wn70[3][1] + " %");
                                    }
                                    if (num31.getSelection()) {
                                        ryzyk.setText(wn70[3][2] + " %");
                                    }
                                    if (num41.getSelection()) {
                                        ryzyk.setText(wn70[3][3] + " %");
                                    }
                                    if (num51.getSelection()) {
                                        ryzyk.setText(wn70[3][4] + " %");
                                    }
                                }
                                if (Integer.parseInt(cisnienie.getText()) < 110 & Integer.parseInt(cisnienie.getText()) > 190){
                                    mBcisnienie.open();
                                }
                            }
                            if (Integer.parseInt(wiek.getText()) < 40 & Integer.parseInt(wiek.getText()) > 0){
                                mBmalolat.open();
                            }
                            if (Integer.parseInt(wiek.getText()) >= 75 & Integer.parseInt(wiek.getText()) < 140){
                                mBduzolat.open();
                            }
                            if (Integer.parseInt(wiek.getText()) >= 140){
                                mBniesmiert.open();
                            }
                        }
                        catch (NumberFormatException numberFormatException) {
                            mBzawznak.open();
                        }
                    }
                    if (!tak.getSelection() & !nie.getSelection()){
                        mBpalenie.open();
                    }
                }
            }
        });
        //endregion

        shell.setText("Ocena ryzyka miażdżycy");
        shell.setSize(530, 375);
        shell.open();
        //Window close handling
        while (!shell.isDisposed ())
        {
            if (!display.readAndDispatch ())
                display.sleep ();
        }
        //Operating system resources must be freed
        display.dispose ();
    }
}