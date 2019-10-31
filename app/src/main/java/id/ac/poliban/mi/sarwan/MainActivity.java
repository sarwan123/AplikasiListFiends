package id.ac.poliban.mi.sarwan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> teman = new ArrayList<>();
    {
        teman.add("Ahmad Irfan");
        teman.add("Akhmad Indrawan");
        teman.add("Andre Ramadhandy");
        teman.add("Andri Sudarman");
        teman.add("Diana");
        teman.add("Gina Melati Addini");
        teman.add("Iffa Nafiatunnisa");
        teman.add("Lidya Lusiana");
        teman.add("Melisa Arianie");
        teman.add("Muhammad Ade Setiawan");
        teman.add("Purnama");
        teman.add("Radhika Rahmadani");
        teman.add("Rafii Hidayat Nor");
        teman.add("Renaldy Kambayu");
        teman.add("Sarwan");
        teman.add("Thasya Ismiyanti Novianda");
        teman.add("Yunita Rahmah");
        teman.add("Rezal Alfansyah");
        teman.add("Agustya Fazriani");
        teman.add("Ratu Hana Yunita");
        teman.add("M. Risky Maulana");
        teman.add("Radiansyah");
        teman.add("Taufan Ryanda Utama");
        teman.add("Magfirah Maulidya");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ubah judul di Action Bar
        if(getSupportActionBar()!=null)
            setTitle("Aplikasi List Teman");

        //daftarkan view untuk dimanipulasi
        ListView listView = findViewById(R.id.list_view);

        //buat adapter
        ArrayAdapter adapter = new ArrayAdapter(this,
                R.layout.item_rows_friends, R.id.tv_item_friends, teman);


        listView.setAdapter(adapter);



        //event handling (jangan lupa aktifkan java 1.8)
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, "anda mengklik " +
                    teman.get(position), Toast.LENGTH_SHORT).show();
        });

    }
}