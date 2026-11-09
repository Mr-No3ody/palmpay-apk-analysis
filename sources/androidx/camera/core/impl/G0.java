package androidx.camera.core.impl;

import E.C0220z;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends B0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final E.N f13871i = new E.N(6);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13872j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13873k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f13874l = new ArrayList();

    public final void a(H0 h7) {
        Object objRetrieveOption;
        T t = h7.f13886g;
        int i7 = t.f13968c;
        S s3 = this.f13839b;
        if (i7 != -1) {
            this.f13873k = true;
            int i10 = s3.f13957c;
            Integer numValueOf = Integer.valueOf(i7);
            List list = H0.f13879i;
            if (list.indexOf(numValueOf) < list.indexOf(Integer.valueOf(i10))) {
                i7 = i10;
            }
            s3.f13957c = i7;
        }
        C0971c c0971c = T.f13965k;
        Object objRetrieveOption2 = C0993n.f14107f;
        C1000q0 c1000q0 = t.f13967b;
        try {
            objRetrieveOption2 = c1000q0.retrieveOption(c0971c);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) objRetrieveOption2;
        Objects.requireNonNull(range);
        Range range2 = C0993n.f14107f;
        if (!range.equals(range2)) {
            C0992m0 c0992m0 = s3.f13956b;
            C0971c c0971c2 = T.f13965k;
            c0992m0.getClass();
            try {
                objRetrieveOption = c0992m0.retrieveOption(c0971c2);
            } catch (IllegalArgumentException unused2) {
                objRetrieveOption = range2;
            }
            if (((Range) objRetrieveOption).equals(range2)) {
                s3.f13956b.insertOption(T.f13965k, range);
            } else {
                C0992m0 c0992m1 = s3.f13956b;
                C0971c c0971c3 = T.f13965k;
                Object objRetrieveOption3 = C0993n.f14107f;
                c0992m1.getClass();
                try {
                    objRetrieveOption3 = c0992m1.retrieveOption(c0971c3);
                } catch (IllegalArgumentException unused3) {
                }
                if (!((Range) objRetrieveOption3).equals(range)) {
                    this.f13872j = false;
                    p140j8.f.G("ValidatingBuilder");
                }
            }
        }
        int iB = t.b();
        if (iB != 0) {
            s3.getClass();
            if (iB != 0) {
                s3.f13956b.insertOption(UseCaseConfig.f13991W, Integer.valueOf(iB));
            }
        }
        int iC = t.c();
        if (iC != 0) {
            s3.getClass();
            if (iC != 0) {
                s3.f13956b.insertOption(UseCaseConfig.f13992a0, Integer.valueOf(iC));
            }
        }
        T t3 = h7.f13886g;
        s3.f13961g.f13941a.putAll((Map) t3.f13972g.f13941a);
        this.f13840c.addAll(h7.f13882c);
        this.f13841d.addAll(h7.f13883d);
        s3.a(t3.f13970e);
        this.f13842e.addAll(h7.f13884e);
        SessionConfig$ErrorListener sessionConfig$ErrorListener = h7.f13885f;
        if (sessionConfig$ErrorListener != null) {
            this.f13874l.add(sessionConfig$ErrorListener);
        }
        InputConfiguration inputConfiguration = h7.f13887h;
        if (inputConfiguration != null) {
            this.f13844g = inputConfiguration;
        }
        LinkedHashSet<C0987k> linkedHashSet = this.f13838a;
        linkedHashSet.addAll(h7.f13880a);
        HashSet hashSet = s3.f13955a;
        hashSet.addAll(Collections.unmodifiableList(t.f13966a));
        ArrayList arrayList = new ArrayList();
        for (C0987k c0987k : linkedHashSet) {
            arrayList.add(c0987k.f14094a);
            Iterator it = c0987k.f14095b.iterator();
            while (it.hasNext()) {
                arrayList.add((AbstractC0970b0) it.next());
            }
        }
        if (!arrayList.containsAll(hashSet)) {
            p140j8.f.G("ValidatingBuilder");
            this.f13872j = false;
        }
        C0987k c0987k2 = h7.f13881b;
        if (c0987k2 != null) {
            C0987k c0987k3 = this.f13845h;
            if (c0987k3 == c0987k2 || c0987k3 == null) {
                this.f13845h = c0987k2;
            } else {
                p140j8.f.G("ValidatingBuilder");
                this.f13872j = false;
            }
        }
        s3.c(c1000q0);
    }

    public final H0 b() {
        if (!this.f13872j) {
            throw new IllegalArgumentException("Unsupported session configuration combination");
        }
        ArrayList arrayList = new ArrayList(this.f13838a);
        E.N n10 = this.f13871i;
        if (n10.f1938b) {
            Collections.sort(arrayList, new androidx.camera.core.internal.compat.workaround.b(n10, 0));
        }
        return new H0(arrayList, new ArrayList(this.f13840c), new ArrayList(this.f13841d), new ArrayList(this.f13842e), this.f13839b.d(), !this.f13874l.isEmpty() ? new C0220z(this, 3) : null, this.f13844g, this.f13845h);
    }
}
