package com.example.merabox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Desi extends AppCompatActivity {

    ListView listView;
    //DATA START
    static int count = 8 ;
    public String names[] = {"Sharif Bacche Is Post se Dur Rahe!!!😤","I need the Link ASAP!!!😭","Don't Judge a book by its Cover😎","Ohh God!! Bas ek baar dilade!!!🥺","Yaar Kitni Awesome Hein yaar!!!😋","Aise Video call Karne wali chaiye😋","Kya Dekh raha hein Lavde🐯","Tradition is Love 💖"};
    public String links[] = {"https://teraboxapp.com/s/1IO1fc3bMmjaQ3AYklyfttw",
            "https://teraboxapp.com/s/1D5bU9m12gN_dAkIxrvYJ-A",
            "https://teraboxapp.com/s/1i11b4Qgr9-ZvITXIu4IhFg",
    "https://teraboxapp.com/s/1Eg_heZeqFFnluMfLB-qRtw",
    "https://teraboxapp.com/s/1wwg1SsZZb6cAR96qza8QPg",
    "https://teraboxapp.com/s/12vPAPU0b_W-43RSyf6fnNg",
    "https://teraboxapp.com/s/1CPmZKRyReq1Fz9ajfDsumg",
    "https://teraboxapp.com/s/1zGmGwDUA1ofcN68JhXcsaw"};
    public int images[]
            ={R.drawable.img,R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6,R.drawable.img_7};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desi);
        //LISTVIEW START
        listView = findViewById(R.id.desilinks);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(Desi.this,names , images);
        listView.setAdapter(customBaseAdapter);
        listView.setClickable(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(links[position]));
                startActivity(intent);

            }
        });
    }
}