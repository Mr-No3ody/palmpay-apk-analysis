package p182m5;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f39478b;

    public a(Activity activity, int i7) {
        this.f39478b = new WeakReference(activity);
        this.f39477a = i7;
    }

    public final Activity a() {
        WeakReference weakReference = this.f39478b;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public a(Activity activity, int i7, Bundle bundle) {
        this.f39478b = new WeakReference(activity);
        new WeakReference(bundle);
        this.f39477a = i7;
    }
}
