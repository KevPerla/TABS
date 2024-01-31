package Controlador;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tab.R;

public class frangment_queestudio extends Fragment {
    public frangment_queestudio() {
    }

    public static frangment_queestudio newInstance() {
        return new frangment_queestudio();
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_frangment_queestudio, container, false);

        Button btnMiUniversidad = rootView.findViewById(R.id.btnMiUniversidad);
        btnMiUniversidad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirSitio();
            }
        });

        return rootView;
    }

    private void abrirSitio() {
        String url = "https://www.univo.edu.sv/";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}