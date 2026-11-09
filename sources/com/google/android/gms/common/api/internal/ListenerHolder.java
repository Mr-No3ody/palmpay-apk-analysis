package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class ListenerHolder<L> {
    private final Executor zaa;

    @Nullable
    private volatile ListenerKey zab;

    @KeepForSdk
    public static final class ListenerKey<L> {
        private final Object zaa;
        private final String zab;

        @KeepForSdk
        public ListenerKey(L l5, String str) {
            this.zaa = l5;
            this.zab = str;
        }

        @KeepForSdk
        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListenerKey)) {
                return false;
            }
            ListenerKey listenerKey = (ListenerKey) obj;
            return this.zaa == listenerKey.zaa && this.zab.equals(listenerKey.zab);
        }

        @KeepForSdk
        public int hashCode() {
            return this.zab.hashCode() + (System.identityHashCode(this.zaa) * 31);
        }

        @NonNull
        @KeepForSdk
        public String toIdString() {
            int iIdentityHashCode = System.identityHashCode(this.zaa);
            String str = this.zab;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
            sb2.append(str);
            sb2.append("@");
            sb2.append(iIdentityHashCode);
            return sb2.toString();
        }

        public final /* synthetic */ Object zaa() {
            return this.zaa;
        }
    }

    @KeepForSdk
    public interface Notifier<L> {
        @KeepForSdk
        void notifyListener(@NonNull L l5);

        @KeepForSdk
        void onNotifyListenerFailed();
    }

    @KeepForSdk
    public ListenerHolder(@NonNull Looper looper, @NonNull L l5, @NonNull String str) {
        this.zaa = new HandlerExecutor(looper);
        this.zab = new ListenerKey(Preconditions.checkNotNull(l5, "Listener must not be null"), Preconditions.checkNotEmpty(str));
    }

    @KeepForSdk
    public void clear() {
        this.zab = null;
    }

    @Nullable
    @KeepForSdk
    public ListenerKey<L> getListenerKey() {
        return this.zab;
    }

    @KeepForSdk
    public boolean hasListener() {
        return this.zab != null;
    }

    @KeepForSdk
    public void notifyListener(@NonNull final Notifier<? super L> notifier) {
        Preconditions.checkNotNull(notifier, "Notifier must not be null");
        this.zaa.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.zabw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zaa.zaa(notifier);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zaa(Notifier notifier) {
        ListenerKey listenerKey = this.zab;
        if (listenerKey == null) {
            notifier.onNotifyListenerFailed();
            return;
        }
        try {
            notifier.notifyListener(listenerKey.zaa());
        } catch (RuntimeException e10) {
            notifier.onNotifyListenerFailed();
            throw e10;
        }
    }

    @KeepForSdk
    public ListenerHolder(@NonNull Executor executor, @NonNull L l5, @NonNull String str) {
        this.zaa = (Executor) Preconditions.checkNotNull(executor, "Executor must not be null");
        this.zab = new ListenerKey(Preconditions.checkNotNull(l5, "Listener must not be null"), Preconditions.checkNotEmpty(str));
    }
}
