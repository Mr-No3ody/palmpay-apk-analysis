package p004a1;

import android.app.job.JobWorkItem;
import android.content.Intent;
import dalvik.system.InMemoryDexClassLoader;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ JobWorkItem d(Intent intent) {
        return new JobWorkItem(intent);
    }

    public static /* bridge */ /* synthetic */ InMemoryDexClassLoader k(Object obj) {
        return (InMemoryDexClassLoader) obj;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return InMemoryDexClassLoader.class;
    }
}
