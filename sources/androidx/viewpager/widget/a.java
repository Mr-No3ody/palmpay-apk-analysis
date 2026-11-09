package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataSetObservable f18253a = new DataSetObservable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DataSetObserver f18254b;

    public abstract void a(ViewPager viewPager, int i7, Object obj);

    public abstract int c();

    public int d() {
        return -1;
    }

    public CharSequence e(int i7) {
        return null;
    }

    public float f() {
        return 1.0f;
    }

    public abstract Object g(ViewPager viewPager, int i7);

    public abstract boolean h(View view, Object obj);

    public final void i() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f18254b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f18253a.notifyChanged();
    }

    public void j(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable k() {
        return null;
    }

    public void b() {
    }

    public void l(Object obj) {
    }

    public void m(ViewPager viewPager) {
    }
}
