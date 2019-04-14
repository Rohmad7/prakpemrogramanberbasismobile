package rohmartriwibowo7.gmail.com;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        // inisiasi button register
        Button button = findViewById(R.id.bt_register);
        // menambahkan event onClick pada button register
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // mengarahkan kehalaman login
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            }
        });
    }
}
