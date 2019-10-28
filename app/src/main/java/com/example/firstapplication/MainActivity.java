package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private boolean turn = false;
    private boolean[][] board;
    private ArrayList<Button> buttons;

    public MainActivity() {
        board = new boolean[3][3];
        buttons = new ArrayList<>();
//        for (int i = 0; i < 9; i++) {
//            int id = getResources().getIdentifier("button"+i, "id", getPackageName());
//            buttons.add((Button) findViewById(id));
//        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void boxClick(View view) {
        Button button = (Button) view;
        if(turn)
            button.setText("O");
        else
            button.setText("X");
        String id = getResources().getResourceEntryName(button.getId());
        id =  id.replaceAll("[^0-9]+", " ");
        int num = Integer.valueOf(id.trim().split(" ")[0]);
        Toast toast = Toast.makeText(getApplicationContext(),
                String.valueOf(num), Toast.LENGTH_SHORT);
        toast.show();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

            }
        }

        turn = !turn;
    }

    private boolean isWin() {
        return false;
    }
}
