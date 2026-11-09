package androidx.core.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15952a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f15953b;

    public Q(Context context) {
        this.f15953b = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.f15953b;
        ArrayList arrayList = this.f15952a;
        int size = arrayList.size();
        try {
            for (Intent intentA = AbstractC1037f.a(context, componentName); intentA != null; intentA = AbstractC1037f.a(context, intentA.getComponent())) {
                arrayList.add(size, intentA);
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f15952a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f15953b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f15952a.iterator();
    }
}
