package androidx.work.impl.constraints.trackers;

import android.content.Context;
import androidx.camera.video.internal.encoder.o;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.work.impl.utils.taskexecutor.a f18512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f18513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f18515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18516e;

    public e(Context context, androidx.work.impl.utils.taskexecutor.a taskExecutor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.f18512a = taskExecutor;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f18513b = applicationContext;
        this.f18514c = new Object();
        this.f18515d = new LinkedHashSet();
    }

    public abstract Object a();

    public final void b(Object obj) {
        synchronized (this.f18514c) {
            Object obj2 = this.f18516e;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f18516e = obj;
                this.f18512a.f18730d.execute(new o(18, CollectionsKt.Y(this.f18515d), this));
                Unit unit = Unit.f38893a;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
