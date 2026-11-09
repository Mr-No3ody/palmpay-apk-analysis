package top.zibin.luban.io;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements ArrayAdapterInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42653a;

    @Override // top.zibin.luban.io.ArrayAdapterInterface
    public final int getArrayLength(Object obj) {
        switch (this.f42653a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    @Override // top.zibin.luban.io.ArrayAdapterInterface
    public final int getElementSizeInBytes() {
        switch (this.f42653a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    @Override // top.zibin.luban.io.ArrayAdapterInterface
    public final String getTag() {
        switch (this.f42653a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }

    @Override // top.zibin.luban.io.ArrayAdapterInterface
    public final Object newArray(int i7) {
        switch (this.f42653a) {
            case 0:
                return new byte[i7];
            default:
                return new int[i7];
        }
    }
}
