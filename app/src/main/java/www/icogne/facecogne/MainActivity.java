package www.icogne.facecogne;

import androidx.appcompat.app.AppCompatActivity;

import com.acesso.acessobio_android.AcessoBioListener;
import com.acesso.acessobio_android.onboarding.AcessoBio;
import com.acesso.acessobio_android.onboarding.IAcessoBioBuilder;
import com.acesso.acessobio_android.services.dto.ErrorBio;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private IAcessoBioBuilder acessoBioBuilder = new AcessoBio(this, new AcessoBioListener() {
        @Override
        public void onErrorAcessoBio(ErrorBio errorBio) { }

        @Override
        public void onUserClosedCameraManually() { }

        @Override
        public void onSystemClosedCameraTimeoutSession() { }

        @Override
        public void onSystemChangedTypeCameraTimeoutFaceInference() { }
    });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}