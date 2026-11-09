package com.transsnet.palmpay.core.ui.widget;

import B6.ViewOnClickListenerC0087i;
import Pa.n0;
import Pa.r0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.core.bean.rsp.CashOrderExtendBean;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.G;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/ui/widget/FixedSavingsLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FixedSavingsLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28137a = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixedSavingsLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void c(FixedSavingsLayout fixedSavingsLayout, CashOrderExtendBean cashOrderExtendBean, String str, int i7) {
        String str2 = (i7 & 2) != 0 ? "" : str;
        if (cashOrderExtendBean != null) {
            n0.g().w("Funddetails_Button_View", G.g(new Pair("element_name", cashOrderExtendBean.fixedSavingButton), new Pair("transtype", str2 == null ? "" : str2), new Pair("subtranstype", "")));
            ImageView imageView = (ImageView) fixedSavingsLayout.findViewById(p025ba.e.ivFixedSavings);
            if (imageView != null) {
                r0.k1(imageView, cashOrderExtendBean.fixedSavingIcon, cashOrderExtendBean.fixedSavingDarkIcon);
            }
            TextView textView = (TextView) fixedSavingsLayout.findViewById(p025ba.e.tvFixedSavingsTitle);
            if (textView != null) {
                textView.setText(cashOrderExtendBean.fixedSavingTitle);
            }
            TextView textView2 = (TextView) fixedSavingsLayout.findViewById(p025ba.e.tvFixedSavingsContent);
            if (textView2 != null) {
                textView2.setText(cashOrderExtendBean.fixedSavingContent);
            }
            TextView textView3 = (TextView) fixedSavingsLayout.findViewById(p025ba.e.btnSave);
            if (textView3 != null) {
                textView3.setText(cashOrderExtendBean.fixedSavingButton);
                textView3.setOnClickListener(new ViewOnClickListenerC0087i(fixedSavingsLayout, cashOrderExtendBean, str2, textView3, 17));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixedSavingsLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ FixedSavingsLayout(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FixedSavingsLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, p025ba.g.core_layout_fixed_savings, this);
        setBackgroundResource(r.cv_shape_rect_corner_12_bg_white);
        setPadding(CommonViewExtKt.getDp(16), CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(16), CommonViewExtKt.getDp(12));
    }
}
