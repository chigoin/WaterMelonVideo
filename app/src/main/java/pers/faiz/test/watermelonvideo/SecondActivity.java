package pers.faiz.test.watermelonvideo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button btnMain, btnSecond, btnThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.e("faiz", "生命周期==onCreate:==SecondActivity");
        btnMain = findViewById(R.id.btn_main);
        btnSecond = findViewById(R.id.btn_second);
        btnThird = findViewById(R.id.btn_third);
        btnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });

        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                standard模式启动
                Intent intent = new Intent(SecondActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//              单个数据传输
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
//                intent.putExtra("name","faiz");
//                intent.putExtra("code",555);
//                传输多个数据
//                Bundle bundle = new Bundle();
//                bundle.putInt("code",555);
//                bundle.putString("name","faiz");
//                intent.putExtras(bundle);
//                startActivity(intent);
//                从ThirdActivity返回数据非SecondActivity
                startActivityForResult(intent, 1001);


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e("backIn", "requestCode=" + requestCode);
        Log.e("backIn", "resultCode=" + resultCode);
        Log.e("backIn", "Intent data" + data.getStringExtra("name"));

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("faiz", "生命周期==onStart:==SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("faiz", "生命周期==onResume:==SecondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("faiz", "生命周期==onPause:==SecondActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("faiz", "生命周期==onRestart:==SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("faiz", "生命周期==onStop:==SecondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("faiz", "生命周期==onDestroy:==SecondActivity");
    }
}
