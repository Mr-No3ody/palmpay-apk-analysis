package com.google.android.play.core.integrity;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
abstract class bm extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f22690f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(@Nullable bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f22690f = bnVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(Exception exc) {
        if (!(exc instanceof com.google.android.play.integrity.internal.af)) {
            super.a(exc);
        } else if (bn.k(this.f22690f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
