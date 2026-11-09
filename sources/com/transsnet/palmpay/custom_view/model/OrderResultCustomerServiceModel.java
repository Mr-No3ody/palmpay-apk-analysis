package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.custom_view.model.OrderResultCustomerServiceModel;
import com.transsnet.palmpay.custom_view.r;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0001(B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0017\u001a\n \u0013*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR#\u0010\u001c\u001a\n \u0013*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001f\u001a\n \u0013*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\fR#\u0010\"\u001a\n \u0013*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u001bR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0012¨\u0006)"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/OrderResultCustomerServiceModel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "getLeftView", "()Landroid/widget/TextView;", "getRightView", "Lcom/transsnet/palmpay/custom_view/model/OrderResultCustomerServiceModel$OnCustomerServiceModelListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "setOnCustomerServiceModelListener", "(Lcom/transsnet/palmpay/custom_view/model/OrderResultCustomerServiceModel$OnCustomerServiceModelListener;)V", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTv_right", "tv_right", "Landroid/widget/ImageView;", "b", "getIv_right", "()Landroid/widget/ImageView;", "iv_right", "c", "getTv_left", "tv_left", "d", "getIv_left", "iv_left", "e", "Lcom/transsnet/palmpay/custom_view/model/OrderResultCustomerServiceModel$OnCustomerServiceModelListener;", "getListener", "()Lcom/transsnet/palmpay/custom_view/model/OrderResultCustomerServiceModel$OnCustomerServiceModelListener;", "setListener", "OnCustomerServiceModelListener", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderResultCustomerServiceModel extends ConstraintLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31604f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f31607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f31608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public OnCustomerServiceModelListener listener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/OrderResultCustomerServiceModel$OnCustomerServiceModelListener;", "", "onLeftClick", "", "v", "Landroid/view/View;", "onRightClick", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnCustomerServiceModelListener {
        void onLeftClick(@NotNull View v3);

        void onRightClick(@NotNull View v3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultCustomerServiceModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIv_left() {
        return (ImageView) this.f31608d.getValue();
    }

    private final ImageView getIv_right() {
        return (ImageView) this.f31606b.getValue();
    }

    private final TextView getTv_left() {
        return (TextView) this.f31607c.getValue();
    }

    private final TextView getTv_right() {
        return (TextView) this.f31605a.getValue();
    }

    public final void c() {
        Object obj = Boolean.TRUE;
        getIv_left().setVisibility(obj.equals(obj) ? 0 : 8);
        getTv_left().setVisibility(obj.equals(obj) ? 0 : 8);
    }

    public final void d(Boolean bool) {
        ImageView iv_right = getIv_right();
        Boolean bool2 = Boolean.TRUE;
        iv_right.setVisibility(bool.equals(bool2) ? 0 : 8);
        getTv_right().setVisibility(bool.equals(bool2) ? 0 : 8);
    }

    @NotNull
    public final TextView getLeftView() {
        TextView tv_left = getTv_left();
        Intrinsics.checkNotNullExpressionValue(tv_left, "<get-tv_left>(...)");
        return tv_left;
    }

    @Nullable
    public final OnCustomerServiceModelListener getListener() {
        return this.listener;
    }

    @NotNull
    public final TextView getRightView() {
        TextView tv_right = getTv_right();
        Intrinsics.checkNotNullExpressionValue(tv_right, "<get-tv_right>(...)");
        return tv_right;
    }

    public final void setListener(@Nullable OnCustomerServiceModelListener onCustomerServiceModelListener) {
        this.listener = onCustomerServiceModelListener;
    }

    public final void setOnCustomerServiceModelListener(@Nullable OnCustomerServiceModelListener listener) {
        this.listener = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultCustomerServiceModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OrderResultCustomerServiceModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultCustomerServiceModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f31605a = C2131j.b(new Function0(this) { // from class: Vb.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultCustomerServiceModel f10304b;

            {
                this.f10304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultCustomerServiceModel orderResultCustomerServiceModel = this.f10304b;
                switch (i10) {
                    case 0:
                        int i11 = OrderResultCustomerServiceModel.f31604f;
                        return (TextView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_right);
                    case 1:
                        int i12 = OrderResultCustomerServiceModel.f31604f;
                        return (ImageView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_right);
                    case 2:
                        int i13 = OrderResultCustomerServiceModel.f31604f;
                        return (TextView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_left);
                    default:
                        int i14 = OrderResultCustomerServiceModel.f31604f;
                        return (ImageView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_left);
                }
            }
        });
        final int i11 = 1;
        this.f31606b = C2131j.b(new Function0(this) { // from class: Vb.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultCustomerServiceModel f10304b;

            {
                this.f10304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultCustomerServiceModel orderResultCustomerServiceModel = this.f10304b;
                switch (i11) {
                    case 0:
                        int i12 = OrderResultCustomerServiceModel.f31604f;
                        return (TextView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_right);
                    case 1:
                        int i13 = OrderResultCustomerServiceModel.f31604f;
                        return (ImageView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_right);
                    case 2:
                        int i14 = OrderResultCustomerServiceModel.f31604f;
                        return (TextView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_left);
                    default:
                        int i15 = OrderResultCustomerServiceModel.f31604f;
                        return (ImageView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_left);
                }
            }
        });
        final int i12 = 2;
        this.f31607c = C2131j.b(new Function0(this) { // from class: Vb.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultCustomerServiceModel f10304b;

            {
                this.f10304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultCustomerServiceModel orderResultCustomerServiceModel = this.f10304b;
                switch (i12) {
                    case 0:
                        int i13 = OrderResultCustomerServiceModel.f31604f;
                        return (TextView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_right);
                    case 1:
                        int i14 = OrderResultCustomerServiceModel.f31604f;
                        return (ImageView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_right);
                    case 2:
                        int i15 = OrderResultCustomerServiceModel.f31604f;
                        return (TextView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_left);
                    default:
                        int i16 = OrderResultCustomerServiceModel.f31604f;
                        return (ImageView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_left);
                }
            }
        });
        final int i13 = 3;
        this.f31608d = C2131j.b(new Function0(this) { // from class: Vb.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultCustomerServiceModel f10304b;

            {
                this.f10304b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultCustomerServiceModel orderResultCustomerServiceModel = this.f10304b;
                switch (i13) {
                    case 0:
                        int i14 = OrderResultCustomerServiceModel.f31604f;
                        return (TextView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_right);
                    case 1:
                        int i15 = OrderResultCustomerServiceModel.f31604f;
                        return (ImageView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_right);
                    case 2:
                        int i16 = OrderResultCustomerServiceModel.f31604f;
                        return (TextView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_left);
                    default:
                        int i17 = OrderResultCustomerServiceModel.f31604f;
                        return (ImageView) orderResultCustomerServiceModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_left);
                }
            }
        });
        View.inflate(context, com.transsnet.palmpay.custom_view.t.cv_layout_order_result_customer_service, this);
        setBackgroundResource(r.cv_rect_corner_12_bg_white);
        final int i14 = 0;
        getTv_left().setOnClickListener(new View.OnClickListener(this) { // from class: Vb.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultCustomerServiceModel f10306b;

            {
                this.f10306b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        OrderResultCustomerServiceModel.OnCustomerServiceModelListener onCustomerServiceModelListener = this.f10306b.listener;
                        if (onCustomerServiceModelListener != null) {
                            Intrinsics.e(view);
                            onCustomerServiceModelListener.onLeftClick(view);
                        }
                        break;
                    default:
                        OrderResultCustomerServiceModel.OnCustomerServiceModelListener onCustomerServiceModelListener2 = this.f10306b.listener;
                        if (onCustomerServiceModelListener2 != null) {
                            Intrinsics.e(view);
                            onCustomerServiceModelListener2.onRightClick(view);
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        getTv_right().setOnClickListener(new View.OnClickListener(this) { // from class: Vb.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultCustomerServiceModel f10306b;

            {
                this.f10306b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        OrderResultCustomerServiceModel.OnCustomerServiceModelListener onCustomerServiceModelListener = this.f10306b.listener;
                        if (onCustomerServiceModelListener != null) {
                            Intrinsics.e(view);
                            onCustomerServiceModelListener.onLeftClick(view);
                        }
                        break;
                    default:
                        OrderResultCustomerServiceModel.OnCustomerServiceModelListener onCustomerServiceModelListener2 = this.f10306b.listener;
                        if (onCustomerServiceModelListener2 != null) {
                            Intrinsics.e(view);
                            onCustomerServiceModelListener2.onRightClick(view);
                        }
                        break;
                }
            }
        });
    }
}
