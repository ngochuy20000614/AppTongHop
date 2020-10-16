package com.example.circleview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    TextView signup;
    EditText user, pass;
    Button login;
    String username = "admin", password = "admin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup = (TextView)findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });
        user = (EditText)findViewById(R.id.edtuser);
        pass = (EditText)findViewById(R.id.edtpassword);
        login = (Button)findViewById(R.id.btlogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.getText().length()!=0 && pass.getText().length()!=0){
                    if(user.getText().toString().equals(username) && pass.getText().toString().equals(password)){
                        Toast.makeText(LoginActivity.this,"Bạn đã đăng nhập thành công",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, ChatActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(LoginActivity.this,"Đăng nhập thất bại",Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(LoginActivity.this,"Chưa nhập đủ thông tin",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}