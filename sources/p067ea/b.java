package p067ea;

import C0.G;
import G8.a;
import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.viewmodel.CashierPayMethodItem;
import com.transsnet.palmpay.custom_view.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;
import p025ba.g;
import p025ba.k;
import p052da.C1644p;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends N3.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C1644p f36241j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C1644p getSelectPayMethod, C1644p getPayAmount, C1644p getItemClick, C1644p getConfig) {
        super(getSelectPayMethod, getPayAmount, getItemClick, 1);
        Intrinsics.checkNotNullParameter(getSelectPayMethod, "getSelectPayMethod");
        Intrinsics.checkNotNullParameter(getPayAmount, "getPayAmount");
        Intrinsics.checkNotNullParameter(getItemClick, "getItemClick");
        Intrinsics.checkNotNullParameter(getConfig, "getConfig");
        this.f36241j = getConfig;
    }

    @Override // T1.b
    public final void b(BaseViewHolder holder, Object obj) {
        CashierPaymentMethodBean pm = (CashierPaymentMethodBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        CashierPayMethodItem itemHolder = (CashierPayMethodItem) holder.getView(e.model_payment_layout);
        itemHolder.f();
        if (pm != null) {
            Function0 function0 = this.f6073g;
            long jLongValue = ((Number) function0.invoke()).longValue();
            Intrinsics.checkNotNullParameter(itemHolder, "itemHolder");
            Intrinsics.checkNotNullParameter(pm, "pm");
            AutoTrackUtil.addViewRemark(itemHolder.getMRoot(), pm.bankName);
            itemHolder.d(pm, true);
            AutoTrackUtil.addViewRemark(itemHolder.getMRoot(), c().getString(k.core_palmpay_payment_balance));
            int i7 = r.cv_palmpay_icon_circle_purple;
            if (TextUtils.isEmpty(pm.logoUrl)) {
                r0.d1(itemHolder.getMPayMethodImg(), i7);
            } else {
                r0.h1(itemHolder.getMPayMethodImg(), pm.logoUrl, i7);
            }
            String string = !TextUtils.isEmpty(pm.showName) ? pm.showName : c().getString(k.core_palmpay_payment_balance);
            TextView mPayMethodNameTv = itemHolder.getMPayMethodNameTv();
            if (mPayMethodNameTv != null) {
                mPayMethodNameTv.setText(string);
            }
            TextView mPayMethodNumTv = itemHolder.getMPayMethodNumTv();
            if (mPayMethodNumTv != null) {
                G.y("(", r0.B(pm.availableBalance, false), ")", mPayMethodNumTv);
            }
            if (pm.availableBalance >= jLongValue || ((Boolean) this.f36241j.invoke()).booleanValue()) {
                itemHolder.d(pm, pm.enable);
            } else {
                TextView mActHintText = itemHolder.getMActHintText();
                if (mActHintText != null) {
                    mActHintText.setVisibility(8);
                }
                TextView mHintText = itemHolder.getMHintText();
                if (mHintText != null) {
                    mHintText.setVisibility(8);
                }
                itemHolder.setEnabled(true);
                View mRoot = itemHolder.getMRoot();
                if (mRoot != null) {
                    mRoot.setEnabled(true);
                }
                ImageView mPayMethodImg = itemHolder.getMPayMethodImg();
                if (mPayMethodImg != null) {
                    mPayMethodImg.setAlpha(1.0f);
                }
                TextView mPayMethodNameTv2 = itemHolder.getMPayMethodNameTv();
                if (mPayMethodNameTv2 != null) {
                    mPayMethodNameTv2.setAlpha(1.0f);
                }
                TextView mPayMethodNumTv2 = itemHolder.getMPayMethodNumTv();
                if (mPayMethodNumTv2 != null) {
                    mPayMethodNumTv2.setAlpha(1.0f);
                }
                itemHolder.g(itemHolder.f31417a.getString(k.core_insufficient_balance_and_top_up), true);
                TextView mActiveTv = itemHolder.getMActiveTv();
                if (mActiveTv != null) {
                    mActiveTv.setText(k.core_add_money);
                }
                TextView mActiveTv2 = itemHolder.getMActiveTv();
                if (mActiveTv2 != null) {
                    mActiveTv2.setVisibility(0);
                }
                ImageView mRightIv = itemHolder.getMRightIv();
                if (mRightIv != null) {
                    mRightIv.setVisibility(8);
                }
            }
            if (!k(pm) || pm.availableBalance < ((Number) function0.invoke()).longValue()) {
                ImageView mRightIv2 = itemHolder.getMRightIv();
                if (mRightIv2 != null) {
                    mRightIv2.setImageDrawable(null);
                    return;
                }
                return;
            }
            ImageView mRightIv3 = itemHolder.getMRightIv();
            if (mRightIv3 != null) {
                mRightIv3.setImageDrawable(a.x(c(), S6.a.pay_Selected, Integer.valueOf(c().getColor(L6.b.ppColorSuccess)), null, 20.0f, 116));
            }
        }
    }

    @Override // T1.b
    public final int d() {
        return 19;
    }

    @Override // T1.b
    public final int e() {
        return g.core_layout_cashier_payment_method_balance_item;
    }
}
