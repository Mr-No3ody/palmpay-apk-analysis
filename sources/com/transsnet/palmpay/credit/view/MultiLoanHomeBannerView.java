package com.transsnet.palmpay.credit.view;

import L6.b;
import Pa.r0;
import Ya.d;
import Ya.e;
import Ya.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.credit.bean.MultiLoanInfo;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/credit/view/MultiLoanHomeBannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiLoanHomeBannerView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f30811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f30812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f30813c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultiLoanHomeBannerView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void c(MultiLoanInfo multiLoanInfo) {
        String summaryText = multiLoanInfo != null ? multiLoanInfo.getSummaryText() : null;
        if (summaryText == null || StringsKt.F(summaryText)) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        String summaryText2 = multiLoanInfo != null ? multiLoanInfo.getSummaryText() : null;
        TextView textView = this.f30812b;
        textView.setText(summaryText2);
        String summaryIcon = multiLoanInfo != null ? multiLoanInfo.getSummaryIcon() : null;
        View view = this.f30811a;
        if (summaryIcon == null || StringsKt.F(summaryIcon)) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            Intrinsics.f(view, "null cannot be cast to non-null type android.widget.ImageView");
            r0.l1(summaryIcon, (ImageView) view);
        }
        boolean zC = multiLoanInfo != null ? Intrinsics.c(multiLoanInfo.getCtaEnabled(), Boolean.TRUE) : false;
        this.f30813c.setBackgroundResource(!zC ? d.cs_multi_loan_banner_warn_bg : d.cs_multi_loan_banner_info_bg);
        textView.setTextColor(!zC ? getContext().getColor(b.ppColorWarning) : getContext().getColor(b.ppColorFlexiCashPrimary));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MultiLoanHomeBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(f.cs_multi_loan_home_banner_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(e.rootBanner);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f30813c = viewFindViewById;
        View viewFindViewById2 = findViewById(e.ivIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f30811a = viewFindViewById2;
        View viewFindViewById3 = findViewById(e.tvSummary);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f30812b = (TextView) viewFindViewById3;
        setVisibility(8);
    }
}
