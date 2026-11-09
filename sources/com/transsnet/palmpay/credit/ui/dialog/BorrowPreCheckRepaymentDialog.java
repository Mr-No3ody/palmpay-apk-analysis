package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import com.adjust.sdk.Constants;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.credit.bean.OutstandingAccount;
import com.transsnet.palmpay.credit.bean.OutstandingContentInfoV2;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 E2\u00020\u0001:\u0002\bFB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\nH\u0014¢\u0006\u0004\b$\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u001d\u0010,\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010/\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010+R\u001d\u00102\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010)\u001a\u0004\b1\u0010+R\u001d\u00105\u001a\u0004\u0018\u00010'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R\u001d\u00109\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010)\u001a\u0004\b7\u00108R\u001d\u0010<\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b;\u00108R\u001d\u0010A\u001a\u0004\u0018\u00010=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010)\u001a\u0004\b?\u0010@R\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006G"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/BorrowPreCheckRepaymentDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "dialogContext", "Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfoV2;", "outstandingInfo", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfoV2;)V", "Lcom/transsnet/palmpay/credit/ui/dialog/g;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "logExposureOnce", "(Lcom/transsnet/palmpay/credit/ui/dialog/g;)V", "bindContent", "applyState", "bindActions", "()V", "Lcom/palmpay/lib/ui/button/PpButton;", "button", "", "backgroundColorRes", "textColorRes", "setButtonTheme", "(Lcom/palmpay/lib/ui/button/PpButton;II)V", Constants.SAMSUNG_PREINSTALL_CONTENT_URI_PATH, "", "resolveAmount", "(Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfoV2;)J", "", "resolveDueDateText", "(Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfoV2;)Ljava/lang/String;", "repaymentDate", "formatDueDate", "(Ljava/lang/Long;)Ljava/lang/String;", "resolveState", "(Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfoV2;)Lcom/transsnet/palmpay/credit/ui/dialog/g;", "initViews", "Landroid/content/Context;", "Lcom/transsnet/palmpay/credit/bean/OutstandingContentInfoV2;", "Landroid/widget/TextView;", "tvDesc$delegate", "Lkotlin/Lazy;", "getTvDesc", "()Landroid/widget/TextView;", "tvDesc", "tvTitle$delegate", "getTvTitle", "tvTitle", "tvOverdueLabel$delegate", "getTvOverdueLabel", "tvOverdueLabel", "tvOverdueAmount$delegate", "getTvOverdueAmount", "tvOverdueAmount", "btnCancel$delegate", "getBtnCancel", "()Lcom/palmpay/lib/ui/button/PpButton;", "btnCancel", "btnRepay$delegate", "getBtnRepay", "btnRepay", "Landroid/view/View;", "ivClose$delegate", "getIvClose", "()Landroid/view/View;", "ivClose", "", "exposureLogged", "Z", "Companion", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBorrowPreCheckRepaymentDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BorrowPreCheckRepaymentDialog.kt\ncom/transsnet/palmpay/credit/ui/dialog/BorrowPreCheckRepaymentDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
public final class BorrowPreCheckRepaymentDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String DATE_FORMAT_MONTH_DAY = "MMM dd";

    /* JADX INFO: renamed from: btnCancel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnCancel;

    /* JADX INFO: renamed from: btnRepay$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy btnRepay;

    @NotNull
    private final Context dialogContext;
    private boolean exposureLogged;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @NotNull
    private final OutstandingContentInfoV2 outstandingInfo;

    /* JADX INFO: renamed from: tvDesc$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvDesc;

    /* JADX INFO: renamed from: tvOverdueAmount$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvOverdueAmount;

    /* JADX INFO: renamed from: tvOverdueLabel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvOverdueLabel;

    /* JADX INFO: renamed from: tvTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvTitle;

    /* JADX INFO: renamed from: com.transsnet.palmpay.credit.ui.dialog.BorrowPreCheckRepaymentDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean canShow(@Nullable OutstandingContentInfoV2 outstandingContentInfoV2) {
            return (outstandingContentInfoV2 == null || outstandingContentInfoV2.amount == null || outstandingContentInfoV2.getRepaymentTime() == null) ? false : true;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BorrowPreCheckRepaymentDialog(@NotNull Context dialogContext, @NotNull OutstandingContentInfoV2 outstandingInfo) {
        super(dialogContext, Ya.f.cs_dialog_borrow_precheck_repayment);
        Intrinsics.checkNotNullParameter(dialogContext, "dialogContext");
        Intrinsics.checkNotNullParameter(outstandingInfo, "outstandingInfo");
        this.dialogContext = dialogContext;
        this.outstandingInfo = outstandingInfo;
        final int i7 = 0;
        this.tvDesc = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BorrowPreCheckRepaymentDialog f30092b;

            {
                this.f30092b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return BorrowPreCheckRepaymentDialog.tvDesc_delegate$lambda$0(this.f30092b);
                    case 1:
                        return BorrowPreCheckRepaymentDialog.tvTitle_delegate$lambda$1(this.f30092b);
                    case 2:
                        return BorrowPreCheckRepaymentDialog.tvOverdueLabel_delegate$lambda$2(this.f30092b);
                    case 3:
                        return BorrowPreCheckRepaymentDialog.tvOverdueAmount_delegate$lambda$3(this.f30092b);
                    case 4:
                        return BorrowPreCheckRepaymentDialog.btnCancel_delegate$lambda$4(this.f30092b);
                    case 5:
                        return BorrowPreCheckRepaymentDialog.btnRepay_delegate$lambda$5(this.f30092b);
                    default:
                        return BorrowPreCheckRepaymentDialog.ivClose_delegate$lambda$6(this.f30092b);
                }
            }
        });
        final int i10 = 1;
        this.tvTitle = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BorrowPreCheckRepaymentDialog f30092b;

            {
                this.f30092b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return BorrowPreCheckRepaymentDialog.tvDesc_delegate$lambda$0(this.f30092b);
                    case 1:
                        return BorrowPreCheckRepaymentDialog.tvTitle_delegate$lambda$1(this.f30092b);
                    case 2:
                        return BorrowPreCheckRepaymentDialog.tvOverdueLabel_delegate$lambda$2(this.f30092b);
                    case 3:
                        return BorrowPreCheckRepaymentDialog.tvOverdueAmount_delegate$lambda$3(this.f30092b);
                    case 4:
                        return BorrowPreCheckRepaymentDialog.btnCancel_delegate$lambda$4(this.f30092b);
                    case 5:
                        return BorrowPreCheckRepaymentDialog.btnRepay_delegate$lambda$5(this.f30092b);
                    default:
                        return BorrowPreCheckRepaymentDialog.ivClose_delegate$lambda$6(this.f30092b);
                }
            }
        });
        final int i11 = 2;
        this.tvOverdueLabel = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BorrowPreCheckRepaymentDialog f30092b;

            {
                this.f30092b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return BorrowPreCheckRepaymentDialog.tvDesc_delegate$lambda$0(this.f30092b);
                    case 1:
                        return BorrowPreCheckRepaymentDialog.tvTitle_delegate$lambda$1(this.f30092b);
                    case 2:
                        return BorrowPreCheckRepaymentDialog.tvOverdueLabel_delegate$lambda$2(this.f30092b);
                    case 3:
                        return BorrowPreCheckRepaymentDialog.tvOverdueAmount_delegate$lambda$3(this.f30092b);
                    case 4:
                        return BorrowPreCheckRepaymentDialog.btnCancel_delegate$lambda$4(this.f30092b);
                    case 5:
                        return BorrowPreCheckRepaymentDialog.btnRepay_delegate$lambda$5(this.f30092b);
                    default:
                        return BorrowPreCheckRepaymentDialog.ivClose_delegate$lambda$6(this.f30092b);
                }
            }
        });
        final int i12 = 3;
        this.tvOverdueAmount = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BorrowPreCheckRepaymentDialog f30092b;

            {
                this.f30092b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return BorrowPreCheckRepaymentDialog.tvDesc_delegate$lambda$0(this.f30092b);
                    case 1:
                        return BorrowPreCheckRepaymentDialog.tvTitle_delegate$lambda$1(this.f30092b);
                    case 2:
                        return BorrowPreCheckRepaymentDialog.tvOverdueLabel_delegate$lambda$2(this.f30092b);
                    case 3:
                        return BorrowPreCheckRepaymentDialog.tvOverdueAmount_delegate$lambda$3(this.f30092b);
                    case 4:
                        return BorrowPreCheckRepaymentDialog.btnCancel_delegate$lambda$4(this.f30092b);
                    case 5:
                        return BorrowPreCheckRepaymentDialog.btnRepay_delegate$lambda$5(this.f30092b);
                    default:
                        return BorrowPreCheckRepaymentDialog.ivClose_delegate$lambda$6(this.f30092b);
                }
            }
        });
        final int i13 = 4;
        this.btnCancel = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BorrowPreCheckRepaymentDialog f30092b;

            {
                this.f30092b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return BorrowPreCheckRepaymentDialog.tvDesc_delegate$lambda$0(this.f30092b);
                    case 1:
                        return BorrowPreCheckRepaymentDialog.tvTitle_delegate$lambda$1(this.f30092b);
                    case 2:
                        return BorrowPreCheckRepaymentDialog.tvOverdueLabel_delegate$lambda$2(this.f30092b);
                    case 3:
                        return BorrowPreCheckRepaymentDialog.tvOverdueAmount_delegate$lambda$3(this.f30092b);
                    case 4:
                        return BorrowPreCheckRepaymentDialog.btnCancel_delegate$lambda$4(this.f30092b);
                    case 5:
                        return BorrowPreCheckRepaymentDialog.btnRepay_delegate$lambda$5(this.f30092b);
                    default:
                        return BorrowPreCheckRepaymentDialog.ivClose_delegate$lambda$6(this.f30092b);
                }
            }
        });
        final int i14 = 5;
        this.btnRepay = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BorrowPreCheckRepaymentDialog f30092b;

            {
                this.f30092b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return BorrowPreCheckRepaymentDialog.tvDesc_delegate$lambda$0(this.f30092b);
                    case 1:
                        return BorrowPreCheckRepaymentDialog.tvTitle_delegate$lambda$1(this.f30092b);
                    case 2:
                        return BorrowPreCheckRepaymentDialog.tvOverdueLabel_delegate$lambda$2(this.f30092b);
                    case 3:
                        return BorrowPreCheckRepaymentDialog.tvOverdueAmount_delegate$lambda$3(this.f30092b);
                    case 4:
                        return BorrowPreCheckRepaymentDialog.btnCancel_delegate$lambda$4(this.f30092b);
                    case 5:
                        return BorrowPreCheckRepaymentDialog.btnRepay_delegate$lambda$5(this.f30092b);
                    default:
                        return BorrowPreCheckRepaymentDialog.ivClose_delegate$lambda$6(this.f30092b);
                }
            }
        });
        final int i15 = 6;
        this.ivClose = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BorrowPreCheckRepaymentDialog f30092b;

            {
                this.f30092b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return BorrowPreCheckRepaymentDialog.tvDesc_delegate$lambda$0(this.f30092b);
                    case 1:
                        return BorrowPreCheckRepaymentDialog.tvTitle_delegate$lambda$1(this.f30092b);
                    case 2:
                        return BorrowPreCheckRepaymentDialog.tvOverdueLabel_delegate$lambda$2(this.f30092b);
                    case 3:
                        return BorrowPreCheckRepaymentDialog.tvOverdueAmount_delegate$lambda$3(this.f30092b);
                    case 4:
                        return BorrowPreCheckRepaymentDialog.btnCancel_delegate$lambda$4(this.f30092b);
                    case 5:
                        return BorrowPreCheckRepaymentDialog.btnRepay_delegate$lambda$5(this.f30092b);
                    default:
                        return BorrowPreCheckRepaymentDialog.ivClose_delegate$lambda$6(this.f30092b);
                }
            }
        });
    }

    private final void applyState(EnumC1504g state) {
        if (state == EnumC1504g.f30112a) {
            setButtonTheme(getBtnCancel(), L6.b.ppColorErrorBackground, Ya.b.cs_overdue_txt_color);
            setButtonTheme(getBtnRepay(), Ya.b.cs_overdue_txt_color, L6.b.ppColorButtonTextWhite);
            TextView tvOverdueAmount = getTvOverdueAmount();
            if (tvOverdueAmount != null) {
                tvOverdueAmount.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorError, getContext()));
            }
            PpButton btnCancel = getBtnCancel();
            if (btnCancel != null) {
                p220oa.h.c(btnCancel);
                return;
            }
            return;
        }
        setButtonTheme(getBtnCancel(), L6.b.ppColorFlexiCashSecondary, Ya.b.cs_cl_main_color);
        setButtonTheme(getBtnRepay(), Ya.b.cs_cl_main_color, L6.b.ppColorButtonTextWhite);
        TextView tvOverdueAmount2 = getTvOverdueAmount();
        if (tvOverdueAmount2 != null) {
            tvOverdueAmount2.setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, getContext()));
        }
        PpButton btnCancel2 = getBtnCancel();
        if (btnCancel2 != null) {
            p220oa.h.C(btnCancel2);
        }
    }

    private final void bindActions() {
        View ivClose = getIvClose();
        if (ivClose != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BorrowPreCheckRepaymentDialog f30107b;

                {
                    this.f30107b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30107b.dismiss();
                            break;
                        case 1:
                            this.f30107b.dismiss();
                            break;
                        default:
                            BorrowPreCheckRepaymentDialog.bindActions$lambda$11(this.f30107b, view);
                            break;
                    }
                }
            }, ivClose);
        }
        PpButton btnCancel = getBtnCancel();
        if (btnCancel != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BorrowPreCheckRepaymentDialog f30107b;

                {
                    this.f30107b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30107b.dismiss();
                            break;
                        case 1:
                            this.f30107b.dismiss();
                            break;
                        default:
                            BorrowPreCheckRepaymentDialog.bindActions$lambda$11(this.f30107b, view);
                            break;
                    }
                }
            }, btnCancel);
        }
        PpButton btnRepay = getBtnRepay();
        if (btnRepay != null) {
            final int i11 = 2;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.f

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BorrowPreCheckRepaymentDialog f30107b;

                {
                    this.f30107b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.f30107b.dismiss();
                            break;
                        case 1:
                            this.f30107b.dismiss();
                            break;
                        default:
                            BorrowPreCheckRepaymentDialog.bindActions$lambda$11(this.f30107b, view);
                            break;
                    }
                }
            }, btnRepay);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x006d  */
    public static final void bindActions$lambda$11(BorrowPreCheckRepaymentDialog borrowPreCheckRepaymentDialog, View view) {
        Integer num;
        List<OutstandingAccount> list;
        List<OutstandingAccount> list2 = borrowPreCheckRepaymentDialog.outstandingInfo.outstandingAccounts;
        OutstandingAccount outstandingAccount = (list2 == null || list2.isEmpty() || (list = borrowPreCheckRepaymentDialog.outstandingInfo.outstandingAccounts) == null) ? null : list.get(0);
        OutstandingContentInfoV2 outstandingContentInfoV2 = borrowPreCheckRepaymentDialog.outstandingInfo;
        if (TextUtils.isEmpty(outstandingContentInfoV2 != null ? outstandingContentInfoV2.androidLink : null)) {
            List<OutstandingAccount> list3 = borrowPreCheckRepaymentDialog.outstandingInfo.outstandingAccounts;
            if ((list3 != null ? list3.size() : 0) > 0) {
                ARouter.getInstance().build("/credit_score/loan_home_activity").withString("tab", "repayment").withFlags(536870912).navigation();
            } else {
                if (((outstandingAccount == null || (num = outstandingAccount.outstandingBillCount) == null) ? 0 : num.intValue()) > 0) {
                    ARouter.getInstance().build("/credit_score/loan_home_activity").withString("tab", "repayment").withFlags(536870912).navigation();
                } else {
                    Context context = borrowPreCheckRepaymentDialog.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    OutstandingContentInfoV2 outstandingContentInfoV3 = borrowPreCheckRepaymentDialog.outstandingInfo;
                    Intrinsics.checkNotNullParameter(context, "context");
                    if (outstandingContentInfoV3 != null) {
                        org.chromium.support_lib_boundary.util.b.A(context, outstandingContentInfoV3.outstandingAccounts, false);
                    }
                }
            }
        } else {
            Pa.F.g(borrowPreCheckRepaymentDialog.getContext(), borrowPreCheckRepaymentDialog.outstandingInfo.androidLink);
        }
        borrowPreCheckRepaymentDialog.dismiss();
    }

    private final void bindContent(EnumC1504g state) {
        PpButton btnRepay;
        TextView tvOverdueLabel;
        TextView tvDesc;
        TextView tvTitle;
        String strB = Pa.r0.B(resolveAmount(this.outstandingInfo), true);
        TextView tvOverdueAmount = getTvOverdueAmount();
        if (tvOverdueAmount != null) {
            tvOverdueAmount.setText(strB);
        }
        OutstandingContentInfoV2 outstandingContentInfoV2 = this.outstandingInfo;
        if (!TextUtils.isEmpty(outstandingContentInfoV2 != null ? outstandingContentInfoV2.dialogTitle : null) && (tvTitle = getTvTitle()) != null) {
            OutstandingContentInfoV2 outstandingContentInfoV3 = this.outstandingInfo;
            tvTitle.setText(outstandingContentInfoV3 != null ? outstandingContentInfoV3.dialogTitle : null);
        }
        OutstandingContentInfoV2 outstandingContentInfoV4 = this.outstandingInfo;
        if (!TextUtils.isEmpty(outstandingContentInfoV4 != null ? outstandingContentInfoV4.dialogMessage : null) && (tvDesc = getTvDesc()) != null) {
            OutstandingContentInfoV2 outstandingContentInfoV5 = this.outstandingInfo;
            tvDesc.setText(outstandingContentInfoV5 != null ? outstandingContentInfoV5.dialogMessage : null);
        }
        OutstandingContentInfoV2 outstandingContentInfoV6 = this.outstandingInfo;
        if (!TextUtils.isEmpty(outstandingContentInfoV6 != null ? outstandingContentInfoV6.dialogSubTitle : null) && (tvOverdueLabel = getTvOverdueLabel()) != null) {
            OutstandingContentInfoV2 outstandingContentInfoV7 = this.outstandingInfo;
            tvOverdueLabel.setText(outstandingContentInfoV7 != null ? outstandingContentInfoV7.dialogSubTitle : null);
        }
        String str = this.outstandingInfo.button;
        if (str != null) {
            String str2 = StringsKt.F(str) ? null : str;
            if (str2 != null && (btnRepay = getBtnRepay()) != null) {
                btnRepay.setText(str2);
            }
        }
        applyState(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PpButton btnCancel_delegate$lambda$4(BorrowPreCheckRepaymentDialog borrowPreCheckRepaymentDialog) {
        return (PpButton) borrowPreCheckRepaymentDialog.findViewById(Ya.e.btnCancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PpButton btnRepay_delegate$lambda$5(BorrowPreCheckRepaymentDialog borrowPreCheckRepaymentDialog) {
        return (PpButton) borrowPreCheckRepaymentDialog.findViewById(Ya.e.btnRepay);
    }

    private final String formatDueDate(Long repaymentDate) {
        String strX1 = Pa.r0.X1(Long.valueOf(repaymentDate != null ? repaymentDate.longValue() : 0L), DATE_FORMAT_MONTH_DAY);
        Intrinsics.checkNotNullExpressionValue(strX1, "transformDateFormat(...)");
        return strX1;
    }

    private final PpButton getBtnCancel() {
        return (PpButton) this.btnCancel.getValue();
    }

    private final PpButton getBtnRepay() {
        return (PpButton) this.btnRepay.getValue();
    }

    private final View getIvClose() {
        return (View) this.ivClose.getValue();
    }

    private final TextView getTvDesc() {
        return (TextView) this.tvDesc.getValue();
    }

    private final TextView getTvOverdueAmount() {
        return (TextView) this.tvOverdueAmount.getValue();
    }

    private final TextView getTvOverdueLabel() {
        return (TextView) this.tvOverdueLabel.getValue();
    }

    private final TextView getTvTitle() {
        return (TextView) this.tvTitle.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View ivClose_delegate$lambda$6(BorrowPreCheckRepaymentDialog borrowPreCheckRepaymentDialog) {
        return borrowPreCheckRepaymentDialog.findViewById(Ya.e.ivClose);
    }

    private final void logExposureOnce(EnumC1504g state) {
        String str;
        String str2;
        Integer num;
        if (this.exposureLogged) {
            return;
        }
        this.exposureLogged = true;
        Set set = Eb.b.f2269a;
        OutstandingContentInfoV2 info = this.outstandingInfo;
        boolean z3 = state == EnumC1504g.f30112a;
        Intrinsics.checkNotNullParameter(info, "info");
        String str3 = z3 ? "Loan_Overdue_Pop_Show" : "Loan_Block_Pop_Show";
        List<OutstandingAccount> list = info.outstandingAccounts;
        OutstandingAccount outstandingAccount = list != null ? (OutstandingAccount) CollectionsKt.firstOrNull(list) : null;
        ViewEvent viewEvent = new ViewEvent(str3);
        if ((outstandingAccount == null || (num = outstandingAccount.accountType) == null || viewEvent.add("accountType", String.valueOf(num.intValue())) == null) && (str = info.loanProduct) != null) {
            viewEvent.add("loanProduct", str);
        }
        if (outstandingAccount != null && (str2 = outstandingAccount.loanProduct) != null) {
            viewEvent.add("loanProduct", str2);
        }
        Pa.n0.g().u(viewEvent);
    }

    private final long resolveAmount(OutstandingContentInfoV2 info) {
        Long l5 = info.amount;
        if (l5 != null) {
            return l5.longValue();
        }
        return 0L;
    }

    private final String resolveDueDateText(OutstandingContentInfoV2 info) {
        String string = this.dialogContext.getString(Ya.g.cs_borrow_precheck_due_on, formatDueDate(info.repaymentDateStamp));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    private final EnumC1504g resolveState(OutstandingContentInfoV2 info) {
        Long repaymentTime = info.getRepaymentTime();
        return (repaymentTime != null ? repaymentTime.longValue() : 0L) < System.currentTimeMillis() ? EnumC1504g.f30112a : EnumC1504g.f30113b;
    }

    private final void setButtonTheme(PpButton button, @ColorRes int backgroundColorRes, @ColorRes int textColorRes) {
        if (button != null) {
            button.setBackgroundTintList(ColorStateList.valueOf(this.dialogContext.getColor(backgroundColorRes)));
        }
        if (button != null) {
            button.setTextColor(this.dialogContext.getColor(textColorRes));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvDesc_delegate$lambda$0(BorrowPreCheckRepaymentDialog borrowPreCheckRepaymentDialog) {
        return (TextView) borrowPreCheckRepaymentDialog.findViewById(Ya.e.tvDesc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvOverdueAmount_delegate$lambda$3(BorrowPreCheckRepaymentDialog borrowPreCheckRepaymentDialog) {
        return (TextView) borrowPreCheckRepaymentDialog.findViewById(Ya.e.tvOverdueAmount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvOverdueLabel_delegate$lambda$2(BorrowPreCheckRepaymentDialog borrowPreCheckRepaymentDialog) {
        return (TextView) borrowPreCheckRepaymentDialog.findViewById(Ya.e.tvOverdueLabel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTitle_delegate$lambda$1(BorrowPreCheckRepaymentDialog borrowPreCheckRepaymentDialog) {
        return (TextView) borrowPreCheckRepaymentDialog.findViewById(Ya.e.tvTitle);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        EnumC1504g enumC1504gResolveState = resolveState(this.outstandingInfo);
        bindContent(enumC1504gResolveState);
        logExposureOnce(enumC1504gResolveState);
        bindActions();
    }
}
