package X1;

import com.coremedia.iso.boxes.sampleentry.SampleEntry;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends P4.b implements SampleEntry {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10967v;

    public a(String str) {
        super(str);
        this.f10967v = 1;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public final int getDataReferenceIndex() {
        return this.f10967v;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public final void setDataReferenceIndex(int i7) {
        this.f10967v = i7;
    }
}
