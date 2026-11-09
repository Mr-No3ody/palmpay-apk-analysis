package X0;

import B6.V;
import C0.C0127t;
import Wf.u0;
import Zf.t;
import Zf.v;
import com.palmpay.lib.webview.cache.match.impl.PreloadHtmlMatcher$downloadHtmlFile$$inlined$map$1;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C1884p;
import kotlinx.coroutines.flow.C1888u;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10961b;

    public /* synthetic */ j(Object obj, int i7) {
        this.f10960a = i7;
        this.f10961b = obj;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation frame) throws Throwable {
        switch (this.f10960a) {
            case 0:
                Object objCollect = ((C1888u) this.f10961b).collect(new i(flowCollector, 0), frame);
                return objCollect == Ef.a.f2423a ? objCollect : Unit.f38893a;
            case 1:
                v vVar = new v((C1884p) this.f10961b, flowCollector, null);
                u0 u0Var = new u0(frame.getContext(), frame, 1);
                Object objJ = p377z5.l.J(u0Var, u0Var, vVar);
                Ef.a aVar = Ef.a.f2423a;
                if (objJ == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return objJ == aVar ? objJ : Unit.f38893a;
            case 2:
                Flow[] flowArr = (Flow[]) this.f10961b;
                t tVar = new t(flowArr, new C0127t(flowArr, 14), new V(3, (Continuation) null), flowCollector, null);
                u0 u0Var2 = new u0(frame.getContext(), frame, 1);
                Object objJ2 = p377z5.l.J(u0Var2, u0Var2, tVar);
                Ef.a aVar2 = Ef.a.f2423a;
                if (objJ2 == aVar2) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objJ2 != aVar2) {
                    objJ2 = Unit.f38893a;
                }
                return objJ2 == aVar2 ? objJ2 : Unit.f38893a;
            case 3:
                Object objCollect2 = ((C1888u) this.f10961b).collect(new i(flowCollector, 1), frame);
                return objCollect2 == Ef.a.f2423a ? objCollect2 : Unit.f38893a;
            case 4:
                Object objEmit = flowCollector.emit((Serializable) this.f10961b, frame);
                return objEmit == Ef.a.f2423a ? objEmit : Unit.f38893a;
            case 5:
                Object objCollect3 = ((androidx.slidingpanelayout.widget.b) this.f10961b).collect(new i(flowCollector, 2), frame);
                return objCollect3 == Ef.a.f2423a ? objCollect3 : Unit.f38893a;
            default:
                Object objCollect4 = ((PreloadHtmlMatcher$downloadHtmlFile$$inlined$map$1) this.f10961b).collect(new i(flowCollector, 3), frame);
                return objCollect4 == Ef.a.f2423a ? objCollect4 : Unit.f38893a;
        }
    }
}
