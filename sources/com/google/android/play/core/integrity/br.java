package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class br extends StandardIntegrityManager.StandardIntegrityToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y f22703b;

    public br(String str, y yVar) {
        this.f22702a = str;
        this.f22703b = yVar;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final Task<Integer> showDialog(Activity activity, int i7) {
        return this.f22703b.a(activity, i7);
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
    public final String token() {
        return this.f22702a;
    }
}
