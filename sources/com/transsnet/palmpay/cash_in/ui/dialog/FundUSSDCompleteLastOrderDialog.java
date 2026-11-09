package com.transsnet.palmpay.cash_in.ui.dialog;

import Ce.ViewOnClickListenerC0159a;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.cash_in.ui.dialog.FundUSSDCompleteLastOrderDialog;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;
import p355xf.C2131j;
import p366y9.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/dialog/FundUSSDCompleteLastOrderDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "orderNo", "Lcom/transsnet/palmpay/cash_in/ui/dialog/FundUSSDCompleteLastOrderDialog$DialUssdCallback;", "dialUssdCallback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/transsnet/palmpay/cash_in/ui/dialog/FundUSSDCompleteLastOrderDialog$DialUssdCallback;)V", "", "initViews", "()V", "Ljava/lang/String;", "getOrderNo", "()Ljava/lang/String;", "Lcom/transsnet/palmpay/cash_in/ui/dialog/FundUSSDCompleteLastOrderDialog$DialUssdCallback;", "getDialUssdCallback", "()Lcom/transsnet/palmpay/cash_in/ui/dialog/FundUSSDCompleteLastOrderDialog$DialUssdCallback;", "Landroid/widget/TextView;", "cdfucl_yes$delegate", "Lkotlin/Lazy;", "getCdfucl_yes", "()Landroid/widget/TextView;", "cdfucl_yes", "cdfucl_no$delegate", "getCdfucl_no", "cdfucl_no", "Landroid/view/View$OnClickListener;", "mOnclickListener", "Landroid/view/View$OnClickListener;", "DialUssdCallback", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FundUSSDCompleteLastOrderDialog extends b {

    /* JADX INFO: renamed from: cdfucl_no$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdfucl_no;

    /* JADX INFO: renamed from: cdfucl_yes$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdfucl_yes;

    @NotNull
    private final DialUssdCallback dialUssdCallback;

    @NotNull
    private final View.OnClickListener mOnclickListener;

    @Nullable
    private final String orderNo;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/cash_in/ui/dialog/FundUSSDCompleteLastOrderDialog$DialUssdCallback;", "", "dialUssd", "", "module_cash_in_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface DialUssdCallback {
        void dialUssd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundUSSDCompleteLastOrderDialog(@NotNull Context context, @Nullable String str, @NotNull DialUssdCallback dialUssdCallback) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dialUssdCallback, "dialUssdCallback");
        this.orderNo = str;
        this.dialUssdCallback = dialUssdCallback;
        final int i7 = 0;
        this.cdfucl_yes = C2131j.b(new Function0(this) { // from class: F9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundUSSDCompleteLastOrderDialog f2628b;

            {
                this.f2628b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return FundUSSDCompleteLastOrderDialog.cdfucl_yes_delegate$lambda$0(this.f2628b);
                    default:
                        return FundUSSDCompleteLastOrderDialog.cdfucl_no_delegate$lambda$1(this.f2628b);
                }
            }
        });
        final int i10 = 1;
        this.cdfucl_no = C2131j.b(new Function0(this) { // from class: F9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FundUSSDCompleteLastOrderDialog f2628b;

            {
                this.f2628b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return FundUSSDCompleteLastOrderDialog.cdfucl_yes_delegate$lambda$0(this.f2628b);
                    default:
                        return FundUSSDCompleteLastOrderDialog.cdfucl_no_delegate$lambda$1(this.f2628b);
                }
            }
        });
        this.mOnclickListener = new ViewOnClickListenerC0159a(this, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView cdfucl_no_delegate$lambda$1(FundUSSDCompleteLastOrderDialog fundUSSDCompleteLastOrderDialog) {
        return (TextView) fundUSSDCompleteLastOrderDialog.findViewById(p366y9.b.cdfucl_no);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView cdfucl_yes_delegate$lambda$0(FundUSSDCompleteLastOrderDialog fundUSSDCompleteLastOrderDialog) {
        return (TextView) fundUSSDCompleteLastOrderDialog.findViewById(p366y9.b.cdfucl_yes);
    }

    private final TextView getCdfucl_no() {
        Object value = this.cdfucl_no.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getCdfucl_yes() {
        Object value = this.cdfucl_yes.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mOnclickListener$lambda$2(FundUSSDCompleteLastOrderDialog fundUSSDCompleteLastOrderDialog, View view) {
        int id2 = view.getId();
        if (id2 == p366y9.b.cdfucl_no) {
            fundUSSDCompleteLastOrderDialog.dismiss();
            ARouter.getInstance().build("/cash_in_out/billdetail").withString("orderNo", fundUSSDCompleteLastOrderDialog.orderNo).withString("extra_type", "01").navigation();
        } else if (id2 == p366y9.b.cdfucl_yes) {
            DialUssdCallback dialUssdCallback = fundUSSDCompleteLastOrderDialog.dialUssdCallback;
            if (dialUssdCallback != null) {
                dialUssdCallback.dialUssd();
            }
            fundUSSDCompleteLastOrderDialog.dismiss();
        }
    }

    @NotNull
    public final DialUssdCallback getDialUssdCallback() {
        return this.dialUssdCallback;
    }

    @Nullable
    public final String getOrderNo() {
        return this.orderNo;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(c.ci_dialog_fund_ussd_complete_last_order);
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        h.q(this.mOnclickListener, getCdfucl_no(), getCdfucl_yes());
    }
}
