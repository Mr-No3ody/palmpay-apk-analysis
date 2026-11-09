package com.google.mlkit.vision.face;

import C0.G;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.mlkit_vision_face.zzd;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzn;
import com.google.android.gms.internal.mlkit_vision_face.zzos;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzpc;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.concurrent.Immutable;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
public class Face {
    private final Rect zza;
    private int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final float zzf;
    private final float zzg;
    private final float zzh;
    private final SparseArray zzi = new SparseArray();
    private final SparseArray zzj = new SparseArray();

    public Face(@NonNull zzf zzfVar, @Nullable Matrix matrix) {
        float f10 = zzfVar.zzc;
        float f11 = zzfVar.zze / 2.0f;
        float f12 = zzfVar.zzd;
        float f13 = zzfVar.zzf / 2.0f;
        Rect rect = new Rect((int) (f10 - f11), (int) (f12 - f13), (int) (f10 + f11), (int) (f12 + f13));
        this.zza = rect;
        if (matrix != null) {
            CommonConvertUtils.transformRect(rect, matrix);
        }
        this.zzb = zzfVar.zzb;
        for (zzn zznVar : zzfVar.zzj) {
            if (zze(zznVar.zzd)) {
                PointF pointF = new PointF(zznVar.zzb, zznVar.zzc);
                if (matrix != null) {
                    CommonConvertUtils.transformPointF(pointF, matrix);
                }
                SparseArray sparseArray = this.zzi;
                int i7 = zznVar.zzd;
                sparseArray.put(i7, new FaceLandmark(i7, pointF));
            }
        }
        for (zzd zzdVar : zzfVar.zzn) {
            int i10 = zzdVar.zzb;
            if (zzd(i10)) {
                PointF[] pointFArr = zzdVar.zza;
                pointFArr.getClass();
                int length = pointFArr.length;
                long j6 = ((long) length) + 5 + ((long) (length / 10));
                ArrayList arrayList = new ArrayList(j6 > 2147483647L ? Integer.MAX_VALUE : (int) j6);
                Collections.addAll(arrayList, pointFArr);
                if (matrix != null) {
                    CommonConvertUtils.transformPointList(arrayList, matrix);
                }
                this.zzj.put(i10, new FaceContour(i10, arrayList));
            }
        }
        this.zzf = zzfVar.zzi;
        this.zzg = zzfVar.zzg;
        this.zzh = zzfVar.zzh;
        this.zze = zzfVar.zzm;
        this.zzd = zzfVar.zzk;
        this.zzc = zzfVar.zzl;
    }

    private static boolean zzd(@FaceContour.ContourType int i7) {
        return i7 <= 15 && i7 > 0;
    }

    private static boolean zze(@FaceLandmark.LandmarkType int i7) {
        return i7 == 0 || i7 == 1 || i7 == 7 || i7 == 3 || i7 == 9 || i7 == 4 || i7 == 10 || i7 == 5 || i7 == 11 || i7 == 6;
    }

    @NonNull
    public List<FaceContour> getAllContours() {
        ArrayList arrayList = new ArrayList();
        int size = this.zzj.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add((FaceContour) this.zzj.valueAt(i7));
        }
        return arrayList;
    }

    @NonNull
    public List<FaceLandmark> getAllLandmarks() {
        ArrayList arrayList = new ArrayList();
        int size = this.zzi.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add((FaceLandmark) this.zzi.valueAt(i7));
        }
        return arrayList;
    }

    @NonNull
    public Rect getBoundingBox() {
        return this.zza;
    }

    @Nullable
    public FaceContour getContour(@FaceContour.ContourType int i7) {
        return (FaceContour) this.zzj.get(i7);
    }

    public float getHeadEulerAngleX() {
        return this.zzf;
    }

    public float getHeadEulerAngleY() {
        return this.zzg;
    }

    public float getHeadEulerAngleZ() {
        return this.zzh;
    }

    @Nullable
    public FaceLandmark getLandmark(@FaceLandmark.LandmarkType int i7) {
        return (FaceLandmark) this.zzi.get(i7);
    }

    @Nullable
    public Float getLeftEyeOpenProbability() {
        float f10 = this.zze;
        if (f10 < 0.0f || f10 > 1.0f) {
            return null;
        }
        return Float.valueOf(this.zzd);
    }

    @Nullable
    public Float getRightEyeOpenProbability() {
        float f10 = this.zzc;
        if (f10 < 0.0f || f10 > 1.0f) {
            return null;
        }
        return Float.valueOf(f10);
    }

    @Nullable
    public Float getSmilingProbability() {
        float f10 = this.zze;
        if (f10 < 0.0f || f10 > 1.0f) {
            return null;
        }
        return Float.valueOf(f10);
    }

    @Nullable
    public Integer getTrackingId() {
        int i7 = this.zzb;
        if (i7 == -1) {
            return null;
        }
        return Integer.valueOf(i7);
    }

    @NonNull
    public String toString() {
        zzv zzvVarZza = zzw.zza("Face");
        zzvVarZza.zzc("boundingBox", this.zza);
        zzvVarZza.zzb("trackingId", this.zzb);
        zzvVarZza.zza("rightEyeOpenProbability", this.zzc);
        zzvVarZza.zza("leftEyeOpenProbability", this.zzd);
        zzvVarZza.zza("smileProbability", this.zze);
        zzvVarZza.zza("eulerX", this.zzf);
        zzvVarZza.zza("eulerY", this.zzg);
        zzvVarZza.zza("eulerZ", this.zzh);
        zzv zzvVarZza2 = zzw.zza("Landmarks");
        for (int i7 = 0; i7 <= 11; i7++) {
            if (zze(i7)) {
                zzvVarZza2.zzc(G.m(i7, "landmark_"), getLandmark(i7));
            }
        }
        zzvVarZza.zzc("landmarks", zzvVarZza2.toString());
        zzv zzvVarZza3 = zzw.zza("Contours");
        for (int i10 = 1; i10 <= 15; i10++) {
            zzvVarZza3.zzc(G.m(i10, "Contour_"), getContour(i10));
        }
        zzvVarZza.zzc("contours", zzvVarZza3.toString());
        return zzvVarZza.toString();
    }

    @NonNull
    public final SparseArray zza() {
        return this.zzj;
    }

    public final void zzb(@NonNull SparseArray sparseArray) {
        this.zzj.clear();
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            this.zzj.put(sparseArray.keyAt(i7), (FaceContour) sparseArray.valueAt(i7));
        }
    }

    public final void zzc(int i7) {
        this.zzb = -1;
    }

    public Face(@NonNull zzow zzowVar, @Nullable Matrix matrix) {
        Rect rectZzh = zzowVar.zzh();
        this.zza = rectZzh;
        if (matrix != null) {
            CommonConvertUtils.transformRect(rectZzh, matrix);
        }
        this.zzb = zzowVar.zzg();
        for (zzpc zzpcVar : zzowVar.zzj()) {
            if (zze(zzpcVar.zza())) {
                PointF pointFZzb = zzpcVar.zzb();
                if (matrix != null) {
                    CommonConvertUtils.transformPointF(pointFZzb, matrix);
                }
                this.zzi.put(zzpcVar.zza(), new FaceLandmark(zzpcVar.zza(), pointFZzb));
            }
        }
        for (zzos zzosVar : zzowVar.zzi()) {
            int iZza = zzosVar.zza();
            if (zzd(iZza)) {
                List listZzb = zzosVar.zzb();
                listZzb.getClass();
                ArrayList arrayList = new ArrayList(listZzb);
                if (matrix != null) {
                    CommonConvertUtils.transformPointList(arrayList, matrix);
                }
                this.zzj.put(iZza, new FaceContour(iZza, arrayList));
            }
        }
        this.zzf = zzowVar.zzf();
        this.zzg = zzowVar.zzb();
        this.zzh = -zzowVar.zzd();
        this.zze = zzowVar.zze();
        this.zzd = zzowVar.zza();
        this.zzc = zzowVar.zzc();
    }
}
