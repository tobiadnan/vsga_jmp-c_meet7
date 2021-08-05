package vsga.meet7.tugasmeet7app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import vsga.meet7.tugasmeet7app.R;

public class InputNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_name);

        Button btnNama = findViewById(R.id.btnNama);
        EditText etNama = findViewById(R.id.etNama);

        btnNama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InputNameActivity
                        .this,
                        "Assalamualaikum, Selamat Datang "+etNama.getText(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}