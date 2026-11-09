package N7;

import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.q0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6101a = new ArrayList();

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final q0 onApplyWindowInsets(View v3, q0 insets) {
        Intrinsics.checkNotNullParameter(v3, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Iterator it = this.f6101a.iterator();
        while (it.hasNext()) {
            ((OnApplyWindowInsetsListener) it.next()).onApplyWindowInsets(v3, insets);
        }
        return insets;
    }
}
