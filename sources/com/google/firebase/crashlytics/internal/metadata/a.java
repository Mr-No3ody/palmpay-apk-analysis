package com.google.firebase.crashlytics.internal.metadata;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22962b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f22961a = i7;
        this.f22962b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22961a) {
            case 0:
                ((UserMetadata.SerializeableKeysMap) this.f22962b).lambda$scheduleSerializationTaskIfNeeded$0();
                break;
            default:
                ((UserMetadata) this.f22962b).serializeUserDataIfNeeded();
                break;
        }
    }
}
