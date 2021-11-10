package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.database.MyDatabase;
import com.example.myapplication.enteties.User;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingsFragment extends Fragment {

    private SettingsActivity settingsActivity;
    Button logout_button;
    EditText name2;
    EditText password2;
    Button update_button;
    MyDatabase db;
    SharedPreferences login_preference;
    SharedPreferences.Editor login_editor;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SettingsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SettingsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SettingsFragment newInstance(String param1, String param2) {
        SettingsFragment fragment = new SettingsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        };
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_settings, container, false);
        logout_button = view.findViewById(R.id.logout_button);
        name2 = view.findViewById(R.id.name2);
        password2 = view.findViewById(R.id.password2);
        update_button = view.findViewById(R.id.update_button);

        login_preference = this.getActivity().getSharedPreferences("pref_login" , Context.MODE_PRIVATE);
        login_editor = login_preference.edit();

        db = MyDatabase.getMyDatabase(this.getActivity());


        Log.d(login_preference.getString("login" , ""), " refrence");
        User user= db.userDao().findUser(login_preference.getString("login" , ""));
        name2.setText(String.valueOf(user.getName()));
        password2.setText(String.valueOf(user.getPassword()));

        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("clicked", "onCreate: ");
                login_editor.putString("login" , "");
                login_editor.putString("password" , "");
                login_editor.putBoolean("isLoggedin" , true);
                login_editor.commit();
                Toast.makeText(getActivity(), "Logout successfully" , Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(getActivity() , MainActivity.class);
                startActivity(intent);
            }
        });

        update_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                db.userDao().updateUser(name2.getText().toString(), password2.getText().toString(), user.getId());
                login_editor.putString("login", name2.getText().toString());
                login_editor.putString("password", password2.getText().toString());
                login_editor.apply();
                Toast.makeText(getActivity(), "Updated Succefully", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}