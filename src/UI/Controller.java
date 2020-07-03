package UI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable
{
  @FXML
  private WebView ta_htmlPage;

  private WebEngine webEngine;

  @Override
  public void initialize(URL url, ResourceBundle resourceBundle)
  {
    webEngine = ta_htmlPage.getEngine();
    String site = "<!DOCTYPE html>\n" +
      "<html lang=\"en\">\n" +
      "<head>\n" +
      "    <meta charset=\"UTF-8\">\n" +
      "    <title>Title</title>\n" +
      "    <link href=\"Test.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
      "</head>\n" +
      "<body>\n" +
      "    <h1>Sample Title</h1>\n" +
      "</body>\n" +
      "</html>";
    String css = "h1 {color:red}";
    webEngine.load("https://www.google.at");
  }
}
