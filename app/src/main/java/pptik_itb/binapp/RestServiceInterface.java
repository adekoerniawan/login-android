package pptik_itb.binapp;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import java.util.List;

public interface RestServiceInterface {
    @POST("users/signin")
    Call<LoginPojo> userLogin(@Field("field") String field, @Field("force") Boolean force,
                              @Field("password") String password, @Field("app_id") Integer app_id);
}
