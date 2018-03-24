package com.xxmassdeveloper.mpchartexample.notimportant;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.xxmassdeveloper.mpchartexample.R;

public class viewDataBase extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_database);
        final TextView result = (TextView) findViewById(R.id.dbValue);


        result.setMovementMethod(new ScrollingMovementMethod());
        DBHelper dbHelper = new DBHelper(getApplicationContext(), "OceanIT.db", null, 1);
        result.setText(dbHelper.getResult());

    }
}