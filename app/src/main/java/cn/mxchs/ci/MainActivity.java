package cn.mxchs.ci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/**
    public void displayTeamA(int score){
        android.widget.TextView scoreView = (android.widget.TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
*/
}
