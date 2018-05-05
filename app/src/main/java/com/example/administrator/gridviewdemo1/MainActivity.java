package com.example.administrator.gridviewdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private GridView mGridView;
    private GridViewAdapter mGridViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        mGridView = (GridView) findViewById(R.id.gridView);
        mGridViewAdapter = new GridViewAdapter(this, 0, ImagesPath.IMAGES_PATH, mGridView);
        mGridView.setAdapter(mGridViewAdapter);
    }
}
