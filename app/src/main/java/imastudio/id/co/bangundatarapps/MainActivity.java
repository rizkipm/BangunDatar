package imastudio.id.co.bangundatarapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //deklarasi widget button

    Button btnPersegi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memanggil id button
        btnPersegi = (Button)findViewById(R.id.btnPersegi);
        //agar button btnPersegi bisa di klik
        btnPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //menambahkan intent agar pindah halaman ke activity lain
                Intent a1 = new Intent(getApplicationContext(), PersegiActivity.class);
                //agar bisa pindah activity maka kita harus nambahin startActivity
                startActivity(a1);
            }
        });
    }
}
