module org.example.playermusica {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jfr;
    requires javafx.media;


    opens org.example.playermusica to javafx.fxml;
    exports org.example.playermusica;
}