package final1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import java.io.IOException;
import java.util.Locale;

public class CulminatingController {
    private Culminating[] cul;
    private int index;
    private int s1;
    private int s2;
    private int s3;
    private Culminating[] cart;

    public CulminatingController() {
        this.cul = new Culminating[20];
        this.index = 0;
        this.s1 = (int) (Math.random() * (19 + 1) + 0);
        this.s2 = (int) (Math.random() * (19 + 1) + 0);
        this.s3 = (int) (Math.random() * (19 + 1) + 0);
        this.cart = new Culminating[5];
        cul[0] = new Culminating("monitor", 2000000, "https://www.tokopedia.com/ichi-tech/monitor-samsung-s24r350-led-24-inch-ips-75hz-hdmi-vga?src=topads", "gadgets", 0);
        cul[1] = new Culminating("mouse", 150000, "https://www.tokopedia.com/logitech/exclusive-tokopedia-logitech-m275-wireless-mouse-black?src=topads", "gadgets", 1);
        cul[2] = new Culminating("headphones", 225000, "https://www.tokopedia.com/soulelectronics/soul-ultra-high-definition-dynamic-bass-on-ear-headphone-hitam?src=topads", "gadgets", 2);
        cul[3] = new Culminating("mousepad", 72000, "https://www.tokopedia.com/aukey/mouse-pad-aukey-km-p2-500878?src=topads", "gadgets", 3);
        cul[4] = new Culminating("keyboard", 370000, "https://www.tokopedia.com/blisatu/logitech-k380-multi-device-bluetooth-keyboard-biru-hitam?src=topads", "gadgets", 4);
        cul[5] = new Culminating("knife", 146000, "https://www.tokopedia.com/bagusmartid/bagus-yamazaki-chef-s-knife-8-inch?src=topads", "kitchen", 5);
        cul[6] = new Culminating("spoon", 2300, "https://www.tokopedia.com/dariduasatu/sendok-makan-polos-stainless-steel?src=topads", "kitchen", 6);
        cul[7] = new Culminating("fork", 4000, "https://www.tokopedia.com/perabot-dapur/garpu-makan-glowsy-komodo-stainless-steel-6-pcs-eat-fork-cutlery-set?extParam=ivf%3Dfalse%26src%3Dsearch&refined=true", "kitchen", 7);
        cul[8] = new Culminating("rice cooker", 550000, "https://www.tokopedia.com/philips-estore/philips-rice-cooker-biru-hd3119-31?src=topads", "kitchen", 8);
        cul[9] = new Culminating("plates", 30000, "https://www.tokopedia.com/platerie/piring-keramik-dinner-plate-10-5-inch-coupe-pink-blue-teracota-pink?src=topads", "kitchen", 9);
        cul[10] = new Culminating("teddy bear", 250000, "https://www.tokopedia.com/shantyleon/boneka-beruang-teddy-bear-cream-super-jumbo-uk-1-5m?extParam=ivf%3Dfalse%26src%3Dsearch", "toys", 10);
        cul[11] = new Culminating("car", 68000, "https://www.tokopedia.com/gogo57/sg-toys-sl-200-p-mainan-anak-mobil-polisi-duduk-dorong-ride-on-sl200p-tanpa-bubble?extParam=ivf%3Dfalse%26src%3Dsearch", "toys", 11);
        cul[12] = new Culminating("animal", 25000, "https://www.tokopedia.com/princesstoys/mainan-animal-world-hewan-liar-sea-world-dinosau-figure-miniatur-hewan-animal-d?src=topads", "toys", 12);
        cul[13] = new Culminating("yoyo", 24000, "https://www.tokopedia.com/bebyrose-17/mainan-yoyo-besi-chrome-3-bearing-biru?src=topads", "toys", 13);
        cul[14] = new Culminating("rubics cube", 80000, "https://www.tokopedia.com/balamcubes/paket-rubik-best-seller-2x2-3x3-4x4-yj-guanpo-guanlong-guansu-black", "toys", 14);
        cul[15] = new Culminating("coloring book", 27500, "https://www.tokopedia.com/areabukumurah/coloring-books-for-adult-good-bye-stress-terapi-warna-anti-stres?src=topads", "books", 15);
        cul[16] = new Culminating("harry potter", 160000, "https://www.tokopedia.com/beaututorial/harry-potter-01-and-the-philosopher-s-stone", "books", 16);
        cul[17] = new Culminating("a promised land", 11000, "https://www.tokopedia.com/amazonbookgrosir/buku-a-promised-land-barack-obama?src=topads", "books", 17);
        cul[18] = new Culminating("the silence of the lambs", 85000, "https://www.tokopedia.com/novel-books/the-silence-of-the-lambs?src=topads", "books", 18);
        cul[19] = new Culminating("hunger games", 75000, "https://www.tokopedia.com/globalnovel/hunger-games-2-catching-fire-by-suzanne-collins", "among", 19);
    }

    @FXML
    Hyperlink lin,lin2,l1,l2,l3,l4,l5 = new Hyperlink();
    @FXML
    TextField search, inpam = new TextField();
    @FXML
    Label balances,test,overall, itname,itname2,itcost2, itcost,itcost3, balp, g1, g2, g3, c1,c2,c3,c4,c5,n1,n2,n3,n4,n5,p1,p11,p12,p13,p14,p15,p16,p17,p18,p19,p110,p111,p112,p113,p114,p115,p116,p117,p118,p119 = new Label();
    @FXML
    ImageView tv, gv, bv, kv, sv1, sv2, sv3, itpc = new ImageView();
    @FXML
    TextArea list = new TextArea();

    Culminating cg;
    String display, fl, pl, dl, gl, zl;
    double kl, ll, cl, vl, bl, nl;

    CulminatingApplication app = new CulminatingApplication();
//    CulminatingController cu = new CulminatingController();


    public void add(Culminating cu) {
        if (index < cul.length) {
            cul[index] = cu;
            index++;
        }
    }

    public void searchbtn() {
        if (search.getText().isEmpty()) {
            display = "Enter a text or a number";
            fl = "Enter a text or a number";
            pl = "Enter a text or a number";
        } else {
            for (int i = 0; i < 19; i++) {
                if (search.getText().toLowerCase(Locale.ROOT).equals(cul[i].getName())) {
                    display = cul[i].getUrl();
                    fl = cul[i].getName();
                    pl = String.valueOf(cul[i].getCost());
                }
            }
            if (display == null) {
                display = "Item was not found";
                fl = "Item was not found";
                pl = "Item was not found";
            }
        }
        itname.setText(fl);
        lin.setText(display);
        itcost.setText(pl);
    }


    public void topupclick() {
        if (!inpam.getText().isEmpty()) { // ask how to only get numbers
            display = inpam.getText();
            inpam.setText("");
        } else {
            display = "Enter a number";
        }
        balances.setText(display);
    }

    public void gobackclick(ActionEvent event) throws IOException {
        Parent finale = FXMLLoader.load(getClass().getResource("Culminating-view.fxml"));
        Scene scene = new Scene(finale);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Online Shop");
        stage.setScene(scene);
        stage.show();
    }

    public void gadgetsclick(ActionEvent event) throws IOException {
        Parent finale = FXMLLoader.load(getClass().getResource("gadget-view.fxml"));
        Scene scene = new Scene(finale);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Gadgets");
        stage.setScene(scene);
        stage.show();
    }

    public void booksclick(ActionEvent event) throws IOException {
        Parent finale = FXMLLoader.load(getClass().getResource("books-view.fxml"));
        Scene scene = new Scene(finale);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Books");
        stage.setScene(scene);
        stage.show();
    }

    public void toyclick(ActionEvent event) throws IOException {
        Parent finale = FXMLLoader.load(getClass().getResource("toys-view.fxml"));
        Scene scene = new Scene(finale);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Toys");
        stage.setScene(scene);
        stage.show();
    }

    public void kitchenclick(ActionEvent event) throws IOException {
        Parent finale = FXMLLoader.load(getClass().getResource("kitchen-view.fxml"));
        Scene scene = new Scene(finale);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Kitchen");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void go1() {
        int f = (int) (Math.random() * (19 + 1) + 0);
        app.getHostServices().showDocument(cul[f].getUrl());
    }

    @FXML
    protected void go2() {
        app.getHostServices().showDocument(cul[s2].getUrl());
        g3.setText(cul[s3].getName());
    }

    @FXML
    protected void saleclick() {
        app.getHostServices().showDocument(cul[s3].getUrl());
        g2.setText(cul[s2].getName());
    }

    @FXML
    protected void link() {
        app.getHostServices().showDocument("https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstley");
    }

    public void checkout(ActionEvent event) throws IOException {
        Parent finale = FXMLLoader.load(getClass().getResource("Checkout-view.fxml"));
        Scene scene = new Scene(finale);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Checkout");
        stage.setScene(scene);
        stage.show();
    }

    public void addclick() {
        for (int i = 0; i < 19; i++) {
            if (search.getText().toLowerCase(Locale.ROOT).equals(cul[i].getName())) {
                cart[index] = cul[i];
                index++;
                if(cart[0] != null && cart[1] == null && cart[2] == null&& cart[3] == null&& cart[4] == null){
                    n1.setText(cart[0].getName());
                    c1.setText(String.valueOf(cart[0].getCost()));
                    l1.setText(cart[0].getUrl());
                }else if (cart[0] != null && cart[1] != null && cart[2] == null&& cart[3] == null&& cart[4] == null) {
                    n1.setText(cart[0].getName());
                    c1.setText(String.valueOf(cart[0].getCost()));
                    l1.setText(cart[0].getUrl());
                    n2.setText(cart[1].getName());
                    c2.setText(String.valueOf(cart[1].getCost()));
                    l2.setText(cart[1].getUrl());
                } else if (cart[0] != null && cart[1] != null && cart[2] != null&& cart[3] == null&& cart[4] == null) {
                    n1.setText(cart[0].getName());
                    c1.setText(String.valueOf(cart[0].getCost()));
                    l1.setText(cart[0].getUrl());
                    n2.setText(cart[1].getName());
                    c2.setText(String.valueOf(cart[1].getCost()));
                    l2.setText(cart[1].getUrl());
                    n3.setText(cart[2].getName());
                    c3.setText(String.valueOf(cart[2].getCost()));
                    l3.setText(cart[2].getUrl());
                } else if (cart[0] != null && cart[1] != null && cart[2] != null&& cart[3] != null&& cart[4] == null) {
                    n1.setText(cart[0].getName());
                    c1.setText(String.valueOf(cart[0].getCost()));
                    l1.setText(cart[0].getUrl());
                    n2.setText(cart[1].getName());
                    c2.setText(String.valueOf(cart[1].getCost()));
                    l2.setText(cart[1].getUrl());
                    n3.setText(cart[2].getName());
                    c3.setText(String.valueOf(cart[2].getCost()));
                    l3.setText(cart[2].getUrl());
                    n4.setText(cart[3].getName());
                    c4.setText(String.valueOf(cart[3].getCost()));
                    l4.setText(cart[3].getUrl());

                } else if (cart[0] != null && cart[1] != null && cart[2] != null&& cart[3] != null && cart[4] != null) {
                    n1.setText(cart[0].getName());
                    c1.setText(String.valueOf(cart[0].getCost()));
                    l1.setText(cart[0].getUrl());
                    n2.setText(cart[1].getName());
                    c2.setText(String.valueOf(cart[1].getCost()));
                    l2.setText(cart[1].getUrl());
                    n3.setText(cart[2].getName());
                    c3.setText(String.valueOf(cart[2].getCost()));
                    l3.setText(cart[2].getUrl());
                    n4.setText(cart[3].getName());
                    c4.setText(String.valueOf(cart[3].getCost()));
                    l4.setText(cart[3].getUrl());
                    n5.setText(cart[4].getName());
                    c5.setText(String.valueOf(cart[4].getCost()));
                    l5.setText(cart[4].getUrl());
                }
            }
        }
    }

    public void revc() {
        p1.setText(cul[0].toString());
        p11.setText(cul[1].toString());
        p12.setText(cul[2].toString());
        p13.setText(cul[3].toString());
        p14.setText(cul[4].toString());
        p15.setText(cul[5].toString());
        p16.setText(cul[6].toString());
        p17.setText(cul[7].toString());
        p18.setText(cul[8].toString());
        p19.setText(cul[9].toString());
        p110.setText(cul[10].toString());
        p111.setText(cul[11].toString());
        p112.setText(cul[12].toString());
        p113.setText(cul[13].toString());
        p114.setText(cul[14].toString());
        p115.setText(cul[15].toString());
        p116.setText(cul[16].toString());
        p117.setText(cul[17].toString());
        p118.setText(cul[18].toString());
        p119.setText(cul[19].toString());
        }


    @FXML
    protected void linkk() {
        app.getHostServices().showDocument(lin.getText());
    }
        public void dclick(ActionEvent event) throws IOException {
            Parent finale = FXMLLoader.load(getClass().getResource("list-view.fxml"));
            Scene scene = new Scene(finale);

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Full list");
            stage.setScene(scene);
            stage.show();
    }
    public void l11(){
        app.getHostServices().showDocument(cart[0].getUrl());
    }
    public void l22(){
        app.getHostServices().showDocument(cart[1].getUrl());
    }
    public void l33(){
        app.getHostServices().showDocument(cart[2].getUrl());
    }
    public void l44(){
        app.getHostServices().showDocument(cart[3].getUrl());
    }
    public void l55(){
        app.getHostServices().showDocument(cart[4].getUrl());
    }
    public void r1(){
        cart[0] = null;
        n1.setText(" ");
        c1.setText(" ");
        l1.setText(" ");
    }
    public void r2(){
        cart[1] = null;
        n2.setText(" ");
        c2.setText(" ");
        l2.setText(" ");
    }
    public void r3(){
        cart[2] = null;
        n3.setText(" ");
        c3.setText(" ");
        l3.setText(" ");
    }
    public void r4(){
        cart[3] = null;
        n4.setText(" ");
        c4.setText(" ");
        l4.setText(" ");
    }
    public void r5(){
        cart[4] = null;
        n5.setText(" ");
        c5.setText(" ");
        l5.setText(" ");
    }
    public void overall(){
        double q = cart[0].getCost();
        double w = cart[1].getCost();
        double e = cart[2].getCost();
        double r = cart[3].getCost();
        double t = cart[4].getCost();
        display = String.valueOf(q + w +e + r +t);
        overall.setText(display);
    }
}

