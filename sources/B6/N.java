package B6;

import com.palmpay.lib.liveness.task.IDetectionTask;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class N {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f399k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.S f403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f409j;

    static {
        new E(null);
    }

    public N(CoroutineScope scope, ArrayList tasks) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f400a = scope;
        this.f401b = tasks;
        r6.a aVar = p232p6.p.f41237d;
        if (aVar != null) {
            Long l5 = aVar.f41583o;
        }
        g0 g0VarA = kotlinx.coroutines.flow.X.a(G.f388a);
        this.f402c = g0VarA;
        this.f403d = kotlinx.coroutines.flow.X.d(g0VarA);
        this.f404e = -1;
        this.f405f = -1;
    }

    public static EnumC0100w b(IDetectionTask iDetectionTask) {
        if (iDetectionTask instanceof p348x6.a) {
            return EnumC0100w.Blink;
        }
        if (iDetectionTask instanceof p348x6.c) {
            return EnumC0100w.NodHead;
        }
        if (iDetectionTask instanceof p348x6.e) {
            return EnumC0100w.ShakeHead;
        }
        if (iDetectionTask instanceof p348x6.i) {
            return EnumC0100w.Mouth;
        }
        if (iDetectionTask instanceof p348x6.g) {
            return EnumC0100w.HoldOn;
        }
        return null;
    }

    public final void a(K k2) {
        g0 g0Var = this.f402c;
        if (Intrinsics.c((K) g0Var.getValue(), k2)) {
            return;
        }
        g0Var.getClass();
        g0Var.e(null, k2);
    }
}
