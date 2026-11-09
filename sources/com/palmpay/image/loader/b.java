package com.palmpay.image.loader;

import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.palmpay.lib.bridgewrapper.photo.PhotoSaveBridge;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PhotoSaveBridge.AnonymousClass1 f23727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1205o f23728b;

    public final void a() {
        final c cVar = new c();
        AbstractC1205o abstractC1205o = this.f23728b;
        cVar.f23729a = abstractC1205o;
        if (abstractC1205o != null) {
            abstractC1205o.a(new LifecycleEventObserver() { // from class: com.palmpay.image.loader.ImageLoaderOptions$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, EnumC1203m enumC1203m) {
                    if (enumC1203m == EnumC1203m.ON_DESTROY) {
                        cVar.f23729a.b(this);
                    }
                }
            });
        }
    }
}
