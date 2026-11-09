package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.model.OrderResultAmountStyle1;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\fR#\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR#\u0010\u0018\u001a\n \u0011*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u000fR#\u0010\u001b\u001a\n \u0011*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/OrderResultAmountStyle1;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "getAmountItemKeyTv", "()Landroid/widget/TextView;", "Landroid/widget/ImageView;", "getAmountItemTipsIv", "()Landroid/widget/ImageView;", "getAmountItemValueTv", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTv_item_value", "tv_item_value", "b", "getIv_item_tips_icon", "iv_item_tips_icon", "c", "getTv_item_key", "tv_item_key", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderResultAmountStyle1 extends LinearLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31593d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31596c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultAmountStyle1(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIv_item_tips_icon() {
        return (ImageView) this.f31595b.getValue();
    }

    private final TextView getTv_item_key() {
        return (TextView) this.f31596c.getValue();
    }

    private final TextView getTv_item_value() {
        return (TextView) this.f31594a.getValue();
    }

    public final void a(int i7) {
        getIv_item_tips_icon().setImageResource(i7);
        getIv_item_tips_icon().setVisibility(0);
    }

    public final void b(int i7) {
        getIv_item_tips_icon().setVisibility(i7);
    }

    @NotNull
    public final TextView getAmountItemKeyTv() {
        TextView tv_item_key = getTv_item_key();
        Intrinsics.checkNotNullExpressionValue(tv_item_key, "<get-tv_item_key>(...)");
        return tv_item_key;
    }

    @NotNull
    public final ImageView getAmountItemTipsIv() {
        ImageView iv_item_tips_icon = getIv_item_tips_icon();
        Intrinsics.checkNotNullExpressionValue(iv_item_tips_icon, "<get-iv_item_tips_icon>(...)");
        return iv_item_tips_icon;
    }

    @NotNull
    public final TextView getAmountItemValueTv() {
        TextView tv_item_value = getTv_item_value();
        Intrinsics.checkNotNullExpressionValue(tv_item_value, "<get-tv_item_value>(...)");
        return tv_item_value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultAmountStyle1(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OrderResultAmountStyle1(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultAmountStyle1(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f31594a = C2131j.b(new Function0(this) { // from class: Vb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultAmountStyle1 f10296b;

            {
                this.f10296b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultAmountStyle1 orderResultAmountStyle1 = this.f10296b;
                switch (i10) {
                    case 0:
                        int i11 = OrderResultAmountStyle1.f31593d;
                        return (TextView) orderResultAmountStyle1.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 1:
                        int i12 = OrderResultAmountStyle1.f31593d;
                        return (ImageView) orderResultAmountStyle1.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_tips_icon);
                    default:
                        int i13 = OrderResultAmountStyle1.f31593d;
                        return (TextView) orderResultAmountStyle1.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i11 = 1;
        this.f31595b = C2131j.b(new Function0(this) { // from class: Vb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultAmountStyle1 f10296b;

            {
                this.f10296b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultAmountStyle1 orderResultAmountStyle1 = this.f10296b;
                switch (i11) {
                    case 0:
                        int i12 = OrderResultAmountStyle1.f31593d;
                        return (TextView) orderResultAmountStyle1.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 1:
                        int i13 = OrderResultAmountStyle1.f31593d;
                        return (ImageView) orderResultAmountStyle1.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_tips_icon);
                    default:
                        int i14 = OrderResultAmountStyle1.f31593d;
                        return (TextView) orderResultAmountStyle1.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i12 = 2;
        this.f31596c = C2131j.b(new Function0(this) { // from class: Vb.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultAmountStyle1 f10296b;

            {
                this.f10296b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultAmountStyle1 orderResultAmountStyle1 = this.f10296b;
                switch (i12) {
                    case 0:
                        int i13 = OrderResultAmountStyle1.f31593d;
                        return (TextView) orderResultAmountStyle1.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    case 1:
                        int i14 = OrderResultAmountStyle1.f31593d;
                        return (ImageView) orderResultAmountStyle1.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_tips_icon);
                    default:
                        int i15 = OrderResultAmountStyle1.f31593d;
                        return (TextView) orderResultAmountStyle1.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        View.inflate(context, com.transsnet.palmpay.custom_view.t.cv_layout_order_result_amount_style1, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderResultAmountStyle1(Context context, String str, String str2) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        getTv_item_key().setText(str == null ? "" : str);
        getTv_item_value().setText(str2 == null ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OrderResultAmountStyle1(Context context, int i7, String str) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        getTv_item_key().setText(getContext().getResources().getText(i7));
        getTv_item_value().setText(str == null ? "" : str);
    }
}
