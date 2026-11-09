package com.adjust.sdk.sig;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f19487a = new Object[0];

    public static final Object[] a(Collection collection) {
        int size = collection.size();
        if (size == 0) {
            return f19487a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return f19487a;
        }
        Object[] objArrCopyOf = new Object[size];
        int i7 = 0;
        while (true) {
            int i10 = i7 + 1;
            objArrCopyOf[i7] = it.next();
            if (i10 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i11 = ((i10 * 3) + 1) >>> 1;
                if (i11 <= i10) {
                    i11 = 2147483645;
                    if (i10 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i10);
            }
            i7 = i10;
        }
    }

    public static final Object[] a(Collection collection, Object[] objArr) {
        int size = collection.size();
        int i7 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
        } else {
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
            } else {
                Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i10 = i7 + 1;
                    objArrCopyOf[i7] = it.next();
                    if (i10 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i11 = ((i10 * 3) + 1) >>> 1;
                        if (i11 <= i10) {
                            i11 = 2147483645;
                            if (i10 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i10] = null;
                            return objArr;
                        }
                        return Arrays.copyOf(objArrCopyOf, i10);
                    }
                    i7 = i10;
                }
            }
        }
        return objArr;
    }
}
