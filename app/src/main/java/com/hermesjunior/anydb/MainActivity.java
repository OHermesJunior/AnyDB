package com.hermesjunior.anydb;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import com.hermesjunior.anydb.Data.Item.Item;
import com.hermesjunior.anydb.Data.Item.ItemRepository;
import com.hermesjunior.anydb.Data.Library.Library;
import com.hermesjunior.anydb.Data.Library.LibraryRepository;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ItemRepository itemRepository = new ItemRepository(getApplication());
        final LibraryRepository libRepository = new LibraryRepository(getApplication());
        final TextView txt = findViewById(R.id.textView);
        final EditText edt = findViewById(R.id.editText);

        findViewById(R.id.btnInsert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Library lib = new Library(edt.getText().toString(), "icon", "Lib desc", null, false);
                libRepository.insert(lib);
                Item item = new Item(lib.getUuid());
                itemRepository.insert(item);
                Log.d("ROOM", "I THINK IT WENT FINE");
            }
        });

        libRepository.getAll().observe(this, new Observer<List<Library>>() {
            @Override
            public void onChanged(List<Library> libraries) {
                txt.setText(libraries.get(libraries.size() - 1).getUuid());
            }
        });
    }
}
