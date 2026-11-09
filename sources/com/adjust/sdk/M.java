package com.adjust.sdk;

import N8.q0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityHandler f19328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f19329b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19330c = 0;

    public M(ActivityHandler activityHandler) {
        this.f19328a = activityHandler;
    }

    public final void a(Runnable runnable, String str) {
        if (this.f19330c != 3) {
            runnable.run();
        } else {
            this.f19328a.getAdjustConfig().getLogger().debug(q0.k("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            this.f19329b.add(runnable);
        }
    }

    public final void b(String str, IRunActivityHandler iRunActivityHandler) {
        int i7 = this.f19330c;
        ActivityHandler activityHandler = this.f19328a;
        if (i7 != 3) {
            iRunActivityHandler.run(activityHandler);
        } else {
            activityHandler.getAdjustConfig().getLogger().debug(q0.k("Enqueuing \"", str, "\" action to be executed after first session delay ends"), new Object[0]);
            activityHandler.getAdjustConfig().preLaunchActions.preLaunchActionsArray.add(iRunActivityHandler);
        }
    }
}
