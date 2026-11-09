package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class bn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    final com.google.android.play.integrity.internal.ae f22691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.play.integrity.internal.s f22692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f22693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TaskCompletionSource f22694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final at f22695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final k f22696f;

    public bn(Context context, com.google.android.play.integrity.internal.s sVar, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22694d = taskCompletionSource;
        this.f22693c = context.getPackageName();
        this.f22692b = sVar;
        this.f22695e = atVar;
        this.f22696f = kVar;
        com.google.android.play.integrity.internal.ae aeVar = new com.google.android.play.integrity.internal.ae(context, sVar, "ExpressIntegrityService", bo.f22697a, new com.google.android.play.integrity.internal.z() { // from class: com.google.android.play.core.integrity.bd
            @Override // com.google.android.play.integrity.internal.z
            public final Object a(IBinder iBinder) {
                return com.google.android.play.integrity.internal.h.b(iBinder);
            }
        }, null);
        this.f22691a = aeVar;
        aeVar.c().post(new be(this, taskCompletionSource, context));
    }

    public static /* bridge */ /* synthetic */ Bundle a(bn bnVar, String str, long j6, long j10, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f22693c);
        bundle.putLong("cloud.prj", j6);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(5, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle b(bn bnVar, long j6, int i7) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f22693c);
        bundle.putLong("cloud.prj", j6);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        com.google.android.play.integrity.internal.d.b(4, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(com.google.android.play.integrity.internal.d.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        return bnVar.f22694d.getTask().isSuccessful() && ((Integer) bnVar.f22694d.getTask().getResult()).intValue() == 0;
    }

    @VisibleForTesting
    public final Task c(Activity activity, Bundle bundle) {
        int i7 = bundle.getInt("dialog.intent.type");
        this.f22692b.d("requestAndShowDialog(%s)", Integer.valueOf(i7));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22691a.t(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i7), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(@Nullable String str, long j6, long j10, int i7) {
        this.f22692b.d("requestExpressIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22691a.t(new bg(this, taskCompletionSource, 0, str, j6, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j6, int i7) {
        this.f22692b.d("warmUpIntegrityToken(%s)", Long.valueOf(j6));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f22691a.t(new bf(this, taskCompletionSource, 0, j6, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
