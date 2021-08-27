package br.edu.ifsp.scl.sdm.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nomeEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private CheckBox ingressar_listaCb;
    private RadioButton masculinoRb;
    private RadioButton femininoRb;
    private EditText cidadeEt;
    private Spinner estadoSp;
    private Button salvarBt;
    private Button limparBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEt = findViewById(R.id.nomeEt);
        telefoneEt = findViewById(R.id.telefoneEt);
        emailEt = findViewById(R.id.emailEt);
        ingressar_listaCb = findViewById(R.id.ingressar_listaCb);
        masculinoRb = findViewById(R.id.masculinoRb);
        femininoRb = findViewById(R.id.femininoRb);
        cidadeEt = findViewById(R.id.cidadeEt);
        estadoSp = findViewById(R.id.estadoSp);
        salvarBt = findViewById(R.id.salvarBt);
        salvarBt.setOnClickListener(this);
        limparBt = findViewById(R.id.limparBt);
        limparBt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == salvarBt) {
            Formulario();
        } else {
            limparFormulario();
        }

    }

    private void Formulario() {
        StringBuilder sb = new StringBuilder();
        //nome
        sb.append("Nome: ");
        sb.append(nomeEt.getText().toString());
        sb.append('\n');

        //telefone
        sb.append("Telefone: ");
        sb.append(telefoneEt.getText().toString());
        sb.append('\n');

        //email
        sb.append("Email: ");
        sb.append(emailEt.getText().toString());
        sb.append('\n');

        //Ingressar lista de emails
        sb.append("Ingressar na lista de emails? ");
        sb.append(ingressar_listaCb.isChecked() ? "Sim" : "Não");
        sb.append('\n');

        //sexo
        sb.append("Sexo: ");
        sb.append(masculinoRb.isChecked() ? "Masculino" : "Feminino");
        sb.append('\n');

        //cidade
        sb.append("Cidade: ");
        sb.append(cidadeEt.getText().toString());
        sb.append('\n');

        // Spinner
        sb.append("Estado: ");
        sb.append(((TextView) estadoSp.getSelectedView()).getText());
        sb.append('\n');

        Toast.makeText(this, sb, Toast.LENGTH_SHORT).show();
    }

    private void limparFormulario() {
        nomeEt.setText("");
        telefoneEt.setText("");
        emailEt.setText("");
        ingressar_listaCb.setChecked(false);
        masculinoRb.setChecked(false);
        femininoRb.setChecked(false);
        cidadeEt.setText("");
        estadoSp.setSelection(0);
    }

}