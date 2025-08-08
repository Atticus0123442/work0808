package controller.AccountService;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dao.impl.UserDaoImpl;
import model.users;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.Timer;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class signUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField namein;
	private JTextField weightin;
	private JTextField yearsin;
	private JTextField heightin;
	private JTextField accountin;
	private JTextField timing_out;
	private JTextField passwordin;
	private JButton enterbtn;
	private JButton cancelbtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountServiceUI frame0 = new AccountServiceUI();
					frame0.setVisible(false);
					signUI frame = new signUI(frame0);
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
	public signUI() {
		 this(null);
	    }
	public signUI(AccountServiceUI window) {
		signUI self = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 552);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("姓名");
		lblNewLabel.setFont(new Font("新細明體", Font.PLAIN, 30));
		lblNewLabel.setBounds(101, 98, 71, 41);
		contentPane.add(lblNewLabel);
		
		namein = new JTextField();
		namein.setFont(new Font("新細明體", Font.PLAIN, 30));
		namein.setBounds(198, 98, 148, 41);
		contentPane.add(namein);
		namein.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("性別");
		lblNewLabel_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(101, 191, 71, 41);
		contentPane.add(lblNewLabel_1);
		
		JComboBox genderin = new JComboBox();
		genderin.setFont(new Font("新細明體", Font.PLAIN, 31));
		genderin.addItem(new combobox("男", "M"));
		genderin.addItem(new combobox("女", "F"));
		genderin.setBounds(198, 185, 59, 52);
		contentPane.add(genderin);
		
		JLabel lblNewLabel_1_1 = new JLabel("體重");
		lblNewLabel_1_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		lblNewLabel_1_1.setBounds(101, 279, 71, 41);
		contentPane.add(lblNewLabel_1_1);
		
		weightin = new JTextField();
		weightin.setFont(new Font("新細明體", Font.PLAIN, 30));
		weightin.setColumns(10);
		weightin.setBounds(198, 278, 148, 41);
		contentPane.add(weightin);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("年紀");
		lblNewLabel_1_1_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		lblNewLabel_1_1_1.setBounds(450, 98, 71, 41);
		contentPane.add(lblNewLabel_1_1_1);
		
		yearsin = new JTextField();
		yearsin.setFont(new Font("新細明體", Font.PLAIN, 30));
		yearsin.setColumns(10);
		yearsin.setBounds(547, 98, 148, 41);
		contentPane.add(yearsin);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("身高");
		lblNewLabel_1_1_1_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		lblNewLabel_1_1_1_1.setBounds(450, 191, 71, 41);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		heightin = new JTextField();
		heightin.setFont(new Font("新細明體", Font.PLAIN, 30));
		heightin.setColumns(10);
		heightin.setBounds(547, 191, 148, 41);
		contentPane.add(heightin);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("帳號名稱");
		lblNewLabel_1_1_1_1_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		lblNewLabel_1_1_1_1_1.setBounds(73, 377, 132, 41);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		accountin = new JTextField();
		accountin.setFont(new Font("新細明體", Font.PLAIN, 30));
		accountin.setColumns(10);
		accountin.setBounds(216, 376, 148, 41);
		contentPane.add(accountin);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("時間");
		lblNewLabel_1_1_1_2.setFont(new Font("新細明體", Font.PLAIN, 30));
		lblNewLabel_1_1_1_2.setBounds(357, 11, 71, 41);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		timing_out = new JTextField();
		timing_out.setEditable(false);
		timing_out.setFont(new Font("新細明體", Font.PLAIN, 30));
		timing_out.setColumns(10);
		timing_out.setBounds(446, 10, 346, 41);
		contentPane.add(timing_out);
//		LocalDateTime now = LocalDateTime.now();
//		String formatted = now.format(DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss"));
//
//		timing_out.setText(formatted);
		
		passwordin = new JTextField();
		passwordin.setFont(new Font("新細明體", Font.PLAIN, 30));
		passwordin.setColumns(10);
		passwordin.setBounds(216, 445, 148, 41);
		contentPane.add(passwordin);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("密碼設定");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("新細明體", Font.PLAIN, 30));
		lblNewLabel_1_1_1_1_1_1.setBounds(73, 446, 132, 41);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		enterbtn = new JButton("送出資料");
		
		enterbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				combobox selectedGender = (combobox) genderin.getSelectedItem();
				String genderValue = selectedGender.getValue(); // 會是 "M" 或 "F"
				if(namein.getText().trim().isEmpty() ||
			            genderValue.isEmpty() ||
			            yearsin.getText().trim().isEmpty() ||
			            weightin.getText().trim().isEmpty() ||
			            heightin.getText().trim().isEmpty() ||
			            accountin.getText().trim().isEmpty() ||
			            passwordin.getText().trim().isEmpty()) 
				{
					JOptionPane.showMessageDialog(null, "請勿空白!" );
				}
				else {
					UserDaoImpl dao = new UserDaoImpl();

			        // 如果帳號已存在，先刪除
			        if (dao.login(accountin.getText().trim())) {
			        		JOptionPane.showMessageDialog(null, "帳號名稱已存在!" );
			        }
			        else {
			        		// 建立新使用者資料
			        		
				        users newUser = new users();
				        newUser.setName(namein.getText().trim());
				        newUser.setGender(genderValue);
				        newUser.setAge(Integer.parseInt(yearsin.getText().trim()));
				        newUser.setWeight(Double.parseDouble(weightin.getText().trim()));
				        newUser.setHeight(Double.parseDouble(heightin.getText().trim()));
				        newUser.setUsername(accountin.getText().trim());
				        newUser.setPassword(passwordin.getText().trim());
				        newUser.setCreatAt(LocalDateTime.now());
				        dao.add(newUser);
				        JOptionPane.showMessageDialog(null, "註冊成功！");
				        self.setVisible(false);
				        window.setVisible(true);
			        }
					
			        
				}
			}
		});
		enterbtn.setFont(new Font("新細明體", Font.PLAIN, 31));
		enterbtn.setBounds(500, 314, 195, 63);
		contentPane.add(enterbtn);
		
		cancelbtn = new JButton("取消");
		cancelbtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				self.setVisible(false);
				window.setVisible(true);
			}
		});
		cancelbtn.setFont(new Font("新細明體", Font.PLAIN, 31));
		cancelbtn.setBounds(500, 412, 195, 63);
		contentPane.add(cancelbtn);
		
		
		 // 啟動 Timer 每秒更新時間
        startTimer();
		

	}
	private void startTimer() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LocalDateTime now = LocalDateTime.now();
                timing_out.setText(now.format(formatter));
            }
        });
        timer.start();
    }
}
