package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u001d\u0010\u0011\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0014\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcApplyResultExitDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "mOffAmount", "<init>", "(Landroid/content/Context;Ljava/lang/Long;)V", "", "initViews", "()V", "Ljava/lang/Long;", "Landroid/widget/TextView;", "give_up_tv$delegate", "Lkotlin/Lazy;", "getGive_up_tv", "()Landroid/widget/TextView;", "give_up_tv", "use_tv$delegate", "getUse_tv", "use_tv", "off_amount_tv$delegate", "getOff_amount_tv", "off_amount_tv", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcApplyResultExitDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: give_up_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy give_up_tv;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @Nullable
    private final Long mOffAmount;

    /* JADX INFO: renamed from: off_amount_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy off_amount_tv;

    /* JADX INFO: renamed from: use_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy use_tv;

    public OcApplyResultExitDialog(@Nullable Context context, @Nullable Long l5) {
        super(context, Ya.f.cs_oc_apply_result_exit_dialog_layout);
        this.mOffAmount = l5;
        final int i7 = 0;
        this.give_up_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultExitDialog f30200b;

            {
                this.f30200b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcApplyResultExitDialog.give_up_tv_delegate$lambda$0(this.f30200b);
                    case 1:
                        return OcApplyResultExitDialog.use_tv_delegate$lambda$1(this.f30200b);
                    case 2:
                        return OcApplyResultExitDialog.off_amount_tv_delegate$lambda$2(this.f30200b);
                    default:
                        return OcApplyResultExitDialog.ivClose_delegate$lambda$3(this.f30200b);
                }
            }
        });
        final int i10 = 1;
        this.use_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultExitDialog f30200b;

            {
                this.f30200b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcApplyResultExitDialog.give_up_tv_delegate$lambda$0(this.f30200b);
                    case 1:
                        return OcApplyResultExitDialog.use_tv_delegate$lambda$1(this.f30200b);
                    case 2:
                        return OcApplyResultExitDialog.off_amount_tv_delegate$lambda$2(this.f30200b);
                    default:
                        return OcApplyResultExitDialog.ivClose_delegate$lambda$3(this.f30200b);
                }
            }
        });
        final int i11 = 2;
        this.off_amount_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultExitDialog f30200b;

            {
                this.f30200b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OcApplyResultExitDialog.give_up_tv_delegate$lambda$0(this.f30200b);
                    case 1:
                        return OcApplyResultExitDialog.use_tv_delegate$lambda$1(this.f30200b);
                    case 2:
                        return OcApplyResultExitDialog.off_amount_tv_delegate$lambda$2(this.f30200b);
                    default:
                        return OcApplyResultExitDialog.ivClose_delegate$lambda$3(this.f30200b);
                }
            }
        });
        final int i12 = 3;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.s0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcApplyResultExitDialog f30200b;

            {
                this.f30200b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return OcApplyResultExitDialog.give_up_tv_delegate$lambda$0(this.f30200b);
                    case 1:
                        return OcApplyResultExitDialog.use_tv_delegate$lambda$1(this.f30200b);
                    case 2:
                        return OcApplyResultExitDialog.off_amount_tv_delegate$lambda$2(this.f30200b);
                    default:
                        return OcApplyResultExitDialog.ivClose_delegate$lambda$3(this.f30200b);
                }
            }
        });
    }

    private final TextView getGive_up_tv() {
        return (TextView) this.give_up_tv.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final TextView getOff_amount_tv() {
        return (TextView) this.off_amount_tv.getValue();
    }

    private final TextView getUse_tv() {
        return (TextView) this.use_tv.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView give_up_tv_delegate$lambda$0(OcApplyResultExitDialog ocApplyResultExitDialog) {
        return (TextView) ocApplyResultExitDialog.findViewById(Ya.e.give_up_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$5(OcApplyResultExitDialog ocApplyResultExitDialog, View view) {
        ARouter.getInstance().build("/airtime/top_up_airtime").navigation();
        ocApplyResultExitDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$3(OcApplyResultExitDialog ocApplyResultExitDialog) {
        return (ImageView) ocApplyResultExitDialog.findViewById(Ya.e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView off_amount_tv_delegate$lambda$2(OcApplyResultExitDialog ocApplyResultExitDialog) {
        return (TextView) ocApplyResultExitDialog.findViewById(Ya.e.off_amount_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView use_tv_delegate$lambda$1(OcApplyResultExitDialog ocApplyResultExitDialog) {
        return (TextView) ocApplyResultExitDialog.findViewById(Ya.e.use_tv);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView off_amount_tv = getOff_amount_tv();
        if (off_amount_tv != null) {
            Context context = this.mContext;
            int i7 = Ya.g.cs_oc_off_amount;
            Long l5 = this.mOffAmount;
            off_amount_tv.setText(context.getString(i7, Pa.r0.B(l5 != null ? l5.longValue() : 0L, true)));
        }
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            final int i10 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.t0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcApplyResultExitDialog f30204b;

                {
                    this.f30204b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30204b.dismiss();
                            break;
                        case 1:
                            OcApplyResultExitDialog.initViews$lambda$5(this.f30204b, view);
                            break;
                        default:
                            this.f30204b.dismiss();
                            break;
                    }
                }
            }, ivClose);
        }
        TextView use_tv = getUse_tv();
        if (use_tv != null) {
            final int i11 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.t0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcApplyResultExitDialog f30204b;

                {
                    this.f30204b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.f30204b.dismiss();
                            break;
                        case 1:
                            OcApplyResultExitDialog.initViews$lambda$5(this.f30204b, view);
                            break;
                        default:
                            this.f30204b.dismiss();
                            break;
                    }
                }
            }, use_tv);
        }
        TextView give_up_tv = getGive_up_tv();
        if (give_up_tv != null) {
            final int i12 = 2;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.t0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcApplyResultExitDialog f30204b;

                {
                    this.f30204b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            this.f30204b.dismiss();
                            break;
                        case 1:
                            OcApplyResultExitDialog.initViews$lambda$5(this.f30204b, view);
                            break;
                        default:
                            this.f30204b.dismiss();
                            break;
                    }
                }
            }, give_up_tv);
        }
    }
}
