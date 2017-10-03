package piftik.github.com.homeworkwithgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        comment in master branch
        someMethod();
    }
    private void someMethod(){
//        this method not working
    }
}
