package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.camera.video.u;
import com.airbnb.lottie.model.layer.d;
import com.alibaba.android.arouter.utils.Consts;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.measurement.zzadf;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzafb;
import com.google.android.gms.internal.measurement.zzaif;
import com.google.android.gms.internal.measurement.zzair;
import com.google.common.net.HttpHeaders;
import com.google.maps.android.BuildConfig;
import com.microsoft.codepush.react.CodePushConstants;
import com.transsnet.palmpay.core.config.BillBusinessType;
import com.transsnet.palmpay.credit.bean.WaiverInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpk extends zzos {
    private long zza;
    private long zzb;

    public zzpk(zzpg zzpgVar) {
        super(zzpgVar);
    }

    public static final void zzF(com.google.android.gms.internal.measurement.zzhr zzhrVar, String str, Object obj) {
        List listZza = zzhrVar.zza();
        int i7 = 0;
        while (true) {
            if (i7 >= listZza.size()) {
                i7 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.zzhw) listZza.get(i7)).zzb())) {
                break;
            } else {
                i7++;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzhvVarZzn.zzb(str);
        zzhvVarZzn.zzf(((Long) obj).longValue());
        if (i7 >= 0) {
            zzhrVar.zze(i7, zzhvVarZzn);
        } else {
            zzhrVar.zzg(zzhvVarZzn);
        }
    }

    @WorkerThread
    public static final boolean zzG(zzbh zzbhVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzbhVar);
        Preconditions.checkNotNull(zzrVar);
        return !TextUtils.isEmpty(zzrVar.zzb);
    }

    public static final Bundle zzH(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            String strZzb = zzhwVar.zzb();
            if (zzhwVar.zzj()) {
                bundle.putDouble(strZzb, zzhwVar.zzk());
            } else if (zzhwVar.zzh()) {
                bundle.putFloat(strZzb, zzhwVar.zzi());
            } else if (zzhwVar.zzc()) {
                bundle.putString(strZzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putLong(strZzb, zzhwVar.zzf());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.zzhw zzI(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str) {
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().equals(str)) {
                return zzhwVar;
            }
        }
        return null;
    }

    public static final String zzJ(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (entry.getValue() == null || ((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static final Map zzK(com.google.android.gms.internal.measurement.zzhs zzhsVar, String... strArr) {
        Object objZzT;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
            if (Arrays.asList(strArr).contains(zzhwVar.zzb()) && (objZzT = zzT(zzhwVar)) != null) {
                map.put(zzhwVar.zzb(), objZzT);
            }
        }
        return map;
    }

    public static final Map zzL(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str) {
        Object objZzT;
        HashMap map = new HashMap();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : zzhsVar.zza()) {
            if (zzhwVar.zzb().startsWith("gad_") && (objZzT = zzT(zzhwVar)) != null) {
                map.put(zzhwVar.zzb(), objZzT);
            }
        }
        return map;
    }

    public static final Object zzM(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str) {
        com.google.android.gms.internal.measurement.zzhw zzhwVarZzI = zzI(zzhsVar, str);
        if (zzhwVarZzI == null) {
            return null;
        }
        return zzT(zzhwVarZzI);
    }

    public static final Object zzN(com.google.android.gms.internal.measurement.zzhs zzhsVar, String str, Object obj) {
        Object objZzM = zzM(zzhsVar, str);
        return objZzM == null ? obj : objZzM;
    }

    private final void zzO(StringBuilder sb2, int i7, List list) {
        if (list == null) {
            return;
        }
        int i10 = i7 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            if (zzhwVar != null) {
                zzQ(sb2, i10);
                sb2.append("param {\n");
                zzW(sb2, i10, "name", zzhwVar.zza() ? this.zzu.zzl().zzb(zzhwVar.zzb()) : null);
                zzW(sb2, i10, "string_value", zzhwVar.zzc() ? zzhwVar.zzd() : null);
                zzW(sb2, i10, "int_value", zzhwVar.zze() ? Long.valueOf(zzhwVar.zzf()) : null);
                zzW(sb2, i10, "double_value", zzhwVar.zzj() ? Double.valueOf(zzhwVar.zzk()) : null);
                if (zzhwVar.zzm() > 0) {
                    zzO(sb2, i10, zzhwVar.zzl());
                }
                zzQ(sb2, i10);
                sb2.append("}\n");
            }
        }
    }

    private final void zzP(StringBuilder sb2, int i7, com.google.android.gms.internal.measurement.zzfh zzfhVar) {
        String str;
        if (zzfhVar == null) {
            return;
        }
        zzQ(sb2, i7);
        sb2.append("filter {\n");
        if (zzfhVar.zze()) {
            zzW(sb2, i7, "complement", Boolean.valueOf(zzfhVar.zzf()));
        }
        if (zzfhVar.zzh()) {
            zzW(sb2, i7, "param_name", this.zzu.zzl().zzb(zzfhVar.zzi()));
        }
        if (zzfhVar.zza()) {
            int i10 = i7 + 1;
            com.google.android.gms.internal.measurement.zzfr zzfrVarZzb = zzfhVar.zzb();
            if (zzfrVarZzb != null) {
                zzQ(sb2, i10);
                sb2.append("string_filter {\n");
                if (zzfrVarZzb.zza()) {
                    switch (zzfrVarZzb.zzk()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = WaiverInfo.TYPE_PARTIAL;
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    zzW(sb2, i10, "match_type", str);
                }
                if (zzfrVarZzb.zzb()) {
                    zzW(sb2, i10, "expression", zzfrVarZzb.zzc());
                }
                if (zzfrVarZzb.zzd()) {
                    zzW(sb2, i10, "case_sensitive", Boolean.valueOf(zzfrVarZzb.zze()));
                }
                if (zzfrVarZzb.zzh() > 0) {
                    zzQ(sb2, i7 + 2);
                    sb2.append("expression_list {\n");
                    for (String str2 : zzfrVarZzb.zzf()) {
                        zzQ(sb2, i7 + 3);
                        sb2.append(str2);
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    }
                    sb2.append("}\n");
                }
                zzQ(sb2, i10);
                sb2.append("}\n");
            }
        }
        if (zzfhVar.zzc()) {
            zzX(sb2, i7 + 1, "number_filter", zzfhVar.zzd());
        }
        zzQ(sb2, i7);
        sb2.append("}\n");
    }

    private static final void zzQ(StringBuilder sb2, int i7) {
        for (int i10 = 0; i10 < i7; i10++) {
            sb2.append("  ");
        }
    }

    private static final void zzR(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    private static final String zzS(boolean z3, boolean z8, boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        if (z3) {
            sb2.append("Dynamic ");
        }
        if (z8) {
            sb2.append("Sequence ");
        }
        if (z10) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    private static final Object zzT(com.google.android.gms.internal.measurement.zzhw zzhwVar) {
        if (zzhwVar.zzc()) {
            return zzhwVar.zzd();
        }
        if (zzhwVar.zze()) {
            return Long.valueOf(zzhwVar.zzf());
        }
        if (zzhwVar.zzj()) {
            return Double.valueOf(zzhwVar.zzk());
        }
        if (zzhwVar.zzm() > 0) {
            return zzy(zzhwVar.zzl());
        }
        return null;
    }

    private static final void zzU(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                zzR(builder, str3, string, set);
            }
        }
    }

    private static final void zzV(StringBuilder sb2, int i7, String str, com.google.android.gms.internal.measurement.zzii zziiVar) {
        if (zziiVar == null) {
            return;
        }
        zzQ(sb2, 3);
        sb2.append(str);
        sb2.append(" {\n");
        if (zziiVar.zzd() != 0) {
            zzQ(sb2, 4);
            sb2.append("results: ");
            int i10 = 0;
            for (Long l5 : zziiVar.zzc()) {
                int i11 = i10 + 1;
                if (i10 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l5);
                i10 = i11;
            }
            sb2.append('\n');
        }
        if (zziiVar.zzb() != 0) {
            zzQ(sb2, 4);
            sb2.append("status: ");
            int i12 = 0;
            for (Long l6 : zziiVar.zza()) {
                int i13 = i12 + 1;
                if (i12 != 0) {
                    sb2.append(", ");
                }
                sb2.append(l6);
                i12 = i13;
            }
            sb2.append('\n');
        }
        if (zziiVar.zzf() != 0) {
            zzQ(sb2, 4);
            sb2.append("dynamic_filter_timestamps: {");
            int i14 = 0;
            for (com.google.android.gms.internal.measurement.zzhq zzhqVar : zziiVar.zze()) {
                int i15 = i14 + 1;
                if (i14 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzhqVar.zza() ? Integer.valueOf(zzhqVar.zzb()) : null);
                sb2.append(":");
                sb2.append(zzhqVar.zzc() ? Long.valueOf(zzhqVar.zzd()) : null);
                i14 = i15;
            }
            sb2.append("}\n");
        }
        if (zziiVar.zzi() != 0) {
            zzQ(sb2, 4);
            sb2.append("sequence_filter_timestamps: {");
            int i16 = 0;
            for (com.google.android.gms.internal.measurement.zzik zzikVar : zziiVar.zzh()) {
                int i17 = i16 + 1;
                if (i16 != 0) {
                    sb2.append(", ");
                }
                sb2.append(zzikVar.zza() ? Integer.valueOf(zzikVar.zzb()) : null);
                sb2.append(": [");
                Iterator it = zzikVar.zzc().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i19 = i18 + 1;
                    if (i18 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(jLongValue);
                    i18 = i19;
                }
                sb2.append("]");
                i16 = i17;
            }
            sb2.append("}\n");
        }
        zzQ(sb2, 3);
        sb2.append("}\n");
    }

    private static final void zzW(StringBuilder sb2, int i7, String str, Object obj) {
        if (obj == null) {
            return;
        }
        zzQ(sb2, i7 + 1);
        sb2.append(str);
        sb2.append(": ");
        sb2.append(obj);
        sb2.append('\n');
    }

    private static final void zzX(StringBuilder sb2, int i7, String str, com.google.android.gms.internal.measurement.zzfl zzflVar) {
        String str2;
        if (zzflVar == null) {
            return;
        }
        zzQ(sb2, i7);
        sb2.append(str);
        sb2.append(" {\n");
        if (zzflVar.zza()) {
            int iZzm = zzflVar.zzm();
            if (iZzm == 1) {
                str2 = "UNKNOWN_COMPARISON_TYPE";
            } else if (iZzm == 2) {
                str2 = "LESS_THAN";
            } else if (iZzm != 3) {
                str2 = iZzm != 4 ? "BETWEEN" : "EQUAL";
            } else {
                str2 = "GREATER_THAN";
            }
            zzW(sb2, i7, "comparison_type", str2);
        }
        if (zzflVar.zzb()) {
            zzW(sb2, i7, "match_as_float", Boolean.valueOf(zzflVar.zzc()));
        }
        if (zzflVar.zzd()) {
            zzW(sb2, i7, "comparison_value", zzflVar.zze());
        }
        if (zzflVar.zzf()) {
            zzW(sb2, i7, "min_comparison_value", zzflVar.zzh());
        }
        if (zzflVar.zzi()) {
            zzW(sb2, i7, "max_comparison_value", zzflVar.zzj());
        }
        zzQ(sb2, i7);
        sb2.append("}\n");
    }

    public static boolean zzm(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean zzn(List list, int i7) {
        if (i7 < list.size() * 64) {
            return ((1 << (i7 % 64)) & ((Long) list.get(i7 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static List zzp(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i7 = 0; i7 < length; i7++) {
            long j6 = 0;
            for (int i10 = 0; i10 < 64; i10++) {
                int i11 = (i7 * 64) + i10;
                if (i11 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i11)) {
                    j6 |= 1 << i10;
                }
            }
            arrayList.add(Long.valueOf(j6));
        }
        return arrayList;
    }

    public static zzafb zzw(zzafb zzafbVar, byte[] bArr) throws zzaeh {
        zzadf zzadfVarZzb = zzadf.zzb();
        return zzadfVarZzb != null ? zzafbVar.zzaW(bArr, zzadfVarZzb) : zzafbVar.zzaX(bArr);
    }

    public static int zzx(com.google.android.gms.internal.measurement.zzic zzicVar, String str) {
        for (int i7 = 0; i7 < zzicVar.zzl(); i7++) {
            if (str.equals(zzicVar.zzm(i7).zzc())) {
                return i7;
            }
        }
        return -1;
    }

    public static Bundle[] zzy(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) it.next();
            if (zzhwVar != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.zzhw zzhwVar2 : zzhwVar.zzl()) {
                    if (zzhwVar2.zzc()) {
                        bundle.putString(zzhwVar2.zzb(), zzhwVar2.zzd());
                    } else if (zzhwVar2.zze()) {
                        bundle.putLong(zzhwVar2.zzb(), zzhwVar2.zzf());
                    } else if (zzhwVar2.zzj()) {
                        bundle.putDouble(zzhwVar2.zzb(), zzhwVar2.zzk());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final zzbh zzA(com.google.android.gms.internal.measurement.zzaa zzaaVar) {
        Object obj;
        Bundle bundleZzB = zzB(zzaaVar.zzf(), true);
        String string = (!bundleZzB.containsKey("_o") || (obj = bundleZzB.get("_o")) == null) ? "app" : obj.toString();
        String strZzb = zzjm.zzb(zzaaVar.zzb());
        if (strZzb == null) {
            strZzb = zzaaVar.zzb();
        }
        return new zzbh(strZzb, new zzbf(bundleZzB), string, zzaaVar.zza(), 0L);
    }

    public final Bundle zzB(Map map, boolean z3) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z3) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    arrayList2.add(zzB((Map) arrayList.get(i7), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    @TargetApi(26)
    @VisibleForTesting
    public final long zzC(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return ZonedDateTime.parse(str, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
            } catch (DateTimeParseException unused) {
                this.zzu.zzaW().zze().zzb("Unable to parse header time, time", str);
            }
        }
        return 0L;
    }

    @WorkerThread
    public final void zzD(Map map) {
        if (Build.VERSION.SDK_INT >= 26) {
            String strZzJ = zzJ(map, HttpHeaders.DATE);
            if (TextUtils.isEmpty(strZzJ)) {
                return;
            }
            long jZzC = zzC(strZzJ);
            if (jZzC > 0) {
                long jElapsedRealtime = this.zzu.zzba().elapsedRealtime();
                zzg();
                if (this.zzb == 0) {
                    this.zza = jElapsedRealtime;
                    this.zzb = jZzC;
                }
            }
        }
    }

    @WorkerThread
    public final long zzE(long j6) {
        zzg();
        long j10 = this.zzb;
        if (j10 == 0 || j6 == 0) {
            return 0L;
        }
        return (j10 - this.zza) + j6;
    }

    @Override // com.google.android.gms.measurement.internal.zzos
    public final boolean zzbc() {
        return false;
    }

    public final void zzc(com.google.android.gms.internal.measurement.zzit zzitVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzitVar.zzd();
        zzitVar.zzf();
        zzitVar.zzh();
        if (obj instanceof String) {
            zzitVar.zzc((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzitVar.zze(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            zzitVar.zzg(((Double) obj).doubleValue());
        } else {
            this.zzu.zzaW().zzb().zzb("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final void zzd(com.google.android.gms.internal.measurement.zzhv zzhvVar, Object obj) {
        Preconditions.checkNotNull(obj);
        zzhvVar.zze();
        zzhvVar.zzg();
        zzhvVar.zzi();
        zzhvVar.zzm();
        if (obj instanceof String) {
            zzhvVar.zzd((String) obj);
            return;
        }
        if (obj instanceof Long) {
            zzhvVar.zzf(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            zzhvVar.zzh(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.zzu.zzaW().zzb().zzb("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.zzhv zzhvVarZzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                    zzhvVarZzn2.zzb(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        zzhvVarZzn2.zzf(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        zzhvVarZzn2.zzd((String) obj2);
                    } else if (obj2 instanceof Double) {
                        zzhvVarZzn2.zzh(((Double) obj2).doubleValue());
                    }
                    zzhvVarZzn.zzk(zzhvVarZzn2);
                }
                if (zzhvVarZzn.zzj() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn.zzbd());
                }
            }
        }
        zzhvVar.zzl(arrayList);
    }

    @TargetApi(BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS)
    public final zzoh zzf(String str, com.google.android.gms.internal.measurement.zzic zzicVar, com.google.android.gms.internal.measurement.zzhr zzhrVar, String str2) {
        int iIndexOf;
        zzaif.zza();
        zzic zzicVar2 = this.zzu;
        if (!zzicVar2.zzc().zzp(str, zzfy.zzaO)) {
            return null;
        }
        long jCurrentTimeMillis = zzicVar2.zzba().currentTimeMillis();
        HashSet hashSet = new HashSet(Arrays.asList(zzicVar2.zzc().zzk(str, zzfy.zzat).split(",")));
        zzpg zzpgVar = this.zzg;
        zzou zzouVarZzf = zzpgVar.zzf();
        String strZzc = zzouVarZzf.zzg.zzh().zzc(str);
        Uri.Builder builder = new Uri.Builder();
        zzic zzicVar3 = zzouVarZzf.zzu;
        builder.scheme(zzicVar3.zzc().zzk(str, zzfy.zzam));
        if (TextUtils.isEmpty(strZzc)) {
            builder.authority(zzicVar3.zzc().zzk(str, zzfy.zzan));
        } else {
            String strZzk = zzicVar3.zzc().zzk(str, zzfy.zzan);
            StringBuilder sb2 = new StringBuilder(d.c(1, strZzc) + String.valueOf(strZzk).length());
            sb2.append(strZzc);
            sb2.append(Consts.DOT);
            sb2.append(strZzk);
            builder.authority(sb2.toString());
        }
        builder.path(zzicVar3.zzc().zzk(str, zzfy.zzao));
        zzR(builder, "gmp_app_id", zzicVar.zzac(), hashSet);
        zzicVar2.zzc().zzi();
        zzR(builder, "gmp_version", String.valueOf(161000L), hashSet);
        String strZzV = zzicVar.zzV();
        zzal zzalVarZzc = zzicVar2.zzc();
        zzfx zzfxVar = zzfy.zzaR;
        if (zzalVarZzc.zzp(str, zzfxVar) && zzpgVar.zzh().zzu(str)) {
            strZzV = "";
        }
        zzR(builder, "app_instance_id", strZzV, hashSet);
        zzR(builder, "rdid", zzicVar.zzP(), hashSet);
        zzR(builder, "bundle_id", zzicVar.zzK(), hashSet);
        String strZzk2 = zzhrVar.zzk();
        String strZza = zzjm.zza(strZzk2);
        if (true != TextUtils.isEmpty(strZza)) {
            strZzk2 = strZza;
        }
        zzR(builder, "app_event_name", strZzk2, hashSet);
        zzR(builder, "app_version", String.valueOf(zzicVar.zzai()), hashSet);
        String strZzD = zzicVar.zzD();
        if (zzicVar2.zzc().zzp(str, zzfxVar) && zzpgVar.zzh().zzr(str) && !TextUtils.isEmpty(strZzD) && (iIndexOf = strZzD.indexOf(Consts.DOT)) != -1) {
            strZzD = strZzD.substring(0, iIndexOf);
        }
        zzR(builder, "os_version", strZzD, hashSet);
        zzR(builder, "timestamp", String.valueOf(zzhrVar.zzn()), hashSet);
        if (zzicVar.zzS()) {
            zzR(builder, "lat", "1", hashSet);
        }
        zzR(builder, "privacy_sandbox_version", String.valueOf(zzicVar.zzaG()), hashSet);
        zzR(builder, "trigger_uri_source", "1", hashSet);
        zzR(builder, "trigger_uri_timestamp", String.valueOf(jCurrentTimeMillis), hashSet);
        zzR(builder, "request_uuid", str2, hashSet);
        List<com.google.android.gms.internal.measurement.zzhw> listZza = zzhrVar.zza();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.zzhw zzhwVar : listZza) {
            String strZzb = zzhwVar.zzb();
            if (zzhwVar.zzj()) {
                bundle.putString(strZzb, String.valueOf(zzhwVar.zzk()));
            } else if (zzhwVar.zzh()) {
                bundle.putString(strZzb, String.valueOf(zzhwVar.zzi()));
            } else if (zzhwVar.zzc()) {
                bundle.putString(strZzb, zzhwVar.zzd());
            } else if (zzhwVar.zze()) {
                bundle.putString(strZzb, String.valueOf(zzhwVar.zzf()));
            }
        }
        zzU(builder, zzicVar2.zzc().zzk(str, zzfy.zzas).split("\\|"), bundle, hashSet);
        List<com.google.android.gms.internal.measurement.zziu> listZzk = zzicVar.zzk();
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.zziu zziuVar : listZzk) {
            String strZzc2 = zziuVar.zzc();
            if (zziuVar.zzk()) {
                bundle2.putString(strZzc2, String.valueOf(zziuVar.zzl()));
            } else if (zziuVar.zzi()) {
                bundle2.putString(strZzc2, String.valueOf(zziuVar.zzj()));
            } else if (zziuVar.zzd()) {
                bundle2.putString(strZzc2, zziuVar.zze());
            } else if (zziuVar.zzf()) {
                bundle2.putString(strZzc2, String.valueOf(zziuVar.zzh()));
            }
        }
        zzU(builder, zzicVar2.zzc().zzk(str, zzfy.zzar).split("\\|"), bundle2, hashSet);
        zzR(builder, "dma", true != zzicVar.zzaC() ? "0" : "1", hashSet);
        if (!zzicVar.zzaE().isEmpty()) {
            zzR(builder, "dma_cps", zzicVar.zzaE(), hashSet);
        }
        if (zzicVar.zzaK()) {
            com.google.android.gms.internal.measurement.zzha zzhaVarZzaL = zzicVar.zzaL();
            if (!zzhaVarZzaL.zzb().isEmpty()) {
                zzR(builder, "dl_gclid", zzhaVarZzaL.zzb(), hashSet);
            }
            if (!zzhaVarZzaL.zzd().isEmpty()) {
                zzR(builder, "dl_gbraid", zzhaVarZzaL.zzd(), hashSet);
            }
            if (!zzhaVarZzaL.zzf().isEmpty()) {
                zzR(builder, "dl_gs", zzhaVarZzaL.zzf(), hashSet);
            }
            if (zzhaVarZzaL.zzi() > 0) {
                zzR(builder, "dl_ss_ts", String.valueOf(zzhaVarZzaL.zzi()), hashSet);
            }
            if (!zzhaVarZzaL.zzk().isEmpty()) {
                zzR(builder, "mr_gclid", zzhaVarZzaL.zzk(), hashSet);
            }
            if (!zzhaVarZzaL.zzm().isEmpty()) {
                zzR(builder, "mr_gbraid", zzhaVarZzaL.zzm(), hashSet);
            }
            if (!zzhaVarZzaL.zzo().isEmpty()) {
                zzR(builder, "mr_gs", zzhaVarZzaL.zzo(), hashSet);
            }
            if (zzhaVarZzaL.zzq() > 0) {
                zzR(builder, "mr_click_ts", String.valueOf(zzhaVarZzaL.zzq()), hashSet);
            }
        }
        return new zzoh(builder.build().toString(), jCurrentTimeMillis, 1);
    }

    public final com.google.android.gms.internal.measurement.zzhs zzh(zzbc zzbcVar) {
        com.google.android.gms.internal.measurement.zzhr zzhrVarZzp = com.google.android.gms.internal.measurement.zzhs.zzp();
        zzhrVarZzp.zzq(zzbcVar.zzf);
        zzhrVarZzp.zzw(zzbcVar.zze);
        zzbf zzbfVar = zzbcVar.zzg;
        zzbe zzbeVar = new zzbe(zzbfVar);
        while (zzbeVar.hasNext()) {
            String next = zzbeVar.next();
            com.google.android.gms.internal.measurement.zzhv zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
            zzhvVarZzn.zzb(next);
            Object objZza = zzbfVar.zza(next);
            Preconditions.checkNotNull(objZza);
            zzd(zzhvVarZzn, objZza);
            zzhrVarZzp.zzg(zzhvVarZzn);
        }
        String str = zzbcVar.zzc;
        if (!TextUtils.isEmpty(str) && zzbfVar.zza("_o") == null) {
            com.google.android.gms.internal.measurement.zzhv zzhvVarZzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
            zzhvVarZzn2.zzb("_o");
            zzhvVarZzn2.zzd(str);
            zzhrVarZzp.zzf((com.google.android.gms.internal.measurement.zzhw) zzhvVarZzn2.zzbd());
        }
        return (com.google.android.gms.internal.measurement.zzhs) zzhrVarZzp.zzbd();
    }

    public final String zzi(com.google.android.gms.internal.measurement.zzib zzibVar) {
        String str;
        String str2;
        String str3;
        com.google.android.gms.internal.measurement.zzhe zzheVarZzat;
        if (zzibVar == null) {
            return "";
        }
        StringBuilder sbS = u.s("\nbatch {\n");
        if (zzibVar.zzf()) {
            zzW(sbS, 0, "upload_subdomain", zzibVar.zzh());
        }
        if (zzibVar.zzd()) {
            zzW(sbS, 0, "sgtm_join_id", zzibVar.zze());
        }
        for (com.google.android.gms.internal.measurement.zzid zzidVar : zzibVar.zza()) {
            if (zzidVar != null) {
                zzQ(sbS, 1);
                sbS.append("bundle {\n");
                if (zzidVar.zza()) {
                    zzW(sbS, 1, "protocol_version", Integer.valueOf(zzidVar.zzb()));
                }
                zzair.zza();
                zzic zzicVar = this.zzu;
                if (zzicVar.zzc().zzp(zzidVar.zzA(), zzfy.zzaM) && zzidVar.zzag()) {
                    zzW(sbS, 1, "session_stitching_token", zzidVar.zzah());
                }
                zzW(sbS, 1, "platform", zzidVar.zzt());
                if (zzidVar.zzC()) {
                    zzW(sbS, 1, "gmp_version", Long.valueOf(zzidVar.zzD()));
                }
                if (zzidVar.zzE()) {
                    zzW(sbS, 1, "uploading_gmp_version", Long.valueOf(zzidVar.zzF()));
                }
                if (zzidVar.zzac()) {
                    zzW(sbS, 1, "dynamite_version", Long.valueOf(zzidVar.zzad()));
                }
                if (zzidVar.zzW()) {
                    zzW(sbS, 1, "config_version", Long.valueOf(zzidVar.zzX()));
                }
                zzW(sbS, 1, "gmp_app_id", zzidVar.zzP());
                zzW(sbS, 1, "app_id", zzidVar.zzA());
                zzW(sbS, 1, "app_version", zzidVar.zzB());
                if (zzidVar.zzU()) {
                    zzW(sbS, 1, "app_version_major", Integer.valueOf(zzidVar.zzV()));
                }
                zzW(sbS, 1, "firebase_instance_id", zzidVar.zzT());
                if (zzidVar.zzK()) {
                    zzW(sbS, 1, "dev_cert_hash", Long.valueOf(zzidVar.zzL()));
                }
                zzW(sbS, 1, "app_store", zzidVar.zzz());
                if (zzidVar.zzj()) {
                    zzW(sbS, 1, "upload_timestamp_millis", Long.valueOf(zzidVar.zzk()));
                }
                if (zzidVar.zzl()) {
                    zzW(sbS, 1, "start_timestamp_millis", Long.valueOf(zzidVar.zzm()));
                }
                if (zzidVar.zzn()) {
                    zzW(sbS, 1, "end_timestamp_millis", Long.valueOf(zzidVar.zzo()));
                }
                if (zzidVar.zzp()) {
                    zzW(sbS, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(zzidVar.zzq()));
                }
                if (zzidVar.zzr()) {
                    zzW(sbS, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(zzidVar.zzs()));
                }
                zzW(sbS, 1, "app_instance_id", zzidVar.zzJ());
                zzW(sbS, 1, "resettable_device_id", zzidVar.zzG());
                zzW(sbS, 1, "ds_id", zzidVar.zzZ());
                if (zzidVar.zzH()) {
                    zzW(sbS, 1, "limited_ad_tracking", Boolean.valueOf(zzidVar.zzI()));
                }
                zzW(sbS, 1, "os_version", zzidVar.zzu());
                zzW(sbS, 1, "device_model", zzidVar.zzv());
                zzW(sbS, 1, "user_default_language", zzidVar.zzw());
                if (zzidVar.zzx()) {
                    zzW(sbS, 1, "time_zone_offset_minutes", Integer.valueOf(zzidVar.zzy()));
                }
                if (zzidVar.zzM()) {
                    zzW(sbS, 1, "bundle_sequential_index", Integer.valueOf(zzidVar.zzN()));
                }
                if (zzidVar.zzau()) {
                    zzW(sbS, 1, "delivery_index", Integer.valueOf(zzidVar.zzav()));
                }
                if (zzidVar.zzQ()) {
                    zzW(sbS, 1, "service_upload", Boolean.valueOf(zzidVar.zzR()));
                }
                zzW(sbS, 1, "health_monitor", zzidVar.zzO());
                if (zzidVar.zzaa()) {
                    zzW(sbS, 1, "retry_counter", Integer.valueOf(zzidVar.zzab()));
                }
                if (zzidVar.zzae()) {
                    zzW(sbS, 1, "consent_signals", zzidVar.zzaf());
                }
                if (zzidVar.zzan()) {
                    zzW(sbS, 1, "is_dma_region", Boolean.valueOf(zzidVar.zzao()));
                }
                if (zzidVar.zzap()) {
                    zzW(sbS, 1, "core_platform_services", zzidVar.zzaq());
                }
                if (zzidVar.zzal()) {
                    zzW(sbS, 1, "consent_diagnostics", zzidVar.zzam());
                }
                if (zzidVar.zzai()) {
                    zzW(sbS, 1, "target_os_version", Long.valueOf(zzidVar.zzaj()));
                }
                zzaif.zza();
                if (zzicVar.zzc().zzp(zzidVar.zzA(), zzfy.zzaO)) {
                    zzW(sbS, 1, "ad_services_version", Integer.valueOf(zzidVar.zzar()));
                    if (zzidVar.zzas() && (zzheVarZzat = zzidVar.zzat()) != null) {
                        zzQ(sbS, 2);
                        sbS.append("attribution_eligibility_status {\n");
                        zzW(sbS, 2, "eligible", Boolean.valueOf(zzheVarZzat.zza()));
                        zzW(sbS, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(zzheVarZzat.zzb()));
                        zzW(sbS, 2, "pre_r", Boolean.valueOf(zzheVarZzat.zzc()));
                        zzW(sbS, 2, "r_extensions_too_old", Boolean.valueOf(zzheVarZzat.zzd()));
                        zzW(sbS, 2, "adservices_extension_too_old", Boolean.valueOf(zzheVarZzat.zze()));
                        zzW(sbS, 2, "ad_storage_not_allowed", Boolean.valueOf(zzheVarZzat.zzf()));
                        zzW(sbS, 2, "measurement_manager_disabled", Boolean.valueOf(zzheVarZzat.zzh()));
                        zzQ(sbS, 2);
                        sbS.append("}\n");
                    }
                }
                if (zzidVar.zzaw()) {
                    com.google.android.gms.internal.measurement.zzha zzhaVarZzax = zzidVar.zzax();
                    zzQ(sbS, 2);
                    sbS.append("ad_campaign_info {\n");
                    if (zzhaVarZzax.zza()) {
                        zzW(sbS, 2, "deep_link_gclid", zzhaVarZzax.zzb());
                    }
                    if (zzhaVarZzax.zzc()) {
                        zzW(sbS, 2, "deep_link_gbraid", zzhaVarZzax.zzd());
                    }
                    if (zzhaVarZzax.zze()) {
                        zzW(sbS, 2, "deep_link_gad_source", zzhaVarZzax.zzf());
                    }
                    if (zzhaVarZzax.zzr()) {
                        zzW(sbS, 2, "deep_link_url", zzhaVarZzax.zzs());
                    }
                    if (zzhaVarZzax.zzh()) {
                        zzW(sbS, 2, "deep_link_session_millis", Long.valueOf(zzhaVarZzax.zzi()));
                    }
                    if (zzhaVarZzax.zzj()) {
                        zzW(sbS, 2, "market_referrer_gclid", zzhaVarZzax.zzk());
                    }
                    if (zzhaVarZzax.zzl()) {
                        zzW(sbS, 2, "market_referrer_gbraid", zzhaVarZzax.zzm());
                    }
                    if (zzhaVarZzax.zzn()) {
                        zzW(sbS, 2, "market_referrer_gad_source", zzhaVarZzax.zzo());
                    }
                    if (zzhaVarZzax.zzp()) {
                        zzW(sbS, 2, "market_referrer_click_millis", Long.valueOf(zzhaVarZzax.zzq()));
                    }
                    zzQ(sbS, 2);
                    sbS.append("}\n");
                }
                if (zzidVar.zzaA()) {
                    zzW(sbS, 1, "batching_timestamp_millis", Long.valueOf(zzidVar.zzaB()));
                }
                if (zzidVar.zzay()) {
                    com.google.android.gms.internal.measurement.zzis zzisVarZzaz = zzidVar.zzaz();
                    zzQ(sbS, 2);
                    sbS.append("sgtm_diagnostics {\n");
                    int iZzf = zzisVarZzaz.zzf();
                    if (iZzf == 1) {
                        str2 = "UPLOAD_TYPE_UNKNOWN";
                    } else if (iZzf == 2) {
                        str2 = "GA_UPLOAD";
                    } else if (iZzf != 3) {
                        str2 = iZzf != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD";
                    } else {
                        str2 = "SDK_CLIENT_UPLOAD";
                    }
                    zzW(sbS, 2, "upload_type", str2);
                    zzW(sbS, 2, "client_upload_eligibility", zzisVarZzaz.zza().name());
                    int iZzh = zzisVarZzaz.zzh();
                    if (iZzh == 1) {
                        str3 = "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN";
                    } else if (iZzh == 2) {
                        str3 = "SERVICE_UPLOAD_ELIGIBLE";
                    } else if (iZzh == 3) {
                        str3 = "NOT_IN_ROLLOUT";
                    } else if (iZzh != 4) {
                        str3 = iZzh != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO";
                    } else {
                        str3 = "MISSING_SGTM_SETTINGS";
                    }
                    zzW(sbS, 2, "service_upload_eligibility", str3);
                    zzQ(sbS, 2);
                    sbS.append("}\n");
                }
                if (zzidVar.zzaC()) {
                    com.google.android.gms.internal.measurement.zzho zzhoVarZzaD = zzidVar.zzaD();
                    zzQ(sbS, 2);
                    sbS.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.zzhl zzhlVar : zzhoVarZzaD.zza()) {
                        zzQ(sbS, 3);
                        sbS.append("limited_data_modes {\n");
                        int iZzc = zzhlVar.zzc();
                        if (iZzc == 1) {
                            str = "CONSENT_TYPE_UNSPECIFIED";
                        } else if (iZzc == 2) {
                            str = "AD_STORAGE";
                        } else if (iZzc != 3) {
                            str = iZzc != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA";
                        } else {
                            str = "ANALYTICS_STORAGE";
                        }
                        zzW(sbS, 3, "type", str);
                        int iZzd = zzhlVar.zzd();
                        zzW(sbS, 3, "mode", iZzd != 1 ? iZzd != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        zzQ(sbS, 3);
                        sbS.append("}\n");
                    }
                    zzQ(sbS, 2);
                    sbS.append("}\n");
                }
                List<com.google.android.gms.internal.measurement.zziu> listZzf = zzidVar.zzf();
                if (listZzf != null) {
                    for (com.google.android.gms.internal.measurement.zziu zziuVar : listZzf) {
                        if (zziuVar != null) {
                            zzQ(sbS, 2);
                            sbS.append("user_property {\n");
                            zzW(sbS, 2, "set_timestamp_millis", zziuVar.zza() ? Long.valueOf(zziuVar.zzb()) : null);
                            zzW(sbS, 2, "name", zzicVar.zzl().zzc(zziuVar.zzc()));
                            zzW(sbS, 2, "string_value", zziuVar.zze());
                            zzW(sbS, 2, "int_value", zziuVar.zzf() ? Long.valueOf(zziuVar.zzh()) : null);
                            zzW(sbS, 2, "double_value", zziuVar.zzk() ? Double.valueOf(zziuVar.zzl()) : null);
                            zzQ(sbS, 2);
                            sbS.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzhg> listZzS = zzidVar.zzS();
                if (listZzS != null) {
                    for (com.google.android.gms.internal.measurement.zzhg zzhgVar : listZzS) {
                        if (zzhgVar != null) {
                            zzQ(sbS, 2);
                            sbS.append("audience_membership {\n");
                            if (zzhgVar.zza()) {
                                zzW(sbS, 2, "audience_id", Integer.valueOf(zzhgVar.zzb()));
                            }
                            if (zzhgVar.zzf()) {
                                zzW(sbS, 2, "new_audience", Boolean.valueOf(zzhgVar.zzh()));
                            }
                            zzV(sbS, 2, "current_data", zzhgVar.zzc());
                            if (zzhgVar.zzd()) {
                                zzV(sbS, 2, "previous_data", zzhgVar.zze());
                            }
                            zzQ(sbS, 2);
                            sbS.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.zzhs> listZzc = zzidVar.zzc();
                if (listZzc != null) {
                    for (com.google.android.gms.internal.measurement.zzhs zzhsVar : listZzc) {
                        if (zzhsVar != null) {
                            zzQ(sbS, 2);
                            sbS.append("event {\n");
                            zzW(sbS, 2, "name", zzicVar.zzl().zza(zzhsVar.zzd()));
                            if (zzhsVar.zze()) {
                                zzW(sbS, 2, "timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                            }
                            if (zzicVar.zzc().zzp(null, zzfy.zzbe) && zzhsVar.zzl()) {
                                zzW(sbS, 2, "corrected_timestamp_millis", Long.valueOf(zzhsVar.zzm()));
                            }
                            if (zzhsVar.zzh()) {
                                zzW(sbS, 2, "previous_timestamp_millis", Long.valueOf(zzhsVar.zzi()));
                            }
                            if (zzhsVar.zzj()) {
                                zzW(sbS, 2, CodePushConstants.LATEST_ROLLBACK_COUNT_KEY, Integer.valueOf(zzhsVar.zzk()));
                            }
                            if (zzhsVar.zzb() != 0) {
                                zzO(sbS, 2, zzhsVar.zza());
                            }
                            zzQ(sbS, 2);
                            sbS.append("}\n");
                        }
                    }
                }
                zzQ(sbS, 1);
                sbS.append("}\n");
            }
        }
        sbS.append("} // End-of-batch\n");
        return sbS.toString();
    }

    public final String zzj(com.google.android.gms.internal.measurement.zzff zzffVar) {
        if (zzffVar == null) {
            return BuildConfig.TRAVIS;
        }
        StringBuilder sbS = u.s("\nevent_filter {\n");
        if (zzffVar.zza()) {
            zzW(sbS, 0, "filter_id", Integer.valueOf(zzffVar.zzb()));
        }
        zzW(sbS, 0, "event_name", this.zzu.zzl().zza(zzffVar.zzc()));
        String strZzS = zzS(zzffVar.zzj(), zzffVar.zzk(), zzffVar.zzm());
        if (!strZzS.isEmpty()) {
            zzW(sbS, 0, "filter_type", strZzS);
        }
        if (zzffVar.zzh()) {
            zzX(sbS, 1, "event_count_filter", zzffVar.zzi());
        }
        if (zzffVar.zze() > 0) {
            sbS.append("  filters {\n");
            Iterator it = zzffVar.zzd().iterator();
            while (it.hasNext()) {
                zzP(sbS, 2, (com.google.android.gms.internal.measurement.zzfh) it.next());
            }
        }
        zzQ(sbS, 1);
        sbS.append("}\n}\n");
        return sbS.toString();
    }

    public final String zzk(com.google.android.gms.internal.measurement.zzfn zzfnVar) {
        if (zzfnVar == null) {
            return BuildConfig.TRAVIS;
        }
        StringBuilder sbS = u.s("\nproperty_filter {\n");
        if (zzfnVar.zza()) {
            zzW(sbS, 0, "filter_id", Integer.valueOf(zzfnVar.zzb()));
        }
        zzW(sbS, 0, "property_name", this.zzu.zzl().zzc(zzfnVar.zzc()));
        String strZzS = zzS(zzfnVar.zze(), zzfnVar.zzf(), zzfnVar.zzi());
        if (!strZzS.isEmpty()) {
            zzW(sbS, 0, "filter_type", strZzS);
        }
        zzP(sbS, 1, zzfnVar.zzd());
        sbS.append("}\n");
        return sbS.toString();
    }

    public final Parcelable zzl(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
        } catch (SafeParcelReader.ParseException unused) {
            this.zzu.zzaW().zzb().zza("Failed to load parcelable from buffer");
        } finally {
            parcelObtain.recycle();
        }
        return parcelable;
    }

    public final List zzq(List list, List list2) {
        int i7;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.zzu.zzaW().zze().zzb("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.zzu.zzaW().zze().zzc("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i10 = size2;
            i7 = size;
            size = i10;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i7);
    }

    public final boolean zzs(long j6, long j10) {
        return j6 == 0 || j10 <= 0 || Math.abs(this.zzu.zzba().currentTimeMillis() - j6) > j10;
    }

    @WorkerThread
    public final long zzt(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        zzic zzicVar = this.zzu;
        zzicVar.zzk().zzg();
        MessageDigest messageDigestZzQ = zzpp.zzQ();
        if (messageDigestZzQ != null) {
            return zzpp.zzR(messageDigestZzQ.digest(bArr));
        }
        d.r(zzicVar, "Failed to get MD5");
        return 0L;
    }

    public final long zzu(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return zzt(str.getBytes(StandardCharsets.UTF_8));
    }

    public final byte[] zzv(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            this.zzu.zzaW().zzb().zzb("Failed to gzip content", e10);
            throw e10;
        }
    }

    public final Map zzz(Bundle bundle, boolean z3) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z8 = obj instanceof Parcelable[];
            if (z8 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z3) {
                    ArrayList arrayList = new ArrayList();
                    if (z8) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(zzz((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            Object obj2 = arrayList2.get(i7);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(zzz((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(zzz((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }
}
