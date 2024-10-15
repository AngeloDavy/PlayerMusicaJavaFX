package org.example.playermusica;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import jdk.jfr.BooleanFlag;

import java.util.ArrayList;
import java.util.List;

public class HelloController {

    @FXML
    private MediaView mediaView;

    @FXML
    private AnchorPane telaApp;

    @FXML
    private Slider tempoMusica;

    @FXML
    private Slider sletorVolume;

    @FXML
    private Label tempoAtual;

    @FXML
    private Label tempoTotal;

    @FXML
    private Label nomeMusica;

    private MediaPlayer mediaPlayer;

    private List<String> musicas;

    private int indiceMusicaAtual;

    public void initialize(){
        musicas = new ArrayList<>();
    }

    public void fechar(){
        System.exit(0);
    }

    public void minimizar(){
        ((Stage)telaApp.getScene().getWindow()).toBack();
    }

    public void anterior(){

    }

    public void play(){

    }
    public void pause(){

    }
    public void stop(){

    }
    public void proxima(){

    }
    public void mudo(){

    }
}