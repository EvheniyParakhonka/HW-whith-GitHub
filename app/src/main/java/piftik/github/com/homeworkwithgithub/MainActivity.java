package piftik.github.com.homeworkwithgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        comment in master branch
//        comment in branch 1
        someMethod();
    }
    private void someMethod(){

    }
}
