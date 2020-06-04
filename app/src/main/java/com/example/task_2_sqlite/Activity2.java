
package com.example.task_2_sqlite;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends Activity implements OnClickListener {

    private Button addTodoBtn;
    private EditText nameEditText;
    private EditText ageEditText;

    private DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle("Add Record");
        setContentView(R.layout.activity_2);

        nameEditText = (EditText) findViewById(R.id.edit_name);
        ageEditText = (EditText) findViewById(R.id.edit_age);
        addTodoBtn = (Button) findViewById(R.id.add_record);

        dbManager = new DBManager(this);
        dbManager.open();
        addTodoBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_record:

                final String name = nameEditText.getText().toString();
                final String age = ageEditText.getText().toString();

                dbManager.insert(name, age);

                Intent main = new Intent(Activity2.this, Activity3.class)
                        .setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

                startActivity(main);
                break;
        }
    }

}