package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ArrayAdapterInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20573a;

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final int getArrayLength(Object obj) {
        switch (this.f20573a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final int getElementSizeInBytes() {
        switch (this.f20573a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final String getTag() {
        switch (this.f20573a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final Object newArray(int i7) {
        switch (this.f20573a) {
            case 0:
                return new byte[i7];
            default:
                return new int[i7];
        }
    }
}
