package com.transsnet.palmpay.teller.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/view/ModelPointClaimItem;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModelPointClaimItem extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34347a = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPointClaimItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(long j6, boolean z3) {
        if (j6 <= 0 || !z3) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        ((TextView) findViewById(Pd.c.tvName)).setText(new SpanUtils().append("Cashback Available:").append(String.valueOf(j6)).setForegroundColor(CommonViewExtKt.colorInt(L6.b.ppColorPrimary, getContext())).create());
        setOnClickListener(new W8.d(24));
        ((PpButton) findViewById(Pd.c.tvConfirm)).setOnClickListener(new W8.d(25));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPointClaimItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelPointClaimItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelPointClaimItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, Pd.d.qt_layout_claim_point_item, this);
        setBackgroundResource(r.cv_shape_rect_corner_12_bg_white);
        setPadding(CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(8), CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(8));
        setVisibility(8);
    }
}
