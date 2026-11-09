package com.facebook.soloader;

import java.util.zip.ZipEntry;

/* JADX INFO: loaded from: classes.dex */
public final class k extends B implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZipEntry f21892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f21893d;

    public k(String str, ZipEntry zipEntry, int i7) {
        super(str, String.valueOf(zipEntry.getCrc()));
        this.f21892c = zipEntry;
        this.f21893d = i7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f21850a.compareTo(((k) obj).f21850a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.f21892c.equals(kVar.f21892c) && this.f21893d == kVar.f21893d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21892c.hashCode() + (this.f21893d * 31);
    }
}
