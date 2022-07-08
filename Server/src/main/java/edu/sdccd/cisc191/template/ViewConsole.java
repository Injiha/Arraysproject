package edu.sdccd.cisc191.template;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewConsole extends Application {
    Stage window;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;

        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

        VBox layout1 = new VBox(10);
        Scene scene = new Scene(layout1, 400, 400);

        Button countButton = new Button("Count");
        Button sumButton = new Button("Sum");
        Button maxButton = new Button("Max");
        Button indexMaxButton = new Button("Index of Max");
        Button sortButton = new Button("Sorted Array");
        Button columnButton = new Button(" Columns");

        Label countLabel = new Label();
        Label sumLabel = new Label();
        Label maxLabel = new Label();
        Label indexMaxLabel = new Label();
        Label sortLabel = new Label();
        Label columnLabel = new Label();


        ArrayMethods countArray = new ArrayMethods();
        countButton.setOnAction(e -> countLabel.setText(countArray.count()));
        sumButton.setOnAction(e -> sumLabel.setText(countArray.sum()));
        maxButton.setOnAction(e -> maxLabel.setText(countArray.findMax()));
        indexMaxButton.setOnAction(e -> indexMaxLabel.setText(countArray.findIndexOfMax()));
        sortButton.setOnAction(e -> sortLabel.setText(countArray.sortArray()));
        columnButton.setOnAction(e -> countArray.genFiveByFiveRows());


        layout1.getChildren().addAll(countButton, countLabel, maxButton, maxLabel, sumButton, sumLabel, indexMaxButton,
                indexMaxLabel, sortButton, sortLabel, columnButton);


        Button closeButton = new Button("No");
        closeButton.setOnAction(e -> closeProgram());

        window.setScene(scene);
        window.setTitle("Arrays");
        window.show();
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });

    }
    private void closeProgram () {
        Boolean answer = ConfirmBox.display("Title", "Are you sure you want to exit?");
        if (answer)
            window.close();
    }
}


