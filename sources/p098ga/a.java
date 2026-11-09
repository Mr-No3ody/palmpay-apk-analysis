package p098ga;

import com.transsnet.palmpay.core.base.IBaseView;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.base.m;
import com.transsnet.palmpay.core.base.n;
import com.transsnet.palmpay.core.base.o;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.base.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f37010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f37011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IBaseView f37012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f37013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l f37014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f37015f;

    public /* synthetic */ a(boolean z3, Function0 function0, IBaseView iBaseView, Function2 function2, l lVar, Function1 function1) {
        this.f37010a = z3;
        this.f37011b = function0;
        this.f37012c = iBaseView;
        this.f37013d = function2;
        this.f37014e = lVar;
        this.f37015f = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q it = (q) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        boolean z3 = it instanceof o;
        boolean z8 = this.f37010a;
        Function0 function0 = this.f37011b;
        IBaseView iBaseView = this.f37012c;
        if (z3) {
            if (z8 && ((Boolean) function0.invoke()).booleanValue()) {
                iBaseView.showLoadingDialog(true, true);
            }
        } else if (it instanceof p) {
            if (z8 && ((Boolean) function0.invoke()).booleanValue()) {
                iBaseView.showLoadingDialog(false, true);
            }
            this.f37013d.invoke(this.f37014e.f27356m, ((p) it).f27360a);
        } else if (it instanceof m) {
            if (z8 && ((Boolean) function0.invoke()).booleanValue()) {
                iBaseView.showLoadingDialog(false, true);
            }
        } else {
            if (!(it instanceof n)) {
                throw new p355xf.l();
            }
            if (z8 && ((Boolean) function0.invoke()).booleanValue()) {
                iBaseView.showLoadingDialog(false, true);
            }
            this.f37015f.invoke(((n) it).f27358a);
        }
        return Unit.f38893a;
    }
}
