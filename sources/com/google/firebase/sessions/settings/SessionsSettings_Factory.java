package com.google.firebase.sessions.settings;

import com.google.firebase.sessions.dagger.internal.DaggerGenerated;
import com.google.firebase.sessions.dagger.internal.Factory;
import com.google.firebase.sessions.dagger.internal.Provider;
import com.google.firebase.sessions.dagger.internal.QualifierMetadata;
import com.google.firebase.sessions.dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: classes2.dex */
@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata({"com.google.firebase.sessions.LocalOverrideSettingsProvider", "com.google.firebase.sessions.RemoteSettingsProvider"})
@DaggerGenerated
public final class SessionsSettings_Factory implements Factory<SessionsSettings> {
    private final Provider<SettingsProvider> localOverrideSettingsProvider;
    private final Provider<SettingsProvider> remoteSettingsProvider;

    private SessionsSettings_Factory(Provider<SettingsProvider> provider, Provider<SettingsProvider> provider2) {
        this.localOverrideSettingsProvider = provider;
        this.remoteSettingsProvider = provider2;
    }

    public static SessionsSettings_Factory create(Provider<SettingsProvider> provider, Provider<SettingsProvider> provider2) {
        return new SessionsSettings_Factory(provider, provider2);
    }

    public static SessionsSettings newInstance(SettingsProvider settingsProvider, SettingsProvider settingsProvider2) {
        return new SessionsSettings(settingsProvider, settingsProvider2);
    }

    @Override // javax.inject.Provider
    public SessionsSettings get() {
        return newInstance(this.localOverrideSettingsProvider.get(), this.remoteSettingsProvider.get());
    }
}
