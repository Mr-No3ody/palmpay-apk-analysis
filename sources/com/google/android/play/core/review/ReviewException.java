package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class ReviewException extends ApiException {
    public ReviewException(int i7) {
        super(new Status(i7, String.format(Locale.getDefault(), "Review Error(%d): %s", Integer.valueOf(i7), com.google.android.play.core.review.model.zza.zza(i7))));
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}
