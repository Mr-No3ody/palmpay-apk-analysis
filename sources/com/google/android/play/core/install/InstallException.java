package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.install.model.InstallErrorCode;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class InstallException extends ApiException {
    public InstallException(@InstallErrorCode int i7) {
        super(new Status(i7, String.format(Locale.getDefault(), "Install Error(%d): %s", Integer.valueOf(i7), com.google.android.play.core.install.model.zza.zza(i7))));
        if (i7 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }

    @InstallErrorCode
    public int getErrorCode() {
        return super.getStatusCode();
    }
}
