package com.transsnet.palmpay.credit.ui.dialog;

import V9.C0714c;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.CountDownTimer;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CouponItem;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.rnbridge.modules.PPRNBridge;
import com.transsnet.palmpay.credit.bean.req.GetPriorityCouponReq;
import com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean;
import com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 I2\u00020\u0001:\u0001JB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u0019J'\u0010 \u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J'\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010\nJ\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\nJ\u000f\u0010,\u001a\u00020\bH\u0014¢\u0006\u0004\b,\u0010\nJ\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010\nR\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0018\u00105\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00103R\u0018\u00107\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00103R\u0018\u0010:\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00103R\u0018\u0010;\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00100R\u0018\u0010<\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00103R\u0018\u0010=\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00103R\u0018\u0010>\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00100R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010AR\u0018\u0010C\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00108R\u0018\u0010D\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010G\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/dialog/RepayRemindDialog;", "Lcom/transsnet/palmpay/custom_view/dialog/BaseChainResponsibilityDialog;", "Landroid/content/Context;", "context", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo;", "repaymentInfo", "<init>", "(Landroid/content/Context;Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo;)V", "", "findViews", "()V", "actionClick", "Lcom/transsnet/palmpay/core/bean/CouponItem;", FirebaseAnalytics.Param.COUPON, "updateView", "(Lcom/transsnet/palmpay/core/bean/CouponItem;)V", "", "tempQuotaAmount", "totalQuotaAmount", "hasOverDueTempQuota", "(JJ)V", "getPriorityCoupon", "", "days", "just3DaysOverDue", "(I)V", "feePerDay", "todayOverdue", "(J)V", "hasOverDue", "originRepay", "realRepay", "hasOverDueCoupon", "(JJJ)V", "", "hours", "minutes", "seconds", "setCountTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", CodePushConstants.LATEST_ROLLBACK_TIME_KEY, "countDownTime", "cancelCountDown", "handlerChain", "initViews", PPRNBridge.DIALOG_ACTION_DISMISS, "Landroid/widget/ImageView;", "iv_top_icon", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "second", "Landroid/widget/TextView;", "mins", "hour", "Landroid/view/View;", "tv_coupon_time", "Landroid/view/View;", "tv_action", "tv_coupon", "tv_coupon_bg", "tv_cash_expired_day", "tv_content", "iiv_close", "Landroid/widget/RelativeLayout;", "content_bg", "Landroid/widget/RelativeLayout;", "rl_content", "rl_root", "mRepaymentInfo", "Lcom/transsnet/palmpay/credit/bean/resp/QueryLoanDialogPopUpsBean$RepaymentInfo;", "Landroid/os/CountDownTimer;", "countDownTimer", "Landroid/os/CountDownTimer;", "Companion", "a", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRepayRemindDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepayRemindDialog.kt\ncom/transsnet/palmpay/credit/ui/dialog/RepayRemindDialog\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,468:1\n37#2:469\n36#2,3:470\n*S KotlinDebug\n*F\n+ 1 RepayRemindDialog.kt\ncom/transsnet/palmpay/credit/ui/dialog/RepayRemindDialog\n*L\n246#1:469\n246#1:470,3\n*E\n"})
public final class RepayRemindDialog extends BaseChainResponsibilityDialog {

    @NotNull
    public static final String OC_REPAY_CARD_NO = "oc_repay_card_no";

    @Nullable
    private RelativeLayout content_bg;

    @Nullable
    private CountDownTimer countDownTimer;

    @Nullable
    private TextView hour;

    @Nullable
    private ImageView iiv_close;

    @Nullable
    private ImageView iv_top_icon;

    @Nullable
    private QueryLoanDialogPopUpsBean.RepaymentInfo mRepaymentInfo;

    @Nullable
    private TextView mins;

    @Nullable
    private RelativeLayout rl_content;

    @Nullable
    private View rl_root;

    @Nullable
    private TextView second;

    @Nullable
    private TextView tv_action;

    @Nullable
    private TextView tv_cash_expired_day;

    @Nullable
    private TextView tv_content;

    @Nullable
    private TextView tv_coupon;

    @Nullable
    private ImageView tv_coupon_bg;

    @Nullable
    private View tv_coupon_time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RepayRemindDialog(@NotNull Context context, @NotNull QueryLoanDialogPopUpsBean.RepaymentInfo repaymentInfo) {
        super(context, p116hb.d.cs_repay_remind_dialog);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(repaymentInfo, "repaymentInfo");
        this.mRepaymentInfo = repaymentInfo;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0028  */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0031  */
    /* JADX WARN: Code duplicated, block: B:26:0x003e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    /* JADX WARN: Code duplicated, block: B:29:0x0046  */
    /* JADX WARN: Code duplicated, block: B:36:0x006c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0032, code lost:
    
        if (r0 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void actionClick() {
        /*
            r4 = this;
            r4.dismiss()
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo r0 = r4.mRepaymentInfo
            r1 = 0
            if (r0 == 0) goto Ld
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo r0 = r0.getCashCardInfo()
            goto Le
        Ld:
            r0 = r1
        Le:
            if (r0 != 0) goto L1c
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo r0 = r4.mRepaymentInfo
            if (r0 == 0) goto L19
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo r0 = r0.getFlexiCardInfo()
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L34
        L1c:
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo r0 = r4.mRepaymentInfo
            if (r0 == 0) goto L25
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo r0 = r0.getCashCardInfo()
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 == 0) goto L3a
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo r0 = r4.mRepaymentInfo
            if (r0 == 0) goto L31
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo r0 = r0.getFlexiCardInfo()
            goto L32
        L31:
            r0 = r1
        L32:
            if (r0 == 0) goto L3a
        L34:
            java.lang.String r0 = "LoanRepayMix"
            com.palmpay.lib.apm.launchcounter.util.d.x(r1, r0)
            return
        L3a:
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo r0 = r4.mRepaymentInfo
            if (r0 == 0) goto L43
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo r0 = r0.getFlexiCardInfo()
            goto L44
        L43:
            r0 = r1
        L44:
            if (r0 == 0) goto L6c
            com.alibaba.android.arouter.launcher.ARouter r0 = com.alibaba.android.arouter.launcher.ARouter.getInstance()
            java.lang.String r2 = "/credit_score/oc_repay_activity"
            com.alibaba.android.arouter.facade.Postcard r0 = r0.build(r2)
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo r2 = r4.mRepaymentInfo
            if (r2 == 0) goto L5e
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo r2 = r2.getFlexiCardInfo()
            if (r2 == 0) goto L5e
            java.lang.String r1 = r2.getCardNo()
        L5e:
            java.lang.String r2 = "oc_repay_card_no"
            com.alibaba.android.arouter.facade.Postcard r0 = r0.withString(r2, r1)
            android.content.Context r1 = r4.getContext()
            r0.navigation(r1)
            return
        L6c:
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo r0 = r4.mRepaymentInfo
            if (r0 == 0) goto L88
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo r0 = r0.getCashCardInfo()
            if (r0 == 0) goto L88
            java.lang.Integer r0 = r0.getAccountType()
            if (r0 != 0) goto L7d
            goto L88
        L7d:
            int r0 = r0.intValue()
            r2 = 9
            if (r0 != r2) goto L88
            java.lang.String r0 = "INSTALLMENT_LOAN"
            goto L89
        L88:
            r0 = r1
        L89:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo r3 = r4.mRepaymentInfo
            if (r3 == 0) goto L9c
            com.transsnet.palmpay.credit.bean.resp.QueryLoanDialogPopUpsBean$RepaymentInfo$CashCardInfo r3 = r3.getCashCardInfo()
            if (r3 == 0) goto L9c
            java.lang.String r1 = r3.getCardNo()
        L9c:
            java.lang.String r3 = "cardNo"
            r2.putString(r3, r1)
            java.lang.String r1 = "loanProduct"
            r2.putString(r1, r0)
            java.lang.String r0 = "repayAllFlag"
            r1 = 0
            r2.putBoolean(r0, r1)
            java.lang.String r0 = "LoanRepayHome"
            com.palmpay.lib.apm.launchcounter.util.d.x(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.palmpay.credit.ui.dialog.RepayRemindDialog.actionClick():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelCountDown() {
        CountDownTimer countDownTimer = this.countDownTimer;
        if (countDownTimer != null) {
            Intrinsics.e(countDownTimer);
            countDownTimer.cancel();
            this.countDownTimer = null;
        }
    }

    private final void countDownTime(long time) {
        cancelCountDown();
        Gb.L l5 = new Gb.L(7, time, this);
        this.countDownTimer = l5;
        l5.start();
    }

    private final void findViews() {
        this.iv_top_icon = (ImageView) findViewById(p116hb.c.iv_top_icon);
        this.second = (TextView) findViewById(p116hb.c.second);
        this.mins = (TextView) findViewById(p116hb.c.mins);
        this.hour = (TextView) findViewById(p116hb.c.hour);
        this.tv_coupon_time = findViewById(p116hb.c.tv_coupon_time);
        this.tv_action = (TextView) findViewById(p116hb.c.tv_action);
        this.tv_coupon = (TextView) findViewById(p116hb.c.tv_coupon);
        this.tv_coupon_bg = (ImageView) findViewById(p116hb.c.tv_coupon_bg);
        this.tv_cash_expired_day = (TextView) findViewById(p116hb.c.tv_cash_expired_day);
        this.tv_content = (TextView) findViewById(p116hb.c.tv_content);
        this.iiv_close = (ImageView) findViewById(p116hb.c.iiv_close);
        this.content_bg = (RelativeLayout) findViewById(p116hb.c.content_bg);
        this.rl_content = (RelativeLayout) findViewById(p116hb.c.rl_content);
        this.rl_root = findViewById(p116hb.c.rl_root);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void getPriorityCoupon() {
        Integer status;
        Integer status2;
        ArrayList arrayList = new ArrayList();
        QueryLoanDialogPopUpsBean.RepaymentInfo repaymentInfo = this.mRepaymentInfo;
        if (repaymentInfo != null) {
            QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo = repaymentInfo.getCashCardInfo();
            int iIntValue = -1;
            if (((cashCardInfo == null || (status2 = cashCardInfo.getStatus()) == null) ? -1 : status2.intValue()) == 1) {
                arrayList.add(TransType.TRANS_TYPE_CL_REPAY);
            }
            QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo flexiCardInfo = repaymentInfo.getFlexiCardInfo();
            if (flexiCardInfo != null && (status = flexiCardInfo.getStatus()) != null) {
                iIntValue = status.intValue();
            }
            if (iIntValue == 1) {
                arrayList.add(TransType.TRANS_TYPE_OK_CARD);
            }
        }
        List list = null;
        Object[] objArr = 0;
        if (arrayList.isEmpty()) {
            updateView(null);
        } else {
            C0.G.h(p221ob.c.f40268a).getPriorityCoupon(new GetPriorityCouponReq((String[]) arrayList.toArray(new String[0]), list, 2, objArr == true ? 1 : 0)).k(p298tf.f.f42629b).i(p071ef.b.a()).subscribe(new C0714c(this, 8));
        }
    }

    private final void hasOverDue(int days) {
        TextView textView = this.tv_content;
        if (textView != null) {
            int i7 = L6.b.ppColorTextPrimary;
            SpannableStringBuilder spannableStringBuilderAppend = p220oa.h.B("You are overdue\n\n", null, null, Integer.valueOf(i7), 16, null, Typeface.create("sans-serif-medium", 0), 883).append((CharSequence) p220oa.h.B(String.valueOf(days), null, Integer.valueOf(Color.parseColor("#FE5455")), null, 44, null, null, 917));
            int color = Color.parseColor("#FE5455");
            textView.setText(spannableStringBuilderAppend.append((CharSequence) p220oa.h.B(" Days", null, Integer.valueOf(color), null, 34, null, Typeface.create("sans-serif-medium", 0), 885)).append((CharSequence) p220oa.h.B("\n\nRepay Now to avoid bad penalties", null, null, Integer.valueOf(L6.b.ppColorTextNormal), 14, null, null, 1011)).append((CharSequence) p220oa.h.B(" (Long overdue record will be reported to Credit Bureau)", null, Integer.valueOf(Color.parseColor("#FE5455")), null, 14, null, null, 1013)));
        }
    }

    private final void hasOverDueCoupon(long originRepay, long realRepay, long coupon) {
        TextView textView = this.tv_content;
        if (textView != null) {
            int i7 = L6.b.ppColorTextPrimary;
            SpannableStringBuilder spannableStringBuilderB = p220oa.h.B("One-Time Repay coupon\n", null, null, Integer.valueOf(i7), 16, null, Typeface.create("sans-serif-medium", 0), 883);
            int i10 = L6.b.ppColorTextPrimary;
            SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilderB.append((CharSequence) p220oa.h.B("Your repay:\n\n", null, null, Integer.valueOf(i10), 16, null, Typeface.create("sans-serif", 0), 883)).append((CharSequence) p220oa.h.B(N8.q0.j(BaseApplication.getCurrencySymbol(), Pa.r0.E(Math.max(0L, realRepay))), null, Integer.valueOf(Color.parseColor("#FE5455")), null, 44, null, null, 917));
            String strK = N8.q0.k(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, BaseApplication.getCurrencySymbol(), Pa.r0.E(originRepay));
            int i11 = L6.b.ppColorTextNormal;
            textView.setText(spannableStringBuilderAppend.append((CharSequence) p220oa.h.B(strK, null, null, Integer.valueOf(i11), 16, null, Typeface.create("sans-serif-medium", 0), MessageEvent.EVENT_AUTO_TOP_UP_ADD_SUCCESS)).append((CharSequence) p220oa.h.B("\n\nUsing repay-coupon can offset part of late fees", null, null, Integer.valueOf(L6.b.ppColorTextNormal), 12, null, null, 1011)));
        }
        TextView textView2 = this.tv_coupon;
        if (textView2 != null) {
            C0.G.y("Up to ", BaseApplication.getCurrencySymbol(), Pa.r0.E(coupon), textView2);
        }
        countDownTime(3600000L);
        ImageView imageView = this.tv_coupon_bg;
        if (imageView != null) {
            p220oa.h.s(imageView, true);
        }
        TextView textView3 = this.tv_coupon;
        if (textView3 != null) {
            p220oa.h.s(textView3, true);
        }
        View view = this.tv_coupon_time;
        if (view != null) {
            p220oa.h.s(view, true);
        }
    }

    private final void hasOverDueTempQuota(long tempQuotaAmount, long totalQuotaAmount) {
        ImageView imageView = this.iv_top_icon;
        if (imageView != null) {
            imageView.setImageResource(p116hb.b.cs_loan_amount_increase_dialog_top);
        }
        RelativeLayout relativeLayout = this.content_bg;
        if (relativeLayout != null) {
            p220oa.h.s(relativeLayout, false);
        }
        TextView textView = this.tv_cash_expired_day;
        if (textView != null) {
            p220oa.h.s(textView, true);
        }
        RelativeLayout relativeLayout2 = this.rl_content;
        ViewGroup.LayoutParams layoutParams = relativeLayout2 != null ? relativeLayout2.getLayoutParams() : null;
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams).setMargins(0, CommonViewExtKt.getDp(70), 0, 0);
        TextView textView2 = this.tv_content;
        if (textView2 != null) {
            textView2.setText(p220oa.h.B("Loan Amount Increase\n\n", null, null, Integer.valueOf(L6.b.ppColorTextPrimary), 16, null, Typeface.create("sans-serif-medium", 0), 883).append((CharSequence) p220oa.h.B(N8.q0.k("+", BaseApplication.getCurrencySymbol(), Pa.r0.E(tempQuotaAmount)), null, null, Integer.valueOf(L6.b.ppColorFlexiCashPrimary), 44, null, null, 915)).append((CharSequence) "\n\n").append((CharSequence) p220oa.h.B("\n\nSettle your debt to use temporary amount", null, null, Integer.valueOf(L6.b.ppColorTextAssist), 14, null, null, 1011)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initViews$lambda$0(RepayRemindDialog repayRemindDialog, View view) {
        int id2 = view.getId();
        if (id2 == p116hb.c.tv_action) {
            repayRemindDialog.actionClick();
        } else if (id2 == p116hb.c.iiv_close) {
            repayRemindDialog.dismiss();
        }
    }

    private final void just3DaysOverDue(int days) {
        TextView textView = this.tv_content;
        if (textView != null) {
            int i7 = L6.b.ppColorTextPrimary;
            textView.setText(p220oa.h.B("Due Date Count down\n\n", null, null, Integer.valueOf(i7), 16, null, Typeface.create("sans-serif-medium", 0), 883).append((CharSequence) p220oa.h.B(String.valueOf(days), null, null, Integer.valueOf(L6.b.ppColorFlexiCashPrimary), 44, null, null, 915)).append((CharSequence) p220oa.h.B(" Days", null, null, Integer.valueOf(L6.b.ppColorFlexiCashPrimary), 34, null, null, 1011)).append((CharSequence) p220oa.h.B("\n\nRepay on time to ", null, null, Integer.valueOf(L6.b.ppColorTextNormal), null, null, null, 1019)).append((CharSequence) p220oa.h.B("avoid late fees ", null, Integer.valueOf(Color.parseColor("#FE5455")), null, null, null, null, 1021)).append((CharSequence) p220oa.h.B("and\n", null, null, Integer.valueOf(L6.b.ppColorTextNormal), null, null, null, 1019)).append((CharSequence) p220oa.h.B("increase loan amount", null, null, Integer.valueOf(L6.b.ppColorTextNormal), null, null, null, 1019)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCountTime(String hours, String minutes, String seconds) {
        TextView textView = this.hour;
        if (textView != null) {
            textView.setText(hours);
        }
        TextView textView2 = this.mins;
        if (textView2 != null) {
            textView2.setText(minutes);
        }
        TextView textView3 = this.second;
        if (textView3 != null) {
            textView3.setText(seconds);
        }
    }

    private final void todayOverdue(long feePerDay) {
        TextView textView = this.tv_content;
        if (textView != null) {
            int i7 = L6.b.ppColorTextPrimary;
            SpannableStringBuilder spannableStringBuilderB = p220oa.h.B("Your Due Date is", null, null, Integer.valueOf(i7), 16, null, Typeface.create("sans-serif-medium", 0), 883);
            int color = Color.parseColor("#A43936");
            SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilderB.append((CharSequence) p220oa.h.B(" Today\n", null, Integer.valueOf(color), null, 16, null, Typeface.create("sans-serif-medium", 0), 885));
            int i10 = L6.b.ppColorTextPrimary;
            textView.setText(spannableStringBuilderAppend.append((CharSequence) p220oa.h.B("Repay now to avoid late fees.\n\n", null, null, Integer.valueOf(i10), 16, null, Typeface.create("sans-serif-medium", 0), 883)).append((CharSequence) p220oa.h.B(N8.q0.j(BaseApplication.getCurrencySymbol(), Pa.r0.E(feePerDay)), null, Integer.valueOf(Color.parseColor("#FE5455")), null, 44, null, null, 917)).append((CharSequence) p220oa.h.B("/day", null, Integer.valueOf(Color.parseColor("#FE5455")), null, 32, null, null, 1013)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:112:0x0135  */
    /* JADX WARN: Code duplicated, block: B:117:0x0146  */
    /* JADX WARN: Code duplicated, block: B:119:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x014b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0155  */
    /* JADX WARN: Code duplicated, block: B:124:0x0158  */
    public final void updateView(CouponItem coupon) {
        QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo flexiCardInfo;
        int iIntValue;
        long j6;
        Integer status;
        Integer day;
        Integer day2;
        Long unpaidPenalty;
        Long unpaidPenalty2;
        Long creditQuota;
        Long tempQuota;
        Integer status2;
        Long tempQuota2;
        Integer status3;
        QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo flexiCardInfo2;
        Long penalty;
        Integer status4;
        QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo;
        Long penalty2;
        Integer status5;
        Integer day3;
        Integer day4;
        Integer status6;
        Integer status7;
        Integer status8;
        Integer status9;
        Integer status10;
        Integer status11;
        View view = this.rl_root;
        if (view != null) {
            p220oa.h.s(view, true);
        }
        QueryLoanDialogPopUpsBean.RepaymentInfo repaymentInfo = this.mRepaymentInfo;
        if (repaymentInfo != null) {
            QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo2 = repaymentInfo.getCashCardInfo();
            int iIntValue2 = -1;
            int iIntValue3 = 0;
            long jLongValue = 0;
            if (((cashCardInfo2 == null || (status11 = cashCardInfo2.getStatus()) == null) ? -1 : status11.intValue()) != 1) {
                QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo flexiCardInfo3 = repaymentInfo.getFlexiCardInfo();
                if (((flexiCardInfo3 == null || (status10 = flexiCardInfo3.getStatus()) == null) ? -1 : status10.intValue()) != 1) {
                    QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo3 = repaymentInfo.getCashCardInfo();
                    if (((cashCardInfo3 == null || (status9 = cashCardInfo3.getStatus()) == null) ? -1 : status9.intValue()) != 2) {
                        QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo flexiCardInfo4 = repaymentInfo.getFlexiCardInfo();
                        if (((flexiCardInfo4 == null || (status8 = flexiCardInfo4.getStatus()) == null) ? -1 : status8.intValue()) != 2) {
                            QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo4 = repaymentInfo.getCashCardInfo();
                            if (((cashCardInfo4 == null || (status7 = cashCardInfo4.getStatus()) == null) ? -1 : status7.intValue()) != 0) {
                                QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo flexiCardInfo5 = repaymentInfo.getFlexiCardInfo();
                                if (flexiCardInfo5 != null && (status6 = flexiCardInfo5.getStatus()) != null) {
                                    iIntValue2 = status6.intValue();
                                }
                                if (iIntValue2 != 0) {
                                    dismiss();
                                    return;
                                }
                            }
                            QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo5 = repaymentInfo.getCashCardInfo();
                            int iIntValue4 = (cashCardInfo5 == null || (day4 = cashCardInfo5.getDay()) == null) ? 0 : day4.intValue();
                            QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo flexiCardInfo6 = repaymentInfo.getFlexiCardInfo();
                            if (flexiCardInfo6 != null && (day3 = flexiCardInfo6.getDay()) != null) {
                                iIntValue3 = day3.intValue();
                            }
                            just3DaysOverDue((iIntValue4 == 0 || iIntValue3 == 0) ? Math.max(iIntValue4, iIntValue3) : Math.min(iIntValue4, iIntValue3));
                            return;
                        }
                    }
                    QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo6 = repaymentInfo.getCashCardInfo();
                    long jLongValue2 = (((cashCardInfo6 == null || (status5 = cashCardInfo6.getStatus()) == null) ? -1 : status5.intValue()) != 2 || (cashCardInfo = repaymentInfo.getCashCardInfo()) == null || (penalty2 = cashCardInfo.getPenalty()) == null) ? 0L : penalty2.longValue();
                    QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo flexiCardInfo7 = repaymentInfo.getFlexiCardInfo();
                    if (flexiCardInfo7 != null && (status4 = flexiCardInfo7.getStatus()) != null) {
                        iIntValue2 = status4.intValue();
                    }
                    if (iIntValue2 == 2 && (flexiCardInfo2 = repaymentInfo.getFlexiCardInfo()) != null && (penalty = flexiCardInfo2.getPenalty()) != null) {
                        jLongValue = penalty.longValue();
                    }
                    todayOverdue(jLongValue2 + jLongValue);
                    return;
                }
            }
            QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo7 = repaymentInfo.getCashCardInfo();
            if (((cashCardInfo7 == null || (status3 = cashCardInfo7.getStatus()) == null) ? -1 : status3.intValue()) != 1) {
                flexiCardInfo = repaymentInfo.getFlexiCardInfo();
                if (flexiCardInfo != null || (status = flexiCardInfo.getStatus()) == null) {
                    iIntValue = -1;
                } else {
                    iIntValue = status.intValue();
                }
                if (iIntValue != 1) {
                    j6 = 0;
                } else {
                    if (Intrinsics.c(coupon != null ? coupon.transType : null, TransType.TRANS_TYPE_OK_CARD)) {
                        j6 = coupon.consumeAmt;
                    } else {
                        j6 = 0;
                    }
                }
            } else {
                if (Intrinsics.c(coupon != null ? coupon.transType : null, TransType.TRANS_TYPE_CL_REPAY)) {
                    j6 = coupon.consumeAmt;
                } else {
                    flexiCardInfo = repaymentInfo.getFlexiCardInfo();
                    if (flexiCardInfo != null) {
                        iIntValue = -1;
                    } else {
                        iIntValue = -1;
                    }
                    if (iIntValue != 1) {
                        j6 = 0;
                    } else {
                        if (Intrinsics.c(coupon != null ? coupon.transType : null, TransType.TRANS_TYPE_OK_CARD)) {
                            j6 = coupon.consumeAmt;
                        } else {
                            j6 = 0;
                        }
                    }
                }
            }
            QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo8 = repaymentInfo.getCashCardInfo();
            if (((cashCardInfo8 == null || (tempQuota2 = cashCardInfo8.getTempQuota()) == null) ? 0L : tempQuota2.longValue()) > 0) {
                QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo9 = repaymentInfo.getCashCardInfo();
                if (cashCardInfo9 != null && (status2 = cashCardInfo9.getStatus()) != null) {
                    iIntValue2 = status2.intValue();
                }
                if (iIntValue2 == 1) {
                    QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo10 = repaymentInfo.getCashCardInfo();
                    long jLongValue3 = (cashCardInfo10 == null || (tempQuota = cashCardInfo10.getTempQuota()) == null) ? 0L : tempQuota.longValue();
                    QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo11 = repaymentInfo.getCashCardInfo();
                    if (cashCardInfo11 != null && (creditQuota = cashCardInfo11.getCreditQuota()) != null) {
                        jLongValue = creditQuota.longValue();
                    }
                    hasOverDueTempQuota(jLongValue3, jLongValue);
                    return;
                }
            }
            if (j6 <= 0) {
                QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo12 = repaymentInfo.getCashCardInfo();
                int iIntValue5 = (cashCardInfo12 == null || (day2 = cashCardInfo12.getDay()) == null) ? 0 : day2.intValue();
                QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo flexiCardInfo8 = repaymentInfo.getFlexiCardInfo();
                if (flexiCardInfo8 != null && (day = flexiCardInfo8.getDay()) != null) {
                    iIntValue3 = day.intValue();
                }
                hasOverDue(Math.max(iIntValue5, iIntValue3));
                return;
            }
            QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo cashCardInfo13 = repaymentInfo.getCashCardInfo();
            long jLongValue4 = (cashCardInfo13 == null || (unpaidPenalty2 = cashCardInfo13.getUnpaidPenalty()) == null) ? 0L : unpaidPenalty2.longValue();
            QueryLoanDialogPopUpsBean.RepaymentInfo.CashCardInfo flexiCardInfo9 = repaymentInfo.getFlexiCardInfo();
            if (flexiCardInfo9 != null && (unpaidPenalty = flexiCardInfo9.getUnpaidPenalty()) != null) {
                jLongValue = unpaidPenalty.longValue();
            }
            long j10 = jLongValue4 + jLongValue;
            hasOverDueCoupon(j10, j10 - j6, j6);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        cancelCountDown();
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.BaseChainResponsibilityDialog
    public void handlerChain() {
    }

    @Override // com.transsnet.palmpay.custom_view.dialog.b
    public void initViews() {
        findViews();
        p220oa.h.q(new ViewOnClickListenerC1533v(this, 14), this.iiv_close, this.tv_action);
        getPriorityCoupon();
    }
}
