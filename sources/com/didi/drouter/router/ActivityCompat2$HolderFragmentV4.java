package com.didi.drouter.router;

import N8.q0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C1161a;
import androidx.fragment.app.E;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ActivityCompat2$HolderFragmentV4 extends Fragment implements ActivityCompat2$Active {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f21126a = new a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f21127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21128c;

    @Override // com.didi.drouter.router.ActivityCompat2$Active
    public final void attach(Activity activity, Intent intent, int i7) {
        this.f21127b = intent;
        this.f21128c = i7;
        Z supportFragmentManager = ((E) activity).getSupportFragmentManager();
        C1161a c1161aE = q0.e(supportFragmentManager, supportFragmentManager);
        c1161aE.d(0, this, "DRouterEmptyFragment", 1);
        c1161aE.h(false);
    }

    @Override // com.didi.drouter.router.ActivityCompat2$Active
    public final a getCompat() {
        return this.f21126a;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        a.a(this.f21126a, getActivity(), i10, intent);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.didi.drouter.router.ActivityCompat2$Active, java.lang.Object] */
    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = this.f21126a;
        if (bundle != null) {
            aVar.getClass();
            aVar.f21132a = bundle.getInt("router_cb_tag");
        }
        aVar.f21133b.startActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AtomicInteger atomicInteger = a.f21130c;
        this.f21126a.getClass();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("router_cb_tag", this.f21126a.f21132a);
    }

    @Override // com.didi.drouter.router.ActivityCompat2$Active
    public final void remove() {
        Z fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            C1161a c1161a = new C1161a(fragmentManager);
            c1161a.m(this);
            c1161a.h(false);
        }
    }

    @Override // com.didi.drouter.router.ActivityCompat2$Active
    public final void startActivity() {
        Intent intent = this.f21127b;
        if (intent == null) {
            return;
        }
        startActivityForResult(intent, this.f21128c, intent.getBundleExtra("router_start_activity_options"));
    }
}
