package com.polyshoes.view.nhanvien.glasspanepopup;

import java.awt.Color;
import java.awt.Component;
import java.util.List;
import jdk.javadoc.doclet.Doclet.Option;

/**
 *
 * @author Raven
 */
public class DefaultOption1 implements Option {

    private float animate;

    public String getLayout(Component parent, float animate) {
        float an = 20f / parent.getHeight();
        float space = 0.5f + an - (animate * an);
        return "pos 0.5al " + space + "al";
    }

    public boolean useSnapshot() {
        return true;
    }
    
    public boolean closeWhenPressedEsc() {
       return true;
    }

    public boolean closeWhenClickOutside() {
        return true;
    }

    public boolean blockBackground() {
        return true;
    }

    public Color background() {
        return new Color(100, 100, 100);
    }

    public float opacity() {
        return 0.5f;
    }

    public int duration() {
        return 300;
    }

    public float getAnimate() {
        return animate;
    }

    public void setAnimate(float animate) {
        this.animate = animate;
    }

    @Override
    public int getArgumentCount() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Kind getKind() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<String> getNames() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getParameters() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean process(String string, List<String> list) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
