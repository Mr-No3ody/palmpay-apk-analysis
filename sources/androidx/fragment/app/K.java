package androidx.fragment.app;

import android.os.Handler;
import androidx.appcompat.app.AbstractActivityC0837o;

/* JADX INFO: loaded from: classes.dex */
public abstract class K extends H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f17025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final E f17026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f17027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1162a0 f17028d;

    public K(AbstractActivityC0837o abstractActivityC0837o) {
        Handler handler = new Handler();
        this.f17028d = new C1162a0();
        this.f17025a = abstractActivityC0837o;
        this.f17026b = abstractActivityC0837o;
        this.f17027c = handler;
    }
}
