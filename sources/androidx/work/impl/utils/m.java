package androidx.work.impl.utils;

import C0.G;
import V0.C;
import android.content.Context;
import android.os.PowerManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f18709a = 0;

    static {
        Intrinsics.checkNotNullExpressionValue(C.d("WakeLocks"), "tagWithPrefix(\"WakeLocks\")");
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strO = G.o("WorkManager: ", tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, strO);
        synchronized (n.f18710a) {
        }
        Intrinsics.checkNotNullExpressionValue(wakeLock, "wakeLock");
        return wakeLock;
    }
}
