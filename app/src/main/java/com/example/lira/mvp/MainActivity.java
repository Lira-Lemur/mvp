package com.example.lira.mvp;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lira.mvp.view.fragments.ComedyFragment;
import com.example.lira.mvp.view.fragments.HorrorFragment;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btnComedies)
    Button btnComedies;

    @BindView(R.id.btnHorrors)
    Button btnHorrors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnComedies.setOnClickListener(this);
        btnHorrors.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnComedies:
                replaceFragment(new ComedyFragment());
                break;
            case R.id.btnHorrors:
                replaceFragment(new HorrorFragment());
                break;
            default:
                break;
        }
    }

    public void replaceFragment(Fragment fragment){
        getFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, fragment)
                .commit();
    }
}
