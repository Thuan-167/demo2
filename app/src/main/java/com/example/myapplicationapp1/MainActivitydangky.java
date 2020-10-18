package com.example.myapplicationapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivitydangky extends AppCompatActivity {
    EditText edtuser , edtpass;
    Button btndangnhap;
    String ten,mk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);
        anhxa();
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtuser.getText().length()!=0&& edtpass.getText().length()!=0) {
                    if (edtuser.getText().toString().equals(ten) && edtpass.getText().toString().equals(mk)) {
                        Toast.makeText(MainActivitydangky.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivitydangky.this, MainActivityListview.class);
                        startActivity(intent);
                    }else
                    if (edtuser.getText().toString().equals("hmt") && edtpass.getText().toString().equals("1")) {
                        Toast.makeText(MainActivitydangky.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivitydangky.this, MainActivityListview.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivitydangky.this, "Sai mật khẩu hoặc tên đăng nhập", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivitydangky.this, "Hãy điền thông tin ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void anhxa() {
        edtuser =(EditText) findViewById(R.id.edttextuser);
        edtpass =(EditText) findViewById(R.id.edttextpass);
        btndangnhap=(Button) findViewById(R.id.buttondangky);
    }
}