package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/AutomaticDebitDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Landroid/widget/TextView;", "tvConfirm$delegate", "Lkotlin/Lazy;", "getTvConfirm", "()Landroid/widget/TextView;", "tvConfirm", "extend_content_tv$delegate", "getExtend_content_tv", "extend_content_tv", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutomaticDebitDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: extend_content_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy extend_content_tv;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    /* JADX INFO: renamed from: tvConfirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvConfirm;

    public AutomaticDebitDialog(@Nullable Context context) {
        super(context, Ya.f.cs_cl_dialog_automatic_deduct);
        final int i7 = 0;
        this.tvConfirm = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutomaticDebitDialog f30086b;

            {
                this.f30086b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return AutomaticDebitDialog.tvConfirm_delegate$lambda$0(this.f30086b);
                    case 1:
                        return AutomaticDebitDialog.extend_content_tv_delegate$lambda$1(this.f30086b);
                    default:
                        return AutomaticDebitDialog.ivClose_delegate$lambda$2(this.f30086b);
                }
            }
        });
        final int i10 = 1;
        this.extend_content_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutomaticDebitDialog f30086b;

            {
                this.f30086b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return AutomaticDebitDialog.tvConfirm_delegate$lambda$0(this.f30086b);
                    case 1:
                        return AutomaticDebitDialog.extend_content_tv_delegate$lambda$1(this.f30086b);
                    default:
                        return AutomaticDebitDialog.ivClose_delegate$lambda$2(this.f30086b);
                }
            }
        });
        final int i11 = 2;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutomaticDebitDialog f30086b;

            {
                this.f30086b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return AutomaticDebitDialog.tvConfirm_delegate$lambda$0(this.f30086b);
                    case 1:
                        return AutomaticDebitDialog.extend_content_tv_delegate$lambda$1(this.f30086b);
                    default:
                        return AutomaticDebitDialog.ivClose_delegate$lambda$2(this.f30086b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView extend_content_tv_delegate$lambda$1(AutomaticDebitDialog automaticDebitDialog) {
        return (TextView) automaticDebitDialog.findViewById(Ya.e.extend_content_tv);
    }

    private final TextView getExtend_content_tv() {
        return (TextView) this.extend_content_tv.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final TextView getTvConfirm() {
        return (TextView) this.tvConfirm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$2(AutomaticDebitDialog automaticDebitDialog) {
        return (ImageView) automaticDebitDialog.findViewById(Ya.e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvConfirm_delegate$lambda$0(AutomaticDebitDialog automaticDebitDialog) {
        return (TextView) automaticDebitDialog.findViewById(Ya.e.tvConfirm);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView extend_content_tv = getExtend_content_tv();
        if (extend_content_tv != null) {
            C0.G.w(this.mContext, L6.b.ppColorTextNormal, com.horcrux.svg.d0.i(this.mContext, Ya.b.cs_cl_main_color_new, com.horcrux.svg.d0.i(this.mContext, L6.b.ppColorTextNormal, C0.G.i("The repayment date will be automatically deducted from the"), " PalmPay Balance/Cashbox/Bank card,"), " or the repayment can be made proactively"), extend_content_tv);
        }
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AutomaticDebitDialog f30082b;

                {
                    this.f30082b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30082b.dismiss();
                            break;
                        default:
                            this.f30082b.dismiss();
                            break;
                    }
                }
            }, ivClose);
        }
        TextView tvConfirm = getTvConfirm();
        if (tvConfirm != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AutomaticDebitDialog f30082b;

                {
                    this.f30082b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30082b.dismiss();
                            break;
                        default:
                            this.f30082b.dismiss();
                            break;
                    }
                }
            }, tvConfirm);
        }
    }
}
