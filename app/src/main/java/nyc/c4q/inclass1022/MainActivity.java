package nyc.c4q.inclass1022;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView01;
    EditText eText;
    Button button1;

    //changes to see git working

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView01=(TextView) findViewById(R.id.text1);
        eText=(EditText) findViewById(R.id.et1);
        button1=(Button) findViewById(R.id.button1);
button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(),eText.getText().toString(),Toast.LENGTH_LONG).show();
    }
});

    }
}
