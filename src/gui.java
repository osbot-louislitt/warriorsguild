import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
/*
 * Created by JFormDesigner on Fri Sep 22 09:55:57 BST 2017
 */



/**
 * @author Louis Litt (https://github.com/osbot-louislitt)
 */
public class gui {

    public gui() {
        initComponents();
    }

//    public void main() {
//        gui gui = new gui(this.settings);
//        gui.food.setModel(new DefaultComboBoxModel(Food.Foods.values()));
//        gui.selectedArmour.setModel(new DefaultComboBoxModel(Armour.Armours.values()));
//        gui.frame.setVisible(true);
//    }

    private void selectedPositionItemStateChanged(ItemEvent e) {
        // TODO add your code here
    }

    private void hpEatSliderStateChanged(ChangeEvent e) {
        hpEatLabel.setText("Eat When HP At " + hpEatSlider.getValue() + "%:");
    }

    private void fightAtSliderStateChanged(ChangeEvent e) {
        fightAtLabel.setText("Fight Cyclops At " + fightAtSlider.getValue() + " Tokens:");
    }

    private void addTaskActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

    private void removeTaskActionPerformed(ActionEvent e) {
        // TODO add your code here
    }

//    private void startActionPerformed(ActionEvent e) {
//        settings.setFoodToBring(Food.Foods.getByName(food.getSelectedItem().toString()));
//        settings.setArmourToUse(Armour.Armours.getByName(selectedArmour.getSelectedItem().toString()));
//        settings.setAmountOfFood((int)foodAmount.getValue());
//        settings.setHealthToEatAt(hpEatSlider.getValue());
//        settings.setStarted(true);
//        settings.setQuit(false);
//        settings.setTokensToFightAt(fightAtSlider.getValue());
//
//        if (onlyCollect.isSelected()) {
//            settings.setRunMode(0);
//        } else if (onlyKill.isSelected()) {
//            settings.setRunMode(1);
//        } else {
//            settings.setRunMode(2);
//        }
//
//        gui.this.frame.dispose();
//    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        frame = new JFrame();
        mainPanel = new JPanel();
        runSettings = new JPanel();
        runSettingsContent = new JPanel();
        onlyCollect = new JRadioButton();
        collectAndKill = new JRadioButton();
        onlyKill = new JRadioButton();
        tokenSettings = new JPanel();
        tokenSettingsContent = new JPanel();
        armourLabel = new JLabel();
        selectedArmour = new JComboBox<>();
        fightAtLabel = new JLabel();
        fightAtSlider = new JSlider();
        miscSettings = new JPanel();
        miscSettingsContent = new JPanel();
        useQuickPrayer = new JCheckBox();
        lootAndBury = new JCheckBox();
        cyclopsSettings = new JPanel();
        cyclopsSettingsPanel = new JPanel();
        progressive = new JRadioButton();
        campTop = new JRadioButton();
        campBottom = new JRadioButton();
        footSettings = new JPanel();
        footSettingsContent = new JPanel();
        foodLabel = new JLabel();
        food = new JComboBox<>();
        hSpacer2 = new JPanel(null);
        foodAmountLabel = new JLabel();
        foodAmount = new JSpinner();
        hpEatLabel = new JLabel();
        hpEatSlider = new JSlider();
        start = new JButton();

        //======== frame ========
        {
            frame.setTitle("Litt Warriors Guild");
            Container frameContentPane = frame.getContentPane();
            frameContentPane.setLayout(new GridBagLayout());
            ((GridBagLayout)frameContentPane.getLayout()).columnWidths = new int[] {0, 0};
            ((GridBagLayout)frameContentPane.getLayout()).rowHeights = new int[] {0, 0};
            ((GridBagLayout)frameContentPane.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
            ((GridBagLayout)frameContentPane.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

            //======== mainPanel ========
            {
                mainPanel.setBorder(new EmptyBorder(25, 25, 25, 25));
                mainPanel.setLayout(new GridBagLayout());
                ((GridBagLayout)mainPanel.getLayout()).columnWidths = new int[] {0, 0, 0};
                ((GridBagLayout)mainPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
                ((GridBagLayout)mainPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                ((GridBagLayout)mainPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                //======== runSettings ========
                {
                    runSettings.setBorder(new TitledBorder(null, "Main Settings", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
                    runSettings.setLayout(new GridBagLayout());
                    ((GridBagLayout)runSettings.getLayout()).columnWidths = new int[] {0, 0};
                    ((GridBagLayout)runSettings.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)runSettings.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                    ((GridBagLayout)runSettings.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //======== runSettingsContent ========
                    {
                        runSettingsContent.setBorder(new EmptyBorder(15, 15, 15, 15));
                        runSettingsContent.setLayout(new GridBagLayout());
                        ((GridBagLayout)runSettingsContent.getLayout()).columnWidths = new int[] {0, 0};
                        ((GridBagLayout)runSettingsContent.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
                        ((GridBagLayout)runSettingsContent.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                        ((GridBagLayout)runSettingsContent.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                        //---- onlyCollect ----
                        onlyCollect.setText("Only Collect Tokens");
                        onlyCollect.setSelected(true);
                        runSettingsContent.add(onlyCollect, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 0), 0, 0));

                        //---- collectAndKill ----
                        collectAndKill.setText("Collect Tokens & Kill Cyclops");
                        runSettingsContent.add(collectAndKill, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 0), 0, 0));

                        //---- onlyKill ----
                        onlyKill.setText("Only Kill Cyclops");
                        runSettingsContent.add(onlyKill, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    runSettings.add(runSettingsContent, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                mainPanel.add(runSettings, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //======== tokenSettings ========
                {
                    tokenSettings.setBorder(new TitledBorder(null, "Token Settings", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
                    tokenSettings.setLayout(new GridBagLayout());
                    ((GridBagLayout)tokenSettings.getLayout()).columnWidths = new int[] {0, 0};
                    ((GridBagLayout)tokenSettings.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)tokenSettings.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                    ((GridBagLayout)tokenSettings.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //======== tokenSettingsContent ========
                    {
                        tokenSettingsContent.setBorder(new EmptyBorder(15, 15, 15, 15));
                        tokenSettingsContent.setLayout(new GridBagLayout());
                        ((GridBagLayout)tokenSettingsContent.getLayout()).columnWidths = new int[] {0, 0, 0};
                        ((GridBagLayout)tokenSettingsContent.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
                        ((GridBagLayout)tokenSettingsContent.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                        ((GridBagLayout)tokenSettingsContent.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                        //---- armourLabel ----
                        armourLabel.setText("Armour:");
                        tokenSettingsContent.add(armourLabel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));

                        //---- selectedArmour ----
                        selectedArmour.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Mith",
                            "Addy",
                            "Rune"
                        }));
                        tokenSettingsContent.add(selectedArmour, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 0), 0, 0));

                        //---- fightAtLabel ----
                        fightAtLabel.setText("Fight Cyclops At 250 Tokens:");
                        tokenSettingsContent.add(fightAtLabel, new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 0), 0, 0));

                        //---- fightAtSlider ----
                        fightAtSlider.setValue(250);
                        fightAtSlider.setMaximum(5000);
                        fightAtSlider.setMinimum(250);
                        fightAtSlider.setMinorTickSpacing(5);
                        fightAtSlider.setSnapToTicks(true);
                        fightAtSlider.addChangeListener(e -> fightAtSliderStateChanged(e));
                        tokenSettingsContent.add(fightAtSlider, new GridBagConstraints(0, 2, 2, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    tokenSettings.add(tokenSettingsContent, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                mainPanel.add(tokenSettings, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //======== miscSettings ========
                {
                    miscSettings.setBorder(new TitledBorder(null, "Misc Settings", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
                    miscSettings.setLayout(new GridBagLayout());
                    ((GridBagLayout)miscSettings.getLayout()).columnWidths = new int[] {0, 0};
                    ((GridBagLayout)miscSettings.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)miscSettings.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                    ((GridBagLayout)miscSettings.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //======== miscSettingsContent ========
                    {
                        miscSettingsContent.setBorder(new EmptyBorder(15, 15, 15, 15));
                        miscSettingsContent.setLayout(new GridBagLayout());
                        ((GridBagLayout)miscSettingsContent.getLayout()).columnWidths = new int[] {0, 0};
                        ((GridBagLayout)miscSettingsContent.getLayout()).rowHeights = new int[] {0, 0, 0};
                        ((GridBagLayout)miscSettingsContent.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                        ((GridBagLayout)miscSettingsContent.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

                        //---- useQuickPrayer ----
                        useQuickPrayer.setText("Use Quick Prayers");
                        miscSettingsContent.add(useQuickPrayer, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 0), 0, 0));

                        //---- lootAndBury ----
                        lootAndBury.setText("Loot & Bury Bones");
                        miscSettingsContent.add(lootAndBury, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    miscSettings.add(miscSettingsContent, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                mainPanel.add(miscSettings, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //======== cyclopsSettings ========
                {
                    cyclopsSettings.setBorder(new TitledBorder(null, "Cyclops Settings", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
                    cyclopsSettings.setLayout(new GridBagLayout());
                    ((GridBagLayout)cyclopsSettings.getLayout()).columnWidths = new int[] {0, 0};
                    ((GridBagLayout)cyclopsSettings.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)cyclopsSettings.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                    ((GridBagLayout)cyclopsSettings.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //======== cyclopsSettingsPanel ========
                    {
                        cyclopsSettingsPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
                        cyclopsSettingsPanel.setLayout(new GridBagLayout());
                        ((GridBagLayout)cyclopsSettingsPanel.getLayout()).columnWidths = new int[] {0, 0};
                        ((GridBagLayout)cyclopsSettingsPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
                        ((GridBagLayout)cyclopsSettingsPanel.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                        ((GridBagLayout)cyclopsSettingsPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                        //---- progressive ----
                        progressive.setText("Progressive (Loots Best Defender)");
                        progressive.setSelected(true);
                        cyclopsSettingsPanel.add(progressive, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 0), 0, 0));

                        //---- campTop ----
                        campTop.setText("Camp Top Floor (Loots Defenders Upto Rune)");
                        cyclopsSettingsPanel.add(campTop, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 0), 0, 0));

                        //---- campBottom ----
                        campBottom.setText("Camp Bottom Floor (Loots Dragon Defenders)");
                        cyclopsSettingsPanel.add(campBottom, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    cyclopsSettings.add(cyclopsSettingsPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                mainPanel.add(cyclopsSettings, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //======== footSettings ========
                {
                    footSettings.setBorder(new TitledBorder(null, "Food Settings", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
                    footSettings.setLayout(new GridBagLayout());
                    ((GridBagLayout)footSettings.getLayout()).columnWidths = new int[] {0, 0};
                    ((GridBagLayout)footSettings.getLayout()).rowHeights = new int[] {0, 0};
                    ((GridBagLayout)footSettings.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
                    ((GridBagLayout)footSettings.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                    //======== footSettingsContent ========
                    {
                        footSettingsContent.setBorder(new EmptyBorder(15, 15, 15, 15));
                        footSettingsContent.setLayout(new GridBagLayout());
                        ((GridBagLayout)footSettingsContent.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0};
                        ((GridBagLayout)footSettingsContent.getLayout()).rowHeights = new int[] {0, 0, 0};
                        ((GridBagLayout)footSettingsContent.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
                        ((GridBagLayout)footSettingsContent.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

                        //---- foodLabel ----
                        foodLabel.setText("Food:");
                        footSettingsContent.add(foodLabel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));

                        //---- food ----
                        food.setModel(new DefaultComboBoxModel<>(new String[] {
                            "Salmon",
                            "Trout",
                            "Shark",
                            "Lobster"
                        }));
                        footSettingsContent.add(food, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));
                        footSettingsContent.add(hSpacer2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));

                        //---- foodAmountLabel ----
                        foodAmountLabel.setText("Amount:");
                        footSettingsContent.add(foodAmountLabel, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 5), 0, 0));

                        //---- foodAmount ----
                        foodAmount.setModel(new SpinnerNumberModel(1, 1, 28, 1));
                        footSettingsContent.add(foodAmount, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 5, 0), 0, 0));

                        //---- hpEatLabel ----
                        hpEatLabel.setText("Eat When HP At 50%:");
                        footSettingsContent.add(hpEatLabel, new GridBagConstraints(0, 1, 2, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 5), 0, 0));

                        //---- hpEatSlider ----
                        hpEatSlider.addChangeListener(e -> hpEatSliderStateChanged(e));
                        footSettingsContent.add(hpEatSlider, new GridBagConstraints(2, 1, 3, 1, 0.0, 0.0,
                            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                            new Insets(0, 0, 0, 0), 0, 0));
                    }
                    footSettings.add(footSettingsContent, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
                }
                mainPanel.add(footSettings, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- start ----
                start.setText("Start");
                start.addActionListener(e -> startActionPerformed(e));
                mainPanel.add(start, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            frameContentPane.add(mainPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 0), 0, 0));
            frame.setSize(790, 470);
            frame.setLocationRelativeTo(null);
        }

        //---- selectedMode ----
        ButtonGroup selectedMode = new ButtonGroup();
        selectedMode.add(onlyCollect);
        selectedMode.add(collectAndKill);
        selectedMode.add(onlyKill);

        //---- selectedFloor ----
        ButtonGroup selectedFloor = new ButtonGroup();
        selectedFloor.add(progressive);
        selectedFloor.add(campTop);
        selectedFloor.add(campBottom);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    private JFrame frame;
    private JPanel mainPanel;
    private JPanel runSettings;
    private JPanel runSettingsContent;
    private JRadioButton onlyCollect;
    private JRadioButton collectAndKill;
    private JRadioButton onlyKill;
    private JPanel tokenSettings;
    private JPanel tokenSettingsContent;
    private JLabel armourLabel;
    private JComboBox<String> selectedArmour;
    private JLabel fightAtLabel;
    private JSlider fightAtSlider;
    private JPanel miscSettings;
    private JPanel miscSettingsContent;
    private JCheckBox useQuickPrayer;
    private JCheckBox lootAndBury;
    private JPanel cyclopsSettings;
    private JPanel cyclopsSettingsPanel;
    private JRadioButton progressive;
    private JRadioButton campTop;
    private JRadioButton campBottom;
    private JPanel footSettings;
    private JPanel footSettingsContent;
    private JLabel foodLabel;
    private JComboBox<String> food;
    private JPanel hSpacer2;
    private JLabel foodAmountLabel;
    private JSpinner foodAmount;
    private JLabel hpEatLabel;
    private JSlider hpEatSlider;
    private JButton start;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
