package Uc;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.transsnet.palmpay.p2pcash.ui.atm.MapPage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class Z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapPage f9610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0654e0 f9611c;

    public /* synthetic */ Z(C0654e0 c0654e0, MapPage mapPage) {
        this.f9609a = 2;
        this.f9611c = c0654e0;
        this.f9610b = mapPage;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9609a) {
            case 0:
                MapPage mapPage = this.f9610b;
                ViewGroup.LayoutParams layoutParams = MapPage.o(mapPage).getLayoutParams();
                C0654e0 c0654e0 = this.f9611c;
                int i7 = c0654e0.f9634a - c0654e0.f9635b;
                Object value = mapPage.f32861B.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                layoutParams.height = ((ConstraintLayout) value).getHeight() + i7;
                MapPage.o(mapPage).requestLayout();
                break;
            case 1:
                MapPage mapPage2 = this.f9610b;
                MapPage.p(mapPage2).setTranslationY(0.0f);
                LinearLayout linearLayoutO = MapPage.o(mapPage2);
                C0654e0 c0654e1 = this.f9611c;
                linearLayoutO.setTranslationY(c0654e1.f9636c);
                p220oa.h.d(MapPage.o(mapPage2));
                c0654e1.f9639f = true;
                break;
            default:
                MapPage mapPage3 = this.f9610b;
                int top2 = MapPage.p(mapPage3).getTop();
                C0654e0 c0654e2 = this.f9611c;
                c0654e2.f9634a = top2;
                Object value2 = mapPage3.f32860A.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                c0654e2.f9635b = ((ImageView) value2).getBottom();
                c0654e2.f9636c = MapPage.p(mapPage3).getHeight() + c0654e2.f9634a;
                c0654e2.f9637d = MapPage.p(mapPage3).getHeight() + c0654e2.f9635b;
                break;
        }
    }

    public /* synthetic */ Z(MapPage mapPage, C0654e0 c0654e0, int i7) {
        this.f9609a = i7;
        this.f9610b = mapPage;
        this.f9611c = c0654e0;
    }
}
