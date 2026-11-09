package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.F;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
public final class zae extends zai {
    protected final BaseImplementation.ApiMethodImpl zaa;

    public zae(int i7, BaseImplementation.ApiMethodImpl apiMethodImpl) {
        super(i7);
        this.zaa = (BaseImplementation.ApiMethodImpl) Preconditions.checkNotNull(apiMethodImpl, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Status status) {
        try {
            this.zaa.setFailedResult(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@NonNull Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.zaa.setFailedResult(new Status(10, F.d(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage)));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(@NonNull zaaa zaaaVar, boolean z3) {
        zaaaVar.zaa(this.zaa, z3);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(zabk zabkVar) throws DeadObjectException {
        try {
            this.zaa.run(zabkVar.zaf());
        } catch (RuntimeException e10) {
            zae(e10);
        }
    }
}
