module javafx.duongduaeducationfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.edu.duongdua.center to javafx.fxml;
    exports com.edu.duongdua.center;
    exports com.edu.duongdua.center.controller;
    opens com.edu.duongdua.center.controller to javafx.fxml;
}