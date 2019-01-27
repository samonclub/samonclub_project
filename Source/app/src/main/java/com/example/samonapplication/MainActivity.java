package com.example.samonapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        findViewById(R.id.button).setOnClickListener((View.OnClickListener) this);
        //IDを元にImageViewオブジェクトを取得
        ImageView iv = (ImageView)this.findViewById(R.id.imageView);
        // drawableフォルダにある任意のイメージを設定
        iv.setImageResource(R.drawable.stat_level4);

        // ImageViewオブジェクトにクリックイベントを追加する
        iv.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        DetailClickEvent(v);
                        // イメージ画像がクリックされたときに実行される処理
//                        Toast.makeText(MainActivity.this, "画像01がクリックされました", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void DetailClickEvent(View view) {
        Toast toast = Toast.makeText(this,"うどんとそば",Toast.LENGTH_SHORT);
        toast.show();
        goToDetailPage();
    }

    private void goToDetailPage() {
        Intent intent;
        intent = new Intent(getApplicationContext(),DetailActivity.class);
        startActivity(intent);
    }

    public void OnConfig(View view) {
        Toast toast = Toast.makeText(this,"設定",Toast.LENGTH_SHORT);
        toast.show();
        goToConfigPage();
    }

    private void goToConfigPage() {
        Intent intent;
        intent = new Intent(getApplicationContext(),SettingsActivity.class);
        startActivity(intent);
    }
}
