package V7;

import B6.RunnableC0085g;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.swmansion.rnscreens.gamma.tabs.TabScreen;
import com.swmansion.rnscreens.gamma.tabs.TabScreenFragment;
import com.swmansion.rnscreens.gamma.tabs.TabsHost;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TabScreen f10093b;

    public /* synthetic */ e(TabScreen tabScreen, int i7) {
        this.f10092a = i7;
        this.f10093b = tabScreen;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TabScreen tabScreen = this.f10093b;
        switch (this.f10092a) {
            case 0:
                TabScreenFragment it = (TabScreenFragment) obj;
                KProperty[] kPropertyArr = TabsHost.f25438y0;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.f25437a == tabScreen);
            default:
                Drawable drawable = (Drawable) obj;
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                new Handler(Looper.getMainLooper()).post(new RunnableC0085g(24, tabScreen, drawable));
                return Unit.f38893a;
        }
    }
}
