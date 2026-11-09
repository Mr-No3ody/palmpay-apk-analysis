package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.RemoteConfigManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import p264r5.a;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory implements Factory<RemoteConfigManager> {
    private final FirebasePerformanceModule module;

    private FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesRemoteConfigManagerFactory(firebasePerformanceModule);
    }

    public static RemoteConfigManager providesRemoteConfigManager(FirebasePerformanceModule firebasePerformanceModule) {
        RemoteConfigManager remoteConfigManagerProvidesRemoteConfigManager = firebasePerformanceModule.providesRemoteConfigManager();
        a.f(remoteConfigManagerProvidesRemoteConfigManager);
        return remoteConfigManagerProvidesRemoteConfigManager;
    }

    @Override // javax.inject.Provider
    public RemoteConfigManager get() {
        return providesRemoteConfigManager(this.module);
    }
}
