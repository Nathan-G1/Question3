

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
  This program displays a simple  with a title. The
  application exits when the user clicks the close button.
  */

class ShowWindow extends JFrame {
        private JPanel myPanel;
        private JLabel me, out, nameL;
        private JTree jTree;
        private JButton click;
        private JTextField inp, name;

        public ShowWindow() {

                // Set the title.
                setTitle("A Simple ff");

                // Set the size of the .
                setSize(550, 350);
                // Specify what happens when the close button is clicked.
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                design();
                add(myPanel);

                // Display the .
                setVisible(true);
        }
        private void design() {
                me = new JLabel("ENTER SALARY");
                nameL = new JLabel("ENTER NAME");
                click = new JButton("Submit");
                click.addActionListener(new ClickButtonListner());
                inp = new JTextField(10);
                name = new JTextField(10);
                out = new JLabel();
                jTree = new JTree();
                //panel
                myPanel = new JPanel();
                myPanel.add(jTree);
                myPanel.add(me);
                myPanel.add(inp);
                myPanel.add(nameL);
                myPanel.add(name);
                myPanel.add(click);

                myPanel.add(out);


        }
        private class ClickButtonListner implements ActionListener{
                public void actionPerformed(ActionEvent E){
                        final double sla = 0.9;
                        String inpstr;
//                        Employee m = new Employee();

                        double outpu;
                        inpstr = inp.getText();
                        if (inpstr instanceof java.lang.String){
                                inpstr = "0";
                        }
                        outpu = Double.parseDouble(inpstr) * sla;

                        out.setText("Your Salary is now: " + outpu);
                        TreeSelectionModel smd = jTree.getSelectionModel();

                        if (smd.getSelectionCount() > 0) {
                                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getSelectionPath().getLastPathComponent();

                                DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(name.getText());

                                selectedNode.add(newNode);

                                DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();

                                model.reload();
                        }
                }

        }
//        public static void main(String[] args) {
//                new ShowWindow();
//        }
}

