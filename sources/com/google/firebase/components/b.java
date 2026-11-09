package com.google.firebase.components;

import com.google.firebase.FirebaseApp;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22901b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f22900a = i7;
        this.f22901b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f22900a) {
            case 0:
                return ComponentDiscovery.instantiate((String) this.f22901b);
            default:
                return FirebaseInstallations.lambda$new$0((FirebaseApp) this.f22901b);
        }
    }
}
