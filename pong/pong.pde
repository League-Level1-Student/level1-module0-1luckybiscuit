import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;

void setup() {
  backgroundImage = loadImage("yeet.jpg");
  minim = new Minim (this);
  sound = minim.loadSample("wilhelm.wav", 128);
  size(300, 300);
}
int x = -1;
int veloX = 3;
int y = 150;
int veloY = 3;
int score = 0;
Boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
  if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
    return true;
  else 
  return false;
}
void draw() {
  image(backgroundImage, 0, 0);
  image(backgroundImage, 0, 0, width, height);
  background(0, 0, 0);
  fill(255, 0, 0);
  stroke(255, 255, 255);
  ellipse(x, y, 25, 25);
  //vertical walls
  if (y<0) {
      veloY = 3;
    } else if (y>height) {
      veloY = -3;
    }
    y += veloY;
  //side walls
    if (x<0) {
      veloX = 3;
    } else if (x>width) {
      veloX = -3;
    }
    x += veloX;
    if(intersects(x,y,mouseX,290,50) == true) {
      score++;
      veloY = -3;
    }
  rect(mouseX, 290, 50, 10);
}