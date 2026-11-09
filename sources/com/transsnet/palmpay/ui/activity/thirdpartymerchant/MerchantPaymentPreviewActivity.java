package com.transsnet.palmpay.ui.activity.thirdpartymerchant;

import Ac.e;
import Ac.f;
import Bc.i;
import L6.b;
import Pa.i0;
import Pa.r0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity;
import com.transsnet.palmpay.custom_view.p;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.BarUtils;
import kotlin.Metadata;
import p059e1.a;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/thirdpartymerchant/MerchantPaymentPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/CoreCashierPreviewActivity;", "<init>", "()V", "Wd/z", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MerchantPaymentPreviewActivity extends CoreCashierPreviewActivity {
    public i Z0;

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void createViewBinding(Bundle bundle) {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(f.main_activity_merchant_payment_preview, (ViewGroup) null, false);
        int i7 = e.groupPreview;
        Group group = (Group) a.m(i7, viewInflate);
        if (group != null) {
            i7 = e.ivAvatar;
            ImageView imageView = (ImageView) a.m(i7, viewInflate);
            if (imageView != null) {
                i7 = e.ll_cashier_confirm_to_pay;
                if (((LinearLayout) a.m(i7, viewInflate)) != null) {
                    i7 = e.titleBar;
                    PpTitleBar ppTitleBar = (PpTitleBar) a.m(i7, viewInflate);
                    if (ppTitleBar != null) {
                        i7 = e.tv_confirm_to_pay;
                        TextView textView = (TextView) a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = e.tvPhone;
                            TextView textView2 = (TextView) a.m(i7, viewInflate);
                            if (textView2 != null && (viewM = a.m((i7 = e.view_top_transparent_bg), viewInflate)) != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                this.Z0 = new i((ViewGroup) constraintLayout, (View) group, (View) imageView, (ViewGroup) ppTitleBar, (View) textView, textView2, viewM, 0);
                                setContentView(constraintLayout);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity, com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.Z0 = null;
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final String s() {
        return "3";
    }

    @Override // com.transsnet.palmpay.core.ui.activity.CoreCashierPreviewActivity, com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        i iVar = this.Z0;
        if (iVar != null) {
            h.s((Group) iVar.f726d, true);
        }
        requestLayoutFullScreen();
        BarUtils.setStatusBarLightMode(getWindow(), true);
        setWindowBackground(p.md_white_1000);
        View viewFindViewById = findViewById(p025ba.e.iv_close);
        if (viewFindViewById != null) {
            h.s(viewFindViewById, false);
        }
        User user = BaseApplication.get().getUser();
        if (user != null) {
            i iVar2 = this.Z0;
            r0.m1(user.getAvatar(), iVar2 != null ? (ImageView) iVar2.f727e : null);
            i iVar3 = this.Z0;
            if (iVar3 != null) {
                ((TextView) iVar3.f729g).setText(i0.n(i0.D(user.getPhoneNumber()), true));
            }
        }
        i iVar4 = this.Z0;
        if (iVar4 != null) {
            ((ImageView) iVar4.f727e).setAlpha(0.3f);
        }
        i iVar5 = this.Z0;
        if (iVar5 != null) {
            h.k((PpTitleBar) iVar5.f725c, Integer.valueOf(BarUtils.getStatusBarHeight()), null, null, null, 14);
        }
        i iVar6 = this.Z0;
        if (iVar6 != null) {
            ((PpTitleBar) iVar6.f725c).c(S6.a.pay_Close, CommonViewExtKt.colorInt(b.ppColorTextPrimary, this));
        }
    }
}
