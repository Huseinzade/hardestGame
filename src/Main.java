import renderer.PanelRenderer;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("hardestGame");
        PanelRenderer panelRenderer = new PanelRenderer();
        frame.setContentPane(panelRenderer);
        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}