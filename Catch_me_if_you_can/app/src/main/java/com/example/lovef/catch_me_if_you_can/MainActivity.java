package com.example.lovef.catch_me_if_you_can;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//http://blog.naver.com/PostView.nhn?blogId=pahapck0&logNo=220586927852
//너무나 잘 설명되어있는 android 프로젝트 구조이다
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent go_join_page;
        Button go_join_button;
        //= new Intent(MainActivity.this, catch_join_page.java);
        Intent go_login_page;
        Button go_login_button;
        //= new Intent(MainActivity.this, catch_login_page.java);

        go_join_page = new Intent(MainActivity.this, catch_join_page.class);
        go_login_page = new Intent(MainActivity.this, catch_login_page.class);


        go_join_button = (Button) findViewById(R.id.facebook_login_button);
        //go_login_button =

    }
}
