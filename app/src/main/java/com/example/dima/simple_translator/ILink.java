package com.example.dima.simple_translator;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ILink {
    @FormUrlEncoded
    //ссылка на путь отправленного запроса
    @POST("/api/v1.5/tr.json/translate")
    //запрос
    Call<Object> translate(@FieldMap Map<String, String> map);
}
