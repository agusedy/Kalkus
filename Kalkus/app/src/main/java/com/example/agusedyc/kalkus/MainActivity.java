package com.example.agusedyc.kalkus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void tambah(View view){
        // Get v1
        EditText v1Field = (EditText) findViewById(R.id.v1);
        Editable v1Editable = v1Field.getText();
//        int v1 = v1Editable.toString();
        int v1 = Integer.parseInt(v1Editable.toString());

        // Get v2
        EditText v2Field = (EditText) findViewById(R.id.v2);
        Editable v2Editable = v2Field.getText();
        int v2 = Integer.parseInt(v2Editable.toString());

       int tambah = v1 + v2;
        displayInfo(tambah);

    }

    public void kurang(View view){
        // Get v1
        EditText v1Field = (EditText) findViewById(R.id.v1);
        Editable v1Editable = v1Field.getText();
//        int v1 = v1Editable.toString();
        int v1 = Integer.parseInt(v1Editable.toString());

        // Get v2
        EditText v2Field = (EditText) findViewById(R.id.v2);
        Editable v2Editable = v2Field.getText();
        int v2 = Integer.parseInt(v2Editable.toString());

        int kurang = v1 - v2;
        displayInfo(kurang);

    }

    public void kali(View view){
        // Get v1
        EditText v1Field = (EditText) findViewById(R.id.v1);
        Editable v1Editable = v1Field.getText();
//        int v1 = v1Editable.toString();
        int v1 = Integer.parseInt(v1Editable.toString());

        // Get v2
        EditText v2Field = (EditText) findViewById(R.id.v2);
        Editable v2Editable = v2Field.getText();
        int v2 = Integer.parseInt(v2Editable.toString());

        int kali = v1 * v2;
        displayInfo(kali);

    }

    public void bagi(View view){
        // Get v1
        EditText v1Field = (EditText) findViewById(R.id.v1);
        Editable v1Editable = v1Field.getText();
//        int v1 = v1Editable.toString();
        int v1 = Integer.parseInt(v1Editable.toString());

        // Get v2
        EditText v2Field = (EditText) findViewById(R.id.v2);
        Editable v2Editable = v2Field.getText();
        int v2 = Integer.parseInt(v2Editable.toString());

        int bagi = v1 / v2;
        displayInfo(bagi);

    }


    /**
     * This method displays summary on the screen.
     */
    private void displayInfo(Integer info) {
        TextView allTextView = (TextView) findViewById(
                R.id.hasil);
        allTextView.setText("" + info);
    }
}
