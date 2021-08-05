package vsga.meet7.tugasmeet7app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import vsga.meet7.tugasmeet7app.R;

public class CalculatorActivity extends AppCompatActivity  {

    Button btTambah, btKurang, btKali, btBagi, btClear;
    EditText et1, et2;
    TextView tHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        btTambah = (Button)findViewById(R.id.btnPlus);
        btKurang = (Button)findViewById(R.id.btnMinus);
        btKali = (Button)findViewById(R.id.btnKali);
        btBagi = (Button)findViewById(R.id.btnBagi);
        btClear = (Button)findViewById(R.id.btnClear);
        et1 = (EditText) findViewById(R.id.etPembilang);
        et2 = (EditText) findViewById(R.id.etPenyebut);
        tHasil = (TextView) findViewById(R.id.etHasil);

         TextWatcher validation = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String angka1 = et1.getText().toString().trim();
                String angka2= et2.getText().toString().trim();

                btTambah.setEnabled(!angka1.isEmpty() && !angka2.isEmpty());
                btKurang.setEnabled(!angka1.isEmpty() && !angka2.isEmpty());
                btKali.setEnabled(!angka1.isEmpty() && !angka2.isEmpty());
                btBagi.setEnabled(!angka1.isEmpty() && !angka2.isEmpty());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        };
        et1.addTextChangedListener(validation);
        et2.addTextChangedListener(validation);

        btTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double angka1 = Double.parseDouble(et1.getText().toString());
                double angka2 = Double.parseDouble(et2.getText().toString());
                double result = angka1 + angka2;
                tHasil.setText(Double.toString(result));
            }
        });
        btKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double angka1 = Double.parseDouble(et1.getText().toString());
                double angka2 = Double.parseDouble(et2.getText().toString());
                double result = angka1 - angka2;
                tHasil.setText(Double.toString(result));
            }
        });
        btKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double angka1 = Double.parseDouble(et1.getText().toString());
                double angka2 = Double.parseDouble(et2.getText().toString());
                double result = angka1 * angka2;
                tHasil.setText(Double.toString(result));
            }
        });
        btBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double angka1 = Double.parseDouble(et1.getText().toString());
                double angka2 = Double.parseDouble(et2.getText().toString());
                double result = angka1 / angka2;
                if (angka2 == 0.0) {
                    tHasil.setText("Error");
                    Toast.makeText(CalculatorActivity.this, "Tidak Bisa dibagi dengan 0", Toast.LENGTH_SHORT).show();
                } else tHasil.setText(Double.toString(result));
            }
        });
        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(null);
                et2.setText(null);
                tHasil.setText("0");
            }
        });
    }
}