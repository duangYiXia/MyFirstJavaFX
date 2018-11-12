package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class Controller {
    @FXML
    private MediaView mv;

    @FXML
    private void clickme(ActionEvent event) throws Exception {
        String media_URL = this.getClass().getResource("/VID_20170830_221609.mp4").toString();
        Media media = new Media(media_URL);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true); //设置自动播放
        mv.setMediaPlayer(mediaPlayer);
    }
}
