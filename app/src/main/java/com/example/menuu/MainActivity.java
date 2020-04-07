package com.example.menuu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.btn);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "you clicked fab", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1 :
                Toast.makeText(this,"item1 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2 :
                Toast.makeText(this,"item2 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3 :
                Toast.makeText(this,"item3 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem1 :
                Toast.makeText(this,"subitem1 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem2 :
                Toast.makeText(this,"subitem2 selected",Toast.LENGTH_SHORT).show();
                return true;
default:
    return super.onOptionsItemSelected(item);



        }
    }
}
