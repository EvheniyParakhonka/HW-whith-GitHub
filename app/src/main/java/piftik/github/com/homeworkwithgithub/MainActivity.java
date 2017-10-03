package piftik.github.com.homeworkwithgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "some text");
        String rebase;
        rebase = "I'm use rebase";
        TextView textView = (TextView) findViewById(R.id.texView);
        textView.setText(rebase);
    }
}
