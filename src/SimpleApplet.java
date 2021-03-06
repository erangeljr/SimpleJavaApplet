import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;



public class SimpleApplet extends JApplet implements ActionListener{
	
	
	JButton btnSort[] = { new JButton("Generate"), 
				new JButton("Sort"), new JButton("Shuffle") };
    JPanel  panSouth = new JPanel();
    static  Canvas  drawingBoard = new Canvas();
    int	   data[] = new int [SortCons.ARRAY_SIZE];

    public SimpleApplet() {
    	//Default Constructor
    }
    
    //Initialize container and components
    public void init() {
    	Container contentPanel = getContentPane();
    	contentPanel.setSize(650, 500);

    	contentPanel.setLayout(new BorderLayout() );
    	for ( int i = 0; i < btnSort.length; i ++ ) {
    		btnSort[i].addActionListener(this);
    		if ( i > 0 )  btnSort[i].setEnabled(false);
    		panSouth.add(btnSort[i]);
    	}
    	contentPanel.add(panSouth, BorderLayout.SOUTH);
    	contentPanel.add(drawingBoard, BorderLayout.CENTER);
    	drawingBoard.setBackground(Color.black);
    }
    
    public void start() {
    }
    
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int k = -1;
		Object o = e.getSource();
		for ( int i = 0; i < btnSort.length; i ++ ) {
			if ( o == btnSort[i] ) { k = i; break; }
		}
		
	}
	
	 public static void main( String argv[] ) {
			JFrame frameObject = new JFrame("Simple Java Applet");
			frameObject.addWindowListener( new  WindowAdapter() {
			public void windowClosing( WindowEvent e ) { System.exit(0); } } );
			frameObject.setSize(600,500);			
			frameObject.getContentPane();
			frameObject.setVisible(true);
			
		   }

}
