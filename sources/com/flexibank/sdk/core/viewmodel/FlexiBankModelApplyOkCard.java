package com.flexibank.sdk.core.viewmodel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.flexibank.sdk.core.viewmodel.FlexiBankModelApplyOkCard;
import com.flexibank.sdk.customview.viewholder.FlexiBankLabelLayout;
import com.flexibank.sdk.k;
import com.flexibank.sdk.m;
import com.flexibank.sdk.o;
import com.flexibank.sdk.p;
import com.flexibank.sdk.q;
import com.flexibank.sdk.r;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p052da.ViewOnClickListenerC1649v;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0012\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001a\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u000eR\u001b\u0010\u001d\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\f\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/flexibank/sdk/core/viewmodel/FlexiBankModelApplyOkCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "a", "Lkotlin/Lazy;", "getTvMessage", "()Landroid/widget/TextView;", "tvMessage", "b", "getTvApply", "tvApply", "Lcom/flexibank/sdk/customview/viewholder/FlexiBankLabelLayout;", "c", "getViewContainer", "()Lcom/flexibank/sdk/customview/viewholder/FlexiBankLabelLayout;", "viewContainer", "d", "getTvAmount", "tvAmount", "e", "getTvTitle", "tvTitle", "flexibank-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FlexiBankModelApplyOkCard extends ConstraintLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f22094f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f22095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f22096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f22097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f22098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f22099e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelApplyOkCard(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getTvAmount() {
        Object value = this.f22098d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvApply() {
        Object value = this.f22096b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvMessage() {
        Object value = this.f22095a.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final TextView getTvTitle() {
        Object value = this.f22099e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (TextView) value;
    }

    private final FlexiBankLabelLayout getViewContainer() {
        Object value = this.f22097c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FlexiBankLabelLayout) value;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelApplyOkCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FlexiBankModelApplyOkCard(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FlexiBankModelApplyOkCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f22095a = C2131j.b(new Function0(this) { // from class: k4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankModelApplyOkCard f38663b;

            {
                this.f38663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankModelApplyOkCard flexiBankModelApplyOkCard = this.f38663b;
                switch (i10) {
                    case 0:
                        int i11 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvMessage);
                    case 1:
                        int i12 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvApply);
                    case 2:
                        int i13 = FlexiBankModelApplyOkCard.f22094f;
                        return (FlexiBankLabelLayout) flexiBankModelApplyOkCard.findViewById(p.fb_viewContainer);
                    case 3:
                        int i14 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvAmount);
                    default:
                        int i15 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvTitle);
                }
            }
        });
        final int i11 = 1;
        this.f22096b = C2131j.b(new Function0(this) { // from class: k4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankModelApplyOkCard f38663b;

            {
                this.f38663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankModelApplyOkCard flexiBankModelApplyOkCard = this.f38663b;
                switch (i11) {
                    case 0:
                        int i12 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvMessage);
                    case 1:
                        int i13 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvApply);
                    case 2:
                        int i14 = FlexiBankModelApplyOkCard.f22094f;
                        return (FlexiBankLabelLayout) flexiBankModelApplyOkCard.findViewById(p.fb_viewContainer);
                    case 3:
                        int i15 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvAmount);
                    default:
                        int i16 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvTitle);
                }
            }
        });
        final int i12 = 2;
        this.f22097c = C2131j.b(new Function0(this) { // from class: k4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankModelApplyOkCard f38663b;

            {
                this.f38663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankModelApplyOkCard flexiBankModelApplyOkCard = this.f38663b;
                switch (i12) {
                    case 0:
                        int i13 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvMessage);
                    case 1:
                        int i14 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvApply);
                    case 2:
                        int i15 = FlexiBankModelApplyOkCard.f22094f;
                        return (FlexiBankLabelLayout) flexiBankModelApplyOkCard.findViewById(p.fb_viewContainer);
                    case 3:
                        int i16 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvAmount);
                    default:
                        int i17 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvTitle);
                }
            }
        });
        final int i13 = 3;
        this.f22098d = C2131j.b(new Function0(this) { // from class: k4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankModelApplyOkCard f38663b;

            {
                this.f38663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankModelApplyOkCard flexiBankModelApplyOkCard = this.f38663b;
                switch (i13) {
                    case 0:
                        int i14 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvMessage);
                    case 1:
                        int i15 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvApply);
                    case 2:
                        int i16 = FlexiBankModelApplyOkCard.f22094f;
                        return (FlexiBankLabelLayout) flexiBankModelApplyOkCard.findViewById(p.fb_viewContainer);
                    case 3:
                        int i17 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvAmount);
                    default:
                        int i18 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvTitle);
                }
            }
        });
        final int i14 = 4;
        this.f22099e = C2131j.b(new Function0(this) { // from class: k4.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlexiBankModelApplyOkCard f38663b;

            {
                this.f38663b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FlexiBankModelApplyOkCard flexiBankModelApplyOkCard = this.f38663b;
                switch (i14) {
                    case 0:
                        int i15 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvMessage);
                    case 1:
                        int i16 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvApply);
                    case 2:
                        int i17 = FlexiBankModelApplyOkCard.f22094f;
                        return (FlexiBankLabelLayout) flexiBankModelApplyOkCard.findViewById(p.fb_viewContainer);
                    case 3:
                        int i18 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvAmount);
                    default:
                        int i19 = FlexiBankModelApplyOkCard.f22094f;
                        return (TextView) flexiBankModelApplyOkCard.findViewById(p.fb_tvTitle);
                }
            }
        });
        View.inflate(context, q.fb_layout_model_apply_okcard, this);
        setBackgroundResource(o.fb_shape_rect_bg_white_corner_8);
        getTvApply().setOnClickListener(new ViewOnClickListenerC1649v(this, 20));
        Context contextG = k.g();
        getTvTitle().setText(new SpanUtils().append(contextG.getString(r.fb_oc_limit)).setForegroundColor(contextG.getColor(m.fb_text_color_black1)).create());
    }
}
