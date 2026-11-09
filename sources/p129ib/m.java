package p129ib;

import C0.G;
import F6.d;
import Hb.L;
import V9.C0714c;
import Wf.AbstractC0780y;
import Wf.I;
import android.app.Activity;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.transsnet.palmpay.core.base.BaseFragment;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.credit.bean.MultiLoanInfo;
import com.transsnet.palmpay.credit.bean.ProductContentInfo;
import com.transsnet.palmpay.credit.bean.req.UpLoadLoanDialogPopUps;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.credit.handler.MultiLoanPopupHost;
import com.transsnet.palmpay.credit.ui.dialog.MultiLoanPrivilegeDialog;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p042cg.e;
import p042cg.f;
import p071ef.b;
import p221ob.c;

/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f37481g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f37482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleCoroutineScopeImpl f37483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f37484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public BaseMvvmFragment f37485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public QueryLoanDialogPopUpsBean f37486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f37487f;

    static {
        new d(null);
    }

    public m(BaseMvvmFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "baseFragment");
        d.h("HomeDialogHandler", 3, "init >>>");
        WeakReference weakReference = new WeakReference(baseFragment);
        this.f37482a = weakReference;
        BaseFragment baseFragment2 = (BaseFragment) weakReference.get();
        this.f37483b = baseFragment2 != null ? V.f(baseFragment2) : null;
    }

    public final void a(Boolean bool) {
        this.f37487f = bool;
        if (this.f37484c) {
            d.h("HomeDialogHandler", 3, "starLogic >>> skip, dialog showing");
            return;
        }
        boolean zBooleanValue = true;
        boolean z3 = !TimeUtils.isToday(SPUtils.getInstance().getLong(com.transsnet.palmpay.core.config.d.d(), 0L));
        long j6 = SPUtils.getInstance().getLong(com.transsnet.palmpay.core.config.d.f(), 0L);
        Boolean bool2 = this.f37487f;
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else if (TimeUtils.isToday(j6)) {
            zBooleanValue = false;
        }
        d.h("HomeDialogHandler", 3, "loadingDialog >>> queryPopUpsV2 queryCoupon=" + z3 + " queryRepay=" + zBooleanValue);
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f37483b;
        if (lifecycleCoroutineScopeImpl != null) {
            f fVar = I.f10809a;
            AbstractC0780y.m(lifecycleCoroutineScopeImpl, e.f19009c, null, new l(z3, zBooleanValue, this, null), 2);
        } else {
            d.h("HomeDialogHandler", 5, "loadingDialog >>> lifecycleScope is null, skip queryPopUpsV2");
            Unit unit = Unit.f38893a;
        }
    }

    public final boolean b(Activity activity, QueryLoanDialogPopUpsBean queryLoanDialogPopUpsBean) {
        MultiLoanInfo multiLoanInfo;
        ProductContentInfo productContentInfoFindInstallmentProductForMultiLoanPopup;
        WeakReference weakReference = this.f37482a;
        BaseFragment baseFragment = weakReference != null ? (BaseFragment) weakReference.get() : null;
        MultiLoanPopupHost multiLoanPopupHost = baseFragment instanceof MultiLoanPopupHost ? (MultiLoanPopupHost) baseFragment : null;
        if (multiLoanPopupHost == null || (multiLoanInfo = queryLoanDialogPopUpsBean.getMultiLoanInfo()) == null || (productContentInfoFindInstallmentProductForMultiLoanPopup = multiLoanPopupHost.findInstallmentProductForMultiLoanPopup()) == null) {
            return false;
        }
        MultiLoanPrivilegeDialog multiLoanPrivilegeDialog = new MultiLoanPrivilegeDialog(activity, multiLoanPopupHost.isNewLoanHomeForMultiLoanPopup(), multiLoanInfo, new L(multiLoanPopupHost, productContentInfoFindInstallmentProductForMultiLoanPopup));
        multiLoanPrivilegeDialog.setOnShowListener(new a(this, 5));
        multiLoanPrivilegeDialog.setOnDismissListener(new b(this, 10));
        multiLoanPrivilegeDialog.show();
        return true;
    }

    public final void c() {
        Activity topActivity;
        String popupSummary;
        QueryLoanDialogPopUpsBean queryLoanDialogPopUpsBean = this.f37486e;
        if (queryLoanDialogPopUpsBean == null) {
            return;
        }
        MultiLoanInfo multiLoanInfo = queryLoanDialogPopUpsBean.getMultiLoanInfo();
        if (!((!(multiLoanInfo != null ? Intrinsics.c(multiLoanInfo.getShowPopup(), Boolean.TRUE) : false) || (popupSummary = multiLoanInfo.getPopupSummary()) == null || StringsKt.F(popupSummary)) ? false : true)) {
            this.f37486e = null;
            return;
        }
        if (this.f37484c || (topActivity = ActivityUtils.getTopActivity()) == null || "account.ui.activity.PinSafeWithPatternActivity".equals(topActivity.getLocalClassName())) {
            return;
        }
        this.f37484c = true;
        if (b(topActivity, queryLoanDialogPopUpsBean)) {
            this.f37486e = null;
        } else {
            this.f37484c = false;
        }
    }

    public final void d(String str) {
        G.h(c.f40268a).uploadLoanDialogPopUps(new UpLoadLoanDialogPopUps(str)).k(p298tf.f.f42629b).i(b.a()).subscribe(new C0714c(this, 10));
    }
}
