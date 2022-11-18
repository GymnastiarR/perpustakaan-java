import com.font.Poppins;
import com.views.AddBook;
import com.views.components.MainFrame;

import javax.swing.*;

public class App{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            AddBook view = new AddBook();
            MainFrame.display("Perpus");
            }
        });
    }
}
