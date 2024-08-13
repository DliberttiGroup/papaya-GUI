/*
 * This file is part of Papaya-GUI source code
 *
 * See 'License' 
 */
package com.papaya;

import utils.textLib.debug;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.HashMap;

import javax.swing.UIManager;
import javax.swing.JFrame;

/**
 * WindowManager
 */
public class WindowManager {
  /**
   * Window manager class
   *
   *
   * @DESCRIPTION
   *
   *              This class is a high level actraction of
   *              the swing API
   *
   * @Note
   *       You can call `returnJframe` method
   *       so you can work with the JFrame object
   *       directly
   *
   */
  private static JFrame f;

  /*
   * This constructor will create an empty window
   */
  public WindowManager(String nameOfYourProgram) {
      HashMap<String, Integer> screenSize = getDimensionsScreen();

      try {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Exception e) {
        e.printStackTrace();
      }

      f = new JFrame(nameOfYourProgram);
      f.setSize(screenSize.get("width") / 2, screenSize.get("heigh") / 2);

      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setLocationRelativeTo(null);

      f.setVisible(true);
      debug.info(nameOfYourProgram + " " + "Is Up And Running!");
    }

  /*
   * Returns the JFrame object
   */
  public JFrame returnJframe() {
    debug.info("Frame returned");
    return f;
  }

  /*
   * Gets the the size of the current
   * screen
   */
  public static HashMap<String, Integer> getDimensionsScreen() {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    HashMap<String, Integer> screenValues = new HashMap<>();

    Dimension screenSize = toolkit.getScreenSize();
    int width = screenSize.width;
    int heigh = screenSize.height;

    screenValues.put("width", width);
    screenValues.put("heigh", heigh);

    return screenValues;
  }

}
