package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nomeEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private EditText cidadeEt;
    private Button salvarBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEt = findViewById(R.id.nomeEt);
        telefoneEt = findViewById(R.id.telefoneEt);
        emailEt = findViewById(R.id.emailEt);
        cidadeEt = findViewById(R.id.cidadeEt);

        salvarBt = findViewById(R.id.salvarBt);
        salvarBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        StringBuilder sb = new StringBuilder();
        //nome
        sb.append(nomeEt.getText().toString());
        sb.append('\n');

        //telefone
        sb.append(telefoneEt.getText().toString());
        sb.append('\n');

        //email
        sb.append(emailEt.getText().toString());
        sb.append('\n');

        //cidade
        sb.append(cidadeEt.getText().toString());
        sb.append('\n');


        Toast.makeText(this, sb, Toast.LENGTH_SHORT).show();
    }
}