package Controlador;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tab.R;

public class frangment_tecno extends Fragment {
    public frangment_tecno() {
    }
    public static frangment_tecno newInstance() {
        return new frangment_tecno();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_frangment_tecno, container, false);
        
        rootView.findViewById(R.id.btnContactame).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactamePorCorreo();
            }
        });

        return rootView;
    }

    private void contactamePorCorreo() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"kevperla11@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Me interesa tus servicios");
        startActivity(Intent.createChooser(intent, "Selecciona una aplicación de correo"));
    }
}