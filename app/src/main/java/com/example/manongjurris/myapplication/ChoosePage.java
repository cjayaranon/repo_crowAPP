package com.example.manongjurris.myapplication;

//import android.annotation.TargetApi;
import android.app.Activity;
//import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
//import android.net.ConnectivityManager;
//import android.net.NetworkInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;
import android.widget.Button;

//import android.location.Location;
//import android.location.LocationListener;
//import android.location.LocationManager;
//import android.location.LocationProvider;
//import android.location.Geocoder;
//import android.location.Location;
//import android.support.annotation.NonNull;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.Toast;
import android.Manifest;

//import java.net.HttpURLConnection;
//import java.net.URL;
import java.security.SecureRandom;
//import java.util.jar.Manifest;
//import com.android.*;
//import com.android.volley.RequestQueue;
//import com.android.volley.toolbox.Volley;
//import com.google.android.gms.common.ConnectionResult;
//import com.google.android.gms.common.api.GoogleApiClient;
//import com.google.android.gms.location.LocationServices;
//import org.apache.http.client.methods.HttpPost;

/**
 * Created by Manong Jurris on 11/19/2016.
 */
public class ChoosePage extends Activity {
//    implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
//    TelephonyManager tmgr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
//    ConnectivityManager cmgr = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
//    NetworkInfo nimfo = cmgr.getActiveNetworkInfo();
    SmsManager smgr = SmsManager.getDefault();
//    RequestQueue q = Volley.newRequestQueue(this);
//    URL url = new URL("29290528")
//    HttpURLConnection hrl = (HttpURLConnection)url.openConnection();

    int msg_id;
    String msg_type = "POST";
//    String num = tmgr.getLine1Number();
    int scode = 2920528;
    String msg_intro = "FIRE EMERGENCY please send help at:";
    long minDistance = 10;
    long mintime = 5000;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        final Button fire = (Button) findViewById(R.id.f);
        final Button rob = (Button) findViewById(R.id.r);
        final Button acc = (Button) findViewById(R.id.ac);
        final Button amb = (Button) findViewById(R.id.ab);

        fire.setOnClickListener(new View.OnClickListener() {
//            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                try{
                    msg_id = generate_id();
                    if(ContextCompat.checkSelfPermission(ChoosePage.this, Manifest.permission.READ_CONTACTS)!= PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(getBaseContext(), "Message Sent", Toast.LENGTH_LONG);
                        smgr.sendTextMessage(String.valueOf(scode), null, msg_intro, null, null);
                        finish();
                    }
                    else{
                        Toast.makeText(getBaseContext(), "Message Failed", Toast.LENGTH_SHORT);
                        Intent i = new Intent(getBaseContext(), ChoosePage.class);
                        startActivity(i);
                        finish();
                    }

                }
                catch (Exception ex){
                    Toast.makeText(getApplicationContext(),
                            ex.getMessage().toString(),
                            Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }
            }
        });

        rob.setOnClickListener(new View.OnClickListener() {
            //            @TargetApi(Build.VERSION_CODES.LOLLIPOP) 
            @Override
            public void onClick(View v) {
                try{
                    msg_id = generate_id();
                    if(ContextCompat.checkSelfPermission(ChoosePage.this, Manifest.permission.READ_CONTACTS)!= PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(getBaseContext(), "Message Sent", Toast.LENGTH_LONG);
                        smgr.sendTextMessage(String.valueOf(scode), null, msg_intro, null, null);
                        finish();
                    }
                    else{
                        Toast.makeText(getBaseContext(), "Message Failed", Toast.LENGTH_SHORT);
                        Intent i = new Intent(getBaseContext(), ChoosePage.class);
                        startActivity(i);
                        finish();
                    }

                }
                catch (Exception ex){
                    Toast.makeText(getApplicationContext(),
                            ex.getMessage().toString(),
                            Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }
            }
        });

        acc.setOnClickListener(new View.OnClickListener() {
            //            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                try{
                    msg_id = generate_id();
                    if(ContextCompat.checkSelfPermission(ChoosePage.this, Manifest.permission.READ_CONTACTS)!= PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(getBaseContext(), "Message Sent", Toast.LENGTH_LONG);
                        smgr.sendTextMessage(String.valueOf(scode), null, msg_intro, null, null);
                        finish();
                    }
                    else{
                        Toast.makeText(getBaseContext(), "Message Failed", Toast.LENGTH_SHORT);
                        Intent i = new Intent(getBaseContext(), ChoosePage.class);
                        startActivity(i);
                        finish();
                    }

                }
                catch (Exception ex){
                    Toast.makeText(getApplicationContext(),
                            ex.getMessage().toString(),
                            Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }
            }
        });

        amb.setOnClickListener(new View.OnClickListener() {
            //            @TargetApi(Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                try{
                    msg_id = generate_id();
                    if(ContextCompat.checkSelfPermission(ChoosePage.this, Manifest.permission.READ_CONTACTS)!= PackageManager.PERMISSION_GRANTED){
                        Toast.makeText(getBaseContext(), "Message Sent", Toast.LENGTH_LONG);
                        smgr.sendTextMessage(String.valueOf(scode), null, msg_intro, null, null);
                        finish();
                    }
                    else{
                        Toast.makeText(getBaseContext(), "Message Failed", Toast.LENGTH_SHORT);
                        Intent i = new Intent(getBaseContext(), ChoosePage.class);
                        startActivity(i);
                        finish();
                    }

                }
                catch (Exception ex){
                    Toast.makeText(getApplicationContext(),
                            ex.getMessage().toString(),
                            Toast.LENGTH_LONG).show();
                    ex.printStackTrace();
                }
            }
        });
    }

    int generate_id(){
        int gen_id = 0;
        SecureRandom rnd = new SecureRandom();
        byte arr[] = new byte[32];
        rnd.nextBytes(arr);
        for(int a=0;a<arr.length;a++){
            gen_id +=arr[a];
        }
        return gen_id;
    }
//    public void onConnected(Bundle connectionHint) throws  SecurityException {
////    // Gets the best and most recent location currently available,
////    // which may be null in rare cases when a location is not available.
////        Location mLastLocation = LocationServices.FusedLocationApi.getLastLocation(mGoogleApiClient);
////
////        if (mLastLocation != null) {
////        // Determine whether a Geocoder is available.
////            if (!Geocoder.isPresent()) {
////                Toast.makeText(this, R.string.no_geocoder_available,
////                    Toast.LENGTH_LONG).show();
////                return;
////            }
////
////        if (mAddressRequested) {
////            startIntentService();
////        }
////    }
//}

//    @Override
//    public void onConnectionSuspended(int i) {
//
//    }


//    @Override
//    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
//
//    }
}
