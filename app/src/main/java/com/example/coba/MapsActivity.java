 package com.example.coba;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng SPBU = new LatLng(-7.9232684, 112.5940613);
        mMap.addMarker(new MarkerOptions().position(SPBU).title("Marker in SPBU").snippet("Jl. Raya Tlogomas No.246, Tlogomas, Kec. Lowokwaru, Kota Malang, Jawa Timur 65144"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SPBU));

        LatLng Restaurant = new LatLng(-7.9432203, 112.5756175);
        mMap.addMarker(new MarkerOptions().position(Restaurant).title("Marker in Restaurant").snippet("WAROEN SS Jl. Raya Jetis, Jetis, Mulyoagung, Kec. Dau, Malang, Jawa Timur 65151"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Restaurant));

        LatLng KANTORPOLISI = new LatLng(-7.9457816, 112.608042);
        mMap.addMarker(new MarkerOptions().position(KANTORPOLISI).title("Marker in KANTOR POLISI").snippet("POLSEK LOWOKWARU Gang 13 Jl. MT. Haryono No.413, Dinoyo, Kec. Lowokwaru, Kota Malang, Jawa Timur 65144"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KANTORPOLISI));

        LatLng WISATA = new LatLng(-7.9153788, 112.5867202);
        mMap.addMarker(new MarkerOptions().position(WISATA).title("Marker in WISATA").snippet("SENGKALING WATERPARK Jl. Raya Mulyoagung No.188 Mulyoagung Dau Sengkaling Jetis, Jetis, Mulyoagung, Kec. Dau, Malang, Jawa Timur 65153"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(WISATA));

        LatLng SEKOLAH = new LatLng(-7.9210746, 112.5874628);
        mMap.addMarker(new MarkerOptions().position(SEKOLAH).title("Marker in SEKOLAH").snippet("SMP MUHAMMADIYAH 06 DAU No, Jl. Margo Basuki No.48, Jetis, Mulyoagung, Kec. Dau, Malang, Jawa Timur 65151"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SEKOLAH));

        LatLng PEMERINTAHAN = new LatLng(-7.9208934, 112.51961);
        mMap.addMarker(new MarkerOptions().position(PEMERINTAHAN).title("Marker in PEMERINTAHAN").snippet("KANTOR WALIKOTA MALANG Balaikota Malang, Jl. Tugu No.1, Kiduldalem, Kec. Klojen, Kota Malang, Jawa Timur 65119"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(PEMERINTAHAN));

        LatLng Manokwari = new LatLng(-0.8643669, 134.0040573);
        mMap.addMarker(new MarkerOptions().position(Manokwari).title("Marker in Manokwari"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Manokwari));
    }
}
