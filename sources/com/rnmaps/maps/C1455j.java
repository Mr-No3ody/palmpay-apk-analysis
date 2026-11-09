package com.rnmaps.maps;

import android.graphics.Bitmap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.rnmaps.maps.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1455j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BitmapDescriptor f24936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Bitmap f24937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakHashMap f24938c = new WeakHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24939d = false;

    public final synchronized void a(BitmapDescriptor bitmapDescriptor, Bitmap bitmap) {
        this.f24936a = bitmapDescriptor;
        this.f24937b = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        if (this.f24938c.isEmpty()) {
            return;
        }
        for (Map.Entry entry : this.f24938c.entrySet()) {
            if (entry.getKey() != null) {
                MapMarker mapMarker = (MapMarker) entry.getKey();
                mapMarker.f24757B = bitmapDescriptor;
                mapMarker.f24759C = bitmap;
                mapMarker.f(true);
            }
        }
    }
}
