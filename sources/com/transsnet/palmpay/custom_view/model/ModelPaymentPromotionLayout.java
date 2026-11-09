package com.transsnet.palmpay.custom_view.model;

import Gd.n;
import L6.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.model.ModelPaymentPromotionLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.v;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0014\u001a\n \u000b*\u0004\u0018\u00010\u00010\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010 \u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR$\u0010$\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010)\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R$\u0010,\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\"\u00104\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001b\u00107\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010\r\u001a\u0004\b6\u0010\u0013R\u001b\u0010<\u001a\u0002088FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\r\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\r\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bC\u0010\r\u001a\u0004\bD\u0010E¨\u0006G"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/ModelPaymentPromotionLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTv_item_key", "()Landroid/widget/TextView;", "tv_item_key", "b", "getLl_promotion_tips_layout", "()Landroid/widget/LinearLayout;", "ll_promotion_tips_layout", "", "c", "Z", "isShowCoupon", "()Z", "setShowCoupon", "(Z)V", "d", "isShowDiscount", "setShowDiscount", "e", "isShowPoint", "setShowPoint", "f", "Ljava/lang/Boolean;", "isUsedCoupon", "()Ljava/lang/Boolean;", "setUsedCoupon", "(Ljava/lang/Boolean;)V", "g", "isUsedPoint", "setUsedPoint", "i", "isUsedDiscount", "setUsedDiscount", "j", "I", "getMAvailableCouponCount", "()I", "setMAvailableCouponCount", "(I)V", "mAvailableCouponCount", "o", "getPromotionInfoLayout", "promotionInfoLayout", "Lcom/transsnet/palmpay/custom_view/model/ModelPointPromotionItem;", "p", "getPointPromotionItem", "()Lcom/transsnet/palmpay/custom_view/model/ModelPointPromotionItem;", "pointPromotionItem", "Lcom/transsnet/palmpay/custom_view/model/ModelDiscountPromotionItem;", "t", "getDiscountPromotionItem", "()Lcom/transsnet/palmpay/custom_view/model/ModelDiscountPromotionItem;", "discountPromotionItem", "Lcom/transsnet/palmpay/custom_view/model/ModelCouponPromotionItem;", "v", "getCouponPromotionItem", "()Lcom/transsnet/palmpay/custom_view/model/ModelCouponPromotionItem;", "couponPromotionItem", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ModelPaymentPromotionLayout extends LinearLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f31554w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isShowCoupon;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean isShowDiscount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isShowPoint;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Boolean isUsedCoupon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Boolean isUsedPoint;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public Boolean isUsedDiscount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int mAvailableCouponCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f31564o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f31565p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f31566v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentPromotionLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void b(ModelPaymentPromotionLayout modelPaymentPromotionLayout, Boolean bool, Boolean bool2, Boolean bool3, int i7) {
        if ((i7 & 1) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i7 & 2) != 0) {
            bool2 = Boolean.FALSE;
        }
        if ((i7 & 4) != 0) {
            bool3 = Boolean.FALSE;
        }
        Boolean boolValueOf = Boolean.valueOf(modelPaymentPromotionLayout.isShowCoupon);
        Boolean boolValueOf2 = Boolean.valueOf(modelPaymentPromotionLayout.isShowDiscount);
        Boolean boolValueOf3 = Boolean.valueOf(modelPaymentPromotionLayout.isShowPoint);
        modelPaymentPromotionLayout.getClass();
        modelPaymentPromotionLayout.a(G.e(new Pair("DATA_PROMOTION_USED", bool), new Pair("DATA_PROMOTION_SHOW", boolValueOf3)), G.e(new Pair("DATA_PROMOTION_USED", bool2), new Pair("DATA_PROMOTION_SHOW", boolValueOf2)), G.e(new Pair("DATA_PROMOTION_USED", bool3), new Pair("DATA_PROMOTION_SHOW", boolValueOf), new Pair("DATA_COUPON_NUMBER_VALUE", Integer.valueOf(modelPaymentPromotionLayout.mAvailableCouponCount))));
    }

    private final LinearLayout getLl_promotion_tips_layout() {
        return (LinearLayout) this.f31556b.getValue();
    }

    private final TextView getTv_item_key() {
        return (TextView) this.f31555a.getValue();
    }

    public final void a(HashMap map, HashMap map2, HashMap map3) {
        Boolean bool = (Boolean) map.get("DATA_PROMOTION_USED");
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        this.isUsedPoint = bool;
        Boolean bool2 = (Boolean) map2.get("DATA_PROMOTION_USED");
        if (bool2 == null) {
            bool2 = Boolean.FALSE;
        }
        this.isUsedDiscount = bool2;
        Boolean bool3 = (Boolean) map3.get("DATA_PROMOTION_USED");
        if (bool3 == null) {
            bool3 = Boolean.FALSE;
        }
        this.isUsedCoupon = bool3;
        Boolean bool4 = (Boolean) map.get("DATA_PROMOTION_SHOW");
        this.isShowPoint = bool4 != null ? bool4.booleanValue() : false;
        Boolean bool5 = (Boolean) map2.get("DATA_PROMOTION_SHOW");
        this.isShowDiscount = bool5 != null ? bool5.booleanValue() : false;
        Boolean bool6 = (Boolean) map3.get("DATA_PROMOTION_SHOW");
        this.isShowCoupon = bool6 != null ? bool6.booleanValue() : false;
        Integer num = (Integer) map3.get("DATA_COUPON_NUMBER_VALUE");
        this.mAvailableCouponCount = num != null ? num.intValue() : 0;
        ModelPointPromotionItem pointPromotionItem = getPointPromotionItem();
        Boolean bool7 = this.isUsedPoint;
        pointPromotionItem.d(bool7);
        Boolean bool8 = (Boolean) map.get("DATA_PROMOTION_SHOW");
        boolean zBooleanValue = bool8 != null ? bool8.booleanValue() : false;
        String str = (String) map.get("DATA_POINT_PROMOTION_VALUE");
        if (zBooleanValue) {
            pointPromotionItem.setVisibility(0);
            if (Intrinsics.c(bool7, Boolean.TRUE)) {
                pointPromotionItem.c(str);
            } else {
                pointPromotionItem.c(null);
            }
        } else {
            pointPromotionItem.setVisibility(8);
        }
        ModelDiscountPromotionItem discountPromotionItem = getDiscountPromotionItem();
        Boolean bool9 = this.isUsedDiscount;
        discountPromotionItem.d(bool9);
        String str2 = (String) map2.get("DATA_DISCOUNT_PROMOTION_AMOUNT_STR");
        Boolean bool10 = (Boolean) map2.get("DATA_PROMOTION_SHOW");
        if (bool10 != null ? bool10.booleanValue() : false) {
            discountPromotionItem.setVisibility(0);
            if (Intrinsics.c(bool9, Boolean.TRUE)) {
                discountPromotionItem.c(str2);
            } else {
                discountPromotionItem.c(null);
            }
        } else {
            discountPromotionItem.setVisibility(8);
        }
        ModelCouponPromotionItem couponPromotionItem = getCouponPromotionItem();
        Boolean bool11 = this.isUsedCoupon;
        couponPromotionItem.getClass();
        String str3 = (String) map3.get("DATA_COUPON_PROMOTION_AMOUNT_STR");
        Integer num2 = (Integer) map3.get("DATA_COUPON_NUMBER_VALUE");
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Boolean bool12 = (Boolean) map3.get("DATA_PROMOTION_SHOW");
        if (!(bool12 != null ? bool12.booleanValue() : false)) {
            couponPromotionItem.setVisibility(8);
            return;
        }
        couponPromotionItem.setVisibility(0);
        String str4 = couponPromotionItem.getContext().getString(v.cv_coupons) + "(" + iIntValue + ")";
        if (str4 == null) {
            str4 = "";
        }
        couponPromotionItem.setMPromotionKey(str4);
        if (Intrinsics.c(bool11, Boolean.TRUE) && iIntValue > 0) {
            couponPromotionItem.c(str3);
            return;
        }
        boolean z3 = iIntValue > 0;
        TextView tv_promotion_calc_amount = couponPromotionItem.getTv_promotion_calc_amount();
        if (tv_promotion_calc_amount != null) {
            tv_promotion_calc_amount.setVisibility(8);
        }
        TextView tv_promotion_value = couponPromotionItem.getTv_promotion_value();
        if (tv_promotion_value != null) {
            tv_promotion_value.setVisibility(0);
        }
        if (z3) {
            TextView tv_promotion_value2 = couponPromotionItem.getTv_promotion_value();
            if (tv_promotion_value2 != null) {
                tv_promotion_value2.setTextColor(couponPromotionItem.getContext().getColor(b.ppColorTextPrimary));
            }
        } else {
            TextView tv_promotion_value3 = couponPromotionItem.getTv_promotion_value();
            if (tv_promotion_value3 != null) {
                tv_promotion_value3.setTextColor(couponPromotionItem.getContext().getColor(b.ppColorTextDisable));
            }
        }
        if (z3) {
            TextView tv_promotion_value4 = couponPromotionItem.getTv_promotion_value();
            if (tv_promotion_value4 != null) {
                tv_promotion_value4.setText(couponPromotionItem.getMDefaultPromotionValue());
                return;
            }
            return;
        }
        TextView tv_promotion_value5 = couponPromotionItem.getTv_promotion_value();
        if (tv_promotion_value5 != null) {
            tv_promotion_value5.setText(couponPromotionItem.getContext().getString(v.cv_promotion_coupon_unavailable));
        }
    }

    public final void c(int i7, String str) {
        TextView tv_item_key = getTv_item_key();
        if (tv_item_key != null) {
            tv_item_key.setText(str);
        }
        LinearLayout ll_promotion_tips_layout = getLl_promotion_tips_layout();
        if (ll_promotion_tips_layout != null) {
            ll_promotion_tips_layout.setVisibility((str.length() != 0 && i7 >= 2) ? 0 : 8);
        }
    }

    @NotNull
    public final ModelCouponPromotionItem getCouponPromotionItem() {
        return (ModelCouponPromotionItem) this.f31566v.getValue();
    }

    @NotNull
    public final ModelDiscountPromotionItem getDiscountPromotionItem() {
        return (ModelDiscountPromotionItem) this.t.getValue();
    }

    public final int getMAvailableCouponCount() {
        return this.mAvailableCouponCount;
    }

    @NotNull
    public final ModelPointPromotionItem getPointPromotionItem() {
        return (ModelPointPromotionItem) this.f31565p.getValue();
    }

    @NotNull
    public final LinearLayout getPromotionInfoLayout() {
        Object value = this.f31564o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    public final void setMAvailableCouponCount(int i7) {
        this.mAvailableCouponCount = i7;
    }

    public final void setShowCoupon(boolean z3) {
        this.isShowCoupon = z3;
    }

    public final void setShowDiscount(boolean z3) {
        this.isShowDiscount = z3;
    }

    public final void setShowPoint(boolean z3) {
        this.isShowPoint = z3;
    }

    public final void setUsedCoupon(@Nullable Boolean bool) {
        this.isUsedCoupon = bool;
    }

    public final void setUsedDiscount(@Nullable Boolean bool) {
        this.isUsedDiscount = bool;
    }

    public final void setUsedPoint(@Nullable Boolean bool) {
        this.isUsedPoint = bool;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentPromotionLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelPaymentPromotionLayout(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentPromotionLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f31555a = C2131j.b(new Function0(this) { // from class: Vb.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentPromotionLayout f10294b;

            {
                this.f10294b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentPromotionLayout modelPaymentPromotionLayout = this.f10294b;
                switch (i10) {
                    case 0:
                        int i11 = ModelPaymentPromotionLayout.f31554w;
                        return (TextView) modelPaymentPromotionLayout.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                    case 1:
                        int i12 = ModelPaymentPromotionLayout.f31554w;
                        return (LinearLayout) modelPaymentPromotionLayout.findViewById(com.transsnet.palmpay.custom_view.s.ll_promotion_tips_layout);
                    default:
                        int i13 = ModelPaymentPromotionLayout.f31554w;
                        return (LinearLayout) modelPaymentPromotionLayout.findViewById(com.transsnet.palmpay.custom_view.s.ll_promotion_layout);
                }
            }
        });
        final int i11 = 1;
        this.f31556b = C2131j.b(new Function0(this) { // from class: Vb.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentPromotionLayout f10294b;

            {
                this.f10294b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentPromotionLayout modelPaymentPromotionLayout = this.f10294b;
                switch (i11) {
                    case 0:
                        int i12 = ModelPaymentPromotionLayout.f31554w;
                        return (TextView) modelPaymentPromotionLayout.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                    case 1:
                        int i13 = ModelPaymentPromotionLayout.f31554w;
                        return (LinearLayout) modelPaymentPromotionLayout.findViewById(com.transsnet.palmpay.custom_view.s.ll_promotion_tips_layout);
                    default:
                        int i14 = ModelPaymentPromotionLayout.f31554w;
                        return (LinearLayout) modelPaymentPromotionLayout.findViewById(com.transsnet.palmpay.custom_view.s.ll_promotion_layout);
                }
            }
        });
        Boolean bool = Boolean.FALSE;
        this.isUsedCoupon = bool;
        this.isUsedPoint = bool;
        this.isUsedDiscount = bool;
        final int i12 = 2;
        this.f31564o = C2131j.b(new Function0(this) { // from class: Vb.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentPromotionLayout f10294b;

            {
                this.f10294b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentPromotionLayout modelPaymentPromotionLayout = this.f10294b;
                switch (i12) {
                    case 0:
                        int i13 = ModelPaymentPromotionLayout.f31554w;
                        return (TextView) modelPaymentPromotionLayout.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                    case 1:
                        int i14 = ModelPaymentPromotionLayout.f31554w;
                        return (LinearLayout) modelPaymentPromotionLayout.findViewById(com.transsnet.palmpay.custom_view.s.ll_promotion_tips_layout);
                    default:
                        int i15 = ModelPaymentPromotionLayout.f31554w;
                        return (LinearLayout) modelPaymentPromotionLayout.findViewById(com.transsnet.palmpay.custom_view.s.ll_promotion_layout);
                }
            }
        });
        this.f31565p = C2131j.b(new n(context, 6));
        this.t = C2131j.b(new n(context, 7));
        this.f31566v = C2131j.b(new n(context, 8));
        View.inflate(context, com.transsnet.palmpay.custom_view.t.cv_layout_payment_promotion_layout, this);
        setOrientation(1);
        setBackgroundResource(r.cv_shape_rect_corner_12_bg_white);
    }
}
