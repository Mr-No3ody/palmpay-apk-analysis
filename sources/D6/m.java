package D6;

import Ab.C;
import E.AbstractC0198c;
import Wf.AbstractC0780y;
import android.util.Size;
import androidx.lifecycle.V;
import androidx.lifecycle.a0;
import com.google.mlkit.vision.face.FaceDetectorOptions;
import com.palmpay.lib.liveness.result.LiveIDResult;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.S;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.X;
import kotlinx.coroutines.flow.g0;
import p232p6.p;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends a0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public File f1669A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f1670B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f1671C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f1672H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final FaceDetectorOptions f1673L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final t f1674M;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1676e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1677f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Size f1678g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f1679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f1680j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f1681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g0 f1682p;
    public final S t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LiveIDResult f1683v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ArrayList f1684w;

    public m(int i7) {
        Float f10;
        Float f11;
        Long l5;
        Integer num;
        this.f1675d = i7;
        r6.a aVar = p.f41237d;
        int iIntValue = (aVar == null || (num = aVar.f41582n) == null) ? 1 : num.intValue();
        this.f1676e = iIntValue;
        this.f1677f = iIntValue + 1;
        r6.a aVar2 = p.f41237d;
        this.f1678g = aVar2 != null ? aVar2.f41581m : null;
        this.f1679i = (aVar2 == null || (l5 = aVar2.f41583o) == null) ? 3000L : l5.longValue();
        r6.a aVar3 = p.f41237d;
        this.f1680j = (aVar3 == null || (f11 = aVar3.f41579k) == null) ? 0.8f : f11.floatValue();
        r6.a aVar4 = p.f41237d;
        this.f1681o = (aVar4 == null || (f10 = aVar4.f41580l) == null) ? 0.5f : f10.floatValue();
        g0 g0VarA = X.a(new i());
        this.f1682p = g0VarA;
        this.t = X.p(X.h(X.d(g0VarA), o.f1686a), V.h(this), SharingStarted.a.WhileSubscribed$default(SharingStarted.f39103n0, 0L, 0L, 3, null), new i());
        this.f1684w = new ArrayList();
        this.f1672H = true;
        FaceDetectorOptions.Builder builder = new FaceDetectorOptions.Builder();
        builder.setPerformanceMode(1);
        builder.setLandmarkMode(2);
        builder.setClassificationMode(2);
        FaceDetectorOptions faceDetectorOptionsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(faceDetectorOptionsBuild, "build(...)");
        this.f1673L = faceDetectorOptionsBuild;
        this.f1674M = C2131j.b(new Ae.j(this, 9));
    }

    public final void d(Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        LiveIDResult liveIDResult = this.f1683v;
        Intrinsics.e(liveIDResult);
        callback.invoke(liveIDResult);
    }

    public final void e() {
        g0 g0Var;
        Object value;
        this.f1671C = 0L;
        this.f1672H = true;
        do {
            g0Var = this.f1682p;
            value = g0Var.getValue();
        } while (!g0Var.compareAndSet(value, i.a((i) value, null, 0.0f, null, null, null, null, null, HomeDialogState.PRIORITY_HIGHEST_111)));
    }

    public final void f(String uploadUrl, String transactionId, int i7, File file, int i10) {
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        this.f1670B = transactionId;
        this.f1675d = i7;
        File file2 = this.f1669A;
        if (file2 != null) {
            if (uploadUrl == null) {
                Intrinsics.n("mUploadUrl");
                throw null;
            }
            if (transactionId == null) {
                transactionId = "";
            }
            g(file2, uploadUrl, transactionId, i10);
            return;
        }
        if (file != null) {
            this.f1669A = file;
            if (uploadUrl == null) {
                Intrinsics.n("mUploadUrl");
                throw null;
            }
            if (transactionId == null) {
                transactionId = "";
            }
            g(file, uploadUrl, transactionId, i10);
        }
    }

    public final void g(File file, String str, String str2, int i7) {
        g0 g0Var;
        Object value;
        do {
            g0Var = this.f1682p;
            value = g0Var.getValue();
        } while (!g0Var.compareAndSet(value, i.a((i) value, null, 0.0f, null, null, g.f1635a, null, null, HomeDialogState.PRIORITY_HIGHEST_111)));
        AbstractC0780y.m(V.h(this), AbstractC0198c.x(new C(this, 8)), null, new l(file, str, this, str2, i7, null), 2);
    }
}
