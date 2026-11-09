package com.nimbusds.jose.shaded.gson.internal;

import Gb.Q;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Q f23659j = new Q(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f23660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f23662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f23665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f23666g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f23667i;

    public l(boolean z3) {
        Q q10 = f23659j;
        this.f23663d = 0;
        this.f23664e = 0;
        this.f23660a = q10;
        this.f23661b = z3;
        this.f23665f = new k(z3);
    }

    public final k a(Object obj, boolean z3) {
        int iCompareTo;
        k kVar;
        k kVar2 = this.f23662c;
        Q q10 = f23659j;
        Comparator comparator = this.f23660a;
        if (kVar2 != null) {
            Comparable comparable = comparator == q10 ? (Comparable) obj : null;
            while (true) {
                Object obj2 = kVar2.f23655f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return kVar2;
                }
                k kVar3 = iCompareTo < 0 ? kVar2.f23651b : kVar2.f23652c;
                if (kVar3 == null) {
                    break;
                }
                kVar2 = kVar3;
            }
        } else {
            iCompareTo = 0;
        }
        k kVar4 = kVar2;
        if (!z3) {
            return null;
        }
        k kVar5 = this.f23665f;
        if (kVar4 != null) {
            kVar = new k(this.f23661b, kVar4, obj, kVar5, kVar5.f23654e);
            if (iCompareTo < 0) {
                kVar4.f23651b = kVar;
            } else {
                kVar4.f23652c = kVar;
            }
            b(kVar4, true);
        } else {
            if (comparator == q10 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            kVar = new k(this.f23661b, kVar4, obj, kVar5, kVar5.f23654e);
            this.f23662c = kVar;
        }
        this.f23663d++;
        this.f23664e++;
        return kVar;
    }

    public final void b(k kVar, boolean z3) {
        while (kVar != null) {
            k kVar2 = kVar.f23651b;
            k kVar3 = kVar.f23652c;
            int i7 = kVar2 != null ? kVar2.f23658j : 0;
            int i10 = kVar3 != null ? kVar3.f23658j : 0;
            int i11 = i7 - i10;
            if (i11 == -2) {
                k kVar4 = kVar3.f23651b;
                k kVar5 = kVar3.f23652c;
                int i12 = (kVar4 != null ? kVar4.f23658j : 0) - (kVar5 != null ? kVar5.f23658j : 0);
                if (i12 == -1 || (i12 == 0 && !z3)) {
                    e(kVar);
                } else {
                    f(kVar3);
                    e(kVar);
                }
                if (z3) {
                    return;
                }
            } else if (i11 == 2) {
                k kVar6 = kVar2.f23651b;
                k kVar7 = kVar2.f23652c;
                int i13 = (kVar6 != null ? kVar6.f23658j : 0) - (kVar7 != null ? kVar7.f23658j : 0);
                if (i13 == 1 || (i13 == 0 && !z3)) {
                    f(kVar);
                } else {
                    e(kVar2);
                    f(kVar);
                }
                if (z3) {
                    return;
                }
            } else if (i11 == 0) {
                kVar.f23658j = i7 + 1;
                if (z3) {
                    return;
                }
            } else {
                kVar.f23658j = Math.max(i7, i10) + 1;
                if (!z3) {
                    return;
                }
            }
            kVar = kVar.f23650a;
        }
    }

    public final void c(k kVar, boolean z3) {
        k kVar2;
        k kVar3;
        int i7;
        if (z3) {
            k kVar4 = kVar.f23654e;
            kVar4.f23653d = kVar.f23653d;
            kVar.f23653d.f23654e = kVar4;
        }
        k kVar5 = kVar.f23651b;
        k kVar6 = kVar.f23652c;
        k kVar7 = kVar.f23650a;
        int i10 = 0;
        if (kVar5 == null || kVar6 == null) {
            if (kVar5 != null) {
                d(kVar, kVar5);
                kVar.f23651b = null;
            } else if (kVar6 != null) {
                d(kVar, kVar6);
                kVar.f23652c = null;
            } else {
                d(kVar, null);
            }
            b(kVar7, false);
            this.f23663d--;
            this.f23664e++;
            return;
        }
        if (kVar5.f23658j > kVar6.f23658j) {
            k kVar8 = kVar5.f23652c;
            while (true) {
                k kVar9 = kVar8;
                kVar3 = kVar5;
                kVar5 = kVar9;
                if (kVar5 == null) {
                    break;
                } else {
                    kVar8 = kVar5.f23652c;
                }
            }
        } else {
            k kVar10 = kVar6.f23651b;
            while (true) {
                kVar2 = kVar6;
                kVar6 = kVar10;
                if (kVar6 == null) {
                    break;
                } else {
                    kVar10 = kVar6.f23651b;
                }
            }
            kVar3 = kVar2;
        }
        c(kVar3, false);
        k kVar11 = kVar.f23651b;
        if (kVar11 != null) {
            i7 = kVar11.f23658j;
            kVar3.f23651b = kVar11;
            kVar11.f23650a = kVar3;
            kVar.f23651b = null;
        } else {
            i7 = 0;
        }
        k kVar12 = kVar.f23652c;
        if (kVar12 != null) {
            i10 = kVar12.f23658j;
            kVar3.f23652c = kVar12;
            kVar12.f23650a = kVar3;
            kVar.f23652c = null;
        }
        kVar3.f23658j = Math.max(i7, i10) + 1;
        d(kVar, kVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f23662c = null;
        this.f23663d = 0;
        this.f23664e++;
        k kVar = this.f23665f;
        kVar.f23654e = kVar;
        kVar.f23653d = kVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        k kVarA = null;
        if (obj != null) {
            try {
                kVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return kVarA != null;
    }

    public final void d(k kVar, k kVar2) {
        k kVar3 = kVar.f23650a;
        kVar.f23650a = null;
        if (kVar2 != null) {
            kVar2.f23650a = kVar3;
        }
        if (kVar3 == null) {
            this.f23662c = kVar2;
        } else if (kVar3.f23651b == kVar) {
            kVar3.f23651b = kVar2;
        } else {
            kVar3.f23652c = kVar2;
        }
    }

    public final void e(k kVar) {
        k kVar2 = kVar.f23651b;
        k kVar3 = kVar.f23652c;
        k kVar4 = kVar3.f23651b;
        k kVar5 = kVar3.f23652c;
        kVar.f23652c = kVar4;
        if (kVar4 != null) {
            kVar4.f23650a = kVar;
        }
        d(kVar, kVar3);
        kVar3.f23651b = kVar;
        kVar.f23650a = kVar3;
        int iMax = Math.max(kVar2 != null ? kVar2.f23658j : 0, kVar4 != null ? kVar4.f23658j : 0) + 1;
        kVar.f23658j = iMax;
        kVar3.f23658j = Math.max(iMax, kVar5 != null ? kVar5.f23658j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        j jVar = this.f23666g;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 0);
        this.f23666g = jVar2;
        return jVar2;
    }

    public final void f(k kVar) {
        k kVar2 = kVar.f23651b;
        k kVar3 = kVar.f23652c;
        k kVar4 = kVar2.f23651b;
        k kVar5 = kVar2.f23652c;
        kVar.f23651b = kVar5;
        if (kVar5 != null) {
            kVar5.f23650a = kVar;
        }
        d(kVar, kVar2);
        kVar2.f23652c = kVar;
        kVar.f23650a = kVar2;
        int iMax = Math.max(kVar3 != null ? kVar3.f23658j : 0, kVar5 != null ? kVar5.f23658j : 0) + 1;
        kVar.f23658j = iMax;
        kVar2.f23658j = Math.max(iMax, kVar4 != null ? kVar4.f23658j : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        k kVarA;
        if (obj != null) {
            try {
                kVarA = a(obj, false);
            } catch (ClassCastException unused) {
                kVarA = null;
            }
        } else {
            kVarA = null;
        }
        if (kVarA != null) {
            return kVarA.f23657i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        j jVar = this.f23667i;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.f23667i = jVar2;
        return jVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f23661b) {
            throw new NullPointerException("value == null");
        }
        k kVarA = a(obj, true);
        Object obj3 = kVarA.f23657i;
        kVarA.f23657i = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        k kVarA;
        if (obj != null) {
            try {
                kVarA = a(obj, false);
            } catch (ClassCastException unused) {
                kVarA = null;
            }
        } else {
            kVarA = null;
        }
        if (kVarA != null) {
            c(kVarA, true);
        }
        if (kVarA != null) {
            return kVarA.f23657i;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f23663d;
    }
}
