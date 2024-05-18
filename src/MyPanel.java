import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyPanel extends JPanel {
    int numTask = 1, rows = 3, columns = 7;
    JCheckBox[][] checkboxes = new JCheckBox[rows][columns];
    JLabel[][] labels = new JLabel[rows][columns];
    JButton selectAll;
    MyPanel() {
        MyListener m = new MyListener();

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
    }

    public class MyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == selectAll) {
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        checkboxes[i][j].setSelected(true);
                    }
                }
            }
        }
    }
}