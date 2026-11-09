package com.didi.drouter.router;

import Me.AbstractC0456a;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1205o;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0456a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f21137i = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Uri f21138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f21139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC1205o f21140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f21141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f21142g;

    public static d l(String str) {
        Uri uri = str == null ? Uri.EMPTY : Uri.parse(str);
        d dVar = new d(4);
        dVar.f21138c = uri;
        dVar.f21142g = String.valueOf(f21137i.getAndIncrement());
        ((Bundle) dVar.f5949a).putString("router_request_build_uri", uri.toString());
        return dVar;
    }
}
