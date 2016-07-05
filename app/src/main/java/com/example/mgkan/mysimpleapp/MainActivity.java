package com.example.mgkan.mysimpleapp;

;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  TextView headerText;
  Button buttonOne,buttonTwo,buttonThree;
  int lastClick = 0;
  View backgroundAll;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    headerText = (TextView) findViewById(R.id.textView);
    buttonOne=(Button) findViewById(R.id.button1);
    buttonTwo=(Button) findViewById(R.id.button2);
    buttonThree=(Button) findViewById(R.id.button3);
    backgroundAll= (View) findViewById(R.id.layout);

    buttonOne.setOnClickListener(new View.OnClickListener(){
      @Override
        public void onClick(View view){

        headerText.setTextColor(getResources().getColor(R.color.buttonBlue));
        getBackground();
        lastClick = 1;

      }
    });
    buttonTwo.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view){
        headerText.setTextColor(getResources().getColor(R.color.buttonGreen));
        getBackground();
        lastClick = 2;

      }
    });
    buttonThree.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view){
        headerText.setTextColor(getResources().getColor(R.color.buttonRed));
        getBackground();
        lastClick = 3;

      }
    });
    }
  void getBackground() {
    if (lastClick == 1) {
      backgroundAll.setBackgroundColor(getResources().getColor(R.color.buttonBlue));
    } else if (lastClick == 2) {
      backgroundAll.setBackgroundColor(getResources().getColor(R.color.buttonGreen));
    } else if (lastClick == 3) {
      backgroundAll.setBackgroundColor(getResources().getColor(R.color.buttonRed));
    }
  }
}
