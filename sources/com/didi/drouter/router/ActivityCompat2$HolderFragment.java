package com.didi.drouter.router;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ActivityCompat2$HolderFragment extends Fragment implements ActivityCompat2$Active {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f21123a = new a(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f21124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21125c;

    @Override // com.didi.drouter.router.ActivityCompat2$Active
    public final void attach(Activity activity, Intent intent, int i7) {
        this.f21124b = intent;
        this.f21125c = i7;
        FragmentTransaction fragmentTransactionBeginTransaction = activity.getFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.add(this, "DRouterEmptyFragment");
        fragmentTransactionBeginTransaction.commit();
    }

    @Override // com.didi.drouter.router.ActivityCompat2$Active
    public final a getCompat() {
        return this.f21123a;
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        a.a(this.f21123a, getActivity(), i10, intent);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.didi.drouter.router.ActivityCompat2$Active, java.lang.Object] */
    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = this.f21123a;
        if (bundle != null) {
            aVar.getClass();
            aVar.f21132a = bundle.getInt("router_cb_tag");
        }
        aVar.f21133b.startActivity();
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AtomicInteger atomicInteger = a.f21130c;
        this.f21123a.getClass();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("router_cb_tag", this.f21123a.f21132a);
    }

    @Override // com.didi.drouter.router.ActivityCompat2$Active
    public final void remove() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
            fragmentTransactionBeginTransaction.remove(this);
            fragmentTransactionBeginTransaction.commit();
        }
    }

    @Override // com.didi.drouter.router.ActivityCompat2$Active
    public final void startActivity() {
        Intent intent = this.f21124b;
        if (intent == null) {
            return;
        }
        startActivityForResult(intent, this.f21125c, intent.getBundleExtra("router_start_activity_options"));
    }
}
