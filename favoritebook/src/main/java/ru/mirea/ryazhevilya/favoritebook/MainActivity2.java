package ru.mirea.ryazhevilya.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private EditText etUserBookData;
    private TextView tvDevBookData;
    private Button btnSendBookData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etUserBookData = findViewById(R.id.editTextUserBookData);
        tvDevBookData = findViewById(R.id.textViewDevBookData);
        btnSendBookData = findViewById(R.id.buttonSendData);
        tvDevBookData.setText("Любимая книга разработчика: Преступление и наказание");
        etUserBookData.setHint("Введите название и вашей любимой книги: ");

    }

    public void sendBookInfo(View view) {
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, etUserBookData.getText().toString());
        setResult(Activity.RESULT_OK, data);
        finish();
    }
}