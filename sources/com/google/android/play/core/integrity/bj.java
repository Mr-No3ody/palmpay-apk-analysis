package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final class bj extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bk f22684a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, String str, long j6) {
        super(str, j6);
        this.f22684a = bkVar;
    }

    @Override // com.google.android.play.core.integrity.y
    public final Task b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.f22684a.f22687e);
        return this.f22684a.f22685c.c(activity, bundle);
    }
}
