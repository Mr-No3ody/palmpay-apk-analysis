package p090g0;

import Ef.f;
import Sf.i;
import android.view.View;
import androidx.core.view.S;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import java.util.ArrayList;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f36805a = c.pooling_container_listener_holder_tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f36806b = c.is_pooling_container_tag;

    public static final void a(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        S block = new S(view, null);
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(block, "block");
        i iVar = new i();
        iVar.f8898d = f.a(iVar, iVar, block);
        while (iVar.hasNext()) {
            View view2 = (View) iVar.next();
            int i7 = f36805a;
            b bVar = (b) view2.getTag(i7);
            if (bVar == null) {
                bVar = new b();
                view2.setTag(i7, bVar);
            }
            ArrayList arrayList = bVar.f36807a;
            for (int iG = C1850q.g(arrayList); -1 < iG; iG--) {
                ((PoolingContainerListener) arrayList.get(iG)).onRelease();
            }
        }
    }
}
