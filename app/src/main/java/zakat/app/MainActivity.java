package zakat.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText feild1,feild2,feild3,feild4;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        feild1= (EditText)findViewById(R.id.income);
        feild2 = (EditText)findViewById(R.id.expenses);
        feild3 = (EditText)findViewById(R.id.wealth);
        feild4 = (EditText)findViewById(R.id.total);
        btn = (Button) findViewById(R.id.button);






    }

    public void calc(View view) {
        try {
            String incomeVal = feild1.getText().toString();
            String expensesVal = feild2.getText().toString();
            int sum;
            sum = Integer.parseInt(incomeVal) - Integer.parseInt(expensesVal);
            feild3.setText(sum +" Rs.");

            double zakat = (sum * 2.5) / 100;
            feild4.setText(String.valueOf(zakat)+ " Rs.");
        }
        catch (Exception e){

        }

    }

}