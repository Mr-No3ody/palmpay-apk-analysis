package com.transsnet.palmpay.credit.ui.view;

import Pa.r0;
import Y.j;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.credit.bean.resp.CLRepaymentPlanData;
import com.transsnet.palmpay.custom_view.model.BaseModel;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p116hb.b;
import p116hb.c;
import p116hb.d;
import p220oa.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/view/BorrowCLInfoView;", "Lcom/transsnet/palmpay/custom_view/model/BaseModel;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BorrowCLInfoView extends BaseModel {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f30622w = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f30623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f30624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LinearLayout f30625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f30626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f30627g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f30628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f30629j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f30630o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f30631p;
    public TextView t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f30632v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BorrowCLInfoView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.transsnet.palmpay.custom_view.model.BaseModel
    public final View c(Context context) {
        View viewInflate = View.inflate(context, d.cs_view_borrow_cl_info, this);
        this.f30623c = (LinearLayout) viewInflate.findViewById(c.period_layout);
        this.f30624d = (LinearLayout) viewInflate.findViewById(c.fee_layout);
        this.f30625e = (LinearLayout) viewInflate.findViewById(c.interest_layout);
        this.f30627g = (LinearLayout) viewInflate.findViewById(c.interest_sub_layout);
        this.f30626f = (LinearLayout) viewInflate.findViewById(c.stamp_duty_layout);
        this.f30628i = (TextView) viewInflate.findViewById(c.loan_period_text);
        this.f30629j = (TextView) viewInflate.findViewById(c.service_fee_text);
        this.f30630o = (TextView) viewInflate.findViewById(c.interest_text);
        this.f30631p = (TextView) viewInflate.findViewById(c.interest_text_before);
        this.t = (TextView) viewInflate.findViewById(c.tv_stamp_duty_title);
        Intrinsics.e(context);
        Resources resources = context.getResources();
        int i7 = b.cs_cl_info_icon;
        ThreadLocal threadLocal = j.f11254a;
        Drawable drawable = resources.getDrawable(i7, null);
        if (drawable != null) {
            drawable.setBounds(0, 0, SizeUtils.dp2px(11.0f), SizeUtils.dp2px(11.0f));
        } else {
            drawable = null;
        }
        TextView textView = this.t;
        if (textView != null) {
            textView.setCompoundDrawables(null, null, drawable, null);
        }
        this.f30632v = (TextView) viewInflate.findViewById(c.stamp_duty_text);
        return viewInflate;
    }

    public final void d(CLRepaymentPlanData cLRepaymentPlanData) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        Long stampDuty;
        Long stampDuty2;
        TextPaint paint;
        Long originInterestSum;
        Long interestSum;
        Long serviceFeeSum;
        Long serviceFeeSum2;
        TextView textView = this.f30628i;
        if (textView != null) {
            textView.setText((cLRepaymentPlanData != null ? cLRepaymentPlanData.getInterestDays() : null) + " Days");
        }
        TextView textView2 = this.f30629j;
        long jLongValue = 0;
        if (textView2 != null) {
            textView2.setText(r0.F((cLRepaymentPlanData == null || (serviceFeeSum2 = cLRepaymentPlanData.getServiceFeeSum()) == null) ? 0L : serviceFeeSum2.longValue()));
        }
        LinearLayout linearLayout5 = this.f30624d;
        if (linearLayout5 != null) {
            h.s(linearLayout5, ((cLRepaymentPlanData == null || (serviceFeeSum = cLRepaymentPlanData.getServiceFeeSum()) == null) ? 0L : serviceFeeSum.longValue()) > 0);
        }
        TextView textView3 = this.f30630o;
        if (textView3 != null) {
            textView3.setText(r0.F((cLRepaymentPlanData == null || (interestSum = cLRepaymentPlanData.getInterestSum()) == null) ? 0L : interestSum.longValue()));
        }
        TextView textView4 = this.f30631p;
        if (textView4 != null) {
            h.s(textView4, !Intrinsics.c(cLRepaymentPlanData != null ? cLRepaymentPlanData.getOriginInterestSum() : null, cLRepaymentPlanData != null ? cLRepaymentPlanData.getInterestSum() : null));
        }
        TextView textView5 = this.f30631p;
        if (textView5 != null) {
            textView5.setText(r0.F((cLRepaymentPlanData == null || (originInterestSum = cLRepaymentPlanData.getOriginInterestSum()) == null) ? 0L : originInterestSum.longValue()));
        }
        TextView textView6 = this.f30631p;
        if (textView6 != null && (paint = textView6.getPaint()) != null) {
            paint.setFlags(17);
        }
        LinearLayout linearLayout6 = this.f30626f;
        if (linearLayout6 != null) {
            h.s(linearLayout6, ((cLRepaymentPlanData == null || (stampDuty2 = cLRepaymentPlanData.getStampDuty()) == null) ? 0L : stampDuty2.longValue()) > 0);
        }
        TextView textView7 = this.f30632v;
        if (textView7 != null) {
            if (cLRepaymentPlanData != null && (stampDuty = cLRepaymentPlanData.getStampDuty()) != null) {
                jLongValue = stampDuty.longValue();
            }
            textView7.setText(r0.F(jLongValue));
        }
        LinearLayout linearLayout7 = this.f30623c;
        if (linearLayout7 != null && linearLayout7.getVisibility() == 0 && (linearLayout = this.f30624d) != null && linearLayout.getVisibility() == 0 && (linearLayout2 = this.f30625e) != null && linearLayout2.getVisibility() == 0 && (linearLayout3 = this.f30626f) != null && linearLayout3.getVisibility() == 0) {
            LinearLayout linearLayout8 = this.f30623c;
            if (linearLayout8 != null) {
                linearLayout8.setGravity(8388611);
            }
            LinearLayout linearLayout9 = this.f30624d;
            if (linearLayout9 != null) {
                linearLayout9.setGravity(8388611);
            }
            LinearLayout linearLayout10 = this.f30625e;
            if (linearLayout10 != null) {
                linearLayout10.setGravity(8388611);
            }
            LinearLayout linearLayout11 = this.f30626f;
            if (linearLayout11 != null) {
                linearLayout11.setGravity(8388611);
            }
            TextView textView8 = this.f30631p;
            if (textView8 != null && textView8.getVisibility() == 0 && (linearLayout4 = this.f30627g) != null) {
                linearLayout4.setOrientation(1);
            }
        }
        TextView textView9 = this.t;
        if (textView9 != null) {
            h.l(new A8.c(6, this, cLRepaymentPlanData), textView9);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BorrowCLInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BorrowCLInfoView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BorrowCLInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
