package com.google.firebase.perf.injection.modules;

import com.google.android.datatransport.TransportFactory;
import com.google.firebase.inject.Provider;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import p264r5.a;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory implements Factory<Provider<TransportFactory>> {
    private final FirebasePerformanceModule module;

    private FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesTransportFactoryProviderFactory(firebasePerformanceModule);
    }

    public static Provider<TransportFactory> providesTransportFactoryProvider(FirebasePerformanceModule firebasePerformanceModule) {
        Provider<TransportFactory> providerProvidesTransportFactoryProvider = firebasePerformanceModule.providesTransportFactoryProvider();
        a.f(providerProvidesTransportFactoryProvider);
        return providerProvidesTransportFactoryProvider;
    }

    @Override // javax.inject.Provider
    public Provider<TransportFactory> get() {
        return providesTransportFactoryProvider(this.module);
    }
}
