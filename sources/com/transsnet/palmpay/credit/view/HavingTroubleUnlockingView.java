package com.transsnet.palmpay.credit.view;

import Ya.e;
import Ya.f;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/transsnet/palmpay/credit/view/HavingTroubleUnlockingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HavingTroubleUnlockingView extends ConstraintLayout {

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HavingTroubleUnlockingView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View viewInflate = View.inflate(context, f.cs_cl_phone_installment_trouble_unlocking_layout, this);
        int i7 = e.ivAboutPhoneLock;
        if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = e.ivAboutTemporaryUnlock;
            if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = e.tvAboutPhoneLock;
                if (((TextView) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = e.tvAboutTemporaryUnlock;
                    if (((TextView) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = e.tvTroubleUnlockingTitle;
                        if (((TextView) p059e1.a.m(i7, viewInflate)) != null) {
                            if (viewInflate != null) {
                                viewInflate.setPadding(CommonViewExtKt.getDp(16), CommonViewExtKt.getDp(12), CommonViewExtKt.getDp(16), CommonViewExtKt.getDp(12));
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }
}
