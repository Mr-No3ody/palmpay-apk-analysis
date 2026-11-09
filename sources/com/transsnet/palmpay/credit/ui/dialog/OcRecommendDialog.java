package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.core.base.BaseApplication;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001d\u0010&\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\"R\u001d\u0010+\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010-¨\u00061"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcRecommendDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "mAmount", "Landroid/view/View$OnClickListener;", "mClickListener", "<init>", "(Landroid/content/Context;Ljava/lang/Long;Landroid/view/View$OnClickListener;)V", "", "initViews", "()V", "", "title", "setDialogTitle", "(Ljava/lang/String;)V", "Landroid/text/SpannableStringBuilder;", FirebaseAnalytics.Param.CONTENT, "setContent", "(Landroid/text/SpannableStringBuilder;)V", "posBtTxt", "setPosBtTxt", "Ljava/lang/Long;", "Landroid/view/View$OnClickListener;", "Landroid/widget/Button;", "confirm_bt$delegate", "Lkotlin/Lazy;", "getConfirm_bt", "()Landroid/widget/Button;", "confirm_bt", "Landroid/widget/TextView;", "repay_date_tv$delegate", "getRepay_date_tv", "()Landroid/widget/TextView;", "repay_date_tv", "amount_tv$delegate", "getAmount_tv", "amount_tv", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "mTitle", "Ljava/lang/String;", "mContent", "Landroid/text/SpannableStringBuilder;", "mPosBtTxt", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRecommendDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: amount_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy amount_tv;

    /* JADX INFO: renamed from: confirm_bt$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy confirm_bt;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private final Long mAmount;

    @Nullable
    private final View.OnClickListener mClickListener;

    @Nullable
    private SpannableStringBuilder mContent;

    @Nullable
    private String mPosBtTxt;

    @Nullable
    private String mTitle;

    /* JADX INFO: renamed from: repay_date_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy repay_date_tv;

    public /* synthetic */ OcRecommendDialog(Context context, Long l5, View.OnClickListener onClickListener, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, l5, (i7 & 4) != 0 ? null : onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView amount_tv_delegate$lambda$2(OcRecommendDialog ocRecommendDialog) {
        return (TextView) ocRecommendDialog.findViewById(Ya.e.amount_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button confirm_bt_delegate$lambda$0(OcRecommendDialog ocRecommendDialog) {
        return (Button) ocRecommendDialog.findViewById(Ya.e.confirm_bt);
    }

    private final TextView getAmount_tv() {
        return (TextView) this.amount_tv.getValue();
    }

    private final Button getConfirm_bt() {
        return (Button) this.confirm_bt.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final TextView getRepay_date_tv() {
        return (TextView) this.repay_date_tv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$5(OcRecommendDialog ocRecommendDialog, View view) {
        View.OnClickListener onClickListener = ocRecommendDialog.mClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        } else {
            com.palmpay.lib.apm.launchcounter.util.d.x(null, "Coupon");
        }
        ocRecommendDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$3(OcRecommendDialog ocRecommendDialog) {
        return (ImageView) ocRecommendDialog.findViewById(Ya.e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView repay_date_tv_delegate$lambda$1(OcRecommendDialog ocRecommendDialog) {
        return (TextView) ocRecommendDialog.findViewById(Ya.e.repay_date_tv);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Button confirm_bt;
        TextView repay_date_tv;
        if (!TextUtils.isEmpty(this.mContent) && (repay_date_tv = getRepay_date_tv()) != null) {
            repay_date_tv.setText(this.mContent);
        }
        if (!TextUtils.isEmpty(this.mPosBtTxt) && (confirm_bt = getConfirm_bt()) != null) {
            confirm_bt.setText(this.mPosBtTxt);
        }
        TextView amount_tv = getAmount_tv();
        if (amount_tv != null) {
            String currencySymbol = BaseApplication.getCurrencySymbol();
            Long l5 = this.mAmount;
            amount_tv.setText(currencySymbol + Pa.r0.E(l5 != null ? l5.longValue() : 0L));
        }
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.H0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcRecommendDialog f29979b;

                {
                    this.f29979b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f29979b.dismiss();
                            break;
                        default:
                            OcRecommendDialog.initViews$lambda$5(this.f29979b, view);
                            break;
                    }
                }
            }, ivClose);
        }
        Button confirm_bt2 = getConfirm_bt();
        if (confirm_bt2 != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.H0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcRecommendDialog f29979b;

                {
                    this.f29979b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f29979b.dismiss();
                            break;
                        default:
                            OcRecommendDialog.initViews$lambda$5(this.f29979b, view);
                            break;
                    }
                }
            }, confirm_bt2);
        }
    }

    public final void setContent(@Nullable SpannableStringBuilder content) {
        this.mContent = content;
    }

    public final void setDialogTitle(@Nullable String title) {
        this.mTitle = title;
    }

    public final void setPosBtTxt(@Nullable String posBtTxt) {
        this.mPosBtTxt = posBtTxt;
    }

    public OcRecommendDialog(@Nullable Context context, @Nullable Long l5, @Nullable View.OnClickListener onClickListener) {
        super(context, Ya.f.cs_oc_recommend_dialog);
        this.mAmount = l5;
        this.mClickListener = onClickListener;
        final int i7 = 0;
        this.confirm_bt = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.G0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRecommendDialog f29975b;

            {
                this.f29975b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcRecommendDialog.confirm_bt_delegate$lambda$0(this.f29975b);
                    case 1:
                        return OcRecommendDialog.repay_date_tv_delegate$lambda$1(this.f29975b);
                    case 2:
                        return OcRecommendDialog.amount_tv_delegate$lambda$2(this.f29975b);
                    default:
                        return OcRecommendDialog.ivClose_delegate$lambda$3(this.f29975b);
                }
            }
        });
        final int i10 = 1;
        this.repay_date_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.G0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRecommendDialog f29975b;

            {
                this.f29975b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcRecommendDialog.confirm_bt_delegate$lambda$0(this.f29975b);
                    case 1:
                        return OcRecommendDialog.repay_date_tv_delegate$lambda$1(this.f29975b);
                    case 2:
                        return OcRecommendDialog.amount_tv_delegate$lambda$2(this.f29975b);
                    default:
                        return OcRecommendDialog.ivClose_delegate$lambda$3(this.f29975b);
                }
            }
        });
        final int i11 = 2;
        this.amount_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.G0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRecommendDialog f29975b;

            {
                this.f29975b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OcRecommendDialog.confirm_bt_delegate$lambda$0(this.f29975b);
                    case 1:
                        return OcRecommendDialog.repay_date_tv_delegate$lambda$1(this.f29975b);
                    case 2:
                        return OcRecommendDialog.amount_tv_delegate$lambda$2(this.f29975b);
                    default:
                        return OcRecommendDialog.ivClose_delegate$lambda$3(this.f29975b);
                }
            }
        });
        final int i12 = 3;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.G0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRecommendDialog f29975b;

            {
                this.f29975b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return OcRecommendDialog.confirm_bt_delegate$lambda$0(this.f29975b);
                    case 1:
                        return OcRecommendDialog.repay_date_tv_delegate$lambda$1(this.f29975b);
                    case 2:
                        return OcRecommendDialog.amount_tv_delegate$lambda$2(this.f29975b);
                    default:
                        return OcRecommendDialog.ivClose_delegate$lambda$3(this.f29975b);
                }
            }
        });
    }
}
