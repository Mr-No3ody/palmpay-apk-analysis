package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle2;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fR#\u0010\u0012\u001a\n \u000e*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\fR#\u0010\u0015\u001a\n \u000e*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/OrderResultAmountStyle2;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "getAmountItemKeyTv", "()Landroid/widget/TextView;", "getAmountItemValueTv", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTv_item_value", "tv_item_value", "b", "getTv_item_key", "tv_item_key", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderResultAmountStyle2 extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31597c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31599b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultAmountStyle2(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getTv_item_key() {
        return (TextView) this.f31599b.getValue();
    }

    private final TextView getTv_item_value() {
        return (TextView) this.f31598a.getValue();
    }

    @NotNull
    public final TextView getAmountItemKeyTv() {
        TextView tv_item_key = getTv_item_key();
        Intrinsics.checkNotNullExpressionValue(tv_item_key, "<get-tv_item_key>(...)");
        return tv_item_key;
    }

    @NotNull
    public final TextView getAmountItemValueTv() {
        TextView tv_item_value = getTv_item_value();
        Intrinsics.checkNotNullExpressionValue(tv_item_value, "<get-tv_item_value>(...)");
        return tv_item_value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultAmountStyle2(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OrderResultAmountStyle2(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultAmountStyle2(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f31598a = C2131j.b(new Function0(this) { // from class: Vb.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultAmountStyle2 f10300b;

            {
                this.f10300b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultAmountStyle2 orderResultAmountStyle2 = this.f10300b;
                switch (i10) {
                    case 0:
                        int i11 = OrderResultAmountStyle2.f31597c;
                        return (TextView) orderResultAmountStyle2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    default:
                        int i12 = OrderResultAmountStyle2.f31597c;
                        return (TextView) orderResultAmountStyle2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i11 = 1;
        this.f31599b = C2131j.b(new Function0(this) { // from class: Vb.k

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultAmountStyle2 f10300b;

            {
                this.f10300b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultAmountStyle2 orderResultAmountStyle2 = this.f10300b;
                switch (i11) {
                    case 0:
                        int i12 = OrderResultAmountStyle2.f31597c;
                        return (TextView) orderResultAmountStyle2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    default:
                        int i13 = OrderResultAmountStyle2.f31597c;
                        return (TextView) orderResultAmountStyle2.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        View.inflate(context, com.transsnet.palmpay.custom_view.t.cv_layout_order_result_amount_style2, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderResultAmountStyle2(Context context, String str, String str2) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        getTv_item_key().setText(str == null ? "" : str);
        getTv_item_value().setText(str2 == null ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderResultAmountStyle2(Context context, int i7, String str) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        getTv_item_key().setText(getContext().getResources().getText(i7));
        getTv_item_value().setText(str == null ? "" : str);
    }
}
