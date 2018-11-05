package unac.com.co.forms;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //Obtenemos una referencia a los controles de la interfaz
        final TextView text = (TextView) findViewById(R.id.registrarse);
        //Implementamos el evento “click” del botón
        text.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, Registro.class);
                startActivity(intent);
            }
        });

    }

}
