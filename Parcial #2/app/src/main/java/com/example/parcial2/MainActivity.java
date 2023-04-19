package com.example.parcial2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.parcial2.interfaces.CrudEmpleadoInterface;
import com.example.parcial2.model.Empleado;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    List<Empleado> empleados;
    CrudEmpleadoInterface cruempleado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getAll();
        create();
        update();
        delete();
    }
    private void getAll(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.31.96.1:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        cruempleado = retrofit.create(CrudEmpleadoInterface.class);
        Call<List<Empleado>> call = cruempleado.getAll();
        call.enqueue(new Callback<List<Empleado>>() {
            @Override
            public void onResponse(Call<List<Empleado>> call, Response<List<Empleado>> response) {
                if(!response.isSuccessful()){
                    Log.e("response err: ", response.message());
                    return;
                }
                empleados = response.body();
                empleados.forEach(p -> Log.i("Empleados : ", p.toString()));
            }

            @Override
            public void onFailure(Call<List<Empleado>> call, Throwable t) {
               Log.e("Trow err: ",t.getMessage());
            }
        });
    }

    private void create (){
        Empleado empleadoprueba;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.31.96.1:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        cruempleado = retrofit.create(CrudEmpleadoInterface.class);
        Call<List<Empleado>> call = cruempleado.create(empleadoprueba);
        call.enqueue(new Callback<List<Empleado>>() {
            @Override
            public void onResponse(Call<List<Empleado>> call, Response<List<Empleado>> response) {
                if(!response.isSuccessful()){
                    Log.e("response err: ", response.message());
                    return;
                }
                empleados = response.body();
                empleados.forEach(p -> Log.i("Empleados : ", p.toString()));
            }

            @Override
            public void onFailure(Call<List<Empleado>> call, Throwable t) {
                Log.e("Trow err: ",t.getMessage());
            }
        });
    }

    private void update (){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.31.96.1:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        cruempleado = retrofit.create(CrudEmpleadoInterface.class);
        Call<List<Empleado>> call = cruempleado.update(empleadoprueba, empleadoprueba.id);
        call.enqueue(new Callback<List<Empleado>>() {
            @Override
            public void onResponse(Call<List<Empleado>> call, Response<List<Empleado>> response) {
                if(!response.isSuccessful()){
                    Log.e("response err: ", response.message());
                    return;
                }
                empleados = response.body();
                empleados.forEach(p -> Log.i("Empleados : ", p.toString()));
            }

            @Override
            public void onFailure(Call<List<Empleado>> call, Throwable t) {
                Log.e("Trow err: ",t.getMessage());
            }
        });
    }


    private void delete (){
        Empleado empleadoprueba;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.31.96.1:8080/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        cruempleado = retrofit.create(CrudEmpleadoInterface.class);
        Call<List<Empleado>> call = cruempleado.delete(int id=1);
        call.enqueue(new Callback<List<Empleado>>() {
            @Override
            public void onResponse(Call<List<Empleado>> call, Response<List<Empleado>> response) {
                if(!response.isSuccessful()){
                    Log.e("response err: ", response.message());
                    return;
                }
                empleados = response.body();
                empleados.forEach(p -> Log.i("Empleados : ", p.toString()));
            }

            @Override
            public void onFailure(Call<List<Empleado>> call, Throwable t) {
                Log.e("Trow err: ",t.getMessage());
            }
        });
    }


}

