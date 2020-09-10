package pers.faiz.test.watermelonvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("faiz", "生命周期==onCreate:==MainActivity" );
        btnSecond = findViewById(R.id.btn_second);
        btnSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //显示启动
//                startActivity(new Intent(MainActivity.this,SecondActivity.class));
//隐式启动
                startActivity(new Intent("pers.faiz.test.action.SecondActivity"));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("faiz", "生命周期==onStart:==MainActivity" );
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("faiz", "生命周期==onResume:==MainActivity" );
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("faiz", "生命周期==onPause:==MainActivity" );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("faiz", "生命周期==onRestart:==MainActivity" );
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("faiz", "生命周期==onStop:==MainActivity" );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("faiz", "生命周期==onDestroy:==MainActivity" );
    }
}
