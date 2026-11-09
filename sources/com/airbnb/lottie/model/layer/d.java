package com.airbnb.lottie.model.layer;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.measurement.zzada;
import com.google.android.gms.internal.measurement.zzbk;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.mlkit_common.zzbh;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.android.gms.internal.mlkit_vision_face.zzcq;
import com.google.android.gms.measurement.internal.zzic;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.maps.android.BuildConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static int a(int i7, int i10, int i11) {
        return zzada.zzE(i7) + i10 + i11;
    }

    public static int b(int i7, int i10, int i11, int i12) {
        return zzada.zzE(i7) + i10 + i11 + i12;
    }

    public static int c(int i7, String str) {
        return String.valueOf(str).length() + i7;
    }

    public static IObjectWrapper d(Parcel parcel) {
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
        parcel.recycle();
        return iObjectWrapperAsInterface;
    }

    public static FieldDescriptor e(int i7, FieldDescriptor.Builder builder) {
        return builder.withProperty(AtProtobuf.builder().tag(i7).build()).build();
    }

    public static Object f(zzbk zzbkVar, int i7, List list, int i10) {
        zzh.zza(zzbkVar.name(), i7, list);
        return list.get(i10);
    }

    public static String g(int i7, int i10, String str) {
        StringBuilder sb2 = new StringBuilder(i7);
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }

    public static String h(int i7, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(i7);
        sb2.append(str);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String i(int i7, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(i7);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String j(String str, int i7, String str2, String str3) {
        return str + i7 + str2 + str3;
    }

    public static String k(String str, int i7, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(i7);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static String l(String str, String str2, String str3) {
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, str);
        String upperCase = str2.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, str3);
        return upperCase;
    }

    public static String m(String str, StringBuilder sb2) {
        return str + ((Object) sb2);
    }

    public static String n(Object[] objArr, int i7, String str, String str2) {
        String str3 = String.format(str, Arrays.copyOf(objArr, i7));
        Intrinsics.checkNotNullExpressionValue(str3, str2);
        return str3;
    }

    public static String o(Object[] objArr, int i7, Locale locale, String str, String str2) {
        String str3 = String.format(locale, str, Arrays.copyOf(objArr, i7));
        Intrinsics.checkNotNullExpressionValue(str3, str2);
        return str3;
    }

    public static StringBuilder p(String str, int i7, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(i7);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static Map q(String str, String str2) {
        return F.b(new Pair(str, str2));
    }

    public static void r(zzic zzicVar, String str) {
        zzicVar.zzaW().zzb().zza(str);
    }

    public static FieldDescriptor s(int i7, FieldDescriptor.Builder builder) {
        zzbh zzbhVar = new zzbh();
        zzbhVar.zza(i7);
        return builder.withProperty(zzbhVar.zzb()).build();
    }

    public static void t(zzic zzicVar, String str) {
        zzicVar.zzaW().zze().zza(str);
    }

    public static FieldDescriptor u(int i7, FieldDescriptor.Builder builder) {
        zzae zzaeVar = new zzae();
        zzaeVar.zza(i7);
        return builder.withProperty(zzaeVar.zzb()).build();
    }

    public static FieldDescriptor v(int i7, FieldDescriptor.Builder builder) {
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(i7);
        return builder.withProperty(zzcqVar.zzb()).build();
    }

    public static /* synthetic */ String w(int i7) {
        switch (i7) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return BuildConfig.TRAVIS;
        }
    }

    public static /* synthetic */ String x(int i7) {
        switch (i7) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return BuildConfig.TRAVIS;
        }
    }
}
