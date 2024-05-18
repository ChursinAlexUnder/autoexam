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

    int numTask = 1, rows = 3, columns = 7;
    JCheckBox[][] checkboxes = new JCheckBox[rows][columns];
    JLabel[][] labels = new JLabel[rows][columns];
    JButton button_generator, selectAll;
    Integer[] options = new Integer[30];
    JComboBox<Integer> select_quantity;
    MyListener m = new MyListener();

    MyPanel() {

        JPanel selectAllPanel = new JPanel();

        // изменение основного JPanel для использования BorderLayout
        setLayout(new BorderLayout());

        // создание строки, в которой три столбца из галочек
        JPanel columnPanelContainer = new JPanel();
        columnPanelContainer.setLayout(new FlowLayout());

        for (int i = 0; i < rows; i++) {
            JPanel columnPanel = new JPanel();

            // регулировки для столбцов целиком
            columnPanel.setLayout(new GridLayout(0, 1));
            columnPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50));

            for (int j = 0; j < columns; j++) {
                checkboxes[i][j] = new JCheckBox();

                // фикс сдвига из-за одноразрядных и двуразрядных чисел
                if (numTask / 10 == 0) {
                    labels[i][j] = new JLabel("  " + numTask + " задание");
                } else {
                    labels[i][j] = new JLabel(numTask + " задание");
                }

                JPanel itemPanel = new JPanel(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.anchor = GridBagConstraints.WEST;

                // регулировка каждой строчки у каждого столбца
                gbc.insets = new Insets(0, 0, 15, 10);

                itemPanel.add(checkboxes[i][j], gbc);
                gbc.gridx = 1;
                itemPanel.add(labels[i][j], gbc);
                columnPanel.add(itemPanel);
                numTask++;
            }
            columnPanelContainer.add(columnPanel);
        }

        // добавление столбцов с галочками в центральную область основного JPanel
        add(columnPanelContainer, BorderLayout.CENTER);

        // кнопка "выбрать всё"
        selectAll = new JButton("Выбрать все");
        selectAll.addActionListener(m);
        selectAllPanel.add(selectAll);
        selectAllPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 200, 50));

        // добавление кнопки "выбрать всё" в нижнюю область основного JPanel
        add(selectAllPanel, BorderLayout.SOUTH);

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

            if (e.getSource() == selectAll) {
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        checkboxes[i][j].setSelected(true);
                    }
                }
            }

            //Если нажата кнопка сгенерировать вараинты заданий к ним и ответы
            if (e.getSource() == button_generator) {

                //заполнение файла вариантами заданий
                try {
                    XWPFDocument document = new XWPFDocument();
                    XWPFParagraph paragraph = document.createParagraph();
                    XWPFRun run = paragraph.createRun();
                    Task[] task = new Task[]{new Task1(), new Task2()};
                    for (int i = 0; i < 2; i++) run.setText(task[i].fill());
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
