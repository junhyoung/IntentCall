package github.com.junhyoung.intentcall;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void call(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-4197-7192"));
        startActivity(intent);
    }
    public void internet(View view){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }
    public void sms(View v){
        Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("sms:010-4197-7192"));
        startActivity(intent);
    }

}
