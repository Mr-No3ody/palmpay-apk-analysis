package p014af;

import D4.f;
import Oe.a;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.alibaba.android.arouter.utils.Consts;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import p105h.b;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements CookieStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f11925b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f11926c;

    public c(Context context) {
        this.f11924a = context;
    }

    public final void a() {
        ReentrantLock reentrantLock = this.f11925b;
        reentrantLock.lock();
        if (this.f11926c == null) {
            this.f11926c = new b(new Ye.c(this.f11924a, "_nohttp_cookies_db.db", null, 2, 1), 4);
            this.f11926c.f(((StringBuilder) new a("expiry", (Object) (-1L)).f6830b).toString());
        }
        reentrantLock.unlock();
    }

    @Override // java.net.CookieStore
    public final void add(URI uri, HttpCookie httpCookie) {
        a();
        ReentrantLock reentrantLock = this.f11925b;
        reentrantLock.lock();
        if (uri != null && httpCookie != null) {
            try {
                try {
                    uri = new URI("http", uri.getHost(), uri.getPath(), null, null);
                } catch (URISyntaxException unused) {
                }
                this.f11926c.w(new a(uri, httpCookie));
                b();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void b() {
        b bVar = this.f11926c;
        bVar.getClass();
        SQLiteDatabase readableDatabase = ((Ye.c) bVar.f1592b).getReadableDatabase();
        Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT COUNT(_id) FROM cookies_table", null);
        int i7 = cursorRawQuery.moveToNext() ? cursorRawQuery.getInt(0) : 0;
        if (!cursorRawQuery.isClosed()) {
            cursorRawQuery.close();
        }
        f.d(readableDatabase);
        if (i7 > 8898) {
            ArrayList arrayListC = this.f11926c.c(null, Integer.toString(i7 - 8888));
            b bVar2 = this.f11926c;
            bVar2.getClass();
            StringBuilder sb2 = new StringBuilder("_id");
            sb2.append(" IN(");
            Iterator it = arrayListC.iterator();
            while (it.hasNext()) {
                long id2 = ((b) it.next()).getId();
                if (id2 > 0) {
                    sb2.append(',');
                    sb2.append(id2);
                }
            }
            sb2.append(')');
            if (',' == sb2.charAt(6)) {
                sb2.deleteCharAt(6);
            }
            bVar2.f(sb2.toString());
        }
    }

    @Override // java.net.CookieStore
    public final List get(URI uri) {
        a();
        ReentrantLock reentrantLock = this.f11925b;
        reentrantLock.lock();
        try {
            if (uri == null) {
                List list = Collections.EMPTY_LIST;
                reentrantLock.unlock();
                return list;
            }
            try {
                uri = new URI("http", uri.getHost(), uri.getPath(), null, null);
            } catch (URISyntaxException unused) {
            }
            a aVar = new a(15);
            StringBuilder sb2 = (StringBuilder) aVar.f6830b;
            String host = uri.getHost();
            if (!TextUtils.isEmpty(host)) {
                a aVar2 = new a("domain", host);
                String str = Consts.DOT + host;
                aVar2.c();
                aVar2.a(str, "domain");
                int iIndexOf = host.indexOf(Consts.DOT);
                int iLastIndexOf = host.lastIndexOf(Consts.DOT);
                if (iIndexOf > 0 && iLastIndexOf > iIndexOf) {
                    String strSubstring = host.substring(iIndexOf, host.length());
                    if (!TextUtils.isEmpty(strSubstring)) {
                        aVar2.c();
                        aVar2.a(strSubstring, "domain");
                    }
                }
                String string = ((StringBuilder) aVar2.f6830b).toString();
                sb2.delete(0, sb2.length());
                sb2.append((Object) string);
            }
            String path = uri.getPath();
            if (!TextUtils.isEmpty(path)) {
                a aVar3 = new a("path", path);
                StringBuilder sb3 = (StringBuilder) aVar3.f6830b;
                aVar3.c();
                aVar3.a("/", "path");
                aVar3.c();
                sb3.append("\"");
                sb3.append((CharSequence) "path");
                sb3.append("\" ");
                sb3.append("IS ");
                sb3.append("NULL");
                while (true) {
                    int iLastIndexOf2 = path.lastIndexOf("/");
                    if (iLastIndexOf2 <= 0) {
                        break;
                    }
                    path = path.substring(0, iLastIndexOf2);
                    aVar3.c();
                    aVar3.a(path, "path");
                }
                sb3.insert(0, (CharSequence) "(");
                sb3.append((Object) ')');
                if (sb2.length() > 0) {
                    sb2.append(" AND ");
                }
                sb2.append(aVar3);
            }
            String string2 = uri.toString();
            aVar.c();
            aVar.a(string2, "uri");
            ArrayList<a> arrayListC = this.f11926c.c(sb2.toString(), null);
            ArrayList arrayList = new ArrayList();
            for (a aVar4 : arrayListC) {
                long j6 = aVar4.f11919i;
                if (j6 == -1 || j6 >= System.currentTimeMillis()) {
                    arrayList.add(aVar4.a());
                }
            }
            reentrantLock.unlock();
            return arrayList;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.net.CookieStore
    public final List getCookies() {
        a();
        ReentrantLock reentrantLock = this.f11925b;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            for (a aVar : this.f11926c.c(null, null)) {
                long j6 = aVar.f11919i;
                if (j6 == -1 || j6 >= System.currentTimeMillis()) {
                    arrayList.add(aVar.a());
                }
            }
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.net.CookieStore
    public final List getURIs() {
        a();
        ReentrantLock reentrantLock = this.f11925b;
        reentrantLock.lock();
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f11926c.c(null, null).iterator();
            while (it.hasNext()) {
                String str = ((a) it.next()).f11912b;
                if (!TextUtils.isEmpty(str)) {
                    try {
                        arrayList.add(new URI(str));
                    } catch (Throwable th) {
                        G8.a.e("w", "", th);
                        this.f11926c.f("uri=" + str);
                    }
                }
            }
            reentrantLock.unlock();
            return arrayList;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.net.CookieStore
    public final boolean remove(URI uri, HttpCookie httpCookie) {
        a();
        ReentrantLock reentrantLock = this.f11925b;
        reentrantLock.lock();
        if (httpCookie == null) {
            reentrantLock.unlock();
            return true;
        }
        try {
            a aVar = new a("name", httpCookie.getName());
            StringBuilder sb2 = (StringBuilder) aVar.f6830b;
            String domain = httpCookie.getDomain();
            if (!TextUtils.isEmpty(domain)) {
                if (sb2.length() > 0) {
                    sb2.append(" AND ");
                }
                aVar.a(domain, "domain");
            }
            String path = httpCookie.getPath();
            if (!TextUtils.isEmpty(path)) {
                if (path.length() > 1 && path.endsWith("/")) {
                    path = path.substring(0, path.length() - 1);
                }
                if (sb2.length() > 0) {
                    sb2.append(" AND ");
                }
                aVar.a(path, "path");
            }
            return this.f11926c.f(sb2.toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.net.CookieStore
    public final boolean removeAll() {
        a();
        ReentrantLock reentrantLock = this.f11925b;
        reentrantLock.lock();
        try {
            return this.f11926c.f("1=1");
        } finally {
            reentrantLock.unlock();
        }
    }
}
