package tests;

import  javax.swing.*;
import  java.awt.*;
import  java.awt.event.*;
        
public class test extends JFrame 
{
    private JButton but1,but2;  //les boutons
    
    /** Constructeur de test */
    public test()
    {
        //titre de la fenetre
        super("Test");
        
        //panel
        JPanel  pan=new JPanel();
        pan.setLayout(new BorderLayout());
        
        //bouton ici
        but1=new JButton("Ici !");
        
        //ajoute un listener : ici le listener est cette classe
        but1.addActionListener(new TraitementBut1());
        
        //ajoute le boutton dans le panel
        pan.add(but1,BorderLayout.CENTER);
        
        //2eme Bouton
        but2=new JButton("2eme !");
        but2.addActionListener(new TraitementBut2());
        pan.add(but2,BorderLayout.SOUTH);
        
        //
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(pan);
        pack(); //permet de mettre une bonne dimension a la fenetre
        setVisible(true);
    }
        
    public  static  void    main(String args[])
    {
        new test();
    }
       
    public  class   TraitementBut1 implements   ActionListener
    {
         /**
         * obligatoire car test implémente l'interface ActionListener
         */
        public  void    actionPerformed(ActionEvent e)
        {
            System.out.println("Ici !");
        }
    }
    
     public  class   TraitementBut2 implements   ActionListener
    {
         /**
         * obligatoire car test implémente l'interface ActionListener
         */
        public  void    actionPerformed(ActionEvent e)
        {
            System.out.println("2eme !");
        }
    }
}
