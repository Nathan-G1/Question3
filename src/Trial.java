import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JTree;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Trial {
    JPanel pnPanel0;
    JTree trTree0;
    JButton btSubmit;
    JTextField tfText0;
    JTextField tfText1;
    JLabel lbSalary;
    JLabel lbLabel1;

    public Trial(){
        show();
    }
    public void show(){

        pnPanel0 = new JPanel();
//        pnPanel0.setSize(500, 500);
        GridBagLayout gbPanel0 = new GridBagLayout();
        GridBagConstraints gbcPanel0 = new GridBagConstraints();
        pnPanel0.setLayout( gbPanel0 );


        String []dataTree0 = { "Chocolate", "Ice Cream", "Apple Pie" };
        trTree0 = new JTree( dataTree0 );
        trTree0.setForeground( new Color( 0,0,0 ) );
        gbcPanel0.gridx = 0;
        gbcPanel0.gridy = 0;
        gbcPanel0.gridwidth = 11;
        gbcPanel0.gridheight = 20;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 1;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints( trTree0, gbcPanel0 );
        pnPanel0.add( trTree0 );

        btSubmit = new JButton( "submit"  );
        gbcPanel0.gridx = 13;
        gbcPanel0.gridy = 15;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 0;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints( btSubmit, gbcPanel0 );
        pnPanel0.add( btSubmit );

        tfText0 = new JTextField( );
        gbcPanel0.gridx = 14;
        gbcPanel0.gridy = 8;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 0;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints( tfText0, gbcPanel0 );
        pnPanel0.add( tfText0 );

        tfText1 = new JTextField( );
        gbcPanel0.gridx = 14;
        gbcPanel0.gridy = 11;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 0;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints( tfText1, gbcPanel0 );
        pnPanel0.add( tfText1 );

        lbSalary = new JLabel( "Salary"  );
        gbcPanel0.gridx = 13;
        gbcPanel0.gridy = 11;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 1;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints( lbSalary, gbcPanel0 );
        pnPanel0.add( lbSalary );

        lbLabel1 = new JLabel( "Name"  );
        gbcPanel0.gridx = 13;
        gbcPanel0.gridy = 8;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 1;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints( lbLabel1, gbcPanel0 );
        pnPanel0.add( lbLabel1 );
        pnPanel0.setVisible(true);

    }

    public static void main(String[] args){
        new Trial();
    }


}
