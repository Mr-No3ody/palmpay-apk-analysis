package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class Q extends Ff.g implements Function2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f38912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f38913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f38916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f38917g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f38918i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Iterator f38919j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(int i7, int i10, Iterator it, Continuation continuation) {
        super(2, continuation);
        this.f38917g = i7;
        this.f38918i = i10;
        this.f38919j = it;
    }

    @Override // Ff.a
    public final Continuation create(Object obj, Continuation continuation) {
        Q q10 = new Q(this.f38917g, this.f38918i, this.f38919j, continuation);
        q10.f38916f = obj;
        return q10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((Sf.j) obj, (Continuation) obj2)).invokeSuspend(Unit.f38893a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:60:0x0136  */
    /* JADX WARN: Code duplicated, block: B:62:0x0149  */
    /* JADX WARN: Code duplicated, block: B:64:0x014f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x008c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x007d A[SYNTHETIC] */
    @Override // Ff.a
    public final Object invokeSuspend(Object obj) {
        int i7;
        M m7;
        Sf.j jVar;
        Iterator it;
        ArrayList arrayList;
        Sf.j jVar2;
        Iterator it2;
        int i10;
        Object next;
        M m10;
        Sf.j jVar3;
        Object next2;
        int iA;
        int i11;
        Object[] objArr;
        int i12;
        Object[] array;
        boolean z3 = true;
        Ef.a aVar = Ef.a.f2423a;
        int i13 = this.f38915e;
        int i14 = this.f38918i;
        int i15 = this.f38917g;
        if (i13 == 0) {
            androidx.camera.core.impl.utils.executor.g.M(obj);
            Sf.j jVar4 = (Sf.j) this.f38916f;
            int i16 = i15 <= 1024 ? i15 : 1024;
            i7 = i14 - i15;
            Iterator it3 = this.f38919j;
            if (i7 >= 0) {
                arrayList = new ArrayList(i16);
                jVar2 = jVar4;
                it2 = it3;
                i10 = 0;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i10 > 0) {
                        i10--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i15) {
                            this.f38916f = jVar2;
                            this.f38912b = arrayList;
                            this.f38913c = it2;
                            this.f38914d = i7;
                            this.f38915e = 1;
                            jVar2.a(arrayList, this);
                            Ef.a aVar2 = Ef.a.f2423a;
                            return aVar;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f38916f = null;
                    this.f38912b = null;
                    this.f38913c = null;
                    this.f38915e = 2;
                    jVar2.a(arrayList, this);
                    Ef.a aVar3 = Ef.a.f2423a;
                    return aVar;
                }
            } else {
                m7 = new M(new Object[i16], 0);
                jVar = jVar4;
                it = it3;
                while (it.hasNext()) {
                    next2 = it.next();
                    iA = m7.a();
                    i11 = m7.f38909c;
                    if (iA != i11) {
                        throw new IllegalStateException("ring buffer is full");
                    }
                    int i17 = m7.f38910d;
                    int i18 = m7.f38911e;
                    boolean z8 = z3;
                    objArr = m7.f38908b;
                    objArr[(i17 + i18) % i11] = next2;
                    m7.f38911e = i18 + 1;
                    if (m7.a() != i11) {
                        if (m7.f38911e < i15) {
                            ArrayList arrayList2 = new ArrayList(m7);
                            this.f38916f = jVar;
                            this.f38912b = m7;
                            this.f38913c = it;
                            this.f38915e = 3;
                            jVar.a(arrayList2, this);
                            Ef.a aVar4 = Ef.a.f2423a;
                            return aVar;
                        }
                        i12 = i11 + (i11 >> 1) + 1;
                        if (i12 > i15) {
                            i12 = i15;
                        }
                        if (m7.f38910d == 0) {
                            array = Arrays.copyOf(objArr, i12);
                            Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
                        } else {
                            array = m7.toArray(new Object[i12]);
                        }
                        m7 = new M(array, m7.f38911e);
                    }
                    z3 = z8;
                }
                m10 = m7;
                jVar3 = jVar;
                if (m10.f38911e > i14) {
                    ArrayList arrayList3 = new ArrayList(m10);
                    this.f38916f = jVar3;
                    this.f38912b = m10;
                    this.f38913c = null;
                    this.f38915e = 4;
                    jVar3.a(arrayList3, this);
                    Ef.a aVar5 = Ef.a.f2423a;
                    return aVar;
                }
                if (!m10.isEmpty()) {
                    this.f38916f = null;
                    this.f38912b = null;
                    this.f38913c = null;
                    this.f38915e = 5;
                    jVar3.a(m10, this);
                    Ef.a aVar6 = Ef.a.f2423a;
                    return aVar;
                }
            }
        } else if (i13 != 1) {
            if (i13 != 2) {
                if (i13 == 3) {
                    it = this.f38913c;
                    m7 = (M) this.f38912b;
                    jVar = (Sf.j) this.f38916f;
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                    m7.b(i14);
                    while (it.hasNext()) {
                        next2 = it.next();
                        iA = m7.a();
                        i11 = m7.f38909c;
                        if (iA != i11) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i19 = m7.f38910d;
                        int i110 = m7.f38911e;
                        boolean z10 = z3;
                        objArr = m7.f38908b;
                        objArr[(i19 + i110) % i11] = next2;
                        m7.f38911e = i110 + 1;
                        if (m7.a() != i11) {
                            if (m7.f38911e < i15) {
                                ArrayList arrayList4 = new ArrayList(m7);
                                this.f38916f = jVar;
                                this.f38912b = m7;
                                this.f38913c = it;
                                this.f38915e = 3;
                                jVar.a(arrayList4, this);
                                Ef.a aVar7 = Ef.a.f2423a;
                                return aVar;
                            }
                            i12 = i11 + (i11 >> 1) + 1;
                            if (i12 > i15) {
                                i12 = i15;
                            }
                            if (m7.f38910d == 0) {
                                array = Arrays.copyOf(objArr, i12);
                                Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
                            } else {
                                array = m7.toArray(new Object[i12]);
                            }
                            m7 = new M(array, m7.f38911e);
                        }
                        z3 = z10;
                    }
                    m10 = m7;
                    jVar3 = jVar;
                } else if (i13 == 4) {
                    m10 = (M) this.f38912b;
                    jVar3 = (Sf.j) this.f38916f;
                    androidx.camera.core.impl.utils.executor.g.M(obj);
                    m10.b(i14);
                } else if (i13 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (m10.f38911e > i14) {
                    ArrayList arrayList5 = new ArrayList(m10);
                    this.f38916f = jVar3;
                    this.f38912b = m10;
                    this.f38913c = null;
                    this.f38915e = 4;
                    jVar3.a(arrayList5, this);
                    Ef.a aVar8 = Ef.a.f2423a;
                    return aVar;
                }
                if (!m10.isEmpty()) {
                    this.f38916f = null;
                    this.f38912b = null;
                    this.f38913c = null;
                    this.f38915e = 5;
                    jVar3.a(m10, this);
                    Ef.a aVar9 = Ef.a.f2423a;
                    return aVar;
                }
            }
            androidx.camera.core.impl.utils.executor.g.M(obj);
        } else {
            i10 = this.f38914d;
            it2 = this.f38913c;
            jVar2 = (Sf.j) this.f38916f;
            androidx.camera.core.impl.utils.executor.g.M(obj);
            arrayList = new ArrayList(i15);
            i7 = i10;
            while (it2.hasNext()) {
                next = it2.next();
                if (i10 > 0) {
                    i10--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i15) {
                        this.f38916f = jVar2;
                        this.f38912b = arrayList;
                        this.f38913c = it2;
                        this.f38914d = i7;
                        this.f38915e = 1;
                        jVar2.a(arrayList, this);
                        Ef.a aVar10 = Ef.a.f2423a;
                        return aVar;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f38916f = null;
                this.f38912b = null;
                this.f38913c = null;
                this.f38915e = 2;
                jVar2.a(arrayList, this);
                Ef.a aVar11 = Ef.a.f2423a;
                return aVar;
            }
        }
        return Unit.f38893a;
    }
}
