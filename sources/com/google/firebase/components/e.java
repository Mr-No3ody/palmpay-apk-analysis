package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.inject.Provider;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22908c;

    public /* synthetic */ e(int i7, Object obj, Object obj2) {
        this.f22906a = i7;
        this.f22908c = obj;
        this.f22907b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22906a) {
            case 0:
                ((OptionalProvider) this.f22908c).set((Provider) this.f22907b);
                break;
            case 1:
                ((LazySet) this.f22908c).add((Provider) this.f22907b);
                break;
            default:
                EventBus.lambda$publish$0((Map.Entry) this.f22908c, (Event) this.f22907b);
                break;
        }
    }
}
