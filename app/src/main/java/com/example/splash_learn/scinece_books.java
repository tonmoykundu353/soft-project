package com.example.splash_learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class scinece_books extends AppCompatActivity {

    ListView listView;
    TextView textView;

    public static ArrayList<String> books = new ArrayList<>();
    public static ArrayList<String> writers = new ArrayList<>();

    public static int indx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scinece_books);

        listView = findViewById(R.id.list);
        textView = findViewById(R.id.hsc_book);

        textView.setText("Science Books");

        books.clear();
        writers.clear();

        extract();
    }

    public void extract() {
        String url = "https://api.myjson.online/v1/records/772630db-6262-467a-8570-9f38d35d1d60";
        StringRequest strReq = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        parseJson(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // Handle error
            }
        });
        SingletonRequestQueue.getInstance(this).addToRequestQueue(strReq);
    }

    private void parseJson(String response) {
        try {
            JSONObject jsonObject = new JSONObject(response);
            JSONArray jsonArray = jsonObject.getJSONArray("data");

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                books.add(jsonObject1.getString("name"));
                writers.add(jsonObject1.getString("writer"));
            }

            BookAdapter adapter = new BookAdapter(this, books);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    indx = position;
                    startActivity(new Intent(scinece_books.this, show_writers.class));
                }
            });

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}