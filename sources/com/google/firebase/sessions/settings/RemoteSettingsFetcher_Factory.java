package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Blocking"})
@DaggerGenerated
public final class RemoteSettingsFetcher_Factory implements Factory<RemoteSettingsFetcher> {
    private final Provider<ApplicationInfo> appInfoProvider;
    private final Provider<CoroutineContext> blockingDispatcherProvider;

    private RemoteSettingsFetcher_Factory(Provider<ApplicationInfo> provider, Provider<CoroutineContext> provider2) {
        this.appInfoProvider = provider;
        this.blockingDispatcherProvider = provider2;
    }

    public static RemoteSettingsFetcher_Factory create(Provider<ApplicationInfo> provider, Provider<CoroutineContext> provider2) {
        return new RemoteSettingsFetcher_Factory(provider, provider2);
    }

    public static RemoteSettingsFetcher newInstance(ApplicationInfo applicationInfo, CoroutineContext coroutineContext) {
        return new RemoteSettingsFetcher(applicationInfo, coroutineContext);
    }

    @Override // javax.inject.Provider
    public RemoteSettingsFetcher get() {
        return newInstance(this.appInfoProvider.get(), this.blockingDispatcherProvider.get());
    }
}
