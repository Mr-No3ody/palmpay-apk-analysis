package com.transsnet.palmpay.core.ui.dialog;

import Ha.d;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.transsnet.palmpay.core.ui.dialog.ConfirmPaymentFeeDialog;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.e;
import p025ba.g;
import p025ba.l;
import p220oa.h;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/transsnet/palmpay/core/ui/dialog/ConfirmPaymentFeeDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/app/Activity;", "activity", "", "tips", "<init>", "(Landroid/app/Activity;Ljava/lang/String;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/core/ui/dialog/ConfirmPaymentFeeDialog$IConfirmPay;", "event", "setConfrimPayEvent", "(Lcom/transsnet/palmpay/core/ui/dialog/ConfirmPaymentFeeDialog$IConfirmPay;)V", "Landroid/app/Activity;", "Ljava/lang/String;", "getTips", "()Ljava/lang/String;", "Landroid/widget/TextView;", "tvBackToCheckout$delegate", "Lkotlin/Lazy;", "getTvBackToCheckout", "()Landroid/widget/TextView;", "tvBackToCheckout", "tvConfirm$delegate", "getTvConfirm", "tvConfirm", "tv_tips$delegate", "getTv_tips", "tv_tips", "Landroid/widget/ImageView;", "ivClose$delegate", "getIvClose", "()Landroid/widget/ImageView;", "ivClose", "confirmPayEvent", "Lcom/transsnet/palmpay/core/ui/dialog/ConfirmPaymentFeeDialog$IConfirmPay;", "IConfirmPay", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfirmPaymentFeeDialog extends b {

    @NotNull
    private final Activity activity;

    @Nullable
    private IConfirmPay confirmPayEvent;

    /* JADX INFO: renamed from: ivClose$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivClose;

    @NotNull
    private final String tips;

    /* JADX INFO: renamed from: tvBackToCheckout$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvBackToCheckout;

    /* JADX INFO: renamed from: tvConfirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvConfirm;

    /* JADX INFO: renamed from: tv_tips$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_tips;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/transsnet/palmpay/core/ui/dialog/ConfirmPaymentFeeDialog$IConfirmPay;", "", "confirmPay", "", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface IConfirmPay {
        void confirmPay();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmPaymentFeeDialog(@NotNull Activity activity, @NotNull String tips) {
        super(activity, g.core_layout_confirm_payment_fee_dialog);
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(tips, "tips");
        this.activity = activity;
        this.tips = tips;
        final int i7 = 0;
        this.tvBackToCheckout = C2131j.b(new Function0(this) { // from class: Ha.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmPaymentFeeDialog f3777b;

            {
                this.f3777b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return ConfirmPaymentFeeDialog.tvBackToCheckout_delegate$lambda$0(this.f3777b);
                    case 1:
                        return ConfirmPaymentFeeDialog.tvConfirm_delegate$lambda$1(this.f3777b);
                    case 2:
                        return ConfirmPaymentFeeDialog.tv_tips_delegate$lambda$2(this.f3777b);
                    default:
                        return ConfirmPaymentFeeDialog.ivClose_delegate$lambda$3(this.f3777b);
                }
            }
        });
        final int i10 = 1;
        this.tvConfirm = C2131j.b(new Function0(this) { // from class: Ha.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmPaymentFeeDialog f3777b;

            {
                this.f3777b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ConfirmPaymentFeeDialog.tvBackToCheckout_delegate$lambda$0(this.f3777b);
                    case 1:
                        return ConfirmPaymentFeeDialog.tvConfirm_delegate$lambda$1(this.f3777b);
                    case 2:
                        return ConfirmPaymentFeeDialog.tv_tips_delegate$lambda$2(this.f3777b);
                    default:
                        return ConfirmPaymentFeeDialog.ivClose_delegate$lambda$3(this.f3777b);
                }
            }
        });
        final int i11 = 2;
        this.tv_tips = C2131j.b(new Function0(this) { // from class: Ha.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmPaymentFeeDialog f3777b;

            {
                this.f3777b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ConfirmPaymentFeeDialog.tvBackToCheckout_delegate$lambda$0(this.f3777b);
                    case 1:
                        return ConfirmPaymentFeeDialog.tvConfirm_delegate$lambda$1(this.f3777b);
                    case 2:
                        return ConfirmPaymentFeeDialog.tv_tips_delegate$lambda$2(this.f3777b);
                    default:
                        return ConfirmPaymentFeeDialog.ivClose_delegate$lambda$3(this.f3777b);
                }
            }
        });
        final int i12 = 3;
        this.ivClose = C2131j.b(new Function0(this) { // from class: Ha.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmPaymentFeeDialog f3777b;

            {
                this.f3777b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ConfirmPaymentFeeDialog.tvBackToCheckout_delegate$lambda$0(this.f3777b);
                    case 1:
                        return ConfirmPaymentFeeDialog.tvConfirm_delegate$lambda$1(this.f3777b);
                    case 2:
                        return ConfirmPaymentFeeDialog.tv_tips_delegate$lambda$2(this.f3777b);
                    default:
                        return ConfirmPaymentFeeDialog.ivClose_delegate$lambda$3(this.f3777b);
                }
            }
        });
    }

    private final ImageView getIvClose() {
        Object value = this.ivClose.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final TextView getTvBackToCheckout() {
        Object value = this.tvBackToCheckout.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvConfirm() {
        Object value = this.tvConfirm.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_tips() {
        return (TextView) this.tv_tips.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$5(ConfirmPaymentFeeDialog confirmPaymentFeeDialog, View view) {
        int id2 = view.getId();
        if (id2 == e.ivClose) {
            confirmPaymentFeeDialog.dismiss();
            return;
        }
        if (id2 != e.tvConfirm) {
            if (id2 == e.tvBackToCheckout) {
                confirmPaymentFeeDialog.dismiss();
            }
        } else {
            IConfirmPay iConfirmPay = confirmPaymentFeeDialog.confirmPayEvent;
            if (iConfirmPay != null) {
                iConfirmPay.confirmPay();
            }
            confirmPaymentFeeDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivClose_delegate$lambda$3(ConfirmPaymentFeeDialog confirmPaymentFeeDialog) {
        return (ImageView) confirmPaymentFeeDialog.findViewById(e.ivClose);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvBackToCheckout_delegate$lambda$0(ConfirmPaymentFeeDialog confirmPaymentFeeDialog) {
        return (TextView) confirmPaymentFeeDialog.findViewById(e.tvBackToCheckout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvConfirm_delegate$lambda$1(ConfirmPaymentFeeDialog confirmPaymentFeeDialog) {
        return (TextView) confirmPaymentFeeDialog.findViewById(e.tvConfirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_tips_delegate$lambda$2(ConfirmPaymentFeeDialog confirmPaymentFeeDialog) {
        return (TextView) confirmPaymentFeeDialog.findViewById(e.tv_tips);
    }

    @NotNull
    public final String getTips() {
        return this.tips;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        TextView tv_tips;
        int i7 = 1;
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(17);
        window.setWindowAnimations(l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth() - SizeUtils.dp2px(32.0f);
        attributes.height = -2;
        if (!TextUtils.isEmpty(this.tips) && (tv_tips = getTv_tips()) != null) {
            tv_tips.setText(this.tips);
        }
        h.q(new d(this, i7), getIvClose(), getTvConfirm(), getTvBackToCheckout());
    }

    public final void setConfrimPayEvent(@NotNull IConfirmPay event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.confirmPayEvent = event;
    }
}
