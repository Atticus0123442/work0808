package controller.AccountService;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Service.DbService;
import controller.mainui.mainui;
import dao.impl.UserDaoImpl;
import model.users;

public class AccountServiceUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField accountin;
	private JTextField passwordin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountServiceUI frame = new AccountServiceUI();
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
	public AccountServiceUI() {
		AccountServiceUI self = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 799, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("帳號");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 31));
		lblNewLabel.setBounds(231, 114, 75, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("密碼");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 31));
		lblNewLabel_1.setBounds(231, 208, 75, 58);
		contentPane.add(lblNewLabel_1);
		
		accountin = new JTextField();
		accountin.setFont(new Font("新細明體", Font.PLAIN, 30));
		accountin.setBounds(313, 121, 280, 44);
		contentPane.add(accountin);
		accountin.setColumns(10);
		
		passwordin = new JTextField();
		passwordin.setFont(new Font("新細明體", Font.PLAIN, 30));
		passwordin.setColumns(10);
		passwordin.setBounds(316, 208, 280, 44);
		contentPane.add(passwordin);
		
		JButton log_b = new JButton("登入");
		log_b.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(accountin.getText().trim().isEmpty() || passwordin.getText().trim().isEmpty()) {
					JOptionPane.showMessageDialog(null, "帳號或密碼空白" );
				}
				else {
					UserDaoImpl dao = new UserDaoImpl();
			        users user = dao.login(accountin.getText().trim(), passwordin.getText().trim());

			        if (user != null) {
			            JOptionPane.showMessageDialog(null, "登入成功！歡迎 " + user.getName());
			            self.setVisible(false);
			            mainui frame = new mainui(user);
						frame.setVisible(true);
			            // 這裡可以開啟主畫面
			        } else {
			            JOptionPane.showMessageDialog(null, "帳號或密碼錯誤");
			        }
				}
			}
		});
		log_b.setFont(new Font("新細明體", Font.PLAIN, 31));
		log_b.setBounds(231, 312, 133, 87);
		contentPane.add(log_b);
		
		JButton sign_b = new JButton("註冊");
		sign_b.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				self.setVisible(false);
				signUI frame = new signUI(self);
		        frame.setVisible(true);
			}
		});
		sign_b.setFont(new Font("新細明體", Font.PLAIN, 31));
		sign_b.setBounds(463, 312, 133, 87);
		contentPane.add(sign_b);

	}
}
