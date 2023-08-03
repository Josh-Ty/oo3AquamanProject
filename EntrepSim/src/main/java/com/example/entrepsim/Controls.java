package com.example.entrepsim;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.IOException;
import static java.lang.Math.pow;
import static java.lang.Math.round;

public class Controls {
    Lemonade lemonade = new Lemonade(0,1,50);
    Dog dog = new Dog(0,10,475);
    Rice rice = new Rice(0,50,2250);
    Resto resto = new Resto(0,100,4250);
    Estate estate = new Estate(0,500,20000);
    Pharma pharma = new Pharma(0,1000,37500);
    Sports sports = new Sports(0,2500,87500);
    Stock stock = new Stock(0,5000,162500);
    Space space = new Space(0,10000,300000);
    Astro astro = new Astro(0,20000,550000);
    private static long finalScore;
    private double activeLVL = 1;
    private static long elapsedTime;
    private long passive = 0;
    boolean startTime = false;
    private double money = 0;
    private Stage primaryStage;
    int mode;
    private static int modeLegacy;
    @FXML
    Text score = new Text();
    @FXML
    ImageView muskMode = new ImageView();
    @FXML
    ImageView timeMode = new ImageView();
    @FXML
    Text format = new Text();
    @FXML
    ImageView work = new ImageView();
    @FXML
    Text workLVL = new Text();
    @FXML
    Button clickUpgrade = new Button();
    @FXML
    ImageView lemon = new ImageView();
    @FXML
    Text lemonLVL = new Text();
    @FXML
    Text lemonCost = new Text();
    @FXML
    Text lemonInc = new Text();
    @FXML
    ImageView doge = new ImageView();
    @FXML
    Text dogLVL = new Text();
    @FXML
    Text dogCost = new Text();
    @FXML
    Text dogInc = new Text();
    @FXML
    ImageView field = new ImageView();
    @FXML
    Text riceLVL = new Text();
    @FXML
    Text riceCost = new Text();
    @FXML
    Text riceInc = new Text();
    @FXML
    ImageView fazbear = new ImageView();
    @FXML
    Text restoLVL = new Text();
    @FXML
    Text restoCost = new Text();
    @FXML
    Text restoInc = new Text();
    @FXML
    ImageView meme = new ImageView();
    @FXML
    Text houseLVL = new Text();
    @FXML
    Text houseCost = new Text();
    @FXML
    Text houseInc = new Text();
    @FXML
    ImageView pills = new ImageView();
    @FXML
    Text pharmaLVL = new Text();
    @FXML
    Text pharmaCost = new Text();
    @FXML
    Text pharmaInc = new Text();
    @FXML
    ImageView volley = new ImageView();
    @FXML
    Text sportsLVL = new Text();
    @FXML
    Text sportsCost = new Text();
    @FXML
    Text sportsInc = new Text();
    @FXML
    ImageView stonks = new ImageView();
    @FXML
    Text bankLVL = new Text();
    @FXML
    Text bankCost = new Text();
    @FXML
    Text bankInc = new Text();
    @FXML
    ImageView stickmin = new ImageView();
    @FXML
    Text resortLVL = new Text();
    @FXML
    Text resortCost = new Text();
    @FXML
    Text resortInc = new Text();
    @FXML
    ImageView astroImage = new ImageView();
    @FXML
    Text asteroidLVL = new Text();
    @FXML
    Text asteroidCost = new Text();
    @FXML
    Text asteroidInc = new Text();
    @FXML
    Text cash = new Text();
    @FXML
    Label timer = new Label();
    @FXML
    Text passiveIncome = new Text();
    @FXML
    Button Start = new Button();
    int count = 0;
    long activeCost = 20;
    @FXML
    public void quitButtonClick(){
        Platform.exit();
    }
    public void mainMenuClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(EntrepSim.class.getResource("MainMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        primaryStage.setScene(scene);
        primaryStage.setTitle("Entrepreneur Simulator");
        primaryStage.show();
    }
    public void Leaderboard(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(EntrepSim.class.getResource("Credits.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Entrepreneur Simulator");
        primaryStage.show();
    }
    public void GameStart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(EntrepSim.class.getResource("Gamemodes.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Entrepreneur Simulator");
        primaryStage.show();
    }
    public void muskStart(MouseEvent event) throws IOException{
        Parent root = FXMLLoader.load(EntrepSim.class.getResource("Game.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Entrepreneur Simulator");
        primaryStage.show();
        elapsedTime = 0;
    }
    public void timeStart(MouseEvent event) throws IOException{
        Parent root = FXMLLoader.load(EntrepSim.class.getResource("Game.fxml"));
        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Entrepreneur Simulator");
        primaryStage.show();
        elapsedTime = 1800;
    }
    public void muskHover(MouseEvent event){
        Image off = new Image("file:src/main/resources/com/example/entrepsim/muskOn.png");
        muskMode.setImage(off);
    }
    public void muskExit(MouseEvent event){
        Image off = new Image("file:src/main/resources/com/example/entrepsim/musk.png");
        muskMode.setImage(off);
    }
    public void timeHover(MouseEvent event){
        Image off = new Image("file:src/main/resources/com/example/entrepsim/kurumiGood.png");
        timeMode.setImage(off);
    }
    public void timeExit(MouseEvent event){
        Image off = new Image("file:src/main/resources/com/example/entrepsim/kurumi.png");
        timeMode.setImage(off);
    }
    private void watch(MouseEvent event) {
        Task<Void> sleeper = new Task<>() {
            @Override
            protected Void call() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ignored) {
                }
                return null;
            }
        };
        sleeper.setOnSucceeded(workerStateEvent ->
        {
            if(mode == 1){
                if(money == 1000000000){
                    try {
                        modeLegacy = mode;
                        finalScore = elapsedTime;
                        FXMLLoader fxmlLoader = new FXMLLoader(EntrepSim.class.getResource("End.fxml"));
                        Scene scene = new Scene(fxmlLoader.load());
                        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        primaryStage.setScene(scene);
                        primaryStage.setTitle("Entrepreneur Simulator");
                        primaryStage.show();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                else{
                    elapsedTime += 1;
                    timer.setText(String.format("%02d", elapsedTime / 3600) + ":" + String.format("%02d", (elapsedTime / 60) % 60) + ":" + String.format("%02d", elapsedTime % 60));
                    money = money + passive;
                    cash.setText(String.valueOf(String.format("%.0f", money)));
                    watch(event);
                }
            }
            else{
                if(elapsedTime == 0){
                    try {
                        modeLegacy = mode;
                        finalScore = (long) money;
                        FXMLLoader fxmlLoader = new FXMLLoader(EntrepSim.class.getResource("End.fxml"));
                        Scene scene = new Scene(fxmlLoader.load());
                        primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                        primaryStage.setScene(scene);
                        primaryStage.setTitle("Entrepreneur Simulator");
                        primaryStage.show();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                else{
                    elapsedTime-=1;
                    timer.setText(String.format("%02d", elapsedTime/3600)+":"+String.format("%02d", (elapsedTime/60) % 60)+":"+String.format("%02d", elapsedTime%60));
                    money = money + passive;
                    cash.setText(String.valueOf(String.format("%.0f", money)));
                    watch(event);
                }
            }
        });
        new Thread(sleeper).start();
    }

    public void workTrigger(MouseEvent event){
        Image on = new Image("file:src/main/resources/com/example/entrepsim/trigger.png");
        work.setImage(on);
        money = money + (round(pow(1.25,activeLVL-1))) + (activeLVL-1);
        cash.setText(String.valueOf(String.format("%.0f", money)));
        if(!startTime){
            if(elapsedTime == 0){
                mode = 1;
            }
            else{
                mode = 0;
            }
            startTime = true;
            watch(event);
        }
        if(mode == 1){
            format.setText("Time Elapsed:");
        }
        else {
            format.setText("Time Left:");
        }
    }
    public void scoreClick(MouseEvent event){
        if(modeLegacy == 1) {
            score.setText(String.format("%02d", finalScore / 3600) + ":" + String.format("%02d", (finalScore / 60) % 60) + ":" + String.format("%02d", finalScore % 60)+" (Elongated Muskrat Mode)");
        }
        else{
            score.setText("$"+finalScore+" (Devouring Time Mode)");
        }
    }
    public void workRelease(MouseEvent event){
        Image off = new Image("file:src/main/resources/com/example/entrepsim/work.png");
        work.setImage(off);
    }
    public void workUpgrade(ActionEvent event){

        if(money >= activeCost){
            money = money - activeCost;
            cash.setText(String.valueOf(String.format("%.0f", money)));
            count++;
            clickUpgrade.setText("Upgrade Income (Cost: "+ (round(20*pow(1.5,count))) +")");
            activeCost = (round(20*pow(1.5,count)));
            activeLVL++;
            workLVL.setText("Click Level "+String.format("%.0f", activeLVL));
    }}
    public void lemonTrigger(MouseEvent event){
        if(money >= lemonade.getCost()){
            money += lemonade.upgrade(lemonade.getCost());
            passive = passive + lemonade.getIncome();
            passiveIncome.setText(passive+" per second");
            lemonade.upgrade(lemonade.getLevel());
            lemonade.newPrice();
            Image good = new Image("file:src/main/resources/com/example/entrepsim/lemonGood.png");
            lemonLVL.setText("Level "+lemonade.getLevel());
            lemon.setImage(good);
            cash.setText(String.valueOf(String.format("%.0f", money)));
            lemonCost.setText("Lemonade Stand (Cost: "+lemonade.getCost()+"):");
            lemonInc.setText("Income: "+ lemonade.update(lemonade.getLevel(),lemonade.getIncome())+"/sec");
        }
        else{
            Image bad = new Image("file:src/main/resources/com/example/entrepsim/lemonBad.png");
            lemon.setImage(bad);
        }
    }
    public void lemonRelease(MouseEvent event){
        Image lemondef = new Image("file:src/main/resources/com/example/entrepsim/lemon.png");
        lemon.setImage(lemondef);
    }
    public void dogTrigger(MouseEvent event){
        if(money >= dog.getCost()){
            money += dog.upgrade(dog.getCost());
            passive = passive + dog.getIncome();
            passiveIncome.setText(passive+" per second");
            dog.upgrade(dog.getLevel());
            dog.newPrice();
            Image good = new Image("file:src/main/resources/com/example/entrepsim/dogGood.png");
            dogLVL.setText("Level "+dog.getLevel());
            doge.setImage(good);
            cash.setText(String.valueOf(String.format("%.0f", money)));
            dogCost.setText("Dog Walking (Cost: "+dog.getCost()+"):");
            dogInc.setText("Income: "+ dog.update(dog.getLevel(),dog.getIncome())+"/sec");
        }
        else{
            Image bad = new Image("file:src/main/resources/com/example/entrepsim/dogBad.png");
            doge.setImage(bad);
        }
    }
    public void dogRelease(MouseEvent event){
        Image def = new Image("file:src/main/resources/com/example/entrepsim/dog.png");
        doge.setImage(def);
    }
    public void riceTrigger(MouseEvent event){
        if(money >= rice.getCost()){
            money += rice.upgrade(rice.getCost());
            passive = passive + rice.getIncome();
            passiveIncome.setText(passive+" per second");
            rice.upgrade(rice.getLevel());
            rice.newPrice();
            Image good = new Image("file:src/main/resources/com/example/entrepsim/riceGood.png");
            riceLVL.setText("Level "+rice.getLevel());
            field.setImage(good);
            cash.setText(String.valueOf(String.format("%.0f", money)));
            riceCost.setText("Rice Fields (Cost: "+rice.getCost()+"):");
            riceInc.setText("Income: "+ rice.update(rice.getLevel(),rice.getIncome())+"/sec");
        }
        else{
            Image bad = new Image("file:src/main/resources/com/example/entrepsim/riceBad.png");
            field.setImage(bad);
        }
    }
    public void riceRelease(MouseEvent event){
        Image def = new Image("file:src/main/resources/com/example/entrepsim/rice.png");
        field.setImage(def);
    }
    public void restoTrigger(MouseEvent event){
        if(money >= resto.getCost()){
            money += resto.upgrade(resto.getCost());
            passive = passive + resto.getIncome();
            passiveIncome.setText(passive+" per second");
            resto.upgrade(resto.getLevel());
            resto.newPrice();
            Image good = new Image("file:src/main/resources/com/example/entrepsim/restoGood.png");
            restoLVL.setText("Level "+resto.getLevel());
            fazbear.setImage(good);
            cash.setText(String.valueOf(String.format("%.0f", money)));
            restoCost.setText("Rstaurant (Cost: "+resto.getCost()+"):");
            restoInc.setText("Income: "+ resto.update(resto.getLevel(),resto.getIncome())+"/sec");
        }
        else{
            Image bad = new Image("file:src/main/resources/com/example/entrepsim/restoBad.png");
            fazbear.setImage(bad);
        }
    }
    public void restoRelease(MouseEvent event){
        Image def = new Image("file:src/main/resources/com/example/entrepsim/resto.png");
        fazbear.setImage(def);
    }
    public void estateTrigger(MouseEvent event){
        if(money >= estate.getCost()){
            money += estate.upgrade(estate.getCost());
            passive = passive + estate.getIncome();
            passiveIncome.setText(passive+" per second");
            estate.upgrade(estate.getLevel());
            estate.newPrice();
            Image good = new Image("file:src/main/resources/com/example/entrepsim/houseGood.png");
            houseLVL.setText("Level "+estate.getLevel());
            meme.setImage(good);
            cash.setText(String.valueOf(String.format("%.0f", money)));
            houseCost.setText("Real Estate (Cost: "+estate.getCost()+"):");
            houseInc.setText("Income: "+ estate.update(estate.getLevel(),estate.getIncome())+"/sec");
        }
        else{
            Image bad = new Image("file:src/main/resources/com/example/entrepsim/houseBad.png");
            meme.setImage(bad);
        }
    }
    public void estateRelease(MouseEvent event){
        Image def = new Image("file:src/main/resources/com/example/entrepsim/house.png");
        meme.setImage(def);
    }
    public void pharmaTrigger(MouseEvent event){
        if(money >= pharma.getCost()){
            money += pharma.upgrade(pharma.getCost());
            passive = passive + pharma.getIncome();
            passiveIncome.setText(passive+" per second");
            pharma.upgrade(pharma.getLevel());
            pharma.newPrice();
            Image good = new Image("file:src/main/resources/com/example/entrepsim/pharmaGood.png");
            pharmaLVL.setText("Level "+pharma.getLevel());
            pills.setImage(good);
            cash.setText(String.valueOf(String.format("%.0f", money)));
            pharmaCost.setText("Pharmaceuticals (Cost: "+pharma.getCost()+"):");
            pharmaInc.setText("Income: "+ pharma.update(pharma.getLevel(),pharma.getIncome())+"/sec");
        }
        else{
            Image bad = new Image("file:src/main/resources/com/example/entrepsim/pharmaBad.png");
            pills.setImage(bad);
        }
    }
    public void pharmaRelease(MouseEvent event){
        Image def = new Image("file:src/main/resources/com/example/entrepsim/pharma.png");
        pills.setImage(def);
    }
    public void sportsTrigger(MouseEvent event){
        if(money >= sports.getCost()){
            money += sports.upgrade(sports.getCost());
            passive = passive + sports.getIncome();
            passiveIncome.setText(passive+" per second");
            sports.upgrade(sports.getLevel());
            sports.newPrice();
            Image good = new Image("file:src/main/resources/com/example/entrepsim/sportsGood.png");
            sportsLVL.setText("Level "+sports.getLevel());
            volley.setImage(good);
            cash.setText(String.valueOf(String.format("%.0f", money)));
            sportsCost.setText("Sports Team (Cost: "+sports.getCost()+"):");
            sportsInc.setText("Income: "+ sports.update(sports.getLevel(),sports.getIncome())+"/sec");
        }
        else{
            Image bad = new Image("file:src/main/resources/com/example/entrepsim/sportsBad.png");
            volley.setImage(bad);
        }
    }
    public void sportsRelease(MouseEvent event){
        Image def = new Image("file:src/main/resources/com/example/entrepsim/sports.png");
        volley.setImage(def);
    }
    public void stockTrigger(MouseEvent event){
        if(money >= stock.getCost()){
            money += stock.upgrade(stock.getCost());
            passive = passive + stock.getIncome();
            passiveIncome.setText(passive+" per second");
            stock.upgrade(stock.getLevel());
            stock.newPrice();
            Image good = new Image("file:src/main/resources/com/example/entrepsim/bankGood.png");
            bankLVL.setText("Level "+stock.getLevel());
            stonks.setImage(good);
            cash.setText(String.valueOf(String.format("%.0f", money)));
            bankCost.setText("Banks (Cost: "+stock.getCost()+"):");
            bankInc.setText("Income: "+ stock.update(stock.getLevel(),stock.getIncome())+"/sec");
        }
        else{
            Image bad = new Image("file:src/main/resources/com/example/entrepsim/bankBad.png");
            stonks.setImage(bad);
        }
    }
    public void stockRelease(MouseEvent event){
        Image def = new Image("file:src/main/resources/com/example/entrepsim/bank.png");
        stonks.setImage(def);
    }
    public void spaceTrigger(MouseEvent event){
        if(money >= space.getCost()){
            money += space.upgrade(space.getCost());
            passive = passive + space.getIncome();
            passiveIncome.setText(passive+" per second");
            space.upgrade(space.getLevel());
            space.newPrice();
            Image good = new Image("file:src/main/resources/com/example/entrepsim/resortGood.png");
            resortLVL.setText("Level "+space.getLevel());
            stickmin.setImage(good);
            cash.setText(String.valueOf(String.format("%.0f", money)));
            resortCost.setText("Space Resort (Cost: "+space.getCost()+"):");
            resortInc.setText("Income: "+ space.update(space.getLevel(),space.getIncome())+"/sec");
        }
        else{
            Image bad = new Image("file:src/main/resources/com/example/entrepsim/resortBad.png");
            stickmin.setImage(bad);
        }
    }
    public void spaceRelease(MouseEvent event){
        Image def = new Image("file:src/main/resources/com/example/entrepsim/resort.png");
        stickmin.setImage(def);
    }
    public void astroTrigger(MouseEvent event){
        if(money >= astro.getCost()){
            money += astro.upgrade(astro.getCost());
            passive = passive + astro.getIncome();
            passiveIncome.setText(passive+" per second");
            astro.upgrade(astro.getLevel());
            astro.newPrice();
            Image good = new Image("file:src/main/resources/com/example/entrepsim/astroGood.png");
            asteroidLVL.setText("Level "+astro.getLevel());
            astroImage.setImage(good);
            cash.setText(String.valueOf(String.format("%.0f", money)));
            asteroidCost.setText("Asteroid Mining (Cost: "+astro.getCost()+"):");
            asteroidInc.setText("Income: "+ astro.update(astro.getLevel(),astro.getIncome())+"/sec");
        }
        else{
            Image bad = new Image("file:src/main/resources/com/example/entrepsim/astroBad.png");
            astroImage.setImage(bad);
        }
    }
    public void astroRelease(MouseEvent event){
        Image def = new Image("file:src/main/resources/com/example/entrepsim/astro.png");
        astroImage.setImage(def);
    }
}
