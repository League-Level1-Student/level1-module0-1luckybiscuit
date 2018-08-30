void setup() {
  size(600, 600);
}
float y = 1;
int score = 0;
int randomNumber = (int) random(width);
void draw() {
    background(#9DFBFF);
    fill(#25A8E3);
    stroke(#1E59F7);
    if(y>700) {
      randomNumber = (int) random(width);
      y = 0.2;
    }
    ellipse(randomNumber, y, 25, 75); 
    fill(0, 0, 0);
    stroke(#767676);
    rect(mouseX, 500, 100, 150);
textSize(16);
text("Score: " + score, 20, 20);
    if(score > 50) {
      fill(0,0,255);
      textSize(100);
      text("YOU WIN!" , 70, 200);
      textSize(20);
      text("Ultimate Wet Catcher!", 200, 270);
      y=y*3;
    }else{
      if(y>500) {
      checkCatch(randomNumber);
    }
          y=y*1.2;
    }
}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }