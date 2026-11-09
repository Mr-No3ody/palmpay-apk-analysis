package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.credit.bean.rsp.CLMainOkCardBill;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001aR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLOcBillDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/bean/rsp/CLMainOkCardBill;", "mData", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/bean/rsp/CLMainOkCardBill;)V", "", "setListener", "()V", "initViews", "", "hasFocus", "onWindowFocusChanged", "(Z)V", "Lcom/transsnet/palmpay/credit/bean/rsp/CLMainOkCardBill;", "Landroid/widget/Button;", "cl_oc_repay_bt$delegate", "Lkotlin/Lazy;", "getCl_oc_repay_bt", "()Landroid/widget/Button;", "cl_oc_repay_bt", "Landroid/widget/TextView;", "cl_oc_amount_tv$delegate", "getCl_oc_amount_tv", "()Landroid/widget/TextView;", "cl_oc_amount_tv", "cl_oc_date_tv$delegate", "getCl_oc_date_tv", "cl_oc_date_tv", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLOcBillDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: cl_oc_amount_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cl_oc_amount_tv;

    /* JADX INFO: renamed from: cl_oc_date_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cl_oc_date_tv;

    /* JADX INFO: renamed from: cl_oc_repay_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cl_oc_repay_bt;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private final CLMainOkCardBill mData;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLOcBillDialog(@NotNull Context context, @Nullable CLMainOkCardBill cLMainOkCardBill) {
        super(context, Ya.f.cs_cl_oc_bill_dialog_layout);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mData = cLMainOkCardBill;
        final int i7 = 0;
        this.cl_oc_repay_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOcBillDialog f30006b;

            {
                this.f30006b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLOcBillDialog.cl_oc_repay_bt_delegate$lambda$0(this.f30006b);
                    case 1:
                        return CLOcBillDialog.cl_oc_amount_tv_delegate$lambda$1(this.f30006b);
                    case 2:
                        return CLOcBillDialog.cl_oc_date_tv_delegate$lambda$2(this.f30006b);
                    default:
                        return CLOcBillDialog.ivClose_delegate$lambda$3(this.f30006b);
                }
            }
        });
        final int i10 = 1;
        this.cl_oc_amount_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOcBillDialog f30006b;

            {
                this.f30006b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLOcBillDialog.cl_oc_repay_bt_delegate$lambda$0(this.f30006b);
                    case 1:
                        return CLOcBillDialog.cl_oc_amount_tv_delegate$lambda$1(this.f30006b);
                    case 2:
                        return CLOcBillDialog.cl_oc_date_tv_delegate$lambda$2(this.f30006b);
                    default:
                        return CLOcBillDialog.ivClose_delegate$lambda$3(this.f30006b);
                }
            }
        });
        final int i11 = 2;
        this.cl_oc_date_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOcBillDialog f30006b;

            {
                this.f30006b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLOcBillDialog.cl_oc_repay_bt_delegate$lambda$0(this.f30006b);
                    case 1:
                        return CLOcBillDialog.cl_oc_amount_tv_delegate$lambda$1(this.f30006b);
                    case 2:
                        return CLOcBillDialog.cl_oc_date_tv_delegate$lambda$2(this.f30006b);
                    default:
                        return CLOcBillDialog.ivClose_delegate$lambda$3(this.f30006b);
                }
            }
        });
        final int i12 = 3;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.O

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLOcBillDialog f30006b;

            {
                this.f30006b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return CLOcBillDialog.cl_oc_repay_bt_delegate$lambda$0(this.f30006b);
                    case 1:
                        return CLOcBillDialog.cl_oc_amount_tv_delegate$lambda$1(this.f30006b);
                    case 2:
                        return CLOcBillDialog.cl_oc_date_tv_delegate$lambda$2(this.f30006b);
                    default:
                        return CLOcBillDialog.ivClose_delegate$lambda$3(this.f30006b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView cl_oc_amount_tv_delegate$lambda$1(CLOcBillDialog cLOcBillDialog) {
        return (TextView) cLOcBillDialog.findViewById(Ya.e.cl_oc_amount_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView cl_oc_date_tv_delegate$lambda$2(CLOcBillDialog cLOcBillDialog) {
        return (TextView) cLOcBillDialog.findViewById(Ya.e.cl_oc_date_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button cl_oc_repay_bt_delegate$lambda$0(CLOcBillDialog cLOcBillDialog) {
        return (Button) cLOcBillDialog.findViewById(Ya.e.cl_oc_repay_bt);
    }

    private final TextView getCl_oc_amount_tv() {
        return (TextView) this.cl_oc_amount_tv.getValue();
    }

    private final TextView getCl_oc_date_tv() {
        return (TextView) this.cl_oc_date_tv.getValue();
    }

    private final Button getCl_oc_repay_bt() {
        return (Button) this.cl_oc_repay_bt.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$3(CLOcBillDialog cLOcBillDialog) {
        return (ImageView) cLOcBillDialog.findViewById(Ya.e.ivClose);
    }

    private final void setListener() {
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.N

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLOcBillDialog f30002b;

                {
                    this.f30002b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30002b.dismiss();
                            break;
                        default:
                            CLOcBillDialog.setListener$lambda$6(this.f30002b, view);
                            break;
                    }
                }
            }, ivClose);
        }
        Button cl_oc_repay_bt = getCl_oc_repay_bt();
        if (cl_oc_repay_bt != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.N

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLOcBillDialog f30002b;

                {
                    this.f30002b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30002b.dismiss();
                            break;
                        default:
                            CLOcBillDialog.setListener$lambda$6(this.f30002b, view);
                            break;
                    }
                }
            }, cl_oc_repay_bt);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setListener$lambda$6(CLOcBillDialog cLOcBillDialog, View view) {
        Postcard postcardBuild = ARouter.getInstance().build("/credit_score/oc_all_bill_activity");
        CLMainOkCardBill cLMainOkCardBill = cLOcBillDialog.mData;
        postcardBuild.withString("oc_card_no", cLMainOkCardBill != null ? cLMainOkCardBill.getCardNo() : null).withString("oc_bill_list_type", "oc_all_bill").navigation(cLOcBillDialog.getContext());
        cLOcBillDialog.dismiss();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Long outstandingAmount;
        Long repaymentDateStamp;
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        TextView cl_oc_date_tv = getCl_oc_date_tv();
        long jLongValue = 0;
        if (cl_oc_date_tv != null) {
            CLMainOkCardBill cLMainOkCardBill = this.mData;
            cl_oc_date_tv.setText(Pa.r0.X1(Long.valueOf((cLMainOkCardBill == null || (repaymentDateStamp = cLMainOkCardBill.getRepaymentDateStamp()) == null) ? 0L : repaymentDateStamp.longValue()), "dd MMM"));
        }
        TextView cl_oc_amount_tv = getCl_oc_amount_tv();
        if (cl_oc_amount_tv != null) {
            CLMainOkCardBill cLMainOkCardBill2 = this.mData;
            if (cLMainOkCardBill2 != null && (outstandingAmount = cLMainOkCardBill2.getOutstandingAmount()) != null) {
                jLongValue = outstandingAmount.longValue();
            }
            cl_oc_amount_tv.setText(Pa.r0.B(jLongValue, false));
        }
        setListener();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        View decorView3;
        super.onWindowFocusChanged(hasFocus);
        if (!hasFocus || getWindow() == null) {
            return;
        }
        Window window3 = getWindow();
        if (((window3 == null || (decorView3 = window3.getDecorView()) == null || decorView3.getHeight() != 0) && ((window = getWindow()) == null || (decorView = window.getDecorView()) == null || decorView.getWidth() != 0)) || (window2 = getWindow()) == null || (decorView2 = window2.getDecorView()) == null) {
            return;
        }
        decorView2.requestLayout();
    }
}
