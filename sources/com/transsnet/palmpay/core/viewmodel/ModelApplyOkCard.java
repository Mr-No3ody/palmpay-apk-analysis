package com.transsnet.palmpay.core.viewmodel;

import Pa.k0;
import R8.d;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.core.bean.rsp.OkCardPreCreditInfoRsp;
import com.transsnet.palmpay.core.viewmodel.ModelApplyOkCard;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.viewholder.LabelLayout;
import com.transsnet.palmpay.util.SizeUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.g;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0013\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR#\u0010\u0018\u001a\n \u000b*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u001b\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\r\u001a\u0004\b\u001a\u0010\u000fR#\u0010\u001e\u001a\n \u000b*\u0004\u0018\u00010\n0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/transsnet/palmpay/core/viewmodel/ModelApplyOkCard;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "a", "Lkotlin/Lazy;", "getTvMessage", "()Landroid/widget/TextView;", "tvMessage", "b", "getTvApply", "tvApply", "Lcom/transsnet/palmpay/custom_view/viewholder/LabelLayout;", "c", "getViewContainer", "()Lcom/transsnet/palmpay/custom_view/viewholder/LabelLayout;", "viewContainer", "d", "getTvAmount", "tvAmount", "e", "getTvTitle", "tvTitle", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelApplyOkCard extends ConstraintLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f28238i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f28239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f28240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f28241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f28242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f28243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OkCardPreCreditInfoRsp f28244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28245g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelApplyOkCard(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TextView getTvAmount() {
        return (TextView) this.f28242d.getValue();
    }

    private final TextView getTvApply() {
        return (TextView) this.f28240b.getValue();
    }

    private final TextView getTvMessage() {
        return (TextView) this.f28239a.getValue();
    }

    private final TextView getTvTitle() {
        return (TextView) this.f28243e.getValue();
    }

    private final LabelLayout getViewContainer() {
        return (LabelLayout) this.f28241c.getValue();
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            TextView tvAmount = getTvAmount();
            Intrinsics.checkNotNullExpressionValue(tvAmount, "<get-tvAmount>(...)");
            h.s(tvAmount, false);
        } else {
            getTvAmount().setText(str);
            TextView tvAmount2 = getTvAmount();
            Intrinsics.checkNotNullExpressionValue(tvAmount2, "<get-tvAmount>(...)");
            h.s(tvAmount2, true);
        }
    }

    public final void d(CharSequence charSequence) {
        getTvMessage().setText(charSequence);
    }

    public final void e(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        LabelLayout viewContainer = getViewContainer();
        int i7 = g.core_layout_okcard_tips_item;
        int i10 = LabelLayout.f31714a;
        int iDp2px = SizeUtils.dp2px(6.0f);
        viewContainer.getClass();
        Intrinsics.checkNotNullParameter(list, "list");
        viewContainer.removeAllViews();
        int size = list.size() <= 3 ? list.size() : 3;
        for (int i11 = 0; i11 < size; i11++) {
            View viewInflate = LayoutInflater.from(viewContainer.getContext()).inflate(i7, (ViewGroup) null, false);
            Intrinsics.f(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewInflate;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i11 != 0) {
                layoutParams.leftMargin = iDp2px;
            }
            textView.setText((CharSequence) list.get(i11));
            viewContainer.addView(textView, layoutParams);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelApplyOkCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelApplyOkCard(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelApplyOkCard(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        final int i10 = 0;
        this.f28239a = C2131j.b(new Function0(this) { // from class: Ua.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelApplyOkCard f9431b;

            {
                this.f9431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelApplyOkCard modelApplyOkCard = this.f9431b;
                switch (i10) {
                    case 0:
                        int i11 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvMessage);
                    case 1:
                        int i12 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvApply);
                    case 2:
                        int i13 = ModelApplyOkCard.f28238i;
                        return (LabelLayout) modelApplyOkCard.findViewById(p025ba.e.viewContainer);
                    case 3:
                        int i14 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvAmount);
                    default:
                        int i15 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvTitle);
                }
            }
        });
        final int i11 = 1;
        this.f28240b = C2131j.b(new Function0(this) { // from class: Ua.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelApplyOkCard f9431b;

            {
                this.f9431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelApplyOkCard modelApplyOkCard = this.f9431b;
                switch (i11) {
                    case 0:
                        int i12 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvMessage);
                    case 1:
                        int i13 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvApply);
                    case 2:
                        int i14 = ModelApplyOkCard.f28238i;
                        return (LabelLayout) modelApplyOkCard.findViewById(p025ba.e.viewContainer);
                    case 3:
                        int i15 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvAmount);
                    default:
                        int i16 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvTitle);
                }
            }
        });
        final int i12 = 2;
        this.f28241c = C2131j.b(new Function0(this) { // from class: Ua.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelApplyOkCard f9431b;

            {
                this.f9431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelApplyOkCard modelApplyOkCard = this.f9431b;
                switch (i12) {
                    case 0:
                        int i13 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvMessage);
                    case 1:
                        int i14 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvApply);
                    case 2:
                        int i15 = ModelApplyOkCard.f28238i;
                        return (LabelLayout) modelApplyOkCard.findViewById(p025ba.e.viewContainer);
                    case 3:
                        int i16 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvAmount);
                    default:
                        int i17 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvTitle);
                }
            }
        });
        final int i13 = 3;
        this.f28242d = C2131j.b(new Function0(this) { // from class: Ua.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelApplyOkCard f9431b;

            {
                this.f9431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelApplyOkCard modelApplyOkCard = this.f9431b;
                switch (i13) {
                    case 0:
                        int i14 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvMessage);
                    case 1:
                        int i15 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvApply);
                    case 2:
                        int i16 = ModelApplyOkCard.f28238i;
                        return (LabelLayout) modelApplyOkCard.findViewById(p025ba.e.viewContainer);
                    case 3:
                        int i17 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvAmount);
                    default:
                        int i18 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvTitle);
                }
            }
        });
        final int i14 = 4;
        this.f28243e = C2131j.b(new Function0(this) { // from class: Ua.m

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ModelApplyOkCard f9431b;

            {
                this.f9431b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ModelApplyOkCard modelApplyOkCard = this.f9431b;
                switch (i14) {
                    case 0:
                        int i15 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvMessage);
                    case 1:
                        int i16 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvApply);
                    case 2:
                        int i17 = ModelApplyOkCard.f28238i;
                        return (LabelLayout) modelApplyOkCard.findViewById(p025ba.e.viewContainer);
                    case 3:
                        int i18 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvAmount);
                    default:
                        int i19 = ModelApplyOkCard.f28238i;
                        return (TextView) modelApplyOkCard.findViewById(p025ba.e.tvTitle);
                }
            }
        });
        View.inflate(context, g.core_layout_model_apply_okcard, this);
        setBackgroundResource(r.cv_shape_rect_corner_8_bg_white);
        getTvApply().setOnClickListener(new d(this, 14));
        getTvTitle().setText(k0.a());
    }
}
