package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1193c extends a0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Application f17439d;

    public AbstractC1193c(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f17439d = application;
    }
}
