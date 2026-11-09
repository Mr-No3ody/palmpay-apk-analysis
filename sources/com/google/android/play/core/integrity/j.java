package com.google.android.play.core.integrity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.ApiException;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements k {
    @Override // com.google.android.play.core.integrity.k
    @Nullable
    public final ApiException a(Bundle bundle) {
        int i7 = bundle.getInt("error");
        if (i7 == 0) {
            return null;
        }
        return new StandardIntegrityException(i7, null);
    }
}
