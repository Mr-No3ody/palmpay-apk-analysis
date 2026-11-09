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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/OcRepaymentCouponTipsDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "initViews", "()V", "Landroid/widget/TextView;", "coupon_tips_confirm_tv$delegate", "Lkotlin/Lazy;", "getCoupon_tips_confirm_tv", "()Landroid/widget/TextView;", "coupon_tips_confirm_tv", "Landroid/widget/ImageView;", "coupon_tips_close_img$delegate", "getCoupon_tips_close_img", "()Landroid/widget/ImageView;", "coupon_tips_close_img", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OcRepaymentCouponTipsDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    /* JADX INFO: renamed from: coupon_tips_close_img$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coupon_tips_close_img;

    /* JADX INFO: renamed from: coupon_tips_confirm_tv$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy coupon_tips_confirm_tv;

    public OcRepaymentCouponTipsDialog(@Nullable Context context) {
        super(context, Ya.f.cs_oc_repayment_coupon_tips_dialog_layout);
        final int i7 = 0;
        this.coupon_tips_confirm_tv = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.N0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepaymentCouponTipsDialog f30004b;

            {
                this.f30004b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return OcRepaymentCouponTipsDialog.coupon_tips_confirm_tv_delegate$lambda$0(this.f30004b);
                    default:
                        return OcRepaymentCouponTipsDialog.coupon_tips_close_img_delegate$lambda$1(this.f30004b);
                }
            }
        });
        final int i10 = 1;
        this.coupon_tips_close_img = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.N0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcRepaymentCouponTipsDialog f30004b;

            {
                this.f30004b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return OcRepaymentCouponTipsDialog.coupon_tips_confirm_tv_delegate$lambda$0(this.f30004b);
                    default:
                        return OcRepaymentCouponTipsDialog.coupon_tips_close_img_delegate$lambda$1(this.f30004b);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView coupon_tips_close_img_delegate$lambda$1(OcRepaymentCouponTipsDialog ocRepaymentCouponTipsDialog) {
        return (ImageView) ocRepaymentCouponTipsDialog.findViewById(Ya.e.coupon_tips_close_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView coupon_tips_confirm_tv_delegate$lambda$0(OcRepaymentCouponTipsDialog ocRepaymentCouponTipsDialog) {
        return (TextView) ocRepaymentCouponTipsDialog.findViewById(Ya.e.coupon_tips_confirm_tv);
    }

    private final ImageView getCoupon_tips_close_img() {
        return (ImageView) this.coupon_tips_close_img.getValue();
    }

    private final TextView getCoupon_tips_confirm_tv() {
        return (TextView) this.coupon_tips_confirm_tv.getValue();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        ImageView coupon_tips_close_img = getCoupon_tips_close_img();
        if (coupon_tips_close_img != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.M0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcRepaymentCouponTipsDialog f29999b;

                {
                    this.f29999b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f29999b.dismiss();
                            break;
                        default:
                            this.f29999b.dismiss();
                            break;
                    }
                }
            }, coupon_tips_close_img);
        }
        TextView coupon_tips_confirm_tv = getCoupon_tips_confirm_tv();
        if (coupon_tips_confirm_tv != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.M0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ OcRepaymentCouponTipsDialog f29999b;

                {
                    this.f29999b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f29999b.dismiss();
                            break;
                        default:
                            this.f29999b.dismiss();
                            break;
                    }
                }
            }, coupon_tips_confirm_tv);
        }
    }
}
