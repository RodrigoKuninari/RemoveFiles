/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package removefiles;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JProgressBar;

/**
 *
 * @author rkuninari
 */
public class Progress extends JDialog
{

    public Progress(String mensagem)
    {
        this.setTitle(mensagem);
        setModal(false);
        JProgressBar progress = new JProgressBar();
        progress.setIndeterminate(true);
        progress.setSize(100, 50);
        getContentPane().add(progress);
        pack();
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(120, 200);
    }

}
