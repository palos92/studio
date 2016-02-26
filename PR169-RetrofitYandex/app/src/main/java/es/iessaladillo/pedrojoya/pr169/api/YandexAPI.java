package es.iessaladillo.pedrojoya.pr169.api;

import es.iessaladillo.pedrojoya.pr169.models.TranslateResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

// Interfaz para Retrofit de acceso a la API de Yandex.
public interface YandexAPI {

    @GET("translate")
    Call<TranslateResponse> getTranslation(
            @Query(Constants.PARAM_TEXT) String text,
            @Query(Constants.PARAM_LANG) String lang);

}
