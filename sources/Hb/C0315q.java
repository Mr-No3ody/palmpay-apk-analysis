package Hb;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.request.transition.Transition;
import com.transsnet.palmpay.credit.bean.ProductThemeInfo;
import com.transsnet.palmpay.credit.bean.ProductThemeInfoNameArea;
import com.transsnet.palmpay.credit.bean.TopArea;
import com.transsnet.palmpay.util.SizeUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Hb.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0315q extends H1.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f3845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ProductThemeInfo f3846c;

    public C0315q(TextView textView, ProductThemeInfo productThemeInfo) {
        this.f3845b = textView;
        this.f3846c = productThemeInfo;
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onResourceReady(Object obj, Transition transition) {
        TopArea topArea;
        Float f10;
        TopArea topArea2;
        Float f11;
        Drawable resource = (Drawable) obj;
        Intrinsics.checkNotNullParameter(resource, "resource");
        TextView textView = this.f3845b;
        textView.setBackground(resource);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Intrinsics.f(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        ProductThemeInfo productThemeInfo = this.f3846c;
        ProductThemeInfoNameArea productThemeInfoNameArea = productThemeInfo.nameArea;
        float fFloatValue = 0.0f;
        if (((productThemeInfoNameArea == null || (topArea2 = productThemeInfoNameArea.topArea) == null || (f11 = topArea2.height) == null) ? 0.0f : f11.floatValue()) > 0.0f) {
            int intrinsicWidth = resource.getIntrinsicWidth();
            int intrinsicHeight = resource.getIntrinsicHeight();
            ProductThemeInfoNameArea productThemeInfoNameArea2 = productThemeInfo.nameArea;
            if (productThemeInfoNameArea2 != null && (topArea = productThemeInfoNameArea2.topArea) != null && (f10 = topArea.height) != null) {
                fFloatValue = f10.floatValue();
            }
            int iDp2px = SizeUtils.dp2px(fFloatValue);
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = iDp2px;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = (intrinsicWidth * iDp2px) / intrinsicHeight;
        }
        textView.setLayoutParams(layoutParams2);
    }
}
