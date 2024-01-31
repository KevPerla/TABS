package Controlador;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.tab.R;

public class fragment_quiensoy extends Fragment {

    public fragment_quiensoy() {
        // Required empty public constructor
    }

    public static fragment_quiensoy newInstance() {
        return new fragment_quiensoy();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_quiensoy, container, false);

        Button btnEscribeme = rootView.findViewById(R.id.btnEscribeme);
        btnEscribeme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enviarMensajeWhatsApp();
            }
        });

        return rootView;
    }

    private void enviarMensajeWhatsApp() {
        String numero = "123445@s.whatsapp.net";
        String mensaje = "Hola!! Quisiera contactarte.";

        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.putExtra("jid", numero);
        sendIntent.putExtra(Intent.EXTRA_TEXT, mensaje);
        sendIntent.setPackage("com.whatsapp");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }
}
