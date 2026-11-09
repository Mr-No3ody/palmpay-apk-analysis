package com.transsnet.palmpay.send_money.ui.activity.pay_me;

import Ce.C0170l;
import Jd.c;
import L6.b;
import Pa.i0;
import Pa.r0;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.transsnet.palmpay.core.base.BaseMvvmActivity;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.custom_view.v;
import com.transsnet.palmpay.send_money.bean.resp.PosterAccountBean;
import com.transsnet.palmpay.send_money.ui.activity.pay_me.PayMeMerchantActivity;
import com.transsnet.palmpay.send_money.viewmodel.PayMeViewModel;
import com.transsnet.palmpay.util.ClipboardUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import p159kd.e;
import p159kd.f;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/send/pay_me_merchant")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/pay_me/PayMeMerchantActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/PayMeViewModel;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PayMeMerchantActivity extends BaseMvvmActivity<PayMeViewModel> implements View.OnClickListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f33315j = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f33316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f33317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f33319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f33320g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PosterAccountBean f33321i;

    public PayMeMerchantActivity() {
        final int i7 = 0;
        this.f33316c = C2131j.b(new Function0(this) { // from class: td.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayMeMerchantActivity f42600b;

            {
                this.f42600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayMeMerchantActivity payMeMerchantActivity = this.f42600b;
                switch (i7) {
                    case 0:
                        int i10 = PayMeMerchantActivity.f33315j;
                        return (TextView) payMeMerchantActivity.findViewById(p159kd.e.tv_how_to_use);
                    case 1:
                        int i11 = PayMeMerchantActivity.f33315j;
                        return (TextView) payMeMerchantActivity.findViewById(p159kd.e.tv_what_is);
                    case 2:
                        int i12 = PayMeMerchantActivity.f33315j;
                        return (RoundedTextView) payMeMerchantActivity.findViewById(p159kd.e.btn_copy_info);
                    case 3:
                        int i13 = PayMeMerchantActivity.f33315j;
                        return (RoundedTextView) payMeMerchantActivity.findViewById(p159kd.e.btn_download);
                    default:
                        int i14 = PayMeMerchantActivity.f33315j;
                        return (ImageView) payMeMerchantActivity.findViewById(p159kd.e.iv_account);
                }
            }
        });
        final int i10 = 1;
        this.f33317d = C2131j.b(new Function0(this) { // from class: td.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayMeMerchantActivity f42600b;

            {
                this.f42600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayMeMerchantActivity payMeMerchantActivity = this.f42600b;
                switch (i10) {
                    case 0:
                        int i11 = PayMeMerchantActivity.f33315j;
                        return (TextView) payMeMerchantActivity.findViewById(p159kd.e.tv_how_to_use);
                    case 1:
                        int i12 = PayMeMerchantActivity.f33315j;
                        return (TextView) payMeMerchantActivity.findViewById(p159kd.e.tv_what_is);
                    case 2:
                        int i13 = PayMeMerchantActivity.f33315j;
                        return (RoundedTextView) payMeMerchantActivity.findViewById(p159kd.e.btn_copy_info);
                    case 3:
                        int i14 = PayMeMerchantActivity.f33315j;
                        return (RoundedTextView) payMeMerchantActivity.findViewById(p159kd.e.btn_download);
                    default:
                        int i15 = PayMeMerchantActivity.f33315j;
                        return (ImageView) payMeMerchantActivity.findViewById(p159kd.e.iv_account);
                }
            }
        });
        final int i11 = 2;
        this.f33318e = C2131j.b(new Function0(this) { // from class: td.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayMeMerchantActivity f42600b;

            {
                this.f42600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayMeMerchantActivity payMeMerchantActivity = this.f42600b;
                switch (i11) {
                    case 0:
                        int i12 = PayMeMerchantActivity.f33315j;
                        return (TextView) payMeMerchantActivity.findViewById(p159kd.e.tv_how_to_use);
                    case 1:
                        int i13 = PayMeMerchantActivity.f33315j;
                        return (TextView) payMeMerchantActivity.findViewById(p159kd.e.tv_what_is);
                    case 2:
                        int i14 = PayMeMerchantActivity.f33315j;
                        return (RoundedTextView) payMeMerchantActivity.findViewById(p159kd.e.btn_copy_info);
                    case 3:
                        int i15 = PayMeMerchantActivity.f33315j;
                        return (RoundedTextView) payMeMerchantActivity.findViewById(p159kd.e.btn_download);
                    default:
                        int i16 = PayMeMerchantActivity.f33315j;
                        return (ImageView) payMeMerchantActivity.findViewById(p159kd.e.iv_account);
                }
            }
        });
        final int i12 = 3;
        this.f33319f = C2131j.b(new Function0(this) { // from class: td.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayMeMerchantActivity f42600b;

            {
                this.f42600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayMeMerchantActivity payMeMerchantActivity = this.f42600b;
                switch (i12) {
                    case 0:
                        int i13 = PayMeMerchantActivity.f33315j;
                        return (TextView) payMeMerchantActivity.findViewById(p159kd.e.tv_how_to_use);
                    case 1:
                        int i14 = PayMeMerchantActivity.f33315j;
                        return (TextView) payMeMerchantActivity.findViewById(p159kd.e.tv_what_is);
                    case 2:
                        int i15 = PayMeMerchantActivity.f33315j;
                        return (RoundedTextView) payMeMerchantActivity.findViewById(p159kd.e.btn_copy_info);
                    case 3:
                        int i16 = PayMeMerchantActivity.f33315j;
                        return (RoundedTextView) payMeMerchantActivity.findViewById(p159kd.e.btn_download);
                    default:
                        int i17 = PayMeMerchantActivity.f33315j;
                        return (ImageView) payMeMerchantActivity.findViewById(p159kd.e.iv_account);
                }
            }
        });
        final int i13 = 4;
        this.f33320g = C2131j.b(new Function0(this) { // from class: td.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayMeMerchantActivity f42600b;

            {
                this.f42600b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PayMeMerchantActivity payMeMerchantActivity = this.f42600b;
                switch (i13) {
                    case 0:
                        int i14 = PayMeMerchantActivity.f33315j;
                        return (TextView) payMeMerchantActivity.findViewById(p159kd.e.tv_how_to_use);
                    case 1:
                        int i15 = PayMeMerchantActivity.f33315j;
                        return (TextView) payMeMerchantActivity.findViewById(p159kd.e.tv_what_is);
                    case 2:
                        int i16 = PayMeMerchantActivity.f33315j;
                        return (RoundedTextView) payMeMerchantActivity.findViewById(p159kd.e.btn_copy_info);
                    case 3:
                        int i17 = PayMeMerchantActivity.f33315j;
                        return (RoundedTextView) payMeMerchantActivity.findViewById(p159kd.e.btn_download);
                    default:
                        int i18 = PayMeMerchantActivity.f33315j;
                        return (ImageView) payMeMerchantActivity.findViewById(p159kd.e.iv_account);
                }
            }
        });
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getLayoutId() {
        return f.sm_activity_pay_me_merchant;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v3) {
        PosterAccountBean posterAccountBean;
        Intrinsics.checkNotNullParameter(v3, "v");
        int id2 = v3.getId();
        if (id2 == e.btn_download) {
            C0170l c0170l = new C0170l(3);
            Object value = this.f33320g.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            r0.L1(null, c0170l, (ImageView) value);
            return;
        }
        if (id2 != e.btn_copy_info || (posterAccountBean = this.f33321i) == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Palmpay\n");
        sb2.append("Bank: Palmpay or Palmpay Limiter\n");
        sb2.append("Account Number: " + posterAccountBean.getMappingAccountNo() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("Name:" + posterAccountBean.getAccountName());
        ClipboardUtils.copyText(sb2);
        ToastUtils.showLong(v.cv_copy_successful);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(getColor(b.ppColorBackgroundLight));
        PosterAccountBean posterAccountBean = this.f33321i;
        if (posterAccountBean != null) {
            Object value = this.f33320g.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ImageView imageView = (ImageView) value;
            String strO = i0.o(posterAccountBean.getMappingAccountNo());
            Intrinsics.checkNotNullExpressionValue(strO, "getAccountWithSpace(...)");
            String strK = y.k(strO, " ", "-");
            String accountName = posterAccountBean.getAccountName();
            if (accountName == null) {
                accountName = "";
            }
            imageView.setImageBitmap(c.f(this, strK, accountName));
            Object value2 = this.f33317d.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            ((TextView) value2).setText(new SpanUtils().append("What is Pay Me number").setFontSize(16, true).setBold().appendLine().appendLine().append("Pay Me number is a great way to receive payments into your PalmPay account without exposing your mobile/account number.").appendLine().appendLine().append("Please note that the Pay Me number does not replace your PalmPay account number. It only serves as an alternative to your PalmPay account number in cases where you have concerns about exposing your mobile number.").appendLine().appendLine().append("You can use both numbers to receive payments if you wish.").create());
            Object value3 = this.f33316c.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            ((TextView) value3).setText(new SpanUtils().append("How to use Pay Me number").setFontSize(16, true).setBold().appendLine().appendLine().append("Step 1. Copy your Pay Me number and send to anyone you want to receive money from.").appendLine().appendLine().appendLine("Step 2. Guide the sender to:").appendLine("- Open any bank app and select Transfer menu").appendLine("- Select Bank Name - 'PalmPay'").appendLine("- Enter account number").appendLine("Your Pay Me number - " + posterAccountBean.getMappingAccountNo()).appendLine("- Confirm beneficiary name - ‘" + posterAccountBean.getAccountName() + "’").appendLine("- Complete transfer").create());
            Object value4 = this.f33319f.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((RoundedTextView) value4).setOnClickListener(this);
            Object value5 = this.f33318e.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            ((RoundedTextView) value5).setOnClickListener(this);
        }
    }
}
