package com.example.android;

import com.google.firebase.appcheck.FirebaseAppCheck;
import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends FlutterActivity {
    FirebaseApp.initializeApp(/*context=*/ this);
    FirebaseAppCheck firebaseAppCheck = FirebaseAppCheck.getInstance();
firebaseAppCheck.installAppCheckProviderFactory(
        DebugAppCheckProviderFactory.getInstance());
}
