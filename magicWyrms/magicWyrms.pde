void setup () {
size(1000, 1000);
background(255,255,255);
stroke(0);
}
void draw () {
  float randColor1 = random(255);
  float randColor2 = random(255);
  float randColor3 = random(255);
  makeMagical();
  for(int i = 0;i<300;i++) {
      float randomSize = random(20);
    fill(i,randomSize,i);
    ellipse(getWormX(i),getWormY(i), randomSize,randomSize);
  }
}
float frequency = .005;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}