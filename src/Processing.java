import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;

public class Processing extends JFrame {

	private JPanel contentPane;
	public JLabel label_1;
	private JLabel lblNewLabel;
	private JLabel label_2;
	private JLabel label;
	private JLabel lblKkmer;
	private JLabel label_4;
	private JLabel lblreadscontigkmer;
	private JLabel label_3;
	private JLabel lblcontig;
	private JLabel lblcontig_1;
	private JLabel lblcontig_2;
	private JLabel lblcontig_3;
	private JLabel lblcontig_4;
	private JLabel lbldujiaoxianqiaojiacom;
	



	public Processing() {

		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 420, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("\u8BF7\u5728\u201C\u539F\u59CB\u6587\u4EF6\u8DEF\u5F84\u201D\u5904\u9009\u62E9.fastq\u6587\u4EF6\u8DEF\u5F84\uFF1B");
		lblNewLabel.setFont(new Font("等线", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 10, 305, 26);
		contentPane.add(lblNewLabel);
		
		label_2 = new JLabel("\u201C\u6BD4\u5BF9\u5E8F\u5217\u8DEF\u5F84\u201D\u5904\u9009\u62E9\u6BD4\u5BF9\u53C2\u8003\u5E8F\u5217\u7684\u6587\u4EF6\u8DEF\u5F84\u3002");
		label_2.setFont(new Font("等线", Font.PLAIN, 12));
		label_2.setBounds(10, 61, 305, 26);
		contentPane.add(label_2);
		
		label = new JLabel("\u201C\u50A8\u5B58\u6587\u4EF6\u8DEF\u5F84\u201D\u5904\u9009\u62E9\u50A8\u5B58\u8F93\u51FA\u6587\u4EF6\u7684\u6587\u4EF6\u5939\u8DEF\u5F84\uFF1B");
		label.setFont(new Font("等线", Font.PLAIN, 12));
		label.setBounds(10, 35, 305, 26);
		contentPane.add(label);
		
		lblKkmer = new JLabel("\u201Ck\u503C\u201D\u4EE3\u8868\u62FC\u63A5\u65F6\u751F\u6210k-mer\u7684\u957F\u5EA6\uFF0C\u8003\u8651\u5230\u5185\u5B58\u539F\u56E0\u4E0D\u5EFA\u8BAE\u8D85\u8FC713\uFF1B");
		lblKkmer.setFont(new Font("等线", Font.PLAIN, 12));
		lblKkmer.setBounds(10, 100, 362, 26);
		contentPane.add(lblKkmer);
		
		label_4 = new JLabel("\u201C\u8D28\u91CF\u9608\u503C\u201D\u4EE3\u8868\u53C2\u4E0E\u62FC\u63A5\u5E8F\u5217\u7684\u6700\u4F4E\u8D28\u91CF\uFF1B");
		label_4.setFont(new Font("等线", Font.PLAIN, 12));
		label_4.setBounds(10, 127, 305, 26);
		contentPane.add(label_4);
		
		lblreadscontigkmer = new JLabel("\u201C\u5F00\u59CB\u62FC\u63A5\u7684\u6700\u5C0Freads\u6570\u201D\u4EE3\u8868\u6BCF\u4E2AContig\u521D\u59CBk-mer\u7684\u6700\u5C0F\u88AB\u8986\u76D6\u6570\u3002");
		lblreadscontigkmer.setFont(new Font("等线", Font.PLAIN, 12));
		lblreadscontigkmer.setBounds(10, 153, 384, 26);
		contentPane.add(lblreadscontigkmer);
		
		label_3 = new JLabel("\u62FC\u63A5\u5B8C\u6210\u540E\uFF0C\u4ECE\u4E0A\u5230\u4E0B\u4E94\u4E2A\u6570\u636E\u6846\u5206\u522B\u4EE3\u8868\uFF1A");
		label_3.setFont(new Font("等线", Font.PLAIN, 12));
		label_3.setBounds(10, 193, 384, 26);
		contentPane.add(label_3);
		
		lblcontig = new JLabel("\u2460\u6BCF\u4E2AContig\u7684\u8BE6\u7EC6\u4FE1\u606F\uFF1B");
		lblcontig.setFont(new Font("等线", Font.PLAIN, 12));
		lblcontig.setBounds(10, 218, 384, 26);
		contentPane.add(lblcontig);
		
		lblcontig_1 = new JLabel("\u2461\u9009\u4E2DContig\u7684\u8BE6\u7EC6\u6BD4\u5BF9\u60C5\u51B5\uFF1B");
		lblcontig_1.setFont(new Font("等线", Font.PLAIN, 12));
		lblcontig_1.setBounds(10, 244, 384, 26);
		contentPane.add(lblcontig_1);
		
		lblcontig_2 = new JLabel("\u2462\u9009\u4E2DContig\u7684\u6574\u4F53\u6BD4\u5BF9\u56FE\uFF1B");
		lblcontig_2.setFont(new Font("等线", Font.PLAIN, 12));
		lblcontig_2.setBounds(10, 270, 384, 26);
		contentPane.add(lblcontig_2);
		
		lblcontig_3 = new JLabel("\u2463\u9009\u4E2DContig\u4E2D\u6BCF\u4E2A\u78B1\u57FA\u7684\u88AB\u8986\u76D6\u6570\u76F4\u65B9\u56FE\uFF1B");
		lblcontig_3.setFont(new Font("等线", Font.PLAIN, 12));
		lblcontig_3.setBounds(10, 296, 384, 26);
		contentPane.add(lblcontig_3);
		
		lblcontig_4 = new JLabel("\u2464\u9009\u4E2DContig\u7684\u5E8F\u5217\u3002");
		lblcontig_4.setFont(new Font("等线", Font.PLAIN, 12));
		lblcontig_4.setBounds(10, 322, 384, 26);
		contentPane.add(lblcontig_4);
		
		lbldujiaoxianqiaojiacom = new JLabel("\u8054\u7CFB\u4F5C\u8005\uFF1Adujiaoxianqiaojia@126.com");
		lbldujiaoxianqiaojiacom.setFont(new Font("等线", Font.PLAIN, 12));
		lbldujiaoxianqiaojiacom.setBounds(10, 387, 384, 26);
		contentPane.add(lbldujiaoxianqiaojiacom);
		
		JButton btnNewButton = new JButton("\u5173\u95ED\r\n");
		btnNewButton.setFont(new Font("等线 Light", Font.PLAIN, 12));
		btnNewButton.setBounds(155, 445, 93, 23);
		contentPane.add(btnNewButton);
		
        ActionListener _1= new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        };btnNewButton.addActionListener(_1);
		


	}
}
