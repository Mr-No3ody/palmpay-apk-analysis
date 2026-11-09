package com.horcrux.svg;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.horcrux.svg.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1417n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList f23532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f23533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static com.abedelazizshe.lightcompressorlibrary.config.b f23534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static com.abedelazizshe.lightcompressorlibrary.config.b f23535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static com.abedelazizshe.lightcompressorlibrary.config.b f23536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static com.abedelazizshe.lightcompressorlibrary.config.b f23537i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.abedelazizshe.lightcompressorlibrary.config.b f23539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f23540c;

    public C1417n(int i7, com.abedelazizshe.lightcompressorlibrary.config.b bVar, double d2) {
        this.f23538a = i7;
        this.f23539b = bVar;
        this.f23540c = d2;
    }

    public static double a(int i7) {
        com.abedelazizshe.lightcompressorlibrary.config.b bVar = f23536h;
        double dAtan2 = Math.atan2(bVar.f19295b, bVar.f19294a) * 57.29577951308232d;
        com.abedelazizshe.lightcompressorlibrary.config.b bVar2 = f23537i;
        double dAtan3 = Math.atan2(bVar2.f19295b, bVar2.f19294a) * 57.29577951308232d;
        int i10 = androidx.camera.camera2.internal.F.i(i7);
        if (i10 == 0) {
            return dAtan3;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return 0.0d;
            }
            return dAtan2;
        }
        if (Math.abs(dAtan2 - dAtan3) > 180.0d) {
            dAtan2 += 360.0d;
        }
        return (dAtan2 + dAtan3) / 2.0d;
    }

    public static boolean b(com.abedelazizshe.lightcompressorlibrary.config.b bVar) {
        return bVar.f19294a == 0.0d && bVar.f19295b == 0.0d;
    }

    public static com.abedelazizshe.lightcompressorlibrary.config.b c(com.abedelazizshe.lightcompressorlibrary.config.b bVar, com.abedelazizshe.lightcompressorlibrary.config.b bVar2) {
        return new com.abedelazizshe.lightcompressorlibrary.config.b(bVar2.f19294a - bVar.f19294a, bVar2.f19295b - bVar.f19295b);
    }
}
