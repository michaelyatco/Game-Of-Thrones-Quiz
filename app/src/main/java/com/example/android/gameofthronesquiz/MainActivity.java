package com.example.android.gameofthronesquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * This app displays a Game of Thrones quiz
 */
public class MainActivity extends AppCompatActivity {

    public int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the submit button is clicked at the end of the quiz.
     */
    public void submitQuiz(View view) {
        score = 0;
        RadioGroup dataRadio;
        RadioButton dataRadioButton;
        CheckBox dataBox;

        // Question 1 - Fill in the blank
        EditText question1 = (EditText) findViewById(R.id.question_1);
        if (question1.getText().toString().toLowerCase().trim().contains("valar dohaeris")) {
            score += 1;
            question1.setBackgroundColor(0x2200FF00);
        } else {
            question1.setBackgroundColor(0x22FF0000);
        }

        // Question 2 - True or false with buttons
        dataRadio = (RadioGroup) findViewById(R.id.question_2);

        switch (dataRadio.getCheckedRadioButtonId()) {
            case R.id.radio2true:
                dataRadioButton = (RadioButton) findViewById(R.id.radio2true);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio2false:
                dataRadioButton = (RadioButton) findViewById(R.id.radio2false);
                dataRadioButton.setBackgroundColor(0x2200FF00);
                score += 1;
                break;

        }
        // Question 3 - Fill in the blank
        EditText question3 = (EditText) findViewById(R.id.question_3);
        if (question3.getText().toString().toLowerCase().trim().contains("winter is coming")) {
            score += 1;
            question3.setBackgroundColor(0x2200FF00);
        } else {
            question3.setBackgroundColor(0x22FF0000);
        }

        // Question 4 - Multiple Choice with buttons
        dataRadio = (RadioGroup) findViewById(R.id.question_4);

        switch (dataRadio.getCheckedRadioButtonId()) {
            case R.id.radio4a:
                dataRadioButton = (RadioButton) findViewById(R.id.radio4a);
                dataRadioButton.setBackgroundColor(0x2200FF00);
                score += 1;
                break;
            case R.id.radio4b:
                dataRadioButton = (RadioButton) findViewById(R.id.radio4b);
                question1.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio4c:
                dataRadioButton = (RadioButton) findViewById(R.id.radio4c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;

        }
        // Question 5 - Fill in the blank
        EditText question5 = (EditText) findViewById(R.id.question_5);
        if (question5.getText().toString().toLowerCase().trim().contains("burn them all")) {
            score += 1;
            question5.setBackgroundColor(0x2200FF00);
        } else {
            question5.setBackgroundColor(0x22FF0000);
        }

        // Question 6 - Multiple Choice with buttons
        dataRadio = (RadioGroup) findViewById(R.id.question_6);

        switch (dataRadio.getCheckedRadioButtonId()) {
            case R.id.radio6a:
                dataRadioButton = (RadioButton) findViewById(R.id.radio6a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio6b:
                dataRadioButton = (RadioButton) findViewById(R.id.radio6b);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio6c:
                dataRadioButton = (RadioButton) findViewById(R.id.radio6c);
                dataRadioButton.setBackgroundColor(0x2200FF00);
                score += 1;
                break;

        }

        // Question 7 - Fill in the blank
        EditText question7 = (EditText) findViewById(R.id.question_7);
        if (question7.getText().toString().toLowerCase().trim().contains("not today")) {
            score += 1;
            question7.setBackgroundColor(0x2200FF00);
        } else {
            question7.setBackgroundColor(0x22FF0000);
        }

        // Question 8 - Multiple Choice with buttons
        dataRadio = (RadioGroup) findViewById(R.id.question_8);

        switch (dataRadio.getCheckedRadioButtonId()) {
            case R.id.radio8a:
                dataRadioButton = (RadioButton) findViewById(R.id.radio8a);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;
            case R.id.radio8b:
                dataRadioButton = (RadioButton) findViewById(R.id.radio8b);
                dataRadioButton.setBackgroundColor(0x2200FF00);
                score += 1;
                break;
            case R.id.radio8c:
                dataRadioButton = (RadioButton) findViewById(R.id.radio8c);
                dataRadioButton.setBackgroundColor(0x22FF0000);
                break;

        }

        // Question 9 - Fill in the blank
        EditText question9 = (EditText) findViewById(R.id.question_9);
        if (question9.getText().toString().toLowerCase().trim().contains("kingslayer")) {
            score += 1;
            question9.setBackgroundColor(0x2200FF00);
        } else {
            question9.setBackgroundColor(0x22FF0000);
        }

//        // Question 10 - Multiple Correct Answers with CheckBox


        CheckBox checkBox1 = (CheckBox) findViewById(R.id.button10a);
        boolean checkedBox1 = checkBox1.isChecked();
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.button10b);
        boolean checkedBox2 = checkBox2.isChecked();
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.button10c);
        boolean checkedBox3 = checkBox3.isChecked();
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.button10d);
        boolean checkedBox4 = checkBox4.isChecked();
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.button10e);
        boolean checkedBox5 = checkBox5.isChecked();
        CheckBox checkBox6 = (CheckBox) findViewById(R.id.button10f);
        boolean checkedBox6 = checkBox6.isChecked();

        if (checkedBox1) {
            dataBox = (CheckBox) findViewById(R.id.button10a);
            dataBox.setBackgroundColor(0x22FF0000);
            score -= 1;
        }
        if (checkedBox2) {
            dataBox = (CheckBox) findViewById(R.id.button10b);
            dataBox.setBackgroundColor(0x2200FF00);
            score += 1;
        }
        if (checkedBox3) {
            dataBox = (CheckBox) findViewById(R.id.button10c);
            dataBox.setBackgroundColor(0x22FF0000);
            score -= 1;
        }
        if (checkedBox4) {
            dataBox = (CheckBox) findViewById(R.id.button10d);
            dataBox.setBackgroundColor(0x2200FF00);
            score += 1;
        }
        if (checkedBox5) {
            dataBox = (CheckBox) findViewById(R.id.button10e);
            dataBox.setBackgroundColor(0x22FF0000);
            score -= 1;
        }
        if (checkedBox6) {
            dataBox = (CheckBox) findViewById(R.id.button10f);
            dataBox.setBackgroundColor(0x2200FF00);
            score += 1;
        }

        float finalScore = (float) score;
        finalScore = finalScore / 13;
        finalScore = finalScore * 100;

        Toast.makeText(this, "Your final score is: " + String.valueOf(score) + " points\nYou got " + Math.round(finalScore) + " % correct.", Toast.LENGTH_SHORT).show();
    }
}
