package Kf;

import java.io.BufferedReader;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC1859i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Sequence {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5486b;

    public /* synthetic */ q(Object obj, int i7) {
        this.f5485a = i7;
        this.f5486b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Ff.g, java.lang.Object, kotlin.jvm.functions.Function2] */
    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f5485a) {
            case 0:
                return new p(this);
            case 1:
                ?? block = (Ff.g) this.f5486b;
                Intrinsics.checkNotNullParameter(block, "block");
                Sf.i iVar = new Sf.i();
                iVar.f8898d = Ef.f.a(iVar, iVar, block);
                return iVar;
            case 2:
                return (Iterator) this.f5486b;
            case 3:
                return AbstractC1859i.a((Object[]) this.f5486b);
            case 4:
                return ((Iterable) this.f5486b).iterator();
            default:
                return new kotlin.text.k((String) this.f5486b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(Function2 function2) {
        this.f5485a = 1;
        this.f5486b = (Ff.g) function2;
    }

    public q(BufferedReader reader) {
        this.f5485a = 0;
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f5486b = reader;
    }
}
