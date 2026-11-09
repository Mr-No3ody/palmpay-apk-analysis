package p060e2;

import Gb.Q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import p075f2.b;
import p075f2.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f35994d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f35995e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f35997b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f35996a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f35998c = "";

    public a(Class cls) {
        this.f35997b = cls;
        c.a();
        Set set = (Set) c.f36374c.get(cls);
        for (b bVar : set == null ? Collections.EMPTY_SET : set) {
            int i7 = bVar.f36365a;
            Pattern pattern = b.f36364h;
            if (i7 == 6) {
                this.f35996a.add(bVar);
            }
        }
        Collections.sort(this.f35996a, new Q(13));
    }
}
