package Fe;

import Pa.C0525w;
import Wf.AbstractC0780y;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1207q;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.main.export.bean.rsp.GetHomeCommonRsp;
import com.transsnet.palmpay.main.export.business.IApiMainService;
import com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Fe.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0273v extends Ff.h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f2816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ I f2817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0273v(boolean z3, kotlin.jvm.internal.B b7, I i7, Continuation continuation) {
        super(1, continuation);
        this.f2815b = z3;
        this.f2816c = b7;
        this.f2817d = i7;
    }

    @Override // Ff.a
    public final Continuation create(Continuation continuation) {
        return new C0273v(this.f2815b, this.f2816c, this.f2817d, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0273v) create((Continuation) obj)).invokeSuspend(Unit.f38893a);
    }

    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        GetHomeCommonRsp.DataBean data;
        AbstractC1207q coroutineScope;
        Ef.a aVar = Ef.a.f2423a;
        int i7 = this.f2814a;
        if (i7 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            C0525w c0525wF = C0525w.f();
            String strO = androidx.camera.core.impl.utils.executor.g.o();
            HashMap map = Pa.H.f7018b;
            String string = (!TextUtils.isEmpty(strO) && strO.startsWith("Pref_")) ? Pa.H.e().getString(strO, null) : null;
            c0525wF.getClass();
            GetHomeCommonRsp getHomeCommonRsp = (GetHomeCommonRsp) C0525w.d(string, GetHomeCommonRsp.class);
            if (getHomeCommonRsp != null) {
                getHomeCommonRsp.markParseFromCache(true);
            }
            Boolean boolValueOf = getHomeCommonRsp != null ? Boolean.valueOf(getHomeCommonRsp.isCacheTimeValid()) : null;
            if (Intrinsics.c(boolValueOf, Boolean.TRUE) && !this.f2815b) {
                F6.d.h("HomeFragmentPresenter", 3, "home menu cache is valid, use cache");
                return getHomeCommonRsp;
            }
            F6.d.h("HomeFragmentPresenter", 3, "update home menu cache, cache status:" + boolValueOf);
            if (getHomeCommonRsp != null && (data = getHomeCommonRsp.getData()) != null) {
                List<HomeMenuBean> list = data.bottomTabMenu;
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        ((HomeMenuBean) it.next()).fromCache = true;
                    }
                }
                data.fromCache = true;
                boolean z3 = I.f2735f;
                I i10 = this.f2817d;
                HomeFragmentContract$IView homeFragmentContract$IView = (HomeFragmentContract$IView) i10.f27351a;
                if (homeFragmentContract$IView != null && (coroutineScope = homeFragmentContract$IView.getCoroutineScope()) != null) {
                    p042cg.f fVar = Wf.I.f10809a;
                    AbstractC0780y.m(coroutineScope, p015ag.o.f11960a, null, new C0272u(i10, data, null), 2);
                }
            }
            kotlin.jvm.internal.B b7 = this.f2816c;
            if (b7.f38947a) {
                b7.f38947a = getHomeCommonRsp == null;
            }
            IApiMainService iApiMainService = (IApiMainService) Cc.a.f1353a.f39520b;
            boolean z8 = b7.f38947a;
            this.f2814a = 1;
            obj = iApiMainService.queryHomeInfo(8, z8, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        }
        return (GetHomeCommonRsp) obj;
    }
}
