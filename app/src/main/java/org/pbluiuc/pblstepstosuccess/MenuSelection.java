package org.pbluiuc.pblstepstosuccess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuSelection extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_selection);

        Button userinfo_redirect = findViewById(R.id.userinfo);
        Button food_redirect = findViewById(R.id.foodMenuBtn);
        Button workout_redirect = findViewById(R.id.workoutMenuBtn);
        Button stepper_redirect = findViewById(R.id.stepTrackerBtn);

        userinfo_redirect.setOnClickListener(this);
        food_redirect.setOnClickListener(this);
        workout_redirect.setOnClickListener(this);
        stepper_redirect.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent nextAct;

        switch(v.getId()) {
            case R.id.userinfo:
                Toast.makeText(this, "Opening user info", Toast.LENGTH_SHORT).show();
                // TODO: Set nextAct = calorie menu
                nextAct = new Intent(this, MenuSelection.class);
                break;
            case R.id.foodMenuBtn:
                Toast.makeText(this, "Opening calorie tracker", Toast.LENGTH_SHORT).show();
                // TODO: Set nextAct = calorie menu
                nextAct = new Intent(this, MenuSelection.class);
                break;
            case R.id.workoutMenuBtn:
                Toast.makeText(this, "Opening exercise tracker", Toast.LENGTH_SHORT).show();
                // TODO: Set nextAct = exercise menu
                nextAct = new Intent(this, MenuSelection.class);
                break;
            case R.id.stepTrackerBtn:
                Toast.makeText(this, "Opening step counter", Toast.LENGTH_SHORT).show();
                nextAct = new Intent(this, MainActivity.class);
                break;
            default:
                Toast.makeText(this, "Error occurred during menu selection, reloading", Toast.LENGTH_SHORT).show();
                nextAct = new Intent(this, MenuSelection.class);
                break;
        }

        startActivity(nextAct);
    }
}
