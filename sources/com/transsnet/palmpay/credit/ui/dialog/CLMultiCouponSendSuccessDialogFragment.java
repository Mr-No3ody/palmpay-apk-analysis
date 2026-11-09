package com.transsnet.palmpay.credit.ui.dialog;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLMultiCouponSendSuccessDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLMultiCouponSendSuccessDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final a f29948C = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CLMultiCouponSendSuccessDialogFragment newInstance() {
            return new CLMultiCouponSendSuccessDialogFragment();
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = com.horcrux.svg.d0.f(LayoutInflater.from(getContext()), p116hb.d.cs_cl_multi_coupon_send_success_dialog, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31242g = 17;
        this.f31246p = true;
        ImageView imageView = viewF != null ? (ImageView) viewF.findViewById(p116hb.c.clickEvent_multiCouponSendSuccess_close_iv) : null;
        ImageView imageView2 = viewF != null ? (ImageView) viewF.findViewById(p116hb.c.ivActivity) : null;
        PpButton ppButton = viewF != null ? (PpButton) viewF.findViewById(p116hb.c.btnBuyDataAirtime) : null;
        TextView textView = viewF != null ? (TextView) viewF.findViewById(p116hb.c.tvViewLoans) : null;
        if (imageView != null) {
            final int i7 = 0;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.K

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLMultiCouponSendSuccessDialogFragment f29989b;

                {
                    this.f29989b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLMultiCouponSendSuccessDialogFragment cLMultiCouponSendSuccessDialogFragment = this.f29989b;
                    switch (i7) {
                        case 0:
                            CLMultiCouponSendSuccessDialogFragment.a aVar = CLMultiCouponSendSuccessDialogFragment.f29948C;
                            cLMultiCouponSendSuccessDialogFragment.dismiss();
                            break;
                        case 1:
                            CLMultiCouponSendSuccessDialogFragment.a aVar2 = CLMultiCouponSendSuccessDialogFragment.f29948C;
                            cLMultiCouponSendSuccessDialogFragment.dismiss();
                            break;
                        default:
                            CLMultiCouponSendSuccessDialogFragment.a aVar3 = CLMultiCouponSendSuccessDialogFragment.f29948C;
                            com.palmpay.lib.apm.launchcounter.util.d.F("/airtime/top_up_airtime");
                            cLMultiCouponSendSuccessDialogFragment.dismiss();
                            break;
                    }
                }
            }, imageView);
        }
        if (textView != null) {
            final int i10 = 1;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.K

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLMultiCouponSendSuccessDialogFragment f29989b;

                {
                    this.f29989b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLMultiCouponSendSuccessDialogFragment cLMultiCouponSendSuccessDialogFragment = this.f29989b;
                    switch (i10) {
                        case 0:
                            CLMultiCouponSendSuccessDialogFragment.a aVar = CLMultiCouponSendSuccessDialogFragment.f29948C;
                            cLMultiCouponSendSuccessDialogFragment.dismiss();
                            break;
                        case 1:
                            CLMultiCouponSendSuccessDialogFragment.a aVar2 = CLMultiCouponSendSuccessDialogFragment.f29948C;
                            cLMultiCouponSendSuccessDialogFragment.dismiss();
                            break;
                        default:
                            CLMultiCouponSendSuccessDialogFragment.a aVar3 = CLMultiCouponSendSuccessDialogFragment.f29948C;
                            com.palmpay.lib.apm.launchcounter.util.d.F("/airtime/top_up_airtime");
                            cLMultiCouponSendSuccessDialogFragment.dismiss();
                            break;
                    }
                }
            }, textView);
        }
        if (ppButton != null) {
            final int i11 = 2;
            p220oa.h.l(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.K

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CLMultiCouponSendSuccessDialogFragment f29989b;

                {
                    this.f29989b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CLMultiCouponSendSuccessDialogFragment cLMultiCouponSendSuccessDialogFragment = this.f29989b;
                    switch (i11) {
                        case 0:
                            CLMultiCouponSendSuccessDialogFragment.a aVar = CLMultiCouponSendSuccessDialogFragment.f29948C;
                            cLMultiCouponSendSuccessDialogFragment.dismiss();
                            break;
                        case 1:
                            CLMultiCouponSendSuccessDialogFragment.a aVar2 = CLMultiCouponSendSuccessDialogFragment.f29948C;
                            cLMultiCouponSendSuccessDialogFragment.dismiss();
                            break;
                        default:
                            CLMultiCouponSendSuccessDialogFragment.a aVar3 = CLMultiCouponSendSuccessDialogFragment.f29948C;
                            com.palmpay.lib.apm.launchcounter.util.d.F("/airtime/top_up_airtime");
                            cLMultiCouponSendSuccessDialogFragment.dismiss();
                            break;
                    }
                }
            }, ppButton);
        }
        Pa.r0.l1("https://static.chuanyinet.com/images/Group%201597884637261e89fc-6c55-48.png", imageView2);
        return baseDialog;
    }
}
