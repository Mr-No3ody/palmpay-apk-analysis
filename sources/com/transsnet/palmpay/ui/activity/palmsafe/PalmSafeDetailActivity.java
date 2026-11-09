package com.transsnet.palmpay.ui.activity.palmsafe;

import Ac.e;
import Ac.f;
import Bc.C0107d;
import L6.b;
import Pe.Z;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.viewmodule.PalmSafeViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p059e1.a;
import p141j9.s;
import p141j9.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/palm_safe_detail")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/palmsafe/PalmSafeDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/viewmodule/PalmSafeViewModel;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPalmSafeDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PalmSafeDetailActivity.kt\ncom/transsnet/palmpay/ui/activity/palmsafe/PalmSafeDetailActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,213:1\n260#2,10:214\n296#2:224\n*S KotlinDebug\n*F\n+ 1 PalmSafeDetailActivity.kt\ncom/transsnet/palmpay/ui/activity/palmsafe/PalmSafeDetailActivity\n*L\n93#1:214,10\n93#1:224\n*E\n"})
public final class PalmSafeDetailActivity extends BaseMvvmActivity<PalmSafeViewModel> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f34776f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CommonBeanResult f34778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C0107d f34779e;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f34777c)) {
            this.f34777c = getQueryParameter("orderId");
        }
        l lVar = ((PalmSafeViewModel) l()).f35387e;
        if (lVar != null) {
            lVar.e(this, new s(new t(this, this, 10), (byte) 0, (byte) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_palm_safe_detail, (ViewGroup) null, false);
        int i7 = e.layoutResultAmountList;
        LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = e.layoutResultInfoList;
            if (((LinearLayout) a.m(i7, viewInflate)) != null) {
                i7 = e.modelCustomerService;
                OrderResultCustomerServiceModel orderResultCustomerServiceModel = (OrderResultCustomerServiceModel) a.m(i7, viewInflate);
                if (orderResultCustomerServiceModel != null) {
                    i7 = e.modelResultHeader;
                    OrderResultHeaderModel orderResultHeaderModel = (OrderResultHeaderModel) a.m(i7, viewInflate);
                    if (orderResultHeaderModel != null) {
                        i7 = e.modelResultReceipt;
                        if (((OrderResultViewReceiptModel) a.m(i7, viewInflate)) != null) {
                            i7 = e.scrollView;
                            if (((NestedScrollView) a.m(i7, viewInflate)) != null) {
                                i7 = e.titleBar;
                                if (((PpTitleBar) a.m(i7, viewInflate)) != null) {
                                    C0107d c0107d = new C0107d((LinearLayout) viewInflate, linearLayout, orderResultCustomerServiceModel, orderResultHeaderModel, 2);
                                    this.f34779e = c0107d;
                                    return c0107d;
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        PalmSafeViewModel palmSafeViewModel = (PalmSafeViewModel) l();
        String str = this.f34777c;
        palmSafeViewModel.getClass();
        p140j8.f.s(palmSafeViewModel, new Z(str, null), palmSafeViewModel.f35387e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundDark), true);
        C0107d c0107d = this.f34779e;
        if (c0107d != null) {
            ((OrderResultCustomerServiceModel) c0107d.f682d).d(Boolean.FALSE);
        }
        C0107d c0107d2 = this.f34779e;
        if (c0107d2 != null) {
            ((OrderResultCustomerServiceModel) c0107d2.f682d).setOnCustomerServiceModelListener(new p224oe.a(this));
        }
    }
}
