import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.lang.Runtime;
import java.util.Scanner;


public class GLC {
    public static void main(String[] args) {


        //Criacao de Componentes

        JInternalFrame jani1 = new JInternalFrame("IDENTIFICAÇÃO DO MATERIAL", false, true, false, false);
        JFrame f = new JFrame("Gerador de Etiqueta GPON");
        JDesktopPane desktop = new JDesktopPane();
        JPanel e = new JPanel();
        JButton b1 = new JButton("Etiqueta GPON");
        JButton b2 = new JButton("Imprimir");

        //Criacao de Campos


        //Obtendo data

        Calendar cal = new GregorianCalendar();
        int dia = cal.get(Calendar.DATE);
        int mes = cal.get(Calendar.MONTH) + 1;
        int ano = cal.get(Calendar.YEAR);


        JLabel FO = new JLabel("Fornecedor: ");
        JTextField CFO = new JTextField("HUAWEI DO BRASIL");


        JLabel DE = new JLabel("Descrição: ");
        JTextField CDE = new JTextField();


        JLabel CO = new JLabel("Cód. do Material:");
        JTextField CCO = new JTextField();


        JLabel Q = new JLabel("Quantidade:");
        JTextField CQ = new JTextField();


        JLabel P = new JLabel("Peso Bruto:");
        JTextField CP = new JTextField();


        JLabel PC = new JLabel("Pedido de Compra:");
        JTextField CPC = new JTextField();


        JLabel NF = new JLabel("Nota Fiscal:");
        JTextField CNF = new JTextField();


        JLabel DF = new JLabel("Data de Fabricação:");
        JTextField CDF = new JTextField(dia + "/" + mes + "/" + ano);


        JLabel CON = new JLabel("Contrato:");
        JTextField CCON = new JTextField();

        JLabel QE = new JLabel("Quantidade de Etiquetas:");
        JTextField CQE = new JTextField();

        //Propriedades dos JFrame

        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setSize(680, 280);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Propriedades dos JPanel esquerdo

        e.setBorder(BorderFactory.createEtchedBorder());
        e.setVisible(true);
        e.setLayout(new BoxLayout(e, BoxLayout.Y_AXIS));

        f.add(e, BorderLayout.WEST);

        e.add(b1);

        f.add(jani1);

        jani1.add(desktop);

        //Adicionando de campos JLabels e JTexts 

        FO.setBounds(10, 10, 150, 30);
        desktop.add(FO);

        CFO.setBackground(Color.white);
        CFO.setBounds(85, 15, 150, 22);
        desktop.add(CFO);

        DE.setBounds(245, 10, 150, 30);
        desktop.add(DE);

        CDE.setBackground(Color.white);
        CDE.setBounds(320, 15, 200, 22);
        desktop.add(CDE);

        CO.setBounds(10, 50, 150, 30);
        desktop.add(CO);

        CCO.setBackground(Color.white);
        CCO.setBounds(110, 55, 125, 22);
        desktop.add(CCO);

        Q.setBounds(245, 50, 150, 30);
        desktop.add(Q);

        CQ.setBackground(Color.white);
        CQ.setBounds(320, 55, 50, 22);
        desktop.add(CQ);

        P.setBounds(380, 50, 150, 30);
        desktop.add(P);

        CP.setBackground(Color.white);
        CP.setBounds(455, 55, 65, 22);
        desktop.add(CP);

        PC.setBounds(10, 90, 150, 30);
        desktop.add(PC);

        CPC.setBackground(Color.white);
        CPC.setBounds(125, 95, 150, 22);
        desktop.add(CPC);

        NF.setBounds(285, 90, 150, 30);
        desktop.add(NF);

        CNF.setBackground(Color.white);
        CNF.setBounds(360, 95, 160, 22);
        desktop.add(CNF);

        DF.setBounds(10, 130, 150, 30);
        desktop.add(DF);

        CDF.setBackground(Color.white);
        CDF.setBounds(130, 135, 145, 22);
        desktop.add(CDF);

        CON.setBounds(285, 130, 150, 30);
        desktop.add(CON);

        CCON.setBackground(Color.white);
        CCON.setBounds(345, 135, 175, 22);
        desktop.add(CCON);


        QE.setBounds(10, 170, 150, 30);
        desktop.add(QE);

        CQE.setBackground(Color.white);
        CQE.setBounds(160, 175, 115, 22);
        desktop.add(CQE);


        //Cada caractere digitado, chama o metodo toUperrr  

        CFO.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent m) {
                String s = CFO.getText().toUpperCase();
                CFO.setText(s);;
            }
        });

        CDE.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent m) {
                String s = CDE.getText().toUpperCase();
                CDE.setText(s);;
            }
        });

        CCO.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent m) {
                String s = CCO.getText().toUpperCase();
                CCO.setText(s);;
            }
        });

        CQ.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent m) {
                String s = CQ.getText().toUpperCase();
                CQ.setText(s);;
            }
        });

        CP.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent m) {
                String s = CP.getText().toUpperCase();
                CP.setText(s);;
            }
        });

        CPC.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent m) {
                String s = CPC.getText().toUpperCase();
                CPC.setText(s);;
            }
        });

        CNF.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent m) {
                String s = CNF.getText().toUpperCase();
                CNF.setText(s);;
            }
        });

        CDF.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent m) {
                String s = CDF.getText().toUpperCase();
                CDF.setText(s);;
            }
        });

        CCON.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent m) {
                String s = CCON.getText().toUpperCase();
                CCON.setText(s);;
            }
        });

        CQE.addKeyListener(new KeyAdapter() {
            @Override

            public void keyTyped(KeyEvent ev) {

                // código do evento:

                String caracteres = "0987654321";
                if (!caracteres.contains(ev.getKeyChar() + "")) {
                    ev.consume();
                }

            }

        });




        b2.setBounds(420, 175, 100, 22);
        desktop.add(b2);


        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jani1.setVisible(true);
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //Declarando variavel texto

                String texto = "^XA^LH{0},{1}^FO24,20^GB1132,4,4,B,0^FS^FO24,515^GB1132,4,4,B,0^FS^FO24,20^GB4,552,4,B,0^FS^FO1154,20^GB4,552,4,B,0^FS^FO24,75^GB1132,4,4,B,0^FS^FO24,130^GB1132,4,4,B,0^FS^FO24,185^GB1132,4,4,B,0^FS^FO24,240^GB1132,4,4,B,0^FS^FO24,295^GB1132,4,4,B,0^FS^FO24,350^GB1132,4,4,B,0^FS^FO24,405^GB1132,4,4,B,0^FS^FO24,460^GB1132,4,4,B,0^FS^FO431,78^GB4,494,4,B,0^FS^FO24,569^GB1132,4,4,B,0^FS^A0N,36^FO367,37^FH^FDIDENTIFICA_80_C7O DO MATERIAL^FS^A0N,36^FO36,87^FDFORNECEDOR^FS^A0N,36^FO36,145^FH^FDDESCRI_80_C7O^FS^A0N,36^FO36,199^FDCOD DO MATERIAL^FS^A0N,36^FO36,256^FDQUANTIDADE^FS^A0N,36^FO36,310^FDPESO BRUTO^FS^A0N,36^FO36,364^FDPEDIDO DE COMPRA^FS^A0N,36^FO36,418^FDNOTA FISCAL^FS^A0N,36^FO36,472^FH^FDDATA DE FABRICA_80_C7O^FS^A0N,36^FO36,527^FDCONTRATO^FS^A0N,36^FO443,87^FD" + CFO.getText() + "^FS^A0N,36^FO443,145^FD" + CDE.getText() + "^FS^A0N,36^FO443,199^FD" + CCO.getText() + "^FS^A0N,36^FO443,256^FD" + CQ.getText() + "^FS^A0N,36^FO443,310^FD" + CP.getText() + "^FS^A0N,36^FO443,364^FD" + CPC.getText() + "^FS^A0N,36^FO443,418^FD" + CNF.getText() + "^FS^A0N,36^FO443,472^FD" + CDF.getText() + "^FS^A0N,36^FO443,527^FD" + CCON.getText() + "^FS^PQ{" + CQE.getText() + "},0,1,Y^XZ";

                //Salvando arquivo

                FileWriter arquivo;
                try {
                    arquivo = new FileWriter(new File("arquivo.txt"));
                    arquivo.write(texto);
                    arquivo.close();
                } catch (IOException t) {
                    t.printStackTrace();
                } catch (Exception t) {
                    t.printStackTrace();
                }

                //Executando comando cmd

                try {
                    Process process = Runtime.getRuntime().exec("cmd.exe /c imprimir.bat");
                    Scanner leitor = new Scanner(process.getInputStream());
                    while (leitor.hasNextLine()) {
                        System.out.println(leitor.nextLine());
                    }
                } catch (IOException h) {
                    h.printStackTrace();
                }
            }
        });




    }
}