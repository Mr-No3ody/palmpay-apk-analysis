package Ie;

import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4372b;

    public /* synthetic */ k(Object obj, int i7) {
        this.f4371a = i7;
        this.f4372b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f4371a) {
            case 0:
                int i17 = i11 - i7;
                int i18 = i15 - i13;
                if (i17 > 0 && i17 != i18) {
                    m mVar = (m) this.f4372b;
                    if (!mVar.f4377e.isEmpty()) {
                        mVar.a();
                    }
                    break;
                }
                break;
            case 1:
                ((CarouselLayoutManager) this.f4372b).lambda$new$0(view, i7, i10, i11, i12, i13, i14, i15, i16);
                break;
            default:
                ((NavigationBarItemView) this.f4372b).lambda$new$0(view, i7, i10, i11, i12, i13, i14, i15, i16);
                break;
        }
    }
}
