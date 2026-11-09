package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentRegistrar f22903b;

    public /* synthetic */ c(ComponentRegistrar componentRegistrar, int i7) {
        this.f22902a = i7;
        this.f22903b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f22902a) {
            case 0:
                return ComponentRuntime.lambda$toProviders$1(this.f22903b);
            default:
                return ComponentRuntime.Builder.lambda$addComponentRegistrar$0(this.f22903b);
        }
    }
}
