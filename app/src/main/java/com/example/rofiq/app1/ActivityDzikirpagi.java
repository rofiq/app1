package com.example.rofiq.app1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by rofiq on 10/18/2016.
 */
public class ActivityDzikirpagi extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private RadioButton radiobuton;
    private RadioGroup radiogrop;
    private Button btnjawb;

    @Override
    public void onCreate(Bundle sa) {
        super.onCreate(sa);
        setContentView(R.layout.activity_main_pilih);

        radiogrop = (RadioGroup) findViewById(R.id.radiogrup);
        btnjawb = (Button) findViewById(R.id.btnJawab);
        addListenerOnButtonJawab();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbardzikir);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layoutdzikirpg);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action 2", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view2);
        navigationView.setNavigationItemSelectedListener(this);
    }


    public void addListenerOnButtonJawab() {

        btnjawb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radiogrop.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radiobuton = (RadioButton) findViewById(selectedId);

                Toast.makeText(getBaseContext(),
                        "Anda Memilih Warna " + radiobuton.getText(),
                        Toast.LENGTH_SHORT).show();

            }

        });

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {
            Toast.makeText(getApplicationContext(), "Dzikir Pagi", Toast.LENGTH_LONG).show();
            Intent i = new Intent(ActivityDzikirpagi.this, MainActivity.class);
            startActivity(i);
            finish();
        } else if (id == R.id.nav_send) {
            Toast.makeText(getApplicationContext(), "Dzikir Pagi", Toast.LENGTH_LONG).show();
            Intent i = new Intent(ActivityDzikirpagi.this, MainActivity.class);
            startActivity(i);
            finish();
        } else if(id == R.id.txtdzikirpagi){
            Toast.makeText(getApplicationContext(), "Dzikir Pagi", Toast.LENGTH_LONG).show();
            Intent i = new Intent(ActivityDzikirpagi.this, ActivityDzikirpagi.class);
            startActivity(i);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
