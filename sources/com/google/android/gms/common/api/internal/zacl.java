package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
@WorkerThread
public interface zacl {
    void zaa(ConnectionResult connectionResult);

    void zab(int i7);

    void zac(@Nullable IAccountAccessor iAccountAccessor, @Nullable Set set);
}
