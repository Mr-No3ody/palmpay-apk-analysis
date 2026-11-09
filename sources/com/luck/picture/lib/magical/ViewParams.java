package com.luck.picture.lib.magical;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class ViewParams implements Parcelable {
    public static final Parcelable.Creator<ViewParams> CREATOR = new Parcelable.Creator<ViewParams>() { // from class: com.luck.picture.lib.magical.ViewParams.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ViewParams createFromParcel(Parcel parcel) {
            return new ViewParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ViewParams[] newArray(int i7) {
            return new ViewParams[i7];
        }
    };
    public int height;
    public int left;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    public int f23563top;
    public int width;

    public ViewParams() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLeft() {
        return this.left;
    }

    public int getTop() {
        return this.f23563top;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i7) {
        this.height = i7;
    }

    public void setLeft(int i7) {
        this.left = i7;
    }

    public void setTop(int i7) {
        this.f23563top = i7;
    }

    public void setWidth(int i7) {
        this.width = i7;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.left);
        parcel.writeInt(this.f23563top);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public ViewParams(Parcel parcel) {
        this.left = parcel.readInt();
        this.f23563top = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }
}
