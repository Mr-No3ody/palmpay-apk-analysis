package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Z;
import androidx.lifecycle.AbstractC1205o;
import com.bumptech.glide.p;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h implements RequestManagerTreeNode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21046b;

    public h(RequestManagerRetriever$RequestManagerFactory requestManagerRetriever$RequestManagerFactory) {
        this.f21045a = new HashMap();
        this.f21046b = requestManagerRetriever$RequestManagerFactory;
    }

    public void a(Z z3, HashSet hashSet) {
        List listF = z3.f17069c.f();
        int size = listF.size();
        for (int i7 = 0; i7 < size; i7++) {
            Fragment fragment = (Fragment) listF.get(i7);
            a(fragment.getChildFragmentManager(), hashSet);
            AbstractC1205o lifecycle = fragment.getLifecycle();
            h hVar = (h) this.f21046b;
            hVar.getClass();
            J1.o.a();
            p pVar = (p) ((HashMap) hVar.f21045a).get(lifecycle);
            if (pVar != null) {
                hashSet.add(pVar);
            }
        }
    }

    public p b(Context context, com.bumptech.glide.b bVar, AbstractC1205o abstractC1205o, Z z3, boolean z8) {
        J1.o.a();
        J1.o.a();
        HashMap map = (HashMap) this.f21045a;
        p pVar = (p) map.get(abstractC1205o);
        if (pVar != null) {
            return pVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(abstractC1205o);
        p pVarBuild = ((RequestManagerRetriever$RequestManagerFactory) this.f21046b).build(bVar, lifecycleLifecycle, new h(this, z3), context);
        map.put(abstractC1205o, pVarBuild);
        lifecycleLifecycle.addListener(new g(this, abstractC1205o));
        if (z8) {
            pVarBuild.onStart();
        }
        return pVarBuild;
    }

    @Override // com.bumptech.glide.manager.RequestManagerTreeNode
    public Set getDescendants() {
        HashSet hashSet = new HashSet();
        a((Z) this.f21045a, hashSet);
        return hashSet;
    }

    public h(h hVar, Z z3) {
        this.f21046b = hVar;
        this.f21045a = z3;
    }
}
