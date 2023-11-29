/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polyshoes.combo_suggesion;

import javax.swing.JComboBox;
import javax.swing.plaf.ComboBoxUI;

/**
 *
 * @author ADMIN
 */
public class ComboBoxSuggesion1<E> extends JComboBox<E>{
    
    public ComboBoxSuggesion1(){
        setUI(new ComboSuggesionUI1());
    }
}
