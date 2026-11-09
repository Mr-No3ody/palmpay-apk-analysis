package com.transsnet.palmpay.core.dialog;

import Pa.i0;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.uimanager.ViewProps;
import com.transsnet.palmpay.core.callback.ResultCallback;
import com.transsnet.palmpay.core.dialog.ConfirmLargeAndRecipientInfoDialog;
import com.transsnet.palmpay.core.ui.widget.AmountUnitLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.ScreenUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p025ba.l;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJE\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00072\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00072\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010#R\u001b\u0010*\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001b\u0010-\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010#R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010!\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010!\u001a\u0004\b5\u00106R\u001b\u0010:\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010!\u001a\u0004\b9\u00106R\u001b\u0010=\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010!\u001a\u0004\b<\u0010#R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010!\u001a\u0004\b@\u0010AR\u001e\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010D¨\u0006F"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/ConfirmLargeAndRecipientInfoDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "", "type", "", "bankName", "accountNo", "verifiedName", "", "amount", "", "isNotActive", "updateUi", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DZ)V", "Lcom/transsnet/palmpay/core/callback/ResultCallback;", "callback", "setResultCallback", "(Lcom/transsnet/palmpay/core/callback/ResultCallback;)V", "setRecheckCallback", "Landroid/view/View;", "v", ViewProps.ON_CLICK, "(Landroid/view/View;)V", "Landroid/widget/TextView;", "mBankNameTv$delegate", "Lkotlin/Lazy;", "getMBankNameTv", "()Landroid/widget/TextView;", "mBankNameTv", "mAccountNoTv$delegate", "getMAccountNoTv", "mAccountNoTv", "mVerifiedNameTv$delegate", "getMVerifiedNameTv", "mVerifiedNameTv", "tvMessage$delegate", "getTvMessage", "tvMessage", "Landroid/widget/LinearLayout;", "llRemark$delegate", "getLlRemark", "()Landroid/widget/LinearLayout;", "llRemark", "Lcom/transsnet/palmpay/core/ui/widget/AmountUnitLayout;", "mAmountLayout$delegate", "getMAmountLayout", "()Lcom/transsnet/palmpay/core/ui/widget/AmountUnitLayout;", "mAmountLayout", "mTvAmount$delegate", "getMTvAmount", "mTvAmount", "mTvTitle$delegate", "getMTvTitle", "mTvTitle", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mCslAmount$delegate", "getMCslAmount", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "mCslAmount", "mResultCallback", "Lcom/transsnet/palmpay/core/callback/ResultCallback;", "mResultRecheckCallback", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfirmLargeAndRecipientInfoDialog extends com.transsnet.palmpay.custom_view.dialog.b implements View.OnClickListener {

    /* JADX INFO: renamed from: llRemark$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy llRemark;

    /* JADX INFO: renamed from: mAccountNoTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAccountNoTv;

    /* JADX INFO: renamed from: mAmountLayout$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAmountLayout;

    /* JADX INFO: renamed from: mBankNameTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mBankNameTv;

    /* JADX INFO: renamed from: mCslAmount$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mCslAmount;

    @Nullable
    private ResultCallback<Boolean> mResultCallback;

    @Nullable
    private ResultCallback<Boolean> mResultRecheckCallback;

    /* JADX INFO: renamed from: mTvAmount$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mTvAmount;

    /* JADX INFO: renamed from: mTvTitle$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mTvTitle;

    /* JADX INFO: renamed from: mVerifiedNameTv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mVerifiedNameTv;

    /* JADX INFO: renamed from: tvMessage$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvMessage;

    public ConfirmLargeAndRecipientInfoDialog(@Nullable Context context) {
        super(context);
        final int i7 = 0;
        this.mBankNameTv = C2131j.b(new Function0(this) { // from class: ma.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmLargeAndRecipientInfoDialog f39595b;

            {
                this.f39595b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return ConfirmLargeAndRecipientInfoDialog.mBankNameTv_delegate$lambda$0(this.f39595b);
                    case 1:
                        return ConfirmLargeAndRecipientInfoDialog.mAccountNoTv_delegate$lambda$1(this.f39595b);
                    case 2:
                        return ConfirmLargeAndRecipientInfoDialog.mVerifiedNameTv_delegate$lambda$2(this.f39595b);
                    case 3:
                        return ConfirmLargeAndRecipientInfoDialog.tvMessage_delegate$lambda$3(this.f39595b);
                    case 4:
                        return ConfirmLargeAndRecipientInfoDialog.llRemark_delegate$lambda$4(this.f39595b);
                    case 5:
                        return ConfirmLargeAndRecipientInfoDialog.mAmountLayout_delegate$lambda$5(this.f39595b);
                    case 6:
                        return ConfirmLargeAndRecipientInfoDialog.mTvAmount_delegate$lambda$6(this.f39595b);
                    case 7:
                        return ConfirmLargeAndRecipientInfoDialog.mTvTitle_delegate$lambda$7(this.f39595b);
                    default:
                        return ConfirmLargeAndRecipientInfoDialog.mCslAmount_delegate$lambda$8(this.f39595b);
                }
            }
        });
        final int i10 = 1;
        this.mAccountNoTv = C2131j.b(new Function0(this) { // from class: ma.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmLargeAndRecipientInfoDialog f39595b;

            {
                this.f39595b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ConfirmLargeAndRecipientInfoDialog.mBankNameTv_delegate$lambda$0(this.f39595b);
                    case 1:
                        return ConfirmLargeAndRecipientInfoDialog.mAccountNoTv_delegate$lambda$1(this.f39595b);
                    case 2:
                        return ConfirmLargeAndRecipientInfoDialog.mVerifiedNameTv_delegate$lambda$2(this.f39595b);
                    case 3:
                        return ConfirmLargeAndRecipientInfoDialog.tvMessage_delegate$lambda$3(this.f39595b);
                    case 4:
                        return ConfirmLargeAndRecipientInfoDialog.llRemark_delegate$lambda$4(this.f39595b);
                    case 5:
                        return ConfirmLargeAndRecipientInfoDialog.mAmountLayout_delegate$lambda$5(this.f39595b);
                    case 6:
                        return ConfirmLargeAndRecipientInfoDialog.mTvAmount_delegate$lambda$6(this.f39595b);
                    case 7:
                        return ConfirmLargeAndRecipientInfoDialog.mTvTitle_delegate$lambda$7(this.f39595b);
                    default:
                        return ConfirmLargeAndRecipientInfoDialog.mCslAmount_delegate$lambda$8(this.f39595b);
                }
            }
        });
        final int i11 = 2;
        this.mVerifiedNameTv = C2131j.b(new Function0(this) { // from class: ma.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmLargeAndRecipientInfoDialog f39595b;

            {
                this.f39595b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ConfirmLargeAndRecipientInfoDialog.mBankNameTv_delegate$lambda$0(this.f39595b);
                    case 1:
                        return ConfirmLargeAndRecipientInfoDialog.mAccountNoTv_delegate$lambda$1(this.f39595b);
                    case 2:
                        return ConfirmLargeAndRecipientInfoDialog.mVerifiedNameTv_delegate$lambda$2(this.f39595b);
                    case 3:
                        return ConfirmLargeAndRecipientInfoDialog.tvMessage_delegate$lambda$3(this.f39595b);
                    case 4:
                        return ConfirmLargeAndRecipientInfoDialog.llRemark_delegate$lambda$4(this.f39595b);
                    case 5:
                        return ConfirmLargeAndRecipientInfoDialog.mAmountLayout_delegate$lambda$5(this.f39595b);
                    case 6:
                        return ConfirmLargeAndRecipientInfoDialog.mTvAmount_delegate$lambda$6(this.f39595b);
                    case 7:
                        return ConfirmLargeAndRecipientInfoDialog.mTvTitle_delegate$lambda$7(this.f39595b);
                    default:
                        return ConfirmLargeAndRecipientInfoDialog.mCslAmount_delegate$lambda$8(this.f39595b);
                }
            }
        });
        final int i12 = 3;
        this.tvMessage = C2131j.b(new Function0(this) { // from class: ma.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmLargeAndRecipientInfoDialog f39595b;

            {
                this.f39595b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ConfirmLargeAndRecipientInfoDialog.mBankNameTv_delegate$lambda$0(this.f39595b);
                    case 1:
                        return ConfirmLargeAndRecipientInfoDialog.mAccountNoTv_delegate$lambda$1(this.f39595b);
                    case 2:
                        return ConfirmLargeAndRecipientInfoDialog.mVerifiedNameTv_delegate$lambda$2(this.f39595b);
                    case 3:
                        return ConfirmLargeAndRecipientInfoDialog.tvMessage_delegate$lambda$3(this.f39595b);
                    case 4:
                        return ConfirmLargeAndRecipientInfoDialog.llRemark_delegate$lambda$4(this.f39595b);
                    case 5:
                        return ConfirmLargeAndRecipientInfoDialog.mAmountLayout_delegate$lambda$5(this.f39595b);
                    case 6:
                        return ConfirmLargeAndRecipientInfoDialog.mTvAmount_delegate$lambda$6(this.f39595b);
                    case 7:
                        return ConfirmLargeAndRecipientInfoDialog.mTvTitle_delegate$lambda$7(this.f39595b);
                    default:
                        return ConfirmLargeAndRecipientInfoDialog.mCslAmount_delegate$lambda$8(this.f39595b);
                }
            }
        });
        final int i13 = 4;
        this.llRemark = C2131j.b(new Function0(this) { // from class: ma.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmLargeAndRecipientInfoDialog f39595b;

            {
                this.f39595b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ConfirmLargeAndRecipientInfoDialog.mBankNameTv_delegate$lambda$0(this.f39595b);
                    case 1:
                        return ConfirmLargeAndRecipientInfoDialog.mAccountNoTv_delegate$lambda$1(this.f39595b);
                    case 2:
                        return ConfirmLargeAndRecipientInfoDialog.mVerifiedNameTv_delegate$lambda$2(this.f39595b);
                    case 3:
                        return ConfirmLargeAndRecipientInfoDialog.tvMessage_delegate$lambda$3(this.f39595b);
                    case 4:
                        return ConfirmLargeAndRecipientInfoDialog.llRemark_delegate$lambda$4(this.f39595b);
                    case 5:
                        return ConfirmLargeAndRecipientInfoDialog.mAmountLayout_delegate$lambda$5(this.f39595b);
                    case 6:
                        return ConfirmLargeAndRecipientInfoDialog.mTvAmount_delegate$lambda$6(this.f39595b);
                    case 7:
                        return ConfirmLargeAndRecipientInfoDialog.mTvTitle_delegate$lambda$7(this.f39595b);
                    default:
                        return ConfirmLargeAndRecipientInfoDialog.mCslAmount_delegate$lambda$8(this.f39595b);
                }
            }
        });
        final int i14 = 5;
        this.mAmountLayout = C2131j.b(new Function0(this) { // from class: ma.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmLargeAndRecipientInfoDialog f39595b;

            {
                this.f39595b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return ConfirmLargeAndRecipientInfoDialog.mBankNameTv_delegate$lambda$0(this.f39595b);
                    case 1:
                        return ConfirmLargeAndRecipientInfoDialog.mAccountNoTv_delegate$lambda$1(this.f39595b);
                    case 2:
                        return ConfirmLargeAndRecipientInfoDialog.mVerifiedNameTv_delegate$lambda$2(this.f39595b);
                    case 3:
                        return ConfirmLargeAndRecipientInfoDialog.tvMessage_delegate$lambda$3(this.f39595b);
                    case 4:
                        return ConfirmLargeAndRecipientInfoDialog.llRemark_delegate$lambda$4(this.f39595b);
                    case 5:
                        return ConfirmLargeAndRecipientInfoDialog.mAmountLayout_delegate$lambda$5(this.f39595b);
                    case 6:
                        return ConfirmLargeAndRecipientInfoDialog.mTvAmount_delegate$lambda$6(this.f39595b);
                    case 7:
                        return ConfirmLargeAndRecipientInfoDialog.mTvTitle_delegate$lambda$7(this.f39595b);
                    default:
                        return ConfirmLargeAndRecipientInfoDialog.mCslAmount_delegate$lambda$8(this.f39595b);
                }
            }
        });
        final int i15 = 6;
        this.mTvAmount = C2131j.b(new Function0(this) { // from class: ma.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmLargeAndRecipientInfoDialog f39595b;

            {
                this.f39595b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return ConfirmLargeAndRecipientInfoDialog.mBankNameTv_delegate$lambda$0(this.f39595b);
                    case 1:
                        return ConfirmLargeAndRecipientInfoDialog.mAccountNoTv_delegate$lambda$1(this.f39595b);
                    case 2:
                        return ConfirmLargeAndRecipientInfoDialog.mVerifiedNameTv_delegate$lambda$2(this.f39595b);
                    case 3:
                        return ConfirmLargeAndRecipientInfoDialog.tvMessage_delegate$lambda$3(this.f39595b);
                    case 4:
                        return ConfirmLargeAndRecipientInfoDialog.llRemark_delegate$lambda$4(this.f39595b);
                    case 5:
                        return ConfirmLargeAndRecipientInfoDialog.mAmountLayout_delegate$lambda$5(this.f39595b);
                    case 6:
                        return ConfirmLargeAndRecipientInfoDialog.mTvAmount_delegate$lambda$6(this.f39595b);
                    case 7:
                        return ConfirmLargeAndRecipientInfoDialog.mTvTitle_delegate$lambda$7(this.f39595b);
                    default:
                        return ConfirmLargeAndRecipientInfoDialog.mCslAmount_delegate$lambda$8(this.f39595b);
                }
            }
        });
        final int i16 = 7;
        this.mTvTitle = C2131j.b(new Function0(this) { // from class: ma.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmLargeAndRecipientInfoDialog f39595b;

            {
                this.f39595b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return ConfirmLargeAndRecipientInfoDialog.mBankNameTv_delegate$lambda$0(this.f39595b);
                    case 1:
                        return ConfirmLargeAndRecipientInfoDialog.mAccountNoTv_delegate$lambda$1(this.f39595b);
                    case 2:
                        return ConfirmLargeAndRecipientInfoDialog.mVerifiedNameTv_delegate$lambda$2(this.f39595b);
                    case 3:
                        return ConfirmLargeAndRecipientInfoDialog.tvMessage_delegate$lambda$3(this.f39595b);
                    case 4:
                        return ConfirmLargeAndRecipientInfoDialog.llRemark_delegate$lambda$4(this.f39595b);
                    case 5:
                        return ConfirmLargeAndRecipientInfoDialog.mAmountLayout_delegate$lambda$5(this.f39595b);
                    case 6:
                        return ConfirmLargeAndRecipientInfoDialog.mTvAmount_delegate$lambda$6(this.f39595b);
                    case 7:
                        return ConfirmLargeAndRecipientInfoDialog.mTvTitle_delegate$lambda$7(this.f39595b);
                    default:
                        return ConfirmLargeAndRecipientInfoDialog.mCslAmount_delegate$lambda$8(this.f39595b);
                }
            }
        });
        final int i17 = 8;
        this.mCslAmount = C2131j.b(new Function0(this) { // from class: ma.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmLargeAndRecipientInfoDialog f39595b;

            {
                this.f39595b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return ConfirmLargeAndRecipientInfoDialog.mBankNameTv_delegate$lambda$0(this.f39595b);
                    case 1:
                        return ConfirmLargeAndRecipientInfoDialog.mAccountNoTv_delegate$lambda$1(this.f39595b);
                    case 2:
                        return ConfirmLargeAndRecipientInfoDialog.mVerifiedNameTv_delegate$lambda$2(this.f39595b);
                    case 3:
                        return ConfirmLargeAndRecipientInfoDialog.tvMessage_delegate$lambda$3(this.f39595b);
                    case 4:
                        return ConfirmLargeAndRecipientInfoDialog.llRemark_delegate$lambda$4(this.f39595b);
                    case 5:
                        return ConfirmLargeAndRecipientInfoDialog.mAmountLayout_delegate$lambda$5(this.f39595b);
                    case 6:
                        return ConfirmLargeAndRecipientInfoDialog.mTvAmount_delegate$lambda$6(this.f39595b);
                    case 7:
                        return ConfirmLargeAndRecipientInfoDialog.mTvTitle_delegate$lambda$7(this.f39595b);
                    default:
                        return ConfirmLargeAndRecipientInfoDialog.mCslAmount_delegate$lambda$8(this.f39595b);
                }
            }
        });
    }

    private final LinearLayout getLlRemark() {
        Object value = this.llRemark.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    private final TextView getMAccountNoTv() {
        Object value = this.mAccountNoTv.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final AmountUnitLayout getMAmountLayout() {
        Object value = this.mAmountLayout.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AmountUnitLayout) value;
    }

    private final TextView getMBankNameTv() {
        Object value = this.mBankNameTv.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final ConstraintLayout getMCslAmount() {
        Object value = this.mCslAmount.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ConstraintLayout) value;
    }

    private final AmountUnitLayout getMTvAmount() {
        Object value = this.mTvAmount.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AmountUnitLayout) value;
    }

    private final TextView getMTvTitle() {
        Object value = this.mTvTitle.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getMVerifiedNameTv() {
        Object value = this.mVerifiedNameTv.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvMessage() {
        Object value = this.tvMessage.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinearLayout llRemark_delegate$lambda$4(ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog) {
        return (LinearLayout) confirmLargeAndRecipientInfoDialog.findViewById(p025ba.e.llRemark);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mAccountNoTv_delegate$lambda$1(ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog) {
        return (TextView) confirmLargeAndRecipientInfoDialog.findViewById(p025ba.e.tv2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AmountUnitLayout mAmountLayout_delegate$lambda$5(ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog) {
        return (AmountUnitLayout) confirmLargeAndRecipientInfoDialog.findViewById(p025ba.e.amountLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mBankNameTv_delegate$lambda$0(ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog) {
        return (TextView) confirmLargeAndRecipientInfoDialog.findViewById(p025ba.e.tv3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConstraintLayout mCslAmount_delegate$lambda$8(ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog) {
        return (ConstraintLayout) confirmLargeAndRecipientInfoDialog.findViewById(p025ba.e.cslAmount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AmountUnitLayout mTvAmount_delegate$lambda$6(ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog) {
        return (AmountUnitLayout) confirmLargeAndRecipientInfoDialog.findViewById(p025ba.e.tvAmount);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mTvTitle_delegate$lambda$7(ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog) {
        return (TextView) confirmLargeAndRecipientInfoDialog.findViewById(p025ba.e.tvTitle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView mVerifiedNameTv_delegate$lambda$2(ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog) {
        return (TextView) confirmLargeAndRecipientInfoDialog.findViewById(p025ba.e.tv1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvMessage_delegate$lambda$3(ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog) {
        return (TextView) confirmLargeAndRecipientInfoDialog.findViewById(p025ba.e.tvMessage);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_confirm_transfer_bottom_info);
        findViewById(p025ba.e.tvConfirm).setOnClickListener(this);
        findViewById(p025ba.e.ivClose).setOnClickListener(this);
        findViewById(p025ba.e.tvRecheck).setOnClickListener(this);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setWindowAnimations(l.dialog_bottom_in_out);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = ScreenUtils.getScreenWidth();
            attributes.height = -2;
            window.setAttributes(attributes);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View v3) {
        ResultCallback<Boolean> resultCallback;
        Integer numValueOf = v3 != null ? Integer.valueOf(v3.getId()) : null;
        int i7 = p025ba.e.tvConfirm;
        if (numValueOf != null && numValueOf.intValue() == i7) {
            ResultCallback<Boolean> resultCallback2 = this.mResultCallback;
            if (resultCallback2 != null) {
                resultCallback2.onComplete(Boolean.TRUE);
            }
        } else {
            int i10 = p025ba.e.tvRecheck;
            if (numValueOf != null && numValueOf.intValue() == i10 && (resultCallback = this.mResultRecheckCallback) != null) {
                resultCallback.onComplete(Boolean.TRUE);
            }
        }
        dismiss();
    }

    public final void setRecheckCallback(@Nullable ResultCallback<Boolean> callback) {
        this.mResultRecheckCallback = callback;
    }

    public final void setResultCallback(@Nullable ResultCallback<Boolean> callback) {
        this.mResultCallback = callback;
    }

    public final void updateUi(int type, @Nullable String bankName, @Nullable String accountNo, @Nullable String verifiedName, double amount, boolean isNotActive) {
        TextView mBankNameTv = getMBankNameTv();
        if (bankName == null) {
            bankName = "";
        }
        mBankNameTv.setText(bankName);
        getMAccountNoTv().setText(i0.o(accountNo != null ? y.k(accountNo, " ", "") : null));
        TextView mVerifiedNameTv = getMVerifiedNameTv();
        if (verifiedName == null) {
            verifiedName = "";
        }
        mVerifiedNameTv.setText(verifiedName);
        getMAmountLayout().setVisibility(type == 1 ? 0 : 8);
        getMCslAmount().setVisibility(type != 1 ? 0 : 8);
        if (type == 1) {
            AmountUnitLayout.a(getMAmountLayout(), (long) amount);
        } else {
            AmountUnitLayout.a(getMTvAmount(), (long) amount);
            TextView mTvTitle = getMTvTitle();
            Context context = getContext();
            mTvTitle.setText(context != null ? context.getString(k.core_recipient_confirm) : null);
        }
        if (!isNotActive) {
            View viewFindViewById = findViewById(p025ba.e.ivTag1);
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            View viewFindViewById2 = findViewById(p025ba.e.ivTag);
            if (viewFindViewById2 != null) {
                viewFindViewById2.setVisibility(8);
            }
            TextView tvMessage = getTvMessage();
            Context context2 = getContext();
            tvMessage.setText(context2 != null ? context2.getString(k.core_kindly_review) : null);
            return;
        }
        TextView tvMessage2 = getTvMessage();
        Context context3 = getContext();
        tvMessage2.setText(context3 != null ? context3.getString(k.core_recipient_not_act) : null);
        getTvMessage().setTextColor(CommonViewExtKt.colorInt(L6.b.ppColorWarning, getContext()));
        getLlRemark().setBackgroundResource(r.cv_shape_rect_corner_8_bg_assist_background);
        View viewFindViewById3 = findViewById(p025ba.e.ivTag);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setVisibility(0);
        }
        View viewFindViewById4 = findViewById(p025ba.e.ivTag1);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setVisibility(8);
        }
    }
}
