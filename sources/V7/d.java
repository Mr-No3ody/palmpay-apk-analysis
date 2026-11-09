package V7;

import N8.q0;
import android.view.View;
import com.swmansion.rnscreens.gamma.tabs.TabsHost;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnLayoutChangeListener {
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        KProperty[] kPropertyArr = TabsHost.f25438y0;
        StringBuilder sbP = q0.p(i7, "BottomNavigationView layout changed {", i10, ", ", "} {");
        sbP.append(i11 - i7);
        sbP.append(", ");
        sbP.append(i12 - i10);
        sbP.append("}");
        String message = sbP.toString();
        Intrinsics.checkNotNullParameter("TabsHost", "tag");
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
