package pe.edu.idat.appformsandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import pe.edu.idat.appformsandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnirlistador.setOnClickListener(this);
        binding.btnirregistro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnirlistador){
            startActivity(new Intent(MainActivity.this,
                    ListaActivity.class));
        }else if(v.getId() == R.id.btnirregistro){
            startActivity(new Intent(MainActivity.this,
                    RegistroActivity.class));
        }
    }
}