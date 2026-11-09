package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzxv extends zzyl {
    public zzxv(String str, Class cls, boolean z3) {
        super("group_by", cls, true);
    }

    @Override // com.google.android.gms.internal.measurement.zzyl
    public final void zza(Iterator it, zzyk zzykVar) {
        if (it.hasNext()) {
            Object next = it.next();
            if (!it.hasNext()) {
                zzykVar.zza(zzd(), next);
                return;
            }
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(next);
            do {
                sb2.append(',');
                sb2.append(it.next());
            } while (it.hasNext());
            String strZzd = zzd();
            sb2.append(']');
            zzykVar.zza(strZzd, sb2.toString());
        }
    }
}
