package com.google.android.gms.common.api.internal;

import M.f;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zal {
    private int zad;
    private final f zab = new f(0);
    private final TaskCompletionSource zac = new TaskCompletionSource();
    private boolean zae = false;
    private final f zaa = new f(0);

    public zal(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zaa.put(((HasApiKey) it.next()).getApiKey(), null);
        }
        this.zad = this.zaa.f5695c;
    }

    public final Set zaa() {
        return this.zaa.keySet();
    }

    public final Task zab() {
        return this.zac.getTask();
    }

    public final void zac(ApiKey apiKey, ConnectionResult connectionResult, @Nullable String str) {
        f fVar = this.zaa;
        fVar.put(apiKey, connectionResult);
        f fVar2 = this.zab;
        fVar2.put(apiKey, str);
        this.zad--;
        if (!connectionResult.isSuccess()) {
            this.zae = true;
        }
        if (this.zad == 0) {
            if (!this.zae) {
                this.zac.setResult(fVar2);
            } else {
                this.zac.setException(new AvailabilityException(fVar));
            }
        }
    }
}
