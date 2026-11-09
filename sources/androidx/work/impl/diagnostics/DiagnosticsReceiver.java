package androidx.work.impl.diagnostics;

import V0.C;
import V0.G;
import V0.U;
import V0.r;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.impl.n;
import androidx.work.impl.s;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.List;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({c.f39801b})
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18541a = C.d("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        C.c().getClass();
        try {
            U t = U.f9904a.getInstance(context);
            G request = G.f9871e.from(DiagnosticsWorker.class);
            t.getClass();
            Intrinsics.checkNotNullParameter(request, "request");
            List listC = C1849p.c(request);
            s sVar = (s) t;
            if (listC.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new n(sVar, null, r.f9965b, listC).E();
        } catch (IllegalStateException e10) {
            C.c().b(f18541a, "WorkManager is not initialized", e10);
        }
    }
}
