package cashkaro.com.reusablerecycleview;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Frag frag = new Frag();
        fragmentTransaction.replace(R.id.contain, frag);
        fragmentTransaction.commit();

        FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
        Frag1 frag1 = new Frag1();
        fragmentTransaction1.replace(R.id.contain1, frag1);
        fragmentTransaction1.commit();

    }
}
