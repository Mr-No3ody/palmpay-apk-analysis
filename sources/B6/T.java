package B6;

import Zf.AbstractC0807c;
import androidx.window.layout.FoldingFeature;
import com.palmpay.lib.liveness.ui.SelfieCaptureActivity;
import com.palmpay.lib.liveness.ui.widget.AlgorithmScheduleProgressBar;
import com.transsnet.palmpay.send_money.ui.activity.transfer_via_ussd.SelectBankForTransferViaUssdDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.C1882n;
import kotlinx.coroutines.flow.FlowCollector;
import p135j0.C1768a0;

/* JADX INFO: loaded from: classes3.dex */
public final class T implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f422b;

    public /* synthetic */ T(Object obj, int i7) {
        this.f421a = i7;
        this.f422b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f2, code lost:
    
        if (r1.send(r2, r3) == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
    
        if (r5.send(r1, r3) == r4) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(B6.K r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B6.T.a(B6.K, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007d  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Unit unit;
        C1882n c1882n;
        switch (this.f421a) {
            case 0:
                return a((K) obj, continuation);
            case 1:
                FoldingFeature foldingFeature = (FoldingFeature) obj;
                Sd.b bVar = ((androidx.slidingpanelayout.widget.d) this.f422b).f17861d;
                if (bVar == null) {
                    unit = null;
                } else {
                    bVar.onFoldingFeatureChange(foldingFeature);
                    unit = Unit.f38893a;
                }
                return unit == Ef.a.f2423a ? unit : Unit.f38893a;
            case 2:
                p135j0.O o10 = (p135j0.O) this.f422b;
                if (o10.f37968h.b() instanceof C1768a0) {
                    return Unit.f38893a;
                }
                Object objD = p135j0.O.d(o10, true, continuation);
                return objD == Ef.a.f2423a ? objD : Unit.f38893a;
            case 3:
                ((Collection) this.f422b).add(obj);
                return Unit.f38893a;
            case 4:
                if (continuation instanceof C1882n) {
                    c1882n = (C1882n) continuation;
                    int i7 = c1882n.f39196c;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c1882n.f39196c = i7 - Integer.MIN_VALUE;
                    } else {
                        c1882n = new C1882n(this, continuation);
                    }
                } else {
                    c1882n = new C1882n(this, continuation);
                }
                Object obj2 = c1882n.f39194a;
                Ef.a aVar = Ef.a.f2423a;
                int i10 = c1882n.f39196c;
                if (i10 == 0) {
                    androidx.camera.core.impl.utils.executor.g.M(obj2);
                    if (obj == null) {
                        obj = AbstractC0807c.f11737b;
                    }
                    c1882n.f39196c = 1;
                    if (((ProducerScope) this.f422b).send(obj, c1882n) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.camera.core.impl.utils.executor.g.M(obj2);
                }
                return Unit.f38893a;
            case 5:
                D6.i iVar = (D6.i) obj;
                D6.g gVar = iVar.f1657e;
                SelfieCaptureActivity selfieCaptureActivity = (SelfieCaptureActivity) this.f422b;
                if (gVar != null) {
                    SelfieCaptureActivity.f(selfieCaptureActivity, gVar);
                } else {
                    AlgorithmScheduleProgressBar algorithmScheduleProgressBar = selfieCaptureActivity.t;
                    if (algorithmScheduleProgressBar == null) {
                        Intrinsics.n("faceShapedProgressIndicator");
                        throw null;
                    }
                    float f10 = iVar.f1654b;
                    if (0.0f == f10 || 1.0f == f10) {
                        algorithmScheduleProgressBar.b(f10, true, 50);
                    } else {
                        algorithmScheduleProgressBar.b(f10, false, 500);
                    }
                }
                return Unit.f38893a;
            default:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList == null || arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    SelectBankForTransferViaUssdDialog selectBankForTransferViaUssdDialog = (SelectBankForTransferViaUssdDialog) this.f422b;
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) selectBankForTransferViaUssdDialog.f33623H.getValue();
                    if (copyOnWriteArrayList != null) {
                        copyOnWriteArrayList.addAll(arrayList);
                    }
                    p173ld.m mVarJ = selectBankForTransferViaUssdDialog.j();
                    if (mVarJ != null) {
                        mVarJ.setList(Jd.c.g(arrayList));
                    }
                }
                return Unit.f38893a;
        }
    }
}
