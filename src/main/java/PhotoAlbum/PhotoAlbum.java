package PhotoAlbum;

import javafx.scene.image.Image;

import java.io.File;

public class PhotoAlbum {
    private File[] files;
    private Image[] images;
    int index;

    public PhotoAlbum() {
        files = new File[4];
        images = new Image[4];
        index = 0;
        setFilesImages();
    }

    public void setFilesImages() {
        files[0] = new File("src/main/resources/PhotoAlbum/images/king_of_clubs2.png");
        files[1] = new File("src/main/resources/PhotoAlbum/images/king_of_diamonds2.png");
        files[2] = new File("src/main/resources/PhotoAlbum/images/king_of_hearts2.png");
        files[3] = new File("src/main/resources/PhotoAlbum/images/king_of_spades2.png");

        for (int i = 0; i < images.length; i++) {
            images[i] = new Image(files[i].toURI().toString());
        }
    }

    public Image getNextImage() {
        Image image = images[0];
        if (index < images.length) {
            image = images[index];
            index++;
        }
        return image;
    }
    public Image getPreviousImage(){
        Image image = images[index - 1];
        if(index <= images.length){
            image = images[index - 1];
            index--;
            if(index <= 0){
                index = 1;
            }
        }
        return image;
    }
}
