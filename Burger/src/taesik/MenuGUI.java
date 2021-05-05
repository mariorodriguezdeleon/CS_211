package taesik;
// Created by Taesik Kim for the practice of CS 211 assignment.

import java.awt.*;
import javax.swing.*;

public class MenuGUI {
	
   static final int W=800,H=600;//width and height of JFrame
   private JFrame f; 
   private JPanel p,imageData;
   private JLabel title,b1,b2,b3,topping1,topping2,topping3,promote,CS211;
   private String menuTitle;
   
   String myFranchise ="";      
   ImagePanel image1;
   ImagePanel image2;
   ImagePanel image3;

  MenuGUI(){};
 
  public MenuGUI(String myFranchise, String promotion, String b1NamePrice, String b1Topping, String b2NamePrice, String b2Topping, String b3NamePrice, String b3Topping){
//	 public void MenuGUI(String myFranchise,String b1Info,String b1Topping,String b2Info,String b2Topping,String b3Info,String b3Topping,String promotion ){
    
	f=new JFrame(myFranchise);
	f.setSize(W+220, H);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	p=new JPanel();
    
    menuTitle="                  Burger211 - "+ myFranchise ;
	title=new JLabel(menuTitle);
	title.setFont(new Font("Serif", Font.PLAIN, 40));
    title.setForeground(Color.RED);
	title.setBounds(80,0,W,H/6);
    
    promote = new JLabel(promotion);
    promote.setBounds(200, 70, 800,50);
	promote.setForeground(Color.BLUE);
	promote.setFont(new Font("Serif", Font.ITALIC, 23));
      
    b1=new JLabel(b1NamePrice);
	b1.setFont(new Font("Serif", Font.PLAIN, 30));
	b1.setBounds(200,105,W,H/6);
    
    b2=new JLabel(b2NamePrice);
	b2.setFont(new Font("Serif", Font.PLAIN, 30));
	b2.setBounds(200,240,W,H/6);
    
    b3=new JLabel(b3NamePrice);
	b3.setFont(new Font("Serif", Font.PLAIN, 30));
	b3.setBounds(200,370,W,H/6);
	p.setLayout(null);
    
    topping1 = new JLabel(b1Topping);
    topping1.setBounds(200, 167, 800,50);
    topping1.setForeground(Color.RED);
	topping1.setFont(new Font("Serif", Font.ITALIC, 27));
   
    topping2 = new JLabel(b2Topping);
    topping2.setBounds(200, 300, 800,50);
    topping2.setForeground(Color.RED);
	topping2.setFont(new Font("Serif", Font.ITALIC, 27));

    topping3 = new JLabel(b3Topping);
    topping3.setBounds(200, 430, 800,50);
    topping3.setForeground(Color.RED);
	topping3.setFont(new Font("Serif", Font.ITALIC, 27));

    CS211 = new JLabel("CS 211, Spring Quarter 2021");
    CS211.setBounds(W-30, 1, 200,40);
    CS211.setForeground(Color.BLACK);
	CS211.setFont(new Font("Serif", Font.ITALIC, 16));
    
  // Images
    image1 = new ImagePanel("burger1.png");
    image2 = new ImagePanel("burger2.png");
    image3 = new ImagePanel("burger3.png");
    image1.setBounds(50,120,150,100);
    image2.setBounds(50,250,150,100);
    image3.setBounds(50,380,150,100);
	f.add(image1);
    f.add(image2);
    f.add(image3); 
    
	p.add(title);
	p.add(b1);
	p.add(b2);
	p.add(b3);
    p.add(promote);
    p.add(topping1);
    p.add(topping2);
    p.add(topping3);
    p.add(CS211);
	f.add(p); 
 	f.setVisible(true);
	}

class ImagePanel extends JPanel {

    Image img;
 	
    public void paintComponent(Graphics g) {
       super.paintComponent(g);
        g.drawImage(img, 0, 0, null);
    }
    public ImagePanel(Image img) {
       this.img = img;
       Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
       setPreferredSize(size);
       setMinimumSize(size);
       setMaximumSize(size);
       setSize(size);
       setLayout(null);}
     
    public ImagePanel(String img) {
       this(new ImageIcon(img).getImage());}
 }
 
 }