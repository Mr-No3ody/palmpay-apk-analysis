package androidx.activity;

import B6.RunnableC0085g;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Y;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.activity.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0821l extends kotlin.jvm.internal.o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.E f12038b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0821l(androidx.fragment.app.E e10, int i7) {
        super(0);
        this.f12037a = i7;
        this.f12038b = e10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f12037a) {
            case 0:
                androidx.fragment.app.E e10 = this.f12038b;
                return new Y(e10.getApplication(), e10, e10.getIntent() != null ? e10.getIntent().getExtras() : null);
            case 1:
                this.f12038b.reportFullyDrawn();
                return Unit.f38893a;
            case 2:
                androidx.fragment.app.E e11 = this.f12038b;
                return new v(((AbstractActivityC0822m) e11).reportFullyDrawnExecutor, new C0821l(e11, 1));
            default:
                androidx.fragment.app.E e12 = this.f12038b;
                I i7 = new I(new RunnableC0813d(e12, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
                        e12.getLifecycle().a(new E0.k(1, i7, e12));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0085g(28, e12, i7));
                    }
                }
                return i7;
        }
    }
}
