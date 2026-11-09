package com.nimbusds.jose.shaded.gson.stream;

import V5.g;
import com.horcrux.svg.d0;
import com.nimbusds.jose.shaded.gson.s;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f23693a;

    public static void a(b bVar) throws IOException {
        if (bVar instanceof g) {
            g gVar = (g) bVar;
            gVar.E(5);
            Map.Entry entry = (Map.Entry) ((Iterator) gVar.I()).next();
            gVar.K(entry.getValue());
            gVar.K(new s((String) entry.getKey()));
            return;
        }
        int iD = bVar.f23702i;
        if (iD == 0) {
            iD = bVar.d();
        }
        if (iD == 13) {
            bVar.f23702i = 9;
            return;
        }
        if (iD == 12) {
            bVar.f23702i = 8;
        } else {
            if (iD == 14) {
                bVar.f23702i = 10;
                return;
            }
            throw new IllegalStateException("Expected a name but was " + d0.u(bVar.w()) + bVar.l());
        }
    }
}
