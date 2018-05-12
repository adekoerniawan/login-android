package pptik_itb.binapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FaceAnalisis  extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.face_analisis);

        getSupportActionBar().setTitle("Face Analisis");
        getSupportActionBar().setSubtitle("Badan Intelejen Nasional");
    }
}
