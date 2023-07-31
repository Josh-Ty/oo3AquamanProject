module com.example.entrepsim {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.entrepsim to javafx.fxml;
    exports com.example.entrepsim;
}