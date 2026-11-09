package D6;

import android.util.Size;
import androidx.lifecycle.V;
import androidx.lifecycle.a0;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.palmpay.lib.liveness.result.LiveIDResult;
import com.palmpay.lib.liveness.task.IDetectionTask;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.S;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.g0;
import p232p6.p;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends a0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f1606A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final FaceDetectorOptions f1607B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f1608C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public int f1609H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f1610L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f1611M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f1612Q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1615f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Size f1616g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g0 f1617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final S f1618j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public LiveIDResult f1619o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public File f1620p;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f1621v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f1622w;

    public e(int i7, ArrayList tasks) {
        Integer num;
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        this.f1613d = tasks;
        this.f1614e = i7;
        r6.a aVar = p.f41237d;
        this.f1615f = ((aVar == null || (num = aVar.f41582n) == null) ? 1 : num.intValue()) + 1;
        r6.a aVar2 = p.f41237d;
        this.f1616g = aVar2 != null ? aVar2.f41581m : null;
        if (aVar2 != null) {
            Long l5 = aVar2.f41583o;
        }
        g0 g0VarA = X.a(new i());
        this.f1617i = g0VarA;
        this.f1618j = X.p(X.h(X.d(g0VarA), o.f1686a), V.h(this), SharingStarted.a.WhileSubscribed$default(SharingStarted.f39103n0, 0L, 0L, 3, null), new i());
        new ArrayList();
        this.f1621v = 2000L;
        this.f1606A = true;
        FaceDetectorOptions.Builder builder = new FaceDetectorOptions.Builder();
        builder.setPerformanceMode(1);
        builder.enableTracking();
        builder.setLandmarkMode(2);
        builder.setClassificationMode(2);
        builder.setContourMode(2);
        FaceDetectorOptions faceDetectorOptionsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(faceDetectorOptionsBuild, "build(...)");
        this.f1607B = faceDetectorOptionsBuild;
        this.f1608C = C2131j.b(new Ae.j(this, 8));
        this.f1610L = -1;
    }

    public final void d(IDetectionTask iDetectionTask) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        boolean z3 = iDetectionTask instanceof p348x6.a;
        g0 g0Var = this.f1617i;
        if (z3) {
            do {
                value5 = g0Var.getValue();
            } while (!g0Var.compareAndSet(value5, i.a((i) value5, h.Blink, this.f1609H, Boolean.FALSE, null, null, null, null, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP)));
            return;
        }
        if (iDetectionTask instanceof p348x6.i) {
            do {
                value4 = g0Var.getValue();
            } while (!g0Var.compareAndSet(value4, i.a((i) value4, h.Mouth, this.f1609H, Boolean.FALSE, null, null, null, null, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP)));
            return;
        }
        if (iDetectionTask instanceof p348x6.c) {
            do {
                value3 = g0Var.getValue();
            } while (!g0Var.compareAndSet(value3, i.a((i) value3, h.NodHead, this.f1609H, Boolean.FALSE, null, null, null, null, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP)));
        } else if (iDetectionTask instanceof p348x6.e) {
            do {
                value2 = g0Var.getValue();
            } while (!g0Var.compareAndSet(value2, i.a((i) value2, h.ShakeHead, this.f1609H, Boolean.FALSE, null, null, null, null, KkCarPayResultDialog.FREE_RIDE_TITLE_MARGIN_TOP_DP)));
        } else if (iDetectionTask instanceof p348x6.g) {
            do {
                value = g0Var.getValue();
            } while (!g0Var.compareAndSet(value, i.a((i) value, h.HoldOn, this.f1609H, Boolean.TRUE, null, null, null, null, 104)));
        }
    }

    public final void e() {
        g0 g0Var;
        Object value;
        this.f1609H = 0;
        this.f1610L = -1;
        this.f1606A = true;
        do {
            g0Var = this.f1617i;
            value = g0Var.getValue();
        } while (!g0Var.compareAndSet(value, i.a((i) value, null, 0.0f, Boolean.FALSE, null, null, null, null, 97)));
    }
}
