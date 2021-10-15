package lord.apps.rockpaperscissors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Play extends AppCompatActivity {

    //winner is 0 when the player wins
    public int winner;
    int randomresult = (int) (Math.random()*3);
    public Button DonebtnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        DonebtnClick = (Button)findViewById(R.id.donebutton);

        DonebtnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //winner es integer
                String ganador = Integer.toString(winner);
                String aleatorio = Integer.toString(randomresult);
                Intent intent = new Intent(getApplicationContext(), Result.class);
                intent.putExtra("winnernumber", ganador);
                intent.putExtra("randomnumber", aleatorio);
                startActivity(intent);
            }
        });
    }

    public void Compare(View view) {

        //0 equals rock, 1 is for paper and 2 for scissors


        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rock:
                if (randomresult == 0) {
                    winner = 2;
            }
                if (randomresult == 1) {
                    winner = 1;
            }
                if (randomresult == 2) {
                    winner = 0;
            }
                break;

            case R.id.paper:
                if (randomresult == 0) {
                    winner = 0;
            }
                if (randomresult == 1) {
                    winner = 2;
            }
                if (randomresult == 2) {
                    winner = 1;
            }
            break;

            case R.id.scissors:
                if (randomresult == 0) {
                    winner = 1;
            }
                if (randomresult == 1) {
                    winner = 0;
            }
                if (randomresult == 2) {
                    winner = 2;
            }
            break;
        }

        if (randomresult == 0) {
            String aleatorio = "Rock";
        }
        else if (randomresult == 1) {
            String aleatorio = "Paper";
        }
        else {
            String aleatorio = "Scissors";
        }

    }
}