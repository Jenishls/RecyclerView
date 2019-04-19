package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import adapter.ContactsAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById ( R.id.recycler );
        List<Contacts> contactsList = new ArrayList<> (  );
        contactsList.add ( new Contacts ( "Saugat Malla","90800011264" , R.drawable.saugat ) );
        contactsList.add ( new Contacts ( "Rajesh Hamal","98320011264", R.drawable.rajesh ) );
        contactsList.add ( new Contacts ( "Dahayang Rai","9800716544", R.drawable.dahayang ) );
        contactsList.add ( new Contacts ( "Bhuwan KC","9086532833", R.drawable.bhuwan ) );

        ContactsAdapter contactsAdapter = new ContactsAdapter ( this,contactsList );
        recyclerView.setAdapter ( contactsAdapter );
        recyclerView.setLayoutManager ( new LinearLayoutManager ( this, LinearLayoutManager.VERTICAL, false ) );

    }
}
