package Nc;

import C0.G;
import N8.q0;
import Pa.r0;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.managemoney.bean.AdvanceSummary;
import com.transsnet.palmpay.managemoney.bean.PlanStatus;
import com.transsnet.palmpay.managemoney.bean.PlanStatusFactory;
import com.transsnet.palmpay.managemoney.bean.ProductBean;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends AbstractC0482a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public TextView f6370A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f6371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f6372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f6373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f6374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f6375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f6376g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f6377i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f6378j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IconicsImageView f6379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f6380p;
    public int t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ConstraintLayout f6381v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f6382w;

    static {
        new y(null);
    }

    @Override // Nc.AbstractC0482a
    public final void a(int i7, Object obj) {
        TextView textView;
        TextView textView2;
        Long totalRepayableAmount;
        String advanceNo;
        ProductBean productBean = (ProductBean) obj;
        super.a(i7, productBean);
        this.f6377i.setText(this.itemView.getResources().getString(Jc.f.mm_amount_currency_symbol, BaseApplication.getCurrencySymbol()));
        this.f6378j.setText(this.itemView.getResources().getString(this.t == 1 ? Jc.f.mm_expected_interest_currency_symbol : Jc.f.mm_interest_currency_symbol, BaseApplication.getCurrencySymbol()));
        if (productBean != null) {
            r0.h1(this.f6371b, productBean.getProductIcon(), com.transsnet.palmpay.custom_view.r.cv_fixed_saving);
            this.f6372c.setText(productBean.getShowName());
            this.f6373d.setText(q0.j(r0.z0(r0.w1(String.valueOf(productBean.getAnnualizedIncomeRatio()), "100").toPlainString()), "%p.a."));
            String strA = r0.A(productBean.getPrincipal());
            TextView textView3 = this.f6374e;
            textView3.setText(strA);
            r0.R1(textView3, "fonts/PalmPayNum-Bold.ttf");
            PlanStatus planStatusProduce = PlanStatusFactory.INSTANCE.produce(productBean.getPlanStatus());
            String string = this.itemView.getResources().getString(planStatusProduce.getPlanStatusText());
            TextView textView4 = this.f6375f;
            textView4.setText(string);
            textView4.setTextColor(this.itemView.getContext().getColor(planStatusProduce.getPlanStatusColor()));
            String string2 = productBean.getInterestSwitchStatus() == 1 ? this.itemView.getResources().getString(p025ba.k.core_disabled) : r0.A(productBean.getEarning());
            TextView textView5 = this.f6376g;
            textView5.setText(string2);
            r0.R1(textView5, "fonts/PalmPayNum-Bold.ttf");
            int i10 = 8;
            this.f6379o.setVisibility(productBean.getInterestSwitchStatus() == 1 ? 0 : 8);
            textView5.setOnClickListener(new x(productBean, 0));
            boolean z3 = productBean.getRenewDepositSwitch() == 1;
            TextView textView6 = this.f6380p;
            if (textView6 != null) {
                textView6.setVisibility(z3 ? 0 : 8);
            }
            boolean hasAdvance = productBean.getHasAdvance();
            ConstraintLayout constraintLayout = this.f6381v;
            if (!hasAdvance) {
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                    return;
                }
                return;
            }
            if (constraintLayout != null) {
                if (productBean.getAdvanceSummary() != null && (advanceNo = productBean.getAdvanceSummary().getAdvanceNo()) != null && advanceNo.length() > 0) {
                    i10 = 0;
                }
                constraintLayout.setVisibility(i10);
            }
            if (productBean.getAdvanceSummary() != null && (textView2 = this.f6382w) != null) {
                AdvanceSummary advanceSummary = productBean.getAdvanceSummary();
                String strA2 = r0.A((advanceSummary == null || (totalRepayableAmount = advanceSummary.getTotalRepayableAmount()) == null) ? 0L : totalRepayableAmount.longValue());
                G.x("Advance: ₦", strA2 != null ? kotlin.text.y.k(strA2, ".00", "") : null, textView2);
            }
            if (productBean.getAdvanceSummary() == null || productBean.getAdvanceSummary().getDueDate() <= 0 || (textView = this.f6370A) == null) {
                return;
            }
            G.x("Due: ", TimeUtils.millis2String(productBean.getAdvanceSummary().getDueDate(), new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH)), textView);
        }
    }

    @Override // Nc.AbstractC0482a
    public final void b(Bundle bundle) {
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            if (Intrinsics.c(str, "plan_status")) {
                PlanStatus planStatusProduce = PlanStatusFactory.INSTANCE.produce(bundle.getInt(str));
                String string = this.itemView.getResources().getString(planStatusProduce.getPlanStatusText());
                TextView textView = this.f6375f;
                textView.setText(string);
                textView.setTextColor(this.itemView.getContext().getColor(planStatusProduce.getPlanStatusColor()));
            }
        }
    }
}
