package com.palmpay.lib.scanplus.bean;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.zxing.BarcodeFormat;

/* JADX INFO: loaded from: classes3.dex */
public class CodeBean implements Parcelable {
    public static final Parcelable.Creator<CodeBean> CREATOR = new Parcelable.Creator<CodeBean>() { // from class: com.palmpay.lib.scanplus.bean.CodeBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CodeBean createFromParcel(Parcel parcel) {
            return new CodeBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CodeBean[] newArray(int i7) {
            return new CodeBean[i7];
        }
    };
    public PointF bottomLeft;
    public PointF bottomRight;
    public PointF center;
    private byte[] code;
    private String codeString;
    private RectF rect;
    private BarcodeFormat scanCodeType;
    public PointF topLeft;
    public PointF topRight;

    public CodeBean(RectF rectF, byte[] bArr, String str, String str2, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, PointF pointF5) {
        this.rect = rectF;
        this.code = bArr;
        this.codeString = str;
        this.scanCodeType = BarcodeFormat.valueOf(str2);
        this.topLeft = pointF;
        this.bottomLeft = pointF2;
        this.bottomRight = pointF3;
        this.topRight = pointF4;
        this.center = pointF5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PointF getBottomLeft() {
        return this.bottomLeft;
    }

    public PointF getBottomRight() {
        return this.bottomRight;
    }

    public PointF getCenter() {
        return this.center;
    }

    public byte[] getCode() {
        return this.code;
    }

    public String getCodeString() {
        return this.codeString;
    }

    public RectF getRect() {
        return this.rect;
    }

    public BarcodeFormat getScanCodeType() {
        return this.scanCodeType;
    }

    public PointF getTopLeft() {
        return this.topLeft;
    }

    public PointF getTopRight() {
        return this.topRight;
    }

    public void setBottomLeft(PointF pointF) {
        this.bottomLeft = pointF;
    }

    public void setBottomRight(PointF pointF) {
        this.bottomRight = pointF;
    }

    public void setCenter(PointF pointF) {
        this.center = pointF;
    }

    public void setCode(byte[] bArr) {
        this.code = bArr;
    }

    public void setCodeString(String str) {
        this.codeString = str;
    }

    public void setRect(RectF rectF) {
        this.rect = rectF;
    }

    public void setScanCodeType(BarcodeFormat barcodeFormat) {
        this.scanCodeType = barcodeFormat;
    }

    public void setTopLeft(PointF pointF) {
        this.topLeft = pointF;
    }

    public void setTopRight(PointF pointF) {
        this.topRight = pointF;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.rect, i7);
        parcel.writeByteArray(this.code);
        parcel.writeString(this.codeString);
        BarcodeFormat barcodeFormat = this.scanCodeType;
        parcel.writeString(barcodeFormat == null ? null : barcodeFormat.name());
        parcel.writeParcelable(this.topLeft, i7);
        parcel.writeParcelable(this.bottomLeft, i7);
        parcel.writeParcelable(this.bottomRight, i7);
        parcel.writeParcelable(this.topRight, i7);
        parcel.writeParcelable(this.center, i7);
    }

    public CodeBean(Parcel parcel) {
        this.rect = (RectF) parcel.readParcelable(RectF.class.getClassLoader());
        this.code = parcel.createByteArray();
        this.codeString = parcel.readString();
        String string = parcel.readString();
        if (string != null) {
            this.scanCodeType = BarcodeFormat.valueOf(string);
        }
        this.topLeft = (PointF) parcel.readParcelable(PointF.class.getClassLoader());
        this.bottomLeft = (PointF) parcel.readParcelable(PointF.class.getClassLoader());
        this.bottomRight = (PointF) parcel.readParcelable(PointF.class.getClassLoader());
        this.topRight = (PointF) parcel.readParcelable(PointF.class.getClassLoader());
        this.center = (PointF) parcel.readParcelable(PointF.class.getClassLoader());
    }
}
