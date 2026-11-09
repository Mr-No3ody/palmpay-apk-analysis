package com.transsnet.palmpay.credit.view;

import Bc.C0105b;
import Ya.e;
import Ya.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/transsnet/palmpay/credit/view/ProductInfoChangeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ProductInfoChangeView extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0105b f30878a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductInfoChangeView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View viewInflate = View.inflate(context, f.cs_cl_loan_home_phone_installment_product_info_change_layout, this);
        int i7 = e.ivImage;
        ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
        if (imageView != null) {
            i7 = e.ivTag;
            ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
            if (imageView2 != null) {
                i7 = e.tvLocate;
                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                if (textView != null) {
                    i7 = e.tvSubTitle;
                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                    if (textView2 != null) {
                        i7 = e.tvTitle;
                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView3 != null) {
                            this.f30878a = new C0105b((ViewGroup) viewInflate, (View) imageView, (View) imageView2, textView, textView2, textView3, 16);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }
}
