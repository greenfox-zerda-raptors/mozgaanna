package androidapp.greenfox.com.christmasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button sendButton;
    ListView listView;
    ArrayList<Message> messageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sendButton = (Button) findViewById(R.id.sendButton);
        sendButton.setOnClickListener(MainActivity.this);

        messageList = new ArrayList<>();
        listView = (ListView) findViewById(R.id.listViewID);


    }

    @Override
    public void onClick(View v) {

    }
}
