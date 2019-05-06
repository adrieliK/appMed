package com.example.aluno.appmed;



        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText valor1;
    private EditText valor2;
    private EditText valor3;
    private Button resultado;
    private TextView mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        valor3 = (EditText) findViewById(R.id.valor3);
        resultado= (Button) findViewById(R.id.resultado);
        mensagem = (TextView) findViewById(R.id.textViewResultado);


        resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                try {



                    Double val1 = Double.parseDouble(valor1.getText().toString());
                    Double val2 = Double.parseDouble(valor2.getText().toString());
                    Double val3 = Double.parseDouble(valor3.getText().toString());
                    Double total;

                    total = (val1 + val2 + val3) / 3;



                    if (total >= 60) {
                        mensagem.setText("Resultado: " + total + "Parabéns, você foi aprovado!");
                    } else {
                        mensagem.setText("Resultado: " + total + " Você foi reprovado mas ainda tem chance de recuperar!");
                    }


                } catch (Exception E){

                    Toast.makeText(MainActivity.this, "Houve um problema. Tente novamente!", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
