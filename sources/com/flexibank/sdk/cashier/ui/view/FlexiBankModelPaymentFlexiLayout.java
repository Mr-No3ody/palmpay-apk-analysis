package com.flexibank.sdk.cashier.ui.view;

import M3.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.flexibank.sdk.o;
import com.flexibank.sdk.q;
import com.google.android.flexbox.FlexboxLayout;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentFlexiLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "", "flexiTagList", "", "setFlexiTagList", "(Ljava/util/List;)V", "Lcom/google/android/flexbox/FlexboxLayout;", "a", "Lkotlin/Lazy;", "getFlexiTagLayout", "()Lcom/google/android/flexbox/FlexboxLayout;", "flexiTagLayout", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFlexiBankModelPaymentFlexiLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlexiBankModelPaymentFlexiLayout.kt\ncom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentFlexiLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1863#2,2:62\n*S KotlinDebug\n*F\n+ 1 FlexiBankModelPaymentFlexiLayout.kt\ncom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentFlexiLayout\n*L\n49#1:62,2\n*E\n"})
public final class FlexiBankModelPaymentFlexiLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22050b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f22051a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexiBankModelPaymentFlexiLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22051a = C2131j.b(new f(this, 16));
        View.inflate(context, q.fb_layout_payment_flexi_layout, this);
        setPadding(ScreenUtils.dip2px(16.0f), ScreenUtils.dip2px(20.0f), ScreenUtils.dip2px(16.0f), ScreenUtils.dip2px(8.0f));
        setBackgroundResource(o.fb_payment_flexi_bg);
    }

    @NotNull
    public final FlexboxLayout getFlexiTagLayout() {
        Object value = this.f22051a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FlexboxLayout) value;
    }

    public final void setFlexiTagList(@NotNull List<String> flexiTagList) {
        Intrinsics.checkNotNullParameter(flexiTagList, "flexiTagList");
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(-2, -2);
        for (String str : flexiTagList) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(q.fb_layout_payment_flexi_tag, (ViewGroup) null, false);
            Intrinsics.f(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewInflate;
            textView.setLayoutParams(layoutParams);
            textView.setText(str);
            getFlexiTagLayout().addView(textView);
        }
    }
}
