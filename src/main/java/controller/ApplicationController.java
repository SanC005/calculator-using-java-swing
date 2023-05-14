/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import frame.AppFrame;
import javax.swing.text.View;
import model.Model;

/**
 *
 * @author San22
 */
public class ApplicationController {
    private Model model;
    private AppFrame view;

    public ApplicationController() {
        this.model = new Model();
        this.view = new AppFrame();
    }

    public int mulNumbers(int num1, int num2) {
        // Set the model values
        model.setNum1(num1);
        model.setNum2(num2);

        // Get the result from the model
        int result = model.getResult();

        return result;
    }

    public AppFrame getView() {
        return view;
    }

}
