package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.IntentSenderRequest;
import androidx.core.app.AbstractC1032a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.activity.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0820k extends androidx.activity.result.h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.E f12036h;

    public C0820k(androidx.fragment.app.E e10) {
        this.f12036h = e10;
    }

    @Override // androidx.activity.result.h
    public final void b(int i7, p177m.b contract, Object obj) {
        Bundle bundleExtra;
        int i10;
        Intrinsics.checkNotNullParameter(contract, "contract");
        androidx.fragment.app.E e10 = this.f12036h;
        p177m.a synchronousResult = contract.getSynchronousResult(e10, obj);
        if (synchronousResult != null) {
            new Handler(Looper.getMainLooper()).post(new H0.a(this, i7, synchronousResult, 4));
            return;
        }
        Intent intentCreateIntent = contract.createIntent(e10, obj);
        if (intentCreateIntent.getExtras() != null) {
            Bundle extras = intentCreateIntent.getExtras();
            Intrinsics.e(extras);
            if (extras.getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(e10.getClassLoader());
            }
        }
        if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentCreateIntent.getAction())) {
            String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC1032a.g(e10, stringArrayExtra, i7);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentCreateIntent.getAction())) {
            e10.startActivityForResult(intentCreateIntent, i7, bundle);
            return;
        }
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            Intrinsics.e(intentSenderRequest);
            i10 = i7;
            try {
                e10.startIntentSenderForResult(intentSenderRequest.f12044a, i10, intentSenderRequest.f12045b, intentSenderRequest.f12046c, intentSenderRequest.f12047d, 0, bundle);
            } catch (IntentSender.SendIntentException e11) {
                e = e11;
                new Handler(Looper.getMainLooper()).post(new H0.a(this, i10, e, 5));
            }
        } catch (IntentSender.SendIntentException e12) {
            e = e12;
            i10 = i7;
        }
    }
}
