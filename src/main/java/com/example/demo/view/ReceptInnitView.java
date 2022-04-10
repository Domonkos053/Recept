package com.example.demo.view;

import com.example.demo.service.ReceptServiceInterface;
import com.example.demo.view.model.ReceptView;
import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReceptInnitView {
    private JButton mentesGomb;
    private JPanel panel1;
    private JPanel receptPanel;
    private JPanel címkePanel;
    private JPanel gombPanel;
    private JTextArea leirastextArea;
    private JTextField receptName;
    private ReceptServiceInterface receptServiceInterface;

    public ReceptInnitView(ReceptServiceInterface receptServiceInterface) {
this.receptServiceInterface = receptServiceInterface;
        mentesGomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReceptView receptView = new ReceptView();
                receptView.setLeiras(leirastextArea.getText());

                receptServiceInterface.save(receptView);
            }
        });
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(0, 0));
        címkePanel = new JPanel();
        címkePanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(címkePanel, BorderLayout.NORTH);
        gombPanel = new JPanel();
        gombPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel1.add(gombPanel, BorderLayout.SOUTH);
        mentesGomb = new JButton();
        mentesGomb.setText("Mentés");
        gombPanel.add(mentesGomb);
        receptPanel = new JPanel();
        receptPanel.setLayout(new GridLayoutManager(2, 3, new Insets(0, 0, 0, 0), -1, -1));
        panel1.add(receptPanel, BorderLayout.CENTER);
        final JLabel label1 = new JLabel();
        label1.setText("Leírás");
        label1.setVerticalAlignment(1);
        label1.setVerticalTextPosition(0);
        receptPanel.add(label1, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_NORTHWEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        leirastextArea = new JTextArea();
        leirastextArea.setText("");
        receptPanel.add(leirastextArea, new GridConstraints(0, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
