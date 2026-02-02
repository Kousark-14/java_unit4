import javafx.application.Application;
import javafx.collections.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class IntermediateControlsDemo extends Application {
@Override
public void start(Stage stage) {
CheckBox cb1 = new CheckBox("Java");
CheckBox cb2 = new CheckBox("Python");
RadioButton r1 = new RadioButton("Male");
RadioButton r2 = new RadioButton("Female");
ToggleGroup tg = new ToggleGroup();
r1.setToggleGroup(tg);
r2.setToggleGroup(tg);

ComboBox<String> combo = new ComboBox<>();
combo.getItems().addAll("India", "USA", "UK");
ListView<String> listView = new ListView<>();
listView.getItems().addAll("AI", "ML", "DS", "Cloud");
TableView<String> table = new TableView<>();
TableColumn<String, String> col = new TableColumn<>("Sample Column
table.getColumns().add(col);
VBox layout = new VBox(10, cb1, cb2, r1, r2, combo, listView, tabl
Scene scene = new Scene(layout, 400, 500);
stage.setTitle("Intermediate Controls Demo");
stage.setScene(scene);
stage.show();
}
public static void main(String[] args) {
launch(args);
}
}
