package androidx.fragment.app;

import android.os.Bundle;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Y implements FragmentManager$OpGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Z f17050c;

    public /* synthetic */ Y(Z z3, String str, int i7) {
        this.f17048a = i7;
        this.f17050c = z3;
        this.f17049b = str;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    @Override // androidx.fragment.app.FragmentManager$OpGenerator
    public final boolean generateOps(ArrayList arrayList, ArrayList arrayList2) throws Throwable {
        int i7;
        int i10;
        switch (this.f17048a) {
            case 0:
                Z z3 = this.f17050c;
                BackStackState backStackState = (BackStackState) z3.f17076j.remove(this.f17049b);
                boolean z8 = false;
                if (backStackState != null) {
                    HashMap map = new HashMap();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1161a c1161a = (C1161a) it.next();
                        if (c1161a.f17094u) {
                            Iterator it2 = c1161a.f17161a.iterator();
                            while (it2.hasNext()) {
                                Fragment fragment = ((j0) it2.next()).f17153b;
                                if (fragment != null) {
                                    map.put(fragment.mWho, fragment);
                                }
                            }
                        }
                    }
                    ArrayList<String> arrayList3 = backStackState.f16968a;
                    HashMap map2 = new HashMap(arrayList3.size());
                    for (String str : arrayList3) {
                        Fragment fragment2 = (Fragment) map.get(str);
                        if (fragment2 != null) {
                            map2.put(fragment2.mWho, fragment2);
                        } else {
                            Bundle bundleI = z3.f17069c.i(null, str);
                            if (bundleI != null) {
                                ClassLoader classLoader = z3.f17087v.f17026b.getClassLoader();
                                Fragment fragmentC = ((FragmentState) bundleI.getParcelable(RemoteConfigConstants.ResponseFieldKey.STATE)).c(z3.J(), classLoader);
                                fragmentC.mSavedFragmentState = bundleI;
                                if (bundleI.getBundle("savedInstanceState") == null) {
                                    fragmentC.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
                                }
                                Bundle bundle = bundleI.getBundle("arguments");
                                if (bundle != null) {
                                    bundle.setClassLoader(classLoader);
                                }
                                fragmentC.setArguments(bundle);
                                map2.put(fragmentC.mWho, fragmentC);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (BackStackRecordState backStackRecordState : backStackState.f16969b) {
                        backStackRecordState.getClass();
                        C1161a c1161a2 = new C1161a(z3);
                        backStackRecordState.c(c1161a2);
                        int i11 = 0;
                        while (true) {
                            ArrayList arrayList5 = backStackRecordState.f16956b;
                            if (i11 < arrayList5.size()) {
                                String str2 = (String) arrayList5.get(i11);
                                if (str2 != null) {
                                    Fragment fragment3 = (Fragment) map2.get(str2);
                                    if (fragment3 == null) {
                                        throw new IllegalStateException(C0.G.s(new StringBuilder("Restoring FragmentTransaction "), backStackRecordState.f16960f, " failed due to missing saved state for Fragment (", str2, ")"));
                                    }
                                    ((j0) c1161a2.f17161a.get(i11)).f17153b = fragment3;
                                }
                                i11++;
                            }
                        }
                        arrayList4.add(c1161a2);
                    }
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        ((C1161a) it3.next()).generateOps(arrayList, arrayList2);
                        z8 = true;
                    }
                }
                return z8;
            default:
                Z z10 = this.f17050c;
                String str3 = this.f17049b;
                byte b7 = -1;
                int iB = z10.B(-1, str3, true);
                if (iB < 0) {
                    return false;
                }
                int i12 = iB;
                while (true) {
                    Throwable th = null;
                    if (i12 >= z10.f17070d.size()) {
                        HashSet hashSet = new HashSet();
                        int i13 = iB;
                        while (i13 < z10.f17070d.size()) {
                            C1161a c1161a3 = (C1161a) z10.f17070d.get(i13);
                            byte b10 = b7;
                            HashSet hashSet2 = new HashSet();
                            HashSet hashSet3 = new HashSet();
                            Throwable th2 = th;
                            for (j0 j0Var : c1161a3.f17161a) {
                                Fragment fragment4 = j0Var.f17153b;
                                if (fragment4 != null) {
                                    if (j0Var.f17154c) {
                                        int i14 = j0Var.f17152a;
                                        i7 = i13;
                                        if (i14 == 1 || i14 == 2 || i14 == 8) {
                                        }
                                        i10 = j0Var.f17152a;
                                        if (i10 != 1 || i10 == 2) {
                                            hashSet3.add(fragment4);
                                        }
                                        i13 = i7;
                                    } else {
                                        i7 = i13;
                                    }
                                    hashSet.add(fragment4);
                                    hashSet2.add(fragment4);
                                    i10 = j0Var.f17152a;
                                    if (i10 != 1) {
                                        hashSet3.add(fragment4);
                                    } else {
                                        hashSet3.add(fragment4);
                                    }
                                    i13 = i7;
                                }
                            }
                            int i15 = i13;
                            hashSet2.removeAll(hashSet3);
                            if (!hashSet2.isEmpty()) {
                                StringBuilder sbQ = N8.q0.q("saveBackStack(\"", str3, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                                sbQ.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                                sbQ.append(" in ");
                                sbQ.append(c1161a3);
                                sbQ.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                                z10.k0(new IllegalArgumentException(sbQ.toString()));
                                throw th2;
                            }
                            i13 = i15 + 1;
                            b7 = b10;
                            th = th2;
                        }
                        Throwable th3 = th;
                        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                        while (!arrayDeque.isEmpty()) {
                            Fragment fragment5 = (Fragment) arrayDeque.removeFirst();
                            if (fragment5.mRetainInstance) {
                                StringBuilder sbQ2 = N8.q0.q("saveBackStack(\"", str3, "\") must not contain retained fragments. Found ");
                                sbQ2.append(hashSet.contains(fragment5) ? "direct reference to retained " : "retained child ");
                                sbQ2.append("fragment ");
                                sbQ2.append(fragment5);
                                z10.k0(new IllegalArgumentException(sbQ2.toString()));
                                throw th3;
                            }
                            for (Fragment fragment6 : fragment5.mChildFragmentManager.f17069c.e()) {
                                if (fragment6 != null) {
                                    arrayDeque.addLast(fragment6);
                                }
                            }
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it4 = hashSet.iterator();
                        while (it4.hasNext()) {
                            arrayList6.add(((Fragment) it4.next()).mWho);
                        }
                        ArrayList arrayList7 = new ArrayList(z10.f17070d.size() - iB);
                        for (int i16 = iB; i16 < z10.f17070d.size(); i16++) {
                            arrayList7.add(th3);
                        }
                        BackStackState backStackState2 = new BackStackState(arrayList6, arrayList7);
                        boolean z11 = true;
                        int size = z10.f17070d.size() - 1;
                        while (size >= iB) {
                            C1161a c1161a4 = (C1161a) z10.f17070d.remove(size);
                            C1161a c1161a5 = new C1161a(c1161a4);
                            ArrayList arrayList8 = c1161a5.f17161a;
                            int size2 = arrayList8.size() - 1;
                            while (size2 >= 0) {
                                j0 j0Var2 = (j0) arrayList8.get(size2);
                                if (j0Var2.f17154c) {
                                    if (j0Var2.f17152a == 8) {
                                        j0Var2.f17154c = false;
                                        arrayList8.remove(size2 - 1);
                                        size2--;
                                    } else {
                                        int i17 = j0Var2.f17153b.mContainerId;
                                        j0Var2.f17152a = 2;
                                        j0Var2.f17154c = false;
                                        for (int i18 = size2 - 1; i18 >= 0; i18--) {
                                            j0 j0Var3 = (j0) arrayList8.get(i18);
                                            if (j0Var3.f17154c && j0Var3.f17153b.mContainerId == i17) {
                                                arrayList8.remove(i18);
                                                size2--;
                                            }
                                        }
                                    }
                                }
                                size2--;
                                size = size;
                            }
                            int i19 = size;
                            arrayList7.set(i19 - iB, new BackStackRecordState(c1161a5));
                            c1161a4.f17094u = true;
                            arrayList.add(c1161a4);
                            arrayList2.add(Boolean.TRUE);
                            size = i19 - 1;
                            z11 = true;
                        }
                        boolean z12 = z11;
                        z10.f17076j.put(str3, backStackState2);
                        return z12;
                    }
                    C1161a c1161a6 = (C1161a) z10.f17070d.get(i12);
                    if (!c1161a6.f17176p) {
                        z10.k0(new IllegalArgumentException("saveBackStack(\"" + str3 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c1161a6 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                    i12++;
                }
                break;
        }
    }
}
