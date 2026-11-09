package com.google.android.gms.internal.measurement;

import M.n;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes2.dex */
final class zzwk extends zzwl {
    static final zzwl zza;
    static final zzwl zzb;

    static {
        zzwl zzwlVarZzb = new zzwk(null, new n(0)).zzb();
        zza = zzwlVarZzb;
        zzwk zzwkVar = new zzwk(zzwlVarZzb, new n(0), null);
        boolean z3 = !zzwkVar.zzh();
        Boolean bool = Boolean.TRUE;
        Preconditions.checkState(z3, "Can't mutate after handing to trace");
        Preconditions.checkNotNull(bool);
        zzwj zzwjVar = zzwl.zza;
        Preconditions.checkState(!zzwkVar.zzd(zzwjVar), "Key already present");
        zzwkVar.zzg().put(zzwjVar, bool);
        zzb = zzwkVar.zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private zzwk(zzwl zzwlVar, n nVar) {
        super(null, nVar, 0 == true ? 1 : 0);
    }

    public /* synthetic */ zzwk(zzwl zzwlVar, n nVar, byte[] bArr) {
        super(zzwlVar, nVar, null);
    }
}
