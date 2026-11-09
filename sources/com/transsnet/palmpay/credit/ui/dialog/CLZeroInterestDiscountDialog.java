package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.interfaces.ILoanCreditService;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLZeroInterestDiscountDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "loanProduct", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "", "findViews", "()V", "initViews", "Ljava/lang/String;", "getLoanProduct", "()Ljava/lang/String;", "Landroid/widget/ImageView;", "icon_close", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "tv_borrow_amount", "Landroid/widget/TextView;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLZeroInterestDiscountDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private ImageView icon_close;

    @Nullable
    private final String loanProduct;

    @Nullable
    private TextView tv_borrow_amount;

    public CLZeroInterestDiscountDialog(@Nullable Context context, @Nullable String str) {
        super(context, p116hb.d.cs_cl_zero_interest_discount_dialog_layout);
        this.loanProduct = str;
    }

    private final void findViews() {
        this.icon_close = (ImageView) findViewById(p116hb.c.icon_close);
        this.tv_borrow_amount = (TextView) findViewById(p116hb.c.tv_borrow_amount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$2(CLZeroInterestDiscountDialog cLZeroInterestDiscountDialog, View view) {
        cLZeroInterestDiscountDialog.dismiss();
        if (TextUtils.isEmpty(cLZeroInterestDiscountDialog.loanProduct)) {
            C0.G.z("/main/home", "source", "CASH_LOAN_HOME_CARD", "tab", "finance");
            return;
        }
        androidx.fragment.app.E activity = cLZeroInterestDiscountDialog.getActivity(cLZeroInterestDiscountDialog.getContext());
        if (activity != null) {
            ILoanCreditService iLoanCreditService = (ILoanCreditService) com.horcrux.svg.d0.m("/credit_score/loan_credit_service", "null cannot be cast to non-null type com.transsnet.palmpay.core.interfaces.ILoanCreditService");
            androidx.fragment.app.Z supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            iLoanCreditService.startBorrow(supportFragmentManager, cLZeroInterestDiscountDialog.loanProduct, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : 2, (124 & 16) != 0 ? null : null, null, null);
        }
    }

    @Nullable
    public final String getLoanProduct() {
        return this.loanProduct;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        findViews();
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth();
        attributes.height = -2;
        ImageView imageView = this.icon_close;
        if (imageView != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.h0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLZeroInterestDiscountDialog f30122b;

                {
                    this.f30122b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30122b.dismiss();
                            break;
                        default:
                            CLZeroInterestDiscountDialog.initViews$lambda$2(this.f30122b, view);
                            break;
                    }
                }
            }, imageView);
        }
        TextView textView = this.tv_borrow_amount;
        if (textView != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.h0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLZeroInterestDiscountDialog f30122b;

                {
                    this.f30122b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30122b.dismiss();
                            break;
                        default:
                            CLZeroInterestDiscountDialog.initViews$lambda$2(this.f30122b, view);
                            break;
                    }
                }
            }, textView);
        }
    }
}
