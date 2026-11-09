package com.transsnet.palmpay.managemoney.ui.dialog;

import Jc.c;
import Jc.d;
import M3.f;
import Pa.n0;
import Pa.r0;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.horcrux.svg.d0;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment;
import com.transsnet.palmpay.managemoney.bean.FixedSavingPlanRenewPopBean;
import com.transsnet.palmpay.managemoney.ui.dialog.AutoFixedSaveDialogFragment;
import java.text.SimpleDateFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p025ba.l;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/dialog/AutoFixedSaveDialogFragment;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseDialogFragment;", "<init>", "()V", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AutoFixedSaveDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final a f32277H = new a(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final t f32278C = C2131j.b(new f(this, 7));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AutoFixedSaveDialogFragment newInstance(@NotNull FixedSavingPlanRenewPopBean data) {
            Intrinsics.checkNotNullParameter(data, "data");
            AutoFixedSaveDialogFragment autoFixedSaveDialogFragment = new AutoFixedSaveDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("source", data);
            autoFixedSaveDialogFragment.setArguments(bundle);
            return autoFixedSaveDialogFragment;
        }

        private a() {
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseDialogFragment
    public final Dialog i(O6.f baseDialog) {
        String str;
        final int i7 = 0;
        final int i10 = 1;
        Intrinsics.checkNotNullParameter(baseDialog, "baseDialog");
        View viewF = d0.f(LayoutInflater.from(getContext()), d.mm_fixed_auto_saving_dialog_fragment, null, "inflate(...)", baseDialog);
        this.f31244j = true;
        this.f31245o = false;
        this.f31246p = true;
        this.f31243i = l.dialog_bottom_in_out;
        this.f31242g = 80;
        View viewFindViewById = viewF.findViewById(c.ivClose);
        View viewFindViewById2 = viewF.findViewById(c.layoutPayoutCard);
        Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = viewF.findViewById(c.tvCurrentAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewF.findViewById(c.tvNextAmount);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewF.findViewById(c.tvCurrentDate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById5;
        View viewFindViewById6 = viewF.findViewById(c.tvNextDate);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        TextView textView4 = (TextView) viewFindViewById6;
        View viewFindViewById7 = viewF.findViewById(c.cls_frame);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        View viewFindViewById8 = viewF.findViewById(c.rtvAgree);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        PpButton ppButton = (PpButton) viewFindViewById8;
        r0.R1(textView2, "fonts/PalmPayNum-Bold.ttf");
        r0.R1(textView, "fonts/PalmPayNum-Bold.ttf");
        if (j() != null) {
            FixedSavingPlanRenewPopBean fixedSavingPlanRenewPopBeanJ = j();
            textView.setText(r0.B(fixedSavingPlanRenewPopBeanJ != null ? fixedSavingPlanRenewPopBeanJ.getTotalPayback() : 0L, true));
            FixedSavingPlanRenewPopBean fixedSavingPlanRenewPopBeanJ2 = j();
            textView2.setText(r0.B(fixedSavingPlanRenewPopBeanJ2 != null ? fixedSavingPlanRenewPopBeanJ2.getNextTotalPayback() : 0L, true));
            FixedSavingPlanRenewPopBean fixedSavingPlanRenewPopBeanJ3 = j();
            Long lValueOf = fixedSavingPlanRenewPopBeanJ3 != null ? Long.valueOf(fixedSavingPlanRenewPopBeanJ3.getMaturityDate()) : null;
            String str2 = "";
            if (lValueOf == null) {
                SimpleDateFormat simpleDateFormat = p008a7.a.f11828a;
                str = "";
            } else {
                str = p008a7.a.f11828a.format(lValueOf);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            }
            textView3.setText("on " + str);
            FixedSavingPlanRenewPopBean fixedSavingPlanRenewPopBeanJ4 = j();
            Long lValueOf2 = fixedSavingPlanRenewPopBeanJ4 != null ? Long.valueOf(fixedSavingPlanRenewPopBeanJ4.getNextMaturityDate()) : null;
            if (lValueOf2 != null) {
                str2 = p008a7.a.f11828a.format(lValueOf2);
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            }
            textView4.setText("on " + str2);
            constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AutoFixedSaveDialogFragment f6755b;

                {
                    this.f6755b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutoFixedSaveDialogFragment autoFixedSaveDialogFragment = this.f6755b;
                    switch (i7) {
                        case 0:
                            AutoFixedSaveDialogFragment.a aVar = AutoFixedSaveDialogFragment.f32277H;
                            n0.g().v("AutoRenewPopup_Others_Click");
                            autoFixedSaveDialogFragment.dismiss();
                            Postcard postcardBuild = ARouter.getInstance().build("/manage_money/plan_detail_activity");
                            FixedSavingPlanRenewPopBean fixedSavingPlanRenewPopBeanJ5 = autoFixedSaveDialogFragment.j();
                            postcardBuild.withString("orderNo", fixedSavingPlanRenewPopBeanJ5 != null ? fixedSavingPlanRenewPopBeanJ5.getOrderId() : null).withString("transType", TransType.TRANS_TYPE_FIXED_SAVING).navigation();
                            break;
                        case 1:
                            AutoFixedSaveDialogFragment.a aVar2 = AutoFixedSaveDialogFragment.f32277H;
                            n0.g().v("AutoRenewPopup_Activate_Click");
                            autoFixedSaveDialogFragment.dismiss();
                            Postcard postcardBuild2 = ARouter.getInstance().build("/manage_money/plan_detail_activity");
                            FixedSavingPlanRenewPopBean fixedSavingPlanRenewPopBeanJ6 = autoFixedSaveDialogFragment.j();
                            postcardBuild2.withString("orderNo", fixedSavingPlanRenewPopBeanJ6 != null ? fixedSavingPlanRenewPopBeanJ6.getOrderId() : null).withString("transType", TransType.TRANS_TYPE_FIXED_SAVING).withBoolean("source", true).navigation();
                            break;
                        default:
                            AutoFixedSaveDialogFragment.a aVar3 = AutoFixedSaveDialogFragment.f32277H;
                            autoFixedSaveDialogFragment.dismiss();
                            break;
                    }
                }
            });
        }
        ppButton.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AutoFixedSaveDialogFragment f6755b;

            {
                this.f6755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AutoFixedSaveDialogFragment autoFixedSaveDialogFragment = this.f6755b;
                switch (i10) {
                    case 0:
                        AutoFixedSaveDialogFragment.a aVar = AutoFixedSaveDialogFragment.f32277H;
                        n0.g().v("AutoRenewPopup_Others_Click");
                        autoFixedSaveDialogFragment.dismiss();
                        Postcard postcardBuild = ARouter.getInstance().build("/manage_money/plan_detail_activity");
                        FixedSavingPlanRenewPopBean fixedSavingPlanRenewPopBeanJ5 = autoFixedSaveDialogFragment.j();
                        postcardBuild.withString("orderNo", fixedSavingPlanRenewPopBeanJ5 != null ? fixedSavingPlanRenewPopBeanJ5.getOrderId() : null).withString("transType", TransType.TRANS_TYPE_FIXED_SAVING).navigation();
                        break;
                    case 1:
                        AutoFixedSaveDialogFragment.a aVar2 = AutoFixedSaveDialogFragment.f32277H;
                        n0.g().v("AutoRenewPopup_Activate_Click");
                        autoFixedSaveDialogFragment.dismiss();
                        Postcard postcardBuild2 = ARouter.getInstance().build("/manage_money/plan_detail_activity");
                        FixedSavingPlanRenewPopBean fixedSavingPlanRenewPopBeanJ6 = autoFixedSaveDialogFragment.j();
                        postcardBuild2.withString("orderNo", fixedSavingPlanRenewPopBeanJ6 != null ? fixedSavingPlanRenewPopBeanJ6.getOrderId() : null).withString("transType", TransType.TRANS_TYPE_FIXED_SAVING).withBoolean("source", true).navigation();
                        break;
                    default:
                        AutoFixedSaveDialogFragment.a aVar3 = AutoFixedSaveDialogFragment.f32277H;
                        autoFixedSaveDialogFragment.dismiss();
                        break;
                }
            }
        });
        if (viewFindViewById != null) {
            final int i11 = 2;
            viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: Oc.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ AutoFixedSaveDialogFragment f6755b;

                {
                    this.f6755b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AutoFixedSaveDialogFragment autoFixedSaveDialogFragment = this.f6755b;
                    switch (i11) {
                        case 0:
                            AutoFixedSaveDialogFragment.a aVar = AutoFixedSaveDialogFragment.f32277H;
                            n0.g().v("AutoRenewPopup_Others_Click");
                            autoFixedSaveDialogFragment.dismiss();
                            Postcard postcardBuild = ARouter.getInstance().build("/manage_money/plan_detail_activity");
                            FixedSavingPlanRenewPopBean fixedSavingPlanRenewPopBeanJ5 = autoFixedSaveDialogFragment.j();
                            postcardBuild.withString("orderNo", fixedSavingPlanRenewPopBeanJ5 != null ? fixedSavingPlanRenewPopBeanJ5.getOrderId() : null).withString("transType", TransType.TRANS_TYPE_FIXED_SAVING).navigation();
                            break;
                        case 1:
                            AutoFixedSaveDialogFragment.a aVar2 = AutoFixedSaveDialogFragment.f32277H;
                            n0.g().v("AutoRenewPopup_Activate_Click");
                            autoFixedSaveDialogFragment.dismiss();
                            Postcard postcardBuild2 = ARouter.getInstance().build("/manage_money/plan_detail_activity");
                            FixedSavingPlanRenewPopBean fixedSavingPlanRenewPopBeanJ6 = autoFixedSaveDialogFragment.j();
                            postcardBuild2.withString("orderNo", fixedSavingPlanRenewPopBeanJ6 != null ? fixedSavingPlanRenewPopBeanJ6.getOrderId() : null).withString("transType", TransType.TRANS_TYPE_FIXED_SAVING).withBoolean("source", true).navigation();
                            break;
                        default:
                            AutoFixedSaveDialogFragment.a aVar3 = AutoFixedSaveDialogFragment.f32277H;
                            autoFixedSaveDialogFragment.dismiss();
                            break;
                    }
                }
            });
        }
        return baseDialog;
    }

    public final FixedSavingPlanRenewPopBean j() {
        return (FixedSavingPlanRenewPopBean) this.f32278C.getValue();
    }
}
