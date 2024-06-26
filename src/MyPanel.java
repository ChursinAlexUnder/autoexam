import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;

import org.apache.poi.xwpf.usermodel.*;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


public class MyPanel extends JPanel {

    int numTask = 1, rows = 3, columns = 7;
    JCheckBox[][] checkboxes = new JCheckBox[rows][columns];
    JLabel[][] labels = new JLabel[rows][columns];
    JButton button_generator, selectAll;
    Integer[] options = new Integer[30];
    JComboBox<Integer> select_quantity;
    JLabel countVar = new JLabel("Выберите количество вариантов: ");
    MyListener m = new MyListener();
    JPanel buttonsPanel = new JPanel(), select_quantityPanel = new JPanel(), centerPanel = new JPanel(new GridBagLayout());

    MyPanel() {

        // изменение основного JPanel для использования BorderLayout
        setLayout(new BorderLayout());

        // создание строки, в которой три столбца из галочек
        JPanel columnPanelContainer = new JPanel();
        columnPanelContainer.setLayout(new FlowLayout());

        for (int i = 0; i < rows; i++) {
            JPanel columnPanel = new JPanel();

            // регулировки для столбцов целиком
            columnPanel.setLayout(new GridLayout(0, 1));
            columnPanel.setBorder(BorderFactory.createEmptyBorder(30, 50, 10, 50));

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
                checkboxes[i][j].addActionListener(m);
                gbc.gridx = 1;
                itemPanel.add(labels[i][j], gbc);
                columnPanel.add(itemPanel);
                numTask++;
            }
            columnPanelContainer.add(columnPanel);
        }
        // добавление столбцов с галочками в центральную область основного JPanel
        add(columnPanelContainer, BorderLayout.CENTER);

        // кнопка "выбрать всё" и "сгенерировать"
        buttonsPanel.setLayout(new BoxLayout(buttonsPanel, BoxLayout.Y_AXIS));

        selectAll = new JButton("Выбрать все");
        selectAll.addActionListener(m);
        selectAll.setBackground(Color.decode("#48d1cc"));
        selectAll.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(selectAll);
        buttonsPanel.add(Box.createRigidArea(new Dimension(0, 90)));

        button_generator = new JButton("Сгенерировать");
        button_generator.addActionListener(m);
        button_generator.setMargin(new Insets(20, 50, 20, 50));
        button_generator.setBackground(Color.decode("#00ffa6"));
        Font currentFont = button_generator.getFont();
        Font newFont = new Font(currentFont.getName(), currentFont.getStyle(), 20);
        button_generator.setFont(newFont);
        button_generator.setAlignmentX(Component.CENTER_ALIGNMENT);
        buttonsPanel.add(button_generator);

        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 45, 50));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 50, 0, 50);
        centerPanel.add(buttonsPanel, gbc);
        add(centerPanel, BorderLayout.SOUTH);

        //заполнение массива для множественного выбора
        for (int i = 0; i < 30; i++)
            options[i] = i + 1;

        //создание select для выбора количества вариантов
        select_quantity = new JComboBox<>(options);
        select_quantity.addActionListener(m);
        select_quantity.setBounds(50, 50, 90, 20);
        select_quantityPanel.add(countVar);
        select_quantityPanel.add(select_quantity);
        add(select_quantityPanel, BorderLayout.NORTH);
    }

    public String formatNum(double number) {
        // Задаем символы для десятичного разделителя и разделителя групп
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator(' ');

        // Задаем шаблон для форматирования
        DecimalFormat decimalFormat = new DecimalFormat("#.##################", symbols);

        // Форматируем число
        return decimalFormat.format(number);
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

            // Если нажата кнопка сгенерировать варианты заданий к ним и ответы
            if (e.getSource() == button_generator) {
                try {
                    XWPFDocument document = new XWPFDocument();
                    XWPFDocument document_ans = new XWPFDocument();
                    XWPFParagraph[] paragraph = new XWPFParagraph[selectedValue];
                    XWPFParagraph[] paragraph_ans = new XWPFParagraph[selectedValue];

                    for (int i = 0; i < selectedValue; i++) {
                        paragraph[i] = document.createParagraph();
                        XWPFRun run1 = paragraph[i].createRun();
                        paragraph_ans[i] = document_ans.createParagraph();
                        XWPFRun run1_ans = paragraph_ans[i].createRun();

                        Task[] task = new Task[]{new Task1(), new Task2(), new Task3(), new Task4(), new Task5(),
                                new Task6(), new Task7(), new Task8(), new Task9(), new Task10(), new Task11(),
                                new Task12(), new Task13(), new Task14(), new Task15(), new Task16(), new Task17(),
                                new Task18(), new Task19(), new Task20(), new Task21()};

                        int numbertask = 0, index = i + 1;
                        run1.setText("Вариант - " + index);
                        run1.setFontSize(18);
                        run1.setTextPosition(50);
                        run1.addBreak();

                        run1_ans.setText("Вариант - " + index);
                        run1_ans.setFontSize(18);
                        run1_ans.setTextPosition(50);
                        run1_ans.addBreak();

                        for (int k = 0; k < 3; k++) {
                            for (int j = 0; j < 7; j++) {
                                if (checkboxes[k][j].isSelected()) {
                                    XWPFRun run2 = paragraph[i].createRun();
                                    XWPFRun run2_ans = paragraph_ans[i].createRun();

                                    run2.setText(task[numbertask].fill());
                                    run2_ans.setText(task[numbertask].answer());

                                    if (numbertask == 15 || numbertask == 16 || numbertask == 17) {
                                        run2.addBreak();
                                        int numbertask_img = numbertask + 1;
                                        String variant = Integer.toString(numbertask_img);
                                        if (task[numbertask].getVariant() == 5)
                                            variant += "_5.png";
                                        else variant += "_6.png";
                                        FileInputStream imageStream = new FileInputStream(System.getProperty("user.dir") + "/src/" + variant);
                                        run2.addPicture(imageStream, XWPFDocument.PICTURE_TYPE_PNG, "variant", Units.toEMU(140), Units.toEMU(75));
                                        imageStream.close();
                                    }

                                    // Вставка таблицы
                                    if (numbertask == 14) {
                                        // Создание таблицы X
                                        XWPFTable tableX = document.createTable(2, 5);
                                        for (int row = 0; row < 2; row++) {
                                            XWPFTableRow tableRow = tableX.getRow(row);
                                            for (int col = 0; col < 5; col++) {
                                                XWPFTableCell cell = tableRow.getCell(col);
                                                if (col >= 2 && col != 3 && row == 1) {
                                                    cell.setText(formatNum(Double.parseDouble(task[numbertask].getTableX()[row][col])));
                                                } else {
                                                    cell.setText(task[numbertask].getTableX()[row][col]);
                                                }
                                                cell.setWidth("600");
                                            }
                                            tableRow.setHeight(130);
                                        }

                                        // Добавление пустого параграфа между таблицами
                                        paragraph[i] = document.createParagraph();

                                        // Создание таблицы Y
                                        XWPFTable tableY = document.createTable(2, 4);
                                        for (int row = 0; row < 2; row++) {
                                            XWPFTableRow tableRow = tableY.getRow(row);
                                            for (int col = 0; col < 4; col++) {
                                                XWPFTableCell cell = tableRow.getCell(col);
                                                if (col >= 2 && row == 1) {
                                                    cell.setText(formatNum(Double.parseDouble(task[numbertask].getTableY()[row][col])));
                                                } else {
                                                    cell.setText(task[numbertask].getTableY()[row][col]);
                                                }
                                                cell.setWidth("800");
                                            }
                                            tableRow.setHeight(130);
                                        }

                                        // Добавление пустого параграфа между таблицами
                                        paragraph[i] = document.createParagraph();

                                        // Создание таблицы Z1
                                        XWPFTable tableZ1 = document_ans.createTable(2, 8);
                                        for (int row = 0; row < 2; row++) {
                                            XWPFTableRow tableRow = tableZ1.getRow(row);
                                            for (int col = 0; col < 8; col++) {
                                                XWPFTableCell cell = tableRow.getCell(col);
                                                cell.setText(task[numbertask].answerTableZ1()[row][col]);
                                                cell.setWidth("900");
                                            }
                                            tableRow.setHeight(130);
                                        }

                                        // Добавление пустого параграфа между таблицами
                                        paragraph_ans[i] = document_ans.createParagraph();

                                        // Создание таблицы Z2
                                        XWPFTable tableZ2 = document_ans.createTable(2, 8);
                                        for (int row = 0; row < 2; row++) {
                                            XWPFTableRow tableRow = tableZ2.getRow(row);
                                            for (int col = 0; col < 8; col++) {
                                                XWPFTableCell cell = tableRow.getCell(col);
                                                cell.setText(task[numbertask].answerTableZ2()[row][col]);
                                                cell.setWidth("900");
                                            }
                                            tableRow.setHeight(130);
                                        }

                                        // Добавление пустого параграфа между таблицами
                                        paragraph_ans[i] = document_ans.createParagraph();

                                    }

                                    if (numbertask == 11 || numbertask == 12 || numbertask == 13) {
                                        int cols = task[numbertask].answerTable()[0].length;
                                        XWPFTable tableX = document_ans.createTable(2, cols);
                                        for (int row = 0; row < 2; row++) {
                                            XWPFTableRow tableRow = tableX.getRow(row);
                                            for (int col = 0; col < cols; col++) {
                                                XWPFTableCell cell = tableRow.getCell(col);
                                                if (numbertask == 11 && col >= 2 && row == 1) {
                                                    cell.setText(formatNum(Double.parseDouble(task[numbertask].answerTable()[row][col])));
                                                } else {
                                                    cell.setText(task[numbertask].answerTable()[row][col]);
                                                }
                                                if (numbertask == 13)
                                                    cell.setWidth("1500");
                                                else cell.setWidth("1000");
                                            }
                                            tableRow.setHeight(130);
                                        }

                                        // Добавление пустого параграфа между таблицами
                                        paragraph_ans[i] = document_ans.createParagraph();
                                    }

                                    run2_ans.addBreak();
                                    run2_ans.addBreak();
                                    run2.addBreak();
                                    run2.addBreak();
                                }
                                numbertask++;
                            }
                        }

                        XWPFParagraph paragraphBreak = document.createParagraph();
                        XWPFRun runBreak = paragraphBreak.createRun();
                        runBreak.addBreak(BreakType.PAGE);

                        XWPFParagraph paragraphBreak_ans = document_ans.createParagraph();
                        XWPFRun runBreak_ans = paragraphBreak_ans.createRun();
                        runBreak_ans.addBreak(BreakType.PAGE);
                    }

                    FileOutputStream out_variants = new FileOutputStream("Варианты.docx");
                    document.write(out_variants);
                    out_variants.close();
                    document.close();

                    FileOutputStream out_answers = new FileOutputStream("Ответы.docx");
                    document_ans.write(out_answers);
                    out_answers.close();
                    document_ans.close();

                } catch (IOException ex) {
                    ex.printStackTrace();
                } catch (InvalidFormatException ex) {
                    throw new RuntimeException(ex);
                }
                System.exit(0);
            }

        }
    }
}
