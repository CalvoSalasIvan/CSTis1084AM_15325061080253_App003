package mx.com.cetis108.asdasdasd;

import android.accessibilityservice.GestureDescription;
import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView resultado,igualdad;
    EditText valor,valor2;
    Button btnaceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        igualdad=(TextView)findViewById(R.id.tvIgualdad);
        resultado =(TextView) findViewById(R.id.tvResultado);
        valor =(EditText) findViewById(R.id.etValor);
        valor2=(EditText) findViewById(R.id.etValor2);
      //  btnaceptar=(Button)findViewById(R.id.btnAceptar);


    }
    public void Aceptar(View view)
    {

        int numero2=Integer.parseInt(valor2.getText().toString());
        int numero1=Integer.parseInt(valor.getText().toString());
        int resul;
        if (numero1<numero2)
        {
            resul=numero1+numero2;
            resultado.setText("Se suman y el resultado es: "+resul);
            if(numero1>numero2)
            {
                igualdad.setText("EL "+numero1+" es mayor");
            }
            if(numero1<numero2)
            {
                igualdad.setText("El "+numero2+" es mayor");
            }
        }
        if (numero1>numero2)
        {
            resul=numero1-numero2;
            resultado.setText("Se resta y el resultado es: "+resul);
            if(numero1>numero2)
            {
                igualdad.setText("EL "+numero1+" es mayor");
            }
            if(numero1<numero2)
            {
                igualdad.setText("El "+numero2+" es mayor");
            }
        }
        if (numero1==numero2)
        {
            resultado.setText("Las dos cantidades son iguales");
            igualdad.setText(" ");
        }
    }
}
