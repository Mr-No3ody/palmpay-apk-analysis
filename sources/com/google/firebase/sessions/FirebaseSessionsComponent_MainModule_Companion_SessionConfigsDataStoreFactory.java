package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Preconditions;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;
import com.google.firebase.sessions.settings.SessionConfigs;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.annotations.concurrent.Blocking"})
@DaggerGenerated
public final class FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory implements Factory<DataStore<SessionConfigs>> {
    private final Provider<Context> appContextProvider;
    private final Provider<CoroutineContext> blockingDispatcherProvider;

    private FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        this.appContextProvider = provider;
        this.blockingDispatcherProvider = provider2;
    }

    public static FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory create(Provider<Context> provider, Provider<CoroutineContext> provider2) {
        return new FirebaseSessionsComponent_MainModule_Companion_SessionConfigsDataStoreFactory(provider, provider2);
    }

    public static DataStore<SessionConfigs> sessionConfigsDataStore(Context context, CoroutineContext coroutineContext) {
        return (DataStore) Preconditions.checkNotNullFromProvides(FirebaseSessionsComponent.MainModule.INSTANCE.sessionConfigsDataStore(context, coroutineContext));
    }

    @Override // javax.inject.Provider
    public DataStore<SessionConfigs> get() {
        return sessionConfigsDataStore(this.appContextProvider.get(), this.blockingDispatcherProvider.get());
    }
}
