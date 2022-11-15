import com.controller.AddBookController;
import com.controller.Controller;
import com.controller.MainController;
import com.views.AddBook;
import com.views.components.NewFrame;

import javax.swing.*;

public class App{

    public static void main(String[] args) {
//        AddBook view = new AddBook();
//        NewFrame.mainFrame("Perpustakaan Ku");
//        NewFrame.changeDisplay(view.display());
//        Controller controller = new Controller();
        Controller.addBookController(true);
    }
}
