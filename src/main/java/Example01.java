import com.jogamp.common.nio.Buffers;
import com.jogamp.opengl.GL4;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLContext;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;

import javax.swing.*;
import java.awt.*;
import java.nio.FloatBuffer;

import static com.jogamp.opengl.GL2ES3.GL_COLOR;

public class Example01 extends JFrame implements GLEventListener{

    private GLCanvas glCanvas;

    public Example01() throws HeadlessException {
        setTitle("Chapter 2 - example 1");
        setSize(600, 400);
        setLocation(200, 200);
        glCanvas = new GLCanvas();
        glCanvas.addGLEventListener(this);
        this.add(glCanvas);
        setVisible(true);
    }

    @Override
    public void init(GLAutoDrawable drawable) {

    }

    @Override
    public void dispose(GLAutoDrawable drawable) {

    }

    @Override
    public void display(GLAutoDrawable drawable) {
        GL4 gl4 = (GL4) GLContext.getCurrentGL();
        float bkg[] = {1.0f, 0.0f, 0.0f, 1.0f};
        FloatBuffer bkgBuffer = Buffers.newDirectFloatBuffer(bkg);
        gl4.glClearBufferfv(GL_COLOR, 0, bkgBuffer);
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {

    }

    public static void main(String[] args) {
        new Example01();
    }
}
