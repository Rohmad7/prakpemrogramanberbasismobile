package rohmartriwibowo7.gmail.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // inisiasi button login
        Button button = findViewById(R.id.bt_login);
        final EditText name = findViewById(R.id.et_name);
        final EditText pass = findViewById(R.id.et_pass);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // menampilkan peringatan jika nama salah
                if (!name.getText().toString().equalsIgnoreCase("Rohmad")) {
                    Toast.makeText(MainActivity.this, "Username salah", Toast.LENGTH_SHORT).show();
                 // menampilkan peringatan jika password salah
                } else  if (!pass.getText().toString().equalsIgnoreCase("125410309")) {
                    Toast.makeText(MainActivity.this, "Password salah", Toast.LENGTH_SHORT).show();
                } else {
                // mengarahkan kehalaman home
                    startActivity(new Intent(MainActivity.this, HomeActivity.class));
                }
            }
        });
    }
}
