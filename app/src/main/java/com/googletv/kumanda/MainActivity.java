package com.googletv.kumanda;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    int ses = 24;
    int kanal = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(50, 80, 50, 50);
        root.setGravity(Gravity.CENTER_HORIZONTAL);

        TextView baslik = new TextView(this);
        baslik.setTextSize(22);
        baslik.setGravity(Gravity.CENTER);
        baslik.setText("GTV Kumanda\n\nSes: " + ses + "  Kanal: " + kanal);
        root.addView(baslik);

        Button sesArt = new Button(this);
        sesArt.setText("Ses +");
        sesArt.setOnClickListener(v -> {
            if (ses < 100) ses++;
            baslik.setText("GTV Kumanda\n\nSes: " + ses + "  Kanal: " + kanal);
        });
        root.addView(sesArt);

        Button sesAz = new Button(this);
        sesAz.setText("Ses -");
        sesAz.setOnClickListener(v -> {
            if (ses > 0) ses--;
            baslik.setText("GTV Kumanda\n\nSes: " + ses + "  Kanal: " + kanal);
        });
        root.addView(sesAz);

        Button kanalArt = new Button(this);
        kanalArt.setText("Kanal +");
        kanalArt.setOnClickListener(v -> {
            kanal++;
            baslik.setText("GTV Kumanda\n\nSes: " + ses + "  Kanal: " + kanal);
        });
        root.addView(kanalArt);

        Button kanalAz = new Button(this);
        kanalAz.setText("Kanal -");
        kanalAz.setOnClickListener(v -> {
            if (kanal > 1) kanal--;
            baslik.setText("GTV Kumanda\n\nSes: " + ses + "  Kanal: " + kanal);
        });
        root.addView(kanalAz);

        setContentView(root);
    }
}
