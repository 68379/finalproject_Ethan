package PhotoAlbum;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class PhotoAlbumController {

    @FXML
    ImageView imageView = new ImageView();

    PhotoAlbum PhotoAlbum = new PhotoAlbum();

    @FXML
    public void BtnNext(){
        imageView.setImage(PhotoAlbum.getNextImage());
    }
    @FXML
    public void BtnBack(){
        imageView.setImage(PhotoAlbum.getPreviousImage());
    }
}
