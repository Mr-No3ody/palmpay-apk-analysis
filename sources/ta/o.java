package ta;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.transsnet.palmpay.core.location.listeners.LocationListener;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p268ra.e f42387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p283sa.a f42388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f42389d;

    static {
        new n(null);
    }

    public abstract void a();

    public abstract void b();

    public final Activity c() {
        p283sa.a aVar = this.f42388c;
        Intrinsics.e(aVar);
        Activity activity = (Activity) aVar.f42096b.get();
        if (activity != null) {
            return activity;
        }
        Fragment fragment = (Fragment) aVar.f42097c.get();
        if (fragment != null) {
            return fragment.getActivity();
        }
        return null;
    }

    public final LocationListener d() {
        WeakReference weakReference = this.f42389d;
        Intrinsics.e(weakReference);
        return (LocationListener) weakReference.get();
    }
}
