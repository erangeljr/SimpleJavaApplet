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

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
