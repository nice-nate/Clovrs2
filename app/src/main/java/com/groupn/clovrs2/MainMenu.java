package com.groupn.clovrs2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_main_menu);
        layout.addView(textView);}

        public void startManageWorkspace(View view){
        Intent intent = new Intent(this, ManageWorkspaces.class);
        startActivity(intent);
        }

        public void startAcceptInvite(View view){
            Intent intent = new Intent(this, UpcomingMeeting.class);
            startActivity(intent);
        }

        public void startSettings(View view){
            Intent intent = new Intent(this, Settings.class);
            startActivity(intent);
        }

        public void startUpload(View view){
            Intent intent = new Intent(this, Upload.class);
            startActivity(intent);
        }

        public void startContacts(View view){
            Intent intent = new Intent(this, Contacts.class);
            startActivity(intent);
        }

        public void startCreateMeeting(View view){
            Intent intent = new Intent(this, CreateMeetingInivte.class);
            startActivity(intent);
        }
    }

