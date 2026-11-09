package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class TaskApiCall<A extends Api.AnyClient, ResultT> {

    @Nullable
    private final Feature[] zaa;
    private final boolean zab;
    private final int zac;

    @KeepForSdk
    public static class Builder<A extends Api.AnyClient, ResultT> {
        private RemoteCall zaa;
        private Feature[] zac;
        private boolean zab = true;
        private int zad = 0;

        private Builder() {
        }

        @NonNull
        @KeepForSdk
        public TaskApiCall<A, ResultT> build() {
            Preconditions.checkArgument(this.zaa != null, "execute parameter required");
            return new zacn(this, this.zac, this.zab, this.zad);
        }

        @NonNull
        @KeepForSdk
        @Deprecated
        public Builder<A, ResultT> execute(@NonNull final BiConsumer<A, TaskCompletionSource<ResultT>> biConsumer) {
            this.zaa = new RemoteCall() { // from class: com.google.android.gms.common.api.internal.zaco
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final /* synthetic */ void accept(Object obj, Object obj2) {
                    biConsumer.accept((Api.AnyClient) obj, (TaskCompletionSource) obj2);
                }
            };
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> run(@NonNull RemoteCall<A, TaskCompletionSource<ResultT>> remoteCall) {
            this.zaa = remoteCall;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> setAutoResolveMissingFeatures(boolean z3) {
            this.zab = z3;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> setFeatures(@NonNull Feature... featureArr) {
            this.zac = featureArr;
            return this;
        }

        @NonNull
        @KeepForSdk
        public Builder<A, ResultT> setMethodKey(int i7) {
            this.zad = i7;
            return this;
        }

        public final /* synthetic */ RemoteCall zaa() {
            return this.zaa;
        }

        public /* synthetic */ Builder(byte[] bArr) {
        }
    }

    @KeepForSdk
    @Deprecated
    public TaskApiCall() {
        this.zaa = null;
        this.zab = false;
        this.zac = 0;
    }

    @NonNull
    @KeepForSdk
    public static <A extends Api.AnyClient, ResultT> Builder<A, ResultT> builder() {
        return new Builder<>(null);
    }

    @KeepForSdk
    public abstract void doExecute(@NonNull A a3, @NonNull TaskCompletionSource<ResultT> taskCompletionSource) throws RemoteException;

    @KeepForSdk
    public boolean shouldAutoResolveMissingFeatures() {
        return this.zab;
    }

    @Nullable
    public final Feature[] zaa() {
        return this.zaa;
    }

    public final int zab() {
        return this.zac;
    }

    @KeepForSdk
    public TaskApiCall(@Nullable Feature[] featureArr, boolean z3, int i7) {
        this.zaa = featureArr;
        boolean z8 = false;
        if (featureArr != null && z3) {
            z8 = true;
        }
        this.zab = z8;
        this.zac = i7;
    }
}
