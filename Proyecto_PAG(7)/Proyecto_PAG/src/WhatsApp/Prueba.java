package WhatsApp;
import javafx.event.EventHandler;
import java.time.LocalTime;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Prueba extends Application
{
	
	@Override
	public void start(Stage pantalla) throws Exception 
	{
        
		AnchorPane root1 = new AnchorPane();
        AnchorPane root2 = new AnchorPane();

        SplitPane root = new SplitPane(root2, root1);

        
        ScrollPane scrollPane1 = new ScrollPane();  //DERECHA
        ScrollPane scrollPane2 = new ScrollPane();  //IZQUIERDA

        VBox vContent = new VBox(5);
        vContent.setStyle("-fx-background-color: #008B8B;");    //Color del fondo de msjs
        scrollPane1.setContent(vContent);
        scrollPane1.setVbarPolicy(ScrollBarPolicy.ALWAYS);
        
        //! PARTE SUPERIOR DERECHA FLOWPANE
        Label lblNombre = new Label("NAME");
        Label lblEstado = new Label("Estado");
        lblEstado.setFont(new Font(10));
        HBox hbox1 = new HBox(5,lblNombre, lblEstado);
        hbox1.setStyle("-fx-background-color: #F0FFF0;");
        hbox1.setAlignment(Pos.BASELINE_CENTER);
        

        
        //scrollPane1 derecha
        AnchorPane.setLeftAnchor(scrollPane1, 0.0);
        AnchorPane.setRightAnchor(scrollPane1, 0.0);
        AnchorPane.setTopAnchor(scrollPane1, 45.0);
        AnchorPane.setBottomAnchor(scrollPane1, 45.0);

        //!scrollPane1 Medio-iz
        AnchorPane.setLeftAnchor(scrollPane2, 75.0);
        AnchorPane.setRightAnchor(scrollPane2, 0.0); // -100 
        AnchorPane.setTopAnchor(scrollPane2, 38.0); // se desplaza hacia abajo
        AnchorPane.setBottomAnchor(scrollPane2, 70.0);
        
        scrollPane2.setStyle("-fx-background-color: #F5FFFA;");

        FlowPane flowPane = new FlowPane();
        flowPane.setPrefHeight(20);
        flowPane.setStyle("-fx-background-color: #F5FFFA;");
        
        FlowPane flowPane2 = new FlowPane(Orientation.VERTICAL,1,20);
        flowPane2.setPrefWidth(75);
        flowPane2.setPrefHeight(690);
        flowPane2.setStyle("-fx-background-color: #808080;");  // Color Gray

        FlowPane flowPane3 = new FlowPane();
        flowPane3.setPrefHeight(20);
        flowPane3.setStyle("-fx-background-color: #F5FFFA;");

        FlowPane flowPane4 = new FlowPane(Orientation.VERTICAL,1,20);
        flowPane4.setPrefWidth(75);
        flowPane4.setPrefHeight(690);
        flowPane4.setStyle("-fx-background-color: #F5FFFA;");
        // flowPane.setPrefSize(Integer.MAX_VALUE, 50);
        

        Image imgSend = new Image(("Imag/Enviar.png"));
        ImageView imgSend2 = new ImageView(imgSend);
        imgSend2.setFitHeight(22);
        imgSend2.setFitWidth(25);
        Button btnEnviar = new Button("", imgSend2);
        btnEnviar.setCursor(Cursor.HAND);
        
        TextField txtIngreso = new javafx.scene.control.TextField();
        txtIngreso.setPrefSize(500, 30);
        txtIngreso.setPromptText("Escribe un mensaje aquí");
        txtIngreso.setFont(new Font(11));
        
        Label lblNameUsuario = new Label("Name User");
        Label lblMensajeChat = new Label("Hola mundo");
        VBox vboxChat = new VBox(5, lblNameUsuario, lblMensajeChat);
        vboxChat.setPrefSize(500, 30);
        


        
        Label lblNameUsuario2 = new Label("Name User2");
        Label lblMensajeChat2 = new Label("Hola mundo2");
        VBox vboxChat2 = new VBox(40, lblNameUsuario2, lblMensajeChat2);
        


        //! ICONOS 1ER Apartado
        
        Image imgMsj = new Image("Imag/Mensajes.png");
        ImageView imgMsj2 = new ImageView(imgMsj);
        imgMsj2.setFitHeight(25);
        imgMsj2.setFitWidth(30);
        Button btnMsj = new Button("", imgMsj2);
        btnMsj.setStyle("-fx-background-color: #808080;");
        btnMsj.setCursor(Cursor.HAND);
        btnMsj.setMaxHeight(150);
        
        
        Image imgGroups = new Image("Imag/Grupos.png");
        ImageView imgGroups2 = new ImageView(imgGroups);
        imgGroups2.setFitHeight(25);
        imgGroups2.setFitWidth(30);
        Button btnGroups = new Button("", imgGroups2);
        btnGroups.setStyle("-fx-background-color: #808080;");
        btnGroups.setCursor(Cursor.HAND);
        btnGroups.setMaxHeight(150);

        Image imgProfile = new Image("Imag/PerfilUsuario.png");
        ImageView imgProfile2 = new ImageView(imgProfile);
        imgProfile2.setFitHeight(25);
        imgProfile2.setFitWidth(30);
        Button btnProfile = new Button("", imgProfile2);
        btnProfile.setStyle("-fx-background-color: #808080;");
        btnProfile.setCursor(Cursor.HAND);
        btnProfile.setMaxHeight(150);
        
        Image imgSetting = new Image("Imag/Configuracion.png");
        ImageView imgSetting2 = new ImageView(imgSetting);
        imgSetting2.setFitHeight(25);
        imgSetting2.setFitWidth(30);
        Button btnSetting = new Button("", imgSetting2);
        btnSetting.setStyle("-fx-background-color: #808080;");
        btnSetting.setCursor(Cursor.HAND);
        btnSetting.setMaxHeight(150);
        
        Image imgLogOut = new Image("Imag/CerrarSesion.png");
        ImageView imgLogOut2 = new ImageView(imgLogOut);
        imgLogOut2.setFitHeight(25);
        imgLogOut2.setFitWidth(30);
        Button btnLogOut = new Button("", imgLogOut2);
        btnLogOut.setStyle("-fx-background-color: #808080;");
        btnLogOut.setCursor(Cursor.HAND);
        btnLogOut.setMaxHeight(150);
        
        
        //! ICONOS 2DO Apartado
        
        Image imgSearch = new Image("Imag/Buscar.png");
        ImageView imgSearch2 = new ImageView(imgSearch);
        imgSearch2.setFitHeight(20);
        imgSearch2.setFitWidth(20);
        Button btnBuscar = new Button("", imgSearch2);
        btnBuscar.setCursor(Cursor.HAND);
        btnBuscar.setAlignment(Pos.TOP_RIGHT);
        btnBuscar.setStyle("-fx-background-color: #696969;");
        TextField txtBuscarChat = new javafx.scene.control.TextField();
        txtBuscarChat.setPrefSize(250, 30);
        txtBuscarChat.setPromptText("Buscar un chat o inicia uno nuevo.");
        txtBuscarChat.setFont(new Font(11));



        
        
        //! ICONOS PARTE ABAJO DERECHA
        Image imgEmojic = new Image("Imag/Emoticones.png");
        ImageView imgEmojic2 = new ImageView(imgEmojic);
        imgEmojic2.setFitHeight(20);
        imgEmojic2.setFitWidth(25);
        Button btnEmote = new Button("", imgEmojic2);
        btnEmote.setCursor(Cursor.HAND);
        btnEmote.setAlignment(Pos.TOP_RIGHT);
        
        Image imgAdjuntarArchivo = new Image("Imag/AdjuntarArchivo.png");
        ImageView imgAdjuntarArchivo2 = new ImageView(imgAdjuntarArchivo);
        imgAdjuntarArchivo2.setFitHeight(20);
        imgAdjuntarArchivo2.setFitWidth(25);
        Button btnAdjuntar = new Button("", imgAdjuntarArchivo2);
        btnAdjuntar.setCursor(Cursor.HAND);
        btnAdjuntar.setAlignment(Pos.TOP_RIGHT);

        //! Parte superior derecha

        
        Image imgPhone = new Image("Imag/Telefono.png");
        ImageView imgPhone2 = new ImageView(imgPhone);
        imgPhone2.setFitHeight(20);
        imgPhone2.setFitWidth(25);
        Button btnPhone = new Button("", imgPhone2);
        btnPhone.setCursor(Cursor.HAND);
        btnPhone.setAlignment(Pos.TOP_LEFT);
        btnPhone.setStyle("-fx-background-color: #F5FFFA;");
        
        Image imgVideollamada = new Image("Imag/Videollamada.png");
        ImageView imgVideollamada2 = new ImageView(imgVideollamada);
        imgVideollamada2.setFitHeight(20);
        imgVideollamada2.setFitWidth(25);
        Button btnVideollamada = new Button("", imgVideollamada2);
        btnVideollamada.setCursor(Cursor.HAND);
        btnVideollamada.setAlignment(Pos.TOP_LEFT);
        btnVideollamada.setStyle("-fx-background-color: #F5FFFA;");

        Image imgPuntos = new Image("Imag/PuntosConfiguracion.png");
        ImageView imgPuntos2 = new ImageView(imgPuntos);
        imgPuntos2.setFitHeight(20);
        imgPuntos2.setFitWidth(25);
        Button btnPuntos = new Button("", imgPuntos2);
        btnPuntos.setCursor(Cursor.HAND);
        btnPuntos.setAlignment(Pos.TOP_LEFT);
        btnPuntos.setStyle("-fx-background-color: #F5FFFA;");
        
        
        HBox vContent2 = new HBox(10, btnBuscar,txtBuscarChat);
        vContent2.setStyle("-fx-background-color: #696969;");
        scrollPane2.setContent(vContent2);
        scrollPane2.setHbarPolicy(ScrollBarPolicy.ALWAYS);
        vContent2.setAlignment(Pos.TOP_RIGHT);
        
        
        
        //! -----
        
        
        //scrollPane2.setContent(btnBuscar);
        
        
        

        /* 
          
        
        btnEnviar.setOnAction(new EventHandler<ActionEvent>() 
		{

            @Override
            public void handle(ActionEvent arg0) {

                mandarMensaje(txtIngreso, vContent);
            }
        });

        txtIngreso.setOnKeyPressed(new EventHandler<KeyEvent>() 
		{
            
            @Override
            public void handle(KeyEvent arg0) {
                if (arg0.getCode().equals(KeyCode.ENTER)) {

                    mandarMensaje(txtIngreso, vContent);

                }
                
            }
            
        });
        
        */
        
        flowPane2.getChildren().addAll(btnMsj,btnGroups,btnProfile,btnSetting,btnLogOut);
        flowPane.getChildren().addAll(btnEmote, btnAdjuntar, txtIngreso, btnEnviar);
        flowPane3.getChildren().addAll(lblNombre,lblEstado, btnPhone, btnVideollamada, btnPuntos);
        flowPane4.getChildren().addAll(vboxChat, vboxChat2);


        AnchorPane.setBottomAnchor(flowPane, 0.0);
        AnchorPane.setLeftAnchor(flowPane, 150.0);
        AnchorPane.setRightAnchor(flowPane, 0.0);
        AnchorPane.setBottomAnchor(flowPane, 0.0);

        AnchorPane.setTopAnchor(flowPane2, 33.0);

        AnchorPane.setTopAnchor(flowPane3, 10.0);
        AnchorPane.setLeftAnchor(flowPane3, 20.0);
        
        
        root1.getChildren().add(scrollPane1);
        root2.getChildren().add(scrollPane2);

        root1.getChildren().add(flowPane);
        root1.getChildren().add(flowPane3);
        root2.getChildren().add(flowPane2);
        

        //Scene scene = new Scene(root, 551, 201);
        Scene scene = new Scene(root, 851, 650);
        pantalla.setScene(scene);
        pantalla.setTitle("Chat");
        // showing the output
        pantalla.show();
	}
	
    /* 
      
	public void mandarMensaje(TextField txtIngreso, VBox vContent) 
	{

        FlowPane fMessage = new FlowPane(140, 10);
        Label lblUser = new Label();
        lblUser.setWrapText(true);
        lblUser.setPrefWidth(200);
        lblUser.setMaxWidth(Region.USE_PREF_SIZE);
        Label lblTime = new Label();
        lblTime.setFont((new Font(8)));

        if (!(txtIngreso.getText().equals(""))) 
		{

            lblUser.setText(txtIngreso.getText());

            if (LocalTime.now().getMinute() <= 9 || LocalTime.now().getHour() >= 12 && LocalTime.now().getHour() <= 24) 
			{

                lblTime.setText(" " + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + " p.m.");

            } else 
            {

                lblTime.setText(" " + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute() + " a.m.");
                
            }

            txtIngreso.setText("");
            fMessage.getChildren().addAll(lblUser, lblTime);
            fMessage.setStyle(
                    "-fx-background-color: #20B2AA; -fx-shape: 'M 400 150 C 200 150 200 150 200 250 C 200 350 200 350 400 350 C 600 350 600 350 600 250 C 600 150 600 150 400 150';");
            vContent.getChildren().add(fMessage);
        }

    }
    */
    

    
	public static void main(String[] args) 
	{
		launch(args);
	}
   
}
