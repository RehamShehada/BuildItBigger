package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view)
    {
        EndpointsAsyncTask endpointsAsyncTask= new EndpointsAsyncTask();
        endpointsAsyncTask.execute(this);
    }


}
