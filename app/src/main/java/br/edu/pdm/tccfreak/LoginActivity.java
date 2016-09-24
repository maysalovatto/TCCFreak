package br.edu.pdm.tccfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edtLogin;
    private EditText edtSenha;
    private ImageButton btnLogin;
    private ImageButton btnSair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //recuperando instâncias do XML(findViewById)
        edtLogin = (EditText)findViewById(R.id.edtLogin);
        edtSenha = (EditText)findViewById(R.id.edtSenha);
        btnLogin = (ImageButton)findViewById(R.id.btnLogin);
        btnSair = (ImageButton)findViewById(R.id.btnSair);
        btnLogin.setOnClickListener(this);
        btnSair.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                String strLogin = edtLogin.getText().toString();
                String strSenha = edtSenha.getText().toString();

                if (strLogin.trim().equals("tccfreak") && strSenha.trim().equals("tccfreak")) {
                    Intent it = new Intent(this, PrincipalActivity.class);
                    startActivity(it);
                    finish();
                }else{
                    edtLogin.setText("");
                    edtSenha.setText("");
                    Toast.makeText(this, R.string.msgLoginInvalido, Toast.LENGTH_LONG);
                    edtLogin.requestFocus();
                }
                break;
            case R.id.btnSair:

                break;
        }
    }
}
