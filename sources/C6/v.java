package C6;

import android.os.Handler;
import android.util.Size;
import androidx.lifecycle.V;
import androidx.lifecycle.a0;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.palmpay.lib.liveness.result.LiveIDResult;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.S;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.g0;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends a0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f1220A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f1221B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f1222C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f1223H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f1224L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final FaceDetectorOptions f1225M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final p355xf.t f1226Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public o f1227X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Boolean f1228Y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Size f1231f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1232g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f1233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f1234j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g0 f1235o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final S f1236p;
    public LiveIDResult t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayList f1237v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public File f1238w;

    public v() {
        Integer num;
        Float f10;
        Long l5;
        Integer num2;
        r6.a aVar = p232p6.p.f41237d;
        int iIntValue = (aVar == null || (num2 = aVar.f41582n) == null) ? 1 : num2.intValue();
        this.f1229d = iIntValue;
        this.f1230e = iIntValue + 1;
        r6.a aVar2 = p232p6.p.f41237d;
        this.f1231f = aVar2 != null ? aVar2.f41581m : null;
        this.f1232g = (aVar2 == null || (l5 = aVar2.f41583o) == null) ? 3000L : l5.longValue();
        r6.a aVar3 = p232p6.p.f41237d;
        if (aVar3 != null) {
            Float f11 = aVar3.f41579k;
        }
        this.f1233i = (aVar3 == null || (f10 = aVar3.f41580l) == null) ? 0.5f : f10.floatValue();
        r6.a aVar4 = p232p6.p.f41237d;
        this.f1234j = ((aVar4 == null || (num = aVar4.f41585q) == null) ? 9 : num.intValue()) - 1;
        g0 g0VarA = X.a(new D6.i());
        this.f1235o = g0VarA;
        this.f1236p = X.p(X.h(X.d(g0VarA), D6.o.f1686a), V.h(this), SharingStarted.a.WhileSubscribed$default(SharingStarted.f39103n0, 0L, 0L, 3, null), new D6.i());
        this.f1237v = new ArrayList();
        this.f1222C = true;
        FaceDetectorOptions.Builder builder = new FaceDetectorOptions.Builder();
        builder.setPerformanceMode(1);
        builder.setLandmarkMode(1);
        builder.setClassificationMode(2);
        FaceDetectorOptions faceDetectorOptionsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(faceDetectorOptionsBuild, "build(...)");
        this.f1225M = faceDetectorOptionsBuild;
        this.f1226Q = C2131j.b(new Ae.j(this, 3));
        this.f1228Y = Boolean.FALSE;
    }

    public final void d() {
        g0 g0Var;
        Object value;
        Handler handler;
        this.f1221B = 0L;
        this.f1222C = true;
        this.f1223H = false;
        this.f1228Y = Boolean.FALSE;
        do {
            g0Var = this.f1235o;
            value = g0Var.getValue();
        } while (!g0Var.compareAndSet(value, D6.i.a((D6.i) value, null, 0.0f, Boolean.FALSE, null, null, null, null, 107)));
        o oVar = this.f1227X;
        if (oVar == null || (handler = oVar.f1195h) == null) {
            return;
        }
        handler.post(new l(oVar, 0));
    }
}
