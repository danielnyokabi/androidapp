package com.example.karanu.restaurantapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button go_to_menu,go_to_order_list,findstore,info;
    Button custinfo;
    String user_name;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent myintent=getIntent();
        Bundle extras=myintent.getExtras();
        user_name=extras.getString("cust_name");
        Toast.makeText(MainActivity.this,"welcome" +user_name, Toast.LENGTH_LONG).show();
        //initialise form widget
        go_to_menu=(Button)findViewById(R.id.Go_To_Menu);
        go_to_order_list=(Button)findViewById(R.id.Go_To_Order_List);
        findstore=(Button)findViewById(R.id.FindStore);
        info=(Button)findViewById(R.id.Info);
        custinfo=(Button)findViewById(R.id.CustInfo);
        ModelClass.createList();
        info.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                //starting new activity on button click
                Intent i=new
                        Intent(MainActivity.this,InfoScreen.class);
                MainActivity.this.startActivity(i);
            }
                                });
        go_to_menu.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                //starting activity on button click
                Intent i =new Intent(MainActivity.this,MenuScreen.class);
                MainActivity.this.startActivity(i);
            }
        });
        findstore.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                //starting new activity on button click
                Intent i=new
                        Intent(MainActivity.this,FindStore.class);
                MainActivity.this.startActivity(i);

            }
        });
        go_to_order_list.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                //starting new activity on button click
                Intent i =new
                        Intent(MainActivity.this,OrderList.class);
                MainActivity.this.startActivity(i);
            }
        });
        custinfo.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                //starting new activity on butoon click
                Intent i =new
                        Intent(MainActivity.this,CustInfo.class);
                MainActivity.this.startActivity(i);
            }
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
