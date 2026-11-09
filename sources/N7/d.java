package N7;

import Je.l;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.rnscreens.Screen;
import com.swmansion.rnscreens.bottomsheet.DimmingView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DimmingView f6108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f6109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f6110c;

    public d(ThemedReactContext reactContext, Screen screen) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(screen, "screen");
        DimmingView dimmingView = new DimmingView(reactContext, this.f6109b);
        dimmingView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dimmingView.setOnClickListener(new l(screen, 15));
        this.f6108a = dimmingView;
        this.f6109b = 0.3f;
    }
}
