package com.example.belajarandroid.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Model> main_list;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_list=new ArrayList<>();
        recyclerView=findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        main_list.add(new Model(R.drawable.a,
                "Daratan",
                "Tarian yang menggunakan keris untuk ditusukkan pada bagian dada atau perut penari. Tarian ini dikenal dengan istilah tari Daratan. Tarian ini sering dilakukan oleh sebagian besar masyarakat kabupaten Karangasem Khususnya Desa Adat Karangsari. "));
        main_list.add(new Model(R.mipmap.bantentengolong,
                "Banten Tengolong",
                "Banten Tengolong ini dipersembahkan sebagai sesangi (kaul) seseorang, tujuannya untuk menepati janji seseorang apabila keinginannya sudah tercapai. Banten Tengolong dibuat dari bambu yang didalamnya tersusun jajan dodol dan jajan uli serta buah-buahan, beberapa olahan daging babi seperti sate, urutan, dan lain-lain sehingga untuk mengangkat banten ini harus diarak beramai-ramai. Banten tengolong ini biasanya dijumpai pada Usaba Dodol di Pura Dalem Desa Adat Karangsari."));
        main_list.add(new Model(R.drawable.c,
                "Babuang",
                "Rejang lanang atau Tari Babuang termasuk tari sakral sebagai lambang dewa Brahma (Ba), Dewi Pertiwi (Bu) tanah dan Wisnu (Ang) (babuang). Pementasan Tari Babuang dilakukan pada saat hari Ngusaba di Desa Adat Karangsari, datangnya setiap tahun sekali di Pura Puseh. Rangkaian upacara Ngusaba ini tidak bisa dipisahkan dengan tari Babuang dan upacara tidak sempurna jika tidak dipentaskan tari Babuang, bahkan upacara dikatakan tidak berhasil. "));
        main_list.add(new Model(R.drawable.dangsil,
                "Dangsil",
                "Dangsil adalah sarana upacara yang dibuat oleh masyarakat Desa Adat Karangsari untuk dipersembahkan kepada  Ida Sang Hyang Widhi Wasa. Dangsil dibentuk menyerupai segitiga dari anyaman bambu yang berisi jaje goreng ( jajan goreng ) yang dipasang pada dangsil. Tidak hanya jaje goreng tetapi juga berisi beberapa buah-buahan yang digantung di bawah jaje goreng dan bunga yang dipasang pada badan dangsil setelah itu didirikan di dalam Pura. "));
        main_list.add(new Model(R.drawable.rejang,
                "Rejang",
                "Sama seperti desa lainnya di Karangasem, Desa Adat Karangsari juga memiliki Rejang. Penari Rejang ini adalah anak perempuan yang belum mengalami menstruasi. Rejang Desa Adat Karangsari memiliki ciri khas dari Rejang desa lainnya di Kabupaten Karangasem, yaitu memakai gelung (penutup kepala) yang besar dan dihiasi oleh banyak bunga gumitir serta paling atas berisi bunga jepun. Tarian Rejang ini bisa dijumpai dalam acara Ngusaba dan Hari Raya Kuningan. Penari Rejang akan mengitari Pura dengan diiringi oleh gamelan dan menarik perhatian  pengunjung."));
        main_list.add(new Model(R.drawable.sambah,
                "Sambah atau Ayunan",
                "Sambah merupakan ayunan besar yang dipergunakan untuk meletakan Pratima dan gelung Penari Rejang setelah selesai menari lalu ayunan diputar beberapa kali. Sambah ini dapat dijumpai setiap Ngusaba Sambah di Pura Puseh Desa Adat Karangsari."));
        adapter=new CustomAdapter(getApplicationContext(),main_list);
        recyclerView.setAdapter(adapter);
    }
}
