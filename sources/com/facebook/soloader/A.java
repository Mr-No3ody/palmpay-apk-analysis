package com.facebook.soloader;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class A implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f21846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f21847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f21848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f21849d;

    public A(D d2, boolean z3, File file, n nVar) {
        this.f21849d = d2;
        this.f21846a = z3;
        this.f21847b = file;
        this.f21848c = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f21848c;
        o.e(2, "fb-UnpackingSoSource");
        D d2 = this.f21849d;
        boolean z3 = this.f21846a;
        try {
            if (z3) {
                try {
                    y.c(d2.f21877a);
                } finally {
                    Objects.toString(d2.f21877a);
                    o.e(2, "fb-UnpackingSoSource");
                    nVar.close();
                }
            }
            D.j(this.f21847b, (byte) 1, z3);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
