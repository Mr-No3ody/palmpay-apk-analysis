package com.transsnet.palmpay.managemoney.ui.view;

import Jc.f;
import Jc.g;
import Pa.r0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.xiaofeidev.shadow.ShadowFrameLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.scwang.smartrefresh.layout.util.DensityUtil;
import com.transsnet.palmpay.account.bean.rsp.TrialCalculation;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.ui.activity.ViewOnClickListenerC1478l;
import com.transsnet.palmpay.custom_view.AmountEditText;
import com.transsnet.palmpay.custom_view.RoundedTextView;
import com.transsnet.palmpay.main.export.bean.rsp.GetUserAssetsAmountResp;
import com.transsnet.palmpay.managemoney.bean.CashBoxRemainingBalance;
import com.transsnet.palmpay.managemoney.bean.resp.GetCashBoxBeforeOrderConfigResp;
import com.transsnet.palmpay.managemoney.bean.resp.GetInterestRateConfigResp;
import com.transsnet.palmpay.managemoney.ui.activity.P;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0016B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\nB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/view/CashBoxEstimatedInterestView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "interestBackAmount", "", "setInterestBackAmount", "(Ljava/lang/String;)V", "H", "I", "getMType$annotations", "()V", "mType", "Type", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCashBoxEstimatedInterestView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CashBoxEstimatedInterestView.kt\ncom/transsnet/palmpay/managemoney/ui/view/CashBoxEstimatedInterestView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n1878#2,3:401\n1869#2,2:404\n*S KotlinDebug\n*F\n+ 1 CashBoxEstimatedInterestView.kt\ncom/transsnet/palmpay/managemoney/ui/view/CashBoxEstimatedInterestView\n*L\n131#1:401,3\n195#1:404,2\n*E\n"})
public final class CashBoxEstimatedInterestView extends LinearLayout {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f32686L = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public GetUserAssetsAmountResp.Balance f32687A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public CashBoxRemainingBalance f32688B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f32689C;

    /* JADX INFO: renamed from: H, reason: collision with root package name and from kotlin metadata */
    public final int mType;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IconicsImageView f32692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32693c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ShadowFrameLayout f32694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IconicsTextView f32695e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f32696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f32697g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AmountEditText f32698i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f32699j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final RoundedTextView f32700o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TextView f32701p;
    public final ConstraintLayout t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f32702v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ConstraintLayout f32703w;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0005\b\u0087\u0002\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/managemoney/ui/view/CashBoxEstimatedInterestView$Type;", "", "<init>", "()V", "Companion", "a", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    public @interface Type {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;
        public static final int DEPOSIT = 1;
        public static final int WITHDRAW = 2;

        /* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.ui.view.CashBoxEstimatedInterestView$Type$a, reason: from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int DEPOSIT = 1;
            public static final int WITHDRAW = 2;

            private Companion() {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashBoxEstimatedInterestView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        Resources resources;
        int i10;
        Resources resources2;
        int i11;
        Resources resources3;
        int i12;
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32689C = "";
        this.mType = 1;
        LayoutInflater.from(context).inflate(Jc.d.mm_cash_box_estimated_interest_view, this);
        this.f32691a = (LinearLayout) findViewById(Jc.c.layoutEstimatedInterestReturnList);
        this.f32692b = (IconicsImageView) findViewById(Jc.c.ivWarn);
        this.f32693c = (TextView) findViewById(Jc.c.tvEstimatedInterest);
        this.f32694d = (ShadowFrameLayout) findViewById(Jc.c.layoutInterrestShow);
        this.f32695e = (IconicsTextView) findViewById(Jc.c.tvAddMoney);
        this.f32696f = (ConstraintLayout) findViewById(Jc.c.clsAddMoney);
        this.f32697g = (TextView) findViewById(Jc.c.tvPalmpayBalance);
        this.f32698i = (AmountEditText) findViewById(Jc.c.etAmount);
        this.f32699j = (TextView) findViewById(Jc.c.tvAmountUnit);
        this.f32700o = (RoundedTextView) findViewById(Jc.c.rtvInterestRate);
        this.f32701p = (TextView) findViewById(Jc.c.tvAmountTitle);
        this.t = (ConstraintLayout) findViewById(Jc.c.layoutSecurityGuaranteed);
        this.f32702v = (TextView) findViewById(Jc.c.tvTips);
        this.f32703w = (ConstraintLayout) findViewById(Jc.c.cls_withdraw);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.CashBoxEstimatedInterestView, i7, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.mType = typedArrayObtainStyledAttributes.getInt(g.CashBoxEstimatedInterestView_esrv_type, 1);
        typedArrayObtainStyledAttributes.recycle();
        ConstraintLayout constraintLayout = this.f32703w;
        if (constraintLayout != null) {
            constraintLayout.setVisibility(this.mType == 1 ? 8 : 0);
        }
        TextView textView = this.f32699j;
        if (textView != null) {
            textView.setText(BaseApplication.getCurrencySymbol());
        }
        TextView textView2 = this.f32701p;
        if (textView2 != null) {
            if (this.mType == 1) {
                resources3 = getResources();
                i12 = f.mm_deposit_amount;
            } else {
                resources3 = getResources();
                i12 = f.mm_withdraw_amount;
            }
            textView2.setText(resources3.getString(i12));
        }
        TextView textView3 = this.f32693c;
        if (textView3 != null) {
            if (this.mType == 1) {
                resources2 = getResources();
                i11 = f.mm_estimated_interest_return;
            } else {
                resources2 = getResources();
                i11 = f.mm_estimated_interest_loss;
            }
            textView3.setText(resources2.getString(i11));
        }
        IconicsImageView iconicsImageView = this.f32692b;
        if (iconicsImageView != null) {
            iconicsImageView.setVisibility(this.mType != 1 ? 8 : 0);
        }
        TextView textView4 = this.f32702v;
        if (textView4 != null) {
            if (this.mType == 1) {
                resources = getResources();
                i10 = f.mm_cash_box_deposit_tips;
            } else {
                resources = getResources();
                i10 = f.mm_cash_box_withdraw_header_tips;
            }
            textView4.setText(resources.getString(i10));
        }
        ConstraintLayout constraintLayout2 = this.t;
        if (constraintLayout2 != null) {
            constraintLayout2.setOnClickListener(new ViewOnClickListenerC1478l(28));
        }
        AmountEditText amountEditText = this.f32698i;
        if (amountEditText != null) {
            amountEditText.addTextChangedListener(new P(this, 3));
        }
        IconicsImageView iconicsImageView2 = this.f32692b;
        if (iconicsImageView2 != null) {
            iconicsImageView2.setOnClickListener(new a(this, 1));
        }
        IconicsTextView iconicsTextView = this.f32695e;
        if (iconicsTextView != null) {
            iconicsTextView.setOnClickListener(new ViewOnClickListenerC1478l(29));
        }
    }

    private static /* synthetic */ void getMType$annotations() {
    }

    public final RoundedTextView a(String str) {
        RoundedTextView roundedTextView = new RoundedTextView(getContext());
        roundedTextView.setLayoutParams(new LinearLayout.LayoutParams(0, DensityUtil.dp2px(32.0f), 1.0f));
        roundedTextView.setRoundedBackgroundColor(roundedTextView.getContext().getColor(L6.b.ppColorBackgroundDark));
        roundedTextView.setText(str);
        roundedTextView.setTextColor(roundedTextView.getContext().getColor(L6.b.ppColorTextPrimary));
        roundedTextView.setGravity(17);
        roundedTextView.setTextSize(12.0f);
        roundedTextView.setRoundedCornerRadius(DensityUtil.dp2px(8.0f));
        return roundedTextView;
    }

    public final void b() {
        AmountEditText amountEditText;
        Long remainingBalance;
        if (TextUtils.isEmpty(this.f32689C)) {
            GetUserAssetsAmountResp.Balance balance = this.f32687A;
            long j6 = balance != null ? balance.availableBalance : 0L;
            CashBoxRemainingBalance cashBoxRemainingBalance = this.f32688B;
            long jLongValue = (cashBoxRemainingBalance == null || (remainingBalance = cashBoxRemainingBalance.getRemainingBalance()) == null) ? 0L : remainingBalance.longValue();
            if (j6 > jLongValue) {
                j6 = jLongValue;
            }
            if (j6 <= 0 || (amountEditText = this.f32698i) == null) {
                return;
            }
            amountEditText.setText(r0.A(j6));
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    public final void c(GetUserAssetsAmountResp.Balance balance) {
        String string;
        long jLongValue;
        int i7;
        ConstraintLayout constraintLayout = this.f32696f;
        this.f32687A = balance;
        b();
        int i10 = this.mType;
        if (i10 == 1) {
            long j6 = balance != null ? balance.availableBalance : 0L;
            if (j6 > 0) {
                try {
                    if (!TextUtils.isEmpty(this.f32689C)) {
                        String amountStr = y.k(this.f32689C, ",", "");
                        Intrinsics.checkNotNullParameter(amountStr, "amountStr");
                        if (TextUtils.isEmpty(amountStr)) {
                            jLongValue = 0;
                            if (constraintLayout != null) {
                                if (jLongValue > j6) {
                                    i7 = 0;
                                } else {
                                    i7 = 8;
                                }
                                constraintLayout.setVisibility(i7);
                            }
                        } else {
                            try {
                                jLongValue = new BigDecimal(amountStr).multiply(new BigDecimal(100)).longValue();
                            } catch (Exception e10) {
                                F6.d.c("availableBalance---", "getLong: ", e10);
                                jLongValue = 0;
                            }
                            if (constraintLayout != null) {
                                if (jLongValue > j6) {
                                    i7 = 0;
                                } else {
                                    i7 = 8;
                                }
                                constraintLayout.setVisibility(i7);
                            }
                        }
                    } else if (j6 == 0 && constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                    }
                    Unit unit = Unit.f38893a;
                } catch (Exception e11) {
                    e11.toString();
                }
            } else {
                if (j6 == 0) {
                    constraintLayout.setVisibility(0);
                }
                Unit unit2 = Unit.f38893a;
            }
        }
        TextView textView = this.f32697g;
        if (textView != null) {
            if (i10 == 1) {
                string = getContext().getString(f.mm_palmpay_balance, r0.B(balance != null ? balance.availableBalance : 0L, false));
            } else {
                string = getContext().getString(f.mm_cashbox_balance, r0.B(balance != null ? balance.cashBoxBalance : 0L, false));
            }
            textView.setText(string);
        }
    }

    public final void d(List list) {
        int iD = p059e1.a.D(0, "invest_interest_disable");
        ShadowFrameLayout shadowFrameLayout = this.f32694d;
        int i7 = 8;
        if (shadowFrameLayout != null) {
            shadowFrameLayout.setVisibility(iD == 1 ? 8 : 0);
        }
        if (iD == 0) {
            LinearLayout linearLayout = this.f32691a;
            if (linearLayout != null) {
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    i7 = 0;
                }
                linearLayout.setVisibility(i7);
            }
            LinearLayout linearLayout2 = this.f32691a;
            if (linearLayout2 != null) {
                linearLayout2.removeAllViews();
            }
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    for (TrialCalculation trialCalculation : list) {
                        LinearLayout linearLayout3 = this.f32691a;
                        if (linearLayout3 != null) {
                            View viewInflate = LayoutInflater.from(getContext()).inflate(Jc.d.mm_item_cash_box_estimated_interest, (ViewGroup) null);
                            viewInflate.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                            if (trialCalculation != null) {
                                View viewFindViewById = viewInflate.findViewById(Jc.c.tvInterestDay);
                                Intrinsics.f(viewFindViewById, "null cannot be cast to non-null type android.widget.TextView");
                                ((TextView) viewFindViewById).setText(trialCalculation.daysDesc);
                                View viewFindViewById2 = viewInflate.findViewById(Jc.c.tvInterestAmount);
                                Intrinsics.f(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
                                TextView textView = (TextView) viewFindViewById2;
                                textView.setTextColor(viewInflate.getResources().getColor(L6.b.ppColorSuccess));
                                r0.R1(textView, "fonts/PalmPayNum-Bold.ttf");
                                Long l5 = trialCalculation.interest;
                                textView.setText(r0.B(l5 != null ? l5.longValue() : 0L, true));
                            }
                            Intrinsics.checkNotNullExpressionValue(viewInflate, "apply(...)");
                            linearLayout3.addView(viewInflate);
                        }
                    }
                }
            }
        }
    }

    public final void e(List list) {
        String productRateV2;
        RoundedTextView roundedTextView = this.f32700o;
        if (roundedTextView != null) {
            GetInterestRateConfigResp getInterestRateConfigResp = Kc.f.f4999b.getInstance().f5000a;
            if (getInterestRateConfigResp == null || (productRateV2 = getInterestRateConfigResp.getProductRateV2()) == null) {
                productRateV2 = "";
            }
            roundedTextView.setText(productRateV2.concat(" p.a."));
        }
        RoundedTextView roundedTextView2 = this.f32700o;
        int i7 = 0;
        if (roundedTextView2 != null) {
            roundedTextView2.setVisibility(this.mType == 1 ? 0 : 8);
        }
        if (list != null) {
            List list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                for (Object obj : list2) {
                    int i10 = i7 + 1;
                    if (i7 < 0) {
                        C1850q.k();
                        throw null;
                    }
                    GetCashBoxBeforeOrderConfigResp.CashBoxConfig cashBoxConfig = (GetCashBoxBeforeOrderConfigResp.CashBoxConfig) obj;
                    a(this.mType == 2 ? com.airbnb.lottie.model.layer.d.n(new Object[]{r0.z0(r0.w1(String.valueOf(cashBoxConfig.getValue()), "100").toPlainString())}, 1, "%s%%", "format(...)") : r0.C(r0.z0(r0.t(cashBoxConfig.getValue())), true)).setOnClickListener(new p010a9.b(27, this, cashBoxConfig));
                    if (this.mType == 1 && i7 == list.size() - 1) {
                        a(getResources().getString(k.core_all)).setOnClickListener(new a(this, 0));
                    }
                    i7 = i10;
                }
            }
        }
    }

    public final void setInterestBackAmount(@NotNull String interestBackAmount) {
        Intrinsics.checkNotNullParameter(interestBackAmount, "interestBackAmount");
        this.f32689C = interestBackAmount;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashBoxEstimatedInterestView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CashBoxEstimatedInterestView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
