package edu.scu.coen268.lecture17;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // We'll be creating an image that is 100 pixels wide and 200 pixels tall.
        int width = 100;
        int height = 200;

        // Create a bitmap with the dimensions we defined above, and with a 16-bit pixel format.
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);

        // Create a paint object for us to draw with, and set our drawing color to blue.
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);

        // Create a new canvas to draw on, and link it to the bitmap that we created above. Any drawing
        // operations performed on the canvas will have an immediate effect on the pixel data of the
        // bitmap.
        Canvas canvas = new Canvas(bitmap);

        // Fill the entire canvas with a red color.
        canvas.drawColor(Color.RED);

        // Draw a rectangle inside our image using the paint object we defined above. The rectangle's
        // upper left corner will be at (25,50), and the lower right corner will be at (75,150). Since we set
        // the paint object's color above, this rectangle will be blue.
        canvas.drawRect(25, 50, 75, 150, paint);

        // In order to display this image in our activity, we need to create a new ImageView that we
        // can display.
        ImageView imageView = new ImageView(this);

        // Set this ImageView's bitmap to the one we have drawn to.
        imageView.setImageBitmap(bitmap);

        // Center the image and do not scale it.
        imageView.setScaleType(ImageView.ScaleType.CENTER);

        setContentView(imageView);
    }

}
