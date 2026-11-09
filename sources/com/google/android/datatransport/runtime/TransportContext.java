package com.google.android.datatransport.runtime;

import C0.G;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;
import p192n.c;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class TransportContext {

    @AutoValue.Builder
    public static abstract class Builder {
        public abstract TransportContext build();

        public abstract Builder setBackendName(String str);

        public abstract Builder setExtras(@Nullable byte[] bArr);

        @RestrictTo({c.f39801b})
        public abstract Builder setPriority(Priority priority);
    }

    public static Builder builder() {
        return new AutoValue_TransportContext.Builder().setPriority(Priority.DEFAULT);
    }

    public abstract String getBackendName();

    @Nullable
    public abstract byte[] getExtras();

    @RestrictTo({c.f39801b})
    public abstract Priority getPriority();

    public boolean shouldUploadClientHealthMetrics() {
        return getExtras() != null;
    }

    public final String toString() {
        String backendName = getBackendName();
        Priority priority = getPriority();
        String strEncodeToString = getExtras() == null ? "" : Base64.encodeToString(getExtras(), 2);
        StringBuilder sb2 = new StringBuilder("TransportContext(");
        sb2.append(backendName);
        sb2.append(", ");
        sb2.append(priority);
        sb2.append(", ");
        return G.r(sb2, strEncodeToString, ")");
    }

    @RestrictTo({c.f39801b})
    public TransportContext withPriority(Priority priority) {
        return builder().setBackendName(getBackendName()).setPriority(priority).setExtras(getExtras()).build();
    }
}
