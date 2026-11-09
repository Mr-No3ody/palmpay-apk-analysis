package p014af;

import android.text.TextUtils;
import androidx.camera.video.u;
import java.net.HttpCookie;
import java.net.URI;
import p105h.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11911a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f11918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11919i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f11920j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f11921k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11922l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11923m;

    public a(URI uri, HttpCookie httpCookie) {
        long jCurrentTimeMillis = -1;
        this.f11923m = 1;
        this.f11912b = uri.toString();
        this.f11913c = httpCookie.getName();
        this.f11914d = httpCookie.getValue();
        this.f11915e = httpCookie.getComment();
        this.f11916f = httpCookie.getCommentURL();
        this.f11917g = httpCookie.getDiscard();
        this.f11918h = httpCookie.getDomain();
        long maxAge = httpCookie.getMaxAge();
        if (maxAge == -1 || maxAge <= 0) {
            this.f11919i = jCurrentTimeMillis;
        } else {
            long jCurrentTimeMillis2 = System.currentTimeMillis() + (maxAge * 1000);
            this.f11919i = jCurrentTimeMillis2;
            if (jCurrentTimeMillis2 < 0) {
                String str = p226og.b.f40542a;
                jCurrentTimeMillis = System.currentTimeMillis() + 3153600000000L;
                this.f11919i = jCurrentTimeMillis;
            }
        }
        String path = httpCookie.getPath();
        this.f11920j = path;
        if (!TextUtils.isEmpty(path) && this.f11920j.length() > 1 && this.f11920j.endsWith("/")) {
            this.f11920j = u.f(1, 0, this.f11920j);
        }
        this.f11921k = httpCookie.getPortlist();
        this.f11922l = httpCookie.getSecure();
        this.f11923m = httpCookie.getVersion();
    }

    public final HttpCookie a() {
        HttpCookie httpCookie = new HttpCookie(this.f11913c, this.f11914d);
        httpCookie.setComment(this.f11915e);
        httpCookie.setCommentURL(this.f11916f);
        httpCookie.setDiscard(this.f11917g);
        httpCookie.setDomain(this.f11918h);
        long j6 = this.f11919i;
        if (j6 == -1) {
            httpCookie.setMaxAge(-1L);
        } else {
            httpCookie.setMaxAge((j6 - System.currentTimeMillis()) / 1000);
        }
        httpCookie.setPath(this.f11920j);
        httpCookie.setPortlist(this.f11921k);
        httpCookie.setSecure(this.f11922l);
        httpCookie.setVersion(this.f11923m);
        return httpCookie;
    }

    @Override // p105h.b
    public final long getId() {
        return this.f11911a;
    }
}
