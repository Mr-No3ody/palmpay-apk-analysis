package Fe;

import Wf.AbstractC0780y;
import androidx.lifecycle.AbstractC1207q;
import com.transsnet.palmpay.core.bean.bill.TransHistoryReqV2;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.main.export.bean.rsp.GetHomeCommonRsp;
import com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView;
import com.transsnet.palmpay.util.ToastUtils;
import com.transsnet.palmpay.viewmodule.TransactionHistoryViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Fe.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C0262j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2782a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f2783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2785d;

    public /* synthetic */ C0262j(I i7, boolean z3, kotlin.jvm.internal.B b7) {
        this.f2784c = i7;
        this.f2783b = z3;
        this.f2785d = b7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        HomeFragmentContract$IView homeFragmentContract$IView;
        AbstractC1207q coroutineScope;
        List<HomeMenuBean> list;
        Object obj2 = this.f2784c;
        boolean z3 = this.f2783b;
        Object obj3 = this.f2785d;
        switch (this.f2782a) {
            case 0:
                GetHomeCommonRsp it = (GetHomeCommonRsp) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                I i7 = (I) obj2;
                if (it.isSuccess()) {
                    GetHomeCommonRsp.DataBean data = it.getData();
                    if (data != null && (list = data.bottomTabMenu) != null) {
                        Iterator<T> it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((HomeMenuBean) it2.next()).fromCache = it.isParseFromCache();
                        }
                    }
                    it.getData().fromCache = it.isParseFromCache();
                    HomeFragmentContract$IView homeFragmentContract$IView2 = (HomeFragmentContract$IView) i7.f27351a;
                    if (homeFragmentContract$IView2 != null) {
                        homeFragmentContract$IView2.showHomeCommonInfo(it.getData());
                    }
                    if (!it.getData().fromCache && (homeFragmentContract$IView = (HomeFragmentContract$IView) i7.f27351a) != null && (coroutineScope = homeFragmentContract$IView.getCoroutineScope()) != null) {
                        p042cg.f fVar = Wf.I.f10809a;
                        AbstractC0780y.m(coroutineScope, p042cg.e.f19009c, null, new C0274w(it, (kotlin.jvm.internal.B) obj3, i7, null), 2);
                    }
                } else if (z3) {
                    i7.c(false, false);
                } else {
                    HomeFragmentContract$IView homeFragmentContract$IView3 = (HomeFragmentContract$IView) i7.f27351a;
                    if (homeFragmentContract$IView3 != null) {
                        homeFragmentContract$IView3.showHomeCommonInfo(null);
                    }
                }
                break;
            default:
                String it3 = (String) obj;
                int i10 = TransactionHistoryViewModel.f35404A;
                Intrinsics.checkNotNullParameter(it3, "it");
                ToastUtils.showLong(it3, new Object[0]);
                ((TransactionHistoryViewModel) obj2).h((TransHistoryReqV2) obj3, false, z3);
                break;
        }
        return Unit.f38893a;
    }

    public /* synthetic */ C0262j(TransactionHistoryViewModel transactionHistoryViewModel, TransHistoryReqV2 transHistoryReqV2, boolean z3) {
        this.f2784c = transactionHistoryViewModel;
        this.f2785d = transHistoryReqV2;
        this.f2783b = z3;
    }
}
