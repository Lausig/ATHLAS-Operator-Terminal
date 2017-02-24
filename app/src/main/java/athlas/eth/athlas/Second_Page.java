package athlas.eth.athlas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Second_Page extends AppCompatActivity {

    Button returntofirstpg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__page);

        returntofirstpg = (Button) findViewById(R.id.wine_btn);
        returntofirstpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Second_page", "finishing");
                finish();
            }
        });
    }
}
