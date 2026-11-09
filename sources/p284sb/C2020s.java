package p284sb;

import H1.k;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.transition.Transition;
import com.transsnet.palmpay.credit.ui.activity.PayShopHomeActivity;
import com.transsnet.palmpay.util.SizeUtils;
import com.transsnet.palmpay.util.SpanUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sb.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2020s extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SpanUtils f42181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PayShopHomeActivity f42182c;

    public C2020s(SpanUtils spanUtils, PayShopHomeActivity payShopHomeActivity) {
        this.f42181b = spanUtils;
        this.f42182c = payShopHomeActivity;
    }

    @Override // H1.a, com.bumptech.glide.request.target.Target
    public final void onLoadFailed(Drawable drawable) {
        int i7 = PayShopHomeActivity.f28705p0;
        this.f42182c.t().setText(this.f42181b.create());
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void onResourceReady(Object obj, Transition transition) {
        Drawable resource = (Drawable) obj;
        Intrinsics.checkNotNullParameter(resource, "resource");
        int iDp2px = SizeUtils.dp2px(8.0f);
        SpanUtils spanUtils = this.f42181b;
        spanUtils.appendSpace(iDp2px);
        spanUtils.appendImage(resource, 2);
        int i7 = PayShopHomeActivity.f28705p0;
        this.f42182c.t().setText(spanUtils.create());
    }
}
