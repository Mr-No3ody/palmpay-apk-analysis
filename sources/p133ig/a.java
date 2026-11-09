package p133ig;

import N8.q0;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import p176lg.m;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f37592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f37593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f37594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f37595e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f37596f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f37597g;

    public a(String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f37591a = serialName;
        this.f37592b = z.f38935a;
        this.f37593c = new ArrayList();
        this.f37594d = new HashSet();
        this.f37595e = new ArrayList();
        this.f37596f = new ArrayList();
        this.f37597g = new ArrayList();
    }

    public static void a(a aVar, String elementName, m descriptor) {
        z annotations = z.f38935a;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (!aVar.f37594d.add(elementName)) {
            StringBuilder sbQ = q0.q("Element with name '", elementName, "' is already registered in ");
            sbQ.append(aVar.f37591a);
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        aVar.f37593c.add(elementName);
        aVar.f37595e.add(descriptor);
        aVar.f37596f.add(annotations);
        aVar.f37597g.add(false);
    }
}
