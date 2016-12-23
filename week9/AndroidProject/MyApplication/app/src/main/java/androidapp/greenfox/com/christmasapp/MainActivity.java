package androidapp.greenfox.com.christmasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button sendButton;
    ListView listView;
    MessagesAdapter msgAdapter;
    ArrayList<Message> messageList;
    EditText textField;
    MsgService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sendButton = (Button) findViewById(R.id.sendButton);
        sendButton.setOnClickListener(MainActivity.this);

        messageList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listViewID);

        messageList.add(new Message("Anna", "Go fuck yourself"));

        msgAdapter = new MessagesAdapter(this, messageList);
        listView.setAdapter(msgAdapter);

        textField = (EditText) findViewById(R.id.editText4);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://zerda-raptor.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        service = retrofit.create(MsgService.class);

    }






    @Override
    public void onClick(View v) {
        if (v == sendButton){
            msgAdapter.add(new Message("Anna", textField.toString()));
        }
    }
}
