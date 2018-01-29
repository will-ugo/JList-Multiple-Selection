import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class multipleList extends JFrame {
	private JList countryList;
	private JList africanList;
	private JButton move;
	private String[] list = {"Austria", "Cape Verde", "Denmark", "Nigeria", "Ghana", "Brazil"};
	
	public multipleList() {
		super("JList Multiple Selection Demo");
		setLayout(new FlowLayout());
		
		countryList = new JList(list);
		countryList.setVisibleRowCount(3);
		countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(countryList));
		
		move = new JButton("Move");
		move.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						africanList.setListData(countryList.getSelectedValues());
					}
				}
				
				);
		add(move);
		
		africanList = new JList();
		africanList.setVisibleRowCount(3);
		africanList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		africanList.setFixedCellHeight(20);
		africanList.setFixedCellWidth(90);
		add(new JScrollPane(africanList));
	}
}
