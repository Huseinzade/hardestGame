package renderer;

import javax.swing.*;
import java.awt.*;

public class PanelRenderer extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       GameRenderer.render(g);

    }


}
