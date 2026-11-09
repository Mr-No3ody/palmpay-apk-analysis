package Y5;

import N8.q0;
import com.nimbusds.jose.shaded.gson.p;
import com.nimbusds.jose.shaded.gson.stream.c;
import com.nimbusds.jose.shaded.gson.z;
import java.io.IOException;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final V5.a f11294c = new V5.a(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final V5.a f11295d = new V5.a(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final V5.a f11296e = new V5.a(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11298b;

    public a(int i7) {
        this.f11297a = i7;
        switch (i7) {
            case 1:
                this.f11298b = new SimpleDateFormat("hh:mm:ss a");
                break;
            default:
                this.f11298b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final Object a(com.nimbusds.jose.shaded.gson.stream.b bVar) throws IOException {
        Date date;
        Time time;
        switch (this.f11297a) {
            case 0:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                String strU = bVar.u();
                try {
                    synchronized (this) {
                        date = ((SimpleDateFormat) this.f11298b).parse(strU);
                        break;
                    }
                    return new java.sql.Date(date.getTime());
                } catch (ParseException e10) {
                    StringBuilder sbQ = q0.q("Failed parsing '", strU, "' as SQL Date; at path ");
                    sbQ.append(bVar.i());
                    throw new p(10, sbQ.toString(), e10);
                }
            case 1:
                if (bVar.w() == 9) {
                    bVar.s();
                    return null;
                }
                String strU2 = bVar.u();
                try {
                    synchronized (this) {
                        try {
                            time = new Time(((SimpleDateFormat) this.f11298b).parse(strU2).getTime());
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return time;
                } catch (ParseException e11) {
                    StringBuilder sbQ2 = q0.q("Failed parsing '", strU2, "' as SQL Time; at path ");
                    sbQ2.append(bVar.i());
                    throw new p(10, sbQ2.toString(), e11);
                }
            default:
                Date date2 = (Date) ((z) this.f11298b).a(bVar);
                if (date2 != null) {
                    return new Timestamp(date2.getTime());
                }
                return null;
        }
    }

    @Override // com.nimbusds.jose.shaded.gson.z
    public final void b(c cVar, Object obj) throws IOException {
        String str;
        String str2;
        switch (this.f11297a) {
            case 0:
                java.sql.Date date = (java.sql.Date) obj;
                if (date == null) {
                    cVar.i();
                    return;
                }
                synchronized (this) {
                    str = ((SimpleDateFormat) this.f11298b).format((Date) date);
                    break;
                }
                cVar.p(str);
                return;
            case 1:
                Time time = (Time) obj;
                if (time == null) {
                    cVar.i();
                    return;
                }
                synchronized (this) {
                    str2 = ((SimpleDateFormat) this.f11298b).format((Date) time);
                    break;
                }
                cVar.p(str2);
                return;
            default:
                ((z) this.f11298b).b(cVar, (Timestamp) obj);
                return;
        }
    }

    public a(z zVar) {
        this.f11297a = 2;
        this.f11298b = zVar;
    }
}
