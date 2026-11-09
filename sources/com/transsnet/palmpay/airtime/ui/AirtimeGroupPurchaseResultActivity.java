package com.transsnet.palmpay.airtime.ui;

import L6.b;
import Pd.c;
import Pd.d;
import Rd.G;
import T8.f;
import T8.o;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.u;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.airtime.bean.AirtimeGroupPurchaseDetailData;
import com.transsnet.palmpay.airtime.viewmodel.AirTimeResultViewModel;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.C1901f;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p059e1.a;
import p141j9.C1798f;
import p141j9.ViewOnClickListenerC1797e;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
@Route(name = "话费/GroupPurchaseResult", path = "/airtime/airtime_group_purchase_result", remark = "ignore")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/airtime/ui/AirtimeGroupPurchaseResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/airtime/viewmodel/AirTimeResultViewModel;", "LRd/G;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAirtimeGroupPurchaseResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirtimeGroupPurchaseResultActivity.kt\ncom/transsnet/palmpay/airtime/ui/AirtimeGroupPurchaseResultActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n*L\n1#1,304:1\n260#2,10:305\n296#2:315\n*S KotlinDebug\n*F\n+ 1 AirtimeGroupPurchaseResultActivity.kt\ncom/transsnet/palmpay/airtime/ui/AirtimeGroupPurchaseResultActivity\n*L\n102#1:305,10\n102#1:315\n*E\n"})
public final class AirtimeGroupPurchaseResultActivity extends BaseMvvmVBActivity<AirTimeResultViewModel, G> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f26459g = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AirtimeGroupPurchaseDetailData f26461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewOnClickListenerC1797e f26462f = new ViewOnClickListenerC1797e(this, 0);

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((AirTimeResultViewModel) l()).f26613j;
        if (lVar != null) {
            lVar.e(this, new f(new o(27, this, this), (char) 0, (short) 0));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_airtime_activity_group_purchase_result, (ViewGroup) null, false);
        int i7 = c.aaturv2_two_btn_area;
        if (((LinearLayout) a.m(i7, viewInflate)) != null) {
            i7 = c.aaturv_result_progress_view;
            TransactionResultHeaderModel transactionResultHeaderModel = (TransactionResultHeaderModel) a.m(i7, viewInflate);
            if (transactionResultHeaderModel != null) {
                i7 = c.actur_complete_btn;
                TextView textView = (TextView) a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = c.iv_view_detail;
                    ImageView imageView = (ImageView) a.m(i7, viewInflate);
                    if (imageView != null) {
                        i7 = c.ll_order_info;
                        LinearLayout linearLayout = (LinearLayout) a.m(i7, viewInflate);
                        if (linearLayout != null) {
                            i7 = c.llViewDetail;
                            LinearLayout linearLayout2 = (LinearLayout) a.m(i7, viewInflate);
                            if (linearLayout2 != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                i7 = c.title_bar;
                                PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
                                if (ppTitleBar != null) {
                                    i7 = c.tv_view_detail;
                                    TextView textView2 = (TextView) a.m(i7, viewInflate);
                                    if (textView2 != null) {
                                        G g7 = new G(relativeLayout, transactionResultHeaderModel, textView, imageView, linearLayout, linearLayout2, ppTitleBar, textView2);
                                        Intrinsics.checkNotNullExpressionValue(g7, "inflate(...)");
                                        return g7;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        AirTimeResultViewModel airTimeResultViewModel = (AirTimeResultViewModel) l();
        String str = this.f26460d;
        airTimeResultViewModel.getClass();
        p140j8.f.s(airTimeResultViewModel, new C1901f(str, null), airTimeResultViewModel.f26613j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ImageView rightImageView1;
        super.setupView();
        u.a(getOnBackPressedDispatcher(), this, new C1798f(this, 0));
        org.greenrobot.eventbus.c.b().j(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
        ARouter.getInstance().inject(this);
        G g7 = (G) this.f27334c;
        if (g7 != null) {
            h.s(g7.f8053f, false);
        }
        G g10 = (G) this.f27334c;
        if (g10 != null) {
            g10.f8054g.setBackButtonClickListener(new ViewOnClickListenerC1797e(this, 1));
        }
        G g11 = (G) this.f27334c;
        if (g11 != null) {
            g11.f8054g.setRightImageView1Icon(S6.a.pay_CustomerService);
        }
        G g12 = (G) this.f27334c;
        if (g12 != null && (rightImageView1 = g12.f8054g.getRightImageView1()) != null) {
            rightImageView1.setOnClickListener(new ViewOnClickListenerC1797e(this, 2));
        }
        G g13 = (G) this.f27334c;
        ViewOnClickListenerC1797e viewOnClickListenerC1797e = this.f26462f;
        if (g13 != null) {
            g13.f8050c.setOnClickListener(viewOnClickListenerC1797e);
        }
        G g14 = (G) this.f27334c;
        if (g14 != null) {
            g14.f8055i.setOnClickListener(viewOnClickListenerC1797e);
        }
        G g15 = (G) this.f27334c;
        if (g15 != null) {
            g15.f8051d.setOnClickListener(viewOnClickListenerC1797e);
        }
    }
}
