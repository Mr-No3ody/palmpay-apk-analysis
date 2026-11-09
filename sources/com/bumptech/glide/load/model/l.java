package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Key {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Headers f20845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f20846c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f20847d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public URL f20849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile byte[] f20850g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20851h;

    public l(URL url) {
        o oVar = Headers.f20819a;
        J1.g.c(url, "Argument must not be null");
        this.f20846c = url;
        this.f20847d = null;
        J1.g.c(oVar, "Argument must not be null");
        this.f20845b = oVar;
    }

    public final String a() {
        String str = this.f20847d;
        if (str != null) {
            return str;
        }
        URL url = this.f20846c;
        J1.g.c(url, "Argument must not be null");
        return url.toString();
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f20848e)) {
            String string = this.f20847d;
            if (TextUtils.isEmpty(string)) {
                URL url = this.f20846c;
                J1.g.c(url, "Argument must not be null");
                string = url.toString();
            }
            this.f20848e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f20848e;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (a().equals(lVar.a()) && this.f20845b.equals(lVar.f20845b)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        if (this.f20851h == 0) {
            int iHashCode = a().hashCode();
            this.f20851h = iHashCode;
            this.f20851h = this.f20845b.hashCode() + (iHashCode * 31);
        }
        return this.f20851h;
    }

    public final String toString() {
        return a();
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        if (this.f20850g == null) {
            this.f20850g = a().getBytes(Key.f20507a);
        }
        messageDigest.update(this.f20850g);
    }

    public l(String str) {
        this(str, Headers.f20819a);
    }

    public l(String str, Headers headers) {
        this.f20846c = null;
        if (!TextUtils.isEmpty(str)) {
            this.f20847d = str;
            J1.g.c(headers, "Argument must not be null");
            this.f20845b = headers;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
