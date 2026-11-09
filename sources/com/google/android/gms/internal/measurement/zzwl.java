package com.google.android.gms.internal.measurement;

import M.n;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public class zzwl {
    private static final zzwj zza = zzwj.zza(Boolean.class);

    @Nullable
    private final zzwl zzb;
    private final n zzc;
    private boolean zzd = false;

    public /* synthetic */ zzwl(zzwl zzwlVar, n nVar, byte[] bArr) {
        if (zzwlVar != null) {
            Preconditions.checkArgument(zzwlVar.zzd);
        }
        this.zzb = zzwlVar;
        this.zzc = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzwl zza(zzwl zzwlVar, zzwl zzwlVar2) {
        if (zzwlVar.zzc()) {
            return zzwlVar2;
        }
        if (zzwlVar2.zzc()) {
            return zzwlVar;
        }
        ImmutableSet<zzwl> immutableSetOf = ImmutableSet.of(zzwlVar, zzwlVar2);
        if (immutableSetOf.isEmpty()) {
            return zzwk.zza;
        }
        if (immutableSetOf.size() == 1) {
            return (zzwl) immutableSetOf.iterator().next();
        }
        int i7 = 0;
        for (zzwl zzwlVar3 : immutableSetOf) {
            do {
                i7 += zzwlVar3.zzc.f5695c;
                zzwlVar3 = zzwlVar3.zzb;
            } while (zzwlVar3 != null);
        }
        if (i7 == 0) {
            return zzwk.zza;
        }
        n nVar = new n(i7);
        for (zzwl zzwlVar4 : immutableSetOf) {
            do {
                int i10 = 0;
                while (true) {
                    n nVar2 = zzwlVar4.zzc;
                    if (i10 >= nVar2.f5695c) {
                        break;
                    }
                    Preconditions.checkArgument(nVar.put((zzwj) nVar2.f(i10), nVar2.j(i10)) == null, "Duplicate bindings: %s", nVar2.f(i10));
                    i10++;
                }
                zzwlVar4 = zzwlVar4.zzb;
            } while (zzwlVar4 != null);
        }
        return new zzwk(null, nVar, 0 == true ? 1 : 0).zzb();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanExtras<");
        for (zzwl zzwlVar = this; zzwlVar != null; zzwlVar = zzwlVar.zzb) {
            for (int i7 = 0; i7 < zzwlVar.zzc.f5695c; i7++) {
                sb2.append("[");
                sb2.append(this.zzc.j(i7));
                sb2.append("], ");
            }
        }
        sb2.append(">");
        return sb2.toString();
    }

    public final zzwl zzb() {
        if (this.zzd) {
            throw new IllegalStateException("Already frozen");
        }
        this.zzd = true;
        zzwl zzwlVar = this.zzb;
        return (zzwlVar == null || !this.zzc.isEmpty()) ? this : zzwlVar;
    }

    public final boolean zzc() {
        return this == zzwk.zza;
    }

    public final boolean zzd(zzwj zzwjVar) {
        if (this.zzc.containsKey(zzwjVar)) {
            return true;
        }
        zzwl zzwlVar = this.zzb;
        return zzwlVar != null && zzwlVar.zzd(zzwjVar);
    }

    public final boolean zze() {
        return this.zzd;
    }

    public final /* synthetic */ n zzg() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zzd;
    }
}
