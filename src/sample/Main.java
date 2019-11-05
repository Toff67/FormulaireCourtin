package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.w3c.dom.Text;

public class Main extends Application {

    private Stage primaryStage;
    private TextField login;
    private PasswordField mdp;
    private TextField nom;
    private TextField prenom;
    private TextField adresse;
    private TextField cp;
    private TextField ville;
    private TextField mail;
    private Button valider;
    private Button connexion;
    private Button retour;
    private Scene scene, scene2, scene3;
    public static void main(String[] args) { Application.launch(Main.class, args); }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Formulaire d'inscription");
        TextField login = new TextField("Login:");
        PasswordField passwordField = new PasswordField();
        TextField nom = new TextField("Nom:");
        TextField prenom = new TextField("Prenom:");
        TextField adresse = new TextField("Adresse:");
        TextField cp = new TextField("Code postale:");
        TextField ville = new TextField("Ville:");
        TextField mail = new TextField("Mail:");
        Group root = new Group();
        Group root2 = new Group();
        Group root3 = new Group();
        Scene scene = new Scene(root, 500, 600, Color.LAWNGREEN);
        Scene scene2 = new Scene(root2, 500, 600, Color.LEMONCHIFFON);
        Scene scene3 = new Scene(root3, 500, 600, Color.CORNFLOWERBLUE);

        login = initTextField(70, 150, "Entrer votre login");
        //passwordField.setPomptText(80,200, "Entrer votre mot de passe");
        nom = initTextField(70, 200, "Entrer votre nom");
        prenom = initTextField(320, 200, "Entrer votre prénom");
        adresse = initTextField(70, 250,"Entrer votre adresse");
        cp = initTextField(320, 250, "Entrer votre code postale");
        ville = initTextField(70, 300, "Entrer votre ville");
        mail = initTextField(320, 300, "Entrer votre mail");

        valider = initButton(230, 350, "Valider",Color.LIGHTBLUE);
        connexion = initButton(230, 550, "Connexion",Color.LIGHTBLUE);
        retour = initButton(230, 550, "Retour",Color.LIGHTBLUE);

        valider.setOnAction(event -> primaryStage.setScene(scene2));
        connexion.setOnAction(event -> primaryStage.setScene(scene3));
        retour.setOnAction(event -> primaryStage.setScene(scene2));

        // composition des scenes
        root.getChildren().add(login);
        root.getChildren().add(passwordField);
        root.getChildren().add(nom);
        root.getChildren().add(prenom);
        root.getChildren().add(adresse);
        root.getChildren().add(cp);
        root.getChildren().add(ville);
        root.getChildren().add(mail);
        root.getChildren().add(valider);
        root2.getChildren().add(connexion);
        root3.getChildren().add(retour);

        // gestion de l'affichage au lancement
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private TextField initTextField(int longueur, int largeur, String texteChamp) {

        // Création des champs texte
        TextField a = new TextField();
        a.setLayoutX(longueur);
        a.setLayoutY(largeur);
        a.setText(texteChamp);
        return a;
    }

    private Button initButton(int longueur, int largeur, String texteDuBoutton, Color lightblue) {

        // Création des bouttons
        Button b = new Button();
        b.setLayoutX(longueur);
        b.setLayoutY(largeur);
        b.setText(texteDuBoutton);
        return b;
    }


}
