package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zaaa {
    private final Map zaa = Collections.synchronizedMap(new WeakHashMap());
    private final Map zab = Collections.synchronizedMap(new WeakHashMap());

    private final void zah(boolean z3, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = this.zaa;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = this.zab;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z3 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z3 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new ApiException(status));
            }
        }
    }

    public final void zaa(BasePendingResult basePendingResult, boolean z3) {
        this.zaa.put(basePendingResult, Boolean.valueOf(z3));
        basePendingResult.addStatusListener(new zay(this, basePendingResult));
    }

    public final void zab(TaskCompletionSource taskCompletionSource, boolean z3) {
        this.zab.put(taskCompletionSource, Boolean.valueOf(z3));
        taskCompletionSource.getTask().addOnCompleteListener(new zaz(this, taskCompletionSource));
    }

    public final boolean zac() {
        return (this.zaa.isEmpty() && this.zab.isEmpty()) ? false : true;
    }

    public final void zad() {
        zah(false, GoogleApiManager.zaa);
    }

    public final void zae(int i7, @Nullable String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i7 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i7 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        zah(true, new Status(20, sb2.toString()));
    }

    public final /* synthetic */ Map zaf() {
        return this.zaa;
    }

    public final /* synthetic */ Map zag() {
        return this.zab;
    }
}
