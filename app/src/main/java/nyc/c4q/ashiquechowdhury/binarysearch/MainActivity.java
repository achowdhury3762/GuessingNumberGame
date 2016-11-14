package nyc.c4q.ashiquechowdhury.binarysearch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainView {
    TextView numberGuess;
    MainController controller;
    EditText numberEnteredEditText;
    int numberToGuess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberEnteredEditText = (EditText) findViewById(R.id.user_number);
        numberGuess = (TextView) findViewById(R.id.textView_displayGuess);
        controller = new MainController(this);
    }

    @Override
    public void displayGuess(int number){
        if(numberToGuess == controller.guess){
            Toast.makeText(this, "NUMBER GUESSED!", Toast.LENGTH_LONG).show();
        }
        numberGuess.setText(String.valueOf(number));
    }


    public void onClickHigher(View view){
        controller.calculateGuess(false);
    }

    public void onClickSubmit(View view){
        numberToGuess = Integer.parseInt(numberEnteredEditText.getText().toString());
        displayGuess(controller.guess);
    }

    public void onClickLower(View view){
        controller.calculateGuess(true);
    }

}
