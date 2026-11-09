package P5;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final URI f6937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final T5.d f6938j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final URI f6939o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Z5.b f6940p;
    public final Z5.b t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final List f6941v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f6942w;

    public b(k kVar, f fVar, String str, HashSet hashSet, URI uri, T5.d dVar, URI uri2, Z5.b bVar, Z5.b bVar2, LinkedList linkedList, String str2, HashMap map, Z5.b bVar3) {
        super(kVar, fVar, str, hashSet, map, bVar3);
        this.f6937i = uri;
        this.f6938j = dVar;
        this.f6939o = uri2;
        this.f6940p = bVar;
        this.t = bVar2;
        if (linkedList != null) {
            this.f6941v = Collections.unmodifiableList(new ArrayList(linkedList));
        } else {
            this.f6941v = null;
        }
        this.f6942w = str2;
    }
}
