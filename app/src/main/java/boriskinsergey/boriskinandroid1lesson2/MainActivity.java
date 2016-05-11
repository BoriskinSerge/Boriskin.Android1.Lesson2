package boriskinsergey.boriskinandroid1lesson2;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Resources res;
    TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res=getResources();
        txt2=(TextView) findViewById(R.id.txt2);
        txt2.setText(res.getString(R.string.name_f)+" "+res.getString(R.string.name_n)+" "+res.getString(R.string.name_s));

    }
}
