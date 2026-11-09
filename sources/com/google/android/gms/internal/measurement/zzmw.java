package com.google.android.gms.internal.measurement;

import C0.G;
import com.airbnb.lottie.model.layer.d;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.horcrux.svg.d0;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmw {
    private static final zzmw zza = new zzmw(ImmutableSortedSet.of());
    private final ImmutableSortedSet zzb;

    public zzmw(ImmutableSortedSet immutableSortedSet) {
        this.zzb = immutableSortedSet;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    public static zzmw zza(zzmw zzmwVar, ImmutableMap immutableMap) {
        long j6;
        if (immutableMap.isEmpty()) {
            return zzmwVar;
        }
        HashMap mapNewHashMap = Maps.newHashMap(immutableMap);
        ImmutableSortedSet immutableSortedSet = zzmwVar.zzb;
        ImmutableSortedSet.Builder builderNaturalOrder = ImmutableSortedSet.naturalOrder();
        UnmodifiableIterator it = immutableSortedSet.iterator();
        while (it.hasNext()) {
            zzmv zzmvVar = (zzmv) it.next();
            Object objRemove = mapNewHashMap.remove(zzmvVar.zza());
            if (objRemove == null) {
                builderNaturalOrder.add(zzmvVar);
            } else if (objRemove instanceof String) {
                builderNaturalOrder.add(new zzmv(zzmvVar.zza, zzmvVar.zzb, 4, 0L, objRemove));
            } else if (objRemove instanceof byte[]) {
                builderNaturalOrder.add(new zzmv(zzmvVar.zza, zzmvVar.zzb, 5, 0L, objRemove));
            } else if (objRemove instanceof Boolean) {
                builderNaturalOrder.add(new zzmv(zzmvVar.zza, zzmvVar.zzb, ((Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
            } else if (objRemove instanceof Long) {
                builderNaturalOrder.add(new zzmv(zzmvVar.zza, zzmvVar.zzb, 2, ((Long) objRemove).longValue(), null));
            } else {
                if (!(objRemove instanceof Double)) {
                    String strZza = zzmvVar.zza();
                    String string = objRemove.toString();
                    throw new IllegalStateException(G.s(new StringBuilder(d.c(46, strZza) + string.length()), "Cannot serialize override for existing flag ", strZza, ": ", string));
                }
                builderNaturalOrder.add(new zzmv(zzmvVar.zza, zzmvVar.zzb, 3, Double.doubleToRawLongBits(((Double) objRemove).doubleValue()), null));
            }
        }
        for (String str : mapNewHashMap.keySet()) {
            Object obj = mapNewHashMap.get(str);
            int length = str.length();
            if (length > 19 || length == 0) {
                j6 = 0;
                break;
            }
            boolean z3 = false;
            long jCharAt = str.charAt(0) - '0';
            if (jCharAt < 1 || jCharAt > 9) {
                j6 = 0;
                break;
            }
            int i7 = 1;
            while (true) {
                if (i7 >= length) {
                    if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                        j6 = jCharAt;
                        break;
                    }
                    break;
                }
                int iCharAt = str.charAt(i7) - '0';
                if (!((iCharAt > 9) | (iCharAt < 0 ? true : z3))) {
                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                    i7++;
                    z3 = false;
                }
                j6 = 0;
                break;
            }
            String str2 = j6 == 0 ? str : null;
            if (obj instanceof String) {
                builderNaturalOrder.add(new zzmv(j6, str2, 4, 0L, obj));
            } else if (obj instanceof byte[]) {
                builderNaturalOrder.add(new zzmv(j6, str2, 5, 0L, obj));
            } else if (obj instanceof Boolean) {
                builderNaturalOrder.add(new zzmv(j6, str2, ((Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
            } else if (obj instanceof Long) {
                builderNaturalOrder.add(new zzmv(j6, str2, 2, ((Long) obj).longValue(), null));
            } else {
                if (!(obj instanceof Double)) {
                    String strValueOf = String.valueOf(obj);
                    throw new IllegalStateException(G.s(new StringBuilder(str.length() + 28 + strValueOf.length()), "Cannot serialize override ", str, ": ", strValueOf));
                }
                builderNaturalOrder.add(new zzmv(j6, str2, 3, Double.doubleToRawLongBits(((Double) obj).doubleValue()), null));
            }
        }
        return new zzmw(builderNaturalOrder.build());
    }

    public static zzmw zzb() {
        return zza;
    }

    public static zzmw zzd(zzacv zzacvVar) throws IOException {
        long j6;
        String strZzl;
        zzmv zzmvVar;
        int iZzx = zzacvVar.zzx();
        if (iZzx < 0) {
            throw new zzaeh("Negative number of flags");
        }
        ImmutableSortedSet.Builder builderNaturalOrder = ImmutableSortedSet.naturalOrder();
        long j10 = 0;
        for (int i7 = 0; i7 < iZzx; i7++) {
            long jZzz = zzacvVar.zzz();
            int i10 = (int) jZzz;
            long j11 = jZzz >>> 3;
            if (j11 == 0) {
                j6 = 0;
                strZzl = zzacvVar.zzl();
            } else {
                long j12 = j11 + j10;
                if (j12 > 2305843009213693951L) {
                    throw new zzaeh("Flag name larger than max size");
                }
                j6 = j12;
                strZzl = null;
            }
            int i11 = i10 & 7;
            if (i11 == 0 || i11 == 1) {
                zzmvVar = new zzmv(j6, strZzl, i11, 0L, null);
            } else if (i11 == 2) {
                zzmvVar = new zzmv(j6, strZzl, i11, zzacvVar.zzz(), null);
            } else if (i11 == 3) {
                zzmvVar = new zzmv(j6, strZzl, i11, Double.doubleToRawLongBits(zzacvVar.zzd()), null);
            } else if (i11 == 4) {
                zzmvVar = new zzmv(j6, strZzl, i11, 0L, zzacvVar.zzl());
            } else {
                if (i11 != 5) {
                    throw new zzaeh(d0.n(i11, "Unrecognized flag type ", new StringBuilder(String.valueOf(i11).length() + 23)));
                }
                zzmvVar = new zzmv(j6, strZzl, i11, 0L, zzacvVar.zzo());
            }
            long j13 = zzmvVar.zza;
            if (j13 != 0) {
                j10 = j13;
            }
            builderNaturalOrder.add(zzmvVar);
        }
        return new zzmw(builderNaturalOrder.build());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzmw) {
            return this.zzb.equals(((zzmw) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(ImmutableMap.Builder builder) {
        UnmodifiableIterator it = this.zzb.iterator();
        while (it.hasNext()) {
            zzmv zzmvVar = (zzmv) it.next();
            builder.put(zzmvVar.zza(), zzmvVar.zzb());
        }
    }

    public final ImmutableSortedSet zze() {
        return this.zzb;
    }

    public final int zzf() {
        return this.zzb.size();
    }
}
