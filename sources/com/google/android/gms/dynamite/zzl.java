package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzl implements DynamiteModule.VersionPolicy {
    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.zzb(context, str);
        int i7 = 1;
        int iZza = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = iZza;
        int i10 = selectionResult.localVersion;
        if (i10 == 0) {
            i10 = 0;
            if (iZza == 0) {
                i7 = 0;
            } else if (iZza < i10) {
                i7 = -1;
            }
        } else if (iZza < i10) {
            i7 = -1;
        }
        selectionResult.selection = i7;
        return selectionResult;
    }
}
