package com.transsnet.palmpay.mall.ui.activity;

import Ab.D;
import Bc.C0106c;
import Ea.a;
import Fc.b;
import Fc.c;
import Ha.d;
import Pa.r0;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.h;
import com.transsnet.palmpay.core.bean.OrderInfoForCustomerService;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.callback.CompleteCallback;
import com.transsnet.palmpay.core.viewmodel.ReportTransactionItem;
import com.transsnet.palmpay.custom_view.model.ModelAmountList;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTextItem1;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelCopyableText;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.custom_view.s;
import com.transsnet.palmpay.mall.bean.rsp.MallPaymentOrderDetailRsp;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p025ba.k;
import p298tf.f;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/mall/payment_order_detail_page")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/mall/ui/activity/MallPaymentOrderDetailActivity;", "Lcom/transsnet/palmpay/core/base/h;", "Lcom/transsnet/palmpay/core/callback/CompleteCallback;", "Ljava/io/File;", "<init>", "()V", "module_mall_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MallPaymentOrderDetailActivity extends h implements CompleteCallback<File> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f32002e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f32004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f32005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0106c f32006d;

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        ImageView imageView;
        ModelBillDetailTextItem1 modelBillDetailTextItem1;
        TextView textView;
        TextView textView2;
        ModelBillDetailTextItem1 modelBillDetailTextItem2;
        ModelBillDetailTextItem1 modelBillDetailTextItem3;
        TextView textView3;
        TextView textView4;
        C0106c c0106c = this.f32006d;
        if (c0106c != null && (textView4 = ((ModelBillDetailTitle) c0106c.f678p).f31466c) != null) {
            textView4.setText(getString(k.core_palmbuy));
        }
        C0106c c0106c2 = this.f32006d;
        r0.t1(c0106c2 != null ? ((ModelBillDetailTitle) c0106c2.f678p).f31471i : null, a.c(TransType.TRANS_TYPE_PALMBUY, (14 & 2) != 0 ? null : -1, null, null));
        C0106c c0106c3 = this.f32006d;
        if (c0106c3 != null && (textView3 = ((ModelBillDetailTitle) c0106c3.f678p).f31466c) != null) {
            textView3.setText(getString(k.core_palmbuy));
        }
        C0106c c0106c4 = this.f32006d;
        if (c0106c4 != null && (modelBillDetailTextItem3 = ((ModelAmountList) c0106c4.f670c).f31434g) != null) {
            modelBillDetailTextItem3.setVisibility(8);
        }
        C0106c c0106c5 = this.f32006d;
        if (c0106c5 != null && (modelBillDetailTextItem2 = ((ModelAmountList) c0106c5.f670c).f31433f) != null) {
            modelBillDetailTextItem2.setVisibility(8);
        }
        C0106c c0106c6 = this.f32006d;
        if (c0106c6 != null && (textView2 = ((ModelTitleContentImg) c0106c6.f674g).f31588d) != null) {
            textView2.setText(k.core_palmbuy);
        }
        C0106c c0106c7 = this.f32006d;
        if (c0106c7 != null && (modelBillDetailTextItem1 = ((ModelAmountList) c0106c7.f670c).f31440w) != null && (textView = modelBillDetailTextItem1.f31454c) != null) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        C0106c c0106c8 = this.f32006d;
        if (c0106c8 == null || (imageView = ((ModelBillDetailTitle) c0106c8.f678p).t) == null) {
            return;
        }
        imageView.setOnClickListener(new d(this, 3));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final ViewBinding initViewBinding(Bundle bundle) {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(c.ma_activity_mall_payment_order_detail, (ViewGroup) null, false);
        int i7 = b.amountList;
        ModelAmountList modelAmountList = (ModelAmountList) p059e1.a.m(i7, viewInflate);
        if (modelAmountList != null) {
            i7 = b.common_report_item;
            ReportTransactionItem reportTransactionItem = (ReportTransactionItem) p059e1.a.m(i7, viewInflate);
            if (reportTransactionItem != null) {
                i7 = b.itemPayment;
                ModelTitleContentImg modelTitleContentImg = (ModelTitleContentImg) p059e1.a.m(i7, viewInflate);
                if (modelTitleContentImg != null) {
                    i7 = b.itemPaymentType;
                    ModelTitleContentImg modelTitleContentImg2 = (ModelTitleContentImg) p059e1.a.m(i7, viewInflate);
                    if (modelTitleContentImg2 != null) {
                        i7 = b.itemReport;
                        if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = b.scrollView;
                            ScrollView scrollView = (ScrollView) p059e1.a.m(i7, viewInflate);
                            if (scrollView != null) {
                                i7 = b.titleBar;
                                ModelBillDetailTitle modelBillDetailTitle = (ModelBillDetailTitle) p059e1.a.m(i7, viewInflate);
                                if (modelBillDetailTitle != null) {
                                    i7 = b.tvOrderNo;
                                    ModelCopyableText modelCopyableText = (ModelCopyableText) p059e1.a.m(i7, viewInflate);
                                    if (modelCopyableText != null) {
                                        i7 = b.tvPostDate;
                                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView != null) {
                                            i7 = b.tvTransDate;
                                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                            if (textView2 != null && (viewM = p059e1.a.m((i7 = b.viewFailReason), viewInflate)) != null) {
                                                C0106c c0106c = new C0106c((RelativeLayout) viewInflate, modelAmountList, reportTransactionItem, modelTitleContentImg, modelTitleContentImg2, scrollView, modelBillDetailTitle, modelCopyableText, textView, textView2, viewM);
                                                this.f32006d = c0106c;
                                                return c0106c;
                                            }
                                        }
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

    public final OrderInfoForCustomerService m(MallPaymentOrderDetailRsp mallPaymentOrderDetailRsp) {
        OrderInfoForCustomerService orderInfoForCustomerService = new OrderInfoForCustomerService();
        orderInfoForCustomerService.paymentType = getString(k.core_group_discount);
        orderInfoForCustomerService.amount = mallPaymentOrderDetailRsp.payAmount;
        orderInfoForCustomerService.fee = mallPaymentOrderDetailRsp.payFee;
        orderInfoForCustomerService.orderNumber = mallPaymentOrderDetailRsp.orderNo;
        orderInfoForCustomerService.orderStatus = mallPaymentOrderDetailRsp.orderStatusDesc;
        orderInfoForCustomerService.vat = mallPaymentOrderDetailRsp.taxFee;
        orderInfoForCustomerService.pointsUsed = 0L;
        orderInfoForCustomerService.pointsEarned = mallPaymentOrderDetailRsp.returnPoint;
        orderInfoForCustomerService.time = mallPaymentOrderDetailRsp.createTime;
        return orderInfoForCustomerService;
    }

    @Override // com.transsnet.palmpay.core.callback.CompleteCallback
    public final void onComplete(File[] fileArr) {
        ModelBillDetailTitle modelBillDetailTitle;
        ImageView imageView;
        File[] objects = fileArr;
        Intrinsics.checkNotNullParameter(objects, "objects");
        C0106c c0106c = this.f32006d;
        if (c0106c != null && (modelBillDetailTitle = (ModelBillDetailTitle) c0106c.f678p) != null && (imageView = modelBillDetailTitle.t) != null) {
            imageView.setVisibility(0);
        }
        ARouter.getInstance().build("/coreImpl/receipt_share_page").withSerializable("extra_data", objects[0]).navigation();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        String str = this.f32003a;
        if (str != null) {
            showLoadingDialog(true);
            Gc.c.f3323b.getInstance().f3324a.queryPaymentOrderDetail(str).k(f.f42629b).i(p071ef.b.a()).subscribe(new D(this, 10));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        this.f32003a = getQueryParameter("orderId");
        this.f32004b = (TextView) findViewById(s.textViewFailReason);
        this.f32005c = findViewById(b.viewFailReason);
    }
}
