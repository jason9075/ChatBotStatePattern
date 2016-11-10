package com.jason9075.statepatternsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jason9075.statepatternsample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ChatBot chatBot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        chatBot = new ChatBot();

        /* 當bot反應結果時 */
        chatBot.setListener(new ChatBot.ChatBotListener() {
            @Override
            public void onResponse(String message) {
                binding.outputTextView.setText(message);
            }
        });

        binding.submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chatBot.userSay(binding.userEditText.getText().toString()); //把使用者的訊息傳給bot
                chatBot.popUpResponse(); //叫bot 反應結果
                binding.userEditText.setText("");
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        chatBot.popUpResponse();
    }
}
