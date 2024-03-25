package fi.arcada.codechallenge;

import static fi.arcada.codechallenge.Statistics.calcMean;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView outputText;

    TextView outputMean;
    EditText inputText;

    double [] values = {3.5, 4.4, 9.0, 1.2, 6.5, 12.0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputText = findViewById(R.id.outText);
        inputText = findViewById(R.id.inputText);

        outputMean = findViewById(R.id.outputMean);
        outputText.setText("Min app funkar!");
    }

    public void buttonHandler(View view){
        outputText.setText(inputText.getText().toString());
    }

    public void calculate(View view){
        outputMean.setText(String.format("Medeltalet är: %.2f", calcMean(values)));
    }

}
