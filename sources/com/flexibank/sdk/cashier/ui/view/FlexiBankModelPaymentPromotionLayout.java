package com.flexibank.sdk.cashier.ui.view;

import Gd.n;
import L6.b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentPromotionLayout;
import com.flexibank.sdk.o;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import com.mikepenz.iconics.view.IconicsTextView;
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
import x4.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\r\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR$\u0010!\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\"\u0010)\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u001b\u00106\u001a\u0002028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b=\u0010+\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u0010+\u001a\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentPromotionLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "a", "Z", "isShowCoupon", "()Z", "setShowCoupon", "(Z)V", "b", "isShowDiscount", "setShowDiscount", "c", "isShowPoint", "setShowPoint", "d", "Ljava/lang/Boolean;", "isUsedCoupon", "()Ljava/lang/Boolean;", "setUsedCoupon", "(Ljava/lang/Boolean;)V", "e", "isUsedPoint", "setUsedPoint", "f", "isUsedDiscount", "setUsedDiscount", "g", "I", "getMAvailableCouponCount", "()I", "setMAvailableCouponCount", "(I)V", "mAvailableCouponCount", "i", "Lkotlin/Lazy;", "getPromotionInfoLayout", "()Landroid/widget/LinearLayout;", "promotionInfoLayout", "j", "getPromotionTipsLayout", "promotionTipsLayout", "Lcom/mikepenz/iconics/view/IconicsTextView;", "o", "getTvItemKey", "()Lcom/mikepenz/iconics/view/IconicsTextView;", "tvItemKey", "Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelPointPromotionItem;", "p", "getPointPromotionItem", "()Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelPointPromotionItem;", "pointPromotionItem", "Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelDiscountPromotionItem;", "t", "getDiscountPromotionItem", "()Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelDiscountPromotionItem;", "discountPromotionItem", "Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelCouponPromotionItem;", "v", "getCouponPromotionItem", "()Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelCouponPromotionItem;", "couponPromotionItem", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class FlexiBankModelPaymentPromotionLayout extends LinearLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f22058w = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean isShowCoupon;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public boolean isShowDiscount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isShowPoint;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Boolean isUsedCoupon;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Boolean isUsedPoint;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Boolean isUsedDiscount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int mAvailableCouponCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f22066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f22067j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f22068o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f22069p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f22070v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelPaymentPromotionLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void b(FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout, Boolean bool, Boolean bool2, Boolean bool3, int i7) {
        if ((i7 & 1) != 0) {
            bool = Boolean.FALSE;
        }
        if ((i7 & 2) != 0) {
            bool2 = Boolean.FALSE;
        }
        if ((i7 & 4) != 0) {
            bool3 = Boolean.FALSE;
        }
        Boolean boolValueOf = Boolean.valueOf(flexiBankModelPaymentPromotionLayout.isShowCoupon);
        Boolean boolValueOf2 = Boolean.valueOf(flexiBankModelPaymentPromotionLayout.isShowDiscount);
        Boolean boolValueOf3 = Boolean.valueOf(flexiBankModelPaymentPromotionLayout.isShowPoint);
        flexiBankModelPaymentPromotionLayout.getClass();
        flexiBankModelPaymentPromotionLayout.a(G.e(new Pair("DATA_PROMOTION_USED", bool), new Pair("DATA_PROMOTION_SHOW", boolValueOf3)), G.e(new Pair("DATA_PROMOTION_USED", bool2), new Pair("DATA_PROMOTION_SHOW", boolValueOf2)), G.e(new Pair("DATA_PROMOTION_USED", bool3), new Pair("DATA_PROMOTION_SHOW", boolValueOf), new Pair("DATA_COUPON_NUMBER_VALUE", Integer.valueOf(flexiBankModelPaymentPromotionLayout.mAvailableCouponCount))));
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
        FlexiBankModelPointPromotionItem pointPromotionItem = getPointPromotionItem();
        Boolean bool7 = this.isUsedPoint;
        pointPromotionItem.d(bool7);
        String str = (String) map.get("DATA_POINT_PROMOTION_VALUE");
        String str2 = (String) map.get("DATA_POINT_PROMOTION_AMOUNT_STR");
        Boolean bool8 = (Boolean) map.get("DATA_PROMOTION_SHOW");
        boolean zBooleanValue = bool8 != null ? bool8.booleanValue() : false;
        if (zBooleanValue) {
            pointPromotionItem.setVisibility(0);
            if (Intrinsics.c(bool7, Boolean.TRUE)) {
                k binding = pointPromotionItem.getBinding();
                if (binding != null) {
                    binding.f43628d.setText(str);
                }
                pointPromotionItem.c(str2);
            } else {
                k binding2 = pointPromotionItem.getBinding();
                if (binding2 != null) {
                    binding2.f43628d.setText("");
                }
                pointPromotionItem.c(null);
            }
        } else {
            pointPromotionItem.setVisibility(8);
        }
        FlexiBankModelDiscountPromotionItem discountPromotionItem = getDiscountPromotionItem();
        Boolean bool9 = this.isUsedDiscount;
        discountPromotionItem.d(bool9);
        String str3 = (String) map2.get("DATA_DISCOUNT_PROMOTION_AMOUNT_STR");
        Boolean bool10 = (Boolean) map2.get("DATA_PROMOTION_SHOW");
        if (bool10 != null ? bool10.booleanValue() : false) {
            discountPromotionItem.setVisibility(0);
            if (Intrinsics.c(bool9, Boolean.TRUE)) {
                discountPromotionItem.c(str3);
            } else {
                discountPromotionItem.c(null);
            }
        } else {
            discountPromotionItem.setVisibility(8);
        }
        FlexiBankModelCouponPromotionItem couponPromotionItem = getCouponPromotionItem();
        Boolean bool11 = this.isUsedCoupon;
        couponPromotionItem.getClass();
        String str4 = (String) map3.get("DATA_COUPON_PROMOTION_AMOUNT_STR");
        Integer num2 = (Integer) map3.get("DATA_COUPON_NUMBER_VALUE");
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Boolean bool12 = (Boolean) map3.get("DATA_PROMOTION_SHOW");
        if (!(bool12 != null ? bool12.booleanValue() : false)) {
            couponPromotionItem.setVisibility(8);
            return;
        }
        couponPromotionItem.setVisibility(0);
        String str5 = couponPromotionItem.getContext().getString(r.fb_coupons) + "(" + iIntValue + ")";
        couponPromotionItem.setMPromotionKey(str5 != null ? str5 : "");
        if (Intrinsics.c(bool11, Boolean.TRUE) && iIntValue > 0) {
            couponPromotionItem.c(str4);
            return;
        }
        boolean z3 = iIntValue > 0;
        k binding3 = couponPromotionItem.getBinding();
        if (binding3 != null) {
            binding3.f43627c.setVisibility(8);
        }
        k binding4 = couponPromotionItem.getBinding();
        if (binding4 != null) {
            binding4.f43630f.setVisibility(0);
        }
        if (z3) {
            k kVar = couponPromotionItem.binding;
            if (kVar != null) {
                kVar.f43630f.setTextColor(couponPromotionItem.getContext().getColor(b.ppColorTextPrimary));
            }
        } else {
            k kVar2 = couponPromotionItem.binding;
            if (kVar2 != null) {
                kVar2.f43630f.setTextColor(couponPromotionItem.getContext().getColor(b.ppColorFlexiCashDisabled));
            }
        }
        if (z3) {
            k binding5 = couponPromotionItem.getBinding();
            if (binding5 != null) {
                binding5.f43630f.setText(couponPromotionItem.getMDefaultPromotionValue());
                return;
            }
            return;
        }
        k binding6 = couponPromotionItem.getBinding();
        if (binding6 != null) {
            binding6.f43630f.setText(couponPromotionItem.getContext().getString(r.fb_promotion_coupon_unavailable));
        }
    }

    public final void c(int i7, String str) {
        IconicsTextView tvItemKey = getTvItemKey();
        if (tvItemKey != null) {
            tvItemKey.setText(str);
        }
        LinearLayout promotionTipsLayout = getPromotionTipsLayout();
        if (promotionTipsLayout != null) {
            promotionTipsLayout.setVisibility((str.length() != 0 && i7 >= 2) ? 0 : 8);
        }
    }

    @NotNull
    public final FlexiBankModelCouponPromotionItem getCouponPromotionItem() {
        return (FlexiBankModelCouponPromotionItem) this.f22070v.getValue();
    }

    @NotNull
    public final FlexiBankModelDiscountPromotionItem getDiscountPromotionItem() {
        return (FlexiBankModelDiscountPromotionItem) this.t.getValue();
    }

    public final int getMAvailableCouponCount() {
        return this.mAvailableCouponCount;
    }

    @NotNull
    public final FlexiBankModelPointPromotionItem getPointPromotionItem() {
        return (FlexiBankModelPointPromotionItem) this.f22069p.getValue();
    }

    @NotNull
    public final LinearLayout getPromotionInfoLayout() {
        Object value = this.f22066i.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    @NotNull
    public final LinearLayout getPromotionTipsLayout() {
        Object value = this.f22067j.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (LinearLayout) value;
    }

    @NotNull
    public final IconicsTextView getTvItemKey() {
        Object value = this.f22068o.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IconicsTextView) value;
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
    public FlexiBankModelPaymentPromotionLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexiBankModelPaymentPromotionLayout(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelPaymentPromotionLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        Boolean bool = Boolean.FALSE;
        this.isUsedCoupon = bool;
        this.isUsedPoint = bool;
        this.isUsedDiscount = bool;
        final int i10 = 0;
        this.f22066i = C2131j.b(new Function0(this) { // from class: S3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankModelPaymentPromotionLayout f8668b;

            {
                this.f8668b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout = this.f8668b;
                switch (i10) {
                    case 0:
                        int i11 = FlexiBankModelPaymentPromotionLayout.f22058w;
                        return (LinearLayout) flexiBankModelPaymentPromotionLayout.findViewById(p.fb_ll_promotion_layout);
                    case 1:
                        int i12 = FlexiBankModelPaymentPromotionLayout.f22058w;
                        return (LinearLayout) flexiBankModelPaymentPromotionLayout.findViewById(p.fb_ll_promotion_tips_layout);
                    default:
                        int i13 = FlexiBankModelPaymentPromotionLayout.f22058w;
                        return (IconicsTextView) flexiBankModelPaymentPromotionLayout.findViewById(p.fb_tv_item_key);
                }
            }
        });
        final int i11 = 1;
        this.f22067j = C2131j.b(new Function0(this) { // from class: S3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankModelPaymentPromotionLayout f8668b;

            {
                this.f8668b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout = this.f8668b;
                switch (i11) {
                    case 0:
                        int i12 = FlexiBankModelPaymentPromotionLayout.f22058w;
                        return (LinearLayout) flexiBankModelPaymentPromotionLayout.findViewById(p.fb_ll_promotion_layout);
                    case 1:
                        int i13 = FlexiBankModelPaymentPromotionLayout.f22058w;
                        return (LinearLayout) flexiBankModelPaymentPromotionLayout.findViewById(p.fb_ll_promotion_tips_layout);
                    default:
                        int i14 = FlexiBankModelPaymentPromotionLayout.f22058w;
                        return (IconicsTextView) flexiBankModelPaymentPromotionLayout.findViewById(p.fb_tv_item_key);
                }
            }
        });
        final int i12 = 2;
        this.f22068o = C2131j.b(new Function0(this) { // from class: S3.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankModelPaymentPromotionLayout f8668b;

            {
                this.f8668b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankModelPaymentPromotionLayout flexiBankModelPaymentPromotionLayout = this.f8668b;
                switch (i12) {
                    case 0:
                        int i13 = FlexiBankModelPaymentPromotionLayout.f22058w;
                        return (LinearLayout) flexiBankModelPaymentPromotionLayout.findViewById(p.fb_ll_promotion_layout);
                    case 1:
                        int i14 = FlexiBankModelPaymentPromotionLayout.f22058w;
                        return (LinearLayout) flexiBankModelPaymentPromotionLayout.findViewById(p.fb_ll_promotion_tips_layout);
                    default:
                        int i15 = FlexiBankModelPaymentPromotionLayout.f22058w;
                        return (IconicsTextView) flexiBankModelPaymentPromotionLayout.findViewById(p.fb_tv_item_key);
                }
            }
        });
        this.f22069p = C2131j.b(new n(context, 2));
        this.t = C2131j.b(new n(context, 3));
        this.f22070v = C2131j.b(new n(context, 4));
        View.inflate(context, q.fb_layout_payment_promotion_layout, this);
        setOrientation(1);
        setBackgroundResource(o.fb_shape_rect_corner_8_bg_dark);
    }
}
