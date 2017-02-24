package athlas.eth.athlas;

import android.widget.TextView;

/**
 * Created by lucav on 24.02.2017.
 */

public class Utility {
    String name;

    public Utility(String name){
        this.name = name;
    }
    void setTvText(String text, TextView tv){
        tv.setText(name + " " + text);
    }
}
