package com.example.act2_even_button;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class DaftarActivity extends AppCompatActivity {
    EditText edtNama, edtAlamat, edtEmail,edtpassword,edtrepass;
    FloatingActionButton feb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);

            edtNama = findViewById(R.id.edNama);
            edtEmail=findViewById(R.id.edEmail);
            edtpassword= findViewById(R.id.edPassword);
            edtrepass= findViewById(R.id.edrepas);
            edtAlamat = findViewById(R.id.edAlamat);

            feb = findViewById(R.id.febSimpan);

        feb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtNama.getText().toString().isEmpty()||
                    edtAlamat.getText().toString().isEmpty()||
                    edtEmail.getText().toString().isEmpty()||
                    edtpassword.getText().toString().isEmpty()||
                    edtrepass.getText().toString().isEmpty())
                {
                    Snackbar.make(view,"Wajib Isi Seluruh data !!!", Snackbar.LENGTH_SHORT).show();
                }
                else
                {
                    if (edtpassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(),"Pendaftaran Berhasil ....",
                                Toast.LENGTH_SHORT).show();

                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(view, "Password dan Repassword harus sama !!!",Snackbar.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
