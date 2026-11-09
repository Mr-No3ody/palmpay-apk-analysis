package com.google.firebase.perf.injection.modules;

import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import p264r5.a;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory implements Factory<Provider<RemoteConfigComponent>> {
    private final FirebasePerformanceModule module;

    private FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesRemoteConfigComponentFactory(firebasePerformanceModule);
    }

    public static Provider<RemoteConfigComponent> providesRemoteConfigComponent(FirebasePerformanceModule firebasePerformanceModule) {
        Provider<RemoteConfigComponent> providerProvidesRemoteConfigComponent = firebasePerformanceModule.providesRemoteConfigComponent();
        a.f(providerProvidesRemoteConfigComponent);
        return providerProvidesRemoteConfigComponent;
    }

    @Override // javax.inject.Provider
    public Provider<RemoteConfigComponent> get() {
        return providesRemoteConfigComponent(this.module);
    }
}
