import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Button;
import android.view.View;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button randomizeButton;
    int[] imageArray = {R.drawable.image1, R.drawable.image2, R.drawable.image3}; // Add your image resources here

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView); // Make sure to have an ImageView in your layout with the id "imageView"
        randomizeButton = findViewById(R.id.randomizeButton); // Get the reference to the randomize button
        
        randomizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement logic to show a random image
                Random random = new Random();
                int randomIndex = random.nextInt(imageArray.length);
                imageView.setImageResource(imageArray[randomIndex]);
            }
        });
    }
}
