package com.flexibank.sdk.cashier.ui.view;

import M3.f;
import Oc.j;
import Pa.b0;
import Rd.s0;
import S3.a;
import S3.b;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\f2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/flexibank/sdk/cashier/ui/view/FlexiBankModelPaymentEarnLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "earnInfoTips", "", "setEarnInfoTips", "(Ljava/lang/String;)V", "", "LS3/b;", "earnInfoList", "setEarnInfoList", "(Ljava/util/List;)V", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Lkotlin/Lazy;", "getPromotionInfoLayout", "()Landroidx/recyclerview/widget/RecyclerView;", "promotionInfoLayout", "LS3/a;", "d", "getPaymentEarnAdapter", "()LS3/a;", "paymentEarnAdapter", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankModelPaymentEarnLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f22045e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f22046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f22047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f22048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f22049d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelPaymentEarnLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final a getPaymentEarnAdapter() {
        return (a) this.f22049d.getValue();
    }

    @NotNull
    public final RecyclerView getPromotionInfoLayout() {
        Object value = this.f22048c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (RecyclerView) value;
    }

    public final void setEarnInfoList(@Nullable List<b> earnInfoList) {
        if (earnInfoList != null) {
            if (earnInfoList.isEmpty()) {
                setVisibility(8);
            } else {
                setVisibility(0);
                getPaymentEarnAdapter().setList(earnInfoList);
            }
        }
    }

    public final void setEarnInfoTips(@Nullable String earnInfoTips) {
        ImageView imageView;
        this.f22047b = earnInfoTips;
        s0 s0Var = this.f22046a;
        if (s0Var == null || (imageView = s0Var.f8485c) == null) {
            return;
        }
        imageView.setVisibility(TextUtils.isEmpty(earnInfoTips) ? 8 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelPaymentEarnLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexiBankModelPaymentEarnLayout(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelPaymentEarnLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22048c = C2131j.b(new f(this, 15));
        this.f22049d = C2131j.b(new b0(5));
        View viewInflate = View.inflate(context, q.fb_layout_payment_earn_layout, this);
        int i10 = p.fb_iv_earn_tips_icon;
        ImageView imageView = (ImageView) p059e1.a.m(i10, viewInflate);
        if (imageView != null) {
            i10 = p.fb_ry_payment_earn_list;
            RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i10, viewInflate);
            if (recyclerView != null) {
                i10 = p.fb_tv_item_key;
                TextView textView = (TextView) p059e1.a.m(i10, viewInflate);
                if (textView != null) {
                    this.f22046a = new s0(viewInflate, imageView, recyclerView, textView);
                    float f10 = 16;
                    setPadding(ScreenUtils.dip2px(f10), 0, ScreenUtils.dip2px(f10), ScreenUtils.dip2px(f10));
                    recyclerView.setLayoutManager(new LinearLayoutManager(context, 1, false));
                    recyclerView.setAdapter(getPaymentEarnAdapter());
                    imageView.setOnClickListener(new j(9, context, this));
                    return;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
