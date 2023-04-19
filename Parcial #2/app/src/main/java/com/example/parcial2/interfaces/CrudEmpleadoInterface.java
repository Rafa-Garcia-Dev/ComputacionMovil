package com.example.parcial2.interfaces;
import com.example.parcial2.model.Empleado;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface CrudEmpleadoInterface {
    @GET("consultarAll")
    Call<List<Empleado>> getAll();
    @POST("guardar")
    Call<Empleado> create(Empleado empleado);

    @POST("actualizar/{id}")
    Call<Empleado> update(Empleado empleado, int id);

    @POST("user/{id}")
    Call<Empleado> delete (int id);
}
