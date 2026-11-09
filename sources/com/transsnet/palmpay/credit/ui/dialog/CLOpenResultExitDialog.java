package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.transsnet.palmpay.credit.bean.LoanHomeSource;
import com.transsnet.palmpay.credit.bean.resp.CLOpenAccountData;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001d\u0010\u0012\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLOpenResultExitDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/bean/resp/CLOpenAccountData;", "mData", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/bean/resp/CLOpenAccountData;)V", "", "setListener", "()V", "initViews", "Lcom/transsnet/palmpay/credit/bean/resp/CLOpenAccountData;", "Landroid/widget/Button;", "stop_discount$delegate", "Lkotlin/Lazy;", "getStop_discount", "()Landroid/widget/Button;", "stop_discount", "borrow_now_bt$delegate", "getBorrow_now_bt", "borrow_now_bt", "Landroid/widget/TextView;", "quite_dialog_content_tv$delegate", "getQuite_dialog_content_tv", "()Landroid/widget/TextView;", "quite_dialog_content_tv", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLOpenResultExitDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: borrow_now_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy borrow_now_bt;

    @Nullable
    private final CLOpenAccountData mData;

    /* JADX INFO: renamed from: quite_dialog_content_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy quite_dialog_content_tv;

    /* JADX INFO: renamed from: stop_discount$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy stop_discount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLOpenResultExitDialog(@NotNull Context context, @Nullable CLOpenAccountData cLOpenAccountData) {
        super(context, Ya.f.cs_cl_open_result_exit_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mData = cLOpenAccountData;
        final int i7 = 0;
        this.stop_discount = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultExitDialog f30052b;

            {
                this.f30052b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLOpenResultExitDialog.stop_discount_delegate$lambda$0(this.f30052b);
                    case 1:
                        return CLOpenResultExitDialog.borrow_now_bt_delegate$lambda$1(this.f30052b);
                    default:
                        return CLOpenResultExitDialog.quite_dialog_content_tv_delegate$lambda$2(this.f30052b);
                }
            }
        });
        final int i10 = 1;
        this.borrow_now_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultExitDialog f30052b;

            {
                this.f30052b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLOpenResultExitDialog.stop_discount_delegate$lambda$0(this.f30052b);
                    case 1:
                        return CLOpenResultExitDialog.borrow_now_bt_delegate$lambda$1(this.f30052b);
                    default:
                        return CLOpenResultExitDialog.quite_dialog_content_tv_delegate$lambda$2(this.f30052b);
                }
            }
        });
        final int i11 = 2;
        this.quite_dialog_content_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOpenResultExitDialog f30052b;

            {
                this.f30052b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLOpenResultExitDialog.stop_discount_delegate$lambda$0(this.f30052b);
                    case 1:
                        return CLOpenResultExitDialog.borrow_now_bt_delegate$lambda$1(this.f30052b);
                    default:
                        return CLOpenResultExitDialog.quite_dialog_content_tv_delegate$lambda$2(this.f30052b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button borrow_now_bt_delegate$lambda$1(CLOpenResultExitDialog cLOpenResultExitDialog) {
        return (Button) cLOpenResultExitDialog.findViewById(Ya.e.borrow_now_bt);
    }

    private final Button getBorrow_now_bt() {
        return (Button) this.borrow_now_bt.getValue();
    }

    private final TextView getQuite_dialog_content_tv() {
        return (TextView) this.quite_dialog_content_tv.getValue();
    }

    private final Button getStop_discount() {
        return (Button) this.stop_discount.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView quite_dialog_content_tv_delegate$lambda$2(CLOpenResultExitDialog cLOpenResultExitDialog) {
        return (TextView) cLOpenResultExitDialog.findViewById(Ya.e.quite_dialog_content_tv);
    }

    private final void setListener() {
        Button borrow_now_bt = getBorrow_now_bt();
        if (borrow_now_bt != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.V

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLOpenResultExitDialog f30056b;

                {
                    this.f30056b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            CLOpenResultExitDialog.setListener$lambda$3(this.f30056b, view);
                            break;
                        default:
                            this.f30056b.dismiss();
                            break;
                    }
                }
            }, borrow_now_bt);
        }
        Button stop_discount = getStop_discount();
        if (stop_discount != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.V

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLOpenResultExitDialog f30056b;

                {
                    this.f30056b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            CLOpenResultExitDialog.setListener$lambda$3(this.f30056b, view);
                            break;
                        default:
                            this.f30056b.dismiss();
                            break;
                    }
                }
            }, stop_discount);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$3(CLOpenResultExitDialog cLOpenResultExitDialog, View view) {
        Integer accountType;
        CLOpenAccountData cLOpenAccountData = cLOpenResultExitDialog.mData;
        int iIntValue = (cLOpenAccountData == null || (accountType = cLOpenAccountData.getAccountType()) == null) ? 7 : accountType.intValue();
        String str = iIntValue == 7 || iIntValue == 9 ? "LoanBorrowFlexiLoan" : "LoanBorrowHome";
        Bundle bundle = new Bundle();
        bundle.putInt("accountType", iIntValue);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String str2 = Eb.a.f2267a;
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str2);
        bundle.putString(LoanHomeSource.TRACK_PARAM_KEY, str2);
        com.palmpay.lib.apm.launchcounter.util.d.x(bundle, str);
        cLOpenResultExitDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button stop_discount_delegate$lambda$0(CLOpenResultExitDialog cLOpenResultExitDialog) {
        return (Button) cLOpenResultExitDialog.findViewById(Ya.e.stop_discount);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView quite_dialog_content_tv = getQuite_dialog_content_tv();
        if (quite_dialog_content_tv != null) {
            C0.G.w(this.mContext, Ya.b.cs_cl_main_color, com.horcrux.svg.d0.i(this.mContext, L6.b.ppColorTextNormal, com.horcrux.svg.d0.i(this.mContext, Ya.b.cs_cl_main_color, com.horcrux.svg.d0.i(this.mContext, L6.b.ppColorTextNormal, C0.G.i("Borrow now! Repay on time have change get"), " ").append(Pa.r0.F(15000000L)), " and"), " installment service"), quite_dialog_content_tv);
        }
        setListener();
    }
}
