package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
final class zzm implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        int iZza;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iZzb = iVersions.zzb(context, str);
        selectionResult.localVersion = iZzb;
        int i7 = 1;
        int i10 = 0;
        if (iZzb != 0) {
            iZza = iVersions.zza(context, str, false);
            selectionResult.remoteVersion = iZza;
        } else {
            iZza = iVersions.zza(context, str, true);
            selectionResult.remoteVersion = iZza;
        }
        int i11 = selectionResult.localVersion;
        if (i11 == 0) {
            if (iZza == 0) {
                i7 = 0;
            }
            selectionResult.selection = i7;
            return selectionResult;
        }
        i10 = i11;
        if (iZza < i10) {
            i7 = -1;
        }
        selectionResult.selection = i7;
        return selectionResult;
    }
}
