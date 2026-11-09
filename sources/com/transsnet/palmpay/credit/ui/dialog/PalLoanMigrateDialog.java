package com.transsnet.palmpay.credit.ui.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.AppUtils;
import com.transsnet.palmpay.util.IntentUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/PalLoanMigrateDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "", "loanProduct", "", "dialogType", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateRewardInfo;", "migrateRewardInfo", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Integer;Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateRewardInfo;)V", "", "initViews", "()V", "Ljava/lang/String;", "Ljava/lang/Integer;", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$MigrateRewardInfo;", "Companion", "a", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PalLoanMigrateDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @NotNull
    public static final String TAG = "PalLoanMigrateDialog";

    @Nullable
    private final Integer dialogType;

    @Nullable
    private final String loanProduct;

    @Nullable
    private final QueryLoanDialogPopUpsBean.MigrateRewardInfo migrateRewardInfo;

    public /* synthetic */ PalLoanMigrateDialog(Context context, String str, Integer num, QueryLoanDialogPopUpsBean.MigrateRewardInfo migrateRewardInfo, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : str, (i7 & 4) != 0 ? 1 : num, (i7 & 8) != 0 ? null : migrateRewardInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$3(PalLoanMigrateDialog palLoanMigrateDialog, View view) {
        palLoanMigrateDialog.dismiss();
        androidx.fragment.app.E activity = palLoanMigrateDialog.getActivity(palLoanMigrateDialog.getContext());
        if (activity != null) {
            if (AppUtils.isAppInstalled("com.legend.cash")) {
                Pa.i0.Z(activity);
                return;
            }
            QueryLoanDialogPopUpsBean.MigrateRewardInfo migrateRewardInfo = palLoanMigrateDialog.migrateRewardInfo;
            if (migrateRewardInfo == null || TextUtils.isEmpty(migrateRewardInfo.getPopupJumpH5Url())) {
                return;
            }
            Integer popupJumpH5Type = migrateRewardInfo.getPopupJumpH5Type();
            if (popupJumpH5Type != null && popupJumpH5Type.intValue() == 3) {
                ActivityUtils.startActivity(IntentUtils.getOpenUrlIntent(migrateRewardInfo.getPopupJumpH5Url(), true));
            } else {
                Pa.i0.c0(migrateRewardInfo.getPopupJumpH5Url());
            }
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        Long couponNominaValue;
        Integer loanDaysAfterExtend;
        Long raiseLimit;
        F6.d.h(TAG, 3, "initViews");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(p116hb.c.clContainer);
        ImageView imageView = (ImageView) findViewById(p116hb.c.ivClose);
        TextView textView = (TextView) findViewById(p116hb.c.tvSubTitle);
        TextView textView2 = (TextView) findViewById(p116hb.c.tvValue);
        TextView textView3 = (TextView) findViewById(p116hb.c.tvCoupon);
        TextView textView4 = (TextView) findViewById(p116hb.c.tvBorrow);
        if (imageView != null) {
            final int i7 = 0;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Y0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PalLoanMigrateDialog f30069b;

                {
                    this.f30069b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            this.f30069b.dismiss();
                            break;
                        default:
                            PalLoanMigrateDialog.initViews$lambda$3(this.f30069b, view);
                            break;
                    }
                }
            });
        }
        if (textView4 != null) {
            final int i10 = 1;
            textView4.setOnClickListener(new View.OnClickListener(this) { // from class: com.transsnet.palmpay.credit.ui.dialog.Y0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PalLoanMigrateDialog f30069b;

                {
                    this.f30069b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f30069b.dismiss();
                            break;
                        default:
                            PalLoanMigrateDialog.initViews$lambda$3(this.f30069b, view);
                            break;
                    }
                }
            });
        }
        Integer num = this.dialogType;
        long jLongValue = 0;
        int iIntValue = 0;
        if (num != null && num.intValue() == 1) {
            if (textView2 != null) {
                p220oa.h.s(textView2, true);
            }
            if (textView3 != null) {
                p220oa.h.s(textView3, false);
            }
            if (textView != null) {
                textView.setText("Loan limit increase");
            }
            QueryLoanDialogPopUpsBean.MigrateRewardInfo migrateRewardInfo = this.migrateRewardInfo;
            if (migrateRewardInfo != null && (raiseLimit = migrateRewardInfo.getRaiseLimit()) != null) {
                jLongValue = raiseLimit.longValue();
            }
            String strF = Pa.r0.F(jLongValue);
            if (textView2 != null) {
                C0.G.x("+", strF, textView2);
                return;
            }
            return;
        }
        if (num != null && num.intValue() == 2) {
            if (textView2 != null) {
                p220oa.h.s(textView2, true);
            }
            if (textView3 != null) {
                p220oa.h.s(textView3, false);
            }
            if (textView != null) {
                textView.setText("Extension of loan term");
            }
            if (textView2 != null) {
                QueryLoanDialogPopUpsBean.MigrateRewardInfo migrateRewardInfo2 = this.migrateRewardInfo;
                if (migrateRewardInfo2 != null && (loanDaysAfterExtend = migrateRewardInfo2.getLoanDaysAfterExtend()) != null) {
                    iIntValue = loanDaysAfterExtend.intValue();
                }
                textView2.setText(iIntValue + " days");
                return;
            }
            return;
        }
        if (textView2 != null) {
            p220oa.h.s(textView2, false);
        }
        if (textView3 != null) {
            p220oa.h.s(textView3, true);
        }
        if (textView != null) {
            textView.setText("Interest discount coupon");
        }
        if (textView3 != null) {
            QueryLoanDialogPopUpsBean.MigrateRewardInfo migrateRewardInfo3 = this.migrateRewardInfo;
            if (migrateRewardInfo3 != null && (couponNominaValue = migrateRewardInfo3.getCouponNominaValue()) != null) {
                jLongValue = couponNominaValue.longValue();
            }
            textView3.setText(jLongValue + "%");
        }
        androidx.constraintlayout.widget.m mVar = new androidx.constraintlayout.widget.m();
        mVar.e(constraintLayout);
        mVar.h(textView4.getId(), 3, textView3.getId(), 4, 48);
        mVar.b(constraintLayout);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PalLoanMigrateDialog(@NotNull Context context, @Nullable String str, @Nullable Integer num, @Nullable QueryLoanDialogPopUpsBean.MigrateRewardInfo migrateRewardInfo) {
        super(context, p116hb.d.cs_cl_dialog_pal_loan_migrate);
        Intrinsics.checkNotNullParameter(context, "context");
        this.loanProduct = str;
        this.dialogType = num;
        this.migrateRewardInfo = migrateRewardInfo;
    }
}
