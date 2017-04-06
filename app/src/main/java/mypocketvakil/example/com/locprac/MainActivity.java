package mypocketvakil.example.com.locprac;

import android.location.Location;
import android.os.Bundle;
import android.widget.TextView;

import com.github.akashandroid90.googlesupport.location.AppLocationActivity;

public class MainActivity extends AppLocationActivity {
    private TextView current_location,new_location;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        current_location=(TextView)findViewById(R.id.current_location);
        new_location=(TextView)findViewById(R.id.new_location);

    }

    @Override
    public void newLocation(Location location) {init
        super.newLocation(location);
        new_location.setText(location.getLatitude()+","+location.getLongitude());

    }

    @Override
    public void myCurrentLocation(Location currentLocation) {
        super.myCurrentLocation(currentLocation);
        current_location.setText(currentLocation.getLatitude()+","+currentLocation.getLongitude());
    }
}
