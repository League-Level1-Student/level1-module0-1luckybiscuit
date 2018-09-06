import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;


void setup() {
  backgroundImage = loadImage("yeetus.jpg");
  minim = new Minim (this);
  sound = minim.loadSample("mineDiamonds.wav", 128);
  size(400, 400);
}
float mult = 1.05;
int x = -1;
float veloX = 3;
int y = 100;
float veloY = 3;
float rand = 3;
int score = 0;

Boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
  if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
    return true;
  else 
  return false;
}
void draw() {
  score++;
  image(backgroundImage, 0, 0);
  image(backgroundImage, 0, 0, width, height);
  fill(#D10F12);
  textSize(30);
  stroke(255,255,255);
  text("Don't mess up or you'll be\nput on the naughty list.\nHow long can you survive?", 10, 40);
  textSize(100);
  text(score,110,350);
  fill(#D10F12);
  ellipse(x, y, 25, 25);
  strokeWeight(3);
  //vertical walls
  if (y<0) {
    veloY = rand;
    rand *= mult;
  } else if (y>height) {
    sound.trigger();
    println("You messed up! You're score was " + score);
    rand = 3;
    score = 0;
    veloY = -rand;
  }
  y += veloY;
  //side walls
  if (x<0) {
    veloX = rand;
    rand *= mult;
  } else if (x>width) {
    veloX = -rand;
    rand *= mult;
  }
  x += veloX;
  //scream
  if(intersects(x,y,mouseX,380,70).equals(true)) {
    veloY = random(-2, -5);
    rand *= mult;
  }
  rect(mouseX, 380, 70, 20);
}