package com.transsnet.palmpay.credit.ui.activity.okcard;

import C0.G;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.viewmodel.ReportTransactionItem;
import com.transsnet.palmpay.credit.bean.resp.OcInstallmentQRBillDetailResp;
import com.transsnet.palmpay.custom_view.model.ModelAmountList;
import com.transsnet.palmpay.custom_view.model.ModelBillDetailTitle;
import com.transsnet.palmpay.custom_view.model.ModelCopyableText;
import com.transsnet.palmpay.custom_view.model.ModelTitleContentImg;
import com.transsnet.palmpay.custom_view.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p025ba.k;
import p284sb.A;
import p310ub.C2067b0;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "Credit OC分期账单详情页", path = "/credit_score/oc_install_bill_detail_activity")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/activity/okcard/OcInstallmentBillDetailActivity;", "LZa/d;", "<init>", "()V", "Landroid/view/View;", "p", "Landroid/view/View;", "getMPaymentPlanView", "()Landroid/view/View;", "setMPaymentPlanView", "(Landroid/view/View;)V", "mPaymentPlanView", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcInstallmentBillDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcInstallmentBillDetailActivity.kt\ncom/transsnet/palmpay/credit/ui/activity/okcard/OcInstallmentBillDetailActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n1#2:307\n*E\n"})
public final class OcInstallmentBillDetailActivity extends Za.d {

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public static final /* synthetic */ int f29507X = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f29508A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public TextView f29509B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f29510C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public TextView f29511H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ReportTransactionItem f29512L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public OcInstallmentQRBillDetailResp.OcInstallmentQRBillDetailData f29513M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final A f29514Q = new A(24);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ModelBillDetailTitle f29516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ModelTitleContentImg f29517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ModelTitleContentImg f29518g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ModelCopyableText f29519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f29520j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f29521o;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public View mPaymentPlanView;
    public ModelAmountList t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public LinearLayout f29523v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public RelativeLayout f29524w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return Ya.f.cs_oc_installment_bill_detail;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        if (TextUtils.isEmpty(this.f29515d)) {
            this.f29515d = getQueryParameter("orderNo");
        }
        showLoadingDialog(true);
        G.h(p221ob.c.f40268a).getInstallmentOrderDetail(this.f29515d).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C2067b0(this));
    }

    public final ModelAmountList n() {
        ModelAmountList modelAmountList = this.t;
        if (modelAmountList != null) {
            return modelAmountList;
        }
        Intrinsics.n("mModelAmountList");
        throw null;
    }

    public final ModelBillDetailTitle o() {
        ModelBillDetailTitle modelBillDetailTitle = this.f29516e;
        if (modelBillDetailTitle != null) {
            return modelBillDetailTitle;
        }
        Intrinsics.n("mModelBillDetailTitle");
        throw null;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i7 == 112) {
            F6.d.h(this.TAG, 3, "");
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    public final void setMPaymentPlanView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.mPaymentPlanView = view;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ARouter.getInstance().inject(this);
        ModelTitleContentImg modelTitleContentImg = (ModelTitleContentImg) findViewById(Ya.e.atubd_pay_method_message);
        Intrinsics.checkNotNullParameter(modelTitleContentImg, "<set-?>");
        this.f29517f = modelTitleContentImg;
        ModelTitleContentImg modelTitleContentImg2 = (ModelTitleContentImg) findViewById(Ya.e.atubd_bill_type);
        Intrinsics.checkNotNullParameter(modelTitleContentImg2, "<set-?>");
        this.f29518g = modelTitleContentImg2;
        ModelCopyableText modelCopyableText = (ModelCopyableText) findViewById(Ya.e.atubd_trading_number_tv);
        Intrinsics.checkNotNullParameter(modelCopyableText, "<set-?>");
        this.f29519i = modelCopyableText;
        TextView textView = (TextView) findViewById(Ya.e.atubd_order_date_tv);
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.f29520j = textView;
        TextView textView2 = (TextView) findViewById(Ya.e.atubd_post_date_tv);
        Intrinsics.checkNotNullParameter(textView2, "<set-?>");
        this.f29521o = textView2;
        setMPaymentPlanView(findViewById(Ya.e.payment_plan_ll));
        ModelAmountList modelAmountList = (ModelAmountList) findViewById(Ya.e.atubd_amount_list);
        Intrinsics.checkNotNullParameter(modelAmountList, "<set-?>");
        this.t = modelAmountList;
        LinearLayout linearLayout = (LinearLayout) findViewById(s.atubd_error_reason_area);
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.f29523v = linearLayout;
        TextView textView3 = (TextView) findViewById(s.atubd_error_reason_tv);
        Intrinsics.checkNotNullParameter(textView3, "<set-?>");
        this.f29508A = textView3;
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(s.atubd_contact_service_area);
        Intrinsics.checkNotNullParameter(relativeLayout, "<set-?>");
        this.f29524w = relativeLayout;
        TextView textView4 = (TextView) findViewById(s.atubd_contact_service_tv);
        Intrinsics.checkNotNullParameter(textView4, "<set-?>");
        this.f29509B = textView4;
        TextView textView5 = (TextView) findViewById(Ya.e.payment_plan_content_tv);
        Intrinsics.checkNotNullParameter(textView5, "<set-?>");
        this.f29510C = textView5;
        TextView textView6 = (TextView) findViewById(Ya.e.payment_plan_title_tv);
        Intrinsics.checkNotNullParameter(textView6, "<set-?>");
        this.f29511H = textView6;
        ModelBillDetailTitle modelBillDetailTitle = (ModelBillDetailTitle) findViewById(Ya.e.atubd_title_info_area);
        Intrinsics.checkNotNullParameter(modelBillDetailTitle, "<set-?>");
        this.f29516e = modelBillDetailTitle;
        ReportTransactionItem reportTransactionItem = (ReportTransactionItem) findViewById(Ya.e.airtime_report_item);
        Intrinsics.checkNotNullParameter(reportTransactionItem, "<set-?>");
        this.f29512L = reportTransactionItem;
        ModelTitleContentImg modelTitleContentImg3 = this.f29518g;
        if (modelTitleContentImg3 == null) {
            Intrinsics.n("mItemBillType");
            throw null;
        }
        modelTitleContentImg3.f31588d.setText(k.core_pay_shop);
        TextView textView7 = this.f29509B;
        if (textView7 == null) {
            Intrinsics.n("mContactServiceTv");
            throw null;
        }
        TextView textView8 = this.f29510C;
        if (textView8 == null) {
            Intrinsics.n("mPaymentPlanTv");
            throw null;
        }
        p220oa.h.q(this.f29514Q, textView7, textView8);
        View view = this.mPaymentPlanView;
        if (view == null) {
            Intrinsics.n("mPaymentPlanView");
            throw null;
        }
        p220oa.h.l(new A(23), view);
        ARouter.getInstance().inject(this);
    }
}
