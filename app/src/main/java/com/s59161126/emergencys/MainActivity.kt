package com.s59161126.emergencys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.s59161126.emergencys.databinding.ActivityMainBinding
//import android.support.v4.app.FragmentActivity
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.widget.TextView;

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
