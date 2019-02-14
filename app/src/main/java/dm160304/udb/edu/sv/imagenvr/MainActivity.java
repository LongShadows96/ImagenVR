package dm160304.udb.edu.sv.imagenvr;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    static ArrayList<Imagen> imagesArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imagesArrayList.add(new Imagen(1, "Image 1", R.drawable.img1));
        imagesArrayList.add(new Imagen(2, "Image 2", R.drawable.img2));
        imagesArrayList.add(new Imagen(3, "Image 3", R.drawable.img3));
        imagesArrayList.add(new Imagen(4, "Image 4", R.drawable.img4));
        imagesArrayList.add(new Imagen(5, "Image 5", R.drawable.img5));
        imagesArrayList.add(new Imagen(6, "Image 6", R.drawable.img6));
        imagesArrayList.add(new Imagen(7, "Image 7", R.drawable.img7));



        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter = new MyAdapter(imagesArrayList, getApplicationContext());
        mRecyclerView.setAdapter(adapter);

    }
}
