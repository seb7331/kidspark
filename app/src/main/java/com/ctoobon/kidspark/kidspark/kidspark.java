package com.ctoobon.kidspark.kidspark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class kidspark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String applicationName = getResources().getString(R.string.app_name);

        String textseb = "allez j'essaye";
        // Au lieu d'afficher "My Application" on va afficher "My way !"

        applicationName = applicationName.replace("park", "way !");

        TextView text = new TextView(this);
        text.setText("Bonjour, vous me devez 1 000 000€.");

        TextView view = new TextView(this);
        view.setText(applicationName + textseb);

        setContentView(view);

        //setContentView(text);

        //setContentView(R.layout.activity_kidspark);
    }
}


