package vsga.meet7.tugasmeet7app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.zip.Inflater;

import vsga.meet7.tugasmeet7app.R;
import vsga.meet7.tugasmeet7app.activity.CalculatorActivity;
import vsga.meet7.tugasmeet7app.activity.InputNameActivity;
import vsga.meet7.tugasmeet7app.activity.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button itemName = findViewById(R.id.itemNama);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.itemNama:
                Intent intentName = new Intent(this, InputNameActivity.class);
                this.startActivity(intentName);
                break;
            case R.id.itemListView:
                Intent intentList = new Intent(this, ListViewActivity.class);
                this.startActivity(intentList);
                break;
            case R.id.itemKalkulator:
                Intent intentCalculator = new Intent(this, CalculatorActivity.class);
                this.startActivity(intentCalculator);

                break;
            case R.id.itemKeluar:
                finish();
                default: return super.onOptionsItemSelected(item);
        }
        return true;
    }
}