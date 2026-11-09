package we;

import Bc.z;
import Pa.r0;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseViewHolder;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterInfo;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCouponCombo;
import com.transsnet.palmpay.ui.adapter.rewards.RewardsBannerAdapterHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends BaseViewHolder implements RewardsBannerAdapterHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f43486b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(View itemView, boolean z3) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f43485a = z3;
        int i7 = Ac.e.btnRight;
        PpButton ppButton = (PpButton) p059e1.a.m(i7, itemView);
        if (ppButton != null) {
            i7 = Ac.e.ivBg;
            ImageView imageView = (ImageView) p059e1.a.m(i7, itemView);
            if (imageView != null) {
                i7 = Ac.e.ivCouponBg;
                if (((ImageView) p059e1.a.m(i7, itemView)) != null) {
                    i7 = Ac.e.tvCouponAmount;
                    TextView textView = (TextView) p059e1.a.m(i7, itemView);
                    if (textView != null) {
                        i7 = Ac.e.tvTitle;
                        TextView textView2 = (TextView) p059e1.a.m(i7, itemView);
                        if (textView2 != null) {
                            this.f43486b = new z((ConstraintLayout) itemView, ppButton, imageView, textView, textView2, 0);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(itemView.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.ui.adapter.rewards.RewardsBannerAdapterHolder
    public final void bindRewardsCenterData(HomeRewardsCenterInfo data, View.OnClickListener claimListener) {
        PpButton ppButton;
        PpButton ppButton2;
        TextView textView;
        TextView textView2;
        TextView textView3;
        TextView textView4;
        PpButton ppButton3;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(claimListener, "claimListener");
        z zVar = this.f43486b;
        if (zVar != null && (ppButton3 = zVar.f888c) != null) {
            ppButton3.b(false);
        }
        HomeRewardsCouponCombo couponCombo = data.getCouponCombo();
        boolean z3 = this.f43485a;
        if (couponCombo != null) {
            if (zVar != null && (textView4 = zVar.f891f) != null) {
                textView4.setText(couponCombo.couponComboTitle);
            }
            if (zVar != null && (textView3 = zVar.f890e) != null) {
                textView3.setText(couponCombo.couponComboContent);
            }
            String str = (!z3 || TextUtils.isEmpty(couponCombo.darkBackGroupUrl)) ? couponCombo.backGroupUrl : couponCombo.darkBackGroupUrl;
            if (!TextUtils.isEmpty(str)) {
                r0.l1(str, zVar != null ? zVar.f889d : null);
            }
        }
        int i7 = z3 ? L6.b.ppColorButtonTextWhite : L6.b.ppColorPrimary;
        if (zVar != null && (textView2 = zVar.f891f) != null) {
            textView2.setTextColor(CommonViewExtKt.colorInt(i7, this.itemView.getContext()));
        }
        if (zVar != null && (textView = zVar.f890e) != null) {
            textView.setTextColor(CommonViewExtKt.colorInt(i7, this.itemView.getContext()));
        }
        if (zVar != null && (ppButton2 = zVar.f888c) != null) {
            ppButton2.setTag(data.getCouponCombo());
        }
        if (zVar == null || (ppButton = zVar.f888c) == null) {
            return;
        }
        ppButton.setOnClickListener(claimListener);
    }
}
