package com.google.firebase.perf.injection.modules;

import com.google.firebase.installations.FirebaseInstallationsApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import p264r5.a;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory implements Factory<FirebaseInstallationsApi> {
    private final FirebasePerformanceModule module;

    private FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesFirebaseInstallationsFactory(firebasePerformanceModule);
    }

    public static FirebaseInstallationsApi providesFirebaseInstallations(FirebasePerformanceModule firebasePerformanceModule) {
        FirebaseInstallationsApi firebaseInstallationsApiProvidesFirebaseInstallations = firebasePerformanceModule.providesFirebaseInstallations();
        a.f(firebaseInstallationsApiProvidesFirebaseInstallations);
        return firebaseInstallationsApiProvidesFirebaseInstallations;
    }

    @Override // javax.inject.Provider
    public FirebaseInstallationsApi get() {
        return providesFirebaseInstallations(this.module);
    }
}
