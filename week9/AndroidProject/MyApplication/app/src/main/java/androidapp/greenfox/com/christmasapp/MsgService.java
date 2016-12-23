package androidapp.greenfox.com.christmasapp;



import java.util.ArrayList;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by mozgaanna on 23/12/16.
 */

public interface MsgService {
    @GET("/messages")
    Call<ArrayList<Message>> getMessages();
    @POST("/messages")
    Call<ResponseBody> postMessages(@Body Wrapper wrapper);

}



