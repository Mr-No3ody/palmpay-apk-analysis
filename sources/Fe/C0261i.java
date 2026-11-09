package Fe;

import android.text.TextUtils;
import com.palmpay.lib.apm.network.NQEManager;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.main.export.bean.rsp.GetHomeCommonRsp;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHomeAccountInfoRsp;
import com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Fe.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0261i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f2779c;

    public /* synthetic */ C0261i(I i7, boolean z3) {
        this.f2777a = 0;
        this.f2779c = i7;
        this.f2778b = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z3 = this.f2778b;
        I i7 = this.f2779c;
        switch (this.f2777a) {
            case 0:
                CommonBeanResult it = (CommonBeanResult) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.isSuccess()) {
                    HomeFragmentContract$IView homeFragmentContract$IView = (HomeFragmentContract$IView) i7.f27351a;
                    if (homeFragmentContract$IView != null) {
                        homeFragmentContract$IView.handleHomeAccountInfo((QueryHomeAccountInfoRsp) it.data);
                    }
                    if (z3) {
                        ToastUtils.showShort(Ac.h.main_refresh_completed);
                    }
                } else {
                    HomeFragmentContract$IView homeFragmentContract$IView2 = (HomeFragmentContract$IView) i7.f27351a;
                    if (homeFragmentContract$IView2 != null) {
                        homeFragmentContract$IView2.handleHomeAccountInfo(null);
                    }
                }
                break;
            case 1:
                String str = (String) obj;
                if (z3) {
                    ToastUtils.showLong(str, new Object[0]);
                }
                HomeFragmentContract$IView homeFragmentContract$IView3 = (HomeFragmentContract$IView) i7.f27351a;
                if (homeFragmentContract$IView3 != null) {
                    homeFragmentContract$IView3.handleHomeAccountInfo(null);
                }
                break;
            default:
                if (NQEManager.INSTANCE.isNetworkOffline()) {
                    String strO = androidx.camera.core.impl.utils.executor.g.o();
                    HashMap map = Pa.H.f7018b;
                    String string = (!TextUtils.isEmpty(strO) && strO.startsWith("Pref_")) ? Pa.H.e().getString(strO, null) : null;
                    HomeFragmentContract$IView homeFragmentContract$IView4 = (HomeFragmentContract$IView) i7.f27351a;
                    if (homeFragmentContract$IView4 != null) {
                        GetHomeCommonRsp getHomeCommonRsp = (GetHomeCommonRsp) com.horcrux.svg.d0.l(GetHomeCommonRsp.class, string);
                        homeFragmentContract$IView4.showHomeCommonInfo(getHomeCommonRsp != null ? getHomeCommonRsp.getData() : null);
                    }
                } else if (z3) {
                    i7.c(false, false);
                } else {
                    HomeFragmentContract$IView homeFragmentContract$IView5 = (HomeFragmentContract$IView) i7.f27351a;
                    if (homeFragmentContract$IView5 != null) {
                        homeFragmentContract$IView5.showHomeCommonInfo(null);
                    }
                }
                break;
        }
        return Unit.f38893a;
    }

    public /* synthetic */ C0261i(boolean z3, I i7, int i10) {
        this.f2777a = i10;
        this.f2778b = z3;
        this.f2779c = i7;
    }
}
