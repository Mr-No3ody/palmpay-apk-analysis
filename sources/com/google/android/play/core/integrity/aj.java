package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class aj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    final com.google.android.play.integrity.internal.ae f22628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f22629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final at f22631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f22632e;

    public aj(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) {
        this.f22630c = context.getPackageName();
        this.f22629b = sVar;
        this.f22631d = atVar;
        this.f22632e = kVar;
        if (com.google.android.play.integrity.internal.ai.b(context)) {
            this.f22628a = new com.google.android.play.integrity.internal.ae(context, sVar, "IntegrityService", ak.f22633a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.ae
                @Override // com.google.android.play.integrity.internal.z
                public final Object a(IBinder iBinder) {
                    return com.google.android.play.integrity.internal.m.b(iBinder);
                }
            }, null);
        } else {
            sVar.b("Phonesky is not installed.", new Object[0]);
            this.f22628a = null;
        }
    }

    public static /* bridge */ /* synthetic */ Bundle a(aj ajVar, byte[] bArr, Long l5, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f22630c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l5 != null) {
            bundle.putLong("cloud.prj", l5.longValue());
        }
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    @VisibleForTesting
    public final Task b(Activity activity, Bundle bundle) {
        if (this.f22628a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i7 = bundle.getInt("dialog.intent.type");
        this.f22629b.d("requestAndShowDialog(%s, %s)", this.f22630c, Integer.valueOf(i7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22628a.t(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i7), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f22628a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f22629b.d("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f22628a.t(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e10) {
            return Tasks.forException(new IntegrityServiceException(-13, e10));
        }
    }
}
