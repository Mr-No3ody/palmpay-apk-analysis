package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public interface zabv {
    BaseImplementation.ApiMethodImpl zab(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl);

    BaseImplementation.ApiMethodImpl zac(@NonNull BaseImplementation.ApiMethodImpl apiMethodImpl);

    @Nullable
    ConnectionResult zad(@NonNull Api api);

    void zae();

    ConnectionResult zaf();

    ConnectionResult zag(long j6, TimeUnit timeUnit);

    void zah();

    boolean zai();

    boolean zaj();

    boolean zak(SignInConnectionListener signInConnectionListener);

    void zal();

    void zam();

    void zan(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr);
}
