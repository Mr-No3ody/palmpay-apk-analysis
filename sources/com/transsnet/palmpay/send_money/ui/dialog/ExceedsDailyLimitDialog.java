package com.transsnet.palmpay.send_money.ui.dialog;

import Pa.F;
import Pa.i0;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.messaging.Constants;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.bean.CreateBizOrderResp;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.send_money.bean.VerifyPaymentInfoRsp;
import com.transsnet.palmpay.send_money.ui.dialog.ExceedsDailyLimitDialog;
import com.transsnet.palmpay.util.ActivityUtils;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p220oa.h;
import p237pd.c;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\f\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u001b\u0010 \u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/dialog/ExceedsDailyLimitDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "amountLimitPopUpJumpUrl", "amountLimitPopUpContent", "amountLimitPopUpPic", "amountLimitPopUpDarkPic", "", "setData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "initViews", "()V", "Lcom/transsnet/palmpay/core/bean/CreateBizOrderResp;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/transsnet/palmpay/core/bean/CreateBizOrderResp;)Lcom/transsnet/palmpay/send_money/ui/dialog/ExceedsDailyLimitDialog;", "Lcom/transsnet/palmpay/send_money/bean/VerifyPaymentInfoRsp$DataBean;", "(Lcom/transsnet/palmpay/send_money/bean/VerifyPaymentInfoRsp$DataBean;)Lcom/transsnet/palmpay/send_money/ui/dialog/ExceedsDailyLimitDialog;", "Landroid/widget/TextView;", "tvCancel$delegate", "Lkotlin/Lazy;", "getTvCancel", "()Landroid/widget/TextView;", "tvCancel", "tvConfirm$delegate", "getTvConfirm", "tvConfirm", "tv_content$delegate", "getTv_content", "tv_content", "Landroid/widget/ImageView;", "ivMiddle$delegate", "getIvMiddle", "()Landroid/widget/ImageView;", "ivMiddle", "Lcom/mikepenz/iconics/view/IconicsImageView;", "iv_close$delegate", "getIv_close", "()Lcom/mikepenz/iconics/view/IconicsImageView;", "iv_close", "module_money_transfer_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExceedsDailyLimitDialog extends b {

    /* JADX INFO: renamed from: ivMiddle$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ivMiddle;

    /* JADX INFO: renamed from: iv_close$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy iv_close;

    /* JADX INFO: renamed from: tvCancel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvCancel;

    /* JADX INFO: renamed from: tvConfirm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tvConfirm;

    /* JADX INFO: renamed from: tv_content$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy tv_content;

    public ExceedsDailyLimitDialog(@Nullable Context context) {
        super(context);
        final int i7 = 0;
        this.tvCancel = C2131j.b(new Function0(this) { // from class: Ad.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExceedsDailyLimitDialog f157b;

            {
                this.f157b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return ExceedsDailyLimitDialog.tvCancel_delegate$lambda$0(this.f157b);
                    case 1:
                        return ExceedsDailyLimitDialog.tvConfirm_delegate$lambda$1(this.f157b);
                    case 2:
                        return ExceedsDailyLimitDialog.tv_content_delegate$lambda$2(this.f157b);
                    case 3:
                        return ExceedsDailyLimitDialog.ivMiddle_delegate$lambda$3(this.f157b);
                    default:
                        return ExceedsDailyLimitDialog.iv_close_delegate$lambda$4(this.f157b);
                }
            }
        });
        final int i10 = 1;
        this.tvConfirm = C2131j.b(new Function0(this) { // from class: Ad.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExceedsDailyLimitDialog f157b;

            {
                this.f157b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return ExceedsDailyLimitDialog.tvCancel_delegate$lambda$0(this.f157b);
                    case 1:
                        return ExceedsDailyLimitDialog.tvConfirm_delegate$lambda$1(this.f157b);
                    case 2:
                        return ExceedsDailyLimitDialog.tv_content_delegate$lambda$2(this.f157b);
                    case 3:
                        return ExceedsDailyLimitDialog.ivMiddle_delegate$lambda$3(this.f157b);
                    default:
                        return ExceedsDailyLimitDialog.iv_close_delegate$lambda$4(this.f157b);
                }
            }
        });
        final int i11 = 2;
        this.tv_content = C2131j.b(new Function0(this) { // from class: Ad.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExceedsDailyLimitDialog f157b;

            {
                this.f157b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return ExceedsDailyLimitDialog.tvCancel_delegate$lambda$0(this.f157b);
                    case 1:
                        return ExceedsDailyLimitDialog.tvConfirm_delegate$lambda$1(this.f157b);
                    case 2:
                        return ExceedsDailyLimitDialog.tv_content_delegate$lambda$2(this.f157b);
                    case 3:
                        return ExceedsDailyLimitDialog.ivMiddle_delegate$lambda$3(this.f157b);
                    default:
                        return ExceedsDailyLimitDialog.iv_close_delegate$lambda$4(this.f157b);
                }
            }
        });
        final int i12 = 3;
        this.ivMiddle = C2131j.b(new Function0(this) { // from class: Ad.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExceedsDailyLimitDialog f157b;

            {
                this.f157b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return ExceedsDailyLimitDialog.tvCancel_delegate$lambda$0(this.f157b);
                    case 1:
                        return ExceedsDailyLimitDialog.tvConfirm_delegate$lambda$1(this.f157b);
                    case 2:
                        return ExceedsDailyLimitDialog.tv_content_delegate$lambda$2(this.f157b);
                    case 3:
                        return ExceedsDailyLimitDialog.ivMiddle_delegate$lambda$3(this.f157b);
                    default:
                        return ExceedsDailyLimitDialog.iv_close_delegate$lambda$4(this.f157b);
                }
            }
        });
        final int i13 = 4;
        this.iv_close = C2131j.b(new Function0(this) { // from class: Ad.C

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExceedsDailyLimitDialog f157b;

            {
                this.f157b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return ExceedsDailyLimitDialog.tvCancel_delegate$lambda$0(this.f157b);
                    case 1:
                        return ExceedsDailyLimitDialog.tvConfirm_delegate$lambda$1(this.f157b);
                    case 2:
                        return ExceedsDailyLimitDialog.tv_content_delegate$lambda$2(this.f157b);
                    case 3:
                        return ExceedsDailyLimitDialog.ivMiddle_delegate$lambda$3(this.f157b);
                    default:
                        return ExceedsDailyLimitDialog.iv_close_delegate$lambda$4(this.f157b);
                }
            }
        });
    }

    private final ImageView getIvMiddle() {
        Object value = this.ivMiddle.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ImageView) value;
    }

    private final IconicsImageView getIv_close() {
        Object value = this.iv_close.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsImageView) value;
    }

    private final TextView getTvCancel() {
        Object value = this.tvCancel.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvConfirm() {
        Object value = this.tvConfirm.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTv_content() {
        Object value = this.tv_content.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivMiddle_delegate$lambda$3(ExceedsDailyLimitDialog exceedsDailyLimitDialog) {
        return (ImageView) exceedsDailyLimitDialog.findViewById(p237pd.b.ivMiddle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IconicsImageView iv_close_delegate$lambda$4(ExceedsDailyLimitDialog exceedsDailyLimitDialog) {
        return (IconicsImageView) exceedsDailyLimitDialog.findViewById(p237pd.b.iv_close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$9(String str, ExceedsDailyLimitDialog exceedsDailyLimitDialog, View view) {
        if (str == null || str.length() != 0) {
            ActivityUtils.startActivity(F.a(view.getContext(), str));
            exceedsDailyLimitDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvCancel_delegate$lambda$0(ExceedsDailyLimitDialog exceedsDailyLimitDialog) {
        return (TextView) exceedsDailyLimitDialog.findViewById(p237pd.b.tvCancel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvConfirm_delegate$lambda$1(ExceedsDailyLimitDialog exceedsDailyLimitDialog) {
        return (TextView) exceedsDailyLimitDialog.findViewById(p237pd.b.tvConfirm);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_content_delegate$lambda$2(ExceedsDailyLimitDialog exceedsDailyLimitDialog) {
        return (TextView) exceedsDailyLimitDialog.findViewById(p237pd.b.tv_content);
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        setContentView(c.sm_dialog_exceeds_daily_limit);
        final int i7 = 0;
        getIv_close().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExceedsDailyLimitDialog f155b;

            {
                this.f155b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f155b.dismiss();
                        break;
                    default:
                        this.f155b.dismiss();
                        break;
                }
            }
        });
        final int i10 = 1;
        getTvCancel().setOnClickListener(new View.OnClickListener(this) { // from class: Ad.B

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ExceedsDailyLimitDialog f155b;

            {
                this.f155b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f155b.dismiss();
                        break;
                    default:
                        this.f155b.dismiss();
                        break;
                }
            }
        });
    }

    @NotNull
    public final ExceedsDailyLimitDialog setData(@Nullable CreateBizOrderResp data) {
        if (data != null) {
            setData(data.amountLimitPopUpJumpUrl, data.amountLimitPopUpContent, data.amountLimitPopUpPic, data.amountLimitPopUpDarkPic);
        }
        return this;
    }

    @NotNull
    public final ExceedsDailyLimitDialog setData(@Nullable VerifyPaymentInfoRsp.DataBean data) {
        if (data != null) {
            setData(data.amountLimitPopUpJumpUrl, data.amountLimitPopUpContent, data.amountLimitPopUpPic, data.amountLimitPopUpDarkPic);
        }
        return this;
    }

    private final void setData(String amountLimitPopUpJumpUrl, String amountLimitPopUpContent, String amountLimitPopUpPic, String amountLimitPopUpDarkPic) {
        getTv_content().setText(amountLimitPopUpContent);
        if (i0.T()) {
            amountLimitPopUpPic = amountLimitPopUpDarkPic;
        }
        if (amountLimitPopUpPic != null && amountLimitPopUpPic.length() > 0) {
            getIvMiddle().setVisibility(0);
            r0.l1(amountLimitPopUpPic, getIvMiddle());
        } else {
            getIvMiddle().setVisibility(8);
            if (TextUtils.isEmpty(amountLimitPopUpJumpUrl)) {
                TextView tvConfirm = getTvConfirm();
                if (tvConfirm != null) {
                    tvConfirm.setText("Confirm");
                }
                TextView tvCancel = getTvCancel();
                if (tvCancel != null) {
                    h.c(tvCancel);
                }
            }
        }
        TextView tvConfirm2 = getTvConfirm();
        if (tvConfirm2 != null) {
            tvConfirm2.setOnClickListener(new A8.c(4, amountLimitPopUpJumpUrl, this));
        }
    }
}
