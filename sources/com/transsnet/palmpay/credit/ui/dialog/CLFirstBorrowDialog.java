package com.transsnet.palmpay.credit.ui.dialog;

import E.AbstractC0198c;
import android.content.Context;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001bR\u001d\u0010$\u001a\u0004\u0018\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#R\u001e\u0010%\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLFirstBorrowDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "repaymentDate", "mIncreaseAmt", "<init>", "(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/Long;)V", "", "initViews", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", FirebaseAnalytics.Param.CONTENT, "setContent", "(Ljava/lang/StringBuilder;)V", "Ljava/lang/Long;", "Landroid/widget/Button;", "how_to_repay_bt$delegate", "Lkotlin/Lazy;", "getHow_to_repay_bt", "()Landroid/widget/Button;", "how_to_repay_bt", "Landroid/widget/TextView;", "increase_tips_tv$delegate", "getIncrease_tips_tv", "()Landroid/widget/TextView;", "increase_tips_tv", "repayment_date_tv$delegate", "getRepayment_date_tv", "repayment_date_tv", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "mContent", "Ljava/lang/StringBuilder;", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLFirstBorrowDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: how_to_repay_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy how_to_repay_bt;

    /* JADX INFO: renamed from: increase_tips_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy increase_tips_tv;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private StringBuilder mContent;

    @Nullable
    private final Long mIncreaseAmt;

    @Nullable
    private final Long repaymentDate;

    /* JADX INFO: renamed from: repayment_date_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy repayment_date_tv;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CLFirstBorrowDialog(@NotNull Context context, @Nullable Long l5, @Nullable Long l6) {
        super(context, Ya.f.cs_cl_first_borrow_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        this.repaymentDate = l5;
        this.mIncreaseAmt = l6;
        final int i7 = 0;
        this.how_to_repay_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLFirstBorrowDialog f30206b;

            {
                this.f30206b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return CLFirstBorrowDialog.how_to_repay_bt_delegate$lambda$0(this.f30206b);
                    case 1:
                        return CLFirstBorrowDialog.increase_tips_tv_delegate$lambda$1(this.f30206b);
                    case 2:
                        return CLFirstBorrowDialog.repayment_date_tv_delegate$lambda$2(this.f30206b);
                    default:
                        return CLFirstBorrowDialog.ivClose_delegate$lambda$3(this.f30206b);
                }
            }
        });
        final int i10 = 1;
        this.increase_tips_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLFirstBorrowDialog f30206b;

            {
                this.f30206b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return CLFirstBorrowDialog.how_to_repay_bt_delegate$lambda$0(this.f30206b);
                    case 1:
                        return CLFirstBorrowDialog.increase_tips_tv_delegate$lambda$1(this.f30206b);
                    case 2:
                        return CLFirstBorrowDialog.repayment_date_tv_delegate$lambda$2(this.f30206b);
                    default:
                        return CLFirstBorrowDialog.ivClose_delegate$lambda$3(this.f30206b);
                }
            }
        });
        final int i11 = 2;
        this.repayment_date_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLFirstBorrowDialog f30206b;

            {
                this.f30206b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return CLFirstBorrowDialog.how_to_repay_bt_delegate$lambda$0(this.f30206b);
                    case 1:
                        return CLFirstBorrowDialog.increase_tips_tv_delegate$lambda$1(this.f30206b);
                    case 2:
                        return CLFirstBorrowDialog.repayment_date_tv_delegate$lambda$2(this.f30206b);
                    default:
                        return CLFirstBorrowDialog.ivClose_delegate$lambda$3(this.f30206b);
                }
            }
        });
        final int i12 = 3;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CLFirstBorrowDialog f30206b;

            {
                this.f30206b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return CLFirstBorrowDialog.how_to_repay_bt_delegate$lambda$0(this.f30206b);
                    case 1:
                        return CLFirstBorrowDialog.increase_tips_tv_delegate$lambda$1(this.f30206b);
                    case 2:
                        return CLFirstBorrowDialog.repayment_date_tv_delegate$lambda$2(this.f30206b);
                    default:
                        return CLFirstBorrowDialog.ivClose_delegate$lambda$3(this.f30206b);
                }
            }
        });
    }

    private final Button getHow_to_repay_bt() {
        return (Button) this.how_to_repay_bt.getValue();
    }

    private final TextView getIncrease_tips_tv() {
        return (TextView) this.increase_tips_tv.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final TextView getRepayment_date_tv() {
        return (TextView) this.repayment_date_tv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button how_to_repay_bt_delegate$lambda$0(CLFirstBorrowDialog cLFirstBorrowDialog) {
        return (Button) cLFirstBorrowDialog.findViewById(Ya.e.how_to_repay_bt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView increase_tips_tv_delegate$lambda$1(CLFirstBorrowDialog cLFirstBorrowDialog) {
        return (TextView) cLFirstBorrowDialog.findViewById(Ya.e.increase_tips_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$3(CLFirstBorrowDialog cLFirstBorrowDialog) {
        return (ImageView) cLFirstBorrowDialog.findViewById(Ya.e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView repayment_date_tv_delegate$lambda$2(CLFirstBorrowDialog cLFirstBorrowDialog) {
        return (TextView) cLFirstBorrowDialog.findViewById(Ya.e.repayment_date_tv);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView repayment_date_tv = getRepayment_date_tv();
        if (repayment_date_tv != null) {
            Long l5 = this.repaymentDate;
            String strX1 = Pa.r0.X1(Long.valueOf(l5 != null ? l5.longValue() : 0L), "dd");
            Intrinsics.checkNotNullExpressionValue(strX1, "transformDateFormat(...)");
            String strC = AbstractC0198c.C(Integer.parseInt(strX1));
            Long l6 = this.repaymentDate;
            repayment_date_tv.setText(strC + " " + Pa.r0.X1(Long.valueOf(l6 != null ? l6.longValue() : 0L), "MMM"));
        }
        TextView increase_tips_tv = getIncrease_tips_tv();
        if (increase_tips_tv != null) {
            SpanUtils foregroundColor = C0.G.i("For the first on-time repayment，you can get loan amount increase").setForegroundColor(this.mContext.getColor(L6.b.ppColorTextNormal));
            Long l8 = this.mIncreaseAmt;
            increase_tips_tv.setText(foregroundColor.append(" " + Pa.r0.B(l8 != null ? l8.longValue() : 0L, true)).setBold().setForegroundColor(this.mContext.getColor(Ya.b.cs_cl_main_color)).append(" (up to)").create());
        }
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            p220oa.h.l(new ViewOnClickListenerC1533v(this, 0), ivClose);
        }
        Button how_to_repay_bt = getHow_to_repay_bt();
        if (how_to_repay_bt != null) {
            p220oa.h.l(new ViewOnClickListenerC1478l(6), how_to_repay_bt);
        }
    }

    public final void setContent(@Nullable StringBuilder content) {
        this.mContent = content;
    }
}
