package com.hermesjunior.anydb;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.hermesjunior.anydb.Data.Item.Item;
import com.hermesjunior.anydb.Data.Item.ItemRepository;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnInsert).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ItemRepository itemRepository = new ItemRepository(getApplication());
                Item item = new Item("123");
                itemRepository.insert(item);
            }
        });
    }
}
