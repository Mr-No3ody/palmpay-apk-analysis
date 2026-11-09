package androidx.work;

import V0.AbstractC0703w;
import V0.B;
import V0.C0690i;
import V0.C0691j;
import V0.C0692k;
import Wf.AbstractC0780y;
import Wf.C0757c0;
import android.content.Context;
import androidx.concurrent.futures.m;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "LV0/B;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "V0/i", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CoroutineWorker extends B {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkerParameters f18341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0690i f18342f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f18341e = params;
        this.f18342f = C0690i.f9949c;
    }

    @Override // V0.B
    public final m a() {
        C0757c0 c0757c0B = AbstractC0780y.b();
        C0690i c0690i = this.f18342f;
        c0690i.getClass();
        return AbstractC0703w.b(e.c(c0690i, c0757c0B), new C0691j(this, null));
    }

    @Override // V0.B
    public final m b() {
        C0690i c0690i = C0690i.f9949c;
        CoroutineContext.Element element = this.f18342f;
        if (Intrinsics.c(element, c0690i)) {
            element = this.f18341e.f18348d;
        }
        Intrinsics.checkNotNullExpressionValue(element, "if (coroutineContext != …rkerContext\n            }");
        C0757c0 c0757c0B = AbstractC0780y.b();
        element.getClass();
        return AbstractC0703w.b(e.c(element, c0757c0B), new C0692k(this, null));
    }

    public abstract Object c(C0692k c0692k);
}
