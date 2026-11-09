package com.google.android.play.core.integrity;

import com.alibaba.android.arouter.utils.Consts;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class IntegrityServiceException extends ApiException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f22606a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntegrityServiceException(int i7, Throwable th) {
        super(new Status(i7, "Integrity API error (" + i7 + "): " + com.google.android.play.core.integrity.model.a.a(i7) + Consts.DOT));
        Locale locale = Locale.ROOT;
        if (i7 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f22606a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f22606a;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
