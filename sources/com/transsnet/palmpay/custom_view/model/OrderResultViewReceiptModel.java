package com.transsnet.palmpay.custom_view.model;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.transsnet.palmpay.custom_view.model.OrderResultViewReceiptModel;
import com.transsnet.palmpay.custom_view.v;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.MustBeDocumented;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;
import p371yf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0002\u001c\u0014B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001b\u001a\n \u0013*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/OrderResultViewReceiptModel;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", ReactTextInputShadowNode.PROP_TEXT, "", "setText", "(Ljava/lang/CharSequence;)V", "Landroid/widget/ImageView;", "getReceiptImageView", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTv_view_receipt", "()Landroid/widget/TextView;", "tv_view_receipt", "b", "getIv_view_receipt", "iv_view_receipt", "BottomStyle", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderResultViewReceiptModel extends ConstraintLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f31637c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31639b;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
    @kotlin.annotation.Target(allowedTargets = {b.f44353g, b.f44351e, b.f44355j})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(p371yf.a.f44341a)
    @MustBeDocumented
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/OrderResultViewReceiptModel$BottomStyle;", "", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Documented
    public @interface BottomStyle {
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultViewReceiptModel(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIv_view_receipt() {
        return (ImageView) this.f31639b.getValue();
    }

    private final TextView getTv_view_receipt() {
        return (TextView) this.f31638a.getValue();
    }

    public final void c() {
        getIv_view_receipt().setVisibility(8);
        getTv_view_receipt().setText(getContext().getString(v.cv_cancel_the_transaction));
    }

    @NotNull
    public final ImageView getReceiptImageView() {
        ImageView iv_view_receipt = getIv_view_receipt();
        Intrinsics.checkNotNullExpressionValue(iv_view_receipt, "<get-iv_view_receipt>(...)");
        return iv_view_receipt;
    }

    public final void setText(@Nullable CharSequence text) {
        if (TextUtils.isEmpty(text)) {
            return;
        }
        getTv_view_receipt().setText(text);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultViewReceiptModel(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OrderResultViewReceiptModel(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OrderResultViewReceiptModel(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f31638a = C2131j.b(new Function0(this) { // from class: Vb.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultViewReceiptModel f10317b;

            {
                this.f10317b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultViewReceiptModel orderResultViewReceiptModel = this.f10317b;
                switch (i10) {
                    case 0:
                        int i11 = OrderResultViewReceiptModel.f31637c;
                        return (TextView) orderResultViewReceiptModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_view_receipt);
                    default:
                        int i12 = OrderResultViewReceiptModel.f31637c;
                        return (ImageView) orderResultViewReceiptModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_view_receipt);
                }
            }
        });
        final int i11 = 1;
        this.f31639b = C2131j.b(new Function0(this) { // from class: Vb.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OrderResultViewReceiptModel f10317b;

            {
                this.f10317b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderResultViewReceiptModel orderResultViewReceiptModel = this.f10317b;
                switch (i11) {
                    case 0:
                        int i12 = OrderResultViewReceiptModel.f31637c;
                        return (TextView) orderResultViewReceiptModel.findViewById(com.transsnet.palmpay.custom_view.s.tv_view_receipt);
                    default:
                        int i13 = OrderResultViewReceiptModel.f31637c;
                        return (ImageView) orderResultViewReceiptModel.findViewById(com.transsnet.palmpay.custom_view.s.iv_view_receipt);
                }
            }
        });
        View.inflate(context, com.transsnet.palmpay.custom_view.t.cv_layout_order_result_view_receipt, this);
        setBackgroundResource(L6.b.ppColorBackgroundLight);
    }
}
