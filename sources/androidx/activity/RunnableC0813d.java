package androidx.activity;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.activity.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0813d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.E f12025b;

    public /* synthetic */ RunnableC0813d(androidx.fragment.app.E e10, int i7) {
        this.f12024a = i7;
        this.f12025b = e10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12024a) {
            case 0:
                androidx.fragment.app.E this$0 = this.f12025b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.invalidateMenu();
                return;
            default:
                androidx.fragment.app.E this$1 = this.f12025b;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e10) {
                    if (!Intrinsics.c(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e10;
                    }
                    return;
                } catch (NullPointerException e11) {
                    if (!Intrinsics.c(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e11;
                    }
                    return;
                }
        }
    }
}
