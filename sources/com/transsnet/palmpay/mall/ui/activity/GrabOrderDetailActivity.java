package com.transsnet.palmpay.mall.ui.activity;

import Ab.D;
import Bc.f;
import Fc.b;
import Fc.c;
import Fc.d;
import Pa.r0;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.model.ModelAmountList;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem1;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelCopyableText;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import kotlin.Metadata;
import p059e1.a;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/mall/grab_order_detail_activity")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/mall/ui/activity/GrabOrderDetailActivity;", "Lcom/transsnet/palmpay/core/base/h;", "<init>", "()V", "module_mall_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GrabOrderDetailActivity extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f32001b;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewInflate = getLayoutInflater().inflate(c.ma_grab_order_detail, (ViewGroup) null, false);
        int i7 = b.amountList;
        ModelAmountList modelAmountList = (ModelAmountList) a.m(i7, viewInflate);
        if (modelAmountList != null) {
            i7 = b.scrollView;
            if (((ScrollView) a.m(i7, viewInflate)) != null) {
                i7 = b.titleBar;
                ModelBillDetailTitle modelBillDetailTitle = (ModelBillDetailTitle) a.m(i7, viewInflate);
                if (modelBillDetailTitle != null) {
                    i7 = b.viewBillType;
                    ModelTitleContentImg modelTitleContentImg = (ModelTitleContentImg) a.m(i7, viewInflate);
                    if (modelTitleContentImg != null) {
                        i7 = b.viewOrderDate;
                        TextView textView = (TextView) a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = b.viewPayMethod;
                            ModelTitleContentImg modelTitleContentImg2 = (ModelTitleContentImg) a.m(i7, viewInflate);
                            if (modelTitleContentImg2 != null) {
                                i7 = b.viewPostDate;
                                TextView textView2 = (TextView) a.m(i7, viewInflate);
                                if (textView2 != null) {
                                    i7 = b.viewTradeNo;
                                    ModelCopyableText modelCopyableText = (ModelCopyableText) a.m(i7, viewInflate);
                                    if (modelCopyableText != null) {
                                        f fVar = new f((RelativeLayout) viewInflate, modelAmountList, modelBillDetailTitle, modelTitleContentImg, textView, modelTitleContentImg2, textView2, modelCopyableText, 2);
                                        this.f32001b = fVar;
                                        return fVar;
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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String str = this.f32000a;
        if (str != null) {
            showLoadingDialog(true);
            Gc.c.f3323b.getInstance().f3324a.queryPaymentOrderDetail(str).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new D(this, 9));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ModelBillDetailTextItem1 modelBillDetailTextItem1;
        ModelBillDetailTextItem1 modelBillDetailTextItem2;
        TextView textView;
        this.f32000a = getIntent().getStringExtra("orderId");
        f fVar = this.f32001b;
        r0.t1(fVar != null ? ((ModelBillDetailTitle) fVar.f699e).f31471i : null, Ea.a.c(TransType.TRANS_TYPE_GRAB, (14 & 2) != 0 ? null : -1, null, null));
        f fVar2 = this.f32001b;
        if (fVar2 != null && (textView = ((ModelBillDetailTitle) fVar2.f699e).f31466c) != null) {
            textView.setText(getString(d.ma_ten_deals));
        }
        f fVar3 = this.f32001b;
        if (fVar3 != null && (modelBillDetailTextItem2 = ((ModelAmountList) fVar3.f698d).f31433f) != null) {
            modelBillDetailTextItem2.setVisibility(8);
        }
        f fVar4 = this.f32001b;
        if (fVar4 == null || (modelBillDetailTextItem1 = ((ModelAmountList) fVar4.f698d).f31434g) == null) {
            return;
        }
        modelBillDetailTextItem1.setVisibility(8);
    }
}
