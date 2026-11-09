package p317v0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f43022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f43023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43024c = true;

    public e(h hVar, i iVar) {
        this.f43022a = hVar;
        this.f43023b = iVar;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f43022a);
        sb2.append(" ");
        sb2.append(!this.f43024c ? "+>" : "->");
        sb2.append(" ");
        sb2.append(this.f43023b);
        return sb2.toString();
    }
}
