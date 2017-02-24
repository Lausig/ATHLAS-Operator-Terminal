package athlas.eth.athlas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import athlas.eth.athlas.Utility;

public class MainActivity extends AppCompatActivity {
    Button beer_tv;
    TextView hello_tv;
    Utility utility;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        utility = new Utility("test");

        beer_tv = (Button) findViewById(R.id.beer_btn);
        hello_tv = (TextView) findViewById(R.id.hello_tv);
        beer_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                utility.setTvText("More Beer", hello_tv);
                startActivity(new Intent(MainActivity.this, Second_Page.class));
            }
        });

        double d = 0.2;
        int i = (int) d;
        hello_tv.setText(hello_tv.getText() + " remaining: " + Integer.toString(i));
    }


}
