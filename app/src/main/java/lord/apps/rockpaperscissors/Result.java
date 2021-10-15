package lord.apps.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView result, champion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = findViewById(R.id.Res);
        champion = findViewById(R.id.Champ);

        Intent intent = getIntent();

        String zero = "0";
        String one = "1";
        String two = "2";

        String opponent = getIntent().getStringExtra("randomnumber");
        String fate = getIntent().getStringExtra("winnernumber");

        if(zero.equals(opponent))
        {
            String rockst = ("Rock");
            result.setText(rockst);
        }
        if(one.equals(opponent))
        {
            String paperst = ("Paper");
            result.setText(paperst);
        }
        if(two.equals(opponent))
        {
            String Scissorsst = ("Scissors");
            result.setText(Scissorsst);
        }

        if(zero.equals(fate))
        {
            String winst = ("You win!");
            champion.setText(winst);
        }
        if(one.equals(fate))
        {
            String losest = ("You lose!");
            champion.setText(losest);
        }
        if(two.equals(fate))
        {
            String Drawst = ("Draw");
            champion.setText(Drawst);
        }
    }

    public void AgainbtnClick(View view){
        Intent intent = new Intent(this, Play.class);
        startActivity(intent);
    }
}

