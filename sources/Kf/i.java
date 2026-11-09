package Kf;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.collections.AbstractC1835b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AbstractC1835b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f5473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f5474d;

    public i(k kVar) {
        this.f5474d = kVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f5473c = arrayDeque;
        File rootFile = kVar.f5476a;
        if (rootFile.isDirectory()) {
            arrayDeque.push(b(rootFile));
        } else if (!rootFile.isFile()) {
            this.f38920a = 2;
        } else {
            Intrinsics.checkNotNullParameter(rootFile, "rootFile");
            arrayDeque.push(new g(rootFile));
        }
    }

    @Override // kotlin.collections.AbstractC1835b
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.f5473c;
            j jVar = (j) arrayDeque.peek();
            if (jVar == null) {
                file = null;
                break;
            }
            File fileA = jVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(jVar.f5475a) || !fileA.isDirectory() || arrayDeque.size() >= this.f5474d.f5481f) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(b(fileA));
            }
        }
        if (file == null) {
            this.f38920a = 2;
        } else {
            this.f38921b = file;
            this.f38920a = 1;
        }
    }

    public final e b(File file) {
        int iOrdinal = this.f5474d.f5477b.ordinal();
        if (iOrdinal == 0) {
            return new h(this, file);
        }
        if (iOrdinal == 1) {
            return new f(this, file);
        }
        throw new p355xf.l();
    }
}
