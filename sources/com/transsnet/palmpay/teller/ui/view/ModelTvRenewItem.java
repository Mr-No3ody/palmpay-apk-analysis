package com.transsnet.palmpay.teller.ui.view;

import Bc.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/view/ModelTvRenewItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelTvRenewItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelTvRenewItem.kt\ncom/transsnet/palmpay/teller/ui/view/ModelTvRenewItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n1869#2,2:111\n*S KotlinDebug\n*F\n+ 1 ModelTvRenewItem.kt\ncom/transsnet/palmpay/teller/ui/view/ModelTvRenewItem\n*L\n85#1:111,2\n*E\n"})
public final class ModelTvRenewItem extends ConstraintLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f34348b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f34349a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelTvRenewItem(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelTvRenewItem(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModelTvRenewItem(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ModelTvRenewItem(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = View.inflate(context, Pd.d.qt_view_layout_tv_renew_item, this);
        int i10 = Pd.c.btn_renewal;
        PpButton ppButton = (PpButton) p059e1.a.m(i10, viewInflate);
        if (ppButton != null) {
            i10 = Pd.c.tv_content;
            TextView textView = (TextView) p059e1.a.m(i10, viewInflate);
            if (textView != null) {
                i10 = Pd.c.tv_name;
                TextView textView2 = (TextView) p059e1.a.m(i10, viewInflate);
                if (textView2 != null) {
                    i10 = Pd.c.tv_time;
                    TextView textView3 = (TextView) p059e1.a.m(i10, viewInflate);
                    if (textView3 != null) {
                        this.f34349a = new k(viewInflate, ppButton, textView, textView2, textView3);
                        setLayoutParams(new ConstraintLayout.LayoutParams(-1, CommonViewExtKt.getDp(60)));
                        setBackgroundResource(r.cv_shape_rect_corner_13_bg_white_stroke_disabled);
                        setPadding(CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(10), CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(10));
                        setVisibility(8);
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }
}
