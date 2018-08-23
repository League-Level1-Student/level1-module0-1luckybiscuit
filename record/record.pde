import ddf.minim.*;  //at the very top of your sketch
Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable
PImage pictureOfRecord;     //as member variable
void setup() {
  size(600,600);     //in setup method  
  pictureOfRecord= loadImage("record.jpg");     //in setup method 
  pictureOfRecord.resize(height,width);     //in setup method
  minim = new Minim(this);  //in the setup method
song = minim.loadFile("allStar.mp3", 512);//in the setup method
}
int angle = 0;
int xPosition = 0;
int yPosition = 0;
void draw() {
  if(mousePressed) {
      angle+=10;
      song.play();
  } else {
      song.pause();
  }
  rotateImage(pictureOfRecord, angle);
  image(pictureOfRecord, xPosition, yPosition);     //in draw method
}
void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}