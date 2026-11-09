package com.yalantis.ucrop.model;

/* JADX INFO: loaded from: classes4.dex */
public class ExifInfo {
    private int mExifDegrees;
    private int mExifOrientation;
    private int mExifTranslation;

    public ExifInfo(int i7, int i10, int i11) {
        this.mExifOrientation = i7;
        this.mExifDegrees = i10;
        this.mExifTranslation = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ExifInfo exifInfo = (ExifInfo) obj;
            if (this.mExifOrientation == exifInfo.mExifOrientation && this.mExifDegrees == exifInfo.mExifDegrees && this.mExifTranslation == exifInfo.mExifTranslation) {
                return true;
            }
        }
        return false;
    }

    public int getExifDegrees() {
        return this.mExifDegrees;
    }

    public int getExifOrientation() {
        return this.mExifOrientation;
    }

    public int getExifTranslation() {
        return this.mExifTranslation;
    }

    public int hashCode() {
        return (((this.mExifOrientation * 31) + this.mExifDegrees) * 31) + this.mExifTranslation;
    }

    public void setExifDegrees(int i7) {
        this.mExifDegrees = i7;
    }

    public void setExifOrientation(int i7) {
        this.mExifOrientation = i7;
    }

    public void setExifTranslation(int i7) {
        this.mExifTranslation = i7;
    }
}
