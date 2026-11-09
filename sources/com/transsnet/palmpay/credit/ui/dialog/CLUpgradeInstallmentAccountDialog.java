package com.transsnet.palmpay.credit.ui.dialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.credit.bean.resp.CardRiskLevelResp;
import com.transsnet.palmpay.credit.bean.resp.LoanConfig;
import com.transsnet.palmpay.credit.bean.resp.QueryCanBorrowAgainBean;
import com.transsnet.palmpay.credit.bean.resp.QueryCanBorrowAgainResp;
import com.transsnet.palmpay.util.ScreenUtils;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/CLUpgradeInstallmentAccountDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "findViews", "()V", "initViews", "Lcom/transsnet/palmpay/credit/bean/resp/QueryCanBorrowAgainResp;", "resp", "", "accountType", "fillData", "(Lcom/transsnet/palmpay/credit/bean/resp/QueryCanBorrowAgainResp;I)V", "Landroid/widget/LinearLayout;", "learn_more", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "apply", "Landroid/widget/TextView;", "tvDailyInterest", "tvUptoRepay", "Landroid/widget/ImageView;", "close", "Landroid/widget/ImageView;", "mAccountType", "I", "mResp", "Lcom/transsnet/palmpay/credit/bean/resp/QueryCanBorrowAgainResp;", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CLUpgradeInstallmentAccountDialog extends com.transsnet.palmpay.custom_view.dialog.b {

    @Nullable
    private TextView apply;

    @Nullable
    private ImageView close;

    @Nullable
    private LinearLayout learn_more;
    private int mAccountType;

    @Nullable
    private QueryCanBorrowAgainResp mResp;

    @Nullable
    private TextView tvDailyInterest;

    @Nullable
    private TextView tvUptoRepay;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CLUpgradeInstallmentAccountDialog(@NotNull Context context) {
        super(context, p116hb.d.cs_layout_upgrade_installment_account_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void findViews() {
        this.learn_more = (LinearLayout) findViewById(p116hb.c.learn_more);
        this.apply = (TextView) findViewById(p116hb.c.apply);
        this.tvDailyInterest = (TextView) findViewById(p116hb.c.tvDailyInterest);
        this.tvUptoRepay = (TextView) findViewById(p116hb.c.tvUptoRepay);
        this.close = (ImageView) findViewById(p116hb.c.close);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(CLUpgradeInstallmentAccountDialog cLUpgradeInstallmentAccountDialog, View view) {
        int id2 = view.getId();
        if (id2 == p116hb.c.close) {
            cLUpgradeInstallmentAccountDialog.dismiss();
            return;
        }
        if (id2 != p116hb.c.apply) {
            if (id2 == p116hb.c.learn_more) {
                Bundle bundle = new Bundle();
                bundle.putLong("amount", 500000L);
                com.palmpay.lib.apm.launchcounter.util.d.x(bundle, "AboutInstallmentLoan");
                return;
            }
            return;
        }
        ARouter.getInstance().build("/credit_score/ol_upgrade_installment_activity").navigation();
        cLUpgradeInstallmentAccountDialog.dismiss();
        Activity ownerActivity = cLUpgradeInstallmentAccountDialog.getOwnerActivity();
        if (ownerActivity != null) {
            ownerActivity.finish();
        }
    }

    public final void fillData(@NotNull QueryCanBorrowAgainResp resp, int accountType) {
        LoanConfig loanConfig;
        LoanConfig loanConfig2;
        Intrinsics.checkNotNullParameter(resp, "resp");
        this.mAccountType = accountType;
        this.mResp = resp;
        QueryCanBorrowAgainBean data = resp.getData();
        if (data == null || (loanConfig = data.getLoanConfig()) == null) {
            return;
        }
        TextView textView = this.tvUptoRepay;
        String loanRatioString = null;
        if (textView != null) {
            SpannableStringBuilder spannableStringBuilderB = p220oa.h.B("Up to ", null, Integer.valueOf(Color.parseColor("#906948")), null, null, null, null, 1021);
            Long availableAmount = loanConfig.getAvailableAmount();
            SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilderB.append((CharSequence) p220oa.h.B(N8.q0.j(Pa.r0.F(availableAmount != null ? availableAmount.longValue() : 0L), ","), null, Integer.valueOf(Color.parseColor("#FF9900")), null, null, null, null, 1021)).append((CharSequence) p220oa.h.B("Repay In", null, Integer.valueOf(Color.parseColor("#906948")), null, null, null, null, 1021));
            CardRiskLevelResp riskLevelResp = loanConfig.getRiskLevelResp();
            textView.setText(spannableStringBuilderAppend.append((CharSequence) p220oa.h.B(" " + (riskLevelResp != null ? riskLevelResp.getTerm() : null) + " Terms", null, Integer.valueOf(Color.parseColor("#FF9900")), null, null, null, null, 1021)));
        }
        TextView textView2 = this.tvDailyInterest;
        if (textView2 != null) {
            SpannableStringBuilder spannableStringBuilderB2 = p220oa.h.B("Daily interest", null, Integer.valueOf(Color.parseColor("#906948")), null, null, null, null, 1021);
            QueryCanBorrowAgainBean data2 = resp.getData();
            if (data2 != null && (loanConfig2 = data2.getLoanConfig()) != null) {
                loanRatioString = loanConfig2.getLoanRatioString();
            }
            textView2.setText(spannableStringBuilderB2.append((CharSequence) p220oa.h.B(C0.G.o(" ", loanRatioString), null, Integer.valueOf(Color.parseColor("#FF9900")), null, null, null, null, 1021)));
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        findViews();
        Window window = getWindow();
        Intrinsics.e(window);
        window.setGravity(17);
        window.setWindowAnimations(p025ba.l.dialog_bottom_in_out);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = ScreenUtils.getScreenWidth() - SizeUtils.dp2px(32.0f);
        attributes.height = -2;
        p220oa.h.q(new ViewOnClickListenerC1533v(this, 5), this.close, this.apply, this.learn_more);
    }
}
