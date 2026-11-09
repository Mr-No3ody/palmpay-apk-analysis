package t0;

/* JADX INFO: loaded from: classes.dex */
public final class p extends e {
    public final void g(p039cb.c cVar, int i7) {
        float[] fArr = this.f42277a;
        int i10 = i7 + 1;
        long jMo72transformXgqJiTY = cVar.mo72transformXgqJiTY(fArr[i7], fArr[i10]);
        fArr[i7] = Float.intBitsToFloat((int) (jMo72transformXgqJiTY >> 32));
        fArr[i10] = Float.intBitsToFloat((int) (4294967295L & jMo72transformXgqJiTY));
    }
}
