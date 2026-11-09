package org.greenrobot.eventbus.android;

import Z4.a;

/* JADX INFO: loaded from: classes4.dex */
public class AndroidComponentsImpl {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AndroidComponentsImpl f41046c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f41047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.growingio.android.circler.a f41048b;

    static {
        AndroidComponentsImpl androidComponentsImpl = null;
        if (G8.a.G()) {
            try {
                androidComponentsImpl = (AndroidComponentsImpl) AndroidComponentsImpl.class.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
            }
        }
        f41046c = androidComponentsImpl;
    }

    public AndroidComponentsImpl() {
        a aVar = new a(3);
        com.growingio.android.circler.a aVar2 = new com.growingio.android.circler.a(3);
        this.f41047a = aVar;
        this.f41048b = aVar2;
    }
}
