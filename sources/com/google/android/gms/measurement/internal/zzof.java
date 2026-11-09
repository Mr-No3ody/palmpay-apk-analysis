package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzabw;
import com.google.android.gms.internal.measurement.zzabx;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zzof {
    static final ImmutableList zza = ImmutableList.of("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");
    public static final /* synthetic */ int zzb = 0;

    public static String zza(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static int zzb(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @VisibleForTesting
    public static final boolean zzc(zzabw zzabwVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i7, int i10, int i11, int i12, int i13, String str, String str2, String str3, boolean z3, boolean z8, boolean z10) {
        int i14;
        int i15;
        ImmutableSet immutableSet2;
        String str4;
        zzoe zzoeVar;
        char c6;
        int iZze = zze(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i10, i11, i12, i13, str, str2, str3, z3, z8, true);
        if (iZze > 0) {
            i15 = i11;
            if (i15 == 1) {
                i14 = i10;
                if (i14 != 1) {
                    i15 = 1;
                } else {
                    i14 = 1;
                    i15 = 1;
                }
            } else {
                i14 = i10;
            }
            cArr[iZze] = '2';
        } else {
            i14 = i10;
            i15 = i11;
        }
        if (zzi(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i14, i15, i12, i13, str, str2, str3, z3, z8, true) == zzabx.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c6 = '3';
        } else {
            int i16 = i13;
            if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
                immutableSet2 = immutableSet;
                str4 = str;
                if (i16 == 1) {
                    if (immutableSet2.contains(str4)) {
                        if (iZze > 0 && cArr[iZze] != '2') {
                            cArr[iZze] = '1';
                        }
                        return true;
                    }
                    i16 = 1;
                }
            } else {
                immutableSet2 = immutableSet;
                str4 = str;
            }
            if (immutableMap.containsKey(zzabwVar) && (zzoeVar = (zzoe) immutableMap.get(zzabwVar)) != null) {
                int iOrdinal = zzoeVar.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return zzi(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i14, i15, i12, i16, str, str2, str3, z3, z8, true) == zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST ? zzh(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i14, i15, i12, i16, str, str2, str3, z3, z8, true) : zzg(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i14, i15, i12, i16, str, str2, str3, z3, z8, true);
                        }
                        if (iOrdinal == 3) {
                            return zzi(zzabwVar, immutableMap, immutableMap2, immutableSet2, cArr, i7, i14, i15, i12, i16, str4, str2, str3, z3, z8, true) == zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT ? zzg(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i14, i15, i12, i16, str, str2, str3, z3, z8, true) : zzh(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i14, i15, i12, i16, str, str2, str3, z3, z8, true);
                        }
                        c6 = '0';
                    } else if (zzi(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i14, i15, i12, i16, str, str2, str3, z3, z8, true) != zzabx.PURPOSE_RESTRICTION_REQUIRE_CONSENT) {
                        return zzh(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i14, i15, i12, i16, str, str2, str3, z3, z8, true);
                    }
                } else if (zzi(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i14, i15, i12, i16, str, str2, str3, z3, z8, true) != zzabx.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST) {
                    return zzg(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i14, i15, i12, i16, str, str2, str3, z3, z8, true);
                }
                c6 = '8';
            } else {
                c6 = '0';
            }
        }
        if (iZze <= 0 || cArr[iZze] == '2') {
            return false;
        }
        cArr[iZze] = c6;
        return false;
    }

    public static final Map zzd(ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i7, int i10, int i11, int i12, int i13, String str, String str2, String str3, boolean z3, boolean z8, boolean z10) {
        if (!z10) {
            return ImmutableMap.of();
        }
        zzabw zzabwVar = zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        zzabx zzabxVar = (zzabx) immutableMap2.get(zzabwVar);
        zzabw zzabwVar2 = zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        zzabx zzabxVar2 = (zzabx) immutableMap2.get(zzabwVar2);
        zzabw zzabwVar3 = zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        zzabx zzabxVar3 = (zzabx) immutableMap2.get(zzabwVar3);
        zzabw zzabwVar4 = zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        zzabx zzabxVar4 = (zzabx) immutableMap2.get(zzabwVar4);
        return ImmutableMap.builder().put("Version", "2").put("VendorConsent", true != z3 ? "0" : "1").put("VendorLegitimateInterest", true != z8 ? "0" : "1").put("gdprApplies", i11 != 1 ? "0" : "1").put("EnableAdvertiserConsentMode", i10 != 1 ? "0" : "1").put("PolicyVersion", String.valueOf(i12)).put("CmpSdkID", String.valueOf(i7)).put("PurposeOneTreatment", i13 != 1 ? "0" : "1").put("PublisherCC", str).put("PublisherRestrictions1", String.valueOf(zzabxVar != null ? zzabxVar.zza() : zzabx.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions3", String.valueOf(zzabxVar2 != null ? zzabxVar2.zza() : zzabx.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions4", String.valueOf(zzabxVar3 != null ? zzabxVar3.zza() : zzabx.PURPOSE_RESTRICTION_UNDEFINED.zza())).put("PublisherRestrictions7", String.valueOf(zzabxVar4 != null ? zzabxVar4.zza() : zzabx.PURPOSE_RESTRICTION_UNDEFINED.zza())).putAll(ImmutableMap.of("Purpose1", zzf(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i10, i11, i12, i13, str, str2, str3, z3, z8, true), "Purpose3", zzf(zzabwVar2, immutableMap, immutableMap2, immutableSet, cArr, i7, i10, i11, i12, i13, str, str2, str3, z3, z8, true), "Purpose4", zzf(zzabwVar3, immutableMap, immutableMap2, immutableSet, cArr, i7, i10, i11, i12, i13, str, str2, str3, z3, z8, true), "Purpose7", zzf(zzabwVar4, immutableMap, immutableMap2, immutableSet, cArr, i7, i10, i11, i12, i13, str, str2, str3, z3, z8, true))).putAll(ImmutableMap.of("AuthorizePurpose1", (String) (true != zzc(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i10, i11, i12, i13, str, str2, str3, z3, z8, true) ? "0" : "1"), "AuthorizePurpose3", (String) (true != zzc(zzabwVar2, immutableMap, immutableMap2, immutableSet, cArr, i7, i10, i11, i12, i13, str, str2, str3, z3, z8, true) ? "0" : "1"), "AuthorizePurpose4", (String) (true != zzc(zzabwVar3, immutableMap, immutableMap2, immutableSet, cArr, i7, i10, i11, i12, i13, str, str2, str3, z3, z8, true) ? "0" : "1"), "AuthorizePurpose7", true != zzc(zzabwVar4, immutableMap, immutableMap2, immutableSet, cArr, i7, i10, i11, i12, i13, str, str2, str3, z3, z8, true) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).buildOrThrow();
    }

    private static final int zze(zzabw zzabwVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i7, int i10, int i11, int i12, int i13, String str, String str2, String str3, boolean z3, boolean z8, boolean z10) {
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (zzabwVar == zzabw.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return zzabwVar == zzabw.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    private static final String zzf(zzabw zzabwVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i7, int i10, int i11, int i12, int i13, String str, String str2, String str3, boolean z3, boolean z8, boolean z10) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < zzabwVar.zza()) ? "0" : String.valueOf(str2.charAt(zzabwVar.zza() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= zzabwVar.zza()) {
            strValueOf = String.valueOf(str3.charAt(zzabwVar.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    private static final boolean zzg(zzabw zzabwVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i7, int i10, int i11, int i12, int i13, String str, String str2, String str3, boolean z3, boolean z8, boolean z10) {
        char c6;
        int iZze = zze(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i10, i11, i12, i13, str, str2, str3, z3, z8, true);
        if (!z3) {
            c6 = '4';
        } else {
            if (str2.length() >= zzabwVar.zza()) {
                char cCharAt = str2.charAt(zzabwVar.zza() - 1);
                boolean z11 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '6' : '1';
                }
                return z11;
            }
            c6 = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c6;
        }
        return false;
    }

    private static final boolean zzh(zzabw zzabwVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i7, int i10, int i11, int i12, int i13, String str, String str2, String str3, boolean z3, boolean z8, boolean z10) {
        char c6;
        int iZze = zze(zzabwVar, immutableMap, immutableMap2, immutableSet, cArr, i7, i10, i11, i12, i13, str, str2, str3, z3, z8, true);
        if (!z8) {
            c6 = '5';
        } else {
            if (str3.length() >= zzabwVar.zza()) {
                char cCharAt = str3.charAt(zzabwVar.zza() - 1);
                boolean z11 = cCharAt == '1';
                if (iZze > 0 && cArr[iZze] != '2') {
                    cArr[iZze] = cCharAt != '1' ? '7' : '1';
                }
                return z11;
            }
            c6 = '0';
        }
        if (iZze > 0 && cArr[iZze] != '2') {
            cArr[iZze] = c6;
        }
        return false;
    }

    private static final zzabx zzi(zzabw zzabwVar, ImmutableMap immutableMap, ImmutableMap immutableMap2, ImmutableSet immutableSet, char[] cArr, int i7, int i10, int i11, int i12, int i13, String str, String str2, String str3, boolean z3, boolean z8, boolean z10) {
        return (zzabx) immutableMap2.getOrDefault(zzabwVar, zzabx.PURPOSE_RESTRICTION_UNDEFINED);
    }
}
