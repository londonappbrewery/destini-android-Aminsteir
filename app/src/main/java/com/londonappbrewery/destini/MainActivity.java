package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    Button mExitButton;
    int mStoryText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        mExitButton = (Button) findViewById(R.id.exit);
        mStoryText = 1;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryText) {
                    case 1:
                        mStoryTextView.setText(R.string.T3_Story);
                        mButtonTop.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);
                        mStoryText = 3;
                        break;
                    case 2:
                        mStoryTextView.setText(R.string.T3_Story);
                        mButtonTop.setText(R.string.T3_Ans1);
                        mButtonBottom.setText(R.string.T3_Ans2);
                        mStoryText = 3;
                        break;
                    case 3:
                        mStoryTextView.setText(R.string.T6_End);
                        mButtonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                        mExitButton.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryText) {
                    case 1:
                        mStoryTextView.setText(R.string.T2_Story);
                        mButtonTop.setText(R.string.T2_Ans1);
                        mButtonBottom.setText(R.string.T2_Ans2);
                        mStoryText = 2;
                        break;
                    case 2:
                        mStoryTextView.setText(R.string.T4_End);
                        mButtonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                        mExitButton.setVisibility(View.VISIBLE);
                        break;
                    case 3:
                        mStoryTextView.setText(R.string.T5_End);
                        mButtonTop.setVisibility(View.GONE);
                        mButtonBottom.setVisibility(View.GONE);
                        mExitButton.setVisibility(View.VISIBLE);
                        break;
                }
            }
        });

        mExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
