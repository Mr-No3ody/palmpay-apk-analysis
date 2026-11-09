package androidx.core.app;

import android.content.ComponentName;
import android.support.v4.app.INotificationSideChannel;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f15928a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public INotificationSideChannel f15930c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15929b = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f15931d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15932e = 0;

    public K(ComponentName componentName) {
        this.f15928a = componentName;
    }
}
