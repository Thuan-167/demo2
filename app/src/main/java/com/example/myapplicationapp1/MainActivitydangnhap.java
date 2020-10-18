package com.example.myapplicationapp1;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivitydangnhap extends AppCompatActivity {
    EditText edtuser , edtpass;
    Button  btndangnhap;
    String ten,mk;
    Button btdky;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
        anhxa();
        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtuser.getText().length()!=0&& edtpass.getText().length()!=0) {
                    if (edtuser.getText().toString().equals(ten) && edtpass.getText().toString().equals(mk)) {
                        Toast.makeText(MainActivitydangnhap.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivitydangnhap.this, MainActivityListview.class);
                        startActivity(intent);
                    }else
                    if (edtuser.getText().toString().equals("hmt") && edtpass.getText().toString().equals("1")) {
                        Toast.makeText(MainActivitydangnhap.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivitydangnhap.this, MainActivityListview.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivitydangnhap.this, "Sai mật khẩu hoặc tên đăng nhập", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(MainActivitydangnhap.this, "Hãy điền thông tin ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btdky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivitydangnhap.this, MainActivitydangky.class);
                startActivity(intent);
            }
        });

    }

    private void anhxa() {
        btdky=(Button)findViewById(R.id.buttondangky);
        edtuser =(EditText) findViewById(R.id.edttextuser);
        edtpass =(EditText) findViewById(R.id.edttextpass);
        btndangnhap=(Button) findViewById(R.id.buttondangnhap);
    }
}