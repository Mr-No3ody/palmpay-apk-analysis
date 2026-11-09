package com.facebook.cache.disk;

import com.facebook.common.file.FileTreeVisitor;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements FileTreeVisitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f21175a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f21176b;

    public a(d dVar) {
        this.f21176b = dVar;
    }

    @Override // com.facebook.common.file.FileTreeVisitor
    public final void postVisitDirectory(File file) {
    }

    @Override // com.facebook.common.file.FileTreeVisitor
    public final void preVisitDirectory(File file) {
    }

    @Override // com.facebook.common.file.FileTreeVisitor
    public final void visitFile(File file) {
        G6.b bVarA = d.a(this.f21176b, file);
        if (bVarA == null || bVarA.f3025b != ".cnt") {
            return;
        }
        this.f21175a.add(new b(file, bVarA.f3026c));
    }
}
