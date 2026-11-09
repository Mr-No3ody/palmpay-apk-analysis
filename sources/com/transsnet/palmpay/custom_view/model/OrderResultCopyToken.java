package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.transsnet.palmpay.custom_view.model.OrderResultCopyToken;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R#\u0010\u0015\u001a\n \u0011*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010R#\u0010\u0018\u001a\n \u0011*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\fR#\u0010\u001b\u001a\n \u0011*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/OrderResultCopyToken;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "getTokenItemKeyTv", "()Landroid/widget/TextView;", "getTokenItemValueTv", "Landroid/widget/ImageView;", "getTokenItemIv", "()Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getIv_item_copy_icon", "iv_item_copy_icon", "b", "getTv_item_value", "tv_item_value", "c", "getTv_item_key", "tv_item_key", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderResultCopyToken extends LinearLayout {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f31600d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31603c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultCopyToken(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIv_item_copy_icon() {
        return (ImageView) this.f31601a.getValue();
    }

    private final TextView getTv_item_key() {
        return (TextView) this.f31603c.getValue();
    }

    private final TextView getTv_item_value() {
        return (TextView) this.f31602b.getValue();
    }

    public final void a(String str) {
        TextView tv_item_key = getTv_item_key();
        if (str == null) {
            str = "Token";
        }
        tv_item_key.setText(str);
    }

    public final void b(String str) {
        TextView tv_item_value = getTv_item_value();
        if (str == null) {
            str = "";
        }
        tv_item_value.setText(str);
    }

    @NotNull
    public final ImageView getTokenItemIv() {
        ImageView iv_item_copy_icon = getIv_item_copy_icon();
        Intrinsics.checkNotNullExpressionValue(iv_item_copy_icon, "<get-iv_item_copy_icon>(...)");
        return iv_item_copy_icon;
    }

    @NotNull
    public final TextView getTokenItemKeyTv() {
        TextView tv_item_key = getTv_item_key();
        Intrinsics.checkNotNullExpressionValue(tv_item_key, "<get-tv_item_key>(...)");
        return tv_item_key;
    }

    @NotNull
    public final TextView getTokenItemValueTv() {
        TextView tv_item_value = getTv_item_value();
        Intrinsics.checkNotNullExpressionValue(tv_item_value, "<get-tv_item_value>(...)");
        return tv_item_value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultCopyToken(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OrderResultCopyToken(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultCopyToken(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f31601a = C2131j.b(new Function0(this) { // from class: Vb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultCopyToken f10302b;

            {
                this.f10302b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultCopyToken orderResultCopyToken = this.f10302b;
                switch (i10) {
                    case 0:
                        int i11 = OrderResultCopyToken.f31600d;
                        return (ImageView) orderResultCopyToken.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_copy_icon);
                    case 1:
                        int i12 = OrderResultCopyToken.f31600d;
                        return (TextView) orderResultCopyToken.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    default:
                        int i13 = OrderResultCopyToken.f31600d;
                        return (TextView) orderResultCopyToken.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i11 = 1;
        this.f31602b = C2131j.b(new Function0(this) { // from class: Vb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultCopyToken f10302b;

            {
                this.f10302b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultCopyToken orderResultCopyToken = this.f10302b;
                switch (i11) {
                    case 0:
                        int i12 = OrderResultCopyToken.f31600d;
                        return (ImageView) orderResultCopyToken.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_copy_icon);
                    case 1:
                        int i13 = OrderResultCopyToken.f31600d;
                        return (TextView) orderResultCopyToken.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    default:
                        int i14 = OrderResultCopyToken.f31600d;
                        return (TextView) orderResultCopyToken.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        final int i12 = 2;
        this.f31603c = C2131j.b(new Function0(this) { // from class: Vb.l

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultCopyToken f10302b;

            {
                this.f10302b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultCopyToken orderResultCopyToken = this.f10302b;
                switch (i12) {
                    case 0:
                        int i13 = OrderResultCopyToken.f31600d;
                        return (ImageView) orderResultCopyToken.findViewById(com.transsnet.palmpay.custom_view.s.iv_item_copy_icon);
                    case 1:
                        int i14 = OrderResultCopyToken.f31600d;
                        return (TextView) orderResultCopyToken.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_value);
                    default:
                        int i15 = OrderResultCopyToken.f31600d;
                        return (TextView) orderResultCopyToken.findViewById(com.transsnet.palmpay.custom_view.s.tv_item_key);
                }
            }
        });
        View.inflate(context, com.transsnet.palmpay.custom_view.t.cv_layout_order_result_copy_token, this);
    }
}
