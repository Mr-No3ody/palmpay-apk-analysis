package com.google.firebase.perf.injection.modules;

import com.google.firebase.FirebaseApp;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import p264r5.a;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class FirebasePerformanceModule_ProvidesFirebaseAppFactory implements Factory<FirebaseApp> {
    private final FirebasePerformanceModule module;

    private FirebasePerformanceModule_ProvidesFirebaseAppFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesFirebaseAppFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesFirebaseAppFactory(firebasePerformanceModule);
    }

    public static FirebaseApp providesFirebaseApp(FirebasePerformanceModule firebasePerformanceModule) {
        FirebaseApp firebaseAppProvidesFirebaseApp = firebasePerformanceModule.providesFirebaseApp();
        a.f(firebaseAppProvidesFirebaseApp);
        return firebaseAppProvidesFirebaseApp;
    }

    @Override // javax.inject.Provider
    public FirebaseApp get() {
        return providesFirebaseApp(this.module);
    }
}
