package com.transsnet.palmpay.core.viewmodel;

import B6.ViewOnClickListenerC0087i;
import Pa.r0;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1205o;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleOwner;
import com.transsnet.palmpay.core.bean.rsp.QueryCouponClaimData;
import com.transsnet.palmpay.core.viewmodel.ModelClaimCouponItemView;
import com.wang.avi.AVLoadingIndicatorView;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.d;
import p025ba.g;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R#\u0010\u001e\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010#\u001a\n \u0019*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R#\u0010&\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010\u001dR#\u0010)\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001b\u001a\u0004\b(\u0010\u001dR#\u0010,\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b+\u0010\u001dR#\u00101\u001a\n \u0019*\u0004\u0018\u00010-0-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u00100R\"\u00104\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u0010\u0013R\"\u0010<\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\u0017R$\u0010@\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010\u0017R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ModelClaimCouponItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/lifecycle/LifecycleOwner;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "msg", "", "setAmount", "(Ljava/lang/CharSequence;)V", "", "single", "setSingleLine", "(Z)V", "", "limit", "setUseLimit", "(Ljava/lang/String;)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTv_coupon_claim", "()Landroid/widget/TextView;", "tv_coupon_claim", "Lcom/wang/avi/AVLoadingIndicatorView;", "b", "getView_loading_indicator", "()Lcom/wang/avi/AVLoadingIndicatorView;", "view_loading_indicator", "c", "getTv_coupon_limit_single", "tv_coupon_limit_single", "d", "getTv_coupon_limit", "tv_coupon_limit", "e", "getTv_coupon_value", "tv_coupon_value", "Landroid/widget/ImageView;", "f", "getIv_coupon_icon", "()Landroid/widget/ImageView;", "iv_coupon_icon", "g", "Z", "isSingle", "()Z", "setSingle", "i", "Ljava/lang/String;", "getMLimitText", "()Ljava/lang/String;", "setMLimitText", "mLimitText", "j", "getTransType", "setTransType", "transType", "Landroidx/lifecycle/o;", "getLifecycle", "()Landroidx/lifecycle/o;", "lifecycle", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelClaimCouponItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelClaimCouponItemView.kt\ncom/transsnet/palmpay/core/viewmodel/ModelClaimCouponItemView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KotlinExtendUtils.kt\ncom/transsnet/palmpay/core/util/KotlinExtendUtilsKt\n*L\n1#1,173:1\n1869#2,2:174\n116#3:176\n*S KotlinDebug\n*F\n+ 1 ModelClaimCouponItemView.kt\ncom/transsnet/palmpay/core/viewmodel/ModelClaimCouponItemView\n*L\n66#1:174,2\n131#1:176\n*E\n"})
public final class ModelClaimCouponItemView extends ConstraintLayout implements LifecycleOwner {
    public static final /* synthetic */ int t = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f28286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f28290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isSingle;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public String mLimitText;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public String transType;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1212w f28294o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f28295p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelClaimCouponItemView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getIv_coupon_icon() {
        return (ImageView) this.f28290f.getValue();
    }

    private final TextView getTv_coupon_claim() {
        return (TextView) this.f28285a.getValue();
    }

    private final TextView getTv_coupon_limit() {
        return (TextView) this.f28288d.getValue();
    }

    private final TextView getTv_coupon_limit_single() {
        return (TextView) this.f28287c.getValue();
    }

    private final TextView getTv_coupon_value() {
        return (TextView) this.f28289e.getValue();
    }

    private final AVLoadingIndicatorView getView_loading_indicator() {
        return (AVLoadingIndicatorView) this.f28286b.getValue();
    }

    public final void c(QueryCouponClaimData data, boolean z3, ModelClaimCouponListItemView modelClaimCouponListItemView, String str) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.transType = str;
        r0.h1(getIv_coupon_icon(), data.getLogo(), d.core_ticket_discount_coupon);
        setSingleLine(z3);
        Long nominaValue = data.getNominaValue();
        setAmount(r0.B(nominaValue != null ? nominaValue.longValue() : 0L, false));
        String couponName = data.getCouponName();
        if (couponName == null) {
            couponName = "";
        }
        setUseLimit(couponName);
        TextView tv_coupon_claim = getTv_coupon_claim();
        if (tv_coupon_claim != null) {
            tv_coupon_claim.setOnClickListener(new ViewOnClickListenerC0087i(this, 20, data, modelClaimCouponListItemView));
        }
    }

    public final void d(boolean z3) {
        AVLoadingIndicatorView view_loading_indicator = getView_loading_indicator();
        if (view_loading_indicator != null) {
            h.s(view_loading_indicator, z3);
        }
        TextView tv_coupon_claim = getTv_coupon_claim();
        if (tv_coupon_claim != null) {
            h.s(tv_coupon_claim, !z3);
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public AbstractC1205o getLifecycle() {
        return this.f28294o;
    }

    @NotNull
    public final String getMLimitText() {
        return this.mLimitText;
    }

    @Nullable
    public final String getTransType() {
        return this.transType;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1212w c1212w = this.f28294o;
        if (c1212w != null) {
            c1212w.g(EnumC1204n.f17463d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1212w c1212w = this.f28294o;
        if (c1212w != null) {
            c1212w.g(EnumC1204n.f17462c);
        }
        for (Job job : this.f28295p) {
            if (job != null && job.isActive()) {
                job.cancel((CancellationException) null);
            }
        }
    }

    public final void setAmount(@Nullable CharSequence msg) {
        getTv_coupon_value().setText(msg);
    }

    public final void setMLimitText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mLimitText = str;
    }

    public final void setSingle(boolean z3) {
        this.isSingle = z3;
    }

    public final void setSingleLine(boolean single) {
        this.isSingle = single;
        TextView tv_coupon_limit = getTv_coupon_limit();
        Intrinsics.checkNotNullExpressionValue(tv_coupon_limit, "<get-tv_coupon_limit>(...)");
        h.s(tv_coupon_limit, !this.isSingle);
        TextView tv_coupon_limit_single = getTv_coupon_limit_single();
        Intrinsics.checkNotNullExpressionValue(tv_coupon_limit_single, "<get-tv_coupon_limit_single>(...)");
        h.s(tv_coupon_limit_single, this.isSingle);
    }

    public final void setTransType(@Nullable String str) {
        this.transType = str;
    }

    public final void setUseLimit(@NotNull String limit) {
        Intrinsics.checkNotNullParameter(limit, "limit");
        if (TextUtils.isEmpty(limit)) {
            TextView tv_coupon_limit = getTv_coupon_limit();
            Intrinsics.checkNotNullExpressionValue(tv_coupon_limit, "<get-tv_coupon_limit>(...)");
            h.s(tv_coupon_limit, false);
            TextView tv_coupon_limit_single = getTv_coupon_limit_single();
            Intrinsics.checkNotNullExpressionValue(tv_coupon_limit_single, "<get-tv_coupon_limit_single>(...)");
            h.s(tv_coupon_limit_single, false);
            return;
        }
        this.mLimitText = limit;
        if (this.isSingle) {
            getTv_coupon_limit_single().setText(this.mLimitText);
            TextView tv_coupon_limit_single2 = getTv_coupon_limit_single();
            Intrinsics.checkNotNullExpressionValue(tv_coupon_limit_single2, "<get-tv_coupon_limit_single>(...)");
            h.s(tv_coupon_limit_single2, true);
            return;
        }
        getTv_coupon_limit().setText(this.mLimitText);
        TextView tv_coupon_limit2 = getTv_coupon_limit();
        Intrinsics.checkNotNullExpressionValue(tv_coupon_limit2, "<get-tv_coupon_limit>(...)");
        h.s(tv_coupon_limit2, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelClaimCouponItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelClaimCouponItemView(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelClaimCouponItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f28285a = C2131j.b(new Function0(this) { // from class: Ua.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelClaimCouponItemView f9337b;

            {
                this.f9337b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelClaimCouponItemView modelClaimCouponItemView = this.f9337b;
                switch (i10) {
                    case 0:
                        int i11 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_claim);
                    case 1:
                        int i12 = ModelClaimCouponItemView.t;
                        return (AVLoadingIndicatorView) modelClaimCouponItemView.findViewById(p025ba.e.view_loading_indicator);
                    case 2:
                        int i13 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_limit_single);
                    case 3:
                        int i14 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_limit);
                    case 4:
                        int i15 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_value);
                    default:
                        int i16 = ModelClaimCouponItemView.t;
                        return (ImageView) modelClaimCouponItemView.findViewById(p025ba.e.iv_coupon_icon);
                }
            }
        });
        final int i11 = 1;
        this.f28286b = C2131j.b(new Function0(this) { // from class: Ua.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelClaimCouponItemView f9337b;

            {
                this.f9337b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelClaimCouponItemView modelClaimCouponItemView = this.f9337b;
                switch (i11) {
                    case 0:
                        int i12 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_claim);
                    case 1:
                        int i13 = ModelClaimCouponItemView.t;
                        return (AVLoadingIndicatorView) modelClaimCouponItemView.findViewById(p025ba.e.view_loading_indicator);
                    case 2:
                        int i14 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_limit_single);
                    case 3:
                        int i15 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_limit);
                    case 4:
                        int i16 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_value);
                    default:
                        int i17 = ModelClaimCouponItemView.t;
                        return (ImageView) modelClaimCouponItemView.findViewById(p025ba.e.iv_coupon_icon);
                }
            }
        });
        final int i12 = 2;
        this.f28287c = C2131j.b(new Function0(this) { // from class: Ua.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelClaimCouponItemView f9337b;

            {
                this.f9337b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelClaimCouponItemView modelClaimCouponItemView = this.f9337b;
                switch (i12) {
                    case 0:
                        int i13 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_claim);
                    case 1:
                        int i14 = ModelClaimCouponItemView.t;
                        return (AVLoadingIndicatorView) modelClaimCouponItemView.findViewById(p025ba.e.view_loading_indicator);
                    case 2:
                        int i15 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_limit_single);
                    case 3:
                        int i16 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_limit);
                    case 4:
                        int i17 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_value);
                    default:
                        int i18 = ModelClaimCouponItemView.t;
                        return (ImageView) modelClaimCouponItemView.findViewById(p025ba.e.iv_coupon_icon);
                }
            }
        });
        final int i13 = 3;
        this.f28288d = C2131j.b(new Function0(this) { // from class: Ua.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelClaimCouponItemView f9337b;

            {
                this.f9337b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelClaimCouponItemView modelClaimCouponItemView = this.f9337b;
                switch (i13) {
                    case 0:
                        int i14 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_claim);
                    case 1:
                        int i15 = ModelClaimCouponItemView.t;
                        return (AVLoadingIndicatorView) modelClaimCouponItemView.findViewById(p025ba.e.view_loading_indicator);
                    case 2:
                        int i16 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_limit_single);
                    case 3:
                        int i17 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_limit);
                    case 4:
                        int i18 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_value);
                    default:
                        int i19 = ModelClaimCouponItemView.t;
                        return (ImageView) modelClaimCouponItemView.findViewById(p025ba.e.iv_coupon_icon);
                }
            }
        });
        final int i14 = 4;
        this.f28289e = C2131j.b(new Function0(this) { // from class: Ua.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelClaimCouponItemView f9337b;

            {
                this.f9337b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelClaimCouponItemView modelClaimCouponItemView = this.f9337b;
                switch (i14) {
                    case 0:
                        int i15 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_claim);
                    case 1:
                        int i16 = ModelClaimCouponItemView.t;
                        return (AVLoadingIndicatorView) modelClaimCouponItemView.findViewById(p025ba.e.view_loading_indicator);
                    case 2:
                        int i17 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_limit_single);
                    case 3:
                        int i18 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_limit);
                    case 4:
                        int i19 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_value);
                    default:
                        int i110 = ModelClaimCouponItemView.t;
                        return (ImageView) modelClaimCouponItemView.findViewById(p025ba.e.iv_coupon_icon);
                }
            }
        });
        final int i15 = 5;
        this.f28290f = C2131j.b(new Function0(this) { // from class: Ua.H

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelClaimCouponItemView f9337b;

            {
                this.f9337b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelClaimCouponItemView modelClaimCouponItemView = this.f9337b;
                switch (i15) {
                    case 0:
                        int i16 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_claim);
                    case 1:
                        int i17 = ModelClaimCouponItemView.t;
                        return (AVLoadingIndicatorView) modelClaimCouponItemView.findViewById(p025ba.e.view_loading_indicator);
                    case 2:
                        int i18 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_limit_single);
                    case 3:
                        int i19 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_limit);
                    case 4:
                        int i110 = ModelClaimCouponItemView.t;
                        return (TextView) modelClaimCouponItemView.findViewById(p025ba.e.tv_coupon_value);
                    default:
                        int i111 = ModelClaimCouponItemView.t;
                        return (ImageView) modelClaimCouponItemView.findViewById(p025ba.e.iv_coupon_icon);
                }
            }
        });
        this.mLimitText = "";
        this.transType = "";
        C1212w c1212w = new C1212w(this);
        c1212w.g(EnumC1204n.f17462c);
        this.f28294o = c1212w;
        this.f28295p = new ArrayList();
        View.inflate(context, g.core_layout_model_coupon_claim_item, this);
    }
}
