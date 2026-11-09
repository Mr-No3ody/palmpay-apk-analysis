package com.transsnet.palmpay.custom_view.model;

import Oc.j;
import Pa.b0;
import Vb.c;
import Vb.d;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.transsnet.palmpay.custom_view.model.ModelPaymentEarnLayout;
import com.transsnet.palmpay.util.ScreenUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u001e\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010#\u001a\n \u0019*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/transsnet/palmpay/custom_view/model/ModelPaymentEarnLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "earnInfoTips", "", "setEarnInfoTips", "(Ljava/lang/String;)V", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setTipsClickListener", "(Lkotlin/jvm/functions/Function0;)V", "", "LVb/d;", "earnInfoList", "setEarnInfoList", "(Ljava/util/List;)V", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getIv_earn_tips_icon", "()Landroid/widget/ImageView;", "iv_earn_tips_icon", "Landroidx/recyclerview/widget/RecyclerView;", "b", "getRy_payment_earn_list", "()Landroidx/recyclerview/widget/RecyclerView;", "ry_payment_earn_list", "LVb/c;", "e", "getPaymentEarnAdapter", "()LVb/c;", "paymentEarnAdapter", "lib_views_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelPaymentEarnLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f31528f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f31529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f31530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f31531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f31533e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentEarnLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIv_earn_tips_icon() {
        return (ImageView) this.f31529a.getValue();
    }

    private final RecyclerView getRy_payment_earn_list() {
        return (RecyclerView) this.f31530b.getValue();
    }

    @NotNull
    public final c getPaymentEarnAdapter() {
        return (c) this.f31533e.getValue();
    }

    public final void setEarnInfoList(@Nullable List<d> earnInfoList) {
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
        this.f31532d = earnInfoTips;
        ImageView iv_earn_tips_icon = getIv_earn_tips_icon();
        if (iv_earn_tips_icon != null) {
            iv_earn_tips_icon.setVisibility(TextUtils.isEmpty(earnInfoTips) ? 8 : 0);
        }
    }

    public final void setTipsClickListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f31531c = listener;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentEarnLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelPaymentEarnLayout(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPaymentEarnLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f31529a = C2131j.b(new Function0(this) { // from class: Vb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentEarnLayout f10288b;

            {
                this.f10288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentEarnLayout modelPaymentEarnLayout = this.f10288b;
                switch (i10) {
                    case 0:
                        int i11 = ModelPaymentEarnLayout.f31528f;
                        return (ImageView) modelPaymentEarnLayout.findViewById(com.transsnet.palmpay.custom_view.s.iv_earn_tips_icon);
                    default:
                        int i12 = ModelPaymentEarnLayout.f31528f;
                        return (RecyclerView) modelPaymentEarnLayout.findViewById(com.transsnet.palmpay.custom_view.s.ry_payment_earn_list);
                }
            }
        });
        final int i11 = 1;
        this.f31530b = C2131j.b(new Function0(this) { // from class: Vb.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelPaymentEarnLayout f10288b;

            {
                this.f10288b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelPaymentEarnLayout modelPaymentEarnLayout = this.f10288b;
                switch (i11) {
                    case 0:
                        int i12 = ModelPaymentEarnLayout.f31528f;
                        return (ImageView) modelPaymentEarnLayout.findViewById(com.transsnet.palmpay.custom_view.s.iv_earn_tips_icon);
                    default:
                        int i13 = ModelPaymentEarnLayout.f31528f;
                        return (RecyclerView) modelPaymentEarnLayout.findViewById(com.transsnet.palmpay.custom_view.s.ry_payment_earn_list);
                }
            }
        });
        this.f31531c = new b0(21);
        this.f31533e = C2131j.b(new b0(22));
        View.inflate(context, com.transsnet.palmpay.custom_view.t.cv_layout_payment_earn_layout, this);
        setPadding(ScreenUtils.dip2px(16.0f), 0, ScreenUtils.dip2px(16.0f), ScreenUtils.dip2px(16.0f));
        getRy_payment_earn_list().setLayoutManager(new LinearLayoutManager(context, 1, false));
        getRy_payment_earn_list().setAdapter(getPaymentEarnAdapter());
        ImageView iv_earn_tips_icon = getIv_earn_tips_icon();
        if (iv_earn_tips_icon != null) {
            iv_earn_tips_icon.setOnClickListener(new j(17, this, context));
        }
    }
}
