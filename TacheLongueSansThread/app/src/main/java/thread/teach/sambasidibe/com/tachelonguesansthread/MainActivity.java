package thread.teach.sambasidibe.com.tachelonguesansthread;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="TacheLongueSansThread";
    private Button button;
    private EditText editText;
    private ProgressBar  progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.temps);
        progressBar=findViewById(R.id.progB);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                int nbMillis=1000*Integer.parseInt(""+editText.getText());
                Log.i(TAG,"Debut click");
                Log.i(TAG,"Debut attente "+nbMillis+" milliseconde");


                Log.i(TAG,"fin attente "+nbMillis+" milliseconde");
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
    }
}
