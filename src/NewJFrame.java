
import java.util.Random;
import java.util.*;
import javax.swing.ImageIcon;
public class NewJFrame extends javax.swing.JFrame {
int hit=0;
int targetx;
int ran=0;
static Random rand=new Random();
Thread move=new Thread(new Runnable(){
        public void run(){
        for(int i=1;i>0;i++){
            try {
            if(hit<=10)
                Thread.sleep(5);
            if(hit>10 && hit<=34)
                Thread.sleep(3);
            if(hit>=35)
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                
            }
            if(bird.getX()>680){
            ran=rand.nextInt((235-1)+1)+1;
            bird.setLocation(1, ran);
            bird.setIcon(new javax.swing.ImageIcon(getClass().getResource("bird2.jpg")));
            bird.setVisible(true);
            }
          targetx=bird.getX()+1;
          bird.setLocation(targetx, ran);
         
        }
        }
        }
        ,"Thread A");
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        move.start();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bird = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        text = new javax.swing.JLabel();
        text1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHOTING GAME-By (R.R.SHARMA)");
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setMinimumSize(new java.awt.Dimension(680, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        bird.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bird2.jpg"))); // NOI18N
        bird.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birdMouseClicked(evt);
            }
        });
        getContentPane().add(bird);
        bird.setBounds(20, 10, 60, 80);

        score.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game.jpg"))); // NOI18N
        score.setText("get hit the bird");
        getContentPane().add(score);
        score.setBounds(-5, -12, 790, 390);

        text.setBackground(new java.awt.Color(204, 255, 0));
        text.setFont(new java.awt.Font("Wide Latin", 2, 12)); // NOI18N
        text.setForeground(new java.awt.Color(102, 0, 102));
        text.setText("Welcome To World Of Shooting !");
        getContentPane().add(text);
        text.setBounds(0, 384, 340, 40);

        text1.setFont(new java.awt.Font("Wide Latin", 2, 14)); // NOI18N
        text1.setForeground(new java.awt.Color(0, 0, 153));
        getContentPane().add(text1);
        text1.setBounds(354, 384, 280, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void birdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birdMouseClicked
    int x=evt.getX();
        int y=evt.getY();
        int targetx=bird.getX();
        int targety=bird.getY();
        boolean res=false;
        if((targetx<x)&&targetx+67>x)
        res=true;
        if(res){
            if(targety<y && targety+73>y)
            res=true;
            else
            res=false;
        }
        if(res=true){

            hit=hit+1;
             bird.setIcon(new javax.swing.ImageIcon(getClass().getResource("shoot.png")));
          if(hit>0 && hit<50)
              text1.setText("Good Shot: "+Integer.toString(hit));
           if(hit>=4 &&hit<7)
              text1.setText("IMPRESSED by you");
           if(hit==50){
               text1.setText("GOOD you won... ");
           hit=0;
           }
          
        }

    }//GEN-LAST:event_birdMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bird;
    private javax.swing.JLabel score;
    private javax.swing.JLabel text;
    private javax.swing.JLabel text1;
    // End of variables declaration//GEN-END:variables
}
