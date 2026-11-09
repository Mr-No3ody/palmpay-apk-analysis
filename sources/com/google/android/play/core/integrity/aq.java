package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class aq extends IntegrityTokenResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f22644b;

    public aq(String str, y yVar) {
        this.f22643a = str;
        this.f22644b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final Task<Integer> showDialog(Activity activity, int i7) {
        return this.f22644b.a(activity, i7);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f22643a;
    }
}
