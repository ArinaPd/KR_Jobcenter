package Jobcenter;


import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MyFrame extends JFrame implements ActionListener {


    // Оголошення статичних кнопок
    static JButton button1;
    static JButton button2;
    static JButton button3;
    static JButton button4;
    static JButton button5;
    static JButton button6;
    static JButton button7;
    static JButton button8;

    User inspector1 = new Inspector("OMVU","Olena", "Radchenko",
            "+380936114545","Ukraine");

    User unemployed1 = new Unemployed(10, 2022, 121,
            "Alex", "Wox", "+3806922297171", "Ukraine");
    User unemployed2 = new Unemployed(5, 2021, 123,
            "Kate", "Kirschner", "+3809876545588", "Abroad");
    User unemployed3 = new Unemployed(0, 2013, 035,
            "George","Yog","+380637712345", "Abroad");

    Vacancy vacancy1 = new Vacancy("Ecologist","Ukraine", "+380505595454",
            2,101, 300);
    Vacancy vacancy2 = new Vacancy("Software Engineer", "Abroad", "+38076543210",
            0, 121, 1500);
    Vacancy vacancy3 = new Vacancy("Hardware Engineer", "Ukraine", "+3807899876654",
            5,123, 1000);


    public MyFrame() throws IOException {


// Створення об'єкта Border для обрамлення
        Border border = BorderFactory.createLineBorder(new Color(153,41,77),3);


// Створення панелі інформації
        JPanel infoPanel = new JPanel();
        infoPanel.setBackground(Color.LIGHT_GRAY);
        infoPanel.setBounds(600,50,400,538);


// Налаштування кнопки 1
        button1 = new JButton();
        button1.setBounds(0,50,300,100);
        button1.addActionListener(this);
        button1.setText("1. Кількість безробітних");
        button1.setFocusable(false);
        button1.setFont(new Font("Comic Sans",Font.ITALIC,20));
        button1.setForeground(new Color(153,41,77));
        button1.setBackground(Color.white);
        button1.setBorder(BorderFactory.createLineBorder(new Color(153,41,77),2));


// Налаштування кнопки 2
        button2 = new JButton();
        button2.setBounds(300,50,300,100);
        button2.addActionListener(this);
        button2.setText("2. Кількість вакансій");
        button2.setFocusable(false);
        button2.setFont(new Font("Comic Sans",Font.ITALIC,20));
        button2.setForeground(new Color(153,41,77));
        button2.setBackground(Color.white);
        button2.setBorder(BorderFactory.createLineBorder(new Color(153,41,77),2));


// Налаштування кнопки 3
        button3 = new JButton();
        button3.setBounds(0,150,600,100);
        button3.addActionListener(this);
        button3.setText("3. Скільки є вакансій за вказаною адресою");
        button3.setFocusable(false);
        button3.setFont(new Font("Comic Sans",Font.ITALIC,19));
        button3.setForeground(new Color(153,41,77));
        button3.setBackground(new Color(245,223,77));
        button3.setBorder(BorderFactory.createEtchedBorder());


// Налаштування кнопки 4
        button4 = new JButton();
        button4.setBounds(0,250,300,100);
        button4.addActionListener(this);
        button4.setText("4. Середня зарплатня");
        button4.setFocusable(false);
        button4.setFont(new Font("Comic Sans",Font.ITALIC,19));
        button4.setForeground(new Color(153,41,77));
        button4.setBackground(new Color(245,223,77));
        button4.setBorder(BorderFactory.createEtchedBorder());


// Налаштування кнопки 5
        button5 = new JButton();
        button5.setBounds(300,250,300,100);
        button5.addActionListener(this);
        button5.setText("5. Вакансія за спеціальністю");
        button5.setFocusable(false);
        button5.setFont(new Font("Comic Sans",Font.ITALIC,19));
        button5.setForeground(new Color(153,41,77));
        button5.setBackground(new Color(245,223,77));
        button5.setBorder(BorderFactory.createEtchedBorder());


// Налаштування кнопки 6
        button6 = new JButton();
        button6.setBounds(0,350,600,100);
        button6.addActionListener(this);
        button6.setText("6.Кількість безробітних може отримати роботу");
        button6.setFocusable(false);
        button6.setFont(new Font("Comic Sans",Font.ITALIC,19));
        button6.setForeground(new Color(153,41,77));
        button6.setBackground(new Color(245,223,77));
        button6.setBorder(BorderFactory.createEtchedBorder());


// Налаштування кнопки 7
        button7 = new JButton();
        button7.setBounds(0,450,300,100);
        button7.addActionListener(this);
        button7.setText("7. Анкети безробітних");
        button7.setFocusable(false);
        button7.setFont(new Font("Comic Sans",Font.ITALIC,19));
        button7.setForeground(new Color(153,41,77));
        button7.setBackground(Color.white);
        button7.setBorder(BorderFactory.createLineBorder(new Color(153,41,77),2));


// Налаштування кнопки 8
        button8 = new JButton();
        button8.setBounds(300,450,300,100);
        button8.addActionListener(this);
        button8.setText("8. Вакансії");
        button8.setFocusable(false);
        button8.setFont(new Font("Comic Sans",Font.ITALIC,19));
        button8.setForeground(new Color(153,41,77));
        button8.setBackground(Color.white);
        button8.setBorder(BorderFactory.createLineBorder(new Color(153,41,77),2));


// Створюємо JLabel для відображення вітання
        JLabel label = new JLabel();
        label.setText("Ласкаво просимо до служби зайнятості!");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(new Color(153,41,77));
        label.setFont(new Font("Arial",Font.BOLD,25));
        label.setBackground(Color.WHITE);
        label.setBorder(border);
        label.setBounds(0,0,600,50);


// Додавання компонентів до вікна
        this.setTitle("Jobcenter");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(600,588);
        this.setVisible(true);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(147,149,151));
        this.add(label);
        this.add(infoPanel);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        // Обробка події кнопки "Кількість безробітніх"
        if(e.getSource()==button1){
            unemployed1.getUnemployedCount();
            String message = "3 безробiтних";
            System.out.println("Загальна кількість безробітних: 3");
            JOptionPane.showMessageDialog(null, message, "Кількість безробітних",
                    JOptionPane.PLAIN_MESSAGE);
        }

        // Обробка події кнопки "Кількість вакансій"
        if (e.getSource() == button2) {
            vacancy1.nullVacCount();
            String message = String.format("%s вакансii", vacancy1.nullVacCount());
            System.out.println("Загальна кількість вакансiй:" + vacancy1.nullVacCount());
            JOptionPane.showMessageDialog(null, message, "Загальна кількість вакансiй:",
                    JOptionPane.PLAIN_MESSAGE);
        }

        // Обробка події кнопки "Кількість вакансій за адресою"
        if(e.getSource() == button3) {
            List<String> popularAddresses = Collections.singletonList(vacancy1.showPopularAddressVac(Collections.emptyList()));
            String message = "Скільки є вакансій за вказаною адресою:\n" + popularAddresses.size();
            System.out.println(message);
            JOptionPane.showMessageDialog(null, message, "Вакансій за адресою:", JOptionPane.PLAIN_MESSAGE);
        }

        // Обробка події кнопки "Середня зарплата"
        if(e.getSource()==button4){
            inspector1.calculateAverageSalary(vacancy1,vacancy2,vacancy3);
            String message = inspector1.calculateAverageSalary(vacancy1,vacancy2,vacancy3);
            System.out.println("Середня зарплата:" +
                    inspector1.calculateAverageSalary(vacancy1,vacancy2,vacancy3));
            JOptionPane.showMessageDialog(null, message, "Середня зарплата", JOptionPane.PLAIN_MESSAGE);
        }

        // Обробка події кнопки "Чи є потрібна вакансія для певного безробітнього"
        if(e.getSource()==button5){
            unemployed1.isMatchingSpeciality((Unemployed) unemployed1,vacancy1,vacancy2,vacancy3);
            String message1 = "Ваканciя для 1 безробiтнього:" +String.valueOf(
                    unemployed1.isMatchingSpeciality((Unemployed) unemployed1,vacancy1,vacancy2,vacancy3));;
            String message2 = "\nВаканciя для 2 безробiтнього:" +String.valueOf(
                    unemployed2.isMatchingSpeciality((Unemployed) unemployed1,vacancy1,vacancy2,vacancy3));
            String message3 = "\nВаканciя для 3 безробiтнього:" +String.valueOf(
                    unemployed3.isMatchingSpeciality((Unemployed) unemployed1,vacancy1,vacancy2,vacancy3));
            System.out.println(message1+message2+message3);
            JOptionPane.showMessageDialog(null, message1+message2+message3,
                    "Ваканciя для 1 безробiтнього:", JOptionPane.PLAIN_MESSAGE);
        }

        // Обробка події кнопки "Кількість безробітніх, які можуть отримати роботу"
        if(e.getSource()==button6){
            inspector1.countMatchingUnemployed(vacancy1,vacancy2,vacancy3,unemployed1,unemployed2,unemployed3);
            String message = String.valueOf(inspector1.countMatchingUnemployed(vacancy1,vacancy2,vacancy3,unemployed1,unemployed2,unemployed3));
            System.out.println("Отримають роботу: " + String.valueOf(inspector1.countMatchingUnemployed(vacancy1,vacancy2,vacancy3,unemployed1,unemployed2,unemployed3)));
            JOptionPane.showMessageDialog(null, message, "Отримають роботу", JOptionPane.PLAIN_MESSAGE);
        }

        // Обробка події кнопки "Анкети безробітніх"
        if (e.getSource() == button7) {
            String message1 = String.valueOf("\nДата звернення: 2022"+
                    "\nІм'я безробiтнього: Alex"+
                    "\nПрізвище безробiтнього: Wox" +
                    "\nАдреса безробiтнього: Ukraine" +
                    "\nНомер телефону: +3806922297171"+
                    "\nCпецiальнiсть: 121" +
                    "\nCтаж: 10");
            String message2 = String.valueOf("\nДата звернення: 2021"+
                    "\nІм'я безробiтнього: Kate"+
                    "\nПрізвище безробiтнього: Kirschner" +
                    "\nАдреса безробiтнього: Abroad" +
                    "\nНомер телефону: +3809876545588"+
                    "\nCпецiальнiсть: 123" +
                    "\nCтаж: 5");
            String message3 = String.valueOf("\nДата звернення: 2022"+
                    "\nІм'я безробiтнього: George"+
                    "\nПрізвище безробiтнього: Yog" +
                    "\nАдреса безробiтнього: Ukraine" +
                    "\nНомер телефону: +380637712345"+
                    "\nCпецiальнiсть: 035" +
                    "\nCтаж: 0");
            System.out.println(message1+message2+message3);
            JOptionPane.showMessageDialog(null, message1+message2+message3, "Анкети:", JOptionPane.PLAIN_MESSAGE);
        }

        // Обробка події кнопки "Вакансії"
        if (e.getSource() == button8) {
            vacancy1.showVacancy(vacancy1);
            vacancy2.showVacancy(vacancy2);
            vacancy3.showVacancy(vacancy3);
            String message1 = vacancy1.showVacancy(vacancy1);
            String message2 = vacancy2.showVacancy(vacancy2);
            String message3 = vacancy3.showVacancy(vacancy3);
            System.out.println(message1+message2+message3);
            JOptionPane.showMessageDialog(null, message1+message2+message3, "Вакансii:", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
