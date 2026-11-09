package com.google.firebase.sessions;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
public final class FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory implements Factory<ApplicationInfo> {
    private final Provider<FirebaseApp> firebaseAppProvider;

    private FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(Provider<FirebaseApp> provider) {
        this.firebaseAppProvider = provider;
    }

    public static ApplicationInfo applicationInfo(FirebaseApp firebaseApp) {
        return (ApplicationInfo) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.applicationInfo(firebaseApp));
    }

    public static FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory create(Provider<FirebaseApp> provider) {
        return new FirebaseSessionsComponent_MainModule_Companion_ApplicationInfoFactory(provider);
    }

    @Override // javax.inject.Provider
    public ApplicationInfo get() {
        return applicationInfo(this.firebaseAppProvider.get());
    }
}
