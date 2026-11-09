package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.launcher.ARouter;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 42\u00020\u0001:\u000256B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001f\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u001bR\u001d\u0010$\u001a\u0004\u0018\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010#R\u001d\u0010'\u001a\u0004\u0018\u00010 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b&\u0010#R\u001d\u0010,\u001a\u0004\u0018\u00010(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0011\u001a\u0004\b*\u0010+R\"\u0010-\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u0010\u000eR\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcReferEarnWithdrawDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/ui/dialog/OcReferEarnWithdrawDialog$WithdrawClickInterface;", "withdrawClickInterface", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/ui/dialog/OcReferEarnWithdrawDialog$WithdrawClickInterface;)V", "", "initViews", "()V", "", "type", "setType", "(I)V", "Landroid/widget/Button;", "btnConfirm$delegate", "Lkotlin/Lazy;", "getBtnConfirm", "()Landroid/widget/Button;", "btnConfirm", "btnCancel$delegate", "getBtnCancel", "btnCancel", "Landroid/widget/TextView;", "tvContent$delegate", "getTvContent", "()Landroid/widget/TextView;", "tvContent", "tvTitle$delegate", "getTvTitle", "tvTitle", "Landroid/widget/ImageView;", "ivStatus$delegate", "getIvStatus", "()Landroid/widget/ImageView;", "ivStatus", "ivClose$delegate", "getIvClose", "ivClose", "Landroidx/constraintlayout/widget/ConstraintLayout;", "viewContainer$delegate", "getViewContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "viewContainer", "withdrawType", "I", "getWithdrawType", "()I", "setWithdrawType", "mWithdrawClickInterface", "Lcom/transsnet/palmpay/credit/ui/dialog/OcReferEarnWithdrawDialog$WithdrawClickInterface;", "Companion", "a", "WithdrawClickInterface", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcReferEarnWithdrawDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: btnCancel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnCancel;

    /* JADX INFO: renamed from: btnConfirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnConfirm;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    /* JADX INFO: renamed from: ivStatus$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivStatus;

    @NotNull
    private WithdrawClickInterface mWithdrawClickInterface;

    /* JADX INFO: renamed from: tvContent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvContent;

    /* JADX INFO: renamed from: tvTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvTitle;

    /* JADX INFO: renamed from: viewContainer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewContainer;
    private int withdrawType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int WITHDRAW_TYPE_SUCC = 1;
    private static final int WITHDRAW_TYPE_PENDING = 2;
    private static final int WITHDRAW_TYPE_FAIL_NET = 3;
    private static final int WITHDRAW_TYPE_FAIL_RISK = 4;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcReferEarnWithdrawDialog$WithdrawClickInterface;", "", "inviteMote", "", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface WithdrawClickInterface {
        void inviteMote();
    }

    /* JADX INFO: renamed from: com.transsnet.palmpay.credit.ui.dialog.OcReferEarnWithdrawDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getWITHDRAW_TYPE_FAIL_NET() {
            return OcReferEarnWithdrawDialog.WITHDRAW_TYPE_FAIL_NET;
        }

        public final int getWITHDRAW_TYPE_FAIL_RISK() {
            return OcReferEarnWithdrawDialog.WITHDRAW_TYPE_FAIL_RISK;
        }

        public final int getWITHDRAW_TYPE_PENDING() {
            return OcReferEarnWithdrawDialog.WITHDRAW_TYPE_PENDING;
        }

        public final int getWITHDRAW_TYPE_SUCC() {
            return OcReferEarnWithdrawDialog.WITHDRAW_TYPE_SUCC;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OcReferEarnWithdrawDialog(@NotNull Context context, @NotNull WithdrawClickInterface withdrawClickInterface) {
        super(context, Ya.f.cs_layout_re_withdraw_dialog, com.transsnet.palmpay.custom_view.w.BaseDialogTheme);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(withdrawClickInterface, "withdrawClickInterface");
        final int i7 = 0;
        this.btnConfirm = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.J0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnWithdrawDialog f29987b;

            {
                this.f29987b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcReferEarnWithdrawDialog.btnConfirm_delegate$lambda$0(this.f29987b);
                    case 1:
                        return OcReferEarnWithdrawDialog.btnCancel_delegate$lambda$1(this.f29987b);
                    case 2:
                        return OcReferEarnWithdrawDialog.tvContent_delegate$lambda$2(this.f29987b);
                    case 3:
                        return OcReferEarnWithdrawDialog.tvTitle_delegate$lambda$3(this.f29987b);
                    case 4:
                        return OcReferEarnWithdrawDialog.ivStatus_delegate$lambda$4(this.f29987b);
                    case 5:
                        return OcReferEarnWithdrawDialog.ivClose_delegate$lambda$5(this.f29987b);
                    default:
                        return OcReferEarnWithdrawDialog.viewContainer_delegate$lambda$6(this.f29987b);
                }
            }
        });
        final int i10 = 1;
        this.btnCancel = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.J0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnWithdrawDialog f29987b;

            {
                this.f29987b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcReferEarnWithdrawDialog.btnConfirm_delegate$lambda$0(this.f29987b);
                    case 1:
                        return OcReferEarnWithdrawDialog.btnCancel_delegate$lambda$1(this.f29987b);
                    case 2:
                        return OcReferEarnWithdrawDialog.tvContent_delegate$lambda$2(this.f29987b);
                    case 3:
                        return OcReferEarnWithdrawDialog.tvTitle_delegate$lambda$3(this.f29987b);
                    case 4:
                        return OcReferEarnWithdrawDialog.ivStatus_delegate$lambda$4(this.f29987b);
                    case 5:
                        return OcReferEarnWithdrawDialog.ivClose_delegate$lambda$5(this.f29987b);
                    default:
                        return OcReferEarnWithdrawDialog.viewContainer_delegate$lambda$6(this.f29987b);
                }
            }
        });
        final int i11 = 2;
        this.tvContent = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.J0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnWithdrawDialog f29987b;

            {
                this.f29987b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return OcReferEarnWithdrawDialog.btnConfirm_delegate$lambda$0(this.f29987b);
                    case 1:
                        return OcReferEarnWithdrawDialog.btnCancel_delegate$lambda$1(this.f29987b);
                    case 2:
                        return OcReferEarnWithdrawDialog.tvContent_delegate$lambda$2(this.f29987b);
                    case 3:
                        return OcReferEarnWithdrawDialog.tvTitle_delegate$lambda$3(this.f29987b);
                    case 4:
                        return OcReferEarnWithdrawDialog.ivStatus_delegate$lambda$4(this.f29987b);
                    case 5:
                        return OcReferEarnWithdrawDialog.ivClose_delegate$lambda$5(this.f29987b);
                    default:
                        return OcReferEarnWithdrawDialog.viewContainer_delegate$lambda$6(this.f29987b);
                }
            }
        });
        final int i12 = 3;
        this.tvTitle = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.J0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnWithdrawDialog f29987b;

            {
                this.f29987b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return OcReferEarnWithdrawDialog.btnConfirm_delegate$lambda$0(this.f29987b);
                    case 1:
                        return OcReferEarnWithdrawDialog.btnCancel_delegate$lambda$1(this.f29987b);
                    case 2:
                        return OcReferEarnWithdrawDialog.tvContent_delegate$lambda$2(this.f29987b);
                    case 3:
                        return OcReferEarnWithdrawDialog.tvTitle_delegate$lambda$3(this.f29987b);
                    case 4:
                        return OcReferEarnWithdrawDialog.ivStatus_delegate$lambda$4(this.f29987b);
                    case 5:
                        return OcReferEarnWithdrawDialog.ivClose_delegate$lambda$5(this.f29987b);
                    default:
                        return OcReferEarnWithdrawDialog.viewContainer_delegate$lambda$6(this.f29987b);
                }
            }
        });
        final int i13 = 4;
        this.ivStatus = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.J0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnWithdrawDialog f29987b;

            {
                this.f29987b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return OcReferEarnWithdrawDialog.btnConfirm_delegate$lambda$0(this.f29987b);
                    case 1:
                        return OcReferEarnWithdrawDialog.btnCancel_delegate$lambda$1(this.f29987b);
                    case 2:
                        return OcReferEarnWithdrawDialog.tvContent_delegate$lambda$2(this.f29987b);
                    case 3:
                        return OcReferEarnWithdrawDialog.tvTitle_delegate$lambda$3(this.f29987b);
                    case 4:
                        return OcReferEarnWithdrawDialog.ivStatus_delegate$lambda$4(this.f29987b);
                    case 5:
                        return OcReferEarnWithdrawDialog.ivClose_delegate$lambda$5(this.f29987b);
                    default:
                        return OcReferEarnWithdrawDialog.viewContainer_delegate$lambda$6(this.f29987b);
                }
            }
        });
        final int i14 = 5;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.J0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnWithdrawDialog f29987b;

            {
                this.f29987b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return OcReferEarnWithdrawDialog.btnConfirm_delegate$lambda$0(this.f29987b);
                    case 1:
                        return OcReferEarnWithdrawDialog.btnCancel_delegate$lambda$1(this.f29987b);
                    case 2:
                        return OcReferEarnWithdrawDialog.tvContent_delegate$lambda$2(this.f29987b);
                    case 3:
                        return OcReferEarnWithdrawDialog.tvTitle_delegate$lambda$3(this.f29987b);
                    case 4:
                        return OcReferEarnWithdrawDialog.ivStatus_delegate$lambda$4(this.f29987b);
                    case 5:
                        return OcReferEarnWithdrawDialog.ivClose_delegate$lambda$5(this.f29987b);
                    default:
                        return OcReferEarnWithdrawDialog.viewContainer_delegate$lambda$6(this.f29987b);
                }
            }
        });
        final int i15 = 6;
        this.viewContainer = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.J0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcReferEarnWithdrawDialog f29987b;

            {
                this.f29987b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return OcReferEarnWithdrawDialog.btnConfirm_delegate$lambda$0(this.f29987b);
                    case 1:
                        return OcReferEarnWithdrawDialog.btnCancel_delegate$lambda$1(this.f29987b);
                    case 2:
                        return OcReferEarnWithdrawDialog.tvContent_delegate$lambda$2(this.f29987b);
                    case 3:
                        return OcReferEarnWithdrawDialog.tvTitle_delegate$lambda$3(this.f29987b);
                    case 4:
                        return OcReferEarnWithdrawDialog.ivStatus_delegate$lambda$4(this.f29987b);
                    case 5:
                        return OcReferEarnWithdrawDialog.ivClose_delegate$lambda$5(this.f29987b);
                    default:
                        return OcReferEarnWithdrawDialog.viewContainer_delegate$lambda$6(this.f29987b);
                }
            }
        });
        this.mWithdrawClickInterface = withdrawClickInterface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnCancel_delegate$lambda$1(OcReferEarnWithdrawDialog ocReferEarnWithdrawDialog) {
        return (Button) ocReferEarnWithdrawDialog.findViewById(Ya.e.btnCancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Button btnConfirm_delegate$lambda$0(OcReferEarnWithdrawDialog ocReferEarnWithdrawDialog) {
        return (Button) ocReferEarnWithdrawDialog.findViewById(Ya.e.btnConfirm);
    }

    private final Button getBtnCancel() {
        return (Button) this.btnCancel.getValue();
    }

    private final Button getBtnConfirm() {
        return (Button) this.btnConfirm.getValue();
    }

    private final ImageView getIvClose() {
        return (ImageView) this.ivClose.getValue();
    }

    private final ImageView getIvStatus() {
        return (ImageView) this.ivStatus.getValue();
    }

    private final TextView getTvContent() {
        return (TextView) this.tvContent.getValue();
    }

    private final TextView getTvTitle() {
        return (TextView) this.tvTitle.getValue();
    }

    private final ConstraintLayout getViewContainer() {
        return (ConstraintLayout) this.viewContainer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$7(OcReferEarnWithdrawDialog ocReferEarnWithdrawDialog, View view) {
        ocReferEarnWithdrawDialog.dismiss();
        ARouter.getInstance().build("/credit_score/oc_refer_earn_history_activity").withInt("ok_card_select_index", 1).navigation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$8(OcReferEarnWithdrawDialog ocReferEarnWithdrawDialog, View view) {
        WithdrawClickInterface withdrawClickInterface;
        ocReferEarnWithdrawDialog.dismiss();
        int i7 = ocReferEarnWithdrawDialog.withdrawType;
        if (i7 == WITHDRAW_TYPE_PENDING) {
            ARouter.getInstance().build("/credit_score/oc_refer_earn_history_activity").withInt("ok_card_select_index", 1).navigation();
        } else {
            if (i7 != WITHDRAW_TYPE_SUCC || (withdrawClickInterface = ocReferEarnWithdrawDialog.mWithdrawClickInterface) == null) {
                return;
            }
            withdrawClickInterface.inviteMote();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$5(OcReferEarnWithdrawDialog ocReferEarnWithdrawDialog) {
        return (ImageView) ocReferEarnWithdrawDialog.findViewById(Ya.e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivStatus_delegate$lambda$4(OcReferEarnWithdrawDialog ocReferEarnWithdrawDialog) {
        return (ImageView) ocReferEarnWithdrawDialog.findViewById(Ya.e.ivStatus);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvContent_delegate$lambda$2(OcReferEarnWithdrawDialog ocReferEarnWithdrawDialog) {
        return (TextView) ocReferEarnWithdrawDialog.findViewById(Ya.e.tvContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTitle_delegate$lambda$3(OcReferEarnWithdrawDialog ocReferEarnWithdrawDialog) {
        return (TextView) ocReferEarnWithdrawDialog.findViewById(Ya.e.tvTitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintLayout viewContainer_delegate$lambda$6(OcReferEarnWithdrawDialog ocReferEarnWithdrawDialog) {
        return (ConstraintLayout) ocReferEarnWithdrawDialog.findViewById(Ya.e.viewContainer);
    }

    public final int getWithdrawType() {
        return this.withdrawType;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Button btnCancel = getBtnCancel();
        if (btnCancel != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.I0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcReferEarnWithdrawDialog f29983b;

                {
                    this.f29983b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            OcReferEarnWithdrawDialog.initViews$lambda$7(this.f29983b, view);
                            break;
                        case 1:
                            OcReferEarnWithdrawDialog.initViews$lambda$8(this.f29983b, view);
                            break;
                        default:
                            this.f29983b.dismiss();
                            break;
                    }
                }
            }, btnCancel);
        }
        Button btnConfirm = getBtnConfirm();
        if (btnConfirm != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.I0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcReferEarnWithdrawDialog f29983b;

                {
                    this.f29983b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            OcReferEarnWithdrawDialog.initViews$lambda$7(this.f29983b, view);
                            break;
                        case 1:
                            OcReferEarnWithdrawDialog.initViews$lambda$8(this.f29983b, view);
                            break;
                        default:
                            this.f29983b.dismiss();
                            break;
                    }
                }
            }, btnConfirm);
        }
        ImageView ivClose = getIvClose();
        if (ivClose != null) {
            final int i11 = 2;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.I0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcReferEarnWithdrawDialog f29983b;

                {
                    this.f29983b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            OcReferEarnWithdrawDialog.initViews$lambda$7(this.f29983b, view);
                            break;
                        case 1:
                            OcReferEarnWithdrawDialog.initViews$lambda$8(this.f29983b, view);
                            break;
                        default:
                            this.f29983b.dismiss();
                            break;
                    }
                }
            }, ivClose);
        }
        ConstraintLayout viewContainer = getViewContainer();
        if (viewContainer != null) {
            viewContainer.setBackground(androidx.vectordrawable.graphics.drawable.q.a(getContext().getTheme(), getContext().getResources(), p025ba.d.core_oc_refer_earn_details_bg));
        }
    }

    public final void setType(int type) {
        this.withdrawType = type;
        if (type == WITHDRAW_TYPE_SUCC) {
            ImageView ivStatus = getIvStatus();
            if (ivStatus != null) {
                ivStatus.setImageResource(com.transsnet.palmpay.custom_view.r.cv_result_success);
            }
            TextView tvTitle = getTvTitle();
            if (tvTitle != null) {
                tvTitle.setText(getContext().getString(Ya.g.cs_succ_withdraw));
            }
            TextView tvContent = getTvContent();
            if (tvContent != null) {
                tvContent.setText(getContext().getString(Ya.g.cs_withdraw_balance));
            }
            Button btnCancel = getBtnCancel();
            if (btnCancel != null) {
                btnCancel.setText(getContext().getString(Ya.g.cs_view_record));
            }
            Button btnConfirm = getBtnConfirm();
            if (btnConfirm != null) {
                btnConfirm.setText(getContext().getString(Ya.g.cs_invite_mote));
                return;
            }
            return;
        }
        if (type == WITHDRAW_TYPE_PENDING) {
            ImageView ivStatus2 = getIvStatus();
            if (ivStatus2 != null) {
                ivStatus2.setImageResource(com.transsnet.palmpay.custom_view.r.cv_result_pending);
            }
            TextView tvTitle2 = getTvTitle();
            if (tvTitle2 != null) {
                tvTitle2.setText(getContext().getString(Ya.g.cs_pending));
            }
            TextView tvContent2 = getTvContent();
            if (tvContent2 != null) {
                tvContent2.setText(getContext().getString(Ya.g.cs_withdraw_pending));
            }
            Button btnCancel2 = getBtnCancel();
            if (btnCancel2 != null) {
                btnCancel2.setVisibility(8);
            }
            Button btnConfirm2 = getBtnConfirm();
            if (btnConfirm2 != null) {
                btnConfirm2.setText(getContext().getString(Ya.g.cs_view_record));
                return;
            }
            return;
        }
        if (type == WITHDRAW_TYPE_FAIL_NET) {
            ImageView ivStatus3 = getIvStatus();
            if (ivStatus3 != null) {
                ivStatus3.setImageResource(com.transsnet.palmpay.custom_view.r.cv_result_fail);
            }
            TextView tvTitle3 = getTvTitle();
            if (tvTitle3 != null) {
                tvTitle3.setText(getContext().getString(Ya.g.cs_withdraw_fail));
            }
            TextView tvContent3 = getTvContent();
            if (tvContent3 != null) {
                tvContent3.setText(getContext().getString(Ya.g.cs_withdraw_fail_net));
            }
            Button btnCancel3 = getBtnCancel();
            if (btnCancel3 != null) {
                btnCancel3.setVisibility(8);
            }
            Button btnConfirm3 = getBtnConfirm();
            if (btnConfirm3 != null) {
                btnConfirm3.setText(getContext().getString(Ya.g.cs_got_it));
                return;
            }
            return;
        }
        if (type == WITHDRAW_TYPE_FAIL_RISK) {
            ImageView ivStatus4 = getIvStatus();
            if (ivStatus4 != null) {
                ivStatus4.setImageResource(com.transsnet.palmpay.custom_view.r.cv_result_fail);
            }
            TextView tvTitle4 = getTvTitle();
            if (tvTitle4 != null) {
                tvTitle4.setText(getContext().getString(Ya.g.cs_withdraw_fail));
            }
            TextView tvContent4 = getTvContent();
            if (tvContent4 != null) {
                tvContent4.setText(getContext().getString(Ya.g.cs_withdraw_fail_risk));
            }
            Button btnCancel4 = getBtnCancel();
            if (btnCancel4 != null) {
                btnCancel4.setVisibility(8);
            }
            Button btnConfirm4 = getBtnConfirm();
            if (btnConfirm4 != null) {
                btnConfirm4.setText(getContext().getString(Ya.g.cs_got_it));
            }
        }
    }

    public final void setWithdrawType(int i7) {
        this.withdrawType = i7;
    }
}
