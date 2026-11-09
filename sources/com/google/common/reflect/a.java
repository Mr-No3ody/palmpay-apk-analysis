package com.google.common.reflect;

import com.google.common.base.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22868a;

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.f22868a) {
            case 0:
                return ((ClassPath.ClassInfo) obj).isTopLevel();
            default:
                return ((Class) obj).isInterface();
        }
    }
}
