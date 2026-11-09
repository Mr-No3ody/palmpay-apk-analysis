package Gb;

import Pa.r0;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.credit.bean.RepaymentPlan;
import com.transsnet.palmpay.credit.bean.style.MobileInstallmentFirstPayStyleConfig;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponItemBean;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3241a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3242b;

    public M() {
        super(Pd.d.qt_item_betting_coupon, null);
    }

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        switch (this.f3241a) {
            case 0:
                RepaymentPlan item = (RepaymentPlan) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item, "item");
                TextView textView = (TextView) holder.getView(Ya.e.tvTerm);
                MobileInstallmentFirstPayStyleConfig mobileInstallmentFirstPayStyleConfig = (MobileInstallmentFirstPayStyleConfig) this.f3242b;
                Fb.j.c(textView, mobileInstallmentFirstPayStyleConfig != null ? mobileInstallmentFirstPayStyleConfig.itemKey : null);
                Fb.j.c((TextView) holder.getView(Ya.e.tvRepaymentAmount), mobileInstallmentFirstPayStyleConfig != null ? mobileInstallmentFirstPayStyleConfig.itemValue : null);
                int i7 = Ya.e.tvRepaymentAmount;
                Long l5 = item.unpaidAmount;
                holder.setText(i7, r0.B(l5 != null ? l5.longValue() : 0L, true));
                int i10 = Ya.e.tvTerm;
                Integer num = item.currentTerm;
                Long l6 = item.repaymentDate;
                holder.setText(i10, num + " st term(" + r0.S(l6 != null ? l6.longValue() : 0L) + ")");
                break;
            default:
                BillerCouponItemBean item2 = (BillerCouponItemBean) obj;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item2, "item");
                ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
                if (getDefItemCount() == 1) {
                    layoutParams.width = -1;
                } else {
                    layoutParams.width = CommonViewExtKt.getDp(234);
                }
                holder.itemView.setLayoutParams(layoutParams);
                String couponName = item2.getCouponName();
                if (couponName == null) {
                    couponName = "";
                }
                holder.setText(Pd.c.tvCouponTitle, couponName);
                String string = TextUtils.isEmpty(item2.getStatus()) ? getContext().getString(Pd.f.qt_claim) : getContext().getString(p025ba.k.core_use);
                Intrinsics.e(string);
                holder.setText(Pd.c.btnAction, string);
                holder.getView(Pd.c.btnAction).setOnClickListener(new com.transsnet.palmpay.managemoney.ui.activity.J(this, 6, item2, holder));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(MobileInstallmentFirstPayStyleConfig mobileInstallmentFirstPayStyleConfig, int i7, ArrayList arrayList) {
        super(i7, arrayList);
        this.f3242b = mobileInstallmentFirstPayStyleConfig;
    }
}
