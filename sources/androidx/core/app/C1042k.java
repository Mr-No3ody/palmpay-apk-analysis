package androidx.core.app;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.core.app.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1042k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Na.a f15978a = new Na.a();

    public final void a(Activity activity) {
        Na.a aVar = this.f15978a;
        ArrayList<WeakReference> arrayList = (ArrayList) aVar.f6287b;
        for (WeakReference weakReference : arrayList) {
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener((WindowOnFrameMetricsAvailableListenerC1041j) aVar.f6289d);
    }
}
