package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class zzz {
    final /* synthetic */ zzad zza;
    private com.google.android.gms.internal.measurement.zzhs zzb;
    private Long zzc;
    private long zzd;

    public /* synthetic */ zzz(zzad zzadVar, byte[] bArr) {
        Objects.requireNonNull(zzadVar);
        this.zza = zzadVar;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final com.google.android.gms.internal.measurement.zzhs zza(String str, com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj;
        String strZzd = zzhsVar.zzd();
        List listZza = zzhsVar.zza();
        zzad zzadVar = this.zza;
        zzpg zzpgVar = zzadVar.zzg;
        zzpgVar.zzp();
        Long l5 = (Long) zzpk.zzM(zzhsVar, "_eid");
        if (l5 != null) {
            if (strZzd.equals("_ep")) {
                Preconditions.checkNotNull(l5);
                zzpgVar.zzp();
                String str2 = (String) zzpk.zzM(zzhsVar, "_en");
                ?? r10 = 0;
                if (TextUtils.isEmpty(str2)) {
                    zzadVar.zzu.zzaW().zzc().zzb("Extra parameter without an event name. eventId", l5);
                    return null;
                }
                if (this.zzb == null || this.zzc == null || l5.longValue() != this.zzc.longValue()) {
                    zzaw zzawVarZzj = zzpgVar.zzj();
                    zzawVarZzj.zzg();
                    zzawVarZzj.zzay();
                    try {
                        try {
                            cursorRawQuery = zzawVarZzj.zze().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l5.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzp(), cursorRawQuery.getBlob(0))).zzbd(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e10) {
                                        zzawVarZzj.zzu.zzaW().zzb().zzd("Failed to merge main event. appId, eventId", zzgu.zzl(str), l5, e10);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                                        this.zza.zzu.zzaW().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l5);
                                        return null;
                                    }
                                    this.zzb = (com.google.android.gms.internal.measurement.zzhs) obj;
                                    this.zzd = ((Long) pairCreate.second).longValue();
                                    this.zza.zzg.zzp();
                                    this.zzc = (Long) zzpk.zzM(this.zzb, "_eid");
                                } else {
                                    zzawVarZzj.zzu.zzaW().zzk().zza("Main event not found");
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                zzawVarZzj.zzu.zzaW().zzb().zzb("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.zza.zzu.zzaW().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l5);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            r10 = zzpgVar;
                            if (r10 != 0) {
                                r10.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (r10 != 0) {
                            r10.close();
                        }
                        throw th;
                    }
                    cursorRawQuery.close();
                    pairCreate = null;
                    if (pairCreate != null) {
                    }
                    this.zza.zzu.zzaW().zzc().zzc("Extra parameter without existing main event. eventName, eventId", str2, l5);
                    return null;
                }
                long j6 = this.zzd - 1;
                this.zzd = j6;
                if (j6 <= 0) {
                    zzaw zzawVarZzj2 = this.zza.zzg.zzj();
                    zzawVarZzj2.zzg();
                    zzawVarZzj2.zzu.zzaW().zzk().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzawVarZzj2.zze().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        zzawVarZzj2.zzu.zzaW().zzb().zzb("Error clearing complex main event", e13);
                    }
                } else {
                    this.zza.zzg.zzj().zzU(str, l5, this.zzd, this.zzb);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar : this.zzb.zza()) {
                    this.zza.zzg.zzp();
                    if (zzpk.zzI(zzhsVar, zzhwVar.zzb()) == null) {
                        arrayList.add(zzhwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzu.zzaW().zzc().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listZza);
                    listZza = arrayList;
                }
                strZzd = str2;
            } else {
                this.zzc = l5;
                this.zzb = zzhsVar;
                zzpgVar.zzp();
                long jLongValue = ((Long) zzpk.zzN(zzhsVar, "_epc", 0L)).longValue();
                this.zzd = jLongValue;
                if (jLongValue <= 0) {
                    zzadVar.zzu.zzaW().zzc().zzb("Complex event with zero extra param count. eventName", strZzd);
                } else {
                    zzpgVar.zzj().zzU(str, (Long) Preconditions.checkNotNull(l5), this.zzd, zzhsVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzhsVar.zzco();
        zzhrVar.zzl(strZzd);
        zzhrVar.zzi();
        zzhrVar.zzh(listZza);
        return (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbd();
    }
}
