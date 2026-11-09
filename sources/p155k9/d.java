package p155k9;

import Pa.n0;
import Pa.r0;
import Pd.c;
import T1.b;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.transsnet.palmpay.airtime.bean.AirtimeItemsBean;
import com.transsnet.palmpay.airtime.bean.AirtimeSpecialRechargeItem;
import com.transsnet.palmpay.airtime.bean.BaseAirtimeItemsBean;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p220oa.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f38703e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f38704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f38705g;

    public d(f fVar, b getItemClick) {
        Intrinsics.checkNotNullParameter(getItemClick, "getItemClick");
        this.f38704f = fVar;
        this.f38705g = getItemClick;
    }

    @Override // T1.b
    public final void b(BaseViewHolder helper, Object obj) {
        switch (this.f38703e) {
            case 0:
                BaseAirtimeItemsBean item = (BaseAirtimeItemsBean) obj;
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item, "item");
                AirtimeItemsBean airtimeItemsBean = item instanceof AirtimeItemsBean ? (AirtimeItemsBean) item : null;
                if (airtimeItemsBean != null) {
                    Context context = helper.itemView.getContext();
                    Long price = airtimeItemsBean.getPrice();
                    SpannableStringBuilder spannableStringBuilderL = r0.L(12, 18, 0, price != null ? price.longValue() : 0L);
                    TextView textView = (TextView) helper.getView(c.itemNameTv);
                    TextView textView2 = (TextView) helper.getView(c.itemVauleTv);
                    TextView textView3 = (TextView) helper.getView(c.remarkTv);
                    View view = helper.getView(c.bgView);
                    textView.setText(spannableStringBuilderL);
                    int color = context.getColor(L6.b.ppColorPrimary);
                    f fVar = this.f38704f;
                    long j6 = fVar.f38711d;
                    Long price2 = airtimeItemsBean.getPrice();
                    if (j6 > (price2 != null ? price2.longValue() : 0L) || fVar.f38711d == -99 || Intrinsics.c(airtimeItemsBean.getSuspend(), Boolean.TRUE)) {
                        view.setBackground(context.getResources().getDrawable(r.cv_rect_cornet_12_stroke_f2f2f2_bg_white));
                        textView.setTextColor(context.getColor(L6.b.ppColorTextPrimary));
                    } else {
                        view.setBackground(context.getResources().getDrawable(r.cv_shape_rect_corner_12_bg_white_stroke_primary));
                        textView.setTextColor(color);
                    }
                    if (TextUtils.isEmpty(airtimeItemsBean.getRewardsRateText())) {
                        textView2.setVisibility(8);
                    } else {
                        textView2.setText(airtimeItemsBean.getRewardsRateText());
                        textView2.setVisibility(0);
                    }
                    if (!TextUtils.isEmpty(airtimeItemsBean.getRewardsText())) {
                        textView3.setText(airtimeItemsBean.getRewardsText());
                        h.C(textView3);
                    } else {
                        h.c(textView3);
                    }
                    break;
                }
                break;
            default:
                BaseAirtimeItemsBean item2 = (BaseAirtimeItemsBean) obj;
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(item2, "item");
                AirtimeSpecialRechargeItem airtimeSpecialRechargeItem = item2 instanceof AirtimeSpecialRechargeItem ? (AirtimeSpecialRechargeItem) item2 : null;
                if (airtimeSpecialRechargeItem != null) {
                    ImageView imageView = (ImageView) helper.getView(c.bannerIv);
                    String imageUrl = (TextUtils.isEmpty(airtimeSpecialRechargeItem.getDarkImageUrl()) || !this.f38704f.f38709b) ? airtimeSpecialRechargeItem.getImageUrl() : airtimeSpecialRechargeItem.getDarkImageUrl();
                    if (!TextUtils.isEmpty(imageUrl)) {
                        h.C(imageView);
                        r0.i1(imageView, imageUrl, Integer.MIN_VALUE, CommonViewExtKt.getDp(85));
                    } else {
                        h.c(imageView);
                    }
                    break;
                }
                break;
        }
    }

    @Override // T1.b
    public final int d() {
        switch (this.f38703e) {
            case 0:
                return 1;
            default:
                return 5;
        }
    }

    @Override // T1.b
    public final int e() {
        switch (this.f38703e) {
            case 0:
                return Pd.d.qt_airtime_item_rechagre_amount_ng;
            default:
                return Pd.d.qt_airtime_item_custom_jump;
        }
    }

    @Override // T1.b
    public final void g(BaseViewHolder helper, View view, Object obj, int i7) {
        p1.c cVar;
        switch (this.f38703e) {
            case 0:
                BaseAirtimeItemsBean data = (BaseAirtimeItemsBean) obj;
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(data, "data");
                AirtimeItemsBean airtimeItemsBean = data instanceof AirtimeItemsBean ? (AirtimeItemsBean) data : null;
                if (airtimeItemsBean != null && (cVar = ((b) this.f38705g).f38702b.f38712e) != null) {
                    cVar.onNormalItemClick(i7, airtimeItemsBean);
                }
                break;
            default:
                BaseAirtimeItemsBean data2 = (BaseAirtimeItemsBean) obj;
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(data2, "data");
                AirtimeSpecialRechargeItem airtimeSpecialRechargeItem = data2 instanceof AirtimeSpecialRechargeItem ? (AirtimeSpecialRechargeItem) data2 : null;
                if (airtimeSpecialRechargeItem != null) {
                    p1.c cVar2 = ((b) this.f38705g).f38702b.f38712e;
                    if (cVar2 != null) {
                        cVar2.onCustomJumpItemClick(i7, airtimeSpecialRechargeItem);
                    }
                    n0 n0VarG = n0.g();
                    ClickEvent clickEventAdd = new ClickEvent("AirtimeRecommended_Click").add("type", airtimeSpecialRechargeItem.getSpotType());
                    Long price = airtimeSpecialRechargeItem.getPrice();
                    n0VarG.k(clickEventAdd.add(FirebaseAnalytics.Param.PRICE, String.valueOf(price != null ? price.longValue() : 0L)).add("itemId", airtimeSpecialRechargeItem.getItemId()).add("jumpUrl", airtimeSpecialRechargeItem.getJumpUrl()));
                    break;
                }
                break;
        }
    }

    public d(f fVar, b getItemClick, byte b7) {
        Intrinsics.checkNotNullParameter(getItemClick, "getItemClick");
        this.f38704f = fVar;
        this.f38705g = getItemClick;
    }
}
