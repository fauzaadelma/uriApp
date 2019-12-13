package com.example.uriapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Habbiburahman El Shirazy", "Ayat-Ayat Cinta"));
        words.add(new Word("Andrea Hirata", "Laskar Pelangi"));
        words.add(new Word("Dewi Lestari", "Perahu Kertas"));
        words.add(new Word("Tere Liye", "Hafalan Shalat Delisa"));
        words.add(new Word("Pidi Baiq", "Dilan"));
        words.add(new Word("Raditya Dika", "Marmut Merah Jambu"));
        words.add(new Word("Ayu Utami", "Saman"));
        words.add(new Word("Eka Kurniawan", "Cantik itu Luka"));
        words.add(new Word("Valerie Patkar", "Claires"));
        words.add(new Word("Najwa Shihab", "Catatan Najwa"));
        words.add(new Word("Bernard Batubara", "Radio Galau FM"));
        words.add(new Word("Asma Nadia", "Bidadari Untuk Dewa"));
        words.add(new Word("Erisca Febriani", "Dear Nathan"));
        words.add(new Word("Wulan Fadila", "A"));
        words.add(new Word("Hilman Hariwijaya", "Lupus"));
        //This list item layout contains a single {@link TextView}, which the adapter will set display a single word.
        WordAdapter adapter = new WordAdapter(this, words, R.color.list_activity);

        //find the {@link ListView} object in the view hierarchy of the {@link Activity},
        //there should be a {!link ListView} with the view ID called list, which is declared in
        //word_list.xml file.
        ListView listView = (ListView) findViewById(R.id.list);

        // make the {@link_ListView} object in the view herarchy of the
        // There should be a {@link ListView} with the view ID called
        // word_list.xml
        listView.setAdapter(adapter);
    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
