package com.palmpay.lib.live;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC1193c;
import androidx.lifecycle.EnumC1203m;
import androidx.lifecycle.LifecycleOwner;
import java.lang.ref.WeakReference;
import p217o6.a;

/* JADX INFO: loaded from: classes3.dex */
public class BaseViewModel extends AbstractC1193c implements IViewModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f23812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f23813f;

    public BaseViewModel(@NonNull Application application) {
        super(application);
    }

    public final a d() {
        if (this.f23812e == null) {
            this.f23812e = new a();
        }
        return this.f23812e;
    }

    @Override // com.palmpay.lib.live.IViewModel
    public final void onAny(LifecycleOwner lifecycleOwner, EnumC1203m enumC1203m) {
    }

    @Override // com.palmpay.lib.live.IViewModel
    public final void onCreate(LifecycleOwner lifecycleOwner) {
    }

    @Override // com.palmpay.lib.live.IViewModel
    public final void onDestroy() {
    }

    @Override // com.palmpay.lib.live.IViewModel
    public final void onPause() {
    }

    @Override // com.palmpay.lib.live.IViewModel
    public final void onResume() {
    }

    @Override // com.palmpay.lib.live.IViewModel
    public final void onStart() {
    }

    @Override // com.palmpay.lib.live.IViewModel
    public final void onStop() {
    }
}
