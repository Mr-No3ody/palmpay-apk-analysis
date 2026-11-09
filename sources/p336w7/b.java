package p336w7;

import android.view.View;
import com.rnmaps.maps.MapMarker;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = i11 - i7;
        int i18 = i12 - i10;
        MapMarker mapMarker = (MapMarker) view.getParent();
        if (mapMarker != null) {
            mapMarker.f24769c = i17;
            mapMarker.f24770d = i18;
            mapMarker.f24782s0++;
            mapMarker.h();
            mapMarker.f24762E0 = null;
            mapMarker.f(true);
        }
    }
}
