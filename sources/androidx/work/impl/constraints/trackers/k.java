package androidx.work.impl.constraints.trackers;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f18525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f18526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f18527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f18528e;

    public k(Context context, androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context.applicationContext");
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        a batteryChargingTracker = new a(context2, taskExecutor, 0);
        Context context3 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context.applicationContext");
        Intrinsics.checkNotNullParameter(context3, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        a batteryNotLowTracker = new a(context3, taskExecutor, 1);
        Context context4 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context.applicationContext");
        String str = i.f18522a;
        Intrinsics.checkNotNullParameter(context4, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        h networkStateTracker = new h(context4, taskExecutor);
        Context context5 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context.applicationContext");
        Intrinsics.checkNotNullParameter(context5, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        a storageNotLowTracker = new a(context5, taskExecutor, 2);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(batteryChargingTracker, "batteryChargingTracker");
        Intrinsics.checkNotNullParameter(batteryNotLowTracker, "batteryNotLowTracker");
        Intrinsics.checkNotNullParameter(networkStateTracker, "networkStateTracker");
        Intrinsics.checkNotNullParameter(storageNotLowTracker, "storageNotLowTracker");
        this.f18524a = context;
        this.f18525b = batteryChargingTracker;
        this.f18526c = batteryNotLowTracker;
        this.f18527d = networkStateTracker;
        this.f18528e = storageNotLowTracker;
    }
}
