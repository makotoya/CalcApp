package jp.techacademy.yaguchi.makoto.calcapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edit1;
    EditText edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.editText1);
        edit2 = (EditText) findViewById(R.id.editText2);

        // とりあえず、+ボタンを押した場合
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);
    }

    //二つの数字を入れる変数ここで宣言
    float answer;

    public void onClick(View v) {
        int id = v.getId();

        // ここでボタン別のID確認する
        Log.d("Calcapp", String.valueOf(id));

        float a = Float.parseFloat(edit1.getText().toString());
        float b = Float.parseFloat(edit2.getText().toString());

        switch (id) {
            case 2131165219:    // +ボタン
                answer = a + b;
                break;
            case 2131165220:    // -ボタン
                answer = a - b;
                break;
            case 2131165221:    // *ボタン
                answer = a * b;
                break;
            case 2131165222:    // /ボタン
                answer = a / b;
                break;
        }

        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("KOTAE", answer);
        startActivity(intent);
    }
}
