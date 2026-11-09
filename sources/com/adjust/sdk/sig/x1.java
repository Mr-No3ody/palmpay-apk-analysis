package com.adjust.sdk.sig;

import com.adjust.sdk.AdjustConfig;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f19524a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19525b;

    public x1(Map map) {
        this.f19525b = AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
    }

    public final void a(String str) {
        if (this.f19525b) {
            this.f19524a.format(new Date(System.currentTimeMillis()));
        }
    }
}
