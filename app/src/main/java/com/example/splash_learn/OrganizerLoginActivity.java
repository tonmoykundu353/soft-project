package com.example.splash_learn;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class OrganizerLoginActivity extends AppCompatActivity {

    CheckBox checkBox;
    EditText organizer_university_rollobj, organizer_university_passwordobj;
    Button Loginbtn;
    Spinner universitySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizer_login);

        universitySpinner = findViewById(R.id.id_enter_organizer_university_spinner);
        checkBox = findViewById(R.id.organizer_checkbox_button1);
        organizer_university_rollobj = findViewById(R.id.id_enter_organizer_roll);
        organizer_university_passwordobj = findViewById(R.id.id_enter_organizer_password);
        Loginbtn = findViewById(R.id.id_organizer_login_btn);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    // For show password
                    organizer_university_passwordobj.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else
                {
                    // For hide password
                    organizer_university_passwordobj.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }

        });

        // Define your list of universities
        List<String> universityList = new ArrayList<>();
        universityList.add("KUET");
        universityList.add("BUET");
        universityList.add("CUET");
        universityList.add("RUET");
        // Add more universities as needed

        // Create an ArrayAdapter using the university list
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, universityList);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        universitySpinner.setAdapter(adapter);



        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve selected university name from Spinner
                String University_name = universitySpinner.getSelectedItem().toString();
                String University_roll = organizer_university_rollobj.getText().toString();
                String University_password = organizer_university_passwordobj.getText().toString();
                // Newly added code
                if(University_password.length()<6)
                {
                    Toast.makeText(OrganizerLoginActivity.this, "Password less than 6 charecters", Toast.LENGTH_SHORT).show();
                }
                else if(University_roll.length()!=7)
                {
                    Toast.makeText(OrganizerLoginActivity.this, "Invalid roll number", Toast.LENGTH_SHORT).show();
                }
               else
                {
                    RegistrationInfo registrationInfo = new RegistrationInfo(University_name, University_roll, University_password);
                    DatabaseReference ref = FirebaseDatabase.getInstance().getReference().child("OrganizerRegistrationSection").child(University_roll);
                    ref.setValue(registrationInfo);
                    Toast.makeText(OrganizerLoginActivity.this, "User information is successfully added", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(OrganizerLoginActivity.this, OrganizerLoginActivity2.class));
                }


            }
        });
    }
}
