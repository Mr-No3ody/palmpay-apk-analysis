package com.google.firebase.perf.injection.modules;

import com.google.firebase.perf.config.ConfigResolver;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import p264r5.a;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class FirebasePerformanceModule_ProvidesConfigResolverFactory implements Factory<ConfigResolver> {
    private final FirebasePerformanceModule module;

    private FirebasePerformanceModule_ProvidesConfigResolverFactory(FirebasePerformanceModule firebasePerformanceModule) {
        this.module = firebasePerformanceModule;
    }

    public static FirebasePerformanceModule_ProvidesConfigResolverFactory create(FirebasePerformanceModule firebasePerformanceModule) {
        return new FirebasePerformanceModule_ProvidesConfigResolverFactory(firebasePerformanceModule);
    }

    public static ConfigResolver providesConfigResolver(FirebasePerformanceModule firebasePerformanceModule) {
        ConfigResolver configResolverProvidesConfigResolver = firebasePerformanceModule.providesConfigResolver();
        a.f(configResolverProvidesConfigResolver);
        return configResolverProvidesConfigResolver;
    }

    @Override // javax.inject.Provider
    public ConfigResolver get() {
        return providesConfigResolver(this.module);
    }
}
