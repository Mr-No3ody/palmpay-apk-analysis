package B6;

import E.AbstractC0198c;
import Wf.AbstractC0780y;
import Wf.t0;
import android.util.Size;
import com.google.mlkit.vision.face.FaceDetector;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C1872d;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends androidx.lifecycle.a0 {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final long f450C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f451H = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f452A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public float f453B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Size f456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0081c f457g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final N f458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g0 f459j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.flow.S f460o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Yf.n f461p;
    public final C1872d t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public File f462v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public t0 f463w;

    static {
        new P(null);
        Tf.b bVar = Tf.c.f9078b;
        f450C = AbstractC0198c.h0(250, Tf.e.MILLISECONDS);
    }

    public b0(int i7, ArrayList tasks) {
        Integer num;
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f454d = i7;
        r6.a aVar = p232p6.p.f41237d;
        this.f455e = ((aVar == null || (num = aVar.f41582n) == null) ? 1 : num.intValue()) + 1;
        r6.a aVar2 = p232p6.p.f41237d;
        this.f456f = aVar2 != null ? aVar2.f41581m : null;
        this.f457g = new C0081c();
        this.f458i = new N(androidx.lifecycle.V.h(this), tasks);
        g0 g0VarA = kotlinx.coroutines.flow.X.a(new O());
        this.f459j = g0VarA;
        this.f460o = kotlinx.coroutines.flow.X.p(kotlinx.coroutines.flow.X.h(kotlinx.coroutines.flow.X.d(g0VarA), f450C), androidx.lifecycle.V.h(this), SharingStarted.a.WhileSubscribed$default(SharingStarted.f39103n0, 0L, 0L, 3, null), new O());
        Yf.n nVarA = p059e1.a.a(0, null, 7);
        this.f461p = nVarA;
        this.t = new C1872d(nVarA);
        this.f453B = -1.0f;
        AbstractC0780y.m(androidx.lifecycle.V.h(this), null, null, new U(this, null), 3);
    }

    @Override // androidx.lifecycle.a0
    public final void b() {
        ((FaceDetector) this.f457g.f465b.getValue()).close();
        N n10 = this.f458i;
        n10.f404e = -1;
        n10.f407h = true;
        t0 t0Var = this.f463w;
        if (t0Var != null) {
            t0Var.cancel((CancellationException) null);
        }
    }
}
