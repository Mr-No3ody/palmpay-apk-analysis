package p233p8;

import android.content.Context;
import androidx.recyclerview.widget.LinearSmoothScroller;
import com.transsnet.adsdk.widgets.banner.bannerview.provider.ScrollDurationManger;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends LinearSmoothScroller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScrollDurationManger f41273a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ScrollDurationManger scrollDurationManger, Context context) {
        super(context);
        this.f41273a = scrollDurationManger;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int calculateTimeForDeceleration(int i7) {
        return this.f41273a.scrollDuration;
    }
}
