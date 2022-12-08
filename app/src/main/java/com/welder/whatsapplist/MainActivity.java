package com.welder.whatsapplist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.welder.whatsapplist.Adapter.AdapterUsers;
import com.welder.whatsapplist.Model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler_users;
    private List<Usuario> usuarioList = new ArrayList<>();
    private RecyclerView.Adapter AdapterUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                recycler_users =findViewById(R.id.recycle_users);

                recycler_users.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
                recycler_users.setHasFixedSize(true);
                AdapterUsers adapterUsers = new AdapterUsers(usuarioList);
                recycler_users.setAdapter(adapterUsers);

                Usuarios();

    }

    public void Usuarios(){
        Usuario usuario1 = new Usuario(R.drawable.usuario1, "Neymar", "Vamos tomar uma?");
        usuarioList.add(usuario1);

        Usuario usuario2 = new Usuario(R.drawable.usuario2, "Bruna", "Vamos tomar uma?");
        usuarioList.add(usuario2);

        Usuario usuario3 = new Usuario(R.drawable.usuario3, "Militao", "Vamos tomar uma?");
        usuarioList.add(usuario3);

        Usuario usuario4 = new Usuario(R.drawable.usuario4, "Karoline Lima", "Vamos tomar uma?");
        usuarioList.add(usuario4);



    }


}