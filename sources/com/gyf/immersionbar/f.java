package com.gyf.immersionbar;

import android.app.Application;
import android.database.ContentObserver;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends ContentObserver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f23228d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f23229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Application f23230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f23231c;

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        ArrayList arrayList;
        super.onChange(z3);
        Application application = this.f23230b;
        if (application == null || application.getContentResolver() == null || (arrayList = this.f23229a) == null || arrayList.isEmpty()) {
            return;
        }
        int i7 = Settings.System.getInt(this.f23230b.getContentResolver(), "navigationbar_is_min", 0);
        l lVar = l.f23252a;
        if (i7 == 1) {
            lVar = l.f23253b;
        }
        Iterator it = this.f23229a.iterator();
        while (it.hasNext()) {
            ((ImmersionCallback) it.next()).onNavigationBarChange(i7 == 0, lVar);
        }
    }
}
