

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;



public class GUI extends JFrame {





	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 687);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("\u5F00\u59CB");
		menu.setFont(new Font("等线", Font.PLAIN, 12));
		menuBar.add(menu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u5F00\u59CB\u62FC\u63A5");
		mntmNewMenuItem_2.setFont(new Font("等线", Font.PLAIN, 12));
		mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		menu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_1 = new JMenu("\u5E2E\u52A9");
		mnNewMenu_1.setFont(new Font("等线", Font.PLAIN, 12));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u83B7\u53D6\u5E2E\u52A9");
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK));
		mntmNewMenuItem_1.setFont(new Font("等线", Font.PLAIN, 12));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u539F\u59CB\u6587\u4EF6\u8DEF\u5F84\uFF1A");
		lblNewLabel.setFont(new Font("等线", Font.PLAIN, 12));
		lblNewLabel.setBounds(345, 11, 102, 15);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("等线", Font.PLAIN, 12));
		textField.setBounds(345, 31, 280, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u50A8\u5B58\u6587\u4EF6\u8DEF\u5F84\uFF1A");
		lblNewLabel_1.setFont(new Font("等线", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(345, 92, 102, 15);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("等线", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(345, 110, 280, 21);
		contentPane.add(textField_1);
		
		JButton btnNewButton1 = new JButton("\u6D4F\u89C8");
		btnNewButton1.setFont(new Font("等线", Font.PLAIN, 12));
		btnNewButton1.setBounds(345, 59, 75, 23);
		contentPane.add(btnNewButton1);

		
		JButton button1 = new JButton("\u6D4F\u89C8");
		button1.setFont(new Font("等线", Font.PLAIN, 12));
		button1.setBounds(345, 138, 75, 23);
		contentPane.add(button1);
		
		JLabel lblNewLabel_2 = new JLabel("k\u503C\uFF1A");
		lblNewLabel_2.setFont(new Font("等线", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(345, 186, 54, 15);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setText("13");
		textField_2.setFont(new Font("等线", Font.PLAIN, 12));
		textField_2.setToolTipText("");
		textField_2.setBounds(345, 203, 134, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("\u8D28\u91CF\u9608\u503C\uFF1A");
		label.setFont(new Font("等线", Font.PLAIN, 12));
		label.setBounds(489, 186, 75, 15);
		contentPane.add(label);
		
		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setFont(new Font("等线", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(489, 203, 136, 21);
		contentPane.add(textField_3);
		
		JLabel lblreads = new JLabel("\u5F00\u59CB\u62FC\u63A5\u7684\u6700\u5C11reads\u6570\uFF1A");
		lblreads.setFont(new Font("等线", Font.PLAIN, 12));
		lblreads.setBounds(345, 243, 154, 15);
		contentPane.add(lblreads);
		
		textField_4 = new JTextField();
		textField_4.setToolTipText("");
		textField_4.setText("25");
		textField_4.setFont(new Font("等线", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(345, 260, 280, 21);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("\u5F00\u59CB\uFF01");
		btnNewButton.setFont(new Font("等线", Font.PLAIN, 12));
		btnNewButton.setBounds(344, 430, 75, 23);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 290, 309, 96);
		contentPane.add(panel);
		panel.setLayout(null);
	    JScrollPane scrollPane = new JScrollPane(
	                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
	                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED
	        );
	    scrollPane.setBounds(0, 10, 309, 76);
	    panel.add(scrollPane);
	    JTextArea txtrSr = new JTextArea();
	    scrollPane.setViewportView(txtrSr);
	    txtrSr.setLineWrap(false);                         // 自动换行
	    txtrSr.setFont(new Font("楷体", Font.PLAIN, 12));   // 设置字体
	    
	    JLabel label_1 = new JLabel("\u6BD4\u5BF9\u5E8F\u5217\u8DEF\u5F84\uFF1A");
	    label_1.setFont(new Font("等线", Font.PLAIN, 12));
	    label_1.setBounds(345, 330, 102, 15);
	    contentPane.add(label_1);
	    
	    textField_5 = new JTextField();
	    textField_5.setFont(new Font("等线", Font.PLAIN, 12));
	    textField_5.setColumns(10);
	    textField_5.setBounds(345, 348, 280, 21);
	    contentPane.add(textField_5);
	    
	    JButton button = new JButton("\u6D4F\u89C8");
	    button.setFont(new Font("等线", Font.PLAIN, 12));
	    button.setBounds(345, 376, 75, 23);
	    contentPane.add(button);
	    
	    JCheckBox chckbxNewCheckBox = new JCheckBox("\u662F\u5426\u6BD4\u5BF9");
	    chckbxNewCheckBox.setFont(new Font("等线", Font.PLAIN, 12));
	    chckbxNewCheckBox.setBounds(344, 299, 103, 23);
	    contentPane.add(chckbxNewCheckBox);
	    
	    JScrollPane scrollPane_1 = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    scrollPane_1.setBounds(10, 485, 615, 87);
	    contentPane.add(scrollPane_1);
	    
	    JTextArea textArea_1 = new JTextArea();
	    textArea_1.setEnabled(false);
	    textArea_1.setEditable(false);
	    scrollPane_1.setViewportView(textArea_1);
	    textArea_1.setLineWrap(false);
	    textArea_1.setFont(new Font("等线 Light", Font.PLAIN, 1));
	    
	    JScrollPane scrollPane_2 = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    scrollPane_2.setBounds(10, 572, 615, 34);
	    contentPane.add(scrollPane_2);
	    
	    JTextArea txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa = new JTextArea();
	    txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.setEditable(false);
	    scrollPane_2.setViewportView(txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa);
	    txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.setLineWrap(false);
	    txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.setFont(new Font("等线", Font.PLAIN, 12));
	    
	    JScrollPane scrollPane_3 = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	    scrollPane_3.setBounds(10, 404, 309, 49);
	    contentPane.add(scrollPane_3);
	    
	    JTextArea txtrSR = new JTextArea();
	    txtrSR.setEnabled(false);
	    txtrSR.setEditable(false);
	    txtrSR.setLineWrap(false);
	    txtrSR.setFont(new Font("等线", Font.PLAIN, 1));
	    scrollPane_3.setViewportView(txtrSR);
	    
	   
	    
	    String[] column= {"Contig","长度","相似度"};
	    
	    DefaultTableModel tableModel = new DefaultTableModel(DBG.Contigs,column);
	    table = new JTable(tableModel);
	    table.setBounds(10, 11, 309, 269);
	    contentPane.add(table);
	    table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);  
	    JScrollPane scroll = new JScrollPane(table);  
	    scroll.setLocation(10, 10);
        scroll.setSize(309, 270);  
        getContentPane().add(scroll);
	    


        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //单选
                int row = table.rowAtPoint(e.getPoint());// 选中行
                
                
                if(row<DBG.contig_value) {
                	try {
						BufferedReader f=new BufferedReader(new InputStreamReader(new FileInputStream(DBG.outpass+row+DBG.output_pos)));
						try {
							
							txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.setText(f.readLine());
							txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.repaint();

						} catch (IOException e1) {
							// TODO 自动生成的 catch 块
							e1.printStackTrace();
						}
					} catch (FileNotFoundException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
                	
                	if(DBG.blast_or_not==1) {
                	try {
						BufferedReader f=new BufferedReader(new InputStreamReader(new FileInputStream(DBG.outpass+"BLAST_"+row+DBG.output_pos)));
						try {
							
							txtrSr.setText(f.readLine()+"\r\n"+f.readLine()+"\r\n"+f.readLine());
							txtrSr.repaint();
							//txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.setText(f.readLine());
							//txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.repaint();

						} catch (IOException e1) {
							// TODO 自动生成的 catch 块
							e1.printStackTrace();
						}
					} catch (FileNotFoundException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}           	
                	}
                	if(DBG.blast_or_not==0) {
						txtrSr.setText("");
						txtrSr.repaint();
                	}
                	
                	
                	
                	
                	try {
						BufferedReader f=new BufferedReader(new InputStreamReader(new FileInputStream(DBG.outpass+"Graph"+row+DBG.output_pos)));
						String show="";
						try {
							while(true) {
								String line=f.readLine();
								if(line!=null) {
									show=show+line+"\r\n";
								}else {
									break;
								}
							}
							textArea_1.setText(show);
							textArea_1.repaint();
							//txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.setText(f.readLine());
							//txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.repaint();

						} catch (IOException e1) {
							// TODO 自动生成的 catch 块
							e1.printStackTrace();
						}
						
					} catch (FileNotFoundException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}

                	if(DBG.blast_or_not==1) {
                	try {
						BufferedReader f=new BufferedReader(new InputStreamReader(new FileInputStream(DBG.outpass+"GUI_BLAST_"+row+DBG.output_pos)));
						String show="";
						try {
							while(true) {
								String line=f.readLine();
								if(line!=null) {
									show=show+line+"\r\n";
								}else {
									break;
								}
							}
							txtrSR.setText(show);
							txtrSR.repaint();
							//txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.setText(f.readLine());
							//txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.repaint();

						} catch (IOException e1) {
							// TODO 自动生成的 catch 块
							e1.printStackTrace();
						}
					} catch (FileNotFoundException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
                	}else {
                		txtrSR.setText("");
                		txtrSR.repaint();
                	}
                 	//txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.setText("");

                	//txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.repaint();
                }else {
                	txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.setText("");
                	txtrAtctccatacacatctccgagcccacgagacgctacgctatctcgtatgccgtcttctgcttgaaaaaaaaaaaaaaaacaaagaaggagacaagaagagaactaaa.repaint();
                	txtrSR.setText("");
                	txtrSR.repaint();
                	textArea_1.setText("");
                	textArea_1.repaint();
                	txtrSr.setText("");
                	txtrSr.repaint();
                }
            }
        });
    
		//JScrollPane scroll = new JScrollPane(textArea,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		//contentPane.add(scroll);

        ActionListener _1= new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                JFileChooser chooser = new JFileChooser();

                chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                chooser.showDialog(new JLabel(), "选择");
                File file = chooser.getSelectedFile();
                textField.setText(file.getAbsoluteFile().toString());
            }
        };btnNewButton1.addActionListener(_1);
        ActionListener __1= new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                Processing p=new Processing();
                p.setVisible(true);
        		
            }
        }; mntmNewMenuItem_1.addActionListener(__1);
       
        ActionListener _2= new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                chooser.showDialog(new JLabel(), "选择");
                File file = chooser.getSelectedFile();
                textField_1.setText(file.getAbsoluteFile().toString());
            }
        };button1.addActionListener(_2);
        ActionListener _3= new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                JFileChooser chooser = new JFileChooser();
                chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                chooser.showDialog(new JLabel(), "选择");
                File file = chooser.getSelectedFile();
                textField_5.setText(file.getAbsoluteFile().toString());
            }
        };button.addActionListener(_3);
        ActionListener start= new ActionListener(){
            public void actionPerformed(ActionEvent e)
            
            {   


            	
            	DBG.k=Integer.valueOf(textField_2.getText());
            	DBG.quality_threshold=Integer.valueOf(textField_3.getText());
            	DBG.min_read_num=Integer.valueOf(textField_4.getText());
            	if(!textField.getText().equals("")) {
            		DBG.input=textField.getText();
            	}
            	if(!textField_5.getText().equals("")) {
            		DBG.reference_pos=textField_5.getText();
            	}
            	if(!textField_1.getText().equals("")) {
            		DBG.outpass=textField_1.getText()+"\\";		
            	}
            	
            	if(chckbxNewCheckBox.isSelected()) {
                	DBG.blast_or_not=1;
                }
            
                try {
					DBG.Main();
				} catch (IOException e1) {
					// TODO 自动生成的 catch 块
					e1.printStackTrace();
				}

                for(int u=DBG.Contigs.length-1;u>=0;u--) {
                	Vector v=new Vector();
                	v.add(DBG.Contigs[u][0]);
                	v.add(DBG.Contigs[u][1]);
                	v.add(DBG.Contigs[u][2]);
                	tableModel.insertRow(0, v);
                }
                tableModel.fireTableDataChanged();
                table.repaint();
                
            }
        };btnNewButton.addActionListener(start);

		
        
	}


    
    public void actionPerformed_1(ActionEvent e)
    {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        chooser.showDialog(new JLabel(), "选择");
        File file = chooser.getSelectedFile();
        textField_1.setText(file.getAbsoluteFile().toString());
    }
    
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
