module org.example.test_git {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.test_git to javafx.fxml;
    exports org.example.test_git;
}