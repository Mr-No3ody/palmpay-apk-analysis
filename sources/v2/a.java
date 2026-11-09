package v2;

import com.facebook.common.time.Clock;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Clock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f43065a = new a();

    @Override // com.facebook.common.time.Clock
    public final long now() {
        return System.currentTimeMillis();
    }
}
