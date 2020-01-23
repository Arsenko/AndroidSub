package com.example.androidsub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }
    public void init(){
        final TextView userName=findViewById(R.id.userName);
        final TextView userMail=findViewById(R.id.userMail);
        final TextView outView=findViewById(R.id.outView);
        final Button buttonOk=findViewById(R.id.buttonOk);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outView.setText("Подписка на рассылку успешно оформлена для пользователя "+
                        userName.getText()+" на электронный адрес "+userMail.getText());
            }
        });

        Button buttonClear=findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName.setText("");
                userMail.setText("");
                outView.setText("");
            }
        });
    }

}
