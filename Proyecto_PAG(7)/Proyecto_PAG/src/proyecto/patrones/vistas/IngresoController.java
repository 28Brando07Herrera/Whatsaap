package proyecto.patrones.vistas;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
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

public class IngresoController extends Application
{
    public static void main(String[] args) 
    {
        launch(args);    
    }
    
    @FXML
    private Button btnRegresarAlLogin; 

    @Override
    public void start(Stage pantalla1) throws Exception 
    {
        HBox generalHBox = new HBox();
        HBox generalHBox2 = new HBox();

        //? COLORES USADOS
        /* 
            DARKCYAN -- #008B8B
            MINTCREAM -- #F5FFFA
            FIREBRICK -- #B22222

        */

        
        //! Hbox DER
        Image imgIconoLogin = new Image("ImagLogin/IconoMsj.png");
        ImageView imgIconoLogin2 = new ImageView(imgIconoLogin);
        imgIconoLogin2.setFitHeight(85);
        imgIconoLogin2.setFitWidth(85);
        imgIconoLogin2.setStyle("-fx-background-color: #B22222;");
        Button btnIconoLogin = new Button("", imgIconoLogin2);
        btnIconoLogin.setStyle("-fx-background-Color: transparent;");
        
        Label lblUserLogin = new Label("Crea tu cuenta");
        lblUserLogin.setFont(new Font(28));
        lblUserLogin.setStyle("-fx-font-family: 'Comic Sans Ms';");
        
        Label lblNameUser = new Label("UserName:");
        lblNameUser.setFont(new Font(15));
        lblNameUser.setStyle("-fx-font-family: 'Comic Sans Ms';");

        Label lblEmailUser = new Label("E-mail:");
        lblEmailUser.setFont(new Font(15));
        lblEmailUser.setStyle("-fx-font-family: 'Comic Sans Ms';");
        
        Label lblContraseña = new Label("Password:");
        lblContraseña.setFont(new Font(15));
        lblContraseña.setStyle("-fx-font-family: 'Comic Sans Ms';");
        
        TextField txtNameUser = new TextField();
        txtNameUser.setMaxWidth(200);
        txtNameUser.setStyle("-fx-background-Color: transparent; -fx-border-Color: #B22222; -fx-border-width: 0px 0px 2px 0px;");

        TextField txtEmailUser = new TextField();
        txtEmailUser.setMaxWidth(200);
        txtEmailUser.setStyle("-fx-background-Color: transparent; -fx-border-Color: #B22222; -fx-border-width: 0px 0px 2px 0px;");
        //txtUsuario.setCursor(null);
        
        PasswordField txtContraseña = new PasswordField();
        txtContraseña.setMaxWidth(200);
        txtContraseña.setStyle("-fx-background-Color: transparent; -fx-border-Color: #B22222; -fx-border-width: 0px 0px 2px 0px;");
        txtContraseña.setVisible(true);
        
        Button btnCrearCuenta = new Button("CREAR");
        btnCrearCuenta.setCursor(Cursor.HAND);
        btnCrearCuenta.setStyle("-fx-background-color: #B22222;");
        btnCrearCuenta.setTextFill(Color.WHITE);
        btnCrearCuenta.setFont(new Font(10));
        btnCrearCuenta.setPrefWidth(80);
        btnCrearCuenta.setPrefHeight(34);
        
        VBox root2 = new VBox();
        root2.getChildren().addAll(btnIconoLogin, lblUserLogin, lblNameUser, txtNameUser, lblEmailUser, txtEmailUser, lblContraseña, txtContraseña, btnCrearCuenta);
        //root2.getChildren().addAll(btnIconoApp, lblTituloApp, btnRegistrar);
        root2.setAlignment(Pos.CENTER);
        root2.setStyle("-fx-background-color: #F5FFFA;");
        
        VBox.setMargin(btnIconoLogin, new Insets(0, 60, -18, 60));
        VBox.setMargin(lblUserLogin, new Insets(0, 60, 30, 60));
        VBox.setMargin(lblNameUser, new Insets(15, 60, 0, 60));
        VBox.setMargin(lblEmailUser, new Insets(15, 60, 0, 60));
        VBox.setMargin(lblContraseña, new Insets(15, 60, 0, 60));
        VBox.setMargin(btnCrearCuenta, new Insets(20, 60, 0, 60));

        //! Hbox IZ
        Image imgIconoApp = new Image("ImagLogin/Mensajero.png");
        ImageView imgIconoApp2 = new ImageView(imgIconoApp);
        imgIconoApp2.setFitHeight(125);
        imgIconoApp2.setFitWidth(150);
        Button btnIconoApp = new Button("", imgIconoApp2);
        btnIconoApp.setStyle("-fx-background-color: transparent;");
        btnIconoApp.setCursor(Cursor.HAND);
        //btnIconoApp.setMaxHeight(150);

        Label lblWelcome = new Label("¡Bienvenido a \nMebraCrisApp!");
        lblWelcome.setFont(new Font(28));
        lblWelcome.setTextFill(Color.WHITE);
        lblWelcome.setStyle("-fx-font-family: 'Comic Sans Ms';");
        
        Button btnRegresarAlLogin = new Button("INICIAR SESIÓN");
        btnRegresarAlLogin.setCursor(Cursor.HAND);
        btnRegresarAlLogin.setStyle("-fx-background-color: transparent; -fx-border-Color: White");
        btnRegresarAlLogin.setTextFill(Color.WHITE);
        btnRegresarAlLogin.setFont(new Font(10));
        btnRegresarAlLogin.setPrefWidth(100);
        btnRegresarAlLogin.setPrefHeight(34);
        
        VBox root = new VBox();
        root.getChildren().addAll(btnIconoApp, lblWelcome, btnRegresarAlLogin);
        //root.getChildren().addAll(btnIconoLogin, lblUserLogin, lblUsuario, txtUsuario, lblContraseña, txtContraseña, btnIngresar, hyperForgotPass);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #B22222;");
        generalHBox.getChildren().addAll(root);

        VBox.setMargin(btnIconoApp, new Insets(10, 60, 0, 60));
        VBox.setMargin(lblWelcome, new Insets(10, 60, 0, 60));
        VBox.setMargin(btnRegresarAlLogin, new Insets(40, 60, 0, 60));

        generalHBox2.getChildren().addAll(root2);
        generalHBox.getChildren().addAll(generalHBox2);



        //! DIVISIONES DE Hbox
        //VBox.setMargin(btnIconoApp, new Insets(0, 60, 0, 60));
        //VBox.setMargin(lblTituloApp, new Insets(0, 60, 0, 60));

        root.setPrefWidth(520);
        root2.setPrefWidth(500);

        Scene ventana1 = new Scene(generalHBox, 800, 600);
        pantalla1.setScene(ventana1);
		pantalla1.setTitle("MebracrisApp");
		pantalla1.show();
        
        btnRegresarAlLogin.setOnAction(new EventHandler<ActionEvent>() 
        {

            @Override
            public void handle(ActionEvent event) 
            {
                Alert dialogo = new Alert(AlertType.INFORMATION);
                
                dialogo.setTitle("MebracrisApp");
                dialogo.setHeaderText("Registro de datos completado.");
                dialogo.setContentText("¡Hola " + txtNameUser.getText() + "!, gracias por ser parte de este proceso.");
                dialogo.showAndWait();
            }
        });


    }

    
}
