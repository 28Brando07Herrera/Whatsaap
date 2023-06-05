package proyecto.patrones.vistas;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoginController extends Application
{
    public static void main(String[] args) 
    {
        launch(args);    
    }
    
    
    
    @Override
    public void start(Stage pantalla1) throws Exception 
    {
        HBox generalHBox = new HBox();
        HBox generalHBox2 = new HBox();
        
        
        //! Hbox iz
        
        Image imgIconoLogin = new Image("ImagLogin/IconoMsj.png");
        ImageView imgIconoLogin2 = new ImageView(imgIconoLogin);
        imgIconoLogin2.setFitHeight(85);
        imgIconoLogin2.setFitWidth(85);
        imgIconoLogin2.setStyle("-fx-background-color: #008B8B;");
        Button btnIconoLogin = new Button("", imgIconoLogin2);
        btnIconoLogin.setStyle("-fx-background-Color: transparent;");

        Label lblUserLogin = new Label("Iniciar Sesión");
        lblUserLogin.setFont(new Font(28));
        lblUserLogin.setStyle("-fx-font-family: 'Comic Sans Ms';");
        
        Label lblUsuario = new Label("E-mail");
        lblUsuario.setFont(new Font(15));
        lblUsuario.setStyle("-fx-font-family: 'Comic Sans Ms';");

        Label lblContraseña = new Label("Password");
        lblContraseña.setFont(new Font(15));
        lblContraseña.setStyle("-fx-font-family: 'Comic Sans Ms';");
        
        TextField txtUsuario = new TextField();
        txtUsuario.setMaxWidth(200);
        txtUsuario.setStyle("-fx-background-Color: transparent; -fx-border-Color: #008B8B; -fx-border-width: 0px 0px 2px 0px;");
        //txtUsuario.setCursor(null);

        PasswordField txtContraseña = new PasswordField();
        txtContraseña.setMaxWidth(200);
        txtContraseña.setStyle("-fx-background-Color: transparent; -fx-border-Color: #008B8B; -fx-border-width: 0px 0px 2px 0px;");
        txtContraseña.setVisible(true);
        
        Button btnIngresar = new Button("INGRESAR");
        btnIngresar.setCursor(Cursor.HAND);
        btnIngresar.setStyle("-fx-background-color: #008B8B;");
        btnIngresar.setTextFill(Color.WHITE);
        btnIngresar.setFont(new Font(10));
        btnIngresar.setPrefWidth(80);
        btnIngresar.setPrefHeight(34);

        Hyperlink hyperForgotPass = new Hyperlink("Forgot Your Password?");
        hyperForgotPass.setFont(new Font(10));
        hyperForgotPass.setTextFill(Color.DARKCYAN);
        hyperForgotPass.setStyle("-fx-font-family: 'Comic Sans Ms';");
        
        VBox root = new VBox();
        root.getChildren().addAll(btnIconoLogin, lblUserLogin, lblUsuario, txtUsuario, lblContraseña, txtContraseña, btnIngresar, hyperForgotPass);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #F5FFFA;");
        generalHBox.getChildren().addAll(root);

        VBox.setMargin(btnIconoLogin, new Insets(0, 60, -18, 60));
        VBox.setMargin(lblUserLogin, new Insets(0, 60, 30, 60));
        VBox.setMargin(lblUsuario, new Insets(15, 60, 0, 60));
        VBox.setMargin(lblContraseña, new Insets(15, 60, 0, 60));
        VBox.setMargin(btnIngresar, new Insets(20, 60, 0, 60));
        VBox.setMargin(hyperForgotPass, new Insets(60, 60, 0, 60));
        
        
        
        //! Hbox DER
        Image imgIconoApp = new Image("ImagLogin/Mensajero.png");
        ImageView imgIconoApp2 = new ImageView(imgIconoApp);
        imgIconoApp2.setFitHeight(125);
        imgIconoApp2.setFitWidth(150);
        Button btnIconoApp = new Button("", imgIconoApp2);
        btnIconoApp.setStyle("-fx-background-color: #008B8B;");
        btnIconoApp.setCursor(Cursor.HAND);
        //btnIconoApp.setMaxHeight(150);

        Label lblTituloApp = new Label("MebraCrisApp");
        lblTituloApp.setFont(new Font(28));
        lblTituloApp.setTextFill(Color.WHITE);
        lblTituloApp.setStyle("-fx-font-family: 'Comic Sans Ms';");
        
        Button btnRegistrar = new Button("REGISTRARSE");
        btnRegistrar.setCursor(Cursor.HAND);
        btnRegistrar.setStyle("-fx-background-color: transparent; -fx-border-Color: White");
        btnRegistrar.setTextFill(Color.WHITE);
        btnRegistrar.setFont(new Font(10));
        btnRegistrar.setPrefWidth(100);
        btnRegistrar.setPrefHeight(34);
        
        

        VBox root2 = new VBox();
        root2.getChildren().addAll(btnIconoApp, lblTituloApp, btnRegistrar);
        root2.setAlignment(Pos.CENTER);
        root2.setStyle("-fx-background-color: #008B8B;");

        generalHBox2.getChildren().addAll(root2);
        generalHBox.getChildren().addAll(generalHBox2);

        VBox.setMargin(btnIconoApp, new Insets(10, 60, 0, 60));
        VBox.setMargin(lblTituloApp, new Insets(10, 60, 0, 60));
        VBox.setMargin(btnRegistrar, new Insets(40, 60, 0, 60));


        //! DIVISIONES DE Hbox
        //VBox.setMargin(btnIconoApp, new Insets(0, 60, 0, 60));
        //VBox.setMargin(lblTituloApp, new Insets(0, 60, 0, 60));

        root.setPrefWidth(520);
        root2.setPrefWidth(500);
        

        Scene ventana1 = new Scene(generalHBox, 800, 600);
        pantalla1.setScene(ventana1);
		pantalla1.setTitle("MebracrisApp");
		pantalla1.show();

        
        
        btnIngresar.setOnAction(new EventHandler<ActionEvent>() 
        {

            @Override
            public void handle(ActionEvent event) 
            {
                Alert dialogo = new Alert(AlertType.INFORMATION);
                
                dialogo.setTitle("MebracrisApp");
                dialogo.setHeaderText("Bienvendio a MebracrisApp.");
                dialogo.setContentText("Gracias por ingresar.");
                dialogo.showAndWait();
                
            }
        });

        btnRegistrar.setOnAction(new EventHandler<ActionEvent>() 
        {

            @Override
            public void handle(ActionEvent event) 
            {
                
                
            }
            
        });


    }

    
    

}
