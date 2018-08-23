void setup() {
  size(600, 600);
}
float y = 1;
int randomNumber = (int) random(width);
int score = 0;
void draw() {
    background(#9DFBFF);
    fill(#25A8E3);
    stroke(#1E59F7);
    ellipse(300, y, 25, 75); 
    y=y*1.2;
    if(y>700) {
      y = 0.2;
    }
    rect(mouseX, 500, 100, 150);
    checkCatch(mouseX);
    fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);
}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }