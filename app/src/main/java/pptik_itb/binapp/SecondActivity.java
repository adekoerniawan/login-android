package pptik_itb.binapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
public class SecondActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("Halaman User BIN");
        getSupportActionBar().setSubtitle("Badan Intelejen Nasional");
    }

    public void FaceMasuk(View view)
    {
        Intent intent = new Intent(SecondActivity.this, FaceAnalisis.class);
        startActivity(intent);
    }
}
