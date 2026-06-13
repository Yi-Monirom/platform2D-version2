package platform2D;

import java.awt.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

import keyInput.MouseInput;
import keyInput.keybordInput;

public class gamepanel extends JPanel {
   private game gm;
   private MouseInput mouseInputs;
   private BufferedImage buffer;
    public gamepanel(game gm) {
    	this.gm=gm;
    	setPanelsize();
    	mouseInputs=new MouseInput(this);
        addKeyListener(new keybordInput(this));
        
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    
        requestFocus();
    }

    
    public void setPanelsize() {
        Dimension size = new Dimension(1200, 400);
        setMinimumSize(size);
        setPreferredSize(size);
        setDoubleBuffered(true);
        buffer = new BufferedImage(1200, 400, BufferedImage.TYPE_INT_RGB);
        
    }
    public void updateGame() {
    	gm.update();
    }
    
    public void renderFrame() {
        if (buffer == null) return;
        Graphics2D g2d = buffer.createGraphics();
        
        // Set rendering hints for better quality
        g2d.setRenderingHint(java.awt.RenderingHints.KEY_ANTIALIASING, 
                            java.awt.RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(java.awt.RenderingHints.KEY_RENDERING, 
                            java.awt.RenderingHints.VALUE_RENDER_QUALITY);
        
        // Clear with white background
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, 1200, 400);
        
        // Render game content
        gm.render(g2d);
        g2d.dispose();
        
        // Draw buffer to screen
        Graphics screenGraphics = getGraphics();
        if (screenGraphics != null) {
            screenGraphics.drawImage(buffer, 0, 0, null);
            screenGraphics.dispose();
        }
    }
    	
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (buffer != null) {
            g.drawImage(buffer, 0, 0, null);
        }

    }
    public game getGame() {
		return gm;
    	
    }


	
		
	
	
}
