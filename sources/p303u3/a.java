package p303u3;

import com.facebook.react.jstasks.HeadlessJsTaskContext;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HeadlessJsTaskContext f42685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42686c;

    public /* synthetic */ a(HeadlessJsTaskContext headlessJsTaskContext, int i7, int i10) {
        this.f42684a = i10;
        this.f42685b = headlessJsTaskContext;
        this.f42686c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42684a) {
            case 0:
                this.f42685b.finishTask(this.f42686c);
                break;
            default:
                HeadlessJsTaskContext.finishTask$lambda$4(this.f42685b, this.f42686c);
                break;
        }
    }
}
