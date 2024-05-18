import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyPanel extends JPanel {
    JButton button_generator;
    Integer[] options = new Integer[30];
    JComboBox<Integer> select_quantity;
    MyListener m = new MyListener();

    MyPanel() {
        //заполнение массива для множественного выбора
        for (int i = 0; i < 30; i++)
            options[i] = i + 1;

        //создание select для выбора количества вариантов
        select_quantity = new JComboBox<>(options);
        select_quantity.addActionListener(m);
        select_quantity.setBounds(50, 50, 90, 20);
        add(select_quantity);

        // добавление кнопки для генерации вариантов
        button_generator = new JButton("Сгенерировать: ");
        button_generator.addActionListener(m);
        add(button_generator);


    }

    class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //Получаем выбранное значение количества вариантов из JCombobox
            Integer selectedValue = (Integer) select_quantity.getSelectedItem();

            //Если нажата кнопка сгенерировать вараинты заданий к ним и ответы
            if (e.getSource() == button_generator) {

                //заполнение файла вариантами заданий
                try {
                    XWPFDocument document = new XWPFDocument();
                    XWPFParagraph paragraph = document.createParagraph();
                    XWPFRun run = paragraph.createRun();
                    Task1 task = new Task1();
                    run.setText(task.fill());
                    FileOutputStream out_variants = new FileOutputStream("Варианты.docx");
                    document.write(out_variants);
                    out_variants.close();
                    document.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                // заполнение файла с ответами
                try {
                    XWPFDocument document = new XWPFDocument();
                    XWPFParagraph paragraph = document.createParagraph();
                    XWPFRun run = paragraph.createRun();
                    run.setText("Ура!");
                    FileOutputStream out_answers = new FileOutputStream("Ответы.docx");
                    document.write(out_answers);
                    out_answers.close();
                    document.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        }
    }
}
