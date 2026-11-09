package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import Ac.h;
import Bc.r;
import G1.d;
import Pa.i0;
import Pa.r0;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import com.adjust.sdk.network.ErrorCodes;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.b;
import com.bumptech.glide.load.resource.bitmap.i;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.palmpay.core.base.BaseActivity;
import com.transsnet.palmpay.core.bean.MerchantLogo;
import com.transsnet.palmpay.core.bean.bill.TransHistoryRsp;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.OrderResultHeaderModel;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/main/redirect_order_detail")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/RedirectOrderDetailActivity;", "Lcom/transsnet/palmpay/core/base/BaseActivity;", "<init>", "()V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RedirectOrderDetailActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TransHistoryRsp.DataBean.ListBean f34566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f34567b;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        ImageView orderHeaderIcon;
        ImageView orderHeaderIcon2;
        RedirectOrderDetailActivity redirectOrderDetailActivity;
        ImageView orderStatusArrow;
        TransHistoryRsp.DataBean.ListBean listBean = this.f34566a;
        if (listBean == null) {
            finish();
            return;
        }
        if (i0.W(this)) {
            if (!TextUtils.isEmpty(listBean.iconUrl)) {
                r rVar = this.f34567b;
                orderHeaderIcon2 = rVar != null ? rVar.f827d.getOrderHeaderIcon() : null;
                String str = listBean.iconUrl;
                String transType = listBean.transType;
                Intrinsics.checkNotNullExpressionValue(transType, "transType");
                r0.u1(orderHeaderIcon2, str, Ea.a.b(listBean.amount, transType, listBean.businessType, listBean.payerAccountType));
            } else if (!TextUtils.isEmpty(listBean.companyIconUrl)) {
                r rVar2 = this.f34567b;
                orderHeaderIcon2 = rVar2 != null ? rVar2.f827d.getOrderHeaderIcon() : null;
                String str2 = listBean.companyIconUrl;
                String transType2 = listBean.transType;
                Intrinsics.checkNotNullExpressionValue(transType2, "transType");
                r0.u1(orderHeaderIcon2, str2, Ea.a.b(listBean.amount, transType2, listBean.businessType, listBean.payerAccountType));
            } else if (TransType.TRANS_TYPE_BULK_DISBURSEMENT.equals(listBean.transType) || TransType.TRANS_TYPE_MERCHANT_DISBURSEMENT.equals(listBean.transType) || (TransType.TRANS_TYPE_AIRTIME_DISBURSEMENT.equals(listBean.transType) && !TextUtils.isEmpty(listBean.merchantNo))) {
                r rVar3 = this.f34567b;
                if (rVar3 != null && (orderHeaderIcon = rVar3.f827d.getOrderHeaderIcon()) != null) {
                    b.f(orderHeaderIcon).load(new MerchantLogo(listBean.merchantNo)).a(((d) ((d) new d().I(new i(), true)).j(com.transsnet.palmpay.custom_view.r.cv_default_merchat)).x(com.transsnet.palmpay.custom_view.r.cv_default_merchat)).S(orderHeaderIcon);
                }
            } else {
                r rVar4 = this.f34567b;
                orderHeaderIcon2 = rVar4 != null ? rVar4.f827d.getOrderHeaderIcon() : null;
                String transType3 = listBean.transType;
                Intrinsics.checkNotNullExpressionValue(transType3, "transType");
                Uri uriC = Ea.a.c(transType3, (14 & 2) != 0 ? null : -1, null, null);
                d dVar = new d();
                String transType4 = listBean.transType;
                Intrinsics.checkNotNullExpressionValue(transType4, "transType");
                r0.g1(orderHeaderIcon2, uriC, (d) dVar.x(Ea.a.b(listBean.amount, transType4, listBean.businessType, listBean.payerAccountType)));
            }
            r rVar5 = this.f34567b;
            if (rVar5 != null) {
                rVar5.f827d.o(TextUtils.isEmpty(listBean.title) ? listBean.transType : listBean.title);
            }
            r rVar6 = this.f34567b;
            if (rVar6 != null) {
                OrderResultHeaderModel orderResultHeaderModel = rVar6.f827d;
                String str3 = listBean.orderStatus;
                if (str3 == null) {
                    str3 = "Successful";
                }
                orderResultHeaderModel.k(str3);
            }
            r rVar7 = this.f34567b;
            if (rVar7 != null) {
                rVar7.f827d.c(r0.B(listBean.amount, false));
            }
            r rVar8 = this.f34567b;
            if (rVar8 != null && (orderStatusArrow = rVar8.f827d.getOrderStatusArrow()) != null) {
                orderStatusArrow.setVisibility(8);
            }
            r rVar9 = this.f34567b;
            if (rVar9 != null) {
                OrderResultHeaderModel orderResultHeaderModel2 = rVar9.f827d;
                OrderResultHeaderModel.a aVar = OrderResultHeaderModel.f31610A;
                String str4 = listBean.orderStatus;
                String str5 = str4 == null ? "Successful" : str4;
                redirectOrderDetailActivity = this;
                orderResultHeaderModel2.l(OrderResultHeaderModel.a.getOrderStatusIconByDes$default(aVar, redirectOrderDetailActivity, str5, 0.0f, 4, null));
            } else {
                redirectOrderDetailActivity = this;
            }
            r rVar10 = redirectOrderDetailActivity.f34567b;
            if (rVar10 != null) {
                rVar10.f826c.addView(new OrderResultItemModel(this, ErrorCodes.MALFORMED_URL_EXCEPTION, k.core_reference_no_2, listBean.orderNo));
            }
            r rVar11 = redirectOrderDetailActivity.f34567b;
            if (rVar11 != null) {
                rVar11.f826c.addView(new OrderResultItemModel(this, h.main_udpate_time, r0.N(listBean.updateTime)));
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        super.initStatusBar();
        initStatusBar(getColor(L6.b.ppColorBackgroundDark), true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(f.main_activity_redirect_order_detail, (ViewGroup) null, false);
        int i7 = e.layoutResultAmountList;
        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
        if (linearLayout != null) {
            i7 = e.layoutResultInfoList;
            if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = e.modelResultHeader;
                OrderResultHeaderModel orderResultHeaderModel = (OrderResultHeaderModel) p059e1.a.m(i7, viewInflate);
                if (orderResultHeaderModel != null) {
                    i7 = e.scrollView;
                    if (((NestedScrollView) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.titleBar;
                        if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                            r rVar = new r((LinearLayout) viewInflate, linearLayout, orderResultHeaderModel, 0);
                            this.f34567b = rVar;
                            return rVar;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
    }
}
