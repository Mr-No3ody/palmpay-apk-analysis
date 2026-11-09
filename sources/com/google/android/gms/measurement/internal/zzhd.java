package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.airbnb.lottie.model.layer.d;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzaif;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhd {
    final /* synthetic */ zzhh zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzhd(zzhh zzhhVar, String str, Bundle bundle) {
        Objects.requireNonNull(zzhhVar);
        this.zza = zzhhVar;
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        this.zzc = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    @WorkerThread
    public final Bundle zza() {
        byte b7;
        if (this.zzd == null) {
            zzhh zzhhVar = this.zza;
            String string = zzhhVar.zzd().getString(this.zzb, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i7);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode != 115) {
                                        if (iHashCode != 3352) {
                                            if (iHashCode == 3445 && string3.equals("la")) {
                                                b7 = 4;
                                            } else {
                                                b7 = -1;
                                            }
                                        } else if (string3.equals("ia")) {
                                            b7 = 3;
                                        } else {
                                            b7 = -1;
                                        }
                                    } else if (string3.equals("s")) {
                                        b7 = 0;
                                    } else {
                                        b7 = -1;
                                    }
                                } else if (string3.equals("l")) {
                                    b7 = 2;
                                } else {
                                    b7 = -1;
                                }
                            } else if (string3.equals("d")) {
                                b7 = 1;
                            } else {
                                b7 = -1;
                            }
                            if (b7 == 0) {
                                bundle.putString(string2, jSONObject.getString("v"));
                            } else if (b7 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString("v")));
                            } else if (b7 == 2) {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString("v")));
                            } else if (b7 == 3) {
                                zzaif.zza();
                                if (zzhhVar.zzu.zzc().zzp(null, zzfy.zzaP)) {
                                    JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                    int length = jSONArray2.length();
                                    int[] iArr = new int[length];
                                    for (int i10 = 0; i10 < length; i10++) {
                                        iArr[i10] = jSONArray2.optInt(i10);
                                    }
                                    bundle.putIntArray(string2, iArr);
                                }
                            } else if (b7 != 4) {
                                zzhhVar.zzu.zzaW().zzb().zzb("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                zzaif.zza();
                                if (zzhhVar.zzu.zzc().zzp(null, zzfy.zzaP)) {
                                    JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                    int length2 = jSONArray3.length();
                                    long[] jArr = new long[length2];
                                    for (int i11 = 0; i11 < length2; i11++) {
                                        jArr[i11] = jSONArray3.optLong(i11);
                                    }
                                    bundle.putLongArray(string2, jArr);
                                }
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.zza.zzu.zzaW().zzb().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (JSONException unused2) {
                    d.r(this.zza.zzu, "Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return new Bundle((Bundle) Preconditions.checkNotNull(this.zzd));
    }

    @WorkerThread
    public final void zzb(Bundle bundle) {
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        zzhh zzhhVar = this.zza;
        SharedPreferences.Editor editorEdit = zzhhVar.zzd().edit();
        if (bundle2.size() == 0) {
            editorEdit.remove(this.zzb);
        } else {
            String str = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        zzaif.zza();
                        zzic zzicVar = zzhhVar.zzu;
                        if (zzicVar.zzc().zzp(null, zzfy.zzaP)) {
                            if (obj instanceof String) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "l");
                            } else if (obj instanceof int[]) {
                                jSONObject.put("v", Arrays.toString((int[]) obj));
                                jSONObject.put("t", "ia");
                            } else if (obj instanceof long[]) {
                                jSONObject.put("v", Arrays.toString((long[]) obj));
                                jSONObject.put("t", "la");
                            } else if (obj instanceof Double) {
                                jSONObject.put("v", obj.toString());
                                jSONObject.put("t", "d");
                            } else {
                                zzicVar.zzaW().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        } else {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                zzicVar.zzaW().zzb().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                            }
                            jSONArray.put(jSONObject);
                        }
                    } catch (JSONException e10) {
                        this.zza.zzu.zzaW().zzb().zzb("Cannot serialize bundle value to SharedPreferences", e10);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.zzd = bundle2;
    }
}
