package com.transsnet.palmpay.core.dialog;

import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.firebase.messaging.Constants;
import com.transsnet.palmpay.core.bean.rsp.QueryPaymentRewardRsp;
import com.transsnet.palmpay.core.dialog.PaymentRewardsDialog;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p025ba.l;
import p173ld.o;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u001d\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR#\u0010 \u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR#\u0010#\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR#\u0010(\u001a\n \u0018*\u0004\u0018\u00010$0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010'R#\u0010+\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001a\u001a\u0004\b*\u0010\u001cR#\u0010.\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001a\u001a\u0004\b-\u0010\u001cR$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/PaymentRewardsDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Lcom/transsnet/palmpay/core/bean/rsp/QueryPaymentRewardRsp$DataBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "fillData", "(Lcom/transsnet/palmpay/core/bean/rsp/QueryPaymentRewardRsp$DataBean;)V", "", "titleStr", "setTitleString", "(Ljava/lang/String;)V", ReactTextInputShadowNode.PROP_TEXT, "setContentString", "leftText1", "leftText2", "setBtnText", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "tvReward$delegate", "Lkotlin/Lazy;", "getTvReward", "()Landroid/widget/TextView;", "tvReward", "cdpr_confirm_tv$delegate", "getCdpr_confirm_tv", "cdpr_confirm_tv", "cdpr_cancel_tv$delegate", "getCdpr_cancel_tv", "cdpr_cancel_tv", "Landroid/widget/ImageView;", "cdpr_iv$delegate", "getCdpr_iv", "()Landroid/widget/ImageView;", "cdpr_iv", "cdpr_content_tv$delegate", "getCdpr_content_tv", "cdpr_content_tv", "cdpr_title_tv$delegate", "getCdpr_title_tv", "cdpr_title_tv", "Lcom/transsnet/palmpay/core/dialog/PaymentRewardsDialog$Callback;", "mCallback", "Lcom/transsnet/palmpay/core/dialog/PaymentRewardsDialog$Callback;", "getMCallback", "()Lcom/transsnet/palmpay/core/dialog/PaymentRewardsDialog$Callback;", "setMCallback", "(Lcom/transsnet/palmpay/core/dialog/PaymentRewardsDialog$Callback;)V", "Callback", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PaymentRewardsDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: cdpr_cancel_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdpr_cancel_tv;

    /* JADX INFO: renamed from: cdpr_confirm_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdpr_confirm_tv;

    /* JADX INFO: renamed from: cdpr_content_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdpr_content_tv;

    /* JADX INFO: renamed from: cdpr_iv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdpr_iv;

    /* JADX INFO: renamed from: cdpr_title_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cdpr_title_tv;

    @Nullable
    private Callback mCallback;

    /* JADX INFO: renamed from: tvReward$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvReward;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/core/dialog/PaymentRewardsDialog$Callback;", "", "onConfirmClick", "", "onCancelClick", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Callback {
        void onCancelClick();

        void onConfirmClick();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentRewardsDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i7 = 0;
        this.tvReward = C2131j.b(new Function0(this) { // from class: ma.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentRewardsDialog f39608b;

            {
                this.f39608b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return PaymentRewardsDialog.tvReward_delegate$lambda$0(this.f39608b);
                    case 1:
                        return PaymentRewardsDialog.cdpr_confirm_tv_delegate$lambda$1(this.f39608b);
                    case 2:
                        return PaymentRewardsDialog.cdpr_cancel_tv_delegate$lambda$2(this.f39608b);
                    case 3:
                        return PaymentRewardsDialog.cdpr_iv_delegate$lambda$3(this.f39608b);
                    case 4:
                        return PaymentRewardsDialog.cdpr_content_tv_delegate$lambda$4(this.f39608b);
                    default:
                        return PaymentRewardsDialog.cdpr_title_tv_delegate$lambda$5(this.f39608b);
                }
            }
        });
        final int i10 = 1;
        this.cdpr_confirm_tv = C2131j.b(new Function0(this) { // from class: ma.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentRewardsDialog f39608b;

            {
                this.f39608b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return PaymentRewardsDialog.tvReward_delegate$lambda$0(this.f39608b);
                    case 1:
                        return PaymentRewardsDialog.cdpr_confirm_tv_delegate$lambda$1(this.f39608b);
                    case 2:
                        return PaymentRewardsDialog.cdpr_cancel_tv_delegate$lambda$2(this.f39608b);
                    case 3:
                        return PaymentRewardsDialog.cdpr_iv_delegate$lambda$3(this.f39608b);
                    case 4:
                        return PaymentRewardsDialog.cdpr_content_tv_delegate$lambda$4(this.f39608b);
                    default:
                        return PaymentRewardsDialog.cdpr_title_tv_delegate$lambda$5(this.f39608b);
                }
            }
        });
        final int i11 = 2;
        this.cdpr_cancel_tv = C2131j.b(new Function0(this) { // from class: ma.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentRewardsDialog f39608b;

            {
                this.f39608b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return PaymentRewardsDialog.tvReward_delegate$lambda$0(this.f39608b);
                    case 1:
                        return PaymentRewardsDialog.cdpr_confirm_tv_delegate$lambda$1(this.f39608b);
                    case 2:
                        return PaymentRewardsDialog.cdpr_cancel_tv_delegate$lambda$2(this.f39608b);
                    case 3:
                        return PaymentRewardsDialog.cdpr_iv_delegate$lambda$3(this.f39608b);
                    case 4:
                        return PaymentRewardsDialog.cdpr_content_tv_delegate$lambda$4(this.f39608b);
                    default:
                        return PaymentRewardsDialog.cdpr_title_tv_delegate$lambda$5(this.f39608b);
                }
            }
        });
        final int i12 = 3;
        this.cdpr_iv = C2131j.b(new Function0(this) { // from class: ma.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentRewardsDialog f39608b;

            {
                this.f39608b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return PaymentRewardsDialog.tvReward_delegate$lambda$0(this.f39608b);
                    case 1:
                        return PaymentRewardsDialog.cdpr_confirm_tv_delegate$lambda$1(this.f39608b);
                    case 2:
                        return PaymentRewardsDialog.cdpr_cancel_tv_delegate$lambda$2(this.f39608b);
                    case 3:
                        return PaymentRewardsDialog.cdpr_iv_delegate$lambda$3(this.f39608b);
                    case 4:
                        return PaymentRewardsDialog.cdpr_content_tv_delegate$lambda$4(this.f39608b);
                    default:
                        return PaymentRewardsDialog.cdpr_title_tv_delegate$lambda$5(this.f39608b);
                }
            }
        });
        final int i13 = 4;
        this.cdpr_content_tv = C2131j.b(new Function0(this) { // from class: ma.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentRewardsDialog f39608b;

            {
                this.f39608b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return PaymentRewardsDialog.tvReward_delegate$lambda$0(this.f39608b);
                    case 1:
                        return PaymentRewardsDialog.cdpr_confirm_tv_delegate$lambda$1(this.f39608b);
                    case 2:
                        return PaymentRewardsDialog.cdpr_cancel_tv_delegate$lambda$2(this.f39608b);
                    case 3:
                        return PaymentRewardsDialog.cdpr_iv_delegate$lambda$3(this.f39608b);
                    case 4:
                        return PaymentRewardsDialog.cdpr_content_tv_delegate$lambda$4(this.f39608b);
                    default:
                        return PaymentRewardsDialog.cdpr_title_tv_delegate$lambda$5(this.f39608b);
                }
            }
        });
        final int i14 = 5;
        this.cdpr_title_tv = C2131j.b(new Function0(this) { // from class: ma.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentRewardsDialog f39608b;

            {
                this.f39608b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return PaymentRewardsDialog.tvReward_delegate$lambda$0(this.f39608b);
                    case 1:
                        return PaymentRewardsDialog.cdpr_confirm_tv_delegate$lambda$1(this.f39608b);
                    case 2:
                        return PaymentRewardsDialog.cdpr_cancel_tv_delegate$lambda$2(this.f39608b);
                    case 3:
                        return PaymentRewardsDialog.cdpr_iv_delegate$lambda$3(this.f39608b);
                    case 4:
                        return PaymentRewardsDialog.cdpr_content_tv_delegate$lambda$4(this.f39608b);
                    default:
                        return PaymentRewardsDialog.cdpr_title_tv_delegate$lambda$5(this.f39608b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView cdpr_cancel_tv_delegate$lambda$2(PaymentRewardsDialog paymentRewardsDialog) {
        return (TextView) paymentRewardsDialog.findViewById(p025ba.e.cdpr_cancel_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView cdpr_confirm_tv_delegate$lambda$1(PaymentRewardsDialog paymentRewardsDialog) {
        return (TextView) paymentRewardsDialog.findViewById(p025ba.e.cdpr_confirm_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView cdpr_content_tv_delegate$lambda$4(PaymentRewardsDialog paymentRewardsDialog) {
        return (TextView) paymentRewardsDialog.findViewById(p025ba.e.cdpr_content_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView cdpr_iv_delegate$lambda$3(PaymentRewardsDialog paymentRewardsDialog) {
        return (ImageView) paymentRewardsDialog.findViewById(p025ba.e.cdpr_iv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView cdpr_title_tv_delegate$lambda$5(PaymentRewardsDialog paymentRewardsDialog) {
        return (TextView) paymentRewardsDialog.findViewById(p025ba.e.cdpr_title_tv);
    }

    private final TextView getCdpr_cancel_tv() {
        return (TextView) this.cdpr_cancel_tv.getValue();
    }

    private final TextView getCdpr_confirm_tv() {
        return (TextView) this.cdpr_confirm_tv.getValue();
    }

    private final TextView getCdpr_content_tv() {
        return (TextView) this.cdpr_content_tv.getValue();
    }

    private final ImageView getCdpr_iv() {
        return (ImageView) this.cdpr_iv.getValue();
    }

    private final TextView getCdpr_title_tv() {
        return (TextView) this.cdpr_title_tv.getValue();
    }

    private final TextView getTvReward() {
        return (TextView) this.tvReward.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$6(PaymentRewardsDialog paymentRewardsDialog, View view) {
        Callback callback;
        int id2 = view.getId();
        if (id2 == p025ba.e.cdpr_cancel_tv) {
            Callback callback2 = paymentRewardsDialog.mCallback;
            if (callback2 != null) {
                callback2.onCancelClick();
                return;
            }
            return;
        }
        if (id2 != p025ba.e.cdpr_confirm_tv || (callback = paymentRewardsDialog.mCallback) == null) {
            return;
        }
        callback.onConfirmClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvReward_delegate$lambda$0(PaymentRewardsDialog paymentRewardsDialog) {
        return (TextView) paymentRewardsDialog.findViewById(p025ba.e.tvReward);
    }

    public final void fillData(@Nullable QueryPaymentRewardRsp.DataBean data) {
        if (data != null) {
            if (TextUtils.isEmpty(data.picUrl)) {
                ImageView cdpr_iv = getCdpr_iv();
                Intrinsics.checkNotNullExpressionValue(cdpr_iv, "<get-cdpr_iv>(...)");
                p220oa.h.s(cdpr_iv, false);
            } else {
                ImageView cdpr_iv2 = getCdpr_iv();
                Intrinsics.checkNotNullExpressionValue(cdpr_iv2, "<get-cdpr_iv>(...)");
                p220oa.h.s(cdpr_iv2, true);
                r0.l1(data.picUrl, getCdpr_iv());
            }
            if (TextUtils.isEmpty(data.content)) {
                getCdpr_content_tv().setText(getContext().getString(k.core_confirm_leave_pin));
            } else {
                getCdpr_content_tv().setText(data.content);
            }
            if (TextUtils.isEmpty(data.tips)) {
                TextView tvReward = getTvReward();
                Intrinsics.checkNotNullExpressionValue(tvReward, "<get-tvReward>(...)");
                p220oa.h.s(tvReward, false);
            } else {
                getTvReward().setText(data.tips);
                TextView tvReward2 = getTvReward();
                Intrinsics.checkNotNullExpressionValue(tvReward2, "<get-tvReward>(...)");
                p220oa.h.s(tvReward2, true);
            }
        }
    }

    @Nullable
    public final Callback getMCallback() {
        return this.mCallback;
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(p025ba.g.core_dialog_payment_reward);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        if (window != null) {
            window.setWindowAnimations(l.dialog_bottom_in_out);
        }
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.width = ScreenUtils.getScreenWidth() - SizeUtils.dp2px(30.0f);
        }
        if (attributes != null) {
            attributes.height = -2;
        }
        if (window != null) {
            window.setAttributes(attributes);
        }
        o oVar = new o(this, 4);
        getCdpr_cancel_tv().setOnClickListener(oVar);
        getCdpr_confirm_tv().setOnClickListener(oVar);
        getCdpr_title_tv().setText(System.currentTimeMillis() % ((long) 2) == 0 ? k.core_payment_not_complete : k.core_dont_miss_out);
        setCanceledOnTouchOutside(false);
    }

    public final void setBtnText(@NotNull String leftText1, @NotNull String leftText2) {
        Intrinsics.checkNotNullParameter(leftText1, "leftText1");
        Intrinsics.checkNotNullParameter(leftText2, "leftText2");
        if (!TextUtils.isEmpty(leftText1)) {
            getCdpr_cancel_tv().setText(leftText1);
        }
        if (TextUtils.isEmpty(leftText2)) {
            return;
        }
        getCdpr_confirm_tv().setText(leftText2);
    }

    public final void setContentString(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (TextUtils.isEmpty(text)) {
            return;
        }
        getCdpr_content_tv().setText(text);
    }

    public final void setMCallback(@Nullable Callback callback) {
        this.mCallback = callback;
    }

    public final void setTitleString(@NotNull String titleStr) {
        Intrinsics.checkNotNullParameter(titleStr, "titleStr");
        if (TextUtils.isEmpty(titleStr)) {
            return;
        }
        getCdpr_title_tv().setText(titleStr);
    }
}
