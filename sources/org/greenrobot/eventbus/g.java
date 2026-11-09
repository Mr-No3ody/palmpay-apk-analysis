package org.greenrobot.eventbus;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f41080d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f41081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f41082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f41083c;

    public static g a(l lVar, Object obj) {
        ArrayList arrayList = f41080d;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                if (size <= 0) {
                    g gVar = new g();
                    gVar.f41081a = obj;
                    gVar.f41082b = lVar;
                    return gVar;
                }
                g gVar2 = (g) arrayList.remove(size - 1);
                gVar2.f41081a = obj;
                gVar2.f41082b = lVar;
                gVar2.f41083c = null;
                return gVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
