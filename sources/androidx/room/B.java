package androidx.room;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class B extends RemoteCallbackList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f17682a;

    public B(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f17682a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object cookie) {
        IMultiInstanceInvalidationCallback callback = (IMultiInstanceInvalidationCallback) iInterface;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(cookie, "cookie");
        this.f17682a.f17727b.remove((Integer) cookie);
    }
}
