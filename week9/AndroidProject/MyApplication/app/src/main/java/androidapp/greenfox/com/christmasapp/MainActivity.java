package androidapp.greenfox.com.christmasapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import okhttp3.ResponseBody;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button sendButton;
    ListView listView;
    MessagesAdapter msgAdapter;
    ArrayList<Message> messageList;
    EditText textField;
    MsgService service;
    Retrofit retrofit;


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


        retrofit = new Retrofit.Builder()
                .baseUrl("http://zerda-raptor.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        service = retrofit.create(MsgService.class);



        service.postMessages(new MsgWrapper()).enqueue(new MsgCallback<ResponseBody>() {
            @Override
            public void onResponse(Response<ResponseBody> response) {
                if (response.code() == 200) {
                    // itt csinálhatunk valamit, mert tudjuk, hogy sikeresen elküldtük a szervernek az adatokat
                    // pl frissíthetjük az üzeneteink listáját (új lekérés a szervertől)
                }
            }

            @Override
            public void onFailure(Throwable t) {
                // itt valami elbaszarintódott, logoljuk ki, adjunk hibaüzenetet, valami.
            }
        });





//        service.postMessages(new MsgWrapper() {
//            @Override
//            public <T> T unwrap(Class<T> iface) throws SQLException {
//                return null;
//            }
//
//            @Override
//            public boolean isWrapperFor(Class<?> iface) throws SQLException {
//                return false;
//            }
//        }).enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//            }
//            @Override
//            public void onResponse(Response<ResponseBody> response) {
//                if (response.code() == 200) {
//                    // itt csinálhatunk valamit, mert tudjuk, hogy sikeresen elküldtük a szervernek az adatokat
//                    // pl frissíthetjük az üzeneteink listáját (új lekérés a szervertől)
//                }
//            }
//
//
//            });
    }






    @Override
    public void onClick(View v) {
        if (v == sendButton){
            msgAdapter.add(new Message("Anna", textField.toString()));
        }
    }

}