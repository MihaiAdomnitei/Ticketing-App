module ubb.map.practiczbor.zbor {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens ubb.map.practiczbor to javafx.fxml;
    exports ubb.map.practiczbor;
}