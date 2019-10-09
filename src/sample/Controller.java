package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    Button btn;
    @FXML
    TextField username;
    @FXML
    TextField password;

    @FXML
    TextArea hiddenText;
    @FXML
    public void initialize (){//Executed when GUI is ready. Manipulating fx the buttons
        btn.addEventHandler(ActionEvent.ACTION, new EventHandler<Event>() {
            @Override
            public void handle(Event event) {
                if (password.getText().equals("123456")){
                    hiddenText.visibleProperty().set(true);
                }
            }
        });
    }

}
