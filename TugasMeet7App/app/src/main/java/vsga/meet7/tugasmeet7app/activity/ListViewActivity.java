package vsga.meet7.tugasmeet7app.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import vsga.meet7.tugasmeet7app.R;
import vsga.meet7.tugasmeet7app.data.DataList;

public class ListViewActivity extends AppCompatActivity implements DataList {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView listView = findViewById(R.id.list);
        // masukan semua data ke lv
        Collections.addAll(data, namaNegara);

        final ArrayAdapter adapter = new ArrayAdapter(
                this,R.layout.support_simple_spinner_dropdown_item, namaNegara);

        listView.setAdapter(adapter);

        // toast
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewActivity.this, namaNegara[position]+" Clicked", Toast.LENGTH_SHORT).show();
                }
        });
    }
    
}