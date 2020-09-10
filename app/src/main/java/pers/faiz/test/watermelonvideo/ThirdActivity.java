package pers.faiz.test.watermelonvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

//        Intent intent = getIntent();
//        String name = intent.getStringExtra("name");
//        int code  = intent.getIntExtra("code",0);

//        Bundle bundle = intent.getExtras();
//        String name = bundle.getString("name");
//        int code = bundle.getInt("code");
//        Toast.makeText(this,"==="+name+"变身"+code,Toast.LENGTH_SHORT).show();
//        Log.e("hensin", "==="+name+"变身"+code );

          Intent backIn = new Intent();
          backIn.putExtra("name","omega");
          setResult(1002,backIn);

        Button btnThird = findViewById(R.id.btn_third);
        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                singleTop模式
                Toast.makeText(ThirdActivity.this,"third",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ThirdActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
